package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rb {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public final Object d;
    public final /* synthetic */ Object e;

    public rb(sq0 sq0Var, ju[] juVarArr, boolean z, int i) {
        this.a = 2;
        this.e = sq0Var;
        this.d = juVarArr;
        boolean z2 = false;
        if (juVarArr != null && z) {
            z2 = true;
        }
        this.c = z2;
        this.b = i;
    }

    public void a(int i) {
        switch (this.a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.e;
                WeakReference weakReference = bottomSheetBehavior.W;
                if (weakReference != null && weakReference.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) bottomSheetBehavior.W.get()).postOnAnimation((a9) this.d);
                        this.c = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.e;
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) sideSheetBehavior.p.get()).postOnAnimation((e2) this.d);
                        this.c = true;
                        break;
                    }
                }
                break;
        }
    }

    public rb(SideSheetBehavior sideSheetBehavior) {
        this.a = 1;
        this.e = sideSheetBehavior;
        this.d = new e2(15, this);
    }

    public rb(BottomSheetBehavior bottomSheetBehavior) {
        this.a = 0;
        this.e = bottomSheetBehavior;
        this.d = new a9(1, this);
    }
}
