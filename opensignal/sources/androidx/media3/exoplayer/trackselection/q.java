package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.b1;
import oe.h0;
import oe.s0;

/* loaded from: classes.dex */
public final class q extends s implements Comparable {
    public final boolean B;
    public final boolean D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final boolean I;

    /* renamed from: x, reason: collision with root package name */
    public final int f1918x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f1919y;

    public q(int i10, b1 b1Var, int i11, l lVar, int i12, String str) {
        int formatLanguageScore;
        super(i10, b1Var, i11);
        int i13 = 0;
        this.f1919y = DefaultTrackSelector.isSupported(i12, false);
        int i14 = this.f1923r.f1787r;
        int i15 = lVar.Q;
        h0 h0Var = lVar.O;
        int i16 = i14 & (~i15);
        this.B = (i16 & 1) != 0;
        this.D = (i16 & 2) != 0;
        h0 h0VarP = h0Var.isEmpty() ? h0.p("") : h0Var;
        int i17 = 0;
        while (true) {
            if (i17 >= h0VarP.size()) {
                i17 = Integer.MAX_VALUE;
                formatLanguageScore = 0;
                break;
            } else {
                formatLanguageScore = DefaultTrackSelector.getFormatLanguageScore(this.f1923r, (String) h0VarP.get(i17), lVar.R);
                if (formatLanguageScore > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.E = i17;
        this.F = formatLanguageScore;
        int roleFlagMatchScore = DefaultTrackSelector.getRoleFlagMatchScore(this.f1923r.f1788x, lVar.P);
        this.G = roleFlagMatchScore;
        this.I = (this.f1923r.f1788x & 1088) != 0;
        int formatLanguageScore2 = DefaultTrackSelector.getFormatLanguageScore(this.f1923r, str, DefaultTrackSelector.normalizeUndeterminedLanguageToNull(str) == null);
        this.H = formatLanguageScore2;
        boolean z10 = formatLanguageScore > 0 || (h0Var.isEmpty() && roleFlagMatchScore > 0) || this.B || (this.D && formatLanguageScore2 > 0);
        if (DefaultTrackSelector.isSupported(i12, lVar.f1908g0) && z10) {
            i13 = 1;
        }
        this.f1918x = i13;
    }

    @Override // androidx.media3.exoplayer.trackselection.s
    public final int a() {
        return this.f1918x;
    }

    @Override // androidx.media3.exoplayer.trackselection.s
    public final /* bridge */ /* synthetic */ boolean b(s sVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(q qVar) {
        oe.a0 a0VarC = oe.a0.f19295a.c(this.f1919y, qVar.f1919y);
        Integer numValueOf = Integer.valueOf(this.E);
        Integer numValueOf2 = Integer.valueOf(qVar.E);
        s0 s0Var = s0.f19372d;
        s0 s0Var2 = s0.f19373g;
        oe.a0 a0VarB = a0VarC.b(numValueOf, numValueOf2, s0Var2);
        int i10 = qVar.F;
        int i11 = this.F;
        oe.a0 a0VarA = a0VarB.a(i11, i10);
        int i12 = qVar.G;
        int i13 = this.G;
        oe.a0 a0VarC2 = a0VarA.a(i13, i12).c(this.B, qVar.B);
        Boolean boolValueOf = Boolean.valueOf(this.D);
        Boolean boolValueOf2 = Boolean.valueOf(qVar.D);
        if (i11 != 0) {
            s0Var = s0Var2;
        }
        oe.a0 a0VarA2 = a0VarC2.b(boolValueOf, boolValueOf2, s0Var).a(this.H, qVar.H);
        if (i13 == 0) {
            a0VarA2 = a0VarA2.d(this.I, qVar.I);
        }
        return a0VarA2.e();
    }
}
