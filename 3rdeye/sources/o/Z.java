package o;

import android.content.Context;
import android.view.View;
import android.view.Window;
import n.C5339a;

/* compiled from: ToolbarWidgetWrapper.java */
/* loaded from: classes.dex */
public final class Z implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final C5339a f44611b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.c f44612c;

    public Z(androidx.appcompat.widget.c cVar) {
        this.f44612c = cVar;
        Context context = cVar.f14783a.getContext();
        CharSequence charSequence = cVar.f14790h;
        C5339a c5339a = new C5339a();
        c5339a.f44163e = 4096;
        c5339a.f44165g = 4096;
        c5339a.f44169l = null;
        c5339a.f44170m = null;
        c5339a.f44171n = false;
        c5339a.f44172o = false;
        c5339a.f44173p = 16;
        c5339a.i = context;
        c5339a.f44159a = charSequence;
        this.f44611b = c5339a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        androidx.appcompat.widget.c cVar = this.f44612c;
        Window.Callback callback = cVar.f14792k;
        if (callback == null || !cVar.f14793l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f44611b);
    }
}
