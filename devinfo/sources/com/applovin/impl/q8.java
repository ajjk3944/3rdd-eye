package com.applovin.impl;

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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class q8 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f5170a;

    /* renamed from: b, reason: collision with root package name */
    private Stack f5171b;

    /* renamed from: c, reason: collision with root package name */
    private StringBuilder f5172c;

    /* renamed from: d, reason: collision with root package name */
    private long f5173d;

    /* renamed from: e, reason: collision with root package name */
    private b f5174e;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class b extends p8 {
        public b(String str, Map map, p8 p8Var) {
            super(str, map, p8Var);
        }

        public void a(p8 p8Var) {
            if (p8Var == null) {
                throw new IllegalArgumentException("None specified.");
            }
            this.f5085e.add(p8Var);
        }

        public void d(String str) {
            this.f5084d = str;
        }
    }

    public q8(com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f5170a = kVar.O();
    }

    public static p8 a(String str, com.applovin.impl.sdk.k kVar) {
        return new q8(kVar).a(str);
    }

    public p8 a(String str) throws SAXException {
        if (str != null) {
            this.f5172c = new StringBuilder();
            this.f5171b = new Stack();
            this.f5174e = null;
            Xml.parse(str, new a());
            b bVar = this.f5174e;
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
            for (int i4 = 0; i4 < length; i4++) {
                map.put(attributes.getQName(i4), attributes.getValue(i4));
            }
            return map;
        }
        return Collections.EMPTY_MAP;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a implements ContentHandler {
        public a() {
        }

        @Override // org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i4, int i10) {
            String strTrim = new String(Arrays.copyOfRange(cArr, i4, i10)).trim();
            if (StringUtils.isValidString(strTrim)) {
                q8.this.f5172c.append(strTrim);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endDocument() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - q8.this.f5173d;
            com.applovin.impl.sdk.o unused = q8.this.f5170a;
            if (com.applovin.impl.sdk.o.a()) {
                q8.this.f5170a.a("XmlParser", "Finished parsing in " + seconds + " seconds");
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            q8 q8Var = q8.this;
            q8Var.f5174e = (b) q8Var.f5171b.pop();
            q8.this.f5174e.d(q8.this.f5172c.toString().trim());
            q8.this.f5172c.setLength(0);
        }

        @Override // org.xml.sax.ContentHandler
        public void startDocument() {
            com.applovin.impl.sdk.o unused = q8.this.f5170a;
            if (com.applovin.impl.sdk.o.a()) {
                q8.this.f5170a.a("XmlParser", "Begin parsing...");
            }
            q8.this.f5173d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }

        @Override // org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            try {
                b bVar = !q8.this.f5171b.isEmpty() ? (b) q8.this.f5171b.peek() : null;
                b bVar2 = new b(str2, q8.this.a(attributes), bVar);
                if (bVar != null) {
                    bVar.a(bVar2);
                }
                q8.this.f5171b.push(bVar2);
            } catch (Exception e2) {
                com.applovin.impl.sdk.o unused = q8.this.f5170a;
                if (com.applovin.impl.sdk.o.a()) {
                    q8.this.f5170a.a("XmlParser", d.h.t("Unable to process element <", str2, ">"), e2);
                }
                throw new SAXException("Failed to start element", e2);
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
        public void ignorableWhitespace(char[] cArr, int i4, int i10) {
        }
    }
}
