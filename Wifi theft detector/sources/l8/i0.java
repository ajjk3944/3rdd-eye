package l8;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.wifihacker.detector.mvp.view.widget.CustomRecyclerView;

/* loaded from: classes3.dex */
public abstract class i0 extends ViewDataBinding {

    /* renamed from: w, reason: collision with root package name */
    public final CustomRecyclerView f23263w;

    /* renamed from: x, reason: collision with root package name */
    public final TextView f23264x;

    /* renamed from: y, reason: collision with root package name */
    public final u1 f23265y;

    public i0(Object obj, View view, int i10, CustomRecyclerView customRecyclerView, TextView textView, u1 u1Var) {
        super(obj, view, i10);
        this.f23263w = customRecyclerView;
        this.f23264x = textView;
        this.f23265y = u1Var;
    }
}
