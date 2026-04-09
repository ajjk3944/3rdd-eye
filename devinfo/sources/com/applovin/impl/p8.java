package com.applovin.impl;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class p8 {

    /* renamed from: f, reason: collision with root package name */
    public static final p8 f5080f = new p8();

    /* renamed from: a, reason: collision with root package name */
    private final p8 f5081a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5082b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f5083c;

    /* renamed from: d, reason: collision with root package name */
    protected String f5084d;

    /* renamed from: e, reason: collision with root package name */
    protected final List f5085e;

    public p8(String str, Map map, p8 p8Var) {
        this.f5081a = p8Var;
        this.f5082b = str;
        this.f5083c = DesugarCollections.unmodifiableMap(map);
        this.f5085e = new ArrayList();
    }

    public Map a() {
        return this.f5083c;
    }

    public List b() {
        return DesugarCollections.unmodifiableList(this.f5085e);
    }

    public String c() {
        return this.f5082b;
    }

    public String d() {
        return this.f5084d;
    }

    public String toString() {
        return "XmlNode{elementName='" + this.f5082b + "', text='" + this.f5084d + "', attributes=" + this.f5083c + '}';
    }

    public List a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        ArrayList arrayList = new ArrayList(this.f5085e.size());
        for (p8 p8Var : this.f5085e) {
            if (str.equalsIgnoreCase(p8Var.c())) {
                arrayList.add(p8Var);
            }
        }
        return arrayList;
    }

    public p8 b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        if (this.f5085e.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        while (!arrayList.isEmpty()) {
            p8 p8Var = (p8) arrayList.get(0);
            arrayList.remove(0);
            if (str.equalsIgnoreCase(p8Var.c())) {
                return p8Var;
            }
            arrayList.addAll(p8Var.b());
        }
        return null;
    }

    public p8 c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        for (p8 p8Var : this.f5085e) {
            if (str.equalsIgnoreCase(p8Var.c())) {
                return p8Var;
            }
        }
        return null;
    }

    private p8() {
        this.f5081a = null;
        this.f5082b = "";
        this.f5083c = Collections.EMPTY_MAP;
        this.f5084d = "";
        this.f5085e = Collections.EMPTY_LIST;
    }
}
