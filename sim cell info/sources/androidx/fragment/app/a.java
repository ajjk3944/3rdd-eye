package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import androidx.lifecycle.d;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class a extends n implements i.k {

    /* renamed from: s, reason: collision with root package name */
    final i f1578s;

    /* renamed from: t, reason: collision with root package name */
    boolean f1579t;

    /* renamed from: u, reason: collision with root package name */
    int f1580u = -1;

    public a(i iVar) {
        this.f1578s = iVar;
    }

    private static boolean s(n.a aVar) {
        Fragment fragment = aVar.f1716b;
        return (fragment == null || !fragment.f1540l || fragment.H == null || fragment.A || fragment.f1554z || !fragment.R()) ? false : true;
    }

    @Override // androidx.fragment.app.i.k
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (i.I) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1704h) {
            return true;
        }
        this.f1578s.i(this);
        return true;
    }

    @Override // androidx.fragment.app.n
    public void e() {
        g();
        this.f1578s.i0(this, true);
    }

    @Override // androidx.fragment.app.n
    public n f(Fragment fragment) {
        i iVar = fragment.f1547s;
        if (iVar == null || iVar == this.f1578s) {
            return super.f(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.n
    void h(int i2, Fragment fragment, String str, int i3) {
        super.h(i2, fragment, str, i3);
        fragment.f1547s = this.f1578s;
    }

    @Override // androidx.fragment.app.n
    public n i(Fragment fragment, d.b bVar) {
        if (fragment.f1547s != this.f1578s) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f1578s);
        }
        d.b bVar2 = d.b.CREATED;
        if (bVar.a(bVar2)) {
            return super.i(fragment, bVar);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle below " + bVar2);
    }

    void j(int i2) {
        if (this.f1704h) {
            if (i.I) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            int size = this.f1697a.size();
            for (int i3 = 0; i3 < size; i3++) {
                n.a aVar = this.f1697a.get(i3);
                Fragment fragment = aVar.f1716b;
                if (fragment != null) {
                    fragment.f1546r += i2;
                    if (i.I) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f1716b + " to " + aVar.f1716b.f1546r);
                    }
                }
            }
        }
    }

    public void k(String str, PrintWriter printWriter) {
        l(str, printWriter, true);
    }

    public void l(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1706j);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1580u);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1579t);
            if (this.f1702f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1702f));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f1703g));
            }
            if (this.f1698b != 0 || this.f1699c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1698b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1699c));
            }
            if (this.f1700d != 0 || this.f1701e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1700d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1701e));
            }
            if (this.f1707k != 0 || this.f1708l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1707k));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1708l);
            }
            if (this.f1709m != 0 || this.f1710n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1709m));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1710n);
            }
        }
        if (this.f1697a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f1697a.size();
        for (int i2 = 0; i2 < size; i2++) {
            n.a aVar = this.f1697a.get(i2);
            switch (aVar.f1715a) {
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
                    str2 = "cmd=" + aVar.f1715a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f1716b);
            if (z2) {
                if (aVar.f1717c != 0 || aVar.f1718d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f1717c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f1718d));
                }
                if (aVar.f1719e != 0 || aVar.f1720f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f1719e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f1720f));
                }
            }
        }
    }

    void m() {
        int size = this.f1697a.size();
        for (int i2 = 0; i2 < size; i2++) {
            n.a aVar = this.f1697a.get(i2);
            Fragment fragment = aVar.f1716b;
            if (fragment != null) {
                fragment.j1(this.f1702f, this.f1703g);
            }
            switch (aVar.f1715a) {
                case 1:
                    fragment.i1(aVar.f1717c);
                    this.f1578s.j(fragment, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1715a);
                case 3:
                    fragment.i1(aVar.f1718d);
                    this.f1578s.V0(fragment);
                    break;
                case 4:
                    fragment.i1(aVar.f1718d);
                    this.f1578s.z0(fragment);
                    break;
                case 5:
                    fragment.i1(aVar.f1717c);
                    this.f1578s.i1(fragment);
                    break;
                case 6:
                    fragment.i1(aVar.f1718d);
                    this.f1578s.u(fragment);
                    break;
                case 7:
                    fragment.i1(aVar.f1717c);
                    this.f1578s.n(fragment);
                    break;
                case 8:
                    this.f1578s.h1(fragment);
                    break;
                case 9:
                    this.f1578s.h1(null);
                    break;
                case 10:
                    this.f1578s.g1(fragment, aVar.f1722h);
                    break;
            }
            if (!this.f1713q && aVar.f1715a != 1 && fragment != null) {
                this.f1578s.L0(fragment);
            }
        }
        if (this.f1713q) {
            return;
        }
        i iVar = this.f1578s;
        iVar.M0(iVar.f1629q, true);
    }

    void n(boolean z2) {
        for (int size = this.f1697a.size() - 1; size >= 0; size--) {
            n.a aVar = this.f1697a.get(size);
            Fragment fragment = aVar.f1716b;
            if (fragment != null) {
                fragment.j1(i.a1(this.f1702f), this.f1703g);
            }
            switch (aVar.f1715a) {
                case 1:
                    fragment.i1(aVar.f1720f);
                    this.f1578s.V0(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1715a);
                case 3:
                    fragment.i1(aVar.f1719e);
                    this.f1578s.j(fragment, false);
                    break;
                case 4:
                    fragment.i1(aVar.f1719e);
                    this.f1578s.i1(fragment);
                    break;
                case 5:
                    fragment.i1(aVar.f1720f);
                    this.f1578s.z0(fragment);
                    break;
                case 6:
                    fragment.i1(aVar.f1719e);
                    this.f1578s.n(fragment);
                    break;
                case 7:
                    fragment.i1(aVar.f1720f);
                    this.f1578s.u(fragment);
                    break;
                case 8:
                    this.f1578s.h1(null);
                    break;
                case 9:
                    this.f1578s.h1(fragment);
                    break;
                case 10:
                    this.f1578s.g1(fragment, aVar.f1721g);
                    break;
            }
            if (!this.f1713q && aVar.f1715a != 3 && fragment != null) {
                this.f1578s.L0(fragment);
            }
        }
        if (this.f1713q || !z2) {
            return;
        }
        i iVar = this.f1578s;
        iVar.M0(iVar.f1629q, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.Fragment o(java.util.ArrayList<androidx.fragment.app.Fragment> r17, androidx.fragment.app.Fragment r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList<androidx.fragment.app.n$a> r5 = r0.f1697a
            int r5 = r5.size()
            if (r4 >= r5) goto Lba
            java.util.ArrayList<androidx.fragment.app.n$a> r5 = r0.f1697a
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.n$a r5 = (androidx.fragment.app.n.a) r5
            int r6 = r5.f1715a
            r7 = 0
            r8 = 1
            if (r6 == r8) goto Lb2
            r9 = 2
            r10 = 3
            r11 = 9
            if (r6 == r9) goto L58
            if (r6 == r10) goto L41
            r9 = 6
            if (r6 == r9) goto L41
            r7 = 7
            if (r6 == r7) goto Lb2
            r7 = 8
            if (r6 == r7) goto L31
            goto Lb7
        L31:
            java.util.ArrayList<androidx.fragment.app.n$a> r6 = r0.f1697a
            androidx.fragment.app.n$a r7 = new androidx.fragment.app.n$a
            r7.<init>(r11, r3)
            r6.add(r4, r7)
            int r4 = r4 + 1
            androidx.fragment.app.Fragment r3 = r5.f1716b
            goto Lb7
        L41:
            androidx.fragment.app.Fragment r6 = r5.f1716b
            r1.remove(r6)
            androidx.fragment.app.Fragment r5 = r5.f1716b
            if (r5 != r3) goto Lb7
            java.util.ArrayList<androidx.fragment.app.n$a> r3 = r0.f1697a
            androidx.fragment.app.n$a r6 = new androidx.fragment.app.n$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r7
            goto Lb7
        L58:
            androidx.fragment.app.Fragment r6 = r5.f1716b
            int r9 = r6.f1552x
            int r12 = r17.size()
            int r12 = r12 - r8
            r13 = 0
        L62:
            if (r12 < 0) goto La2
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            int r15 = r14.f1552x
            if (r15 != r9) goto L9f
            if (r14 != r6) goto L72
            r13 = 1
            goto L9f
        L72:
            if (r14 != r3) goto L81
            java.util.ArrayList<androidx.fragment.app.n$a> r3 = r0.f1697a
            androidx.fragment.app.n$a r15 = new androidx.fragment.app.n$a
            r15.<init>(r11, r14)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r7
        L81:
            androidx.fragment.app.n$a r15 = new androidx.fragment.app.n$a
            r15.<init>(r10, r14)
            int r2 = r5.f1717c
            r15.f1717c = r2
            int r2 = r5.f1719e
            r15.f1719e = r2
            int r2 = r5.f1718d
            r15.f1718d = r2
            int r2 = r5.f1720f
            r15.f1720f = r2
            java.util.ArrayList<androidx.fragment.app.n$a> r2 = r0.f1697a
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r8
        L9f:
            int r12 = r12 + (-1)
            goto L62
        La2:
            if (r13 == 0) goto Lac
            java.util.ArrayList<androidx.fragment.app.n$a> r2 = r0.f1697a
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lb7
        Lac:
            r5.f1715a = r8
            r1.add(r6)
            goto Lb7
        Lb2:
            androidx.fragment.app.Fragment r2 = r5.f1716b
            r1.add(r2)
        Lb7:
            int r4 = r4 + r8
            goto L7
        Lba:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.o(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    public String p() {
        return this.f1706j;
    }

    boolean q(int i2) {
        int size = this.f1697a.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.f1697a.get(i3).f1716b;
            int i4 = fragment != null ? fragment.f1552x : 0;
            if (i4 != 0 && i4 == i2) {
                return true;
            }
        }
        return false;
    }

    boolean r(ArrayList<a> arrayList, int i2, int i3) {
        if (i3 == i2) {
            return false;
        }
        int size = this.f1697a.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            Fragment fragment = this.f1697a.get(i5).f1716b;
            int i6 = fragment != null ? fragment.f1552x : 0;
            if (i6 != 0 && i6 != i4) {
                for (int i7 = i2; i7 < i3; i7++) {
                    a aVar = arrayList.get(i7);
                    int size2 = aVar.f1697a.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        Fragment fragment2 = aVar.f1697a.get(i8).f1716b;
                        if ((fragment2 != null ? fragment2.f1552x : 0) == i6) {
                            return true;
                        }
                    }
                }
                i4 = i6;
            }
        }
        return false;
    }

    boolean t() {
        for (int i2 = 0; i2 < this.f1697a.size(); i2++) {
            if (s(this.f1697a.get(i2))) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1580u >= 0) {
            sb.append(" #");
            sb.append(this.f1580u);
        }
        if (this.f1706j != null) {
            sb.append(" ");
            sb.append(this.f1706j);
        }
        sb.append("}");
        return sb.toString();
    }

    public void u() {
        if (this.f1714r != null) {
            for (int i2 = 0; i2 < this.f1714r.size(); i2++) {
                this.f1714r.get(i2).run();
            }
            this.f1714r = null;
        }
    }

    void v(Fragment.f fVar) {
        for (int i2 = 0; i2 < this.f1697a.size(); i2++) {
            n.a aVar = this.f1697a.get(i2);
            if (s(aVar)) {
                aVar.f1716b.k1(fVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.Fragment w(java.util.ArrayList<androidx.fragment.app.Fragment> r6, androidx.fragment.app.Fragment r7) {
        /*
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.n$a> r0 = r5.f1697a
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList<androidx.fragment.app.n$a> r2 = r5.f1697a
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.n$a r2 = (androidx.fragment.app.n.a) r2
            int r3 = r2.f1715a
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
            androidx.lifecycle.d$b r3 = r2.f1721g
            r2.f1722h = r3
            goto L32
        L22:
            androidx.fragment.app.Fragment r7 = r2.f1716b
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.Fragment r2 = r2.f1716b
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.Fragment r2 = r2.f1716b
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.w(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }
}
