package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import oe.a0;
import oe.h0;
import oe.s0;
import oe.t0;

/* loaded from: classes.dex */
public final class f implements Comparable {
    public final int B;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4585a;

    /* renamed from: d, reason: collision with root package name */
    public final DefaultTrackSelector.Parameters f4586d;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4587g;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f4588r;

    /* renamed from: x, reason: collision with root package name */
    public final int f4589x;

    /* renamed from: y, reason: collision with root package name */
    public final int f4590y;

    public f(Format format, DefaultTrackSelector.Parameters parameters, int i10, boolean z10) {
        float f10 = format.O;
        int i11 = format.D;
        int i12 = format.N;
        int i13 = format.M;
        h0 h0Var = parameters.H;
        this.f4586d = parameters;
        boolean z11 = true;
        int i14 = 0;
        int i15 = -1;
        this.f4585a = z10 && (i13 == -1 || i13 <= parameters.f4563a) && ((i12 == -1 || i12 <= parameters.f4564d) && ((f10 == -1.0f || f10 <= ((float) parameters.f4565g)) && (i11 == -1 || i11 <= parameters.f4566r)));
        if (!z10 || ((i13 != -1 && i13 < parameters.f4567x) || ((i12 != -1 && i12 < parameters.f4568y) || ((f10 != -1.0f && f10 < parameters.B) || (i11 != -1 && i11 < parameters.D))))) {
            z11 = false;
        }
        this.f4587g = z11;
        this.f4588r = DefaultTrackSelector.isSupported(i10, false);
        this.f4589x = i11;
        if (i13 != -1 && i12 != -1) {
            i15 = i13 * i12;
        }
        this.f4590y = i15;
        while (true) {
            if (i14 >= h0Var.size()) {
                i14 = Integer.MAX_VALUE;
                break;
            }
            String str = format.H;
            if (str != null && str.equals(h0Var.get(i14))) {
                break;
            } else {
                i14++;
            }
        }
        this.B = i14;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(f fVar) {
        boolean z10 = this.f4588r;
        boolean z11 = this.f4585a;
        t0 t0VarB = (z11 && z10) ? DefaultTrackSelector.FORMAT_VALUE_ORDERING : DefaultTrackSelector.FORMAT_VALUE_ORDERING.b();
        boolean z12 = fVar.f4588r;
        int i10 = fVar.f4589x;
        a0 a0VarB = a0.f19295a.c(z10, z12).c(z11, fVar.f4585a).c(this.f4587g, fVar.f4587g).b(Integer.valueOf(this.B), Integer.valueOf(fVar.B), s0.f19373g);
        int i11 = this.f4589x;
        return a0VarB.b(Integer.valueOf(i11), Integer.valueOf(i10), this.f4586d.Q ? DefaultTrackSelector.FORMAT_VALUE_ORDERING.b() : DefaultTrackSelector.NO_ORDER).b(Integer.valueOf(this.f4590y), Integer.valueOf(fVar.f4590y), t0VarB).b(Integer.valueOf(i11), Integer.valueOf(i10), t0VarB).e();
    }
}
