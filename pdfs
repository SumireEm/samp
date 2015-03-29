package pdfs;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.html.WebColors;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfFormField;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPCellEvent;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.TextField;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
public class Pdfs implements PdfPCellEvent {
    private static final String RESULT1 = "F:/Escuela/vfhgf/vacio.pdf";
    final BaseColor vimss = WebColors.getRGBColor("#228B22");
    final BaseColor form = WebColors.getRGBColor("#87CEEB");
    Date now = new Date();
    DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
    protected int tf;
    Font boldfont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
    int i = 1;
    public Pdfs(int tf) {
        this.tf = tf;
    }
    public void createPdf(String filename) throws DocumentException, IOException {
        Image im = Image.getInstance("F:/Escuela/vfhgf/pdfs/imss.jpg");
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(filename));
        document.open();
        PdfPCell cell;
        PdfPTable table = new PdfPTable(2);
        table.setTotalWidth(550);
        table.setLockedWidth(true);
        table.addCell(im);
        cell = new PdfPCell(new Phrase("Instituto Mexicano Del Seguro Social"
                + "\nDelegacion Michoacan"
                + "\nJefatura de Prestaciones Economicas y Sociales", boldfont));
        cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
        cell.setColspan(5);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Documento de Eleccion de Regimen (DER)"
                + "\nInvalidez y Vida",boldfont));
        cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
        cell.setColspan(2);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Estimado Derechohabiente:\n" +
