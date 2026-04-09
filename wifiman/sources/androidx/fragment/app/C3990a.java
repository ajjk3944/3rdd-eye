package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.E;
import androidx.fragment.app.w;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3990a extends E implements w.l {

    /* renamed from: t, reason: collision with root package name */
    final w f31356t;

    /* renamed from: u, reason: collision with root package name */
    boolean f31357u;

    /* renamed from: v, reason: collision with root package name */
    int f31358v;

    /* renamed from: w, reason: collision with root package name */
    boolean f31359w;

    C3990a(w wVar) {
        super(wVar.p0(), wVar.r0() != null ? wVar.r0().g().getClassLoader() : null);
        this.f31358v = -1;
        this.f31359w = false;
        this.f31356t = wVar;
    }

    @Override // androidx.fragment.app.w.l
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (w.E0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f31199i) {
            return true;
        }
        this.f31356t.g(this);
        return true;
    }

    @Override // androidx.fragment.app.E
    public int g() {
        return r(false);
    }

    @Override // androidx.fragment.app.E
    public int h() {
        return r(true);
    }

    @Override // androidx.fragment.app.E
    public void i() {
        k();
        this.f31356t.Z(this, false);
    }

    @Override // androidx.fragment.app.E
    public void j() {
        k();
        this.f31356t.Z(this, true);
    }

    @Override // androidx.fragment.app.E
    void l(int i10, Fragment fragment, String str, int i11) {
        super.l(i10, fragment, str, i11);
        fragment.f31268t = this.f31356t;
    }

    @Override // androidx.fragment.app.E
    public E m(Fragment fragment) {
        w wVar = fragment.f31268t;
        if (wVar == null || wVar == this.f31356t) {
            return super.m(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void q(int i10) {
        if (this.f31199i) {
            if (w.E0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f31193c.size();
            for (int i11 = 0; i11 < size; i11++) {
                E.a aVar = (E.a) this.f31193c.get(i11);
                Fragment fragment = aVar.f31211b;
                if (fragment != null) {
                    fragment.f31267s += i10;
                    if (w.E0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f31211b + " to " + aVar.f31211b.f31267s);
                    }
                }
            }
        }
    }

    int r(boolean z10) {
        if (this.f31357u) {
            throw new IllegalStateException("commit already called");
        }
        if (w.E0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new J("FragmentManager"));
            s("  ", printWriter);
            printWriter.close();
        }
        this.f31357u = true;
        if (this.f31199i) {
            this.f31358v = this.f31356t.j();
        } else {
            this.f31358v = -1;
        }
        this.f31356t.W(this, z10);
        return this.f31358v;
    }

    public void s(String str, PrintWriter printWriter) {
        t(str, printWriter, true);
    }

    public void t(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f31201k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f31358v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f31357u);
            if (this.f31198h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f31198h));
            }
            if (this.f31194d != 0 || this.f31195e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f31194d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f31195e));
            }
            if (this.f31196f != 0 || this.f31197g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f31196f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f31197g));
            }
            if (this.f31202l != 0 || this.f31203m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f31202l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f31203m);
            }
            if (this.f31204n != 0 || this.f31205o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f31204n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f31205o);
            }
        }
        if (this.f31193c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f31193c.size();
        for (int i10 = 0; i10 < size; i10++) {
            E.a aVar = (E.a) this.f31193c.get(i10);
            switch (aVar.f31210a) {
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
                    str2 = "cmd=" + aVar.f31210a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f31211b);
            if (z10) {
                if (aVar.f31213d != 0 || aVar.f31214e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f31213d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f31214e));
                }
                if (aVar.f31215f != 0 || aVar.f31216g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f31215f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f31216g));
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f31358v >= 0) {
            sb2.append(" #");
            sb2.append(this.f31358v);
        }
        if (this.f31201k != null) {
            sb2.append(" ");
            sb2.append(this.f31201k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    void u() {
        int size = this.f31193c.size();
        for (int i10 = 0; i10 < size; i10++) {
            E.a aVar = (E.a) this.f31193c.get(i10);
            Fragment fragment = aVar.f31211b;
            if (fragment != null) {
                fragment.f31257n = this.f31359w;
                fragment.y1(false);
                fragment.x1(this.f31198h);
                fragment.A1(this.f31206p, this.f31207q);
            }
            switch (aVar.f31210a) {
                case 1:
                    fragment.u1(aVar.f31213d, aVar.f31214e, aVar.f31215f, aVar.f31216g);
                    this.f31356t.i1(fragment, false);
                    this.f31356t.h(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f31210a);
                case 3:
                    fragment.u1(aVar.f31213d, aVar.f31214e, aVar.f31215f, aVar.f31216g);
                    this.f31356t.b1(fragment);
                    break;
                case 4:
                    fragment.u1(aVar.f31213d, aVar.f31214e, aVar.f31215f, aVar.f31216g);
                    this.f31356t.B0(fragment);
                    break;
                case 5:
                    fragment.u1(aVar.f31213d, aVar.f31214e, aVar.f31215f, aVar.f31216g);
                    this.f31356t.i1(fragment, false);
                    this.f31356t.m1(fragment);
                    break;
                case 6:
                    fragment.u1(aVar.f31213d, aVar.f31214e, aVar.f31215f, aVar.f31216g);
                    this.f31356t.u(fragment);
                    break;
                case 7:
                    fragment.u1(aVar.f31213d, aVar.f31214e, aVar.f31215f, aVar.f31216g);
                    this.f31356t.i1(fragment, false);
                    this.f31356t.l(fragment);
                    break;
                case 8:
                    this.f31356t.k1(fragment);
                    break;
                case 9:
                    this.f31356t.k1(null);
                    break;
                case 10:
                    this.f31356t.j1(fragment, aVar.f31218i);
                    break;
            }
        }
    }

    void v() {
        for (int size = this.f31193c.size() - 1; size >= 0; size--) {
            E.a aVar = (E.a) this.f31193c.get(size);
            Fragment fragment = aVar.f31211b;
            if (fragment != null) {
                fragment.f31257n = this.f31359w;
                fragment.y1(true);
                fragment.x1(w.f1(this.f31198h));
                fragment.A1(this.f31207q, this.f31206p);
            }
            switch (aVar.f31210a) {
                case 1:
                    fragment.u1(aVar.f31213d, aVar.f31214e, aVar.f31215f, aVar.f31216g);
                    this.f31356t.i1(fragment, true);
                    this.f31356t.b1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f31210a);
                case 3:
                    fragment.u1(aVar.f31213d, aVar.f31214e, aVar.f31215f, aVar.f31216g);
                    this.f31356t.h(fragment);
                    break;
                case 4:
                    fragment.u1(aVar.f31213d, aVar.f31214e, aVar.f31215f, aVar.f31216g);
                    this.f31356t.m1(fragment);
                    break;
                case 5:
                    fragment.u1(aVar.f31213d, aVar.f31214e, aVar.f31215f, aVar.f31216g);
                    this.f31356t.i1(fragment, true);
                    this.f31356t.B0(fragment);
                    break;
                case 6:
                    fragment.u1(aVar.f31213d, aVar.f31214e, aVar.f31215f, aVar.f31216g);
                    this.f31356t.l(fragment);
                    break;
                case 7:
                    fragment.u1(aVar.f31213d, aVar.f31214e, aVar.f31215f, aVar.f31216g);
                    this.f31356t.i1(fragment, true);
                    this.f31356t.u(fragment);
                    break;
                case 8:
                    this.f31356t.k1(null);
                    break;
                case 9:
                    this.f31356t.k1(fragment);
                    break;
                case 10:
                    this.f31356t.j1(fragment, aVar.f31217h);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.Fragment w(java.util.ArrayList r17, androidx.fragment.app.Fragment r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList r5 = r0.f31193c
            int r5 = r5.size()
            if (r4 >= r5) goto Lbe
            java.util.ArrayList r5 = r0.f31193c
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.E$a r5 = (androidx.fragment.app.E.a) r5
            int r6 = r5.f31210a
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
            java.util.ArrayList r6 = r0.f31193c
            androidx.fragment.app.E$a r8 = new androidx.fragment.app.E$a
            r8.<init>(r11, r3, r7)
            r6.add(r4, r8)
            r5.f31212c = r7
            int r4 = r4 + 1
            androidx.fragment.app.Fragment r3 = r5.f31211b
            goto Lbb
        L43:
            androidx.fragment.app.Fragment r6 = r5.f31211b
            r1.remove(r6)
            androidx.fragment.app.Fragment r5 = r5.f31211b
            if (r5 != r3) goto Lbb
            java.util.ArrayList r3 = r0.f31193c
            androidx.fragment.app.E$a r6 = new androidx.fragment.app.E$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r9
            goto Lbb
        L5a:
            androidx.fragment.app.Fragment r6 = r5.f31211b
            int r8 = r6.f31273y
            int r12 = r17.size()
            int r12 = r12 - r7
            r13 = 0
        L64:
            if (r12 < 0) goto La4
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            int r15 = r14.f31273y
            if (r15 != r8) goto La1
            if (r14 != r6) goto L74
            r13 = r7
            goto La1
        L74:
            if (r14 != r3) goto L83
            java.util.ArrayList r3 = r0.f31193c
            androidx.fragment.app.E$a r15 = new androidx.fragment.app.E$a
            r15.<init>(r11, r14, r7)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r9
        L83:
            androidx.fragment.app.E$a r15 = new androidx.fragment.app.E$a
            r15.<init>(r10, r14, r7)
            int r2 = r5.f31213d
            r15.f31213d = r2
            int r2 = r5.f31215f
            r15.f31215f = r2
            int r2 = r5.f31214e
            r15.f31214e = r2
            int r2 = r5.f31216g
            r15.f31216g = r2
            java.util.ArrayList r2 = r0.f31193c
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r7
        La1:
            int r12 = r12 + (-1)
            goto L64
        La4:
            if (r13 == 0) goto Lae
            java.util.ArrayList r2 = r0.f31193c
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lbb
        Lae:
            r5.f31210a = r7
            r5.f31212c = r7
            r1.add(r6)
            goto Lbb
        Lb6:
            androidx.fragment.app.Fragment r2 = r5.f31211b
            r1.add(r2)
        Lbb:
            int r4 = r4 + r7
            goto L7
        Lbe:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C3990a.w(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    public String x() {
        return this.f31201k;
    }

    public void y() {
        if (this.f31209s != null) {
            for (int i10 = 0; i10 < this.f31209s.size(); i10++) {
                ((Runnable) this.f31209s.get(i10)).run();
            }
            this.f31209s = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.Fragment z(java.util.ArrayList r6, androidx.fragment.app.Fragment r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.f31193c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList r2 = r5.f31193c
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.E$a r2 = (androidx.fragment.app.E.a) r2
            int r3 = r2.f31210a
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
            androidx.lifecycle.k$b r3 = r2.f31217h
            r2.f31218i = r3
            goto L32
        L22:
            androidx.fragment.app.Fragment r7 = r2.f31211b
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.Fragment r2 = r2.f31211b
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.Fragment r2 = r2.f31211b
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C3990a.z(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }
}
