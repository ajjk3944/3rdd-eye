package l8;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.wifihacker.detector.mvp.view.widget.RecyclerViewHeader;

/* loaded from: classes3.dex */
public abstract class a1 extends ViewDataBinding {
    public final ProgressBar A;
    public final RecyclerView B;
    public final View C;
    public final y1 D;

    /* renamed from: w, reason: collision with root package name */
    public final FloatingActionButton f23216w;

    /* renamed from: x, reason: collision with root package name */
    public final CoordinatorLayout f23217x;

    /* renamed from: y, reason: collision with root package name */
    public final LinearLayout f23218y;

    /* renamed from: z, reason: collision with root package name */
    public final RecyclerViewHeader f23219z;

    public a1(Object obj, View view, int i10, FloatingActionButton floatingActionButton, CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, RecyclerViewHeader recyclerViewHeader, ProgressBar progressBar, RecyclerView recyclerView, View view2, y1 y1Var) {
        super(obj, view, i10);
        this.f23216w = floatingActionButton;
        this.f23217x = coordinatorLayout;
        this.f23218y = linearLayout;
        this.f23219z = recyclerViewHeader;
        this.A = progressBar;
        this.B = recyclerView;
        this.C = view2;
        this.D = y1Var;
    }
}
