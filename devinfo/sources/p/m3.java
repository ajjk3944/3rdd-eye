package p;

import android.content.Context;
import android.view.View;
import android.view.Window;
import com.applovin.shadow.okio.internal.Buffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m3 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final o.a f30776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n3 f30777b;

    public m3(n3 n3Var) {
        this.f30777b = n3Var;
        Context context = n3Var.f30779a.getContext();
        CharSequence charSequence = n3Var.f30785h;
        o.a aVar = new o.a();
        aVar.f30163e = Buffer.SEGMENTING_THRESHOLD;
        aVar.g = Buffer.SEGMENTING_THRESHOLD;
        aVar.f30168l = null;
        aVar.f30169m = null;
        aVar.f30170n = false;
        aVar.f30171o = false;
        aVar.f30172p = 16;
        aVar.f30166i = context;
        aVar.f30159a = charSequence;
        this.f30776a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n3 n3Var = this.f30777b;
        Window.Callback callback = n3Var.f30787k;
        if (callback == null || !n3Var.f30788l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f30776a);
    }
}
