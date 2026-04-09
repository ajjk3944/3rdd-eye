package M3;

import android.view.View;

/* renamed from: M3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0170a implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f2832b;

    public /* synthetic */ ViewOnFocusChangeListenerC0170a(q qVar, int i) {
        this.f2831a = i;
        this.f2832b = qVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z6) {
        switch (this.f2831a) {
            case 0:
                C0173d c0173d = (C0173d) this.f2832b;
                c0173d.t(c0173d.u());
                break;
            default:
                k kVar = (k) this.f2832b;
                kVar.f2859l = z6;
                kVar.q();
                if (!z6) {
                    kVar.t(false);
                    kVar.f2860m = false;
                    break;
                }
                break;
        }
    }
}
