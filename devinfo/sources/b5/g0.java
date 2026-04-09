package b5;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g0 implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f1798a;

    public g0(u0 u0Var) {
        this.f1798a = u0Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        b1 b1VarG;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        u0 u0Var = this.f1798a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, u0Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a5.a.f200a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = z.class.isAssignableFrom(k0.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    z zVarC = resourceId != -1 ? u0Var.C(resourceId) : null;
                    if (zVarC == null && string != null) {
                        zVarC = u0Var.D(string);
                    }
                    if (zVarC == null && id2 != -1) {
                        zVarC = u0Var.C(id2);
                    }
                    if (zVarC == null) {
                        k0 k0VarH = u0Var.H();
                        context.getClassLoader();
                        zVarC = k0VarH.a(attributeValue);
                        zVarC.f1941o = true;
                        zVarC.f1951y = resourceId != 0 ? resourceId : id2;
                        zVarC.f1952z = id2;
                        zVarC.A = string;
                        zVarC.f1942p = true;
                        zVarC.f1947u = u0Var;
                        d0 d0Var = u0Var.f1898x;
                        zVarC.f1948v = d0Var;
                        i.g gVar = d0Var.f1766b;
                        zVarC.F = true;
                        if ((d0Var != null ? d0Var.f1765a : null) != null) {
                            zVarC.F = true;
                        }
                        b1VarG = u0Var.a(zVarC);
                        if (u0.K(2)) {
                            Log.v("FragmentManager", "Fragment " + zVarC + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (zVarC.f1942p) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                        }
                        zVarC.f1942p = true;
                        zVarC.f1947u = u0Var;
                        d0 d0Var2 = u0Var.f1898x;
                        zVarC.f1948v = d0Var2;
                        i.g gVar2 = d0Var2.f1766b;
                        zVarC.F = true;
                        if ((d0Var2 != null ? d0Var2.f1765a : null) != null) {
                            zVarC.F = true;
                        }
                        b1VarG = u0Var.g(zVarC);
                        if (u0.K(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + zVarC + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    c5.b bVar = c5.c.f2759a;
                    c5.c.b(new c5.d(zVarC, viewGroup, 0));
                    c5.c.a(zVarC).getClass();
                    zVarC.G = viewGroup;
                    b1VarG.k();
                    b1VarG.j();
                    View view2 = zVarC.H;
                    if (view2 == null) {
                        throw new IllegalStateException(d.h.t("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (zVarC.H.getTag() == null) {
                        zVarC.H.setTag(string);
                    }
                    zVarC.H.addOnAttachStateChangeListener(new f0(this, b1VarG));
                    return zVarC.H;
                }
            }
        }
        return null;
    }
}
