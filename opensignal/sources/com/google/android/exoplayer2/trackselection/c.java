package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import ob.k;
import oe.h0;
import qb.v;

/* loaded from: classes.dex */
public final class c extends k {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final int D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final SparseArray H;
    public final SparseBooleanArray I;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f4575w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f4576x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f4577y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f4578z;

    public c(Context context) throws NumberFormatException {
        CaptioningManager captioningManager;
        int i10 = v.f20828a;
        if (i10 >= 19 && ((i10 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
            this.f19266s = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f19265r = h0.p(i10 >= 21 ? locale.toLanguageTag() : locale.toString());
            }
        }
        Point pointQ = v.q(context);
        a(pointQ.x, pointQ.y);
        this.H = new SparseArray();
        this.I = new SparseBooleanArray();
        this.f4575w = true;
        this.f4576x = false;
        this.f4577y = true;
        this.f4578z = true;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = 0;
        this.E = true;
        this.F = false;
        this.G = true;
    }

    @Override // ob.k
    public final k a(int i10, int i11) {
        super.a(i10, i11);
        return this;
    }

    public c(DefaultTrackSelector.Parameters parameters) {
        this.f19250a = parameters.f4563a;
        this.f19251b = parameters.f4564d;
        this.f19252c = parameters.f4565g;
        this.f19253d = parameters.f4566r;
        this.f19254e = parameters.f4567x;
        this.f19255f = parameters.f4568y;
        this.f19256g = parameters.B;
        this.f19257h = parameters.D;
        this.f19258i = parameters.E;
        this.j = parameters.F;
        this.k = parameters.G;
        this.f19259l = parameters.H;
        this.f19260m = parameters.I;
        this.f19261n = parameters.J;
        this.f19262o = parameters.K;
        this.f19263p = parameters.L;
        this.f19264q = parameters.M;
        this.f19265r = parameters.N;
        this.f19266s = parameters.O;
        this.f19267t = parameters.P;
        this.f19268u = parameters.Q;
        this.f19269v = parameters.R;
        this.D = parameters.S;
        this.f4575w = parameters.T;
        this.f4576x = parameters.U;
        this.f4577y = parameters.V;
        this.f4578z = parameters.W;
        this.A = parameters.X;
        this.B = parameters.Y;
        this.C = parameters.Z;
        this.E = parameters.f4555a0;
        this.F = parameters.f4556b0;
        this.G = parameters.f4557c0;
        SparseArray sparseArray = parameters.f4558d0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
        }
        this.H = sparseArray2;
        this.I = parameters.f4559e0.clone();
    }

    public c() {
        this.H = new SparseArray();
        this.I = new SparseBooleanArray();
        this.f4575w = true;
        this.f4576x = false;
        this.f4577y = true;
        this.f4578z = true;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = 0;
        this.E = true;
        this.F = false;
        this.G = true;
    }
}
