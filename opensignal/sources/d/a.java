package d;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.tooling.PreviewActivity;
import androidx.lifecycle.o0;
import androidx.lifecycle.w0;
import com.google.android.gms.internal.measurement.i4;
import se.b;
import v0.d;
import y1.b1;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f6756a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(PreviewActivity previewActivity, d dVar) {
        View childAt = ((ViewGroup) previewActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        w0 w0Var = null;
        b1 b1Var = childAt instanceof b1 ? (b1) childAt : null;
        if (b1Var != null) {
            b1Var.setParentCompositionContext(null);
            b1Var.setContent(dVar);
            return;
        }
        b1 b1Var2 = new b1(previewActivity);
        b1Var2.setParentCompositionContext(null);
        b1Var2.setContent(dVar);
        View decorView = previewActivity.getWindow().getDecorView();
        if (o0.c(decorView) == null) {
            o0.f(decorView, previewActivity);
        }
        View view = decorView;
        while (true) {
            if (view == null) {
                break;
            }
            Object tag = view.getTag(v4.d.view_tree_view_model_store_owner);
            w0 w0Var2 = tag instanceof w0 ? (w0) tag : null;
            if (w0Var2 != null) {
                w0Var = w0Var2;
                break;
            } else {
                Object objB = b.B(view);
                view = objB instanceof View ? (View) objB : null;
            }
        }
        if (w0Var == null) {
            decorView.setTag(v4.d.view_tree_view_model_store_owner, previewActivity);
        }
        if (i4.q(decorView) == null) {
            i4.C(decorView, previewActivity);
        }
        previewActivity.setContentView(b1Var2, f6756a);
    }
}
