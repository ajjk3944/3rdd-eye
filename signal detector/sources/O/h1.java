package o;

import android.content.Context;
import android.view.View;
import android.view.Window;
import n.C2667a;

/* loaded from: classes.dex */
public final class h1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C2667a f22518a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1 f22519b;

    public h1(i1 i1Var) {
        this.f22519b = i1Var;
        Context context = i1Var.f22522a.getContext();
        CharSequence charSequence = i1Var.f22529h;
        C2667a c2667a = new C2667a();
        c2667a.f22015e = 4096;
        c2667a.f22017g = 4096;
        c2667a.f22021l = null;
        c2667a.f22022m = null;
        c2667a.f22023n = false;
        c2667a.f22009C = false;
        c2667a.f22010D = 16;
        c2667a.i = context;
        c2667a.f22011a = charSequence;
        this.f22518a = c2667a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i1 i1Var = this.f22519b;
        Window.Callback callback = i1Var.f22531k;
        if (callback == null || !i1Var.f22532l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f22518a);
    }
}
