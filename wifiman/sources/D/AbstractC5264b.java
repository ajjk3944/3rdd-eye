package d;

import T.AbstractC3550q;
import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.C3929j0;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import c.AbstractActivityC4155j;
import mh.InterfaceC6839p;
import q2.AbstractC7419g;

/* renamed from: d.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5264b {

    /* renamed from: a, reason: collision with root package name */
    private static final ViewGroup.LayoutParams f45670a = new ViewGroup.LayoutParams(-2, -2);

    public static final void a(AbstractActivityC4155j abstractActivityC4155j, AbstractC3550q abstractC3550q, InterfaceC6839p interfaceC6839p) {
        View childAt = ((ViewGroup) abstractActivityC4155j.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        C3929j0 c3929j0 = childAt instanceof C3929j0 ? (C3929j0) childAt : null;
        if (c3929j0 != null) {
            c3929j0.setParentCompositionContext(abstractC3550q);
            c3929j0.setContent(interfaceC6839p);
            return;
        }
        C3929j0 c3929j02 = new C3929j0(abstractActivityC4155j, null, 0, 6, null);
        c3929j02.setParentCompositionContext(abstractC3550q);
        c3929j02.setContent(interfaceC6839p);
        c(abstractActivityC4155j);
        abstractActivityC4155j.setContentView(c3929j02, f45670a);
    }

    public static /* synthetic */ void b(AbstractActivityC4155j abstractActivityC4155j, AbstractC3550q abstractC3550q, InterfaceC6839p interfaceC6839p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC3550q = null;
        }
        a(abstractActivityC4155j, abstractC3550q, interfaceC6839p);
    }

    private static final void c(AbstractActivityC4155j abstractActivityC4155j) {
        View decorView = abstractActivityC4155j.getWindow().getDecorView();
        if (T.a(decorView) == null) {
            T.b(decorView, abstractActivityC4155j);
        }
        if (U.a(decorView) == null) {
            U.b(decorView, abstractActivityC4155j);
        }
        if (AbstractC7419g.a(decorView) == null) {
            AbstractC7419g.b(decorView, abstractActivityC4155j);
        }
    }
}
