package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ur implements bb.z {

    /* renamed from: a, reason: collision with root package name */
    public final Set f17295a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17296b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17297c;

    /* renamed from: d, reason: collision with root package name */
    public final qm f17298d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f17300f;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f17299e = new ArrayList();
    public final HashMap g = new HashMap();

    public ur(HashSet hashSet, boolean z3, int i4, qm qmVar, List list, boolean z10) {
        this.f17295a = hashSet;
        this.f17296b = z3;
        this.f17297c = i4;
        this.f17298d = qmVar;
        this.f17300f = z10;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.startsWith("custom:")) {
                    String[] strArrSplit = str.split(":", 3);
                    if (strArrSplit.length == 3) {
                        String str2 = strArrSplit[2];
                        if ("true".equals(str2)) {
                            this.g.put(strArrSplit[1], Boolean.TRUE);
                        } else if ("false".equals(str2)) {
                            this.g.put(strArrSplit[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f17299e.add(str);
                }
            }
        }
    }

    @Override // bb.f
    public final int a() {
        return this.f17297c;
    }

    @Override // bb.f
    public final boolean b() {
        return this.f17300f;
    }

    @Override // bb.f
    public final Set c() {
        return this.f17295a;
    }

    @Override // bb.f
    public final boolean isTesting() {
        return this.f17296b;
    }
}
