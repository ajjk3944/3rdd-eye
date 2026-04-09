package I5;

import android.os.Bundle;
import android.webkit.WebView;
import s.BinderC5541e;

/* loaded from: classes2.dex */
public final class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2505b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2506c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2508e;

    public h(i iVar, WebView webView, String str) {
        this.f2508e = iVar;
        this.f2507d = webView;
        this.f2506c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2505b) {
            case 0:
                ((i) this.f2508e).getClass();
                i.b((WebView) this.f2507d, this.f2506c);
                break;
            default:
                ((BinderC5541e) this.f2508e).f45882c.extraCallback(this.f2506c, (Bundle) this.f2507d);
                break;
        }
    }

    public h(BinderC5541e binderC5541e, String str, Bundle bundle) {
        this.f2508e = binderC5541e;
        this.f2506c = str;
        this.f2507d = bundle;
    }
}
