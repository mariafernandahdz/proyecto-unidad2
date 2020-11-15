package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.Clientes;
import com.example.demo.models.Computadoras;
import com.example.demo.models.Proveedores;
import com.example.demo.models.Tickets;
import com.example.demo.models.Venta;

@Controller
@RequestMapping("/examenUnidad2")
public class HomeController
{
	@GetMapping("/Index")
	public String index()
	{
		return "index";
	}
	
	@GetMapping("/Clientes")
	public String clientes(Model modelo)
	{
		ArrayList<Clientes> clientes = new ArrayList<Clientes>();
		clientes.add(new Clientes("1","Gustavo","López Diaz", "5585453210", "gustld@gmail.com", "Ecatepec, Edo. Mex."));
		clientes.add(new Clientes("2","Andrés","Campos Guzmán", "5514630123", "andy@outlook.com", "Gustavo A. Madero"));
		clientes.add(new Clientes("3","Jessica","Miramontes Baez", "57751425", "miramontesb@gmail.com", "Tijuana, BC"));
		clientes.add(new Clientes("4","Marina","Campos Alvares", "5525157929", "maria12@outlook.com", "Naucalpan, Edo. Mex."));
		clientes.add(new Clientes("5","Adolfo","Diaz López", "5585140325", "diazlopez@gmail.com", "Tecamac, Edo. Mex."));
		clientes.add(new Clientes("6","Ana","Piña Morales", "57751461", "anapiña@gmail.com", "Pino suarez, CDMX"));
		clientes.add(new Clientes("7","Sonia","Luz Fernández", "57758496", "luzsonia@live.com", "Ecatepec, Edo. Mex."));
		clientes.add(new Clientes("8","Monica","Pichardo Ladrón", "5545857965", "monicapichardo@outlook.com", "Acolman, Edo. Mex."));
		clientes.add(new Clientes("9","Alejandro","Araiza Chavez", "5525459630", "alex@gmail.com", "San Francisco, EUA"));
		clientes.add(new Clientes("10","Carlos","Sandoval Arenas", "57756985", "sandoval@gmail.com", "Jardines de Morelos, Edo. Mex."));
		modelo.addAttribute("clientes",clientes);
		modelo.addAttribute("titulo", "CLIENTES");
		return "clientes";
	}
	
	@GetMapping("/Computadoras")
	public String computadoras(Model modelo)
	{
		ArrayList<Computadoras> computadoras = new ArrayList<Computadoras>();
		computadoras.add(new Computadoras("80YS001MLM","Laptop Lenovo Chromebook","AMD A4", "Windows 10 Home 64", "4GB", "2 núcleos"));
		computadoras.add(new Computadoras("6QW07LA","HP Notebook","Intel Celeron", "Windows 10 Home 64", "4GB", "2 núcleos"));
		computadoras.add(new Computadoras("1JN40EA","HP Stream","Intel Celeron N4000", "Windows 10 Home 64", "4GB", "2 núcleos"));
		computadoras.add(new Computadoras("81N800H0US","Laptop Lenovo Ideapad","AMD A6", "Windows 10", "8GB", "2 núcleos"));
		computadoras.add(new Computadoras("81X20005US","Laptop Lenovo IdeaPad Flex 2","AMD Ryzen 5", "Windows 10", "16GB", "4 núcleos"));
		computadoras.add(new Computadoras("81B000CCLM","Laptop Lenovo V330-14IKB","Intel Core i7 Gen 8th", "Windows 10 Pro", "8GB", "4 núcleos"));
		computadoras.add(new Computadoras("81VW003LLM","Laptop Lenovo IdeaPad S340-15IIL","Intel Core i5", "Windows 10 Home", "4GB", "2 núcleos"));
		computadoras.add(new Computadoras("14-DH0030","Laptop 2 en 1 HP 14-DH0030","Intel Core Ci3 Gen 8th", "Windows 10", "8GB", "4 núcleos"));
		computadoras.add(new Computadoras("A515-55-541A","Laptop Acer","Intel Core i5", "Windows 10", "12GB", "4 núcleos"));
		computadoras.add(new Computadoras("B07004E/V6F-00003","Laptop Microsoft Surface Book 3","Core i7", "Windows 10", "32GB", "5 núcleos"));
		modelo.addAttribute("computadoras",computadoras);
		modelo.addAttribute("titulo", "COMPUTADORAS");
		return "computadoras";
	}
	
