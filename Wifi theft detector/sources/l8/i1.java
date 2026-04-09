package l8;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.detector.mvp.view.widget.MoreToolsView;

/* loaded from: classes3.dex */
public abstract class i1 extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;

    /* renamed from: w, reason: collision with root package name */
    public final LinearLayout f23266w;

    /* renamed from: x, reason: collision with root package name */
    public final LinearLayout f23267x;

    /* renamed from: y, reason: collision with root package name */
    public final MoreToolsView f23268y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f23269z;

    public i1(Object obj, View view, int i10, LinearLayout linearLayout, LinearLayout linearLayout2, MoreToolsView moreToolsView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i10);
        this.f23266w = linearLayout;
        this.f23267x = linearLayout2;
        this.f23268y = moreToolsView;
        this.f23269z = textView;
        this.A = textView2;
        this.B = textView3;
        this.C = textView4;
        this.D = textView5;
        this.E = textView6;
    }
}
