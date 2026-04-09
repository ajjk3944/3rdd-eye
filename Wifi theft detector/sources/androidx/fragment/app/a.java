package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.z;
import androidx.lifecycle.Lifecycle;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a extends z implements FragmentManager.k {

    /* renamed from: t, reason: collision with root package name */
    public final FragmentManager f3235t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3236u;

    /* renamed from: v, reason: collision with root package name */
    public int f3237v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3238w;

    public a(FragmentManager fragmentManager) {
        super(fragmentManager.t0(), fragmentManager.v0() != null ? fragmentManager.v0().f().getClassLoader() : null);
        this.f3237v = -1;
        this.f3238w = false;
        this.f3235t = fragmentManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.fragment.app.Fragment A(java.util.ArrayList r6, androidx.fragment.app.Fragment r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.f3393c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList r2 = r5.f3393c
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.z$a r2 = (androidx.fragment.app.z.a) r2
            int r3 = r2.f3410a
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            androidx.lifecycle.Lifecycle$State r3 = r2.f3417h
            r2.f3418i = r3
            goto L32
        L22:
            androidx.fragment.app.Fragment r7 = r2.f3411b
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.Fragment r2 = r2.f3411b
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.Fragment r2 = r2.f3411b
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.A(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (FragmentManager.I0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f3399i) {
            return true;
        }
        this.f3235t.i(this);
        return true;
    }

    @Override // androidx.fragment.app.z
    public int g() {
        return s(false);
    }

    @Override // androidx.fragment.app.z
    public int h() {
        return s(true);
    }

    @Override // androidx.fragment.app.z
    public void i() {
        k();
        this.f3235t.c0(this, false);
    }

    @Override // androidx.fragment.app.z
    public void j() {
        k();
        this.f3235t.c0(this, true);
    }

    @Override // androidx.fragment.app.z
    public void l(int i10, Fragment fragment, String str, int i11) {
        super.l(i10, fragment, str, i11);
        fragment.mFragmentManager = this.f3235t;
    }

    @Override // androidx.fragment.app.z
    public z m(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f3235t) {
            return super.m(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.z
    public z p(Fragment fragment, Lifecycle.State state) {
        if (fragment.mFragmentManager != this.f3235t) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f3235t);
        }
        if (state == Lifecycle.State.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        }
        if (state != Lifecycle.State.DESTROYED) {
            return super.p(fragment, state);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    public void r(int i10) {
        if (this.f3399i) {
            if (FragmentManager.I0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f3393c.size();
            for (int i11 = 0; i11 < size; i11++) {
                z.a aVar = (z.a) this.f3393c.get(i11);
                Fragment fragment = aVar.f3411b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i10;
                    if (FragmentManager.I0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f3411b + " to " + aVar.f3411b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public int s(boolean z10) {
        if (this.f3236u) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.I0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new e0("FragmentManager"));
            t("  ", printWriter);
            printWriter.close();
        }
        this.f3236u = true;
        if (this.f3399i) {
            this.f3237v = this.f3235t.m();
        } else {
            this.f3237v = -1;
        }
        this.f3235t.Z(this, z10);
        return this.f3237v;
    }

    public void t(String str, PrintWriter printWriter) {
        u(str, printWriter, true);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3237v >= 0) {
            sb.append(" #");
            sb.append(this.f3237v);
        }
        if (this.f3401k != null) {
            sb.append(" ");
            sb.append(this.f3401k);
        }
        sb.append("}");
        return sb.toString();
    }

    public void u(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3401k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3237v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3236u);
            if (this.f3398h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3398h));
            }
            if (this.f3394d != 0 || this.f3395e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3394d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3395e));
            }
            if (this.f3396f != 0 || this.f3397g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3396f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3397g));
            }
            if (this.f3402l != 0 || this.f3403m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3402l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3403m);
            }
            if (this.f3404n != 0 || this.f3405o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3404n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3405o);
            }
        }
        if (this.f3393c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f3393c.size();
        for (int i10 = 0; i10 < size; i10++) {
            z.a aVar = (z.a) this.f3393c.get(i10);
            switch (aVar.f3410a) {
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
                    str2 = "cmd=" + aVar.f3410a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f3411b);
            if (z10) {
                if (aVar.f3413d != 0 || aVar.f3414e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f3413d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f3414e));
                }
                if (aVar.f3415f != 0 || aVar.f3416g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f3415f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f3416g));
                }
            }
        }
    }

    public void v() {
        int size = this.f3393c.size();
        for (int i10 = 0; i10 < size; i10++) {
            z.a aVar = (z.a) this.f3393c.get(i10);
            Fragment fragment = aVar.f3411b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f3238w;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.f3398h);
                fragment.setSharedElementNames(this.f3406p, this.f3407q);
            }
            switch (aVar.f3410a) {
                case 1:
                    fragment.setAnimations(aVar.f3413d, aVar.f3414e, aVar.f3415f, aVar.f3416g);
                    this.f3235t.m1(fragment, false);
                    this.f3235t.j(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3410a);
                case 3:
                    fragment.setAnimations(aVar.f3413d, aVar.f3414e, aVar.f3415f, aVar.f3416g);
                    this.f3235t.d1(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f3413d, aVar.f3414e, aVar.f3415f, aVar.f3416g);
                    this.f3235t.F0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f3413d, aVar.f3414e, aVar.f3415f, aVar.f3416g);
                    this.f3235t.m1(fragment, false);
                    this.f3235t.q1(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f3413d, aVar.f3414e, aVar.f3415f, aVar.f3416g);
                    this.f3235t.x(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f3413d, aVar.f3414e, aVar.f3415f, aVar.f3416g);
                    this.f3235t.m1(fragment, false);
                    this.f3235t.o(fragment);
                    break;
                case 8:
                    this.f3235t.o1(fragment);
                    break;
                case 9:
                    this.f3235t.o1(null);
                    break;
                case 10:
                    this.f3235t.n1(fragment, aVar.f3418i);
                    break;
            }
        }
    }

    public void w() {
        for (int size = this.f3393c.size() - 1; size >= 0; size--) {
            z.a aVar = (z.a) this.f3393c.get(size);
            Fragment fragment = aVar.f3411b;
            if (fragment != null) {
                fragment.mBeingSaved = this.f3238w;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.i1(this.f3398h));
                fragment.setSharedElementNames(this.f3407q, this.f3406p);
            }
            switch (aVar.f3410a) {
                case 1:
                    fragment.setAnimations(aVar.f3413d, aVar.f3414e, aVar.f3415f, aVar.f3416g);
                    this.f3235t.m1(fragment, true);
                    this.f3235t.d1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3410a);
                case 3:
                    fragment.setAnimations(aVar.f3413d, aVar.f3414e, aVar.f3415f, aVar.f3416g);
                    this.f3235t.j(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.f3413d, aVar.f3414e, aVar.f3415f, aVar.f3416g);
                    this.f3235t.q1(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.f3413d, aVar.f3414e, aVar.f3415f, aVar.f3416g);
                    this.f3235t.m1(fragment, true);
                    this.f3235t.F0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.f3413d, aVar.f3414e, aVar.f3415f, aVar.f3416g);
                    this.f3235t.o(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.f3413d, aVar.f3414e, aVar.f3415f, aVar.f3416g);
                    this.f3235t.m1(fragment, true);
                    this.f3235t.x(fragment);
                    break;
                case 8:
                    this.f3235t.o1(null);
                    break;
                case 9:
                    this.f3235t.o1(fragment);
                    break;
                case 10:
                    this.f3235t.n1(fragment, aVar.f3417h);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.fragment.app.Fragment x(java.util.ArrayList r17, androidx.fragment.app.Fragment r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList r5 = r0.f3393c
            int r5 = r5.size()
            if (r4 >= r5) goto Lbe
            java.util.ArrayList r5 = r0.f3393c
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.z$a r5 = (androidx.fragment.app.z.a) r5
            int r6 = r5.f3410a
            r7 = 1
            if (r6 == r7) goto Lb6
            r8 = 2
            r9 = 0
            r10 = 3
            r11 = 9
            if (r6 == r8) goto L5a
            if (r6 == r10) goto L43
            r8 = 6
            if (r6 == r8) goto L43
            r8 = 7
            if (r6 == r8) goto Lb6
            r8 = 8
            if (r6 == r8) goto L31
            goto Lbb
        L31:
            java.util.ArrayList r6 = r0.f3393c
            androidx.fragment.app.z$a r8 = new androidx.fragment.app.z$a
            r8.<init>(r11, r3, r7)
            r6.add(r4, r8)
            r5.f3412c = r7
            int r4 = r4 + 1
            androidx.fragment.app.Fragment r3 = r5.f3411b
            goto Lbb
        L43:
            androidx.fragment.app.Fragment r6 = r5.f3411b
            r1.remove(r6)
            androidx.fragment.app.Fragment r5 = r5.f3411b
            if (r5 != r3) goto Lbb
            java.util.ArrayList r3 = r0.f3393c
            androidx.fragment.app.z$a r6 = new androidx.fragment.app.z$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r9
            goto Lbb
        L5a:
            androidx.fragment.app.Fragment r6 = r5.f3411b
            int r8 = r6.mContainerId
            int r12 = r1.size()
            int r12 = r12 - r7
            r13 = 0
        L64:
            if (r12 < 0) goto La4
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            int r15 = r14.mContainerId
            if (r15 != r8) goto La1
            if (r14 != r6) goto L74
            r13 = r7
            goto La1
        L74:
            if (r14 != r3) goto L83
            java.util.ArrayList r3 = r0.f3393c
            androidx.fragment.app.z$a r15 = new androidx.fragment.app.z$a
            r15.<init>(r11, r14, r7)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r9
        L83:
            androidx.fragment.app.z$a r15 = new androidx.fragment.app.z$a
            r15.<init>(r10, r14, r7)
            int r2 = r5.f3413d
            r15.f3413d = r2
            int r2 = r5.f3415f
            r15.f3415f = r2
            int r2 = r5.f3414e
            r15.f3414e = r2
            int r2 = r5.f3416g
            r15.f3416g = r2
            java.util.ArrayList r2 = r0.f3393c
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r7
        La1:
            int r12 = r12 + (-1)
            goto L64
        La4:
            if (r13 == 0) goto Lae
            java.util.ArrayList r2 = r0.f3393c
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lbb
        Lae:
            r5.f3410a = r7
            r5.f3412c = r7
            r1.add(r6)
            goto Lbb
        Lb6:
            androidx.fragment.app.Fragment r2 = r5.f3411b
            r1.add(r2)
        Lbb:
            int r4 = r4 + r7
            goto L7
        Lbe:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.x(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    public String y() {
        return this.f3401k;
    }

    public void z() {
        if (this.f3409s != null) {
            for (int i10 = 0; i10 < this.f3409s.size(); i10++) {
                ((Runnable) this.f3409s.get(i10)).run();
            }
            this.f3409s = null;
        }
    }
}
