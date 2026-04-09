package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.PagerAdapter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class x extends PagerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final FragmentManager f3380a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3381b;

    /* renamed from: c, reason: collision with root package name */
    public z f3382c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f3383d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3384e;

    /* renamed from: f, reason: collision with root package name */
    public Fragment f3385f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3386g;

    public x(FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    public abstract Fragment a(int i10);

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f3382c == null) {
            this.f3382c = this.f3380a.p();
        }
        while (this.f3383d.size() <= i10) {
            this.f3383d.add(null);
        }
        this.f3383d.set(i10, fragment.isAdded() ? this.f3380a.k1(fragment) : null);
        this.f3384e.set(i10, null);
        this.f3382c.m(fragment);
        if (fragment.equals(this.f3385f)) {
            this.f3385f = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        z zVar = this.f3382c;
        if (zVar != null) {
            if (!this.f3386g) {
                try {
                    this.f3386g = true;
                    zVar.j();
                } finally {
                    this.f3386g = false;
                }
            }
            this.f3382c = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i10) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f3384e.size() > i10 && (fragment = (Fragment) this.f3384e.get(i10)) != null) {
            return fragment;
        }
        if (this.f3382c == null) {
            this.f3382c = this.f3380a.p();
        }
        Fragment fragmentA = a(i10);
        if (this.f3383d.size() > i10 && (savedState = (Fragment.SavedState) this.f3383d.get(i10)) != null) {
            fragmentA.setInitialSavedState(savedState);
        }
        while (this.f3384e.size() <= i10) {
            this.f3384e.add(null);
        }
        fragmentA.setMenuVisibility(false);
        if (this.f3381b == 0) {
            fragmentA.setUserVisibleHint(false);
        }
        this.f3384e.set(i10, fragmentA);
        this.f3382c.b(viewGroup.getId(), fragmentA);
        if (this.f3381b == 1) {
            this.f3382c.p(fragmentA, Lifecycle.State.STARTED);
        }
        return fragmentA;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) throws NumberFormatException {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f3383d.clear();
            this.f3384e.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f3383d.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int i10 = Integer.parseInt(str.substring(1));
                    Fragment fragmentR0 = this.f3380a.r0(bundle, str);
                    if (fragmentR0 != null) {
                        while (this.f3384e.size() <= i10) {
                            this.f3384e.add(null);
                        }
                        fragmentR0.setMenuVisibility(false);
                        this.f3384e.set(i10, fragmentR0);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        Bundle bundle;
        if (this.f3383d.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f3383d.size()];
            this.f3383d.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i10 = 0; i10 < this.f3384e.size(); i10++) {
            Fragment fragment = (Fragment) this.f3384e.get(i10);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f3380a.c1(bundle, "f" + i10, fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f3385f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f3381b == 1) {
                    if (this.f3382c == null) {
                        this.f3382c = this.f3380a.p();
                    }
                    this.f3382c.p(this.f3385f, Lifecycle.State.STARTED);
                } else {
                    this.f3385f.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f3381b == 1) {
                if (this.f3382c == null) {
                    this.f3382c = this.f3380a.p();
                }
                this.f3382c.p(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f3385f = fragment;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public x(FragmentManager fragmentManager, int i10) {
        this.f3382c = null;
        this.f3383d = new ArrayList();
        this.f3384e = new ArrayList();
        this.f3385f = null;
        this.f3380a = fragmentManager;
        this.f3381b = i10;
    }
}
