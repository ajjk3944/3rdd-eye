package F8;

import A9.C0575f;
import A9.U;
import H0.f;
import T1.B;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC1759l;
import androidx.recyclerview.widget.RecyclerView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import kotlin.jvm.internal.l;

/* compiled from: LogsFragment.kt */
/* loaded from: classes3.dex */
public final class e extends ComponentCallbacksC1759l {

    /* renamed from: b, reason: collision with root package name */
    public f f1726b;

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        l.f(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_logs, viewGroup, false);
        int i = R.id.ivBack;
        ImageView imageView = (ImageView) B.f(R.id.ivBack, viewInflate);
        if (imageView != null) {
            i = R.id.ivShareLog;
            ImageView imageView2 = (ImageView) B.f(R.id.ivShareLog, viewInflate);
            if (imageView2 != null) {
                i = R.id.logsOpenLayout;
                ConstraintLayout constraintLayout = (ConstraintLayout) B.f(R.id.logsOpenLayout, viewInflate);
                if (constraintLayout != null) {
                    i = R.id.logsWebView;
                    WebView webView = (WebView) B.f(R.id.logsWebView, viewInflate);
                    if (webView != null) {
                        i = R.id.rvLogs;
                        RecyclerView recyclerView = (RecyclerView) B.f(R.id.rvLogs, viewInflate);
                        if (recyclerView != null) {
                            i = R.id.toolbar;
                            if (((ConstraintLayout) B.f(R.id.toolbar, viewInflate)) != null) {
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                this.f1726b = new f(constraintLayout2, imageView, imageView2, constraintLayout, webView, recyclerView);
                                l.e(constraintLayout2, "getRoot(...)");
                                return constraintLayout2;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final void onViewCreated(View view, Bundle bundle) {
        l.f(view, "view");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null) {
            C0575f.e(A2.l.y(this), U.f212b, null, new d(context, this, null), 2);
        }
    }
}
