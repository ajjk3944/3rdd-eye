package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.uO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1962uO extends AbstractC1211gQ {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17116c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Object f17117d;

    public C1962uO(AbstractC1353j8 abstractC1353j8, C1241h2 c1241h2) {
        super(abstractC1353j8);
        this.f17117d = c1241h2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1211gQ, com.google.android.gms.internal.ads.AbstractC1353j8
    public U7 b(int i, U7 u7, long j6) {
        switch (this.f17116c) {
            case 1:
                this.f14270b.b(i, u7, j6);
                C1241h2 c1241h2 = (C1241h2) this.f17117d;
                u7.f11604b = c1241h2;
                N0 n02 = c1241h2.f14415b;
                return u7;
            default:
                return super.b(i, u7, j6);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1211gQ, com.google.android.gms.internal.ads.AbstractC1353j8
    public I7 d(int i, I7 i7, boolean z6) {
        switch (this.f17116c) {
            case 0:
                AbstractC1353j8 abstractC1353j8 = this.f14270b;
                I7 i7D = abstractC1353j8.d(i, i7, z6);
                if (abstractC1353j8.b(i7D.f9072c, (U7) this.f17117d, 0L).b()) {
                    Object obj = i7.f9070a;
                    Object obj2 = i7.f9071b;
                    int i3 = i7.f9072c;
                    long j6 = i7.f9073d;
                    C2023ve c2023ve = C2023ve.f17312b;
                    i7D.a(obj, obj2, i3, j6, true);
                } else {
                    i7D.f9074e = true;
                }
                return i7D;
            default:
                return super.d(i, i7, z6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1962uO(C2016vO c2016vO, AbstractC1353j8 abstractC1353j8) {
        super(abstractC1353j8);
        Objects.requireNonNull(c2016vO);
        this.f17117d = new U7();
    }
}
