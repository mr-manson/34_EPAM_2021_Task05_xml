package by.epamtc.nikalaichanka.xml.parser;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import by.epamtc.nikalaichanka.xml.entity.Paper;
import by.epamtc.nikalaichanka.xml.entity.PaperTag;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DOM {
	private static ArrayList<Paper> papers = new ArrayList<>();
	
	private final static File FILE_PATH = new File("src/main/resources/paper.xml");
	
	//private final static String FILE_PATH = "src/main/resources/paper.xml";
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document document = db.parse(FILE_PATH);
		
		NodeList paperElements = document.getDocumentElement().getElementsByTagName(PaperTag.TITLE.getValue());
		for (int i = 0; i < paperElements.getLength(); i++) {
			//System.out.println(paperElements.getLength()); // !!! 2 !!!
			
			Element paperElement = (Element) paperElements.item(i);
			Paper paper = buildPaper(paperElement);
			papers.add(paper);
			/*Node paper = paperElements.item(i);
			NamedNodeMap attrib = paper.getAttributes();
			papers.add(new Paper(attrib.getNamedItem("id").getNodeValue(), attrib.getNamedItem("name").getNodeValue()));*/
		}
		
		
		for(Paper paper : papers) {
			System.out.printf("Info: id - %d, name - %s, type - %s, monthly - %s, color - %s, volum - %d, glossy - %s, index - %d \n",
					paper.getId(), paper.getTitle(), paper.getType(), paper.getMonthly(), paper.getColor(), paper.getVolum(),
					paper.getGlossy(), paper.getIndex());
		}
	}
	
    public static Paper buildPaper(Element element){
        Paper paper = new Paper();
        paper.setId(Integer.parseInt(getElementText(element, "id")));
        paper.setTitle(getElementText(element, "title"));
        paper.setType(getElementText(element, "type"));
        paper.setMonthly(getElementText(element, "monthly"));
        paper.setColor(getElementText(element, "color"));
        paper.setVolum(Integer.parseInt(getElementText(element, "volum")));
        paper.setGlossy(getElementText(element, "glossy"));        
        paper.setIndex(Integer.parseInt(getElementText(element, "index")));
        return paper;
    }

    private static String getElementText(Element element, String tag){
        NodeList nodeList = element.getElementsByTagName(tag);
        Node node = nodeList.item(1);
        return node.getTextContent();
    }
	
}
