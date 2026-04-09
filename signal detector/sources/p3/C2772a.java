package p3;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import x3.x;
import x3.y;

/* renamed from: p3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2772a extends com.bumptech.glide.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22813a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22814b;

    public /* synthetic */ C2772a(int i, Object obj) {
        this.f22813a = i;
        this.f22814b = obj;
    }

    @Override // com.bumptech.glide.d
    public final void I(int i) {
        switch (this.f22813a) {
            case 0:
                break;
            default:
                y yVar = (y) this.f22814b;
                yVar.f24180e = true;
                x xVar = (x) yVar.f24181f.get();
                if (xVar != null) {
                    xVar.a();
                    break;
                }
                break;
        }
    }

    @Override // com.bumptech.glide.d
    public final void J(Typeface typeface, boolean z6) {
        switch (this.f22813a) {
            case 0:
                Chip chip = (Chip) this.f22814b;
                d dVar = chip.f18247e;
                chip.setText(dVar.f22850a1 ? dVar.f22852c0 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z6) {
                    y yVar = (y) this.f22814b;
                    yVar.f24180e = true;
                    x xVar = (x) yVar.f24181f.get();
                    if (xVar != null) {
                        xVar.a();
                        break;
                    }
                }
                break;
        }
    }

    private final void d0(int i) {
    }
}
