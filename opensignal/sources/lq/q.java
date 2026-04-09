package lq;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class q implements h, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public ar.a f15577a;

    /* renamed from: d, reason: collision with root package name */
    public volatile Object f15578d;

    /* renamed from: g, reason: collision with root package name */
    public final Object f15579g;

    public q(ar.a aVar) {
        br.l.e(aVar, "initializer");
        this.f15577a = aVar;
        this.f15578d = y.f15589a;
        this.f15579g = this;
    }

    public final boolean a() {
        return this.f15578d != y.f15589a;
    }

    @Override // lq.h
    public final Object getValue() {
        Object objC;
        Object obj = this.f15578d;
        y yVar = y.f15589a;
        if (obj != yVar) {
            return obj;
        }
        synchronized (this.f15579g) {
            objC = this.f15578d;
            if (objC == yVar) {
                ar.a aVar = this.f15577a;
                br.l.b(aVar);
                objC = aVar.c();
                this.f15578d = objC;
                this.f15577a = null;
            }
        }
        return objC;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
