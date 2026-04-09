package o4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;

/* loaded from: classes.dex */
public final class a0 implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.d f18775a;

    public a0(androidx.fragment.app.d dVar) {
        this.f18775a = dVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        androidx.fragment.app.e eVarG;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        androidx.fragment.app.d dVar = this.f18775a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, dVar);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n4.c.Fragment);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(n4.c.Fragment_android_name);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(n4.c.Fragment_android_id, -1);
            String string = typedArrayObtainStyledAttributes.getString(n4.c.Fragment_android_tag);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = androidx.fragment.app.b.class.isAssignableFrom(e0.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    androidx.fragment.app.b bVarD = resourceId != -1 ? dVar.D(resourceId) : null;
                    if (bVarD == null && string != null) {
                        bVarD = dVar.E(string);
                    }
                    if (bVarD == null && id2 != -1) {
                        bVarD = dVar.D(id2);
                    }
                    if (bVarD == null) {
                        e0 e0VarI = dVar.I();
                        context.getClassLoader();
                        bVarD = e0VarI.a(attributeValue);
                        bVarD.K = true;
                        bVarD.U = resourceId != 0 ? resourceId : id2;
                        bVarD.V = id2;
                        bVarD.W = string;
                        bVarD.L = true;
                        bVarD.Q = dVar;
                        x xVar = dVar.f1456w;
                        bVarD.R = xVar;
                        i.j jVar = xVar.f18878r;
                        bVarD.L(attributeSet, bVarD.f1411d);
                        eVarG = dVar.a(bVarD);
                        if (androidx.fragment.app.d.K(2)) {
                            bVarD.toString();
                            Integer.toHexString(resourceId);
                        }
                    } else {
                        if (bVarD.L) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                        }
                        bVarD.L = true;
                        bVarD.Q = dVar;
                        x xVar2 = dVar.f1456w;
                        bVarD.R = xVar2;
                        i.j jVar2 = xVar2.f18878r;
                        bVarD.L(attributeSet, bVarD.f1411d);
                        eVarG = dVar.g(bVarD);
                        if (androidx.fragment.app.d.K(2)) {
                            bVarD.toString();
                            Integer.toHexString(resourceId);
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    p4.c cVar = p4.d.f20249a;
                    p4.d.b(new p4.a(bVarD, "Attempting to use <fragment> tag to add fragment " + bVarD + " to container " + viewGroup));
                    p4.d.a(bVarD).getClass();
                    p4.b bVar = p4.b.PENALTY_LOG;
                    bVarD.f1412d0 = viewGroup;
                    eVarG.k();
                    eVarG.j();
                    View view2 = bVarD.f1413e0;
                    if (view2 == null) {
                        throw new IllegalStateException(h0.b.o("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (bVarD.f1413e0.getTag() == null) {
                        bVarD.f1413e0.setTag(string);
                    }
                    bVarD.f1413e0.addOnAttachStateChangeListener(new z(this, eVarG));
                    return bVarD.f1413e0;
                }
            }
        }
        return null;
    }
}
