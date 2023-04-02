using System;
using System.Windows.Forms;

namespace KeyDeck
{
    public partial class Home : Form
    {
        public Home()
        {
            InitializeComponent();
        }

        private void bindButton1_Click(object sender, EventArgs e)
        {
            
        }
        private void bindButton2_Click(object sender, EventArgs e)
        {
            
        }
        private void bindButton3_Click(object sender, EventArgs e)
        {
            
        }
        private void bindButton4_Click(object sender, EventArgs e)
        {
            
        }
        private void bindButton5_Click(object sender, EventArgs e)
        {
            
        }
        private void bindButton6_Click(object sender, EventArgs e)
        {
            
        }
        private void bindButton7_Click(object sender, EventArgs e)
        {
            
        }
        private void bindButton8_Click(object sender, EventArgs e)
        {
            
        }
        private void bindButton9_Click(object sender, EventArgs e)
        {
            
        }
        private void modeButton_Click(object sender, EventArgs e)
        {
            
        }
        private void homeButton_Click(object sender, EventArgs e)
        {
            
        }
        private void bindButton_Click(object sender, EventArgs e)
        {
            var bind = new Bind();
            bind.Show();
            this.Hide();
        }
        private void settingsButton_Click(object sender, EventArgs e)
        {
            this.Hide();
            var settings = new Settings();
            settings.Show();
            settings.BringToFront();
        }
        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void panel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void tableLayoutPanel1_Paint(object sender, PaintEventArgs e)
        {

        }
    }
}
