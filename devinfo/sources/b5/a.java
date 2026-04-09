package b5;

import android.os.Bundle;
import android.util.Log;
import com.liuzh.deviceinfo.R;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f1708a;

    /* renamed from: b, reason: collision with root package name */
    public final ClassLoader f1709b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1710c;

    /* renamed from: d, reason: collision with root package name */
    public int f1711d;

    /* renamed from: e, reason: collision with root package name */
    public int f1712e;

    /* renamed from: f, reason: collision with root package name */
    public int f1713f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f1714h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1715i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public int f1716k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f1717l;

    /* renamed from: m, reason: collision with root package name */
    public int f1718m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f1719n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f1720o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f1721p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1722q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f1723r;

    /* renamed from: s, reason: collision with root package name */
    public final u0 f1724s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1725t;

    /* renamed from: u, reason: collision with root package name */
    public int f1726u;

    public a(u0 u0Var) {
        k0 k0VarH = u0Var.H();
        d0 d0Var = u0Var.f1898x;
        ClassLoader classLoader = d0Var != null ? d0Var.f1766b.getClassLoader() : null;
        this.f1710c = new ArrayList();
        this.f1722q = false;
        this.f1708a = k0VarH;
        this.f1709b = classLoader;
        this.f1726u = -1;
        this.f1724s = u0Var;
    }

    @Override // b5.r0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (u0.K(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1715i) {
            return true;
        }
        this.f1724s.f1880d.add(this);
        return true;
    }

    public final void b(c1 c1Var) {
        this.f1710c.add(c1Var);
        c1Var.f1757d = this.f1711d;
        c1Var.f1758e = this.f1712e;
        c1Var.f1759f = this.f1713f;
        c1Var.g = this.g;
    }

    public final void c(int i4) {
        if (this.f1715i) {
            if (u0.K(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i4);
            }
            ArrayList arrayList = this.f1710c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                c1 c1Var = (c1) arrayList.get(i10);
                z zVar = c1Var.f1755b;
                if (zVar != null) {
                    zVar.f1946t += i4;
                    if (u0.K(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c1Var.f1755b + " to " + c1Var.f1755b.f1946t);
                    }
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.f1710c;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            c1 c1Var = (c1) arrayList.get(size);
            if (c1Var.f1756c) {
                if (c1Var.f1754a == 8) {
                    c1Var.f1756c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i4 = c1Var.f1755b.f1952z;
                    c1Var.f1754a = 2;
                    c1Var.f1756c = false;
                    for (int i10 = size - 1; i10 >= 0; i10--) {
                        c1 c1Var2 = (c1) arrayList.get(i10);
                        if (c1Var2.f1756c && c1Var2.f1755b.f1952z == i4) {
                            arrayList.remove(i10);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final void e() {
        f(false, true);
    }

    public final int f(boolean z3, boolean z10) {
        if (this.f1725t) {
            throw new IllegalStateException("commit already called");
        }
        if (u0.K(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new e1());
            i("  ", printWriter, true);
            printWriter.close();
        }
        this.f1725t = true;
        boolean z11 = this.f1715i;
        u0 u0Var = this.f1724s;
        if (z11) {
            this.f1726u = u0Var.f1885k.getAndIncrement();
        } else {
            this.f1726u = -1;
        }
        if (z10) {
            u0Var.x(this, z3);
        }
        return this.f1726u;
    }

    public final void g() {
        if (this.f1715i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f1724s.A(this, false);
    }

    public final void h(int i4, z zVar, String str, int i10) {
        String str2 = zVar.O;
        if (str2 != null) {
            c5.c.c(zVar, str2);
        }
        Class<?> cls = zVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = zVar.A;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(zVar);
                sb2.append(": was ");
                throw new IllegalStateException(r5.c.m(sb2, zVar.A, " now ", str));
            }
            zVar.A = str;
        }
        if (i4 != 0) {
            if (i4 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + zVar + " with tag " + str + " to container view with no id");
            }
            int i11 = zVar.f1951y;
            if (i11 != 0 && i11 != i4) {
                throw new IllegalStateException("Can't change container ID of fragment " + zVar + ": was " + zVar.f1951y + " now " + i4);
            }
            zVar.f1951y = i4;
            zVar.f1952z = i4;
        }
        b(new c1(i10, zVar));
        zVar.f1947u = this.f1724s;
    }

    public final void i(String str, PrintWriter printWriter, boolean z3) {
        String str2;
        if (z3) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.j);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1726u);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1725t);
            if (this.f1714h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1714h));
            }
            if (this.f1711d != 0 || this.f1712e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1711d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1712e));
            }
            if (this.f1713f != 0 || this.g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1713f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.f1716k != 0 || this.f1717l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1716k));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1717l);
            }
            if (this.f1718m != 0 || this.f1719n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1718m));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1719n);
            }
        }
        ArrayList arrayList = this.f1710c;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            c1 c1Var = (c1) arrayList.get(i4);
            switch (c1Var.f1754a) {
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
                    str2 = "cmd=" + c1Var.f1754a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i4);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c1Var.f1755b);
            if (z3) {
                if (c1Var.f1757d != 0 || c1Var.f1758e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c1Var.f1757d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c1Var.f1758e));
                }
                if (c1Var.f1759f != 0 || c1Var.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c1Var.f1759f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c1Var.g));
                }
            }
        }
    }

    public final void j(z zVar) {
        u0 u0Var = zVar.f1947u;
        if (u0Var == null || u0Var == this.f1724s) {
            b(new c1(3, zVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + zVar.toString() + " is already attached to a FragmentManager.");
    }

    public final void k(Class cls, Bundle bundle, String str) {
        k0 k0Var = this.f1708a;
        if (k0Var == null) {
            throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        if (this.f1709b == null) {
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        z zVarA = k0Var.a(cls.getName());
        zVarA.Z(bundle);
        h(R.id.content_container, zVarA, str, 2);
    }

    public final void l(z zVar, androidx.lifecycle.s sVar) {
        u0 u0Var = zVar.f1947u;
        u0 u0Var2 = this.f1724s;
        if (u0Var != u0Var2) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + u0Var2);
        }
        if (sVar == androidx.lifecycle.s.f1181b && zVar.f1929a > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + sVar + " after the Fragment has been created");
        }
        if (sVar == androidx.lifecycle.s.f1180a) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + sVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        c1 c1Var = new c1();
        c1Var.f1754a = 10;
        c1Var.f1755b = zVar;
        c1Var.f1756c = false;
        c1Var.f1760h = zVar.P;
        c1Var.f1761i = sVar;
        b(c1Var);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1726u >= 0) {
            sb2.append(" #");
            sb2.append(this.f1726u);
        }
        if (this.j != null) {
            sb2.append(" ");
            sb2.append(this.j);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
