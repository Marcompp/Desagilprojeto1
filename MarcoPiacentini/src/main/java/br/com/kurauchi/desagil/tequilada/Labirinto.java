package br.com.kurauchi.desagil.tequilada;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Labirinto {
	  public static void main(String[] args) throws FileNotFoundException, IOException {
		  
		  try (
				     BufferedReader reader = new BufferedReader (new FileReader("/MarcoPiacentini/src/main/java/br/com/kurauchi/desagil/tequilada/Labirinto.dat"));
				) {
			String firstline = reader.readLine();
			
			String[] dimensions= firstline.split(" ");
			int x = Integer.parseInt(dimensions[0]);
			int y = Integer.parseInt(dimensions[1]);
			int j = 0;
			char[][] isWall = new char[x][y];
			for (String line = reader.readLine(); line != null; line = reader.readLine()) {
				for (int i = 0; i < line.length(); i++) {
					if (line.charAt(i) == '#') {
						isWall[j][i] = 'X';
					}
					else {
						isWall[j][i] = ' ';
						}
				j++;
				}
			}
			for (char[] cs : isWall) {
				String row = "";
				for (char c : cs) {
					row += c;
				}
				System.out.println(row);
			}
		  }
	  }
}
