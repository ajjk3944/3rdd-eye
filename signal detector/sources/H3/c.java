package H3;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1787b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1788c;

    public /* synthetic */ c(int i, int i3, Object obj) {
        this.f1786a = i3;
        this.f1788c = obj;
        this.f1787b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1786a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1788c;
                View view = (View) sideSheetBehavior.f18420D.get();
                if (view != null) {
                    sideSheetBehavior.z(view, this.f1787b, false);
                    break;
                }
                break;
            default:
                ((I.b) this.f1788c).h(this.f1787b);
                break;
        }
    }
}
