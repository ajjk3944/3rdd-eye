package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nw implements LayoutInflater.Factory2 {
    public final xw f;

    public nw(xw xwVar) {
        this.f = xwVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        ex exVarF;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        xw xwVar = this.f;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, xwVar);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cn0.a);
            int i = 0;
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = iw.class.isAssignableFrom(sw.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    iw iwVarA = resourceId != -1 ? xwVar.A(resourceId) : null;
                    if (iwVarA == null && string != null) {
                        iwVarA = xwVar.B(string);
                    }
                    if (iwVarA == null && id != -1) {
                        iwVarA = xwVar.A(id);
                    }
                    if (iwVarA == null) {
                        sw swVarD = xwVar.D();
                        context.getClassLoader();
                        iwVarA = swVarD.a(attributeValue);
                        iwVarA.r = true;
                        iwVarA.A = resourceId != 0 ? resourceId : id;
                        iwVarA.B = id;
                        iwVarA.C = string;
                        iwVarA.s = true;
                        iwVarA.w = xwVar;
                        kw kwVar = xwVar.t;
                        iwVarA.x = kwVar;
                        i5 i5Var = kwVar.x;
                        iwVarA.H = true;
                        if ((kwVar != null ? kwVar.w : null) != null) {
                            iwVarA.H = true;
                        }
                        exVarF = xwVar.a(iwVarA);
                        if (xw.F(2)) {
                            iwVarA.toString();
                            Integer.toHexString(resourceId);
                        }
                    } else {
                        if (iwVarA.s) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        iwVarA.s = true;
                        iwVarA.w = xwVar;
                        kw kwVar2 = xwVar.t;
                        iwVarA.x = kwVar2;
                        i5 i5Var2 = kwVar2.x;
                        iwVarA.H = true;
                        if ((kwVar2 != null ? kwVar2.w : null) != null) {
                            iwVarA.H = true;
                        }
                        exVarF = xwVar.f(iwVarA);
                        if (xw.F(2)) {
                            iwVarA.toString();
                            Integer.toHexString(resourceId);
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    fx fxVar = gx.a;
                    gx.b(new hx(iwVarA, viewGroup, 0));
                    gx.a(iwVarA).getClass();
                    iwVarA.I = viewGroup;
                    exVarF.k();
                    exVarF.j();
                    View view2 = iwVarA.J;
                    if (view2 == null) {
                        throw new IllegalStateException(ex0.h("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (iwVarA.J.getTag() == null) {
                        iwVarA.J.setTag(string);
                    }
                    iwVarA.J.addOnAttachStateChangeListener(new mw(this, exVarF, i));
                    return iwVarA.J;
                }
            }
        }
        return null;
    }
}
