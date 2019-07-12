package Java;

public class Printer
{
    private String tonerFill;
    private int tonerPrintPages;
    private boolean duplexPrinter;

    public String getTonerFill()
    {
        return tonerFill;
    }
    public int getTonerPrintPages()
    {
        return tonerPrintPages;
    }




    public boolean getDuplexprinter()
    {
        return duplexPrinter;
    }

    public void setTonerFill(String tonerFill)
    {
        this.tonerFill=tonerFill;

    }

    public void settonerPrintPages(int tonerPrintPages)
    {
        this.tonerPrintPages=tonerPrintPages;

    }


    public void setDuplexPrinter(boolean duplexPrinter)
    {
        this.duplexPrinter=duplexPrinter;
    }

        public static void main(String[] args)
        {
            Printer printer=new Printer();
       printer.setTonerFill("It prints 90% of the page");
       printer.settonerPrintPages(100);
       printer.setDuplexPrinter(true);
System.out.println(printer.getTonerFill()+"\nThe no.of pages it prints is:"+printer.getTonerPrintPages()+"\nIs it a Duplex Printer: "+printer.getDuplexprinter());

        }
    }

