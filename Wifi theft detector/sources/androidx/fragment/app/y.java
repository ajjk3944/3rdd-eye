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
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3387a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3388b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3389c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public u f3390d;

    public void A(u uVar) {
        this.f3390d = uVar;
    }

    public FragmentState B(String str, FragmentState fragmentState) {
        return fragmentState != null ? (FragmentState) this.f3389c.put(str, fragmentState) : (FragmentState) this.f3389c.remove(str);
    }

    public void a(Fragment fragment) {
        if (this.f3387a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f3387a) {
            this.f3387a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public void b() {
        this.f3388b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(String str) {
        return this.f3388b.get(str) != null;
    }

    public void d(int i10) {
        for (w wVar : this.f3388b.values()) {
            if (wVar != null) {
                wVar.u(i10);
            }
        }
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f3388b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (w wVar : this.f3388b.values()) {
                printWriter.print(str);
                if (wVar != null) {
                    Fragment fragmentK = wVar.k();
                    printWriter.println(fragmentK);
                    fragmentK.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f3387a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = (Fragment) this.f3387a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    public Fragment f(String str) {
        w wVar = (w) this.f3388b.get(str);
        if (wVar != null) {
            return wVar.k();
        }
        return null;
    }

    public Fragment g(int i10) {
        for (int size = this.f3387a.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f3387a.get(size);
            if (fragment != null && fragment.mFragmentId == i10) {
                return fragment;
            }
        }
        for (w wVar : this.f3388b.values()) {
            if (wVar != null) {
                Fragment fragmentK = wVar.k();
                if (fragmentK.mFragmentId == i10) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.f3387a.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f3387a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (w wVar : this.f3388b.values()) {
            if (wVar != null) {
                Fragment fragmentK = wVar.k();
                if (str.equals(fragmentK.mTag)) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    public Fragment i(String str) {
        Fragment fragmentFindFragmentByWho;
        for (w wVar : this.f3388b.values()) {
            if (wVar != null && (fragmentFindFragmentByWho = wVar.k().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    public int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f3387a.indexOf(fragment);
        for (int i10 = iIndexOf - 1; i10 >= 0; i10--) {
            Fragment fragment2 = (Fragment) this.f3387a.get(i10);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f3387a.size()) {
                return -1;
            }
            Fragment fragment3 = (Fragment) this.f3387a.get(iIndexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public List k() {
        ArrayList arrayList = new ArrayList();
        for (w wVar : this.f3388b.values()) {
            if (wVar != null) {
                arrayList.add(wVar);
            }
        }
        return arrayList;
    }

    public List l() {
        ArrayList arrayList = new ArrayList();
        for (w wVar : this.f3388b.values()) {
            if (wVar != null) {
                arrayList.add(wVar.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public ArrayList m() {
        return new ArrayList(this.f3389c.values());
    }

    public w n(String str) {
        return (w) this.f3388b.get(str);
    }

    public List o() {
        ArrayList arrayList;
        if (this.f3387a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f3387a) {
            arrayList = new ArrayList(this.f3387a);
        }
        return arrayList;
    }

    public u p() {
        return this.f3390d;
    }

    public FragmentState q(String str) {
        return (FragmentState) this.f3389c.get(str);
    }

    public void r(w wVar) {
        Fragment fragmentK = wVar.k();
        if (c(fragmentK.mWho)) {
            return;
        }
        this.f3388b.put(fragmentK.mWho, wVar);
        if (fragmentK.mRetainInstanceChangedWhileDetached) {
            if (fragmentK.mRetainInstance) {
                this.f3390d.f(fragmentK);
            } else {
                this.f3390d.p(fragmentK);
            }
            fragmentK.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.I0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragmentK);
        }
    }

    public void s(w wVar) {
        Fragment fragmentK = wVar.k();
        if (fragmentK.mRetainInstance) {
            this.f3390d.p(fragmentK);
        }
        if (((w) this.f3388b.put(fragmentK.mWho, null)) != null && FragmentManager.I0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragmentK);
        }
    }

    public void t() {
        ArrayList arrayList = this.f3387a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            w wVar = (w) this.f3388b.get(((Fragment) obj).mWho);
            if (wVar != null) {
                wVar.m();
            }
        }
        for (w wVar2 : this.f3388b.values()) {
            if (wVar2 != null) {
                wVar2.m();
                Fragment fragmentK = wVar2.k();
                if (fragmentK.mRemoving && !fragmentK.isInBackStack()) {
                    if (fragmentK.mBeingSaved && !this.f3389c.containsKey(fragmentK.mWho)) {
                        wVar2.s();
                    }
                    s(wVar2);
                }
            }
        }
    }

    public void u(Fragment fragment) {
        synchronized (this.f3387a) {
            this.f3387a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    public void v() {
        this.f3388b.clear();
    }

    public void w(List list) {
        this.f3387a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Fragment fragmentF = f(str);
                if (fragmentF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.I0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + fragmentF);
                }
                a(fragmentF);
            }
        }
    }

    public void x(ArrayList arrayList) {
        this.f3389c.clear();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            FragmentState fragmentState = (FragmentState) obj;
            this.f3389c.put(fragmentState.f3193b, fragmentState);
        }
    }

    public ArrayList y() {
        ArrayList arrayList = new ArrayList(this.f3388b.size());
        for (w wVar : this.f3388b.values()) {
            if (wVar != null) {
                Fragment fragmentK = wVar.k();
                wVar.s();
                arrayList.add(fragmentK.mWho);
                if (FragmentManager.I0(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragmentK + ": " + fragmentK.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    public ArrayList z() {
        synchronized (this.f3387a) {
            try {
                if (this.f3387a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f3387a.size());
                ArrayList arrayList2 = this.f3387a;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    Fragment fragment = (Fragment) obj;
                    arrayList.add(fragment.mWho);
                    if (FragmentManager.I0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment.mWho + "): " + fragment);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
