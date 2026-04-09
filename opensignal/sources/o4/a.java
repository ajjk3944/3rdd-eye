package o4;

import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18758a;

    /* renamed from: b, reason: collision with root package name */
    public int f18759b;

    /* renamed from: c, reason: collision with root package name */
    public int f18760c;

    /* renamed from: d, reason: collision with root package name */
    public int f18761d;

    /* renamed from: e, reason: collision with root package name */
    public int f18762e;

    /* renamed from: f, reason: collision with root package name */
    public int f18763f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18764g;

    /* renamed from: h, reason: collision with root package name */
    public String f18765h;

    /* renamed from: i, reason: collision with root package name */
    public int f18766i;
    public CharSequence j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f18767l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f18768m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f18769n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f18770o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f18771p;

    /* renamed from: q, reason: collision with root package name */
    public final androidx.fragment.app.d f18772q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18773r;

    /* renamed from: s, reason: collision with root package name */
    public int f18774s;

    public a(androidx.fragment.app.d dVar) {
        dVar.I();
        x xVar = dVar.f1456w;
        if (xVar != null) {
            xVar.f18878r.getClassLoader();
        }
        this.f18758a = new ArrayList();
        this.f18770o = false;
        this.f18774s = -1;
        this.f18772q = dVar;
    }

    @Override // o4.g0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (androidx.fragment.app.d.K(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f18764g) {
            return true;
        }
        this.f18772q.f1439d.add(this);
        return true;
    }

    public final void b(o0 o0Var) {
        this.f18758a.add(o0Var);
        o0Var.f18829d = this.f18759b;
        o0Var.f18830e = this.f18760c;
        o0Var.f18831f = this.f18761d;
        o0Var.f18832g = this.f18762e;
    }

    public final void c(int i10) {
        if (this.f18764g) {
            if (androidx.fragment.app.d.K(2)) {
                toString();
            }
            ArrayList arrayList = this.f18758a;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                o0 o0Var = (o0) arrayList.get(i11);
                androidx.fragment.app.b bVar = o0Var.f18827b;
                if (bVar != null) {
                    bVar.P += i10;
                    if (androidx.fragment.app.d.K(2)) {
                        Objects.toString(o0Var.f18827b);
                        int i12 = o0Var.f18827b.P;
                    }
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.f18758a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            o0 o0Var = (o0) arrayList.get(size);
            if (o0Var.f18828c) {
                if (o0Var.f18826a == 8) {
                    o0Var.f18828c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i10 = o0Var.f18827b.V;
                    o0Var.f18826a = 2;
                    o0Var.f18828c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        o0 o0Var2 = (o0) arrayList.get(i11);
                        if (o0Var2.f18828c && o0Var2.f18827b.V == i10) {
                            arrayList.remove(i11);
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

    public final int f(boolean z10, boolean z11) {
        if (this.f18773r) {
            throw new IllegalStateException("commit already called");
        }
        if (androidx.fragment.app.d.K(2)) {
            toString();
            PrintWriter printWriter = new PrintWriter(new q0());
            h("  ", printWriter, true);
            printWriter.close();
        }
        this.f18773r = true;
        boolean z12 = this.f18764g;
        androidx.fragment.app.d dVar = this.f18772q;
        if (z12) {
            this.f18774s = dVar.k.getAndIncrement();
        } else {
            this.f18774s = -1;
        }
        if (z11) {
            dVar.y(this, z10);
        }
        return this.f18774s;
    }

    public final void g(int i10, androidx.fragment.app.b bVar, String str, int i11) {
        String str2 = bVar.f1421l0;
        if (str2 != null) {
            p4.d.c(bVar, str2);
        }
        Class<?> cls = bVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = bVar.W;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(bVar);
                sb2.append(": was ");
                throw new IllegalStateException(h0.b.s(sb2, bVar.W, " now ", str));
            }
            bVar.W = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + bVar + " with tag " + str + " to container view with no id");
            }
            int i12 = bVar.U;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + bVar + ": was " + bVar.U + " now " + i10);
            }
            bVar.U = i10;
            bVar.V = i10;
        }
        b(new o0(i11, bVar));
        bVar.Q = this.f18772q;
    }

    public final void h(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f18765h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f18774s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f18773r);
            if (this.f18763f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f18763f));
            }
            if (this.f18759b != 0 || this.f18760c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f18759b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f18760c));
            }
            if (this.f18761d != 0 || this.f18762e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f18761d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f18762e));
            }
            if (this.f18766i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f18766i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.k != 0 || this.f18767l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f18767l);
            }
        }
        ArrayList arrayList = this.f18758a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            o0 o0Var = (o0) arrayList.get(i10);
            switch (o0Var.f18826a) {
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
                case g4.j.STRING_FIELD_NUMBER /* 5 */:
                    str2 = "SHOW";
                    break;
                case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    str2 = "DETACH";
                    break;
                case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    str2 = "ATTACH";
                    break;
                case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + o0Var.f18826a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(o0Var.f18827b);
            if (z10) {
                if (o0Var.f18829d != 0 || o0Var.f18830e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(o0Var.f18829d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(o0Var.f18830e));
                }
                if (o0Var.f18831f != 0 || o0Var.f18832g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(o0Var.f18831f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(o0Var.f18832g));
                }
            }
        }
    }

    public final void i(int i10, androidx.fragment.app.b bVar, String str) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        g(i10, bVar, str, 2);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f18774s >= 0) {
            sb2.append(" #");
            sb2.append(this.f18774s);
        }
        if (this.f18765h != null) {
            sb2.append(" ");
            sb2.append(this.f18765h);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
