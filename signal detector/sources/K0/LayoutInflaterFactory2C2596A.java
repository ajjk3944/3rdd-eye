package k0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import j0.AbstractC2541a;
import l0.AbstractC2632d;
import l0.C2631c;
import l0.C2633e;

/* renamed from: k0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C2596A implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final K f21474a;

    public LayoutInflaterFactory2C2596A(K k6) {
        this.f21474a = k6;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        P pF;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        K k6 = this.f21474a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, k6);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2541a.f21292a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = AbstractComponentCallbacksC2617v.class.isAssignableFrom(E.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617vB = resourceId != -1 ? k6.B(resourceId) : null;
                    if (abstractComponentCallbacksC2617vB == null && string != null) {
                        abstractComponentCallbacksC2617vB = k6.C(string);
                    }
                    if (abstractComponentCallbacksC2617vB == null && id != -1) {
                        abstractComponentCallbacksC2617vB = k6.B(id);
                    }
                    if (abstractComponentCallbacksC2617vB == null) {
                        E E6 = k6.E();
                        context.getClassLoader();
                        abstractComponentCallbacksC2617vB = E6.a(attributeValue);
                        abstractComponentCallbacksC2617vB.f21723n = true;
                        abstractComponentCallbacksC2617vB.f21688K = resourceId != 0 ? resourceId : id;
                        abstractComponentCallbacksC2617vB.f21689L = id;
                        abstractComponentCallbacksC2617vB.M = string;
                        abstractComponentCallbacksC2617vB.f21680C = true;
                        abstractComponentCallbacksC2617vB.f21684G = k6;
                        x xVar = k6.f21522u;
                        abstractComponentCallbacksC2617vB.f21685H = xVar;
                        abstractComponentCallbacksC2617vB.G(xVar.f21726j, attributeSet, abstractComponentCallbacksC2617vB.f21705b);
                        pF = k6.a(abstractComponentCallbacksC2617vB);
                        if (K.H(2)) {
                            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC2617vB + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (abstractComponentCallbacksC2617vB.f21680C) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        abstractComponentCallbacksC2617vB.f21680C = true;
                        abstractComponentCallbacksC2617vB.f21684G = k6;
                        x xVar2 = k6.f21522u;
                        abstractComponentCallbacksC2617vB.f21685H = xVar2;
                        abstractComponentCallbacksC2617vB.G(xVar2.f21726j, attributeSet, abstractComponentCallbacksC2617vB.f21705b);
                        pF = k6.f(abstractComponentCallbacksC2617vB);
                        if (K.H(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + abstractComponentCallbacksC2617vB + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    C2631c c2631c = AbstractC2632d.f21809a;
                    AbstractC2632d.b(new C2633e(abstractComponentCallbacksC2617vB, viewGroup, 0));
                    AbstractC2632d.a(abstractComponentCallbacksC2617vB).getClass();
                    abstractComponentCallbacksC2617vB.f21695S = viewGroup;
                    pF.k();
                    pF.j();
                    View view2 = abstractComponentCallbacksC2617vB.f21696T;
                    if (view2 == null) {
                        throw new IllegalStateException(A.f.m("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (abstractComponentCallbacksC2617vB.f21696T.getTag() == null) {
                        abstractComponentCallbacksC2617vB.f21696T.setTag(string);
                    }
                    abstractComponentCallbacksC2617vB.f21696T.addOnAttachStateChangeListener(new z(this, pF));
                    return abstractComponentCallbacksC2617vB.f21696T;
                }
            }
        }
        return null;
    }
}
