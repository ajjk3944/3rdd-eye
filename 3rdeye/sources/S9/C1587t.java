package S9;

import R9.AbstractC1564a;

/* compiled from: StreamingJsonDecoder.kt */
/* renamed from: S9.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1587t extends I9.g {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1569a f12106b;

    /* renamed from: c, reason: collision with root package name */
    public final T9.a f12107c;

    public C1587t(AbstractC1569a abstractC1569a, AbstractC1564a json) {
        kotlin.jvm.internal.l.f(json, "json");
        this.f12106b = abstractC1569a;
        this.f12107c = json.f11782b;
    }

    @Override // I9.g, P9.d
    public final short E() {
        b9.y yVar;
        AbstractC1569a abstractC1569a = this.f12106b;
        String strM = abstractC1569a.m();
        try {
            kotlin.jvm.internal.l.f(strM, "<this>");
            b9.t tVarC = T1.B.C(strM);
            if (tVarC != null) {
                int i = tVarC.f18100b;
                yVar = Integer.compare(Integer.MIN_VALUE ^ i, -2147418113) > 0 ? null : new b9.y((short) i);
            }
            if (yVar != null) {
                return yVar.f18109b;
            }
            y9.m.N(strM);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC1569a.s(abstractC1569a, androidx.work.s.e("Failed to parse type 'UShort' for input '", strM, '\''), 0, 6);
            throw null;
        }
    }

    @Override // P9.d, P9.b
    public final I9.g a() {
        return this.f12107c;
    }

    @Override // I9.g, P9.d
    public final int k() {
        AbstractC1569a abstractC1569a = this.f12106b;
        String strM = abstractC1569a.m();
        try {
            kotlin.jvm.internal.l.f(strM, "<this>");
            b9.t tVarC = T1.B.C(strM);
            if (tVarC != null) {
                return tVarC.f18100b;
            }
            y9.m.N(strM);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC1569a.s(abstractC1569a, androidx.work.s.e("Failed to parse type 'UInt' for input '", strM, '\''), 0, 6);
            throw null;
        }
    }

    @Override // I9.g, P9.d
    public final long m() {
        AbstractC1569a abstractC1569a = this.f12106b;
        String strM = abstractC1569a.m();
        try {
            kotlin.jvm.internal.l.f(strM, "<this>");
            b9.v vVarD = T1.B.D(strM);
            if (vVarD != null) {
                return vVarD.f18104b;
            }
            y9.m.N(strM);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC1569a.s(abstractC1569a, androidx.work.s.e("Failed to parse type 'ULong' for input '", strM, '\''), 0, 6);
            throw null;
        }
    }

    @Override // P9.b
    public final int x(O9.e descriptor) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // I9.g, P9.d
    public final byte z() {
        b9.r rVar;
        AbstractC1569a abstractC1569a = this.f12106b;
        String strM = abstractC1569a.m();
        try {
            kotlin.jvm.internal.l.f(strM, "<this>");
            b9.t tVarC = T1.B.C(strM);
            if (tVarC != null) {
                int i = tVarC.f18100b;
                rVar = Integer.compare(Integer.MIN_VALUE ^ i, -2147483393) > 0 ? null : new b9.r((byte) i);
            }
            if (rVar != null) {
                return rVar.f18096b;
            }
            y9.m.N(strM);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC1569a.s(abstractC1569a, androidx.work.s.e("Failed to parse type 'UByte' for input '", strM, '\''), 0, 6);
            throw null;
        }
    }
}
