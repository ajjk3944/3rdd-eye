package androidx.media3.exoplayer.trackselection;

import a5.d0;
import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import androidx.media3.common.d1;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import oe.h0;

/* loaded from: classes.dex */
public final class k extends d1 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public final SparseArray N;
    public final SparseBooleanArray O;

    public k(Context context) throws NumberFormatException {
        CaptioningManager captioningManager;
        int i10 = d0.f105a;
        if (i10 >= 19 && ((i10 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
            this.f1600t = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f1599s = h0.p(i10 >= 21 ? locale.toLanguageTag() : locale.toString());
            }
        }
        Point pointP = d0.p(context);
        b(pointP.x, pointP.y);
        this.N = new SparseArray();
        this.O = new SparseBooleanArray();
        c();
    }

    @Override // androidx.media3.common.d1
    public final d1 b(int i10, int i11) {
        super.b(i10, i11);
        return this;
    }

    public final void c() {
        this.A = true;
        this.B = false;
        this.C = true;
        this.D = false;
        this.E = true;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = true;
        this.K = true;
        this.L = false;
        this.M = true;
    }

    public k(l lVar) {
        a(lVar);
        this.A = lVar.W;
        this.B = lVar.X;
        this.C = lVar.Y;
        this.D = lVar.Z;
        this.E = lVar.f1902a0;
        this.F = lVar.f1903b0;
        this.G = lVar.f1904c0;
        this.H = lVar.f1905d0;
        this.I = lVar.f1906e0;
        this.J = lVar.f1907f0;
        this.K = lVar.f1908g0;
        this.L = lVar.f1909h0;
        this.M = lVar.f1910i0;
        SparseArray sparseArray = lVar.f1911j0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
        }
        this.N = sparseArray2;
        this.O = lVar.f1912k0.clone();
    }

    public k() {
        this.N = new SparseArray();
        this.O = new SparseBooleanArray();
        c();
    }
}
