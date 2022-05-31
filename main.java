/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package central.bloackchain;

import java.util.ArrayList;

/**
 *
 * @author Munther
 */
public class CentralBloackchain {

    public static ArrayList<Block> blockchain
            = new ArrayList<Block>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        blockchain.add(new Block(
                "First block", "0"));
        blockchain.add(new Block(
                "Second block",
                blockchain
                        .get(blockchain.size() - 1).hash));

        blockchain.add(new Block(
                "Third block",
                blockchain
                        .get(blockchain.size() - 1).hash));

        blockchain.add(new Block(
                "Fourth block",
                blockchain
                        .get(blockchain.size() - 1).hash));

        blockchain.add(new Block(
                "Fifth block",
                blockchain
                        .get(blockchain.size() - 1).hash));
    }

}
