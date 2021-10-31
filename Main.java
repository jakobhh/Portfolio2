public class Main {

    public static void main(String[] args) {
      // AdjececyGraph set up with city names & numbers.
        AdjacencyGraph MyGraph=new AdjacencyGraph();

        Vertex a = new Vertex("0.Eskildstrup");
        Vertex b = new Vertex("1.Haslev");
        Vertex c = new Vertex("2.Holbæk");
        Vertex d = new Vertex("3.Jægerspris");
        Vertex e = new Vertex("4.Kalundborg");
        Vertex f = new Vertex("5.Korsør");
        Vertex g = new Vertex("6.Køge");
        Vertex h = new Vertex("7.Maribo");
        Vertex i = new Vertex("8.Nakskov");
        Vertex j = new Vertex("9.Nykøbing F");
        Vertex k = new Vertex("10.Næstved");
        Vertex l = new Vertex("11.Ringsted");
        Vertex m = new Vertex("12.Roskilde");
        Vertex n = new Vertex("13.Slagelse");
        Vertex o = new Vertex("14.Sorø");
        Vertex p = new Vertex("15.Vordingborg");

        MyGraph.addVertex(a);
        MyGraph.addVertex(b);
        MyGraph.addVertex(c);
        MyGraph.addVertex(d);
        MyGraph.addVertex(e);
        MyGraph.addVertex(f);
        MyGraph.addVertex(g);
        MyGraph.addVertex(h);
        MyGraph.addVertex(i);
        MyGraph.addVertex(j);
        MyGraph.addVertex(k);
        MyGraph.addVertex(l);
        MyGraph.addVertex(m);
        MyGraph.addVertex(n);
        MyGraph.addVertex(o);
        MyGraph.addVertex(p);

        MyGraph.addEdge(a, h, 28);
        MyGraph.addEdge(a, j, 13);
        MyGraph.addEdge(a, p, 25);

        MyGraph.addEdge(b, f, 60);
        MyGraph.addEdge(b, g, 24);
        MyGraph.addEdge(b, k, 25);
        MyGraph.addEdge(b, l, 19);
        MyGraph.addEdge(b, m, 47);
        MyGraph.addEdge(b, n, 48);
        MyGraph.addEdge(b, o, 34);
        MyGraph.addEdge(b, p, 40);

        MyGraph.addEdge(c, d, 34);
        MyGraph.addEdge(c, e, 44);
        MyGraph.addEdge(c, f, 66);
        MyGraph.addEdge(c, l, 36);
        MyGraph.addEdge(c, m, 32);
        MyGraph.addEdge(c, n, 46);
        MyGraph.addEdge(c, o, 34);

        MyGraph.addEdge(d, f, 95);
        MyGraph.addEdge(d, g, 58);
        MyGraph.addEdge(d, l, 56);
        MyGraph.addEdge(d, m, 33);
        MyGraph.addEdge(d, n, 74);
        MyGraph.addEdge(d, o, 63);

        MyGraph.addEdge(e, l, 62);
        MyGraph.addEdge(e, m, 70);
        MyGraph.addEdge(e, n, 39);
        MyGraph.addEdge(e, o, 51);

        MyGraph.addEdge(f, k, 45);
        MyGraph.addEdge(f, n, 20);

        MyGraph.addEdge(g, k, 45);
        MyGraph.addEdge(g, l, 28);
        MyGraph.addEdge(g, m, 25);
        MyGraph.addEdge(g, p, 60);

        MyGraph.addEdge(h, i, 27);
        MyGraph.addEdge(h, j, 26);

        MyGraph.addEdge(k, m, 57);
        MyGraph.addEdge(k, l, 26);
        MyGraph.addEdge(k, n, 37);
        MyGraph.addEdge(k, o, 32);
        MyGraph.addEdge(k, p, 28);

        MyGraph.addEdge(l, m, 31);
        MyGraph.addEdge(l, o, 15);
        MyGraph.addEdge(l, p, 58);
        
        MyGraph.addEdge(n, o, 14);

            MyGraph.PrintGraph();
            //Matrix Graph inputs (with reverse routes)
    MatrixGraph thisGraph= new MatrixGraph(16);

         thisGraph.addEdge(0, 7, 28);
         thisGraph.addEdge(0, 9, 13);
         thisGraph.addEdge(0, 15, 25);

         thisGraph.addEdge(1, 5, 60);
         thisGraph.addEdge(1, 6, 24);
         thisGraph.addEdge(1, 10, 25);
         thisGraph.addEdge(1, 11, 19);
         thisGraph.addEdge(1, 12, 47);
         thisGraph.addEdge(1, 13, 48);
         thisGraph.addEdge(1, 14, 34);
         thisGraph.addEdge(1, 15, 40);

         thisGraph.addEdge(2, 3, 34);
         thisGraph.addEdge(2, 4, 44);
         thisGraph.addEdge(2, 5, 66);
         thisGraph.addEdge(2, 11, 36);
         thisGraph.addEdge(2, 12, 32);
         thisGraph.addEdge(2, 13, 46);
         thisGraph.addEdge(2, 14, 34);

         thisGraph.addEdge(3, 5, 95);
         thisGraph.addEdge(3, 6, 58);
         thisGraph.addEdge(3, 11, 56);
         thisGraph.addEdge(3, 12, 33);
         thisGraph.addEdge(3, 13, 74);
         thisGraph.addEdge(3, 14, 63);
         thisGraph.addEdge(3, 2, 34);

         thisGraph.addEdge(4, 11, 62);
         thisGraph.addEdge(4, 12, 70);
         thisGraph.addEdge(4, 13, 39);
         thisGraph.addEdge(4, 14, 51);
         thisGraph.addEdge(4, 2, 44);

         thisGraph.addEdge(5, 10, 45);
         thisGraph.addEdge(5, 13, 20);
         thisGraph.addEdge(5, 1, 60);
         thisGraph.addEdge(5, 2, 66);
         thisGraph.addEdge(5, 3, 95);

         thisGraph.addEdge(6, 10, 45);
         thisGraph.addEdge(6, 11, 28);
         thisGraph.addEdge(6, 12, 25);
         thisGraph.addEdge(6, 15, 60);
         thisGraph.addEdge(6, 1, 24);
         thisGraph.addEdge(6, 3, 58);

         thisGraph.addEdge(7, 8, 27);
         thisGraph.addEdge(7, 9, 26);
         thisGraph.addEdge(7, 0, 28);

         thisGraph.addEdge(8, 7, 27);

         thisGraph.addEdge(9, 0, 13);
         thisGraph.addEdge(9, 7, 26);
                 
         thisGraph.addEdge(10, 11, 26);
         thisGraph.addEdge(10, 12, 57);
         thisGraph.addEdge(10, 13, 37);
         thisGraph.addEdge(10, 14, 32);
         thisGraph.addEdge(10, 15, 28);
         thisGraph.addEdge(10, 1, 25);
         thisGraph.addEdge(10, 5, 45);
         thisGraph.addEdge(10, 6, 45);

         thisGraph.addEdge(11, 12, 31);
         thisGraph.addEdge(11, 14, 15);
         thisGraph.addEdge(11, 15, 58);
         thisGraph.addEdge(11, 1, 19);
         thisGraph.addEdge(11, 2, 36);
         thisGraph.addEdge(11, 3, 56);
         thisGraph.addEdge(11, 4, 62);
         thisGraph.addEdge(11, 6, 28);
         thisGraph.addEdge(11, 10, 26);

         thisGraph.addEdge(12, 1, 47);
         thisGraph.addEdge(12, 2, 32);
         thisGraph.addEdge(12, 3, 33);
         thisGraph.addEdge(12, 4, 70);
         thisGraph.addEdge(12, 6, 25);
         thisGraph.addEdge(12, 10, 57);
         thisGraph.addEdge(12, 11, 31);
         
         thisGraph.addEdge(13, 14, 14);
         thisGraph.addEdge(13, 1, 48);
         thisGraph.addEdge(13, 2, 46);
         thisGraph.addEdge(13, 3, 74);
         thisGraph.addEdge(13, 4, 39);
         thisGraph.addEdge(13, 5, 20);
         thisGraph.addEdge(13, 10, 37);

         thisGraph.addEdge(14, 1, 34);
         thisGraph.addEdge(14, 2, 34);
         thisGraph.addEdge(14, 3, 63);
         thisGraph.addEdge(14, 4, 51);
         thisGraph.addEdge(14, 10, 32);
         thisGraph.addEdge(14, 11, 15);
         thisGraph.addEdge(14, 13, 14);

         thisGraph.addEdge(15, 0, 25);
         thisGraph.addEdge(15, 1, 40);
         thisGraph.addEdge(15, 6, 60);
         thisGraph.addEdge(15, 10, 28);
         thisGraph.addEdge(15, 11, 58);

        //thisGraph.printGraph();
        thisGraph.MSTPrims();
    }
    
}
