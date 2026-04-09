package l8;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.youdao.material.views.WYProgressView;

/* loaded from: classes3.dex */
public abstract class g0 extends ViewDataBinding {
    public final TextView A;
    public final TextView B;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f23250w;

    /* renamed from: x, reason: collision with root package name */
    public final LinearLayout f23251x;

    /* renamed from: y, reason: collision with root package name */
    public final FrameLayout f23252y;

    /* renamed from: z, reason: collision with root package name */
    public final WYProgressView f23253z;

    public g0(Object obj, View view, int i10, ImageView imageView, LinearLayout linearLayout, FrameLayout frameLayout, WYProgressView wYProgressView, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.f23250w = imageView;
        this.f23251x = linearLayout;
        this.f23252y = frameLayout;
        this.f23253z = wYProgressView;
        this.A = textView;
        this.B = textView2;
    }
}
