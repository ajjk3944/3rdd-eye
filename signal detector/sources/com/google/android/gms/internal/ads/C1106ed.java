package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.ed, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1106ed implements w2.v {

    /* renamed from: a, reason: collision with root package name */
    public final Set f13909a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13910b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13911c;

    /* renamed from: d, reason: collision with root package name */
    public final C0499Fa f13912d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13914f;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f13913e = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f13915g = new HashMap();

    public C1106ed(HashSet hashSet, boolean z6, int i, C0499Fa c0499Fa, List list, boolean z7) {
        this.f13909a = hashSet;
        this.f13910b = z6;
        this.f13911c = i;
        this.f13912d = c0499Fa;
        this.f13914f = z7;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.startsWith("custom:")) {
                    String[] strArrSplit = str.split(":", 3);
                    if (strArrSplit.length == 3) {
                        String str2 = strArrSplit[2];
                        if ("true".equals(str2)) {
                            this.f13915g.put(strArrSplit[1], Boolean.TRUE);
                        } else if ("false".equals(str2)) {
                            this.f13915g.put(strArrSplit[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f13913e.add(str);
                }
            }
        }
    }

    @Override // w2.f
    public final int a() {
        return this.f13911c;
    }

    @Override // w2.f
    public final boolean b() {
        return this.f13914f;
    }

    @Override // w2.f
    public final boolean c() {
        return this.f13910b;
    }

    @Override // w2.f
    public final Set d() {
        return this.f13909a;
    }
}
