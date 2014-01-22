package com.formation.adapter;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MonActivite extends Activity {
    
	ListView lvListe;
	List<Livre> maBibliotheque = new ArrayList<Livre>();
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        lvListe = (ListView)findViewById(R.id.lvListe);
        
        RemplirLaBibliotheque();
       
        LivreAdapter adapter = new LivreAdapter(this, maBibliotheque);
        
        lvListe.setAdapter(adapter);
        
        adapter.notifyDataSetChanged();
    }
    
    private void RemplirLaBibliotheque() {
    	maBibliotheque.clear();
    	maBibliotheque.add(new Livre("The Holy Bible", "Anonymous"));
    	maBibliotheque.add(new Livre("Quotations from Charman Mao Tse-Tung", "Mao Tse-Tung"));
    	maBibliotheque.add(new Livre("Harry Potter", "J.K. Rowling"));
    	maBibliotheque.add(new Livre("The Lord of the Ring", "J.R.R. Tolkien"));
    	maBibliotheque.add(new Livre("The Alchemist", "Paulo Coelho"));
    	maBibliotheque.add(new Livre("The Da Vinci Code", "Dan Brown"));
    }
}