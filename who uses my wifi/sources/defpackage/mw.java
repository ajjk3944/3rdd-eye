package defpackage;

import android.view.View;
import android.view.ViewGroup;
import org.json.JSONException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mw implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ mw(Object obj, Object obj2, int i) {
        this.f = i;
        this.h = obj;
        this.g = obj2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) throws IllegalStateException, JSONException {
        switch (this.f) {
            case 0:
                ex exVar = (ex) this.g;
                iw iwVar = exVar.c;
                exVar.k();
                tn.f((ViewGroup) iwVar.J.getParent(), ((nw) this.h).f.E()).e();
                break;
            default:
                ((sg2) this.h).s(view, (sb2) this.g, 10);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.f;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
