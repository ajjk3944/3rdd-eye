package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import oe.a0;
import oe.h0;
import oe.s0;

/* loaded from: classes.dex */
public final class e implements Comparable {
    public final int B;
    public final int D;
    public final boolean E;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4579a;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4580d;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4581g;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f4582r;

    /* renamed from: x, reason: collision with root package name */
    public final int f4583x;

    /* renamed from: y, reason: collision with root package name */
    public final int f4584y;

    public e(Format format, DefaultTrackSelector.Parameters parameters, int i10, String str) {
        int formatLanguageScore;
        boolean z10 = false;
        this.f4580d = DefaultTrackSelector.isSupported(i10, false);
        int i11 = format.f4025r;
        int i12 = format.f4026x;
        int i13 = parameters.S;
        h0 h0Var = parameters.N;
        int i14 = i11 & (~i13);
        this.f4581g = (i14 & 1) != 0;
        this.f4582r = (i14 & 2) != 0;
        h0 h0VarP = h0Var.isEmpty() ? h0.p("") : h0Var;
        int i15 = 0;
        while (true) {
            if (i15 >= h0VarP.size()) {
                i15 = Integer.MAX_VALUE;
                formatLanguageScore = 0;
                break;
            } else {
                formatLanguageScore = DefaultTrackSelector.getFormatLanguageScore(format, (String) h0VarP.get(i15), parameters.P);
                if (formatLanguageScore > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.f4583x = i15;
        this.f4584y = formatLanguageScore;
        int iBitCount = Integer.bitCount(parameters.O & i12);
        this.B = iBitCount;
        this.E = (i12 & 1088) != 0;
        int formatLanguageScore2 = DefaultTrackSelector.getFormatLanguageScore(format, str, DefaultTrackSelector.normalizeUndeterminedLanguageToNull(str) == null);
        this.D = formatLanguageScore2;
        if (formatLanguageScore > 0 || ((h0Var.isEmpty() && iBitCount > 0) || this.f4581g || (this.f4582r && formatLanguageScore2 > 0))) {
            z10 = true;
        }
        this.f4579a = z10;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(e eVar) {
        a0 a0VarC = a0.f19295a.c(this.f4580d, eVar.f4580d);
        Integer numValueOf = Integer.valueOf(this.f4583x);
        Integer numValueOf2 = Integer.valueOf(eVar.f4583x);
        s0 s0Var = s0.f19372d;
        s0 s0Var2 = s0.f19373g;
        a0 a0VarB = a0VarC.b(numValueOf, numValueOf2, s0Var2);
        int i10 = eVar.f4584y;
        int i11 = this.f4584y;
        a0 a0VarA = a0VarB.a(i11, i10);
        int i12 = eVar.B;
        int i13 = this.B;
        a0 a0VarC2 = a0VarA.a(i13, i12).c(this.f4581g, eVar.f4581g);
        Boolean boolValueOf = Boolean.valueOf(this.f4582r);
        Boolean boolValueOf2 = Boolean.valueOf(eVar.f4582r);
        if (i11 != 0) {
            s0Var = s0Var2;
        }
        a0 a0VarA2 = a0VarC2.b(boolValueOf, boolValueOf2, s0Var).a(this.D, eVar.D);
        if (i13 == 0) {
            a0VarA2 = a0VarA2.d(this.E, eVar.E);
        }
        return a0VarA2.e();
    }
}
