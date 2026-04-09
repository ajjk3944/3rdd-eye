package lq;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class c0 implements h, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public ar.a f15563a;

    /* renamed from: d, reason: collision with root package name */
    public Object f15564d;

    @Override // lq.h
    public final Object getValue() {
        if (this.f15564d == y.f15589a) {
            ar.a aVar = this.f15563a;
            br.l.b(aVar);
            this.f15564d = aVar.c();
            this.f15563a = null;
        }
        return this.f15564d;
    }

    public final String toString() {
        return this.f15564d != y.f15589a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
