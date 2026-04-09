package Z2;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final WebResourceRequest f25093a;

    /* renamed from: b, reason: collision with root package name */
    private final WebResourceError f25094b;

    public e(WebResourceRequest webResourceRequest, WebResourceError error) {
        AbstractC6492s.i(error, "error");
        this.f25093a = webResourceRequest;
        this.f25094b = error;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return AbstractC6492s.d(this.f25093a, eVar.f25093a) && AbstractC6492s.d(this.f25094b, eVar.f25094b);
    }

    public int hashCode() {
        WebResourceRequest webResourceRequest = this.f25093a;
        return ((webResourceRequest == null ? 0 : webResourceRequest.hashCode()) * 31) + this.f25094b.hashCode();
    }

    public String toString() {
        return "WebViewError(request=" + this.f25093a + ", error=" + this.f25094b + ')';
    }
}
