package k8;

import android.content.Context;
import android.webkit.JavascriptInterface;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public String f21897a;

    /* renamed from: b, reason: collision with root package name */
    public Context f21898b;

    public b(Context context) {
        this.f21898b = context;
    }

    @JavascriptInterface
    public void pwdInput(String str) {
        this.f21897a = str;
    }
}
