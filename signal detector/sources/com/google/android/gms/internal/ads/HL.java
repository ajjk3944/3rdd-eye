package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class HL extends AbstractC1896tC {

    /* renamed from: b, reason: collision with root package name */
    public final C1201gG f8901b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC1896tC f8902c;

    public HL(IL il) {
        super(1);
        this.f8901b = new C1201gG(il);
        this.f8902c = b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1896tC
    public final byte a() {
        AbstractC1896tC abstractC1896tC = this.f8902c;
        if (abstractC1896tC == null) {
            throw new NoSuchElementException();
        }
        byte bA = abstractC1896tC.a();
        if (!this.f8902c.hasNext()) {
            this.f8902c = b();
        }
        return bA;
    }

    public final LK b() {
        C1201gG c1201gG = this.f8901b;
        if (c1201gG.hasNext()) {
            return new LK(c1201gG.a());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8902c != null;
    }
}
