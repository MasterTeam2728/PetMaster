package com.MasterTeam.Sprint2MasterTeam.controladores;

import com.MasterTeam.Sprint2MasterTeam.entidades.Empleado;
import com.MasterTeam.Sprint2MasterTeam.entidades.Empresa;
import com.MasterTeam.Sprint2MasterTeam.entidades.Usuario;
import com.MasterTeam.Sprint2MasterTeam.servicios.EmpleadoServicios;
import com.MasterTeam.Sprint2MasterTeam.servicios.EmpresaServicios;
import com.MasterTeam.Sprint2MasterTeam.servicios.UsuarioServicios;
import org.ietf.jgss.Oid;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class FrontController {

    EmpleadoServicios serviciosUsu;
    UsuarioServicios serviceUs;
    EmpresaServicios serviciosEmpre;

    public FrontController(EmpleadoServicios serviciosUsu, UsuarioServicios serviceUs, EmpresaServicios serviciosEmpre) {
        this.serviciosUsu = serviciosUsu;
        this.serviceUs = serviceUs;
        this.serviciosEmpre = serviciosEmpre;
    }

//crea elementos de tipo String para visualizar las etiquetas HTML creadas

    @GetMapping("/") //ruta raíz
    public String index(Model model, @AuthenticationPrincipal OidcUser principal){
        if (principal != null) {
            Usuario usuario = this.serviceUs.getOrCreateUsuario(principal.getClaims());
            model.addAttribute("usuario", usuario);
        }
        return "index";
    }

    @GetMapping("/users")
    public String empleados(Model modelP){
        List<Empleado> empleados = this.serviciosUsu.getlistaEmplea();
        modelP.addAttribute("empleados", empleados);
        return "empleados";
    }

    @GetMapping("/user/new")
    public String nuevoEmpleado(Model model){
        model.addAttribute("empleado", new Empleado());
        return "nuevo-empleado";
    }

    @GetMapping("/user/{id}")
    public String actualizarEmpleado(@PathVariable Long id, Model model){
        Empleado empleadoFind = this.serviciosUsu.getLlamarEmpleado(id);
        model.addAttribute("empleadoFind", empleadoFind);
        return "actualizar-empleado";
    }

    @GetMapping("/interface")
    public String interfaces(){
        return "interface";
    }

    @GetMapping("/enterprises")
    public String empresas(Model model){
        List<Empresa> empresas = this.serviciosEmpre.getlistaEmpresas();
        model.addAttribute("empresas", empresas);
        return "empresas";

    }

    @GetMapping("/enterprises/{id}")
    public String actualizarEmpresas(@PathVariable Long id, Model model){
        Empresa empresaFind = this.serviciosEmpre.getLlamarEmpresas(id);
        model.addAttribute("empresaFind", empresaFind);
        return "actualizar-empresa";
    }

    @GetMapping("/enterpises/new")
    public String nuevoEmpresa(Model model){
        model.addAttribute("empresa", new Empresa());
        return "nuevo-empresa";
    }



}
