package l8;

import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class g1 extends ViewDataBinding {
    public final TextView A;
    public final WebView B;

    /* renamed from: w, reason: collision with root package name */
    public final CardView f23254w;

    /* renamed from: x, reason: collision with root package name */
    public final LinearLayout f23255x;

    /* renamed from: y, reason: collision with root package name */
    public final RelativeLayout f23256y;

    /* renamed from: z, reason: collision with root package name */
    public final ScrollView f23257z;

    public g1(Object obj, View view, int i10, CardView cardView, LinearLayout linearLayout, RelativeLayout relativeLayout, ScrollView scrollView, TextView textView, WebView webView) {
        super(obj, view, i10);
        this.f23254w = cardView;
        this.f23255x = linearLayout;
        this.f23256y = relativeLayout;
        this.f23257z = scrollView;
        this.A = textView;
        this.B = webView;
    }
}
