package e4;

import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.measurement.d5;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class d2 extends d5 {

    /* renamed from: b, reason: collision with root package name */
    public final Window f22321b;

    /* renamed from: c, reason: collision with root package name */
    public final o7.c f22322c;

    public d2(Window window, o7.c cVar) {
        this.f22321b = window;
        this.f22322c = cVar;
    }

    public final void C(int i4) {
        View decorView = this.f22321b.getDecorView();
        decorView.setSystemUiVisibility(i4 | decorView.getSystemUiVisibility());
    }

    public final void D(int i4) {
        View decorView = this.f22321b.getDecorView();
        decorView.setSystemUiVisibility((~i4) & decorView.getSystemUiVisibility());
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final void n() {
        for (int i4 = 1; i4 <= 512; i4 <<= 1) {
            if ((519 & i4) != 0) {
                if (i4 == 1) {
                    C(4);
                } else if (i4 == 2) {
                    C(2);
                } else if (i4 == 8) {
                    ((a0) this.f22322c.f30419b).a();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final boolean o() {
        return (this.f22321b.getDecorView().getSystemUiVisibility() & Segment.SIZE) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final void w(boolean z3) {
        if (!z3) {
            D(Segment.SIZE);
            return;
        }
        Window window = this.f22321b;
        window.clearFlags(67108864);
        window.addFlags(LinearLayoutManager.INVALID_OFFSET);
        C(Segment.SIZE);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final void x(int i4) {
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i4 & i10) != 0) {
                if (i10 == 1) {
                    D(4);
                    this.f22321b.clearFlags(Segment.SHARE_MINIMUM);
                } else if (i10 == 2) {
                    D(2);
                } else if (i10 == 8) {
                    ((a0) this.f22322c.f30419b).b();
                }
            }
        }
    }
}
