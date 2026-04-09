package l8;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class y extends ViewDataBinding {
    public final FrameLayout A;

    /* renamed from: w, reason: collision with root package name */
    public final RelativeLayout f23358w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f23359x;

    /* renamed from: y, reason: collision with root package name */
    public final ImageView f23360y;

    /* renamed from: z, reason: collision with root package name */
    public final ImageView f23361z;

    public y(Object obj, View view, int i10, RelativeLayout relativeLayout, TextView textView, ImageView imageView, ImageView imageView2, FrameLayout frameLayout) {
        super(obj, view, i10);
        this.f23358w = relativeLayout;
        this.f23359x = textView;
        this.f23360y = imageView;
        this.f23361z = imageView2;
        this.A = frameLayout;
    }
}
