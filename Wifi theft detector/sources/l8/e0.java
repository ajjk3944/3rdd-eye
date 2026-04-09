package l8;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class e0 extends ViewDataBinding {
    public final TextView A;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f23238w;

    /* renamed from: x, reason: collision with root package name */
    public final LinearLayout f23239x;

    /* renamed from: y, reason: collision with root package name */
    public final RelativeLayout f23240y;

    /* renamed from: z, reason: collision with root package name */
    public final FrameLayout f23241z;

    public e0(Object obj, View view, int i10, ImageView imageView, LinearLayout linearLayout, RelativeLayout relativeLayout, FrameLayout frameLayout, TextView textView) {
        super(obj, view, i10);
        this.f23238w = imageView;
        this.f23239x = linearLayout;
        this.f23240y = relativeLayout;
        this.f23241z = frameLayout;
        this.A = textView;
    }
}
