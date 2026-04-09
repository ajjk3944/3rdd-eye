package androidx.media3.exoplayer.trackselection;

import a5.d0;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.media3.common.b1;
import java.util.Locale;
import oe.h0;
import oe.s0;
import oe.t0;

/* loaded from: classes.dex */
public final class i extends s implements Comparable {
    public final String B;
    public final l D;
    public final boolean E;
    public final int F;
    public final int G;
    public final int H;
    public final boolean I;
    public final int J;
    public final int K;
    public final boolean L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final boolean Q;
    public final boolean R;

    /* renamed from: x, reason: collision with root package name */
    public final int f1897x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f1898y;

    public i(int i10, b1 b1Var, int i11, l lVar, int i12, boolean z10, f fVar) {
        h0 h0Var;
        int i13;
        int formatLanguageScore;
        String[] strArrSplit;
        int formatLanguageScore2;
        super(i10, b1Var, i11);
        this.D = lVar;
        this.B = DefaultTrackSelector.normalizeUndeterminedLanguageToNull(this.f1923r.f1786g);
        int i14 = 0;
        this.E = DefaultTrackSelector.isSupported(i12, false);
        int i15 = 0;
        while (true) {
            h0 h0Var2 = lVar.J;
            h0Var = lVar.N;
            i13 = Integer.MAX_VALUE;
            if (i15 >= h0Var2.size()) {
                formatLanguageScore = 0;
                i15 = Integer.MAX_VALUE;
                break;
            } else {
                formatLanguageScore = DefaultTrackSelector.getFormatLanguageScore(this.f1923r, (String) lVar.J.get(i15), false);
                if (formatLanguageScore > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.G = i15;
        this.F = formatLanguageScore;
        this.H = DefaultTrackSelector.getRoleFlagMatchScore(this.f1923r.f1788x, lVar.K);
        androidx.media3.common.r rVar = this.f1923r;
        int i16 = rVar.f1788x;
        this.I = i16 == 0 || (i16 & 1) != 0;
        this.L = (rVar.f1787r & 1) != 0;
        int i17 = rVar.U;
        this.M = i17;
        this.N = rVar.V;
        int i18 = rVar.D;
        this.O = i18;
        this.f1898y = (i18 == -1 || i18 <= lVar.M) && (i17 == -1 || i17 <= lVar.L) && fVar.f1890a.isAudioFormatWithinAudioChannelCountConstraints(rVar);
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i19 = d0.f105a;
        if (i19 >= 24) {
            strArrSplit = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            Locale locale = configuration.locale;
            strArrSplit = new String[]{i19 >= 21 ? locale.toLanguageTag() : locale.toString()};
        }
        for (int i20 = 0; i20 < strArrSplit.length; i20++) {
            strArrSplit[i20] = d0.H(strArrSplit[i20]);
        }
        int i21 = 0;
        while (true) {
            if (i21 >= strArrSplit.length) {
                formatLanguageScore2 = 0;
                i21 = Integer.MAX_VALUE;
                break;
            } else {
                formatLanguageScore2 = DefaultTrackSelector.getFormatLanguageScore(this.f1923r, strArrSplit[i21], false);
                if (formatLanguageScore2 > 0) {
                    break;
                } else {
                    i21++;
                }
            }
        }
        this.J = i21;
        this.K = formatLanguageScore2;
        int i22 = 0;
        while (true) {
            if (i22 >= h0Var.size()) {
                break;
            }
            String str = this.f1923r.H;
            if (str != null && str.equals(h0Var.get(i22))) {
                i13 = i22;
                break;
            }
            i22++;
        }
        this.P = i13;
        this.Q = (i12 & 384) == 128;
        this.R = (i12 & 64) == 64;
        boolean z11 = this.f1898y;
        l lVar2 = this.D;
        if (DefaultTrackSelector.isSupported(i12, lVar2.f1908g0) && (z11 || lVar2.f1902a0)) {
            i14 = (!DefaultTrackSelector.isSupported(i12, false) || !z11 || this.f1923r.D == -1 || lVar2.T || lVar2.S || (!lVar2.f1910i0 && z10)) ? 1 : 2;
        }
        this.f1897x = i14;
    }

    @Override // androidx.media3.exoplayer.trackselection.s
    public final int a() {
        return this.f1897x;
    }

    @Override // androidx.media3.exoplayer.trackselection.s
    public final boolean b(s sVar) {
        int i10;
        String str;
        int i11;
        i iVar = (i) sVar;
        androidx.media3.common.r rVar = iVar.f1923r;
        l lVar = this.D;
        boolean z10 = lVar.f1905d0;
        androidx.media3.common.r rVar2 = this.f1923r;
        if (!z10 && ((i11 = rVar2.U) == -1 || i11 != rVar.U)) {
            return false;
        }
        if (!lVar.f1903b0 && ((str = rVar2.H) == null || !TextUtils.equals(str, rVar.H))) {
            return false;
        }
        if (!lVar.f1904c0 && ((i10 = rVar2.V) == -1 || i10 != rVar.V)) {
            return false;
        }
        if (lVar.f1906e0) {
            return true;
        }
        return this.Q == iVar.Q && this.R == iVar.R;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(i iVar) {
        boolean z10 = this.E;
        boolean z11 = this.f1898y;
        t0 t0VarB = (z11 && z10) ? DefaultTrackSelector.FORMAT_VALUE_ORDERING : DefaultTrackSelector.FORMAT_VALUE_ORDERING.b();
        boolean z12 = iVar.E;
        int i10 = iVar.O;
        oe.a0 a0VarC = oe.a0.f19295a.c(z10, z12);
        Integer numValueOf = Integer.valueOf(this.G);
        Integer numValueOf2 = Integer.valueOf(iVar.G);
        s0 s0Var = s0.f19373g;
        oe.a0 a0VarB = a0VarC.b(numValueOf, numValueOf2, s0Var).a(this.F, iVar.F).a(this.H, iVar.H).c(this.L, iVar.L).c(this.I, iVar.I).b(Integer.valueOf(this.J), Integer.valueOf(iVar.J), s0Var).a(this.K, iVar.K).c(z11, iVar.f1898y).b(Integer.valueOf(this.P), Integer.valueOf(iVar.P), s0Var);
        int i11 = this.O;
        oe.a0 a0VarB2 = a0VarB.b(Integer.valueOf(i11), Integer.valueOf(i10), this.D.S ? DefaultTrackSelector.FORMAT_VALUE_ORDERING.b() : DefaultTrackSelector.NO_ORDER).c(this.Q, iVar.Q).c(this.R, iVar.R).b(Integer.valueOf(this.M), Integer.valueOf(iVar.M), t0VarB).b(Integer.valueOf(this.N), Integer.valueOf(iVar.N), t0VarB);
        Integer numValueOf3 = Integer.valueOf(i11);
        Integer numValueOf4 = Integer.valueOf(i10);
        if (!d0.a(this.B, iVar.B)) {
            t0VarB = DefaultTrackSelector.NO_ORDER;
        }
        return a0VarB2.b(numValueOf3, numValueOf4, t0VarB).e();
    }
}
