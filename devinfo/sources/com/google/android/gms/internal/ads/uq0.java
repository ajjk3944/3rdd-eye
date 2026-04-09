package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class uq0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f17292b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17293c;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f17291a = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final ir0 f17294d = new ir0();

    public uq0(int i4, int i10) {
        this.f17292b = i4;
        this.f17293c = i10;
    }

    public final void a() {
        while (true) {
            LinkedList linkedList = this.f17291a;
            if (linkedList.isEmpty()) {
                return;
            }
            ar0 ar0Var = (ar0) linkedList.getFirst();
            ua.j.C.f35267k.getClass();
            if (System.currentTimeMillis() - ar0Var.f9393d < this.f17293c) {
                return;
            }
            ir0 ir0Var = this.f17294d;
            ir0Var.f12426f++;
            ir0Var.f12422b.f11963b++;
            linkedList.remove();
        }
    }
}
