package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.H;
import androidx.lifecycle.AbstractC1781n;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: FragmentPagerAdapter.java */
@Deprecated
/* loaded from: classes.dex */
public abstract class D extends androidx.viewpager.widget.a {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentPagerAdapter";
    private final int mBehavior;
    private H mCurTransaction;
    private ComponentCallbacksC1759l mCurrentPrimaryItem;
    private boolean mExecutingFinishUpdate;
    private final x mFragmentManager;

    @Deprecated
    public D(x xVar) {
        this(xVar, 0);
    }

    private static String makeFragmentName(int i, long j4) {
        return "android:switcher:" + i + StringUtils.PROCESS_POSTFIX_DELIMITER + j4;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        ComponentCallbacksC1759l componentCallbacksC1759l = (ComponentCallbacksC1759l) obj;
        if (this.mCurTransaction == null) {
            x xVar = this.mFragmentManager;
            xVar.getClass();
            this.mCurTransaction = new C1748a(xVar);
        }
        C1748a c1748a = (C1748a) this.mCurTransaction;
        c1748a.getClass();
        x xVar2 = componentCallbacksC1759l.mFragmentManager;
        if (xVar2 != null && xVar2 != c1748a.f15849q) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + componentCallbacksC1759l.toString() + " is already attached to a FragmentManager.");
        }
        c1748a.b(new H.a(componentCallbacksC1759l, 6));
        if (componentCallbacksC1759l.equals(this.mCurrentPrimaryItem)) {
            this.mCurrentPrimaryItem = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void finishUpdate(ViewGroup viewGroup) {
        H h10 = this.mCurTransaction;
        if (h10 != null) {
            if (!this.mExecutingFinishUpdate) {
                try {
                    this.mExecutingFinishUpdate = true;
                    C1748a c1748a = (C1748a) h10;
                    if (c1748a.f15790g) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    c1748a.f15791h = false;
                    c1748a.f15849q.y(c1748a, true);
                } finally {
                    this.mExecutingFinishUpdate = false;
                }
            }
            this.mCurTransaction = null;
        }
    }

    public abstract ComponentCallbacksC1759l getItem(int i);

    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.viewpager.widget.a
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.mCurTransaction == null) {
            x xVar = this.mFragmentManager;
            xVar.getClass();
            this.mCurTransaction = new C1748a(xVar);
        }
        long itemId = getItemId(i);
        ComponentCallbacksC1759l componentCallbacksC1759lB = this.mFragmentManager.B(makeFragmentName(viewGroup.getId(), itemId));
        if (componentCallbacksC1759lB != null) {
            H h10 = this.mCurTransaction;
            h10.getClass();
            h10.b(new H.a(componentCallbacksC1759lB, 7));
        } else {
            componentCallbacksC1759lB = getItem(i);
            this.mCurTransaction.c(viewGroup.getId(), componentCallbacksC1759lB, makeFragmentName(viewGroup.getId(), itemId), 1);
        }
        if (componentCallbacksC1759lB != this.mCurrentPrimaryItem) {
            componentCallbacksC1759lB.setMenuVisibility(false);
            if (this.mBehavior == 1) {
                this.mCurTransaction.e(componentCallbacksC1759lB, AbstractC1781n.b.STARTED);
                return componentCallbacksC1759lB;
            }
            componentCallbacksC1759lB.setUserVisibleHint(false);
        }
        return componentCallbacksC1759lB;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(View view, Object obj) {
        return ((ComponentCallbacksC1759l) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.a
    public Parcelable saveState() {
        return null;
    }

    @Override // androidx.viewpager.widget.a
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        ComponentCallbacksC1759l componentCallbacksC1759l = (ComponentCallbacksC1759l) obj;
        ComponentCallbacksC1759l componentCallbacksC1759l2 = this.mCurrentPrimaryItem;
        if (componentCallbacksC1759l != componentCallbacksC1759l2) {
            if (componentCallbacksC1759l2 != null) {
                componentCallbacksC1759l2.setMenuVisibility(false);
                if (this.mBehavior == 1) {
                    if (this.mCurTransaction == null) {
                        x xVar = this.mFragmentManager;
                        xVar.getClass();
                        this.mCurTransaction = new C1748a(xVar);
                    }
                    this.mCurTransaction.e(this.mCurrentPrimaryItem, AbstractC1781n.b.STARTED);
                } else {
                    this.mCurrentPrimaryItem.setUserVisibleHint(false);
                }
            }
            componentCallbacksC1759l.setMenuVisibility(true);
            if (this.mBehavior == 1) {
                if (this.mCurTransaction == null) {
                    x xVar2 = this.mFragmentManager;
                    xVar2.getClass();
                    this.mCurTransaction = new C1748a(xVar2);
                }
                this.mCurTransaction.e(componentCallbacksC1759l, AbstractC1781n.b.RESUMED);
            } else {
                componentCallbacksC1759l.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = componentCallbacksC1759l;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public D(x xVar, int i) {
        this.mCurTransaction = null;
        this.mCurrentPrimaryItem = null;
        this.mFragmentManager = xVar;
        this.mBehavior = i;
    }

    @Override // androidx.viewpager.widget.a
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }
}
