import "./globals.css";
import "bootstrap/dist/css/bootstrap.min.css";
export const metadata = {
  title: "AWANG",
  description: "Generated by create next app",
};

export default function RootLayout({ children }) {
  return (
    <html lang="en">
      <body>
        {children}
      </body>
    </html>
  );
}
