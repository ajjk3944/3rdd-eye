package l8;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class u extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;

    /* renamed from: w, reason: collision with root package name */
    public final CardView f23334w;

    /* renamed from: x, reason: collision with root package name */
    public final ImageView f23335x;

    /* renamed from: y, reason: collision with root package name */
    public final ImageView f23336y;

    /* renamed from: z, reason: collision with root package name */
    public final LinearLayout f23337z;

    public u(Object obj, View view, int i10, CardView cardView, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        super(obj, view, i10);
        this.f23334w = cardView;
        this.f23335x = imageView;
        this.f23336y = imageView2;
        this.f23337z = linearLayout;
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
        this.D = textView4;
        this.E = textView5;
        this.F = textView6;
        this.G = textView7;
    }
}
