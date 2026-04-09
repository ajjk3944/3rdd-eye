package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class c8 {

    /* renamed from: f, reason: collision with root package name */
    public static final c8 f19177f = new c8();

    /* renamed from: a, reason: collision with root package name */
    private final c8 f19178a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19179b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f19180c;

    /* renamed from: d, reason: collision with root package name */
    protected String f19181d;

    /* renamed from: e, reason: collision with root package name */
    protected final List f19182e;

    public c8(String str, Map map, c8 c8Var) {
        this.f19178a = c8Var;
        this.f19179b = str;
        this.f19180c = Collections.unmodifiableMap(map);
        this.f19182e = new ArrayList();
    }

    public Map a() {
        return this.f19180c;
    }

    public List b() {
        return Collections.unmodifiableList(this.f19182e);
    }

    public String c() {
        return this.f19179b;
    }

    public String d() {
        return this.f19181d;
    }

    public String toString() {
        return "XmlNode{elementName='" + this.f19179b + "', text='" + this.f19181d + "', attributes=" + this.f19180c + '}';
    }

    public List a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        ArrayList arrayList = new ArrayList(this.f19182e.size());
        for (c8 c8Var : this.f19182e) {
            if (str.equalsIgnoreCase(c8Var.c())) {
                arrayList.add(c8Var);
            }
        }
        return arrayList;
    }

    public c8 b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        if (this.f19182e.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        while (!arrayList.isEmpty()) {
            c8 c8Var = (c8) arrayList.get(0);
            arrayList.remove(0);
            if (str.equalsIgnoreCase(c8Var.c())) {
                return c8Var;
            }
            arrayList.addAll(c8Var.b());
        }
        return null;
    }

    public c8 c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        }
        for (c8 c8Var : this.f19182e) {
            if (str.equalsIgnoreCase(c8Var.c())) {
                return c8Var;
            }
        }
        return null;
    }

    private c8() {
        this.f19178a = null;
        this.f19179b = "";
        this.f19180c = Collections.EMPTY_MAP;
        this.f19181d = "";
        this.f19182e = Collections.EMPTY_LIST;
    }
}
