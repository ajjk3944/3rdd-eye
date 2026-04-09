package pa;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final b f57816a;

    /* renamed from: b, reason: collision with root package name */
    private final b f57817b;

    public c(b regular, b bold) {
        AbstractC6492s.i(regular, "regular");
        AbstractC6492s.i(bold, "bold");
        this.f57816a = regular;
        this.f57817b = bold;
    }

    public final b a() {
        return this.f57817b;
    }

    public final b b() {
        return this.f57816a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC6492s.d(this.f57816a, cVar.f57816a) && AbstractC6492s.d(this.f57817b, cVar.f57817b);
    }

    public int hashCode() {
        return (this.f57816a.hashCode() * 31) + this.f57817b.hashCode();
    }

    public String toString() {
        return "UiTypography(regular=" + this.f57816a + ", bold=" + this.f57817b + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ c(pa.b r68, pa.b r69, int r70, kotlin.jvm.internal.DefaultConstructorMarker r71) {
        /*
            r67 = this;
            r0 = r70 & 1
            if (r0 == 0) goto L14
            pa.b r0 = new pa.b
            r8 = 63
            r9 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L16
        L14:
            r0 = r68
        L16:
            r1 = r70 & 2
            if (r1 == 0) goto Lcd
            pa.b r1 = new pa.b
            L0.U r2 = r0.e()
            Q0.A$a r34 = Q0.A.f18971b
            Q0.A r7 = r34.b()
            r32 = 16777211(0xfffffb, float:2.350988E-38)
            r33 = 0
            r3 = 0
            r5 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            L0.U r3 = L0.U.c(r2, r3, r5, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31, r32, r33)
            L0.U r35 = r0.d()
            Q0.A r40 = r34.b()
            r65 = 16777211(0xfffffb, float:2.350988E-38)
            r66 = 0
            r36 = 0
            r38 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            L0.U r4 = L0.U.c(r35, r36, r38, r40, r41, r42, r43, r44, r45, r47, r48, r49, r50, r52, r53, r54, r55, r56, r57, r59, r60, r61, r62, r63, r64, r65, r66)
            L0.U r35 = r0.c()
            Q0.A r40 = r34.b()
            L0.U r5 = L0.U.c(r35, r36, r38, r40, r41, r42, r43, r44, r45, r47, r48, r49, r50, r52, r53, r54, r55, r56, r57, r59, r60, r61, r62, r63, r64, r65, r66)
            L0.U r35 = r0.b()
            Q0.A r40 = r34.b()
            L0.U r6 = L0.U.c(r35, r36, r38, r40, r41, r42, r43, r44, r45, r47, r48, r49, r50, r52, r53, r54, r55, r56, r57, r59, r60, r61, r62, r63, r64, r65, r66)
            L0.U r35 = r0.a()
            Q0.A r40 = r34.b()
            L0.U r7 = L0.U.c(r35, r36, r38, r40, r41, r42, r43, r44, r45, r47, r48, r49, r50, r52, r53, r54, r55, r56, r57, r59, r60, r61, r62, r63, r64, r65, r66)
            L0.U r35 = r0.f()
            Q0.A r40 = r34.b()
            L0.U r8 = L0.U.c(r35, r36, r38, r40, r41, r42, r43, r44, r45, r47, r48, r49, r50, r52, r53, r54, r55, r56, r57, r59, r60, r61, r62, r63, r64, r65, r66)
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r2 = r67
            goto Ld1
        Lcd:
            r2 = r67
            r1 = r69
        Ld1:
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.c.<init>(pa.b, pa.b, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
