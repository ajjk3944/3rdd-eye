package com.google.android.exoplayer2.trackselection;

import android.content.res.Configuration;
import android.content.res.Resources;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import java.util.Locale;
import oe.a0;
import oe.h0;
import oe.s0;
import oe.t0;
import qb.v;

/* loaded from: classes.dex */
public final class a implements Comparable {
    public final int B;
    public final int D;
    public final int E;
    public final boolean F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4569a;

    /* renamed from: d, reason: collision with root package name */
    public final String f4570d;

    /* renamed from: g, reason: collision with root package name */
    public final DefaultTrackSelector.Parameters f4571g;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f4572r;

    /* renamed from: x, reason: collision with root package name */
    public final int f4573x;

    /* renamed from: y, reason: collision with root package name */
    public final int f4574y;

    public a(Format format, DefaultTrackSelector.Parameters parameters, int i10) {
        h0 h0Var;
        int i11;
        int formatLanguageScore;
        String[] strArrSplit;
        int formatLanguageScore2;
        h0 h0Var2 = parameters.I;
        this.f4571g = parameters;
        this.f4570d = DefaultTrackSelector.normalizeUndeterminedLanguageToNull(format.f4024g);
        int i12 = 0;
        this.f4572r = DefaultTrackSelector.isSupported(i10, false);
        int i13 = 0;
        while (true) {
            h0Var = parameters.M;
            i11 = Integer.MAX_VALUE;
            if (i13 >= h0Var2.size()) {
                formatLanguageScore = 0;
                i13 = Integer.MAX_VALUE;
                break;
            } else {
                formatLanguageScore = DefaultTrackSelector.getFormatLanguageScore(format, (String) h0Var2.get(i13), false);
                if (formatLanguageScore > 0) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        this.f4574y = i13;
        this.f4573x = formatLanguageScore;
        this.B = Integer.bitCount(format.f4026x & parameters.J);
        boolean z10 = true;
        this.F = (format.f4025r & 1) != 0;
        int i14 = format.U;
        this.G = i14;
        this.H = format.V;
        int i15 = format.D;
        this.I = i15;
        if ((i15 != -1 && i15 > parameters.L) || (i14 != -1 && i14 > parameters.K)) {
            z10 = false;
        }
        this.f4569a = z10;
        int i16 = v.f20828a;
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i17 = v.f20828a;
        if (i17 >= 24) {
            strArrSplit = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            Locale locale = configuration.locale;
            strArrSplit = new String[]{i17 >= 21 ? locale.toLanguageTag() : locale.toString()};
        }
        for (int i18 = 0; i18 < strArrSplit.length; i18++) {
            strArrSplit[i18] = v.C(strArrSplit[i18]);
        }
        int i19 = 0;
        while (true) {
            if (i19 >= strArrSplit.length) {
                formatLanguageScore2 = 0;
                i19 = Integer.MAX_VALUE;
                break;
            } else {
                formatLanguageScore2 = DefaultTrackSelector.getFormatLanguageScore(format, strArrSplit[i19], false);
                if (formatLanguageScore2 > 0) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        this.D = i19;
        this.E = formatLanguageScore2;
        while (true) {
            if (i12 >= h0Var.size()) {
                break;
            }
            String str = format.H;
            if (str != null && str.equals(h0Var.get(i12))) {
                i11 = i12;
                break;
            }
            i12++;
        }
        this.J = i11;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(a aVar) {
        boolean z10 = this.f4572r;
        boolean z11 = this.f4569a;
        t0 t0VarB = (z11 && z10) ? DefaultTrackSelector.FORMAT_VALUE_ORDERING : DefaultTrackSelector.FORMAT_VALUE_ORDERING.b();
        boolean z12 = aVar.f4572r;
        int i10 = aVar.I;
        a0 a0VarC = a0.f19295a.c(z10, z12);
        Integer numValueOf = Integer.valueOf(this.f4574y);
        Integer numValueOf2 = Integer.valueOf(aVar.f4574y);
        s0 s0Var = s0.f19373g;
        a0 a0VarB = a0VarC.b(numValueOf, numValueOf2, s0Var).a(this.f4573x, aVar.f4573x).a(this.B, aVar.B).c(z11, aVar.f4569a).b(Integer.valueOf(this.J), Integer.valueOf(aVar.J), s0Var);
        int i11 = this.I;
        a0 a0VarB2 = a0VarB.b(Integer.valueOf(i11), Integer.valueOf(i10), this.f4571g.Q ? DefaultTrackSelector.FORMAT_VALUE_ORDERING.b() : DefaultTrackSelector.NO_ORDER).c(this.F, aVar.F).b(Integer.valueOf(this.D), Integer.valueOf(aVar.D), s0Var).a(this.E, aVar.E).b(Integer.valueOf(this.G), Integer.valueOf(aVar.G), t0VarB).b(Integer.valueOf(this.H), Integer.valueOf(aVar.H), t0VarB);
        Integer numValueOf3 = Integer.valueOf(i11);
        Integer numValueOf4 = Integer.valueOf(i10);
        if (!v.a(this.f4570d, aVar.f4570d)) {
            t0VarB = DefaultTrackSelector.NO_ORDER;
        }
        return a0VarB2.b(numValueOf3, numValueOf4, t0VarB).e();
    }
}
