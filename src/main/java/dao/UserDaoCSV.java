/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Pessoa;

/**
 *
 * @author santa
 */
public class UserDaoCSV {
    public List<Pessoa> getPeoples()
    {
        List<Pessoa> pessoas = new ArrayList<>();
        
        try {
            FileReader fr = new FileReader("pessoas.csv");
            BufferedReader bf = new BufferedReader(fr);
            String linha = bf.readLine();
            System.out.println(bf.readLine());
            while(linha != null)
            {
                String[] vect = linha.split(",");
                String genero = vect[0];
                String nome = vect[1];
                String estadoCivil = vect[2];
                Pessoa pessoa = new Pessoa(nome, genero, estadoCivil);
                
                pessoas.add(pessoa);
                
                System.out.println(bf.readLine());
                linha = bf.readLine();
            }
        } catch (IOException e){
            System.out.println("Error: " + e);
        }
        
        return pessoas;
    }
}
