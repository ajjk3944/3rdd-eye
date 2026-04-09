package sc;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import me.t1;
import zc.j;
import zc.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends t1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33524a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33525b;

    public /* synthetic */ a(int i4, Object obj) {
        this.f33524a = i4;
        this.f33525b = obj;
    }

    @Override // me.t1
    public final void w(int i4) {
        switch (this.f33524a) {
            case 0:
                break;
            default:
                k kVar = (k) this.f33525b;
                kVar.f38232e = true;
                j jVar = (j) kVar.f38233f.get();
                if (jVar != null) {
                    jVar.a();
                    break;
                }
                break;
        }
    }

    @Override // me.t1
    public final void x(Typeface typeface, boolean z3) {
        switch (this.f33524a) {
            case 0:
                Chip chip = (Chip) this.f33525b;
                e eVar = chip.f20415e;
                chip.setText(eVar.M0 ? eVar.O : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z3) {
                    k kVar = (k) this.f33525b;
                    kVar.f38232e = true;
                    j jVar = (j) kVar.f38233f.get();
                    if (jVar != null) {
                        jVar.a();
                        break;
                    }
                }
                break;
        }
    }

    private final void L(int i4) {
    }
}
