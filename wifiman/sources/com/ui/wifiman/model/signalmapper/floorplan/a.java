package com.ui.wifiman.model.signalmapper.floorplan;

import S8.l;
import Sf.d;
import Sf.e;
import Yg.J;
import Yg.r;
import Zg.Q;
import ch.AbstractC4260a;
import com.ui.wifiman.model.signalmapper.floorplan.WifimanFloorplanSessionGpxSerializer;
import com.ui.wifiman.model.signalmapper.floorplan.b;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C6510d;
import kotlin.text.t;
import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class a implements WifimanFloorplanSessionGpxSerializer {

    /* renamed from: b, reason: collision with root package name */
    public static final C1412a f42853b = new C1412a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Rf.a f42854a;

    /* renamed from: com.ui.wifiman.model.signalmapper.floorplan.a$a, reason: collision with other inner class name */
    public static final class C1412a {
        public /* synthetic */ C1412a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1412a() {
        }
    }

    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC4260a.e(((e) obj).u(), ((e) obj2).u());
        }
    }

    public a() {
        Rf.a aVar = new Rf.a();
        aVar.b(new b.C1413a());
        this.f42854a = aVar;
    }

    private final float d(int i10, float f10) {
        return i10 * f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(e eVar) {
        return AbstractC6492s.d(eVar.v(), "objectDetection");
    }

    private final float g(float f10, float f11) {
        return f10 * f11;
    }

    static /* synthetic */ float h(a aVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f11 = 0.001f;
        }
        return aVar.g(f10, f11);
    }

    private final float i(float f10, float f11) {
        return f10 / f11;
    }

    private final Sf.b k(com.ui.wifiman.model.signalmapper.floorplan.b bVar) {
        Sf.b bVar2 = new Sf.b();
        bVar2.a("wifiman", new b(null, Float.valueOf(bVar.e()), Float.valueOf(0.001f), 1, null));
        d dVar = new d();
        dVar.t("path");
        synchronized (bVar.d()) {
            try {
                for (b.C1415b c1415b : bVar.d()) {
                    e eVar = new e(null, h(this, d(c1415b.a().a(), bVar.e()), 0.0f, 1, null), h(this, d(c1415b.a().b(), bVar.e()), 0.0f, 1, null));
                    eVar.N(new Date(c1415b.b()));
                    eVar.a("wifiman", new b(c1415b.c(), null, null, 6, null));
                    dVar.e(eVar);
                }
                J j10 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bVar2.f(dVar);
        synchronized (bVar.c()) {
            try {
                for (b.a aVar : bVar.c()) {
                    e eVar2 = new e(aVar.b(), h(this, d(aVar.a().a(), bVar.e()), 0.0f, 1, null), h(this, d(aVar.a().b(), bVar.e()), 0.0f, 1, null));
                    eVar2.O("objectDetection");
                    eVar2.N(new Date(aVar.c()));
                    bVar2.g(eVar2);
                }
                J j11 = J.f24997a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f6  */
    @Override // com.ui.wifiman.model.signalmapper.floorplan.WifimanFloorplanSessionGpxSerializer
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.ui.wifiman.model.signalmapper.floorplan.b a(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.model.signalmapper.floorplan.a.a(java.lang.String):com.ui.wifiman.model.signalmapper.floorplan.b");
    }

    @Override // com.ui.wifiman.model.signalmapper.floorplan.WifimanFloorplanSessionGpxSerializer
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public String b(com.ui.wifiman.model.signalmapper.floorplan.b session) throws DOMException, IllegalArgumentException, UnsupportedEncodingException {
        AbstractC6492s.i(session, "session");
        Sf.b bVarK = k(session);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            this.f42854a.q(bVarK, byteArrayOutputStream);
            String string = byteArrayOutputStream.toString(C6510d.f52215b.name());
            AbstractC6492s.h(string, "toString(...)");
            return string;
        } catch (ParserConfigurationException e10) {
            throw new WifimanFloorplanSessionGpxSerializer.Error("failed to serialize floorplan", e10);
        } catch (TransformerException e11) {
            throw new WifimanFloorplanSessionGpxSerializer.Error("failed to serialize floorplan", e11);
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final l f42855a;

        /* renamed from: b, reason: collision with root package name */
        private final Float f42856b;

        /* renamed from: c, reason: collision with root package name */
        private final Float f42857c;

        /* renamed from: com.ui.wifiman.model.signalmapper.floorplan.a$b$a, reason: collision with other inner class name */
        public static final class C1413a implements Tf.a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1414a f42858a = new C1414a(null);

            /* renamed from: com.ui.wifiman.model.signalmapper.floorplan.a$b$a$a, reason: collision with other inner class name */
            public static final class C1414a {
                public /* synthetic */ C1414a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private C1414a() {
                }
            }

            @Override // Tf.a
            public Object a(Node node) {
                l lVarA;
                Node nodeItem;
                String nodeValue;
                Integer numQ;
                AbstractC6492s.i(node, "node");
                Iterator it = AbstractC7978m.s(0, node.getChildNodes().getLength()).iterator();
                do {
                    lVarA = null;
                    if (!it.hasNext()) {
                        return null;
                    }
                    nodeItem = node.getChildNodes().item(((Q) it).d());
                    if (!AbstractC6492s.d(nodeItem.getNodeName(), "wm")) {
                        nodeItem = null;
                    }
                } while (nodeItem == null);
                Node namedItem = nodeItem.getAttributes().getNamedItem("wifiSignal");
                if (namedItem != null && (nodeValue = namedItem.getNodeValue()) != null && (numQ = t.q(nodeValue)) != null) {
                    lVarA = l.f20404f.a(numQ.intValue());
                }
                return new b(lVarA, null, null, 6, null);
            }

            @Override // Tf.a
            public void b(Node node, Sf.c cVar, Document document) {
                throw new r("Ony waypoint extensions supported");
            }

            @Override // Tf.a
            public Object c(Node node) {
                throw new r("Ony waypoint extensions supported");
            }

            @Override // Tf.a
            public Object d(Node node) {
                Float fO;
                Node nodeItem;
                String nodeValue;
                String nodeValue2;
                AbstractC6492s.i(node, "node");
                Iterator it = AbstractC7978m.s(0, node.getChildNodes().getLength()).iterator();
                do {
                    fO = null;
                    if (!it.hasNext()) {
                        return null;
                    }
                    nodeItem = node.getChildNodes().item(((Q) it).d());
                    if (!AbstractC6492s.d(nodeItem.getNodeName(), "wm")) {
                        nodeItem = null;
                    }
                } while (nodeItem == null);
                Node namedItem = nodeItem.getAttributes().getNamedItem("scale");
                Float fO2 = (namedItem == null || (nodeValue2 = namedItem.getNodeValue()) == null) ? null : t.o(nodeValue2);
                Node namedItem2 = nodeItem.getAttributes().getNamedItem("granularity");
                if (namedItem2 != null && (nodeValue = namedItem2.getNodeValue()) != null) {
                    fO = t.o(nodeValue);
                }
                return new b(null, fO, fO2, 1, null);
            }

            @Override // Tf.a
            public void e(Node node, e wp, Document document) throws DOMException {
                l lVarC;
                AbstractC6492s.i(node, "node");
                AbstractC6492s.i(wp, "wp");
                AbstractC6492s.i(document, "document");
                Object obj = wp.c().get("wifiman");
                b bVar = obj instanceof b ? (b) obj : null;
                if (bVar == null || (lVarC = bVar.c()) == null) {
                    return;
                }
                int iB = lVarC.b();
                Element elementCreateElement = document.createElement("wm");
                AbstractC6492s.h(elementCreateElement, "createElement(...)");
                node.appendChild(elementCreateElement);
                Attr attrCreateAttribute = document.createAttribute("wifiSignal");
                attrCreateAttribute.setValue(String.valueOf(iB));
                elementCreateElement.setAttributeNode(attrCreateAttribute);
            }

            @Override // Tf.a
            public void f(Node node, d dVar, Document document) {
                throw new r("Ony waypoint extensions supported");
            }

            @Override // Tf.a
            public Object g(Node node) {
                throw new r("Ony waypoint extensions supported");
            }

            @Override // Tf.a
            public String getId() {
                return "wifiman";
            }

            @Override // Tf.a
            public void h(Node node, Sf.b gpx, Document document) throws DOMException {
                AbstractC6492s.i(node, "node");
                AbstractC6492s.i(gpx, "gpx");
                AbstractC6492s.i(document, "document");
                Object obj = gpx.c().get("wifiman");
                b bVar = obj instanceof b ? (b) obj : null;
                if (bVar != null) {
                    Element elementCreateElement = document.createElement("wm");
                    AbstractC6492s.h(elementCreateElement, "createElement(...)");
                    Float fA = bVar.a();
                    if (fA != null) {
                        float fFloatValue = fA.floatValue();
                        Attr attrCreateAttribute = document.createAttribute("granularity");
                        attrCreateAttribute.setValue(String.valueOf(fFloatValue));
                        elementCreateElement.setAttributeNode(attrCreateAttribute);
                    }
                    Float fB = bVar.b();
                    if (fB != null) {
                        float fFloatValue2 = fB.floatValue();
                        Attr attrCreateAttribute2 = document.createAttribute("scale");
                        attrCreateAttribute2.setValue(String.valueOf(fFloatValue2));
                        elementCreateElement.setAttributeNode(attrCreateAttribute2);
                    }
                    if (elementCreateElement.hasAttributes()) {
                        node.appendChild(elementCreateElement);
                    }
                }
            }
        }

        public b(l lVar, Float f10, Float f11) {
            this.f42855a = lVar;
            this.f42856b = f10;
            this.f42857c = f11;
        }

        public final Float a() {
            return this.f42856b;
        }

        public final Float b() {
            return this.f42857c;
        }

        public final l c() {
            return this.f42855a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f42855a, bVar.f42855a) && AbstractC6492s.d(this.f42856b, bVar.f42856b) && AbstractC6492s.d(this.f42857c, bVar.f42857c);
        }

        public int hashCode() {
            l lVar = this.f42855a;
            int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
            Float f10 = this.f42856b;
            int iHashCode2 = (iHashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
            Float f11 = this.f42857c;
            return iHashCode2 + (f11 != null ? f11.hashCode() : 0);
        }

        public String toString() {
            return "WifimanExtension(wifi=" + this.f42855a + ", granularity=" + this.f42856b + ", scale=" + this.f42857c + ")";
        }

        public /* synthetic */ b(l lVar, Float f10, Float f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : lVar, (i10 & 2) != 0 ? null : f10, (i10 & 4) != 0 ? null : f11);
        }
    }
}
