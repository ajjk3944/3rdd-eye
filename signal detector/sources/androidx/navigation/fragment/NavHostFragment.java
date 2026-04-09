package androidx.navigation.fragment;

import C0.y;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import c5.C0410g;
import com.apm.insight.R;
import com.bumptech.glide.c;
import k0.AbstractComponentCallbacksC2617v;
import k0.C2597a;
import q0.N;
import q0.z;
import q5.i;
import s0.AbstractC2889j;

/* loaded from: classes.dex */
public class NavHostFragment extends AbstractComponentCallbacksC2617v {

    /* renamed from: k0, reason: collision with root package name */
    public final C0410g f5268k0 = new C0410g(new y(7, this));

    /* renamed from: l0, reason: collision with root package name */
    public View f5269l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f5270m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f5271n0;

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void A(Context context) {
        i.e(context, "context");
        super.A(context);
        if (this.f5271n0) {
            C2597a c2597a = new C2597a(p());
            c2597a.j(this);
            c2597a.d(false);
        }
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void B(Bundle bundle) {
        X();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.f5271n0 = true;
            C2597a c2597a = new C2597a(p());
            c2597a.j(this);
            c2597a.d(false);
        }
        super.B(bundle);
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        i.e(layoutInflater, "inflater");
        Context context = layoutInflater.getContext();
        i.d(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int i = this.f21688K;
        if (i == 0 || i == -1) {
            i = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(i);
        return fragmentContainerView;
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void D() {
        this.f21694R = true;
        View view = this.f5269l0;
        if (view != null && c.m(view) == X()) {
            view.setTag(R.id.nav_controller_view_tag, null);
        }
        this.f5269l0 = null;
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void G(Context context, AttributeSet attributeSet, Bundle bundle) {
        i.e(context, "context");
        i.e(attributeSet, "attrs");
        super.G(context, attributeSet, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, N.f22943b);
        i.d(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f5270m0 = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC2889j.f23426c);
        i.d(typedArrayObtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (typedArrayObtainStyledAttributes2.getBoolean(0, false)) {
            this.f5271n0 = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void J(Bundle bundle) {
        if (this.f5271n0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // k0.AbstractComponentCallbacksC2617v
    public final void M(View view) {
        i.e(view, "view");
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        view.setTag(R.id.nav_controller_view_tag, X());
        if (view.getParent() != null) {
            Object parent = view.getParent();
            i.c(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            this.f5269l0 = view2;
            if (view2.getId() == this.f21688K) {
                View view3 = this.f5269l0;
                i.b(view3);
                view3.setTag(R.id.nav_controller_view_tag, X());
            }
        }
    }

    public final z X() {
        return (z) this.f5268k0.getValue();
    }
}