	@GetMapping("/Proveedores")
	public String proveedores(Model modelo)
	{
		ArrayList<Proveedores> proveedores = new ArrayList<Proveedores>();
		proveedores.add(new Proveedores("1", "Lenovo", "Alejandro Ramos Martinez", "alejandroramos@lenovo.mx", "RAMA8205281S5", "5525157896", "Zaragoza"));
		proveedores.add(new Proveedores("2", "HP", "Roberta González Hernández", "robertagon@hpcompany.mx", "GOHR8502107M0", "5459612360", "Polanco"));
		proveedores.add(new Proveedores("3", "ACER", "Mariana Eche López", "echelopez@acer.com.mx", "ECLM9512076A0", "5525459630", "Ecatepec"));
		proveedores.add(new Proveedores("4", "APPLE", "Diego Ñañez Valencia", "nanezvalen@apple.mx", "ÑAVD8510058D4", "5585143201", "Reforma"));
		proveedores.add(new Proveedores("5", "ALIENWARE", "Miguel Baez Adán", "migueladan@alienw.mx", "BAAM8705043W0", "5541013252", "Naucalpan"));
		proveedores.add(new Proveedores("6", "TOSHIBA", "Sandy Hernández Hernández", "hdzhdzsandy@toshiba.mx", "HEHS8210056G6", "5585120301", "Santa Fe"));
		proveedores.add(new Proveedores("7", "DELL", "Guadalupe Ramos Rodríguez", "grr@dell.mx", "RARG8010164F0", "5585457995", "Polanco"));
		proveedores.add(new Proveedores("8", "ASUS", "Gabriela Cuellar Alcala", "gabrielacuellaralcala@asus.mx", "CUAG9602039C5", "57748831", "Reforma"));
		proveedores.add(new Proveedores("9", "SAMSUNG", "Paola Santos Montes", "paolaproveedor@samsung.mx", "SAMP9601164L8", "5510140345", "Gustavo A. Madero"));
		proveedores.add(new Proveedores("10", "SONY", "Katherine Aleman Hernan", "kath@sony.mx", "ALHK9602160B8", "5525157929", "Polanco"));
		modelo.addAttribute("proveedores",proveedores);
		modelo.addAttribute("titulo", "PROVEEDORES");
		return "proveedores";
	}
	
	@GetMapping("/Tickets")
	public String tickets(Model modelo)
	{
		ArrayList<Tickets> tickets = new ArrayList<Tickets>();
		tickets.add(new Tickets("01", "01", "B07004E/V6F-00003", "1", "$9,250.00"));
		tickets.add(new Tickets("02", "02", "81VW003LLM", "2", "$10,350.00"));
		tickets.add(new Tickets("03", "03", "80YS001MLM", "1", "$9,997.00"));
		tickets.add(new Tickets("04", "04", "14-DH0030", "5", "$15,550.00"));
		tickets.add(new Tickets("05", "05", "1JN40EA", "8", "$11,150.00"));
		tickets.add(new Tickets("06", "06", "81VW003LLM", "3", "$10,350.00"));
		tickets.add(new Tickets("07", "07", "6QW07LA", "6", "$7,643.00"));
		tickets.add(new Tickets("08", "08", "81X20005US", "1", "$29,300.50"));
		tickets.add(new Tickets("09", "09", "1JN40EA", "5", "$11,150.00"));
		tickets.add(new Tickets("10", "10", "14-DH0030", "15", "$15,550.00"));
		modelo.addAttribute("tickets",tickets);
		modelo.addAttribute("titulo", "TICKETS");
		return "tickets";
	}
	
	@GetMapping("/Venta")
	public String venta(Model modelo)
	{
		ArrayList<Venta> venta = new ArrayList<Venta>();
		venta.add(new Venta("01", "8", "10/11/2020", "$9,250.00", "16%", "$250.00", "$10,980.00"));
		venta.add(new Venta("02", "5", "5/11/2020", "$10,350.00", "16%", "$250.00", "$24,512.00"));
		venta.add(new Venta("03", "1", "8/11/2020", "$9,997.00", "16%", "$250.00", "$11,846.52"));
		venta.add(new Venta("04", "7", "8/11/2020", "$15,550.00", "16%", "$250.00", "$91,440.00"));
		venta.add(new Venta("05", "4", "11/11/2020", "$11,150.00", "16%", "$250.00", "$105,472.00"));
		venta.add(new Venta("06", "3", "28/10/2020", "$10,350.00", "16%", "$250.00", "$36,768.00"));
		venta.add(new Venta("07", "9", "2/10/2020", "$7,643.00", "16%", "$250.00", "$54,695.28"));
		venta.add(new Venta("08", "2", "25/09/2020", "$29,300.50", "16%", "$250.00", "$34,238.58"));
		venta.add(new Venta("09", "1", "24/09/2020", "$11,150.00", "16%", "$250.00", "$65,920.00"));
		venta.add(new Venta("10", "10", "29/02/2020", "$15,550.00", "16%", "$250.00", "$274,320.00"));
		modelo.addAttribute("venta",venta);
		modelo.addAttribute("titulo", "VENTAS");
		return "venta";
	}
}
