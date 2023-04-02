using System;
using System.Windows.Forms;

namespace KeyDeck
{
    internal static class Program
    {
        /// Runs on initalization
        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new Home());

            //Initalization functions
            SerialCommunication.Initalize();
            ProgramProperties.Initalize();

            //Initalize events
            AppDomain.CurrentDomain.ProcessExit += new EventHandler(OnProcessExit);

        }

        static void OnProcessExit(object sender, EventArgs e)
        {
            //Run functions on application exit
        }

    }
}
