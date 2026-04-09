package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class p8 {

    /* renamed from: f, reason: collision with root package name */
    public static final p8 f7264f = new p8();

    /* renamed from: a, reason: collision with root package name */
    private final p8 f7265a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7266b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f7267c;

    /* renamed from: d, reason: collision with root package name */
    protected String f7268d;

    /* renamed from: e, reason: collision with root package name */
    protected final List f7269e;

    public p8(String str, Map map, p8 p8Var) {
        this.f7265a = p8Var;
        this.f7266b = str;
        this.f7267c = Collections.unmodifiableMap(map);
        this.f7269e = new ArrayList();
    }

    public Map a() {
        return this.f7267c;
    }

    public List b() {
        return Collections.unmodifiableList(this.f7269e);
    }

    public String c() {
        return this.f7266b;
    }

    public String d() {
        return this.f7268d;
    }

    public String toString() {
        return "XmlNode{elementName='" + this.f7266b + "', text='" + this.f7268d + "', attributes=" + this.f7267c + '}';
    }

    public List a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        ArrayList arrayList = new ArrayList(this.f7269e.size());
        for (p8 p8Var : this.f7269e) {
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
        if (this.f7269e.size() <= 0) {
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
        for (p8 p8Var : this.f7269e) {
            if (str.equalsIgnoreCase(p8Var.c())) {
                return p8Var;
            }
        }
        return null;
    }

    private p8() {
        this.f7265a = null;
        this.f7266b = "";
        this.f7267c = Collections.EMPTY_MAP;
        this.f7268d = "";
        this.f7269e = Collections.EMPTY_LIST;
    }
}
