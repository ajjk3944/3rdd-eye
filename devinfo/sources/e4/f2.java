package e4;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.measurement.d5;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class f2 extends d5 {

    /* renamed from: b, reason: collision with root package name */
    public final WindowInsetsController f22337b;

    /* renamed from: c, reason: collision with root package name */
    public final o7.c f22338c;

    /* renamed from: d, reason: collision with root package name */
    public final Window f22339d;

    public f2(Window window, o7.c cVar) {
        this.f22337b = window.getInsetsController();
        this.f22338c = cVar;
        this.f22339d = window;
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final void n() {
        this.f22337b.hide(519);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public boolean o() {
        this.f22337b.setSystemBarsAppearance(0, 0);
        return (this.f22337b.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final void v(boolean z3) {
        Window window = this.f22339d;
        if (z3) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f22337b.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f22337b.setSystemBarsAppearance(0, 16);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final void w(boolean z3) {
        Window window = this.f22339d;
        if (z3) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | Segment.SIZE);
            }
            this.f22337b.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f22337b.setSystemBarsAppearance(0, 8);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final void x(int i4) {
        if ((i4 & 8) != 0) {
            ((a0) this.f22338c.f30419b).b();
        }
        this.f22337b.show(i4 & (-9));
    }
}
