package qd;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import xd.g;
import xd.h;

/* loaded from: classes.dex */
public final class a extends a.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f20844f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f20845g;

    public /* synthetic */ a(int i10, Object obj) {
        this.f20844f = i10;
        this.f20845g = obj;
    }

    @Override // a.a
    public final void y(int i10) {
        switch (this.f20844f) {
            case 0:
                break;
            default:
                h hVar = (h) this.f20845g;
                hVar.f25292e = true;
                g gVar = (g) hVar.f25293f.get();
                if (gVar != null) {
                    gVar.a();
                    break;
                }
                break;
        }
    }

    @Override // a.a
    public final void z(Typeface typeface, boolean z10) {
        switch (this.f20844f) {
            case 0:
                Chip chip = (Chip) this.f20845g;
                e eVar = chip.f5570x;
                chip.setText(eVar.f20864i1 ? eVar.f20867k0 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z10) {
                    h hVar = (h) this.f20845g;
                    hVar.f25292e = true;
                    g gVar = (g) hVar.f25293f.get();
                    if (gVar != null) {
                        gVar.a();
                        break;
                    }
                }
                break;
        }
    }

    private final void T(int i10) {
    }
}
