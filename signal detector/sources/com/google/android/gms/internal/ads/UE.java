package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class UE {

    /* renamed from: a, reason: collision with root package name */
    public static final C1037dG f11625a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0928bG f11626b;

    /* renamed from: c, reason: collision with root package name */
    public static final JF f11627c;

    /* renamed from: d, reason: collision with root package name */
    public static final HF f11628d;

    static {
        C1313iK c1313iKA = AbstractC2062wG.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f11625a = new C1037dG(SE.class, ME.f9847j);
        f11626b = new C0928bG(c1313iKA, ME.f9845g);
        f11627c = new JF(RE.class, ME.f9846h);
        f11628d = new HF(c1313iKA, ME.i);
    }

    public static EnumC1956uI a(C1952uE c1952uE) throws GeneralSecurityException {
        if (C1952uE.f17088k.equals(c1952uE)) {
            return EnumC1956uI.TINK;
        }
        if (C1952uE.f17089l.equals(c1952uE)) {
            return EnumC1956uI.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c1952uE)));
    }

    public static C1902tI b(SE se) throws GeneralSecurityException {
        byte[] bArrB = ((C1685pG) ZF.f12810b.h(se.f11161d)).f16155b.b();
        try {
            XK xk = XK.f12412a;
            int i = JK.f9277a;
            C0984cI c0984cID = C0984cI.D(bArrB, XK.f12413b);
            C1848sI c1848sID = C1902tI.D();
            String str = se.f11159b;
            c1848sID.b();
            ((C1902tI) c1848sID.f13551b).F(str);
            c1848sID.b();
            ((C1902tI) c1848sID.f13551b).G(c0984cID);
            return (C1902tI) c1848sID.d();
        } catch (C1636oL e6) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e6);
        }
    }

    public static SE c(C1902tI c1902tI, EnumC1956uI enumC1956uI) throws GeneralSecurityException {
        YD yd;
        C1952uE c1952uE = C1952uE.f17089l;
        Object obj = YD.f12616n;
        YD yd2 = YD.f12615m;
        YD yd3 = YD.f12614l;
        YD yd4 = YD.f12612j;
        YD yd5 = YD.f12613k;
        YD yd6 = YD.i;
        C0930bI c0930bIE = C0984cI.E();
        c0930bIE.g(c1902tI.B().A());
        c0930bIE.h(c1902tI.B().B());
        c0930bIE.i(EnumC1956uI.RAW);
        AbstractC1089eE abstractC1089eER = C1476lN.r(((C0984cI) c0930bIE.d()).b());
        if (abstractC1089eER instanceof EE) {
            yd = yd6;
        } else if (abstractC1089eER instanceof KE) {
            yd = yd5;
        } else if (abstractC1089eER instanceof C0927bF) {
            yd = yd4;
        } else if (abstractC1089eER instanceof C2060wE) {
            yd = yd3;
        } else if (abstractC1089eER instanceof BE) {
            yd = yd2;
        } else {
            if (!(abstractC1089eER instanceof HE)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(abstractC1089eER.toString()));
            }
            yd = obj;
        }
        int iOrdinal = enumC1956uI.ordinal();
        if (iOrdinal == 1) {
            c1952uE = C1952uE.f17088k;
        } else if (iOrdinal != 3) {
            int iA = enumC1956uI.a();
            throw new GeneralSecurityException(A.f.i(iA, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iA).length() + 34)));
        }
        String strA = c1902tI.A();
        AbstractC1521mE abstractC1521mE = (AbstractC1521mE) abstractC1089eER;
        if (strA == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        if (abstractC1521mE == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (abstractC1521mE.a()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((yd.equals(yd6) && (abstractC1521mE instanceof EE)) || ((yd.equals(yd5) && (abstractC1521mE instanceof KE)) || ((yd.equals(yd4) && (abstractC1521mE instanceof C0927bF)) || ((yd.equals(yd3) && (abstractC1521mE instanceof C2060wE)) || ((yd.equals(yd2) && (abstractC1521mE instanceof BE)) || (yd.equals(obj) && (abstractC1521mE instanceof HE))))))) {
            return new SE(c1952uE, strA, yd, abstractC1521mE);
        }
        String str = yd.f12618b;
        String strValueOf = String.valueOf(abstractC1521mE);
        StringBuilder sb = new StringBuilder(strValueOf.length() + str.length() + 67 + 1);
        A.f.w(sb, "Cannot use parsing strategy ", str, " when new keys are picked according to ", strValueOf);
        sb.append(".");
        throw new GeneralSecurityException(sb.toString());
    }
}
