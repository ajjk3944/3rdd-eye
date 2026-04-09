package com.google.gson.internal.bind;

import com.google.gson.j;
import com.google.gson.w;
import com.google.gson.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
class TypeAdapters$30 implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f20791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f20792b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f20793c;

    public TypeAdapters$30(Class cls, Class cls2, w wVar) {
        this.f20791a = cls;
        this.f20792b = cls2;
        this.f20793c = wVar;
    }

    @Override // com.google.gson.x
    public final w a(j jVar, xf.a aVar) {
        Class cls = aVar.f37087a;
        if (cls == this.f20791a || cls == this.f20792b) {
            return this.f20793c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f20792b.getName() + "+" + this.f20791a.getName() + ",adapter=" + this.f20793c + "]";
    }
}
