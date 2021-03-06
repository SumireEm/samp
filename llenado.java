import com.itextpdf.text.DocumentException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Clau
 */
@WebServlet(urlPatterns = {"/llenado"})
public class llenado extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, DocumentException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String regimen = "5434555654";
            try{
        String doc = getServletConfig().getServletContext().getRealPath ("/");
        FileOutputStream fos = new FileOutputStream(doc+"modificaciones.pdf");
        PdfReader reader = new PdfReader(doc+"vaciomodificaciones.pdf");
        PdfStamper stamper = new PdfStamper(reader, fos);
        AcroFields form = stamper.getAcroFields();
    
        form.setField("text_"+"Quetzalli",regimen);
        form.setField("text_"+"Datos","124802M4~!4°M464N4617201500317");
        Date now = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        form.setField("text_"+"Meow235",df.format(now));
        stamper.close();
        reader.close();
        fos.close();
        // ruta = "http://localhost:8080/SAMP/hue.jsp";
        }
        catch (DocumentException e){
            
        }
        }
    }
