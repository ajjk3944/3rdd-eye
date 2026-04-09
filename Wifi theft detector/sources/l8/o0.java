package l8;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class o0 extends ViewDataBinding {
    public final LinearLayout A;
    public final LinearLayout B;
    public final TextView C;
    public final TextView D;
    public final TextView E;

    /* renamed from: w, reason: collision with root package name */
    public final AppCompatButton f23302w;

    /* renamed from: x, reason: collision with root package name */
    public final ImageView f23303x;

    /* renamed from: y, reason: collision with root package name */
    public final LinearLayout f23304y;

    /* renamed from: z, reason: collision with root package name */
    public final LinearLayout f23305z;

    public o0(Object obj, View view, int i10, AppCompatButton appCompatButton, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i10);
        this.f23302w = appCompatButton;
        this.f23303x = imageView;
        this.f23304y = linearLayout;
        this.f23305z = linearLayout2;
        this.A = linearLayout3;
        this.B = linearLayout4;
        this.C = textView;
        this.D = textView2;
        this.E = textView3;
    }
}
