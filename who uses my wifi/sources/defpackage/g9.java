package defpackage;

import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class g9 implements vw {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public String i;
    public int j;
    public CharSequence k;
    public int l;
    public CharSequence m;
    public ArrayList n;
    public ArrayList o;
    public boolean p;
    public final xw q;
    public boolean r;
    public int s;

    public g9(xw xwVar) {
        xwVar.D();
        kw kwVar = xwVar.t;
        if (kwVar != null) {
            kwVar.x.getClassLoader();
        }
        this.a = new ArrayList();
        this.h = true;
        this.p = false;
        this.s = -1;
        this.q = xwVar;
    }

    @Override // defpackage.vw
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (xw.F(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        xw xwVar = this.q;
        if (xwVar.d == null) {
            xwVar.d = new ArrayList();
        }
        xwVar.d.add(this);
        return true;
    }

    public final void b(ix ixVar) {
        this.a.add(ixVar);
        ixVar.d = this.b;
        ixVar.e = this.c;
        ixVar.f = this.d;
        ixVar.g = this.e;
    }

    public final void c(int i) {
        if (this.g) {
            if (xw.F(2)) {
                toString();
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ix ixVar = (ix) arrayList.get(i2);
                iw iwVar = ixVar.b;
                if (iwVar != null) {
                    iwVar.v += i;
                    if (xw.F(2)) {
                        Objects.toString(ixVar.b);
                        int i3 = ixVar.b.v;
                    }
                }
            }
        }
    }

    public final int d(boolean z) {
        if (this.r) {
            throw new IllegalStateException("commit already called");
        }
        if (xw.F(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new f80());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.r = true;
        boolean z2 = this.g;
        xw xwVar = this.q;
        if (z2) {
            this.s = xwVar.i.getAndIncrement();
        } else {
            this.s = -1;
        }
        xwVar.w(this, z);
        return this.s;
    }

    public final void e(int i, iw iwVar, String str, int i2) {
        String str2 = iwVar.Q;
        if (str2 != null) {
            gx.c(iwVar, str2);
        }
        Class<?> cls = iwVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = iwVar.C;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(iwVar);
                sb.append(": was ");
                throw new IllegalStateException(ex0.l(sb, iwVar.C, " now ", str));
            }
            iwVar.C = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + iwVar + " with tag " + str + " to container view with no id");
            }
            int i3 = iwVar.A;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + iwVar + ": was " + iwVar.A + " now " + i);
            }
            iwVar.A = i;
            iwVar.B = i;
        }
        b(new ix(i2, iwVar));
        iwVar.w = this.q;
    }

    public final void f(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.j != 0 || this.k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ix ixVar = (ix) arrayList.get(i);
            switch (ixVar.a) {
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
                    str2 = "cmd=" + ixVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(ixVar.b);
            if (z) {
                if (ixVar.d != 0 || ixVar.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(ixVar.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(ixVar.e));
                }
                if (ixVar.f != 0 || ixVar.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(ixVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(ixVar.g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }
}
