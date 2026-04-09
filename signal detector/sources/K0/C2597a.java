package k0;

import android.util.Log;
import androidx.lifecycle.EnumC0292n;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.google.android.gms.internal.ads.C2228zK;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import l0.AbstractC2632d;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2597a implements H {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f21586a;

    /* renamed from: b, reason: collision with root package name */
    public int f21587b;

    /* renamed from: c, reason: collision with root package name */
    public int f21588c;

    /* renamed from: d, reason: collision with root package name */
    public int f21589d;

    /* renamed from: e, reason: collision with root package name */
    public int f21590e;

    /* renamed from: f, reason: collision with root package name */
    public int f21591f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21592g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21593h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public int f21594j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f21595k;

    /* renamed from: l, reason: collision with root package name */
    public int f21596l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f21597m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f21598n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f21599o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f21600p;

    /* renamed from: q, reason: collision with root package name */
    public final K f21601q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f21602r;

    /* renamed from: s, reason: collision with root package name */
    public int f21603s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f21604t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2597a(K k6) {
        this();
        k6.E();
        x xVar = k6.f21522u;
        if (xVar != null) {
            xVar.f21726j.getClassLoader();
        }
        this.f21603s = -1;
        this.f21604t = false;
        this.f21601q = k6;
    }

    @Override // k0.H
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (K.H(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f21592g) {
            return true;
        }
        K k6 = this.f21601q;
        if (k6.f21506d == null) {
            k6.f21506d = new ArrayList();
        }
        k6.f21506d.add(this);
        return true;
    }

    public final void b(Q q3) {
        this.f21586a.add(q3);
        q3.f21564d = this.f21587b;
        q3.f21565e = this.f21588c;
        q3.f21566f = this.f21589d;
        q3.f21567g = this.f21590e;
    }

    public final void c(int i) {
        if (this.f21592g) {
            if (K.H(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f21586a;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                Q q3 = (Q) arrayList.get(i3);
                AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = q3.f21562b;
                if (abstractComponentCallbacksC2617v != null) {
                    abstractComponentCallbacksC2617v.f21683F += i;
                    if (K.H(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + q3.f21562b + " to " + q3.f21562b.f21683F);
                    }
                }
            }
        }
    }

    public final int d(boolean z6) {
        if (this.f21602r) {
            throw new IllegalStateException("commit already called");
        }
        if (K.H(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C2228zK());
            g("  ", printWriter, true);
            printWriter.close();
        }
        this.f21602r = true;
        boolean z7 = this.f21592g;
        K k6 = this.f21601q;
        if (z7) {
            this.f21603s = k6.i.getAndIncrement();
        } else {
            this.f21603s = -1;
        }
        k6.v(this, z6);
        return this.f21603s;
    }

    public final void e() {
        if (this.f21592g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f21593h = false;
        this.f21601q.y(this, false);
    }

    public final void f(int i, AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v, String str, int i3) {
        String str2 = abstractComponentCallbacksC2617v.f21702Z;
        if (str2 != null) {
            AbstractC2632d.c(abstractComponentCallbacksC2617v, str2);
        }
        Class<?> cls = abstractComponentCallbacksC2617v.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC2617v.M;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(abstractComponentCallbacksC2617v);
                sb.append(": was ");
                throw new IllegalStateException(AbstractC1135f5.n(sb, abstractComponentCallbacksC2617v.M, " now ", str));
            }
            abstractComponentCallbacksC2617v.M = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC2617v + " with tag " + str + " to container view with no id");
            }
            int i6 = abstractComponentCallbacksC2617v.f21688K;
            if (i6 != 0 && i6 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC2617v + ": was " + abstractComponentCallbacksC2617v.f21688K + " now " + i);
            }
            abstractComponentCallbacksC2617v.f21688K = i;
            abstractComponentCallbacksC2617v.f21689L = i;
        }
        b(new Q(i3, abstractComponentCallbacksC2617v));
        abstractComponentCallbacksC2617v.f21684G = this.f21601q;
    }

    public final void g(String str, PrintWriter printWriter, boolean z6) {
        String str2;
        if (z6) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f21603s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f21602r);
            if (this.f21591f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f21591f));
            }
            if (this.f21587b != 0 || this.f21588c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f21587b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f21588c));
            }
            if (this.f21589d != 0 || this.f21590e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f21589d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f21590e));
            }
            if (this.f21594j != 0 || this.f21595k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f21594j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f21595k);
            }
            if (this.f21596l != 0 || this.f21597m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f21596l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f21597m);
            }
        }
        ArrayList arrayList = this.f21586a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Q q3 = (Q) arrayList.get(i);
            switch (q3.f21561a) {
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
                    str2 = "cmd=" + q3.f21561a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(q3.f21562b);
            if (z6) {
                if (q3.f21564d != 0 || q3.f21565e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(q3.f21564d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(q3.f21565e));
                }
                if (q3.f21566f != 0 || q3.f21567g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(q3.f21566f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(q3.f21567g));
                }
            }
        }
    }

    public final void h(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
        K k6 = abstractComponentCallbacksC2617v.f21684G;
        if (k6 == null || k6 == this.f21601q) {
            b(new Q(3, abstractComponentCallbacksC2617v));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC2617v.toString() + " is already attached to a FragmentManager.");
    }

    public final void i(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v, EnumC0292n enumC0292n) {
        K k6 = abstractComponentCallbacksC2617v.f21684G;
        K k7 = this.f21601q;
        if (k6 != k7) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + k7);
        }
        if (enumC0292n == EnumC0292n.f5244b && abstractComponentCallbacksC2617v.f21703a > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC0292n + " after the Fragment has been created");
        }
        if (enumC0292n == EnumC0292n.f5243a) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC0292n + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        Q q3 = new Q();
        q3.f21561a = 10;
        q3.f21562b = abstractComponentCallbacksC2617v;
        q3.f21563c = false;
        q3.f21568h = abstractComponentCallbacksC2617v.f21704a0;
        q3.i = enumC0292n;
        b(q3);
    }

    public final void j(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
        K k6 = abstractComponentCallbacksC2617v.f21684G;
        if (k6 == null || k6 == this.f21601q) {
            b(new Q(8, abstractComponentCallbacksC2617v));
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC2617v.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f21603s >= 0) {
            sb.append(" #");
            sb.append(this.f21603s);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2597a(C2597a c2597a) {
        this();
        c2597a.f21601q.E();
        x xVar = c2597a.f21601q.f21522u;
        if (xVar != null) {
            xVar.f21726j.getClassLoader();
        }
        ArrayList arrayList = c2597a.f21586a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Q q3 = (Q) obj;
            ArrayList arrayList2 = this.f21586a;
            Q q6 = new Q();
            q6.f21561a = q3.f21561a;
            q6.f21562b = q3.f21562b;
            q6.f21563c = q3.f21563c;
            q6.f21564d = q3.f21564d;
            q6.f21565e = q3.f21565e;
            q6.f21566f = q3.f21566f;
            q6.f21567g = q3.f21567g;
            q6.f21568h = q3.f21568h;
            q6.i = q3.i;
            arrayList2.add(q6);
        }
        this.f21587b = c2597a.f21587b;
        this.f21588c = c2597a.f21588c;
        this.f21589d = c2597a.f21589d;
        this.f21590e = c2597a.f21590e;
        this.f21591f = c2597a.f21591f;
        this.f21592g = c2597a.f21592g;
        this.f21593h = c2597a.f21593h;
        this.i = c2597a.i;
        this.f21596l = c2597a.f21596l;
        this.f21597m = c2597a.f21597m;
        this.f21594j = c2597a.f21594j;
        this.f21595k = c2597a.f21595k;
        if (c2597a.f21598n != null) {
            ArrayList arrayList3 = new ArrayList();
            this.f21598n = arrayList3;
            arrayList3.addAll(c2597a.f21598n);
        }
        if (c2597a.f21599o != null) {
            ArrayList arrayList4 = new ArrayList();
            this.f21599o = arrayList4;
            arrayList4.addAll(c2597a.f21599o);
        }
        this.f21600p = c2597a.f21600p;
        this.f21603s = -1;
        this.f21604t = false;
        this.f21601q = c2597a.f21601q;
        this.f21602r = c2597a.f21602r;
        this.f21603s = c2597a.f21603s;
        this.f21604t = c2597a.f21604t;
    }

    public C2597a() {
        this.f21586a = new ArrayList();
        this.f21593h = true;
        this.f21600p = false;
    }
}
