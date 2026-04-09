package B4;

import C.W;
import C.k0;
import C6.o;
import C6.r;
import E.u;
import H6.C0672i;
import H6.C0675l;
import H6.L;
import H6.M;
import I4.n;
import I4.t;
import J4.p;
import K1.i;
import L6.e;
import N7.Z;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;
import q5.e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements e.a, W.c, I4.d, i.e, l7.l, l7.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f500b;

    public /* synthetic */ g(int i) {
        this.f500b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(L6.e r16, android.view.View r17, int r18, int r19, int r20, int r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B4.g.f(L6.e, android.view.View, int, int, int, int, boolean):void");
    }

    public static void h(L6.e eVar, RecyclerView recyclerView, RecyclerView.w recycler) {
        kotlin.jvm.internal.l.f(recycler, "recycler");
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            eVar.m(recyclerView.getChildAt(i), true);
        }
    }

    public static void i(L6.e eVar) {
        Iterator it = eVar.a().iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            eVar.b(view, view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), true);
        }
        eVar.a().clear();
    }

    public static int j(int i, int i10, int i11, int i12, int i13, boolean z10) {
        int i14 = i - i11;
        if (i14 < 0) {
            i14 = 0;
        }
        return (i12 < 0 || i12 > Integer.MAX_VALUE) ? i12 == -1 ? (z10 && i10 == 0) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i14, i10) : i12 == -2 ? i13 == Integer.MAX_VALUE ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i13, RecyclerView.UNDEFINED_DURATION) : i12 == -3 ? (i10 == Integer.MIN_VALUE || i10 == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.min(i14, i13), RecyclerView.UNDEFINED_DURATION) : i13 == Integer.MAX_VALUE ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i13, RecyclerView.UNDEFINED_DURATION) : View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
    }

    public static void k(int i, int i10, L6.e eVar, L6.l scrollPosition) {
        kotlin.jvm.internal.l.f(scrollPosition, "scrollPosition");
        RecyclerView view = eVar.getView();
        if (!r.c(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new L6.f(i, i10, eVar, scrollPosition));
            return;
        }
        if (i == 0) {
            if (eVar.q() != 0 || !r.d(eVar.getView())) {
                i10 = -i10;
            }
            eVar.getView().scrollBy(i10, i10);
            return;
        }
        eVar.getView().scrollBy(-eVar.getView().getScrollX(), -eVar.getView().getScrollY());
        RecyclerView.p layoutManager = eVar.getView().getLayoutManager();
        View viewJ = layoutManager != null ? layoutManager.J(i) : null;
        while (viewJ == null && (eVar.getView().canScrollVertically(1) || eVar.getView().canScrollHorizontally(1))) {
            RecyclerView.p layoutManager2 = eVar.getView().getLayoutManager();
            if (layoutManager2 != null) {
                layoutManager2.J0();
            }
            RecyclerView.p layoutManager3 = eVar.getView().getLayoutManager();
            viewJ = layoutManager3 != null ? layoutManager3.J(i) : null;
            if (viewJ != null) {
                break;
            } else {
                eVar.getView().scrollBy(eVar.getView().getWidth(), eVar.getView().getHeight());
            }
        }
        if (viewJ != null) {
            int i11 = e.b.f4088a[scrollPosition.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    return;
                }
                int iM = m(eVar, viewJ) - i10;
                if (r.d(eVar.getView())) {
                    iM = -iM;
                }
                eVar.getView().scrollBy(iM, iM);
                return;
            }
            int[] iArr = {0, 0};
            int[] iArr2 = {0, 0};
            eVar.getView().getLocationOnScreen(iArr2);
            viewJ.getLocationOnScreen(iArr);
            eVar.getView().scrollBy(((viewJ.getWidth() - eVar.getView().getWidth()) / 2) + (iArr[0] - iArr2[0]), ((viewJ.getHeight() - eVar.getView().getHeight()) / 2) + (iArr[1] - iArr2[1]));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void l(L6.e eVar, View child, boolean z10) {
        C0672i bindingContext;
        kotlin.jvm.internal.l.f(child, "child");
        int i = eVar.i(child);
        if (i == -1) {
            return;
        }
        ViewGroup viewGroup = child instanceof ViewGroup ? (ViewGroup) child : null;
        if (viewGroup == null) {
            return;
        }
        o oVar = new o(viewGroup, 1);
        View view = (View) (!oVar.hasNext() ? null : oVar.next());
        if (view == 0) {
            return;
        }
        C0675l c0675l = eVar.getBindingContext().f2146a;
        if (!z10) {
            i7.b bVarP = eVar.p(i);
            if (bVarP == null) {
                return;
            }
            L lB = c0675l.getDiv2Component$div_release().B();
            C0672i c0672iA = eVar.getBindingContext().a(bVarP.f38461b);
            Z z11 = bVarP.f38460a;
            lB.e(c0672iA, view, z11);
            c0675l.q(view, z11);
            return;
        }
        c0675l.getClass();
        Z z12 = c0675l.f2157A.get(view);
        if (z12 == null) {
            return;
        }
        O6.l lVar = view instanceof O6.l ? (O6.l) view : null;
        if (lVar == null || (bindingContext = lVar.getBindingContext()) == null) {
            return;
        }
        L.g(bindingContext, view, z12, new M(c0675l.getDiv2Component$div_release().B(), bindingContext));
        c0675l.N(view);
    }

    public static int m(L6.e eVar, View view) {
        int marginStart;
        int paddingStart;
        if (eVar.q() == 0) {
            int width = r.d(view) ? eVar.getView().getWidth() - view.getRight() : view.getLeft();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            marginStart = width - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
            paddingStart = eVar.getView().getPaddingStart();
        } else {
            int top = view.getTop();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            marginStart = top - (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            paddingStart = eVar.getView().getPaddingTop();
        }
        return marginStart - paddingStart;
    }

    public static int n(int i, int i10, String str) {
        return (str.hashCode() + i) * i10;
    }

    public static String o(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static boolean p(D7.f fVar, String str, JSONObject jSONObject, String str2) {
        kotlin.jvm.internal.l.f(fVar, str);
        kotlin.jvm.internal.l.f(jSONObject, str2);
        return fVar.e();
    }

    @Override // l7.g
    public boolean a(List it) {
        switch (this.f500b) {
            case 10:
                kotlin.jvm.internal.l.f(it, "it");
                return it.size() >= 1;
            default:
                kotlin.jvm.internal.l.f(it, "it");
                return it.size() >= 2;
        }
    }

    @Override // K1.i.e
    public void b(i.d dVar, K1.i iVar) {
        dVar.e(iVar);
    }

    @Override // C.W.c
    public void c(k0 k0Var) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(k0Var.f732b.getWidth(), k0Var.f732b.getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        k0Var.b(surface, u.y(), new K0.b() { // from class: J.d
            @Override // K0.b
            public final void accept(Object obj) {
                surface.release();
                surfaceTexture.release();
            }
        });
    }

    @Override // q5.e.a
    public String d(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    @Override // l7.l
    public boolean e(Object obj) {
        switch (this.f500b) {
            case 9:
                return ((Long) obj).longValue() >= 0;
            case 10:
            case 27:
            default:
                return ((Double) obj).doubleValue() >= 0.0d;
            case 11:
                return ((Long) obj).longValue() >= 0;
            case 12:
                return ((Long) obj).longValue() >= 0;
            case 13:
                return ((Long) obj).longValue() >= 0;
            case 14:
                return ((Long) obj).longValue() >= 0;
            case 15:
                return ((Long) obj).longValue() >= 0;
            case 16:
                return ((Long) obj).longValue() >= 0;
            case 17:
                double dDoubleValue = ((Double) obj).doubleValue();
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 18:
                return ((String) obj).length() >= 1;
            case 19:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                return dDoubleValue2 >= 0.0d && dDoubleValue2 <= 1.0d;
            case 20:
                return ((Long) obj).longValue() >= 0;
            case 21:
                return ((Long) obj).longValue() >= 0;
            case 22:
                return ((Long) obj).longValue() >= 0;
            case 23:
                return ((Long) obj).longValue() >= 0;
            case 24:
                return ((Double) obj).doubleValue() > 0.0d;
            case 25:
                return ((Long) obj).longValue() >= 0;
            case 26:
                return ((Long) obj).longValue() >= 0;
            case 28:
                double dDoubleValue3 = ((Double) obj).doubleValue();
                return dDoubleValue3 >= 0.0d && dDoubleValue3 <= 1.0d;
        }
    }

    @Override // I4.d
    public Object g(t tVar) {
        n<ScheduledExecutorService> nVar = ExecutorsRegistrar.f23245a;
        return p.INSTANCE;
    }
}
