package lq;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class p implements h, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f15574g = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "d");

    /* renamed from: a, reason: collision with root package name */
    public volatile ar.a f15575a;

    /* renamed from: d, reason: collision with root package name */
    public volatile Object f15576d;

    @Override // lq.h
    public final Object getValue() {
        Object obj = this.f15576d;
        y yVar = y.f15589a;
        if (obj != yVar) {
            return obj;
        }
        ar.a aVar = this.f15575a;
        if (aVar != null) {
            Object objC = aVar.c();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15574g;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, yVar, objC)) {
                if (atomicReferenceFieldUpdater.get(this) != yVar) {
                }
            }
            this.f15575a = null;
            return objC;
        }
        return this.f15576d;
    }

    public final String toString() {
        return this.f15576d != y.f15589a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
