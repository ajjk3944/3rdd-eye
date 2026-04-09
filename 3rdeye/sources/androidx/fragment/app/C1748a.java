package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.H;
import androidx.fragment.app.x;
import androidx.lifecycle.AbstractC1781n;
import g1.C4368b;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: BackStackRecord.java */
/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1748a extends H implements x.n {

    /* renamed from: q, reason: collision with root package name */
    public final x f15849q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f15850r;

    /* renamed from: s, reason: collision with root package name */
    public int f15851s;

    public C1748a(x xVar) {
        xVar.D();
        AbstractC1766t<?> abstractC1766t = xVar.f15995u;
        if (abstractC1766t != null) {
            abstractC1766t.f15952c.getClassLoader();
        }
        this.f15784a = new ArrayList<>();
        this.f15791h = true;
        this.f15798p = false;
        this.f15851s = -1;
        this.f15849q = xVar;
    }

    @Override // androidx.fragment.app.x.n
    public final boolean a(ArrayList<C1748a> arrayList, ArrayList<Boolean> arrayList2) {
        if (x.G(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f15790g) {
            return true;
        }
        x xVar = this.f15849q;
        if (xVar.f15979d == null) {
            xVar.f15979d = new ArrayList<>();
        }
        xVar.f15979d.add(this);
        return true;
    }

    @Override // androidx.fragment.app.H
    public final void c(int i, ComponentCallbacksC1759l componentCallbacksC1759l, String str, int i10) {
        String str2 = componentCallbacksC1759l.mPreviousWho;
        if (str2 != null) {
            C4368b.c(componentCallbacksC1759l, str2);
        }
        Class<?> cls = componentCallbacksC1759l.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = componentCallbacksC1759l.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + componentCallbacksC1759l + ": was " + componentCallbacksC1759l.mTag + " now " + str);
            }
            componentCallbacksC1759l.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + componentCallbacksC1759l + " with tag " + str + " to container view with no id");
            }
            int i11 = componentCallbacksC1759l.mFragmentId;
            if (i11 != 0 && i11 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + componentCallbacksC1759l + ": was " + componentCallbacksC1759l.mFragmentId + " now " + i);
            }
            componentCallbacksC1759l.mFragmentId = i;
            componentCallbacksC1759l.mContainerId = i;
        }
        b(new H.a(componentCallbacksC1759l, i10));
        componentCallbacksC1759l.mFragmentManager = this.f15849q;
    }

    @Override // androidx.fragment.app.H
    public final C1748a e(ComponentCallbacksC1759l componentCallbacksC1759l, AbstractC1781n.b bVar) {
        x xVar = componentCallbacksC1759l.mFragmentManager;
        x xVar2 = this.f15849q;
        if (xVar != xVar2) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + xVar2);
        }
        if (bVar == AbstractC1781n.b.INITIALIZED && componentCallbacksC1759l.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
        }
        if (bVar == AbstractC1781n.b.DESTROYED) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        H.a aVar = new H.a();
        aVar.f15799a = 10;
        aVar.f15800b = componentCallbacksC1759l;
        aVar.f15801c = false;
        aVar.f15806h = componentCallbacksC1759l.mMaxState;
        aVar.i = bVar;
        b(aVar);
        return this;
    }

    public final void f(int i) {
        if (this.f15790g) {
            if (x.G(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList<H.a> arrayList = this.f15784a;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                H.a aVar = arrayList.get(i10);
                ComponentCallbacksC1759l componentCallbacksC1759l = aVar.f15800b;
                if (componentCallbacksC1759l != null) {
                    componentCallbacksC1759l.mBackStackNesting += i;
                    if (x.G(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f15800b + " to " + aVar.f15800b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final int g(boolean z10) {
        if (this.f15850r) {
            throw new IllegalStateException("commit already called");
        }
        if (x.G(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new P());
            h("  ", printWriter, true);
            printWriter.close();
        }
        this.f15850r = true;
        boolean z11 = this.f15790g;
        x xVar = this.f15849q;
        if (z11) {
            this.f15851s = xVar.i.getAndIncrement();
        } else {
            this.f15851s = -1;
        }
        xVar.v(this, z10);
        return this.f15851s;
    }

    public final void h(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f15851s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f15850r);
            if (this.f15789f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f15789f));
            }
            if (this.f15785b != 0 || this.f15786c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f15785b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f15786c));
            }
            if (this.f15787d != 0 || this.f15788e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f15787d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f15788e));
            }
            if (this.f15792j != 0 || this.f15793k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f15792j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f15793k);
            }
            if (this.f15794l != 0 || this.f15795m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f15794l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f15795m);
            }
        }
        ArrayList<H.a> arrayList = this.f15784a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            H.a aVar = arrayList.get(i);
            switch (aVar.f15799a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f15799a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f15800b);
            if (z10) {
                if (aVar.f15802d != 0 || aVar.f15803e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f15802d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f15803e));
                }
                if (aVar.f15804f != 0 || aVar.f15805g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f15804f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f15805g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f15851s >= 0) {
            sb.append(" #");
            sb.append(this.f15851s);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }
}
