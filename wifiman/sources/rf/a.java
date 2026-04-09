package Rf;

import Sf.b;
import Sf.c;
import Sf.d;
import Sf.e;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f19839a = new ArrayList();

    private void a(b bVar, Node node, Document document) throws DOMException {
        NamedNodeMap attributes = node.getAttributes();
        if (bVar.k() != null) {
            Attr attrCreateAttribute = document.createAttribute("version");
            attrCreateAttribute.setNodeValue(bVar.k());
            attributes.setNamedItem(attrCreateAttribute);
        }
        if (bVar.h() != null) {
            Attr attrCreateAttribute2 = document.createAttribute("creator");
            attrCreateAttribute2.setNodeValue(bVar.h());
            attributes.setNamedItem(attrCreateAttribute2);
        }
        if (bVar.d() > 0) {
            Element elementCreateElement = document.createElement("extensions");
            Iterator it = this.f19839a.iterator();
            while (it.hasNext()) {
                ((Tf.a) it.next()).h(elementCreateElement, bVar, document);
            }
            node.appendChild(elementCreateElement);
        }
    }

    private void c(String str, e eVar, Node node, Document document) throws DOMException {
        Element elementCreateElement = document.createElement(str);
        NamedNodeMap attributes = elementCreateElement.getAttributes();
        if (eVar.m() != null) {
            Attr attrCreateAttribute = document.createAttribute("lat");
            attrCreateAttribute.setNodeValue(eVar.m().toString());
            attributes.setNamedItem(attrCreateAttribute);
        }
        if (eVar.n() != null) {
            Attr attrCreateAttribute2 = document.createAttribute("lon");
            attrCreateAttribute2.setNodeValue(eVar.n().toString());
            attributes.setNamedItem(attrCreateAttribute2);
        }
        if (eVar.i() != null) {
            Element elementCreateElement2 = document.createElement("ele");
            elementCreateElement2.appendChild(document.createTextNode(eVar.i().toString()));
            elementCreateElement.appendChild(elementCreateElement2);
        }
        if (eVar.u() != null) {
            Element elementCreateElement3 = document.createElement("time");
            elementCreateElement3.appendChild(document.createTextNode(new SimpleDateFormat("yyyy-MM-dd'T'kk:mm:ss'Z'").format(eVar.u())));
            elementCreateElement.appendChild(elementCreateElement3);
        }
        if (eVar.o() != null) {
            Element elementCreateElement4 = document.createElement("magvar");
            elementCreateElement4.appendChild(document.createTextNode(eVar.o().toString()));
            elementCreateElement.appendChild(elementCreateElement4);
        }
        if (eVar.k() != null) {
            Element elementCreateElement5 = document.createElement("geoidheight");
            elementCreateElement5.appendChild(document.createTextNode(eVar.k().toString()));
            elementCreateElement.appendChild(elementCreateElement5);
        }
        if (eVar.p() != null) {
            Element elementCreateElement6 = document.createElement("name");
            elementCreateElement6.appendChild(document.createTextNode(eVar.p()));
            elementCreateElement.appendChild(elementCreateElement6);
        }
        if (eVar.f() != null) {
            Element elementCreateElement7 = document.createElement("cmt");
            elementCreateElement7.appendChild(document.createTextNode(eVar.f()));
            elementCreateElement.appendChild(elementCreateElement7);
        }
        if (eVar.g() != null) {
            Element elementCreateElement8 = document.createElement("desc");
            elementCreateElement8.appendChild(document.createTextNode(eVar.g()));
            elementCreateElement.appendChild(elementCreateElement8);
        }
        if (eVar.s() != null) {
            Element elementCreateElement9 = document.createElement("src");
            elementCreateElement9.appendChild(document.createTextNode(eVar.s()));
            elementCreateElement.appendChild(elementCreateElement9);
        }
        if (eVar.t() != null) {
            Element elementCreateElement10 = document.createElement("sym");
            elementCreateElement10.appendChild(document.createTextNode(eVar.t()));
            elementCreateElement.appendChild(elementCreateElement10);
        }
        if (eVar.v() != null) {
            Element elementCreateElement11 = document.createElement("type");
            elementCreateElement11.appendChild(document.createTextNode(eVar.v()));
            elementCreateElement.appendChild(elementCreateElement11);
        }
        if (eVar.j() != null) {
            Element elementCreateElement12 = document.createElement("fix");
            elementCreateElement12.appendChild(document.createTextNode(eVar.j().toString()));
            elementCreateElement.appendChild(elementCreateElement12);
        }
        if (eVar.r() != null) {
            Element elementCreateElement13 = document.createElement("sat");
            elementCreateElement13.appendChild(document.createTextNode(eVar.r().toString()));
            elementCreateElement.appendChild(elementCreateElement13);
        }
        if (eVar.l() != null) {
            Element elementCreateElement14 = document.createElement("hdop");
            elementCreateElement14.appendChild(document.createTextNode(eVar.l().toString()));
            elementCreateElement.appendChild(elementCreateElement14);
        }
        if (eVar.w() != null) {
            Element elementCreateElement15 = document.createElement("vdop");
            elementCreateElement15.appendChild(document.createTextNode(eVar.w().toString()));
            elementCreateElement.appendChild(elementCreateElement15);
        }
        if (eVar.q() != null) {
            Element elementCreateElement16 = document.createElement("pdop");
            elementCreateElement16.appendChild(document.createTextNode(eVar.q().toString()));
            elementCreateElement.appendChild(elementCreateElement16);
        }
        if (eVar.e() != null) {
            Element elementCreateElement17 = document.createElement("ageofdgpsdata");
            elementCreateElement17.appendChild(document.createTextNode(eVar.e().toString()));
            elementCreateElement.appendChild(elementCreateElement17);
        }
        if (eVar.h() != null) {
            Element elementCreateElement18 = document.createElement("dgpsid");
            elementCreateElement18.appendChild(document.createTextNode(eVar.h().toString()));
            elementCreateElement.appendChild(elementCreateElement18);
        }
        if (eVar.d() > 0) {
            Element elementCreateElement19 = document.createElement("extensions");
            Iterator it = this.f19839a.iterator();
            while (it.hasNext()) {
                ((Tf.a) it.next()).e(elementCreateElement19, eVar, document);
            }
            elementCreateElement.appendChild(elementCreateElement19);
        }
        node.appendChild(elementCreateElement);
    }

    private void d(c cVar, Node node, Document document) throws DOMException {
        Element elementCreateElement = document.createElement("rte");
        if (cVar.h() != null) {
            Element elementCreateElement2 = document.createElement("name");
            elementCreateElement2.appendChild(document.createTextNode(cVar.h()));
            elementCreateElement.appendChild(elementCreateElement2);
        }
        if (cVar.f() != null) {
            Element elementCreateElement3 = document.createElement("cmt");
            elementCreateElement3.appendChild(document.createTextNode(cVar.f()));
            elementCreateElement.appendChild(elementCreateElement3);
        }
        if (cVar.g() != null) {
            Element elementCreateElement4 = document.createElement("desc");
            elementCreateElement4.appendChild(document.createTextNode(cVar.g()));
            elementCreateElement.appendChild(elementCreateElement4);
        }
        if (cVar.k() != null) {
            Element elementCreateElement5 = document.createElement("src");
            elementCreateElement5.appendChild(document.createTextNode(cVar.k()));
            elementCreateElement.appendChild(elementCreateElement5);
        }
        if (cVar.i() != null) {
            Element elementCreateElement6 = document.createElement("number");
            elementCreateElement6.appendChild(document.createTextNode(cVar.i().toString()));
            elementCreateElement.appendChild(elementCreateElement6);
        }
        if (cVar.l() != null) {
            Element elementCreateElement7 = document.createElement("type");
            elementCreateElement7.appendChild(document.createTextNode(cVar.l()));
            elementCreateElement.appendChild(elementCreateElement7);
        }
        if (cVar.d() > 0) {
            Element elementCreateElement8 = document.createElement("extensions");
            Iterator it = this.f19839a.iterator();
            while (it.hasNext()) {
                ((Tf.a) it.next()).b(elementCreateElement8, cVar, document);
            }
            elementCreateElement.appendChild(elementCreateElement8);
        }
        if (cVar.j() != null) {
            Iterator it2 = cVar.j().iterator();
            while (it2.hasNext()) {
                c("rtept", (e) it2.next(), elementCreateElement, document);
            }
        }
        node.appendChild(elementCreateElement);
    }

    private void e(d dVar, Node node, Document document) throws DOMException {
        Element elementCreateElement = document.createElement("trk");
        if (dVar.j() != null) {
            Element elementCreateElement2 = document.createElement("name");
            elementCreateElement2.appendChild(document.createTextNode(dVar.j()));
            elementCreateElement.appendChild(elementCreateElement2);
        }
        if (dVar.h() != null) {
            Element elementCreateElement3 = document.createElement("cmt");
            elementCreateElement3.appendChild(document.createTextNode(dVar.h()));
            elementCreateElement.appendChild(elementCreateElement3);
        }
        if (dVar.i() != null) {
            Element elementCreateElement4 = document.createElement("desc");
            elementCreateElement4.appendChild(document.createTextNode(dVar.i()));
            elementCreateElement.appendChild(elementCreateElement4);
        }
        if (dVar.l() != null) {
            Element elementCreateElement5 = document.createElement("src");
            elementCreateElement5.appendChild(document.createTextNode(dVar.l()));
            elementCreateElement.appendChild(elementCreateElement5);
        }
        if (dVar.k() != null) {
            Element elementCreateElement6 = document.createElement("number");
            elementCreateElement6.appendChild(document.createTextNode(dVar.k().toString()));
            elementCreateElement.appendChild(elementCreateElement6);
        }
        if (dVar.n() != null) {
            Element elementCreateElement7 = document.createElement("type");
            elementCreateElement7.appendChild(document.createTextNode(dVar.n()));
            elementCreateElement.appendChild(elementCreateElement7);
        }
        if (dVar.d() > 0) {
            Element elementCreateElement8 = document.createElement("extensions");
            Iterator it = this.f19839a.iterator();
            while (it.hasNext()) {
                ((Tf.a) it.next()).f(elementCreateElement8, dVar, document);
            }
            elementCreateElement.appendChild(elementCreateElement8);
        }
        if (dVar.m() != null) {
            Element elementCreateElement9 = document.createElement("trkseg");
            Iterator it2 = dVar.m().iterator();
            while (it2.hasNext()) {
                c("trkpt", (e) it2.next(), elementCreateElement9, document);
            }
            elementCreateElement.appendChild(elementCreateElement9);
        }
        node.appendChild(elementCreateElement);
    }

    private void f(e eVar, Node node, Document document) throws DOMException {
        c("wpt", eVar, node, document);
    }

    private Date g(Node node) {
        return new SimpleDateFormat("yyyy-MM-dd'T'kk:mm:ss").parse(node.getFirstChild().getNodeValue());
    }

    private Double h(Node node) {
        return Double.valueOf(Double.parseDouble(node.getFirstChild().getNodeValue()));
    }

    private Uf.a i(Node node) {
        return Uf.a.b(node.getFirstChild().getNodeValue());
    }

    private Integer j(Node node) {
        return Integer.valueOf(Integer.parseInt(node.getFirstChild().getNodeValue()));
    }

    private String k(Node node) {
        Node firstChild;
        if (node == null || (firstChild = node.getFirstChild()) == null) {
            return null;
        }
        return firstChild.getNodeValue();
    }

    private c m(Node node) throws Exception {
        if (node == null) {
            return null;
        }
        c cVar = new c();
        NodeList childNodes = node.getChildNodes();
        if (childNodes != null) {
            for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
                Node nodeItem = childNodes.item(i10);
                if ("name".equals(nodeItem.getNodeName())) {
                    cVar.o(k(nodeItem));
                } else if ("cmt".equals(nodeItem.getNodeName())) {
                    cVar.m(k(nodeItem));
                } else if ("desc".equals(nodeItem.getNodeName())) {
                    cVar.n(k(nodeItem));
                } else if ("src".equals(nodeItem.getNodeName())) {
                    cVar.q(k(nodeItem));
                } else if (!"link".equals(nodeItem.getNodeName())) {
                    if ("number".equals(nodeItem.getNodeName())) {
                        cVar.p(j(nodeItem));
                    } else if ("type".equals(nodeItem.getNodeName())) {
                        cVar.r(k(nodeItem));
                    } else if ("rtept".equals(nodeItem.getNodeName())) {
                        e eVarP = p(nodeItem);
                        if (eVarP != null) {
                            cVar.e(eVarP);
                        }
                    } else if ("extensions".equals(nodeItem.getNodeName())) {
                        Iterator it = this.f19839a.iterator();
                        while (it.hasNext()) {
                            Tf.a aVar = (Tf.a) it.next();
                            Object objG = aVar.g(nodeItem);
                            if (objG != null) {
                                cVar.a(aVar.getId(), objG);
                            }
                        }
                    }
                }
            }
        }
        return cVar;
    }

    private d n(Node node) throws Exception {
        if (node == null) {
            return null;
        }
        d dVar = new d();
        NodeList childNodes = node.getChildNodes();
        if (childNodes != null) {
            for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
                Node nodeItem = childNodes.item(i10);
                if ("name".equals(nodeItem.getNodeName())) {
                    dVar.q(k(nodeItem));
                } else if ("cmt".equals(nodeItem.getNodeName())) {
                    dVar.o(k(nodeItem));
                } else if ("desc".equals(nodeItem.getNodeName())) {
                    dVar.p(k(nodeItem));
                } else if ("src".equals(nodeItem.getNodeName())) {
                    dVar.s(k(nodeItem));
                } else if (!"link".equals(nodeItem.getNodeName())) {
                    if ("number".equals(nodeItem.getNodeName())) {
                        dVar.r(j(nodeItem));
                    } else if ("type".equals(nodeItem.getNodeName())) {
                        dVar.t(k(nodeItem));
                    } else if ("trkseg".equals(nodeItem.getNodeName())) {
                        ArrayList arrayListO = o(nodeItem);
                        dVar.f(arrayListO);
                        dVar.g(arrayListO);
                    } else if ("extensions".equals(nodeItem.getNodeName())) {
                        Iterator it = this.f19839a.iterator();
                        while (it.hasNext()) {
                            Tf.a aVar = (Tf.a) it.next();
                            Object objC = aVar.c(nodeItem);
                            if (objC != null) {
                                dVar.a(aVar.getId(), objC);
                            }
                        }
                    }
                }
            }
        }
        return dVar;
    }

    private ArrayList o(Node node) throws Exception {
        if (node == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = node.getChildNodes();
        if (childNodes != null) {
            for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
                Node nodeItem = childNodes.item(i10);
                if ("trkpt".equals(nodeItem.getNodeName())) {
                    e eVarP = p(nodeItem);
                    if (eVarP != null) {
                        arrayList.add(eVarP);
                    }
                } else {
                    "extensions".equals(nodeItem.getNodeName());
                }
            }
        }
        return arrayList;
    }

    private e p(Node node) throws Exception {
        if (node == null) {
            return null;
        }
        e eVar = new e(null, 0.0f, 0.0f);
        NamedNodeMap attributes = node.getAttributes();
        Node namedItem = attributes.getNamedItem("lat");
        if (namedItem == null) {
            throw new Exception("no lat value in waypoint data.");
        }
        eVar.F(Double.valueOf(Double.parseDouble(namedItem.getNodeValue())));
        Node namedItem2 = attributes.getNamedItem("lon");
        if (namedItem2 == null) {
            throw new Exception("no lon value in waypoint data.");
        }
        eVar.G(Double.valueOf(Double.parseDouble(namedItem2.getNodeValue())));
        NodeList childNodes = node.getChildNodes();
        if (childNodes != null) {
            for (int i10 = 0; i10 < childNodes.getLength(); i10++) {
                Node nodeItem = childNodes.item(i10);
                if ("ele".equals(nodeItem.getNodeName())) {
                    eVar.B(h(nodeItem));
                } else if ("time".equals(nodeItem.getNodeName())) {
                    eVar.N(g(nodeItem));
                } else if ("name".equals(nodeItem.getNodeName())) {
                    eVar.I(k(nodeItem));
                } else if ("cmt".equals(nodeItem.getNodeName())) {
                    eVar.y(k(nodeItem));
                } else if ("desc".equals(nodeItem.getNodeName())) {
                    eVar.z(k(nodeItem));
                } else if ("src".equals(nodeItem.getNodeName())) {
                    eVar.L(k(nodeItem));
                } else if ("magvar".equals(nodeItem.getNodeName())) {
                    eVar.H(h(nodeItem));
                } else if ("geoidheight".equals(nodeItem.getNodeName())) {
                    eVar.D(h(nodeItem));
                } else if (!"link".equals(nodeItem.getNodeName())) {
                    if ("sym".equals(nodeItem.getNodeName())) {
                        eVar.M(k(nodeItem));
                    } else if ("fix".equals(nodeItem.getNodeName())) {
                        eVar.C(i(nodeItem));
                    } else if ("type".equals(nodeItem.getNodeName())) {
                        eVar.O(k(nodeItem));
                    } else if ("sat".equals(nodeItem.getNodeName())) {
                        eVar.K(j(nodeItem));
                    } else if ("hdop".equals(nodeItem.getNodeName())) {
                        eVar.E(h(nodeItem));
                    } else if ("vdop".equals(nodeItem.getNodeName())) {
                        eVar.P(h(nodeItem));
                    } else if ("pdop".equals(nodeItem.getNodeName())) {
                        eVar.J(h(nodeItem));
                    } else if ("ageofdgpsdata".equals(nodeItem.getNodeName())) {
                        eVar.x(h(nodeItem));
                    } else if ("dgpsid".equals(nodeItem.getNodeName())) {
                        eVar.A(j(nodeItem));
                    } else if ("extensions".equals(nodeItem.getNodeName())) {
                        Iterator it = this.f19839a.iterator();
                        while (it.hasNext()) {
                            Tf.a aVar = (Tf.a) it.next();
                            eVar.a(aVar.getId(), aVar.a(nodeItem));
                        }
                    }
                }
            }
        }
        return eVar;
    }

    public void b(Tf.a aVar) {
        this.f19839a.add(aVar);
    }

    public b l(InputStream inputStream) throws Exception {
        c cVarM;
        Node firstChild = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream).getFirstChild();
        if (firstChild == null || !"gpx".equals(firstChild.getNodeName())) {
            return null;
        }
        b bVar = new b();
        NamedNodeMap attributes = firstChild.getAttributes();
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            Node nodeItem = attributes.item(i10);
            if ("version".equals(nodeItem.getNodeName())) {
                bVar.n(nodeItem.getNodeValue());
            } else if ("creator".equals(nodeItem.getNodeName())) {
                bVar.m(nodeItem.getNodeValue());
            }
        }
        NodeList childNodes = firstChild.getChildNodes();
        if (childNodes != null) {
            for (int i11 = 0; i11 < childNodes.getLength(); i11++) {
                Node nodeItem2 = childNodes.item(i11);
                if ("wpt".equals(nodeItem2.getNodeName())) {
                    e eVarP = p(nodeItem2);
                    if (eVarP != null) {
                        bVar.g(eVarP);
                    }
                } else if ("trk".equals(nodeItem2.getNodeName())) {
                    d dVarN = n(nodeItem2);
                    if (dVarN != null) {
                        bVar.f(dVarN);
                    }
                } else if ("extensions".equals(nodeItem2.getNodeName())) {
                    Iterator it = this.f19839a.iterator();
                    while (it.hasNext()) {
                        Tf.a aVar = (Tf.a) it.next();
                        bVar.a(aVar.getId(), aVar.d(nodeItem2));
                    }
                } else if ("rte".equals(nodeItem2.getNodeName()) && (cVarM = m(nodeItem2)) != null) {
                    bVar.e(cVarM);
                }
            }
        }
        return bVar;
    }

    public void q(b bVar, OutputStream outputStream) throws TransformerException, DOMException, IllegalArgumentException {
        r(bVar, outputStream, false);
    }

    public void r(b bVar, OutputStream outputStream, boolean z10) throws TransformerException, DOMException, IllegalArgumentException {
        Document documentNewDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element elementCreateElement = documentNewDocument.createElement("gpx");
        a(bVar, elementCreateElement, documentNewDocument);
        if (bVar.l() != null) {
            Iterator it = bVar.l().iterator();
            while (it.hasNext()) {
                f((e) it.next(), elementCreateElement, documentNewDocument);
            }
        }
        if (bVar.i() != null) {
            Iterator it2 = bVar.i().iterator();
            while (it2.hasNext()) {
                d((c) it2.next(), elementCreateElement, documentNewDocument);
            }
        }
        if (bVar.j() != null) {
            Iterator it3 = bVar.j().iterator();
            while (it3.hasNext()) {
                e((d) it3.next(), elementCreateElement, documentNewDocument);
            }
        }
        documentNewDocument.appendChild(elementCreateElement);
        Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
        if (z10) {
            transformerNewTransformer.setOutputProperty("indent", "yes");
        }
        transformerNewTransformer.transform(new DOMSource(documentNewDocument), new StreamResult(outputStream));
    }
}
