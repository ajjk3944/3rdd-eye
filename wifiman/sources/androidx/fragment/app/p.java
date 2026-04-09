package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
class p implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    final w f31468a;

    class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C f31469a;

        a(C c10) {
            this.f31469a = c10;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentK = this.f31469a.k();
            this.f31469a.m();
            K.n((ViewGroup) fragmentK.f31230I.getParent(), p.this.f31468a).j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    p(w wVar) {
        this.f31468a = wVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C cT;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f31468a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, U1.c.f22127a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(U1.c.f22128b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(U1.c.f22129c, -1);
        String string = typedArrayObtainStyledAttributes.getString(U1.c.f22130d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !n.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id2 = view != null ? view.getId() : 0;
        if (id2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentE0 = resourceId != -1 ? this.f31468a.e0(resourceId) : null;
        if (fragmentE0 == null && string != null) {
            fragmentE0 = this.f31468a.f0(string);
        }
        if (fragmentE0 == null && id2 != -1) {
            fragmentE0 = this.f31468a.e0(id2);
        }
        if (fragmentE0 == null) {
            fragmentE0 = this.f31468a.p0().a(context.getClassLoader(), attributeValue);
            fragmentE0.f31259o = true;
            fragmentE0.f31272x = resourceId != 0 ? resourceId : id2;
            fragmentE0.f31273y = id2;
            fragmentE0.f31274z = string;
            fragmentE0.f31261p = true;
            w wVar = this.f31468a;
            fragmentE0.f31268t = wVar;
            fragmentE0.f31269u = wVar.r0();
            fragmentE0.A0(this.f31468a.r0().g(), attributeSet, fragmentE0.f31237b);
            cT = this.f31468a.h(fragmentE0);
            if (w.E0(2)) {
                Log.v("FragmentManager", "Fragment " + fragmentE0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (fragmentE0.f31261p) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
            }
            fragmentE0.f31261p = true;
            w wVar2 = this.f31468a;
            fragmentE0.f31268t = wVar2;
            fragmentE0.f31269u = wVar2.r0();
            fragmentE0.A0(this.f31468a.r0().g(), attributeSet, fragmentE0.f31237b);
            cT = this.f31468a.t(fragmentE0);
            if (w.E0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + fragmentE0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        V1.b.g(fragmentE0, viewGroup);
        fragmentE0.f31229H = viewGroup;
        cT.m();
        cT.j();
        View view2 = fragmentE0.f31230I;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentE0.f31230I.getTag() == null) {
            fragmentE0.f31230I.setTag(string);
        }
        fragmentE0.f31230I.addOnAttachStateChangeListener(new a(cT));
        return fragmentE0.f31230I;
    }
}
