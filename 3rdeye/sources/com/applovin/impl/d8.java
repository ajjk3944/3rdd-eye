package com.applovin.impl;

import N7.C1154e9;
import android.util.Xml;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* loaded from: classes.dex */
public class d8 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f19230a;

    /* renamed from: b, reason: collision with root package name */
    private Stack f19231b;

    /* renamed from: c, reason: collision with root package name */
    private StringBuilder f19232c;

    /* renamed from: d, reason: collision with root package name */
    private long f19233d;

    /* renamed from: e, reason: collision with root package name */
    private b f19234e;

    public static class b extends c8 {
        public b(String str, Map map, c8 c8Var) {
            super(str, map, c8Var);
        }

        public void a(c8 c8Var) {
            if (c8Var == null) {
                throw new IllegalArgumentException("None specified.");
            }
            this.f19182e.add(c8Var);
        }

        public void d(String str) {
            this.f19181d = str;
        }
    }

    public d8(com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f19230a = kVar.O();
    }

    public static c8 a(String str, com.applovin.impl.sdk.k kVar) {
        return new d8(kVar).a(str);
    }

    public c8 a(String str) throws SAXException {
        if (str != null) {
            this.f19232c = new StringBuilder();
            this.f19231b = new Stack();
            this.f19234e = null;
            Xml.parse(str, new a());
            b bVar = this.f19234e;
            if (bVar != null) {
                return bVar;
            }
            throw new SAXException("Unable to parse XML into node");
        }
        throw new IllegalArgumentException("Unable to parse. No XML specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map a(Attributes attributes) {
        if (attributes != null) {
            int length = attributes.getLength();
            HashMap map = new HashMap(length);
            for (int i = 0; i < length; i++) {
                map.put(attributes.getQName(i), attributes.getValue(i));
            }
            return map;
        }
        return Collections.EMPTY_MAP;
    }

    public class a implements ContentHandler {
        public a() {
        }

        @Override // org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i10) {
            String strTrim = new String(Arrays.copyOfRange(cArr, i, i10)).trim();
            if (StringUtils.isValidString(strTrim)) {
                d8.this.f19232c.append(strTrim);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endDocument() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - d8.this.f19233d;
            com.applovin.impl.sdk.o unused = d8.this.f19230a;
            if (com.applovin.impl.sdk.o.a()) {
                d8.this.f19230a.a("XmlParser", "Finished parsing in " + seconds + " seconds");
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            d8 d8Var = d8.this;
            d8Var.f19234e = (b) d8Var.f19231b.pop();
            d8.this.f19234e.d(d8.this.f19232c.toString().trim());
            d8.this.f19232c.setLength(0);
        }

        @Override // org.xml.sax.ContentHandler
        public void startDocument() {
            com.applovin.impl.sdk.o unused = d8.this.f19230a;
            if (com.applovin.impl.sdk.o.a()) {
                d8.this.f19230a.a("XmlParser", "Begin parsing...");
            }
            d8.this.f19233d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }

        @Override // org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            try {
                b bVar = !d8.this.f19231b.isEmpty() ? (b) d8.this.f19231b.peek() : null;
                b bVar2 = new b(str2, d8.this.a(attributes), bVar);
                if (bVar != null) {
                    bVar.a(bVar2);
                }
                d8.this.f19231b.push(bVar2);
            } catch (Exception e4) {
                com.applovin.impl.sdk.o unused = d8.this.f19230a;
                if (com.applovin.impl.sdk.o.a()) {
                    d8.this.f19230a.a("XmlParser", C1154e9.i("Unable to process element <", str2, ">"), e4);
                }
                throw new SAXException("Failed to start element", e4);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endPrefixMapping(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void setDocumentLocator(Locator locator) {
        }

        @Override // org.xml.sax.ContentHandler
        public void skippedEntity(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
        }

        @Override // org.xml.sax.ContentHandler
        public void startPrefixMapping(String str, String str2) {
        }

        @Override // org.xml.sax.ContentHandler
        public void ignorableWhitespace(char[] cArr, int i, int i10) {
        }
    }
}
