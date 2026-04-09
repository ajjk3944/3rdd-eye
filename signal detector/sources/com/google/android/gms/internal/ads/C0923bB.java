package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0923bB implements ZA {

    /* renamed from: a, reason: collision with root package name */
    public final C1086eB f13326a = new C1086eB();

    /* renamed from: b, reason: collision with root package name */
    public volatile ZA f13327b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13328c;

    public C0923bB(ZA za) {
        this.f13327b = za;
    }

    @Override // com.google.android.gms.internal.ads.ZA
    public final Object a() {
        ZA za = this.f13327b;
        C1285ht c1285ht = C1285ht.i;
        if (za != c1285ht) {
            synchronized (this.f13326a) {
                try {
                    if (this.f13327b != c1285ht) {
                        Object objA = this.f13327b.a();
                        this.f13328c = objA;
                        this.f13327b = c1285ht;
                        return objA;
                    }
                } finally {
                }
            }
        }
        return this.f13328c;
    }

    public final String toString() {
        Object objN = this.f13327b;
        if (objN == C1285ht.i) {
            String strValueOf = String.valueOf(this.f13328c);
            objN = AbstractC1135f5.n(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        }
        String strValueOf2 = String.valueOf(objN);
        return AbstractC1135f5.n(new StringBuilder(strValueOf2.length() + 19), "Suppliers.memoize(", strValueOf2, ")");
    }
}
