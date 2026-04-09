package androidx.compose.ui.viewinterop;

import C0.AbstractC2538s;
import E0.G;
import android.view.View;
import l0.C6531g;
import x0.InterfaceC8412a;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final a f29821a = new a();

    public static final class a implements InterfaceC8412a {
        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(View view, G g10) {
        long jE = AbstractC2538s.e(g10.c());
        int iRound = Math.round(C6531g.m(jE));
        int iRound2 = Math.round(C6531g.n(jE));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(int i10) {
        return i10 * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(float f10) {
        return f10 * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(int i10) {
        return i10 == 0 ? x0.e.f65322a.b() : x0.e.f65322a.a();
    }
}
