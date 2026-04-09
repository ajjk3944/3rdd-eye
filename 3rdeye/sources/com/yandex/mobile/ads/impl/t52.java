package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.qt0;

/* loaded from: classes3.dex */
public final class t52 {

    /* renamed from: a, reason: collision with root package name */
    public final int f33450a;

    /* renamed from: b, reason: collision with root package name */
    public final uo1[] f33451b;

    /* renamed from: c, reason: collision with root package name */
    public final c70[] f33452c;

    /* renamed from: d, reason: collision with root package name */
    public final o62 f33453d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f33454e;

    public t52(uo1[] uo1VarArr, c70[] c70VarArr, o62 o62Var, qt0.a aVar) {
        this.f33451b = uo1VarArr;
        this.f33452c = (c70[]) c70VarArr.clone();
        this.f33453d = o62Var;
        this.f33454e = aVar;
        this.f33450a = uo1VarArr.length;
    }

    public final boolean a(int i) {
        return this.f33451b[i] != null;
    }
}
