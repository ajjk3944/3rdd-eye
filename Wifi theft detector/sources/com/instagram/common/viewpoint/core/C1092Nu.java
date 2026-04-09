package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Nu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1092Nu {
    public static byte[] A05;
    public static String[] A06 = {"SwW", "nKJOmWTx3LjNZvOp7YbBROgXIyGkfXUh", "cNvS8LZQYgXEdOP85dYAvAy4C3J", "ICxq6EmLG0dgZi7UJ5PBV2wBsvrmCfpb", "tKedy3gZYTLe", "bmz0vq", "hvIAQTYE0cdtFIL2", "tj9oqRvQS19ndgZTuA"};
    public C1220Sx A00;
    public EnumC1475bD A01 = EnumC1475bD.A05;
    public ArrayList<C1598dC> A02 = new ArrayList<>();
    public final NQ A03;
    public final InterfaceC1091Nt A04;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-35, 23, 35, 28, 27, -66, -29, -23, -38, -25, -29, -42, -31, -107, -70, -25, -25, -28, -25, -107, -89, -91, -91, -85, -107, -20, -34, -23, -35, -28, -22, -23, -107, -42, -107, -21, -42, -31, -34, -39, -107, -74, -39, -66, -29, -37, -28, -93, 21, 24, 19, 24, 21, 40, 21, 19, 22, 41, 34, 24, 32, 25, -29, -14, -21, -36, -31, -38, -30, -25, -40, -23, -38, -21, -38, -26, -20, 18, 23, 16, 24, 29, 20, 19, -16, 19, -13, 16, 35, 16, -15, 36, 29, 19, 27, 20, 63, 68, 74, 59, 72, 73, 74, 63, 74, 63, 55, 66};
    }

    static {
        A06();
    }

    public C1092Nu(C1814gi c1814gi, O8 o82, InterfaceC1091Nt interfaceC1091Nt, String str) {
        JSONObject dataObject = o82.A03();
        this.A03 = A01(c1814gi, o82, str, dataObject);
        this.A04 = interfaceC1091Nt;
    }

    private AdError A00(C1814gi c1814gi, AbstractC1979jd abstractC1979jd) {
        if (abstractC1979jd == null || abstractC1979jd.A2G().isEmpty()) {
            c1814gi.A08().ABC(A04(62, 3, 33), AbstractC1226Td.A0Z, new C1227Te(A04(5, 43, 20)));
            return AdError.internalError(2006);
        }
        return null;
    }

    public static NQ A01(C1814gi c1814gi, O8 o82, String str, JSONObject jSONObject) {
        NQ nqA00 = null;
        if (jSONObject.has(A04(65, 12, 24))) {
            try {
                nqA00 = C1973jT.A01(jSONObject, c1814gi, true);
                nqA00.A1Q(true);
                nqA00.A1N(A04(96, 12, 117));
            } catch (JSONException unused) {
            }
        }
        if (nqA00 == null) {
            nqA00 = C06917n.A00(jSONObject, c1814gi);
        }
        nqA00.A1M(str);
        C1246Tx c1246TxA01 = o82.A01();
        if (c1246TxA01 != null) {
            nqA00.A1I(c1246TxA01.A06());
        }
        return nqA00;
    }

    private C1220Sx A03(C1814gi c1814gi) {
        return this.A00 != null ? this.A00 : new C1220Sx(c1814gi);
    }

    /* JADX WARN: Failed to check method usage
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.MethodNode.getTopParentClass()" because "m" is null
    	at jadx.core.codegen.ClassGen.lambda$skipMethod$0(ClassGen.java:364)
    	at java.base/java.util.stream.ReferencePipeline$2$1.accept(Unknown Source)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
    	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
    	at java.base/java.util.stream.ReferencePipeline.collect(Unknown Source)
    	at jadx.core.codegen.ClassGen.skipMethod(ClassGen.java:365)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:327)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
    	at jadx.core.ProcessClass.process(ProcessClass.java:79)
    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
     */
    public static /* synthetic */ ArrayList A05(C1092Nu c1092Nu) {
        return c1092Nu.A02;
    }

    private void A08(C1814gi c1814gi, C06917n c06917n) {
        C1086No playableData = c06917n.A29().A0H().A07();
        A0B(playableData != null ? playableData.A0H() : EnumC1475bD.A05);
        C1959jC c1959jC = new C1959jC(this);
        C1220Sx c1220Sx = new C1220Sx(c1814gi);
        boolean z10 = C1264Up.A2H(c1814gi) && SN.A0A(c06917n.A1H());
        if (z10) {
            SN unifiedAssetsLoader = new SN(c1220Sx, c06917n.A1H(), c06917n.A10(), c06917n.A1D(), z10, new C1958jB(this));
            c1220Sx.A0e(new VI(c06917n.A2E(), c1814gi.A0A()));
            unifiedAssetsLoader.A0B();
            return;
        }
        O5.A02(c1814gi, c06917n, true, c1959jC);
    }

    private void A09(C1814gi c1814gi, EnumSet<CacheFlag> enumSet, AbstractC1979jd abstractC1979jd, int i10, InterfaceC1091Nt interfaceC1091Nt) {
        boolean isDSL = abstractC1979jd.A1g();
        C1220Sx c1220SxA03 = A03(c1814gi);
        c1220SxA03.A0e(new VI(abstractC1979jd.A2E(), c1814gi.A0A()));
        boolean z10 = C1264Up.A2H(c1814gi) && SN.A0A(abstractC1979jd.A1H());
        if (z10) {
            new SN(c1220SxA03, abstractC1979jd.A1H(), abstractC1979jd.A10(), abstractC1979jd.A1D(), z10, new C1962jF(this, c1814gi, isDSL, abstractC1979jd, interfaceC1091Nt)).A0B();
            return;
        }
        String strA04 = A04(96, 12, 117);
        if (isDSL) {
            C1216St c1216St = new C1216St(abstractC1979jd.A0x(), abstractC1979jd.A1D(), strA04);
            c1216St.A04 = true;
            c1216St.A03 = A04(0, 5, 78);
            c1220SxA03.A0Y(c1216St);
        }
        c1220SxA03.A0d(new C1218Sv(abstractC1979jd.A2C().A01(), C1651e4.A04, C1651e4.A04, abstractC1979jd.A1D(), A04(96, 12, 117)));
        boolean isUnifiedAssetsLoaderEnabled = enumSet.contains(CacheFlag.VIDEO);
        int i11 = 0;
        boolean zA30 = C1264Up.A30(c1814gi, C1741fX.A03());
        for (NR nr : abstractC1979jd.A2G()) {
            C1218Sv c1218Sv = new C1218Sv(nr.A0H().A08(), O1.A00(nr.A0H()), O1.A01(nr.A0H()), abstractC1979jd.A1D(), A04(96, 12, 117));
            if (i11 == 0) {
                c1220SxA03.A0c(c1218Sv);
            } else {
                c1220SxA03.A0d(c1218Sv);
            }
            Iterator<String> it = nr.A0K().A02().iterator();
            while (it.hasNext()) {
                c1220SxA03.A0d(new C1218Sv(it.next(), -1, -1, abstractC1979jd.A1D(), A04(96, 12, 117)));
            }
            if (isUnifiedAssetsLoaderEnabled && !TextUtils.isEmpty(nr.A0H().A09())) {
                C1216St c1216St2 = new C1216St(nr.A0H().A09(), abstractC1979jd.A1D(), A04(96, 12, 117), nr.A0H().A06());
                c1216St2.A04 = false;
                if (i11 == 0) {
                    if (isDSL && !zA30) {
                        c1220SxA03.A0Y(c1216St2);
                    } else {
                        c1220SxA03.A0b(c1216St2);
                    }
                } else if (isDSL && !zA30) {
                    c1220SxA03.A0Z(c1216St2);
                } else {
                    c1220SxA03.A0a(c1216St2);
                }
            }
            i11++;
        }
        if (abstractC1979jd.A1W() && !TextUtils.isEmpty(abstractC1979jd.A11())) {
            c1220SxA03.A0d(new C1218Sv(abstractC1979jd.A11(), C1128Pe.A0A, C1128Pe.A0A, abstractC1979jd.A1D(), A04(96, 12, 117)));
        }
        O0.A00(abstractC1979jd, c1220SxA03, strA04);
        c1220SxA03.A0X(new C1960jD(this, c1814gi, isDSL, abstractC1979jd, interfaceC1091Nt), new C1213Sq(abstractC1979jd.A1D(), strA04, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(C1814gi c1814gi, EnumSet<CacheFlag> enumSet, C1973jT c1973jT, AbstractC1979jd abstractC1979jd, int i10, InterfaceC1091Nt interfaceC1091Nt) {
        A09(c1814gi, enumSet, abstractC1979jd, i10, new C1964jH(this, c1814gi, abstractC1979jd, c1973jT, i10, interfaceC1091Nt, enumSet));
    }

    private void A0B(EnumC1475bD enumC1475bD) {
        this.A01 = enumC1475bD;
    }

    private boolean A0C(C1814gi c1814gi, AbstractC1979jd abstractC1979jd) {
        AdError adErrorA00 = A00(c1814gi, abstractC1979jd);
        if (adErrorA00 != null) {
            this.A04.ACo(adErrorA00);
            return true;
        }
        return false;
    }

    public final NQ A0D() {
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        return com.instagram.common.viewpoint.core.WK.A0C;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.instagram.common.viewpoint.core.WK A0E() {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.NQ r0 = r5.A03
            boolean r0 = r0.A1b()
            if (r0 == 0) goto Lb
            com.facebook.ads.redexgen.X.WK r0 = com.instagram.common.viewpoint.core.WK.A04
            return r0
        Lb:
            com.facebook.ads.redexgen.X.NQ r4 = r5.A03
            com.facebook.ads.redexgen.X.jd r4 = (com.instagram.common.viewpoint.core.AbstractC1979jd) r4
            boolean r0 = r4.A1g()
            if (r0 == 0) goto L18
            com.facebook.ads.redexgen.X.WK r0 = com.instagram.common.viewpoint.core.WK.A06
            return r0
        L18:
            java.util.List r0 = r4.A2G()
            int r1 = r0.size()
            r0 = 1
            if (r1 <= r0) goto L26
            com.facebook.ads.redexgen.X.WK r0 = com.instagram.common.viewpoint.core.WK.A0A
            return r0
        L26:
            com.facebook.ads.redexgen.X.NR r0 = r4.A29()
            com.facebook.ads.redexgen.X.NU r0 = r0.A0H()
            com.facebook.ads.redexgen.X.No r3 = r0.A07()
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C1092Nu.A06
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 14
            if (r1 == r0) goto L9f
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C1092Nu.A06
            java.lang.String r1 = "HO5lN2vl3hawZ3xdOTbB4PXxItmZOFKM"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "QabHGQsenJFHZf5mHftqzVXi6FXcwsQx"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L7a
            boolean r0 = r4.A1n()
            if (r0 != 0) goto L71
            boolean r3 = r4.A1u()
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C1092Nu.A06
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L74
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C1092Nu.A06
            java.lang.String r1 = "iV2CDA2M2IfUZLXvhnmiNr1pV0Sur2CQ"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "GDT4frbvCKvkZrCQcOaJTMqN9T6RIdn0"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L77
        L71:
            com.facebook.ads.redexgen.X.WK r0 = com.instagram.common.viewpoint.core.WK.A0E
            return r0
        L74:
            if (r3 == 0) goto L77
            goto L71
        L77:
            com.facebook.ads.redexgen.X.WK r0 = com.instagram.common.viewpoint.core.WK.A0C
            return r0
        L7a:
            boolean r3 = r5.A0L(r4)
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C1092Nu.A06
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L99
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C1092Nu.A06
            java.lang.String r1 = "iDu"
            r0 = 0
            r2[r0] = r1
            if (r3 == 0) goto L96
            com.facebook.ads.redexgen.X.WK r0 = com.instagram.common.viewpoint.core.WK.A0D
            return r0
        L96:
            com.facebook.ads.redexgen.X.WK r0 = com.instagram.common.viewpoint.core.WK.A0B
            return r0
        L99:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L9f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C1092Nu.A0E():com.facebook.ads.redexgen.X.WK");
    }

    public final EnumC1475bD A0F() {
        return this.A01;
    }

    public final String A0G() {
        if (this.A03.A1b()) {
            return ((C1973jT) this.A03).A2A();
        }
        return ((AbstractC1979jd) this.A03).A2E();
    }

    public final void A0H() {
        this.A04.AKX();
    }

    public final void A0I(Intent intent, RewardData rewardData, String str) {
        this.A03.A1K(rewardData);
        this.A03.A1O(str);
        if (A0D().A1b()) {
            intent.putExtra(A04(77, 19, 78), this.A03);
        }
        intent.putExtra(A04(48, 14, 83), this.A03);
    }

    public final void A0J(C1814gi c1814gi, EnumSet<CacheFlag> enumSet) {
        if (A0E() == WK.A04) {
            C1973jT c1973jT = (C1973jT) this.A03;
            AbstractC1979jd abstractC1979jdA26 = c1973jT.A26();
            if (A0C(c1814gi, abstractC1979jdA26) || abstractC1979jdA26 == null) {
                return;
            }
            this.A04.AHY();
            A0A(c1814gi, enumSet, c1973jT, abstractC1979jdA26, 0, this.A04);
            return;
        }
        AbstractC1979jd abstractC1979jd = (AbstractC1979jd) this.A03;
        if (A06[5].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "h3j4XQE4N9RDZ4AU6tvjsFYKX3e30HKG";
        strArr[3] = "lDhcJ7lgFtqhZjTb781X3zaoWDc2BWUc";
        if (A0C(c1814gi, abstractC1979jd)) {
            return;
        }
        this.A04.AHY();
        if (A0E() == WK.A0C) {
            C06917n c06917n = (C06917n) this.A03;
            String[] strArr2 = A06;
            if (strArr2[2].length() != strArr2[6].length()) {
                A06[7] = "0uVLF1bkkTEn2WeYm46QMmOd1A6";
                A08(c1814gi, c06917n);
                return;
            } else {
                A08(c1814gi, c06917n);
                return;
            }
        }
        A09(c1814gi, enumSet, (C06917n) this.A03, -1, this.A04);
    }

    public final boolean A0K() {
        return this.A03.A1U();
    }

    public final boolean A0L(AbstractC1979jd abstractC1979jd) {
        return !TextUtils.isEmpty(abstractC1979jd.A29().A0H().A09());
    }
}
