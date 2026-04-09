package l8;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class i extends ViewDataBinding {

    /* renamed from: w, reason: collision with root package name */
    public final CardView f23260w;

    /* renamed from: x, reason: collision with root package name */
    public final u1 f23261x;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f23262y;

    public i(Object obj, View view, int i10, CardView cardView, u1 u1Var, TextView textView) {
        super(obj, view, i10);
        this.f23260w = cardView;
        this.f23261x = u1Var;
        this.f23262y = textView;
    }
}
