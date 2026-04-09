package l8;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class w1 extends ViewDataBinding {
    public final TextView A;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f23352w;

    /* renamed from: x, reason: collision with root package name */
    public final RelativeLayout f23353x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f23354y;

    /* renamed from: z, reason: collision with root package name */
    public final TextView f23355z;

    public w1(Object obj, View view, int i10, ImageView imageView, RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i10);
        this.f23352w = imageView;
        this.f23353x = relativeLayout;
        this.f23354y = textView;
        this.f23355z = textView2;
        this.A = textView3;
    }
}
