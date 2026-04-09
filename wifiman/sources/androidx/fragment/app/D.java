package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class D {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f31187a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f31188b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f31189c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private z f31190d;

    D() {
    }

    void A(z zVar) {
        this.f31190d = zVar;
    }

    B B(String str, B b10) {
        return b10 != null ? (B) this.f31189c.put(str, b10) : (B) this.f31189c.remove(str);
    }

    void a(Fragment fragment) {
        if (this.f31187a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f31187a) {
            this.f31187a.add(fragment);
        }
        fragment.f31253l = true;
    }

    void b() {
        this.f31188b.values().removeAll(Collections.singleton(null));
    }

    boolean c(String str) {
        return this.f31188b.get(str) != null;
    }

    void d(int i10) {
        for (C c10 : this.f31188b.values()) {
            if (c10 != null) {
                c10.t(i10);
            }
        }
    }

    void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f31188b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C c10 : this.f31188b.values()) {
                printWriter.print(str);
                if (c10 != null) {
                    Fragment fragmentK = c10.k();
                    printWriter.println(fragmentK);
                    fragmentK.i(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f31187a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = (Fragment) this.f31187a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    Fragment f(String str) {
        C c10 = (C) this.f31188b.get(str);
        if (c10 != null) {
            return c10.k();
        }
        return null;
    }

    Fragment g(int i10) {
        for (int size = this.f31187a.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f31187a.get(size);
            if (fragment != null && fragment.f31272x == i10) {
                return fragment;
            }
        }
        for (C c10 : this.f31188b.values()) {
            if (c10 != null) {
                Fragment fragmentK = c10.k();
                if (fragmentK.f31272x == i10) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment h(String str) {
        if (str != null) {
            for (int size = this.f31187a.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f31187a.get(size);
                if (fragment != null && str.equals(fragment.f31274z)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C c10 : this.f31188b.values()) {
            if (c10 != null) {
                Fragment fragmentK = c10.k();
                if (str.equals(fragmentK.f31274z)) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment i(String str) {
        Fragment fragmentK;
        for (C c10 : this.f31188b.values()) {
            if (c10 != null && (fragmentK = c10.k().k(str)) != null) {
                return fragmentK;
            }
        }
        return null;
    }

    int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.f31229H;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f31187a.indexOf(fragment);
        for (int i10 = iIndexOf - 1; i10 >= 0; i10--) {
            Fragment fragment2 = (Fragment) this.f31187a.get(i10);
            if (fragment2.f31229H == viewGroup && (view2 = fragment2.f31230I) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f31187a.size()) {
                return -1;
            }
            Fragment fragment3 = (Fragment) this.f31187a.get(iIndexOf);
            if (fragment3.f31229H == viewGroup && (view = fragment3.f31230I) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    List k() {
        ArrayList arrayList = new ArrayList();
        for (C c10 : this.f31188b.values()) {
            if (c10 != null) {
                arrayList.add(c10);
            }
        }
        return arrayList;
    }

    List l() {
        ArrayList arrayList = new ArrayList();
        for (C c10 : this.f31188b.values()) {
            if (c10 != null) {
                arrayList.add(c10.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    ArrayList m() {
        return new ArrayList(this.f31189c.values());
    }

    C n(String str) {
        return (C) this.f31188b.get(str);
    }

    List o() {
        ArrayList arrayList;
        if (this.f31187a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f31187a) {
            arrayList = new ArrayList(this.f31187a);
        }
        return arrayList;
    }

    z p() {
        return this.f31190d;
    }

    B q(String str) {
        return (B) this.f31189c.get(str);
    }

    void r(C c10) {
        Fragment fragmentK = c10.k();
        if (c(fragmentK.f31241f)) {
            return;
        }
        this.f31188b.put(fragmentK.f31241f, c10);
        if (fragmentK.f31225D) {
            if (fragmentK.f31224C) {
                this.f31190d.X(fragmentK);
            } else {
                this.f31190d.h0(fragmentK);
            }
            fragmentK.f31225D = false;
        }
        if (w.E0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragmentK);
        }
    }

    void s(C c10) {
        Fragment fragmentK = c10.k();
        if (fragmentK.f31224C) {
            this.f31190d.h0(fragmentK);
        }
        if (((C) this.f31188b.put(fragmentK.f31241f, null)) != null && w.E0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragmentK);
        }
    }

    void t() {
        Iterator it = this.f31187a.iterator();
        while (it.hasNext()) {
            C c10 = (C) this.f31188b.get(((Fragment) it.next()).f31241f);
            if (c10 != null) {
                c10.m();
            }
        }
        for (C c11 : this.f31188b.values()) {
            if (c11 != null) {
                c11.m();
                Fragment fragmentK = c11.k();
                if (fragmentK.f31255m && !fragmentK.c0()) {
                    if (fragmentK.f31257n && !this.f31189c.containsKey(fragmentK.f31241f)) {
                        c11.r();
                    }
                    s(c11);
                }
            }
        }
    }

    void u(Fragment fragment) {
        synchronized (this.f31187a) {
            this.f31187a.remove(fragment);
        }
        fragment.f31253l = false;
    }

    void v() {
        this.f31188b.clear();
    }

    void w(List list) {
        this.f31187a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Fragment fragmentF = f(str);
                if (fragmentF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (w.E0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + fragmentF);
                }
                a(fragmentF);
            }
        }
    }

    void x(ArrayList arrayList) {
        this.f31189c.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            B b10 = (B) it.next();
            this.f31189c.put(b10.f31167b, b10);
        }
    }

    ArrayList y() {
        ArrayList arrayList = new ArrayList(this.f31188b.size());
        for (C c10 : this.f31188b.values()) {
            if (c10 != null) {
                Fragment fragmentK = c10.k();
                c10.r();
                arrayList.add(fragmentK.f31241f);
                if (w.E0(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragmentK + ": " + fragmentK.f31237b);
                }
            }
        }
        return arrayList;
    }

    ArrayList z() {
        synchronized (this.f31187a) {
            try {
                if (this.f31187a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f31187a.size());
                Iterator it = this.f31187a.iterator();
                while (it.hasNext()) {
                    Fragment fragment = (Fragment) it.next();
                    arrayList.add(fragment.f31241f);
                    if (w.E0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment.f31241f + "): " + fragment);
                    }
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
