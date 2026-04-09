package l8;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public abstract class k extends ViewDataBinding {
    public final View A;

    /* renamed from: w, reason: collision with root package name */
    public final RecyclerView f23272w;

    /* renamed from: x, reason: collision with root package name */
    public final ImageView f23273x;

    /* renamed from: y, reason: collision with root package name */
    public final LinearLayout f23274y;

    /* renamed from: z, reason: collision with root package name */
    public final Toolbar f23275z;

    public k(Object obj, View view, int i10, RecyclerView recyclerView, ImageView imageView, LinearLayout linearLayout, Toolbar toolbar, View view2) {
        super(obj, view, i10);
        this.f23272w = recyclerView;
        this.f23273x = imageView;
        this.f23274y = linearLayout;
        this.f23275z = toolbar;
        this.A = view2;
    }
}
