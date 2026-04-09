package C8;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.zipoapps.premiumhelper.ui.settings.delete_account.PhDeleteAccountActivity;
import y9.q;

/* compiled from: PhDeleteAccountActivity.kt */
/* loaded from: classes3.dex */
public final class b extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PhDeleteAccountActivity f961a;

    public b(PhDeleteAccountActivity phDeleteAccountActivity) {
        this.f961a = phDeleteAccountActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (q.b0(String.valueOf(str), "submitted.formspark.io", false)) {
            PhDeleteAccountActivity phDeleteAccountActivity = this.f961a;
            phDeleteAccountActivity.setResult(1347566);
            phDeleteAccountActivity.f37158e.postDelayed(new a(phDeleteAccountActivity, 0), 800L);
        }
    }
}
