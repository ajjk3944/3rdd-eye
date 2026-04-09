package defpackage;

import android.view.View;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class nf implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vs b;

    public /* synthetic */ nf(vs vsVar, int i) {
        this.a = i;
        this.b = vsVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case 0:
                qf qfVar = (qf) this.b;
                qfVar.s(qfVar.t());
                break;
            default:
                tq tqVar = (tq) this.b;
                tqVar.l = z;
                tqVar.p();
                if (!z) {
                    tqVar.s(false);
                    tqVar.m = false;
                    break;
                }
                break;
        }
    }
}
