package B0;

import B0.g;
import android.view.View;
import com.applovin.impl.sdk.i;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.Iterator;
import java.util.LinkedHashSet;
import v.o0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f370b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f371c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f372d;

    public /* synthetic */ h(int i, int i10, Object obj) {
        this.f370b = i10;
        this.f372d = obj;
        this.f371c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f370b) {
            case 0:
                ((g.e) this.f372d).lambda$callbackFailAsync$1(this.f371c);
                break;
            case 1:
                ((com.applovin.impl.adview.a) this.f372d).a(this.f371c);
                break;
            case 2:
                ((i.a) this.f372d).a(this.f371c);
                break;
            case 3:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f372d;
                View view = (View) sideSheetBehavior.f23018p.get();
                if (view != null) {
                    sideSheetBehavior.u(view, this.f371c, false);
                    break;
                }
                break;
            default:
                Iterator it = ((LinkedHashSet) this.f372d).iterator();
                while (it.hasNext()) {
                    ((o0) it.next()).e(this.f371c);
                }
                break;
        }
    }
}
