package defpackage;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class bm0 extends iw {
    public gm0 a0;
    public RecyclerView b0;
    public boolean c0;
    public boolean d0;
    public final am0 Z = new am0(this);
    public int e0 = R.layout.preference_list_fragment;
    public final q3 f0 = new q3(this, Looper.getMainLooper());
    public final a9 g0 = new a9(11, this);

    @Override // defpackage.iw
    public final void A() {
        this.H = true;
        gm0 gm0Var = this.a0;
        gm0Var.h = this;
        gm0Var.i = this;
    }

    @Override // defpackage.iw
    public final void B() {
        this.H = true;
        gm0 gm0Var = this.a0;
        gm0Var.h = null;
        gm0Var.i = null;
    }

    @Override // defpackage.iw
    public final void C(View view, Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen2 = this.a0.g) != null) {
            preferenceScreen2.b(bundle2);
        }
        if (this.c0 && (preferenceScreen = this.a0.g) != null) {
            this.b0.setAdapter(new em0(preferenceScreen));
            preferenceScreen.j();
        }
        this.d0 = true;
    }

    public final Preference N(String str) {
        PreferenceScreen preferenceScreen;
        gm0 gm0Var = this.a0;
        if (gm0Var == null || (preferenceScreen = gm0Var.g) == null) {
            return null;
        }
        return preferenceScreen.y(str);
    }

    public abstract void O(String str);

    @Override // defpackage.iw
    public final void u(Bundle bundle) {
        super.u(bundle);
        TypedValue typedValue = new TypedValue();
        G().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        G().getTheme().applyStyle(i, false);
        gm0 gm0Var = new gm0(G());
        this.a0 = gm0Var;
        gm0Var.j = this;
        Bundle bundle2 = this.k;
        O(bundle2 != null ? bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // defpackage.iw
    public final View v(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView;
        TypedArray typedArrayObtainStyledAttributes = G().obtainStyledAttributes(null, dn0.h, R.attr.preferenceFragmentCompatStyle, 0);
        this.e0 = typedArrayObtainStyledAttributes.getResourceId(0, this.e0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(G());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.e0, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!G().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) layoutInflaterCloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
            G();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            recyclerView.setAccessibilityDelegateCompat(new hm0(recyclerView));
        }
        this.b0 = recyclerView;
        am0 am0Var = this.Z;
        recyclerView.g(am0Var);
        if (drawable != null) {
            am0Var.getClass();
            am0Var.b = drawable.getIntrinsicHeight();
        } else {
            am0Var.b = 0;
        }
        am0Var.a = drawable;
        bm0 bm0Var = am0Var.d;
        RecyclerView recyclerView2 = bm0Var.b0;
        if (recyclerView2.t.size() != 0) {
            ho0 ho0Var = recyclerView2.r;
            if (ho0Var != null) {
                ho0Var.c("Cannot invalidate item decorations during a scroll or layout");
            }
            recyclerView2.N();
            recyclerView2.requestLayout();
        }
        if (dimensionPixelSize != -1) {
            am0Var.b = dimensionPixelSize;
            RecyclerView recyclerView3 = bm0Var.b0;
            if (recyclerView3.t.size() != 0) {
                ho0 ho0Var2 = recyclerView3.r;
                if (ho0Var2 != null) {
                    ho0Var2.c("Cannot invalidate item decorations during a scroll or layout");
                }
                recyclerView3.N();
                recyclerView3.requestLayout();
            }
        }
        am0Var.c = z;
        if (this.b0.getParent() == null) {
            viewGroup2.addView(this.b0);
        }
        this.f0.post(this.g0);
        return viewInflate;
    }

    @Override // defpackage.iw
    public final void w() {
        a9 a9Var = this.g0;
        q3 q3Var = this.f0;
        q3Var.removeCallbacks(a9Var);
        q3Var.removeMessages(1);
        if (this.c0) {
            this.b0.setAdapter(null);
            PreferenceScreen preferenceScreen = this.a0.g;
            if (preferenceScreen != null) {
                preferenceScreen.n();
            }
        }
        this.b0 = null;
        this.H = true;
    }

    @Override // defpackage.iw
    public final void z(Bundle bundle) {
        PreferenceScreen preferenceScreen = this.a0.g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.c(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }
}
