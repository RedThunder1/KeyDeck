using Newtonsoft.Json;
using System;
using System.IO;


namespace KeyDeck
{
    internal class ProgramProperties
    {

        //All the bind properties
        public static String bind1 { get; set; }
        public static String bind2 { get; set; }
        public static String bind3 { get; set; }
        public static String bind4 { get; set; }
        public static String bind5 { get; set; }
        public static String bind6 { get; set; }
        public static String bind7 { get; set; }
        public static String bind8 { get; set; }
        public static String bind9 { get; set; }
        static String[] binds = {bind1, bind2, bind3, bind4, bind5, bind6, bind7, bind8, bind9};

        public static void Initalize()
        {

            

        }

        public static void saveProperties()
        {
            //Save binds to a JSON file
            foreach (String bind in binds)
            {
                string json = JsonConvert.SerializeObject(bind, Newtonsoft.Json.Formatting.Indented);
                File.WriteAllText(@"c:\user.json", json);
            }
        }
    }
}
