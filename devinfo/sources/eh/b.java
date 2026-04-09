package eh;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23479a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23480b;

    public /* synthetic */ b(Context context, int i4) {
        this.f23479a = i4;
        this.f23480b = context;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.f23479a) {
            case 0:
                k.e(view, "widget");
                com.liuzh.deviceinfo.utilities.d.n((Context) this.f23480b);
                break;
            case 1:
                k.e(view, "widget");
                com.liuzh.deviceinfo.utilities.d.o((Context) this.f23480b);
                break;
            default:
                ((s2.k) this.f23480b).getClass();
                break;
        }
    }

    public b(s2.k kVar) {
        this.f23479a = 2;
        this.f23480b = kVar;
    }
}