"De acuerdo con sus datos afiliatorios, usted tiene derecho a elegir entre los regímenes pensionarios de Ley 73 (pensión pagada por el IMSS) y\n" +
"Ley 97 (pensión pagada por una\n" +
"En ambos casos, el monto de su pensión se actualizará en el mes de febrero, en la misma proporción que la inflación presentada en el año\n" +
"inmediato anterior.\n" +
"Este documento le presenta las diferentes opciones de pensión a que tiene derecho, de las cuales deberá elegir sólo una. Antes de tomar su\n" +
"decisión se sugiere leer detenidamente y asegurarse de comprender cada una de las alternativas.\n" +
"Entregue este documento firmado, indicando la opción elegida, en la oficina del IMSS donde le fue entregado, en días hábiles, en horario de\n" +
"8:00 a 15:00 horas. Fecha límite de recepción: 19/03/2015"));
        cell.setColspan(2);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Datos personales del asegurado",boldfont));
        cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
        cell.setBackgroundColor(vimss);
        cell.setColspan(2);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Nombre completo del Afiliado"));
        cell.setColspan(2);
        table.addCell(cell);
        cell = new PdfPCell();
        cell.setColspan(2);
        cell.setCellEvent(new Pdfs(i));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("No. Folio"));
        table.addCell(cell);
        cell = new PdfPCell();
        cell.setCellEvent(new Pdfs(++i));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Nombre del solicitante"));
        cell.setColspan(2);
        table.addCell(cell);
        cell = new PdfPCell();
        cell.setColspan(2);
        cell.setCellEvent(new Pdfs(++i));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("C.U.R.P."));
        table.addCell(cell);
        cell = new PdfPCell();
        cell.setCellEvent(new Pdfs(++i));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Numero de Seguridad Social"));
        cell.setColspan(2);
        table.addCell(cell);
        cell = new PdfPCell();
        cell.setColspan(2);
        cell.setCellEvent(new Pdfs(++i));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Pension"));
        table.addCell(cell);
        cell = new PdfPCell();
        cell.setCellEvent(new Pdfs(++i));
        table.addCell(cell);
        
         cell = new PdfPCell(new Phrase("Pensión",boldfont));
        cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
        cell.setBackgroundColor(vimss);
        cell.setColspan(2);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Institucion que paga la pension"));
        cell.setColspan(2);
        table.addCell(cell);
        cell = new PdfPCell();
        cell.setColspan(2);
        cell.setCellEvent(new Pdfs(i));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Pension mensual total**"));
        table.addCell(cell);
        cell = new PdfPCell();
        cell.setCellEvent(new Pdfs(++i));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Aguinaldo anual"));
        table.addCell(cell);
        cell = new PdfPCell();
        cell.setCellEvent(new Pdfs(++i));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Importe a retirar de la AFORE*"));
        table.addCell(cell);
        cell = new PdfPCell();
        cell.setCellEvent(new Pdfs(++i));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Aseguradora/AFORE"));
        table.addCell(cell);
        cell = new PdfPCell();
        cell.setCellEvent(new Pdfs(++i));
        table.addCell(cell);
        
        
        
        
        cell = new PdfPCell(new Phrase("* Las cantidades reportadas pueden variar por tratarse de saldos preliminares incluye las subcuentas de SAR 92 y Vivienda 92. En caso de régimen por\n" +
"Ley 73 incluye además las subcuentas de Retiro y Vivienda 97.\n" +
"** Los cálculos se presentan a la fecha de generación de este documento, habiéndose considerado los incrementos del Índice Nacional de Precios al\n" +
"Consumidor (INPC), en caso de ser procedente.\n" +
"***En caso de elegir Régimen 97, podrá tener un beneficio adicional único de hasta $9000, si eligiera la Aseguradora que fuera la mejor opción."));
        cell.setColspan(2);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Favor de llenar los siguientes datos de puño y letra, ratificando su eleccion:" ,boldfont));
        cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
        cell.setBackgroundColor(vimss);
        cell.setColspan(2);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Para los efectos legales a que haya lugar, manifiesto mi plena aceptación con mi elección, cuya oferta obra en el presente documento." ,boldfont));
        cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
        cell.setColspan(2);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Lugar"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(""));
        cell.setColspan(2);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Fecha"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(""));
        cell.setColspan(2);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Nombre"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(""));
        cell.setColspan(2);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Firma"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(""));
        cell.setColspan(2);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Regimen elegido"));
        cell.setColspan(2);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(""));
        cell.setColspan(2);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(""));
        cell.setBackgroundColor(BaseColor.DARK_GRAY);
        cell.setColspan(2);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Este espacio sera llenado por el personal del IMSS"
                + "\n\n\n\n\n\n\n\n"
                + "________________________"
                + "\nLugar y firma del jefe de pensiones."));
        cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
        cell.setColspan(2);
        cell.setRowspan(3);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(
                "\n\n\n\n\n\n\n\n\n"
                + "________________________"
                + "\nSello sel servicio"));
        cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
        cell.setColspan(2);
        cell.setRowspan(3);
        table.addCell(cell);
        cell = new PdfPCell();
        cell = new PdfPCell(new Phrase(" "));
        cell.setColspan(2);
        cell.setCellEvent(new Pdfs(++i));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(" "));
        cell.setColspan(2);
        cell.setCellEvent(new Pdfs(++i));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(
                "\n\n\n\n\n\n"
                + "________________________"
                + "\nFecha"));
        cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
        cell.setColspan(2);
        table.addCell(cell);
        document.add(table);
        document.close();
    }
    @Override
    public void cellLayout(PdfPCell cell, Rectangle rectangle, PdfContentByte[] canvases) {
        PdfWriter writer = canvases[0].getPdfWriter();
        TextField text = new TextField(writer, rectangle,String.format("text_%s", tf));
        text.setAlignment(Element.ALIGN_LEFT);
        try {PdfFormField field = text.getTextField();
            writer.addAnnotation(field);}
        catch(IOException | DocumentException e) {System.out.println(e.getMessage());}
    }
    public void abrirarchivo(String archivo){
    try{
        File objetofile = new File (archivo);
        Desktop.getDesktop().open(objetofile);
     }catch (IOException ex){
        System.out.println(ex.getMessage());
     }
}
    public static void main(String[] args) throws DocumentException, IOException {
        Pdfs example = new Pdfs(0);
        example.createPdf(RESULT1);
        example.abrirarchivo(RESULT1);
    }
}
