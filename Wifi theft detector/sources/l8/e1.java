package l8;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public abstract class e1 extends ViewDataBinding {

    /* renamed from: w, reason: collision with root package name */
    public final RecyclerView f23242w;

    /* renamed from: x, reason: collision with root package name */
    public final LinearLayout f23243x;

    /* renamed from: y, reason: collision with root package name */
    public final View f23244y;

    public e1(Object obj, View view, int i10, RecyclerView recyclerView, LinearLayout linearLayout, View view2) {
        super(obj, view, i10);
        this.f23242w = recyclerView;
        this.f23243x = linearLayout;
        this.f23244y = view2;
    }
}
