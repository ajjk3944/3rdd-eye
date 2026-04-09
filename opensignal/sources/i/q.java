package i;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p.y2;
import p.z2;
import u3.h1;
import u3.v0;
import u3.w0;
import u3.x0;
import u3.y0;

/* loaded from: classes.dex */
public final class q implements u3.n, o.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f11107a;

    public /* synthetic */ q(a0 a0Var) {
        this.f11107a = a0Var;
    }

    @Override // o.x
    public boolean Q(o.m mVar) {
        Window.Callback callback;
        if (mVar != mVar.k()) {
            return true;
        }
        a0 a0Var = this.f11107a;
        if (!a0Var.f10965b0 || (callback = a0Var.H.getCallback()) == null || a0Var.f10976m0) {
            return true;
        }
        callback.onMenuOpened(108, mVar);
        return true;
    }

    @Override // o.x
    public void c(o.m mVar, boolean z10) {
        z zVar;
        o.m mVarK = mVar.k();
        int i10 = 0;
        boolean z11 = mVarK != mVar;
        if (z11) {
            mVar = mVarK;
        }
        a0 a0Var = this.f11107a;
        z[] zVarArr = a0Var.f10971h0;
        int length = zVarArr != null ? zVarArr.length : 0;
        while (true) {
            if (i10 < length) {
                zVar = zVarArr[i10];
                if (zVar != null && zVar.f11128h == mVar) {
                    break;
                } else {
                    i10++;
                }
            } else {
                zVar = null;
                break;
            }
        }
        if (zVar != null) {
            if (!z11) {
                a0Var.q(zVar, z10);
            } else {
                a0Var.o(zVar.f11121a, zVar, mVarK);
                a0Var.q(zVar, true);
            }
        }
    }

    @Override // u3.n
    public h1 c0(View view, h1 h1Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i10;
        boolean z10;
        boolean z11;
        h1 h1VarB = h1Var;
        int iD = h1VarB.d();
        a0 a0Var = this.f11107a;
        Context context = a0Var.G;
        int iD2 = h1VarB.d();
        ActionBarContextView actionBarContextView = a0Var.R;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i10 = 0;
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a0Var.R.getLayoutParams();
            if (a0Var.R.isShown()) {
                if (a0Var.f10988y0 == null) {
                    a0Var.f10988y0 = new Rect();
                    a0Var.f10989z0 = new Rect();
                }
                Rect rect = a0Var.f10988y0;
                Rect rect2 = a0Var.f10989z0;
                rect.set(h1VarB.b(), h1VarB.d(), h1VarB.c(), h1VarB.a());
                ViewGroup viewGroup = a0Var.W;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z12 = z2.f20220a;
                    y2.a(viewGroup, rect, rect2);
                } else {
                    if (!z2.f20220a) {
                        z2.f20220a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            z2.f20221b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                z2.f20221b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    Method method = z2.f20221b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                int i11 = rect.top;
                int i12 = rect.left;
                int i13 = rect.right;
                ViewGroup viewGroup2 = a0Var.W;
                WeakHashMap weakHashMap = u3.i0.f23177a;
                h1 h1VarA = u3.a0.a(viewGroup2);
                int iB = h1VarA == null ? 0 : h1VarA.b();
                int iC = h1VarA == null ? 0 : h1VarA.c();
                if (marginLayoutParams.topMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    z11 = true;
                }
                if (i11 <= 0 || a0Var.Y != null) {
                    View view2 = a0Var.Y;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i14 = marginLayoutParams2.height;
                        int i15 = marginLayoutParams.topMargin;
                        if (i14 != i15 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i15;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            a0Var.Y.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    a0Var.Y = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    a0Var.W.addView(a0Var.Y, -1, layoutParams);
                }
                View view4 = a0Var.Y;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = a0Var.Y;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(h.c.abc_decor_view_status_guard_light) : context.getColor(h.c.abc_decor_view_status_guard));
                }
                if (!a0Var.f10967d0 && z) {
                    iD2 = 0;
                }
                z10 = z;
                i10 = 0;
                z = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                i10 = 0;
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                i10 = 0;
                z10 = false;
                z = false;
            }
            if (z) {
                a0Var.R.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = a0Var.Y;
        if (view6 != null) {
            view6.setVisibility(z10 ? i10 : 8);
        }
        if (iD != iD2) {
            int iB2 = h1VarB.b();
            int iC2 = h1VarB.c();
            int iA = h1VarB.a();
            int i16 = Build.VERSION.SDK_INT;
            y0 x0Var = i16 >= 30 ? new x0(h1VarB) : i16 >= 29 ? new w0(h1VarB) : new v0(h1VarB);
            x0Var.g(k3.d.b(iB2, iD2, iC2, iA));
            h1VarB = x0Var.b();
        }
        return u3.i0.i(view, h1VarB);
    }
}
