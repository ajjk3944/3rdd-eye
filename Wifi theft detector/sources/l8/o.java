package l8;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.detector.mvp.view.widget.SildingFinishLayout;

/* loaded from: classes3.dex */
public abstract class o extends ViewDataBinding {
    public final RelativeLayout A;
    public final SildingFinishLayout B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final TextView J;

    /* renamed from: w, reason: collision with root package name */
    public final o1 f23298w;

    /* renamed from: x, reason: collision with root package name */
    public final ImageView f23299x;

    /* renamed from: y, reason: collision with root package name */
    public final ImageView f23300y;

    /* renamed from: z, reason: collision with root package name */
    public final RelativeLayout f23301z;

    public o(Object obj, View view, int i10, o1 o1Var, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, SildingFinishLayout sildingFinishLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        super(obj, view, i10);
        this.f23298w = o1Var;
        this.f23299x = imageView;
        this.f23300y = imageView2;
        this.f23301z = relativeLayout;
        this.A = relativeLayout2;
        this.B = sildingFinishLayout;
        this.C = textView;
        this.D = textView2;
        this.E = textView3;
        this.F = textView4;
        this.G = textView5;
        this.H = textView6;
        this.I = textView7;
        this.J = textView8;
    }
}
