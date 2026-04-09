package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class nj2 {

    /* renamed from: f, reason: collision with root package name */
    private int f30901f;

    /* renamed from: h, reason: collision with root package name */
    private int f30903h;

    /* renamed from: o, reason: collision with root package name */
    private float f30909o;

    /* renamed from: a, reason: collision with root package name */
    private String f30896a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f30897b = "";

    /* renamed from: c, reason: collision with root package name */
    private Set<String> f30898c = Collections.EMPTY_SET;

    /* renamed from: d, reason: collision with root package name */
    private String f30899d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f30900e = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f30902g = false;
    private boolean i = false;

    /* renamed from: j, reason: collision with root package name */
    private int f30904j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f30905k = -1;

    /* renamed from: l, reason: collision with root package name */
    private int f30906l = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f30907m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f30908n = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f30910p = -1;

    /* renamed from: q, reason: collision with root package name */
    private boolean f30911q = false;

    public final int a() {
        if (this.i) {
            return this.f30903h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public final boolean b() {
        return this.f30911q;
    }

    public final int c() {
        if (this.f30902g) {
            return this.f30901f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public final String d() {
        return this.f30900e;
    }

    public final float e() {
        return this.f30909o;
    }

    public final int f() {
        return this.f30908n;
    }

    public final int g() {
        return this.f30910p;
    }

    public final int h() {
        int i = this.f30906l;
        if (i == -1 && this.f30907m == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f30907m == 1 ? 2 : 0);
    }

    public final boolean i() {
        return this.i;
    }

    public final boolean j() {
        return this.f30902g;
    }

    public final boolean k() {
        return this.f30904j == 1;
    }

    public final boolean l() {
        return this.f30905k == 1;
    }

    public final void m() {
        this.f30906l = 1;
    }

    public final void n() {
        this.f30907m = 1;
    }

    public final void o() {
        this.f30905k = 1;
    }

    public final void b(int i) {
        this.f30901f = i;
        this.f30902g = true;
    }

    public final void d(int i) {
        this.f30910p = i;
    }

    public final void d(String str) {
        this.f30899d = str;
    }

    public final int a(String str, String str2, Set<String> set, String str3) {
        int i;
        if (this.f30896a.isEmpty() && this.f30897b.isEmpty() && this.f30898c.isEmpty() && this.f30899d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        String str4 = this.f30896a;
        if (str4.isEmpty()) {
            i = 0;
        } else {
            i = str4.equals(str) ? 1073741824 : -1;
        }
        String str5 = this.f30897b;
        if (!str5.isEmpty() && i != -1) {
            i = str5.equals(str2) ? i + 2 : -1;
        }
        String str6 = this.f30899d;
        if (!str6.isEmpty() && i != -1) {
            i = str6.equals(str3) ? i + 4 : -1;
        }
        if (i == -1 || !set.containsAll(this.f30898c)) {
            return 0;
        }
        return (this.f30898c.size() * 4) + i;
    }

    public final void b(String str) {
        this.f30896a = str;
    }

    public final void c(int i) {
        this.f30908n = i;
    }

    public final void c(String str) {
        this.f30897b = str;
    }

    public final void a(int i) {
        this.f30903h = i;
        this.i = true;
    }

    public final void a(boolean z10) {
        this.f30911q = z10;
    }

    public final void a(String str) {
        this.f30900e = xf.b(str);
    }

    public final void a(float f10) {
        this.f30909o = f10;
    }

    public final void a(String[] strArr) {
        this.f30898c = new HashSet(Arrays.asList(strArr));
    }
}
