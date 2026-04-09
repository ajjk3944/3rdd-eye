package com.google.gson.internal.bind;

import com.google.gson.j;
import com.google.gson.w;
import com.google.gson.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
class TypeAdapters$29 implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f20789a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f20790b;

    public TypeAdapters$29(Class cls, w wVar) {
        this.f20789a = cls;
        this.f20790b = wVar;
    }

    @Override // com.google.gson.x
    public final w a(j jVar, xf.a aVar) {
        if (aVar.f37087a == this.f20789a) {
            return this.f20790b;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f20789a.getName() + ",adapter=" + this.f20790b + "]";
    }
}
