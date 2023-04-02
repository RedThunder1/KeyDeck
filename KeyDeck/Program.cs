using System;
using System.Windows.Forms;

namespace KeyDeck
{
    internal static class Program
    {
        /// Runs on initialization
        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new Home());

            //Initialization functions
            SerialCommunication.Initalize();
            ProgramProperties.Initalize();

            //Initialize events
            AppDomain.CurrentDomain.ProcessExit += new EventHandler(OnProcessExit);

        }

        static void OnProcessExit(object sender, EventArgs e)
        {
            //Run application exit functions
            
        }

    }
}
