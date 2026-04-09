package C8;

import android.webkit.WebView;
import c.AbstractC2021s;
import com.zipoapps.premiumhelper.ui.settings.delete_account.PhDeleteAccountActivity;
import kotlin.jvm.internal.l;

/* compiled from: PhDeleteAccountActivity.kt */
/* loaded from: classes3.dex */
public final class c extends AbstractC2021s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PhDeleteAccountActivity f962d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PhDeleteAccountActivity phDeleteAccountActivity) {
        super(true);
        this.f962d = phDeleteAccountActivity;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.internal.k, p9.a] */
    @Override // c.AbstractC2021s
    public final void a() {
        PhDeleteAccountActivity phDeleteAccountActivity = this.f962d;
        WebView webView = phDeleteAccountActivity.f37156c;
        if (webView == null) {
            l.l("webView");
            throw null;
        }
        if (webView.canGoBack()) {
            WebView webView2 = phDeleteAccountActivity.f37156c;
            if (webView2 != null) {
                webView2.goBack();
                return;
            } else {
                l.l("webView");
                throw null;
            }
        }
        this.f18304a = false;
        ?? r12 = this.f18306c;
        if (r12 != 0) {
            r12.invoke();
        }
        phDeleteAccountActivity.getOnBackPressedDispatcher().d();
    }
}
