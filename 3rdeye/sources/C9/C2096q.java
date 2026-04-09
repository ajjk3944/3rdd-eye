package c9;

import java.util.Iterator;

/* compiled from: Sequences.kt */
/* renamed from: c9.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2096q implements x9.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18578a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18579b;

    public C2096q(Iterable iterable) {
        this.f18579b = iterable;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [h9.h, p9.p] */
    @Override // x9.g
    public final Iterator iterator() {
        switch (this.f18578a) {
            case 0:
                return ((Iterable) this.f18579b).iterator();
            default:
                ?? r02 = (h9.h) this.f18579b;
                x9.h hVar = new x9.h();
                hVar.f47845e = com.google.gson.internal.c.k(r02, hVar, hVar);
                return hVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2096q(p9.p pVar) {
        this.f18579b = (h9.h) pVar;
    }
}
