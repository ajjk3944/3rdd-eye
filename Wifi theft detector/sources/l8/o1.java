package l8;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class o1 extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final ImageView F;
    public final FrameLayout G;

    /* renamed from: w, reason: collision with root package name */
    public final LinearLayout f23306w;

    /* renamed from: x, reason: collision with root package name */
    public final CardView f23307x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f23308y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f23309z;

    public o1(Object obj, View view, int i10, LinearLayout linearLayout, CardView cardView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, ImageView imageView, FrameLayout frameLayout) {
        super(obj, view, i10);
        this.f23306w = linearLayout;
        this.f23307x = cardView;
        this.f23308y = textView;
        this.f23309z = textView2;
        this.A = textView3;
        this.B = textView4;
        this.C = textView5;
        this.D = textView6;
        this.E = textView7;
        this.F = imageView;
        this.G = frameLayout;
    }
}
