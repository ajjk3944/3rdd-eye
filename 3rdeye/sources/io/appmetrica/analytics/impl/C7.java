package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes3.dex */
public final class C7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C5100ye f39229a;

    public C7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final G7 fromModel(B7 b72) {
        G7 g72 = new G7();
        Boolean bool = b72.f39147a;
        if (bool != null) {
            g72.f39487a = this.f39229a.fromModel(bool).intValue();
        }
        Double d10 = b72.f39149c;
        if (d10 != null) {
            g72.f39489c = d10.doubleValue();
        }
        Double d11 = b72.f39148b;
        if (d11 != null) {
            g72.f39488b = d11.doubleValue();
        }
        Long l5 = b72.f39154h;
        if (l5 != null) {
            g72.f39494h = l5.longValue();
        }
        Integer num = b72.f39152f;
        if (num != null) {
            g72.f39492f = num.intValue();
        }
        Integer num2 = b72.f39151e;
        if (num2 != null) {
            g72.f39491e = num2.intValue();
        }
        Integer num3 = b72.f39153g;
        if (num3 != null) {
            g72.f39493g = num3.intValue();
        }
        Integer num4 = b72.f39150d;
        if (num4 != null) {
            g72.f39490d = num4.intValue();
        }
        String str = b72.i;
        if (str != null) {
            g72.i = str;
        }
        String str2 = b72.f39155j;
        if (str2 != null) {
            g72.f39495j = str2;
        }
        return g72;
    }

    public C7(C5100ye c5100ye) {
        this.f39229a = c5100ye;
    }

    public /* synthetic */ C7(C5100ye c5100ye, int i, kotlin.jvm.internal.g gVar) {
        this((i & 1) != 0 ? new C5100ye() : c5100ye);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final B7 toModel(G7 g72) {
        if (g72 == null) {
            return new B7(null, null, null, null, null, null, null, null, null, null);
        }
        G7 g73 = new G7();
        Boolean boolA = this.f39229a.a(g72.f39487a);
        double d10 = g72.f39489c;
        Double dValueOf = Double.valueOf(d10);
        if (d10 == g73.f39489c) {
            dValueOf = null;
        }
        double d11 = g72.f39488b;
        Double dValueOf2 = !(d11 == g73.f39488b) ? Double.valueOf(d11) : null;
        long j4 = g72.f39494h;
        Long lValueOf = j4 != g73.f39494h ? Long.valueOf(j4) : null;
        int i = g72.f39492f;
        Integer numValueOf = i != g73.f39492f ? Integer.valueOf(i) : null;
        int i10 = g72.f39491e;
        Integer numValueOf2 = i10 != g73.f39491e ? Integer.valueOf(i10) : null;
        int i11 = g72.f39493g;
        Integer numValueOf3 = i11 != g73.f39493g ? Integer.valueOf(i11) : null;
        int i12 = g72.f39490d;
        Integer numValueOf4 = i12 != g73.f39490d ? Integer.valueOf(i12) : null;
        String str = g72.i;
        String str2 = !kotlin.jvm.internal.l.b(str, g73.i) ? str : null;
        String str3 = g72.f39495j;
        return new B7(boolA, dValueOf2, dValueOf, numValueOf4, numValueOf2, numValueOf, numValueOf3, lValueOf, str2, !kotlin.jvm.internal.l.b(str3, g73.f39495j) ? str3 : null);
    }
}
