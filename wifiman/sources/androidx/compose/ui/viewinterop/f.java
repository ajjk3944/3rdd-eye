package androidx.compose.ui.viewinterop;

import E0.AbstractC2633k;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.e;
import l0.C6533i;

/* loaded from: classes.dex */
public abstract class f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar) {
        return androidx.compose.ui.focus.i.a(androidx.compose.ui.focus.i.a(eVar.b0(FocusGroupPropertiesElement.f29761a)).b0(FocusTargetPropertiesElement.f29762a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect f(k0.g gVar, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        C6533i c6533iI = gVar.i();
        if (c6533iI == null) {
            return null;
        }
        return new Rect((((int) c6533iI.k()) + iArr[0]) - iArr2[0], (((int) c6533iI.n()) + iArr[1]) - iArr2[1], (((int) c6533iI.l()) + iArr[0]) - iArr2[0], (((int) c6533iI.e()) + iArr[1]) - iArr2[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View g(e.c cVar) {
        View viewR = AbstractC2633k.m(cVar.h1()).R();
        if (viewR != null) {
            return viewR;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }
}
