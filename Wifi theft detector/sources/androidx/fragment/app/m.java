package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentStrictMode;

/* loaded from: classes.dex */
public class m implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final FragmentManager f3339a;

    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w f3340a;

        public a(w wVar) {
            this.f3340a = wVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentK = this.f3340a.k();
            this.f3340a.m();
            SpecialEffectsController.n((ViewGroup) fragmentK.mView.getParent(), m.this.f3339a).j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public m(FragmentManager fragmentManager) {
        this.f3339a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        w wVarW;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f3339a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g1.c.Fragment);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(g1.c.Fragment_android_name);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(g1.c.Fragment_android_id, -1);
        String string = typedArrayObtainStyledAttributes.getString(g1.c.Fragment_android_tag);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !k.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentH0 = resourceId != -1 ? this.f3339a.h0(resourceId) : null;
        if (fragmentH0 == null && string != null) {
            fragmentH0 = this.f3339a.i0(string);
        }
        if (fragmentH0 == null && id != -1) {
            fragmentH0 = this.f3339a.h0(id);
        }
        if (fragmentH0 == null) {
            fragmentH0 = this.f3339a.t0().a(context.getClassLoader(), attributeValue);
            fragmentH0.mFromLayout = true;
            fragmentH0.mFragmentId = resourceId != 0 ? resourceId : id;
            fragmentH0.mContainerId = id;
            fragmentH0.mTag = string;
            fragmentH0.mInLayout = true;
            FragmentManager fragmentManager = this.f3339a;
            fragmentH0.mFragmentManager = fragmentManager;
            fragmentH0.mHost = fragmentManager.v0();
            fragmentH0.onInflate(this.f3339a.v0().f(), attributeSet, fragmentH0.mSavedFragmentState);
            wVarW = this.f3339a.j(fragmentH0);
            if (FragmentManager.I0(2)) {
                Log.v("FragmentManager", "Fragment " + fragmentH0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (fragmentH0.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            fragmentH0.mInLayout = true;
            FragmentManager fragmentManager2 = this.f3339a;
            fragmentH0.mFragmentManager = fragmentManager2;
            fragmentH0.mHost = fragmentManager2.v0();
            fragmentH0.onInflate(this.f3339a.v0().f(), attributeSet, fragmentH0.mSavedFragmentState);
            wVarW = this.f3339a.w(fragmentH0);
            if (FragmentManager.I0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + fragmentH0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        FragmentStrictMode.g(fragmentH0, viewGroup);
        fragmentH0.mContainer = viewGroup;
        wVarW.m();
        wVarW.j();
        View view2 = fragmentH0.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentH0.mView.getTag() == null) {
            fragmentH0.mView.setTag(string);
        }
        fragmentH0.mView.addOnAttachStateChangeListener(new a(wVarW));
        return fragmentH0.mView;
    }
}
