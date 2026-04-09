package p;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class q2 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final o.a f20143a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r2 f20144d;

    public q2(r2 r2Var) {
        this.f20144d = r2Var;
        Context context = r2Var.f20152a.getContext();
        CharSequence charSequence = r2Var.f20159h;
        o.a aVar = new o.a();
        aVar.f18566e = 4096;
        aVar.f18568g = 4096;
        aVar.f18571l = null;
        aVar.f18572m = null;
        aVar.f18573n = false;
        aVar.f18574o = false;
        aVar.f18575p = 16;
        aVar.f18570i = context;
        aVar.f18562a = charSequence;
        this.f20143a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        r2 r2Var = this.f20144d;
        Window.Callback callback = r2Var.k;
        if (callback == null || !r2Var.f20161l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f20143a);
    }
}
