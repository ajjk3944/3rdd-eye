package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xw {
    public vq2 A;
    public vq2 B;
    public ArrayDeque C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public ArrayList J;
    public ArrayList K;
    public ax L;
    public final a9 M;
    public boolean b;
    public ArrayList d;
    public ArrayList e;
    public aj0 g;
    public final l92 l;
    public final CopyOnWriteArrayList m;
    public final ow n;
    public final ow o;
    public final ow p;
    public final ow q;
    public final rw r;
    public int s;
    public kw t;
    public i30 u;
    public iw v;
    public iw w;
    public final sw x;
    public final fr y;
    public vq2 z;
    public final ArrayList a = new ArrayList();
    public final p21 c = new p21(4);
    public final nw f = new nw(this);
    public final qw h = new qw(this);
    public final AtomicInteger i = new AtomicInteger();
    public final Map j = Collections.synchronizedMap(new HashMap());
    public final Map k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [ow] */
    /* JADX WARN: Type inference failed for: r0v13, types: [ow] */
    /* JADX WARN: Type inference failed for: r0v14, types: [ow] */
    /* JADX WARN: Type inference failed for: r0v15, types: [ow] */
    public xw() {
        Collections.synchronizedMap(new HashMap());
        l92 l92Var = new l92();
        l92Var.f = new CopyOnWriteArrayList();
        l92Var.g = this;
        this.l = l92Var;
        this.m = new CopyOnWriteArrayList();
        final int i = 0;
        this.n = new ui(this) { // from class: ow
            public final /* synthetic */ xw b;

            {
                this.b = this;
            }

            @Override // defpackage.ui
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        xw xwVar = this.b;
                        if (xwVar.H()) {
                            xwVar.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        xw xwVar2 = this.b;
                        if (xwVar2.H() && num.intValue() == 80) {
                            xwVar2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        lf0 lf0Var = (lf0) obj;
                        xw xwVar3 = this.b;
                        if (xwVar3.H()) {
                            boolean z = lf0Var.a;
                            xwVar3.m(false);
                            break;
                        }
                        break;
                    default:
                        sk0 sk0Var = (sk0) obj;
                        xw xwVar4 = this.b;
                        if (xwVar4.H()) {
                            boolean z2 = sk0Var.a;
                            xwVar4.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.o = new ui(this) { // from class: ow
            public final /* synthetic */ xw b;

            {
                this.b = this;
            }

            @Override // defpackage.ui
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        xw xwVar = this.b;
                        if (xwVar.H()) {
                            xwVar.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        xw xwVar2 = this.b;
                        if (xwVar2.H() && num.intValue() == 80) {
                            xwVar2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        lf0 lf0Var = (lf0) obj;
                        xw xwVar3 = this.b;
                        if (xwVar3.H()) {
                            boolean z = lf0Var.a;
                            xwVar3.m(false);
                            break;
                        }
                        break;
                    default:
                        sk0 sk0Var = (sk0) obj;
                        xw xwVar4 = this.b;
                        if (xwVar4.H()) {
                            boolean z2 = sk0Var.a;
                            xwVar4.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.p = new ui(this) { // from class: ow
            public final /* synthetic */ xw b;

            {
                this.b = this;
            }

            @Override // defpackage.ui
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        xw xwVar = this.b;
                        if (xwVar.H()) {
                            xwVar.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        xw xwVar2 = this.b;
                        if (xwVar2.H() && num.intValue() == 80) {
                            xwVar2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        lf0 lf0Var = (lf0) obj;
                        xw xwVar3 = this.b;
                        if (xwVar3.H()) {
                            boolean z = lf0Var.a;
                            xwVar3.m(false);
                            break;
                        }
                        break;
                    default:
                        sk0 sk0Var = (sk0) obj;
                        xw xwVar4 = this.b;
                        if (xwVar4.H()) {
                            boolean z2 = sk0Var.a;
                            xwVar4.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.q = new ui(this) { // from class: ow
            public final /* synthetic */ xw b;

            {
                this.b = this;
            }

            @Override // defpackage.ui
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        xw xwVar = this.b;
                        if (xwVar.H()) {
                            xwVar.h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        xw xwVar2 = this.b;
                        if (xwVar2.H() && num.intValue() == 80) {
                            xwVar2.l(false);
                            break;
                        }
                        break;
                    case 2:
                        lf0 lf0Var = (lf0) obj;
                        xw xwVar3 = this.b;
                        if (xwVar3.H()) {
                            boolean z = lf0Var.a;
                            xwVar3.m(false);
                            break;
                        }
                        break;
                    default:
                        sk0 sk0Var = (sk0) obj;
                        xw xwVar4 = this.b;
                        if (xwVar4.H()) {
                            boolean z2 = sk0Var.a;
                            xwVar4.r(false);
                            break;
                        }
                        break;
                }
            }
        };
        this.r = new rw(this);
        this.s = -1;
        this.x = new sw(this);
        this.y = new fr(22);
        this.C = new ArrayDeque();
        this.M = new a9(8, this);
    }

    public static boolean F(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean G(iw iwVar) {
        iwVar.getClass();
        ArrayList arrayListM = iwVar.y.c.m();
        int size = arrayListM.size();
        boolean zG = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayListM.get(i);
            i++;
            iw iwVar2 = (iw) obj;
            if (iwVar2 != null) {
                zG = G(iwVar2);
            }
            if (zG) {
                return true;
            }
        }
        return false;
    }

    public static boolean I(iw iwVar) {
        if (iwVar == null) {
            return true;
        }
        if (iwVar.G) {
            return iwVar.w == null || I(iwVar.z);
        }
        return false;
    }

    public static boolean J(iw iwVar) {
        if (iwVar == null) {
            return true;
        }
        xw xwVar = iwVar.w;
        return iwVar.equals(xwVar.w) && J(xwVar.v);
    }

    public final iw A(int i) {
        p21 p21Var = this.c;
        ArrayList arrayList = (ArrayList) p21Var.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            iw iwVar = (iw) arrayList.get(size);
            if (iwVar != null && iwVar.A == i) {
                return iwVar;
            }
        }
        for (ex exVar : ((HashMap) p21Var.g).values()) {
            if (exVar != null) {
                iw iwVar2 = exVar.c;
                if (iwVar2.A == i) {
                    return iwVar2;
                }
            }
        }
        return null;
    }

    public final iw B(String str) {
        p21 p21Var = this.c;
        ArrayList arrayList = (ArrayList) p21Var.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            iw iwVar = (iw) arrayList.get(size);
            if (iwVar != null && str.equals(iwVar.C)) {
                return iwVar;
            }
        }
        for (ex exVar : ((HashMap) p21Var.g).values()) {
            if (exVar != null) {
                iw iwVar2 = exVar.c;
                if (str.equals(iwVar2.C)) {
                    return iwVar2;
                }
            }
        }
        return null;
    }

    public final ViewGroup C(iw iwVar) {
        ViewGroup viewGroup = iwVar.I;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (iwVar.B <= 0 || !this.u.L()) {
            return null;
        }
        View viewK = this.u.K(iwVar.B);
        if (viewK instanceof ViewGroup) {
            return (ViewGroup) viewK;
        }
        return null;
    }

    public final sw D() {
        iw iwVar = this.v;
        return iwVar != null ? iwVar.w.D() : this.x;
    }

    public final fr E() {
        iw iwVar = this.v;
        return iwVar != null ? iwVar.w.E() : this.y;
    }

    public final boolean H() {
        iw iwVar = this.v;
        if (iwVar == null) {
            return true;
        }
        return iwVar.x != null && iwVar.p && iwVar.k().H();
    }

    public final void K(int i, boolean z) {
        kw kwVar;
        if (this.t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.s) {
            this.s = i;
            p21 p21Var = this.c;
            HashMap map = (HashMap) p21Var.g;
            ArrayList arrayList = (ArrayList) p21Var.f;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ex exVar = (ex) map.get(((iw) obj).j);
                if (exVar != null) {
                    exVar.k();
                }
            }
            for (ex exVar2 : map.values()) {
                if (exVar2 != null) {
                    exVar2.k();
                    iw iwVar = exVar2.c;
                    if (iwVar.q && !iwVar.q()) {
                        p21Var.u(exVar2);
                    }
                }
            }
            Y();
            if (this.D && (kwVar = this.t) != null && this.s == 7) {
                kwVar.A.invalidateOptionsMenu();
                this.D = false;
            }
        }
    }

    public final void L() {
        if (this.t == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.L.g = false;
        for (iw iwVar : this.c.n()) {
            if (iwVar != null) {
                iwVar.y.L();
            }
        }
    }

    public final boolean M() {
        return N(-1, 0);
    }

    public final boolean N(int i, int i2) {
        y(false);
        x(true);
        iw iwVar = this.w;
        if (iwVar != null && i < 0 && iwVar.h().M()) {
            return true;
        }
        boolean zO = O(this.I, this.J, i, i2);
        if (zO) {
            this.b = true;
            try {
                Q(this.I, this.J);
            } finally {
                d();
            }
        }
        a0();
        u();
        ((HashMap) this.c.g).values().removeAll(Collections.singleton(null));
        return zO;
    }

    public final boolean O(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        ArrayList arrayList3 = this.d;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.d.size() - 1;
            } else {
                int size2 = this.d.size() - 1;
                while (size2 >= 0) {
                    g9 g9Var = (g9) this.d.get(size2);
                    if (i >= 0 && i == g9Var.s) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        g9 g9Var2 = (g9) this.d.get(size - 1);
                        if (i < 0 || i != g9Var2.s) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.d.size() - 1; size3 >= size; size3--) {
            arrayList.add((g9) this.d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void P(iw iwVar) {
        if (F(2)) {
            Objects.toString(iwVar);
        }
        boolean zQ = iwVar.q();
        if (iwVar.E && zQ) {
            return;
        }
        p21 p21Var = this.c;
        synchronized (((ArrayList) p21Var.f)) {
            ((ArrayList) p21Var.f).remove(iwVar);
        }
        iwVar.p = false;
        if (G(iwVar)) {
            this.D = true;
        }
        iwVar.q = true;
        X(iwVar);
    }

    public final void Q(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((g9) arrayList.get(i)).p) {
                if (i2 != i) {
                    z(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((g9) arrayList.get(i2)).p) {
                        i2++;
                    }
                }
                z(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            z(arrayList, arrayList2, i2, size);
        }
    }

    public final void R(Parcelable parcelable) {
        l92 l92Var;
        int i;
        int i2;
        ex exVar;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.t.x.getClassLoader());
                this.k.put(str.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.t.x.getClassLoader());
                arrayList.add((dx) bundle.getParcelable("state"));
            }
        }
        p21 p21Var = this.c;
        HashMap map = (HashMap) p21Var.h;
        HashMap map2 = (HashMap) p21Var.g;
        map.clear();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            dx dxVar = (dx) obj;
            map.put(dxVar.g, dxVar);
        }
        yw ywVar = (yw) bundle3.getParcelable("state");
        if (ywVar == null) {
            return;
        }
        map2.clear();
        ArrayList arrayList2 = ywVar.f;
        int size2 = arrayList2.size();
        int i4 = 0;
        while (true) {
            l92Var = this.l;
            i = 2;
            if (i4 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i4);
            i4++;
            dx dxVar2 = (dx) ((HashMap) p21Var.h).remove((String) obj2);
            if (dxVar2 != null) {
                iw iwVar = (iw) this.L.b.get(dxVar2.g);
                if (iwVar != null) {
                    if (F(2)) {
                        iwVar.toString();
                    }
                    exVar = new ex(l92Var, p21Var, iwVar, dxVar2);
                } else {
                    exVar = new ex(this.l, this.c, this.t.x.getClassLoader(), D(), dxVar2);
                }
                iw iwVar2 = exVar.c;
                iwVar2.w = this;
                if (F(2)) {
                    iwVar2.toString();
                }
                exVar.m(this.t.x.getClassLoader());
                p21Var.t(exVar);
                exVar.e = this.s;
            }
        }
        ax axVar = this.L;
        axVar.getClass();
        ArrayList arrayList3 = new ArrayList(axVar.b.values());
        int size3 = arrayList3.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj3 = arrayList3.get(i5);
            i5++;
            iw iwVar3 = (iw) obj3;
            if (map2.get(iwVar3.j) == null) {
                if (F(2)) {
                    iwVar3.toString();
                    Objects.toString(ywVar.f);
                }
                this.L.d(iwVar3);
                iwVar3.w = this;
                ex exVar2 = new ex(l92Var, p21Var, iwVar3);
                exVar2.e = 1;
                exVar2.k();
                iwVar3.q = true;
                exVar2.k();
            }
        }
        ArrayList arrayList4 = ywVar.g;
        ((ArrayList) p21Var.f).clear();
        if (arrayList4 != null) {
            int size4 = arrayList4.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList4.get(i6);
                i6++;
                String str3 = (String) obj4;
                iw iwVarI = p21Var.i(str3);
                if (iwVarI == null) {
                    throw new IllegalStateException(ex0.h("No instantiated fragment for (", str3, ")"));
                }
                if (F(2)) {
                    iwVarI.toString();
                }
                p21Var.f(iwVarI);
            }
        }
        if (ywVar.h != null) {
            this.d = new ArrayList(ywVar.h.length);
            int i7 = 0;
            while (true) {
                h9[] h9VarArr = ywVar.h;
                if (i7 >= h9VarArr.length) {
                    break;
                }
                h9 h9Var = h9VarArr[i7];
                ArrayList arrayList5 = h9Var.g;
                g9 g9Var = new g9(this);
                int[] iArr = h9Var.f;
                int i8 = 0;
                int i9 = 0;
                while (i8 < iArr.length) {
                    ix ixVar = new ix();
                    int i10 = i8 + 1;
                    ixVar.a = iArr[i8];
                    if (F(i)) {
                        Objects.toString(g9Var);
                        int i11 = iArr[i10];
                    }
                    int i12 = i;
                    ixVar.h = u50.values()[h9Var.h[i9]];
                    ixVar.i = u50.values()[h9Var.i[i9]];
                    int i13 = i8 + 2;
                    ixVar.c = iArr[i10] != 0;
                    int i14 = iArr[i13];
                    ixVar.d = i14;
                    int i15 = iArr[i8 + 3];
                    ixVar.e = i15;
                    int i16 = i8 + 5;
                    int i17 = iArr[i8 + 4];
                    ixVar.f = i17;
                    i8 += 6;
                    int i18 = iArr[i16];
                    ixVar.g = i18;
                    g9Var.b = i14;
                    g9Var.c = i15;
                    g9Var.d = i17;
                    g9Var.e = i18;
                    g9Var.b(ixVar);
                    i9++;
                    i = i12;
                }
                int i19 = i;
                g9Var.f = h9Var.j;
                g9Var.i = h9Var.k;
                g9Var.g = true;
                g9Var.j = h9Var.m;
                g9Var.k = h9Var.n;
                g9Var.l = h9Var.o;
                g9Var.m = h9Var.p;
                g9Var.n = h9Var.q;
                g9Var.o = h9Var.r;
                g9Var.p = h9Var.s;
                g9Var.s = h9Var.l;
                for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                    String str4 = (String) arrayList5.get(i20);
                    if (str4 != null) {
                        ((ix) g9Var.a.get(i20)).b = p21Var.i(str4);
                    }
                }
                g9Var.c(1);
                if (F(i19)) {
                    g9Var.toString();
                    PrintWriter printWriter = new PrintWriter(new f80());
                    g9Var.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(g9Var);
                i7++;
                i = i19;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.d = null;
        }
        this.i.set(ywVar.i);
        String str5 = ywVar.j;
        if (str5 != null) {
            iw iwVarI2 = p21Var.i(str5);
            this.w = iwVarI2;
            q(iwVarI2);
        }
        ArrayList arrayList6 = ywVar.k;
        if (arrayList6 != null) {
            for (int i21 = i2; i21 < arrayList6.size(); i21++) {
                this.j.put((String) arrayList6.get(i21), (i9) ywVar.l.get(i21));
            }
        }
        this.C = new ArrayDeque(ywVar.m);
    }

    public final Bundle S() {
        int i;
        ArrayList arrayList;
        h9[] h9VarArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = e().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            tn tnVar = (tn) it.next();
            if (tnVar.e) {
                F(2);
                tnVar.e = false;
                tnVar.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((tn) it2.next()).e();
        }
        y(true);
        this.E = true;
        this.L.g = true;
        p21 p21Var = this.c;
        p21Var.getClass();
        HashMap map = (HashMap) p21Var.g;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it3 = map.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            ex exVar = (ex) it3.next();
            if (exVar != null) {
                iw iwVar = exVar.c;
                dx dxVar = new dx(iwVar);
                if (iwVar.f <= -1 || dxVar.r != null) {
                    dxVar.r = iwVar.g;
                } else {
                    Bundle bundle2 = new Bundle();
                    iwVar.z(bundle2);
                    iwVar.V.y(bundle2);
                    bundle2.putParcelable("android:support:fragments", iwVar.y.S());
                    exVar.a.q(false);
                    Bundle bundle3 = bundle2.isEmpty() ? null : bundle2;
                    if (iwVar.J != null) {
                        exVar.o();
                    }
                    if (iwVar.h != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putSparseParcelableArray("android:view_state", iwVar.h);
                    }
                    if (iwVar.i != null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBundle("android:view_registry_state", iwVar.i);
                    }
                    if (!iwVar.L) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putBoolean("android:user_visible_hint", iwVar.L);
                    }
                    dxVar.r = bundle3;
                    if (iwVar.m != null) {
                        if (bundle3 == null) {
                            dxVar.r = new Bundle();
                        }
                        dxVar.r.putString("android:target_state", iwVar.m);
                        int i2 = iwVar.n;
                        if (i2 != 0) {
                            dxVar.r.putInt("android:target_req_state", i2);
                        }
                    }
                }
                arrayList2.add(iwVar.j);
                if (F(2)) {
                    iwVar.toString();
                    Objects.toString(iwVar.g);
                }
            }
        }
        p21 p21Var2 = this.c;
        p21Var2.getClass();
        ArrayList arrayList3 = new ArrayList(((HashMap) p21Var2.h).values());
        if (arrayList3.isEmpty()) {
            F(2);
            return bundle;
        }
        p21 p21Var3 = this.c;
        synchronized (((ArrayList) p21Var3.f)) {
            try {
                if (((ArrayList) p21Var3.f).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(((ArrayList) p21Var3.f).size());
                    ArrayList arrayList4 = (ArrayList) p21Var3.f;
                    int size2 = arrayList4.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj = arrayList4.get(i3);
                        i3++;
                        iw iwVar2 = (iw) obj;
                        arrayList.add(iwVar2.j);
                        if (F(2)) {
                            iwVar2.toString();
                        }
                    }
                }
            } finally {
            }
        }
        ArrayList arrayList5 = this.d;
        if (arrayList5 == null || (size = arrayList5.size()) <= 0) {
            h9VarArr = null;
        } else {
            h9VarArr = new h9[size];
            for (int i4 = 0; i4 < size; i4++) {
                h9VarArr[i4] = new h9((g9) this.d.get(i4));
                if (F(2)) {
                    Objects.toString(this.d.get(i4));
                }
            }
        }
        yw ywVar = new yw();
        ywVar.j = null;
        ArrayList arrayList6 = new ArrayList();
        ywVar.k = arrayList6;
        ArrayList arrayList7 = new ArrayList();
        ywVar.l = arrayList7;
        ywVar.f = arrayList2;
        ywVar.g = arrayList;
        ywVar.h = h9VarArr;
        ywVar.i = this.i.get();
        iw iwVar3 = this.w;
        if (iwVar3 != null) {
            ywVar.j = iwVar3.j;
        }
        arrayList6.addAll(this.j.keySet());
        arrayList7.addAll(this.j.values());
        ywVar.m = new ArrayList(this.C);
        bundle.putParcelable("state", ywVar);
        for (String str : this.k.keySet()) {
            bundle.putBundle("result_" + str, (Bundle) this.k.get(str));
        }
        int size3 = arrayList3.size();
        while (i < size3) {
            Object obj2 = arrayList3.get(i);
            i++;
            dx dxVar2 = (dx) obj2;
            Bundle bundle4 = new Bundle();
            bundle4.putParcelable("state", dxVar2);
            bundle.putBundle("fragment_" + dxVar2.g, bundle4);
        }
        return bundle;
    }

    public final void T() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.t.y.removeCallbacks(this.M);
                    this.t.y.post(this.M);
                    a0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void U(iw iwVar, boolean z) {
        ViewGroup viewGroupC = C(iwVar);
        if (viewGroupC == null || !(viewGroupC instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupC).setDrawDisappearingViewsLast(!z);
    }

    public final void V(iw iwVar, u50 u50Var) {
        if (iwVar.equals(this.c.i(iwVar.j)) && (iwVar.x == null || iwVar.w == this)) {
            iwVar.R = u50Var;
            return;
        }
        throw new IllegalArgumentException("Fragment " + iwVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void W(iw iwVar) {
        if (iwVar != null) {
            if (!iwVar.equals(this.c.i(iwVar.j)) || (iwVar.x != null && iwVar.w != this)) {
                throw new IllegalArgumentException("Fragment " + iwVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        iw iwVar2 = this.w;
        this.w = iwVar;
        q(iwVar2);
        q(this.w);
    }

    public final void X(iw iwVar) {
        ViewGroup viewGroupC = C(iwVar);
        if (viewGroupC != null) {
            hw hwVar = iwVar.M;
            if ((hwVar == null ? 0 : hwVar.e) + (hwVar == null ? 0 : hwVar.d) + (hwVar == null ? 0 : hwVar.c) + (hwVar == null ? 0 : hwVar.b) > 0) {
                if (viewGroupC.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupC.setTag(R.id.visible_removing_fragment_view_tag, iwVar);
                }
                iw iwVar2 = (iw) viewGroupC.getTag(R.id.visible_removing_fragment_view_tag);
                hw hwVar2 = iwVar.M;
                boolean z = hwVar2 != null ? hwVar2.a : false;
                if (iwVar2.M == null) {
                    return;
                }
                iwVar2.f().a = z;
            }
        }
    }

    public final void Y() {
        ArrayList arrayListL = this.c.l();
        int size = arrayListL.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListL.get(i);
            i++;
            ex exVar = (ex) obj;
            iw iwVar = exVar.c;
            if (iwVar.K) {
                if (this.b) {
                    this.H = true;
                } else {
                    iwVar.K = false;
                    exVar.k();
                }
            }
        }
    }

    public final void Z(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new f80());
        kw kwVar = this.t;
        if (kwVar == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            kwVar.A.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    public final ex a(iw iwVar) {
        String str = iwVar.Q;
        if (str != null) {
            gx.c(iwVar, str);
        }
        if (F(2)) {
            iwVar.toString();
        }
        ex exVarF = f(iwVar);
        iwVar.w = this;
        p21 p21Var = this.c;
        p21Var.t(exVarF);
        if (!iwVar.E) {
            p21Var.f(iwVar);
            iwVar.q = false;
            if (iwVar.J == null) {
                iwVar.N = false;
            }
            if (G(iwVar)) {
                this.D = true;
            }
        }
        return exVarF;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [rx, ry] */
    /* JADX WARN: Type inference failed for: r1v10, types: [rx, ry] */
    public final void a0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    qw qwVar = this.h;
                    qwVar.a = true;
                    ?? r1 = qwVar.c;
                    if (r1 != 0) {
                        r1.a();
                    }
                    return;
                }
                qw qwVar2 = this.h;
                ArrayList arrayList = this.d;
                qwVar2.a = (arrayList != null ? arrayList.size() : 0) > 0 && J(this.v);
                ?? r0 = qwVar2.c;
                if (r0 != 0) {
                    r0.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(kw kwVar, i30 i30Var, iw iwVar) {
        if (this.t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.t = kwVar;
        this.u = i30Var;
        this.v = iwVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.m;
        if (iwVar != 0) {
            copyOnWriteArrayList.add(new tw(iwVar));
        } else if (kwVar != null) {
            copyOnWriteArrayList.add(kwVar);
        }
        if (this.v != null) {
            a0();
        }
        if (kwVar != null) {
            aj0 aj0VarI = kwVar.A.i();
            this.g = aj0VarI;
            aj0VarI.a(iwVar != 0 ? iwVar : kwVar, this.h);
        }
        if (iwVar != 0) {
            ax axVar = iwVar.w.L;
            HashMap map = axVar.c;
            ax axVar2 = (ax) map.get(iwVar.j);
            if (axVar2 == null) {
                axVar2 = new ax(axVar.e);
                map.put(iwVar.j, axVar2);
            }
            this.L = axVar2;
        } else if (kwVar != null) {
            this.L = (ax) new ug0(kwVar.A.d(), ax.h).t(ax.class);
        } else {
            this.L = new ax(false);
        }
        ax axVar3 = this.L;
        axVar3.g = this.E || this.F;
        this.c.i = axVar3;
        kw kwVar2 = this.t;
        if (kwVar2 != null && iwVar == 0) {
            vq2 vq2VarA = kwVar2.a();
            vq2VarA.q("android:support:fragments", new pw(0, this));
            Bundle bundleE = vq2VarA.e("android:support:fragments");
            if (bundleE != null) {
                R(bundleE);
            }
        }
        kw kwVar3 = this.t;
        if (kwVar3 != null) {
            bh bhVar = kwVar3.A.m;
            String str = "FragmentManager:" + (iwVar != 0 ? ex0.k(new StringBuilder(), iwVar.j, ":") : "");
            int i = 5;
            this.z = bhVar.b(ex0.g(str, "StartActivityForResult"), new n2(1), new f20(i, this));
            this.A = bhVar.b(ex0.g(str, "StartIntentSenderForResult"), new n2(2), new ug0(i, this));
            this.B = bhVar.b(ex0.g(str, "RequestPermissions"), new n2(0), new sq0(4, this));
        }
        kw kwVar4 = this.t;
        if (kwVar4 != null) {
            kwVar4.A.g(this.n);
        }
        kw kwVar5 = this.t;
        if (kwVar5 != null) {
            i5 i5Var = kwVar5.A;
            i5Var.getClass();
            ow owVar = this.o;
            i30.m(owVar, "listener");
            i5Var.o.add(owVar);
        }
        kw kwVar6 = this.t;
        if (kwVar6 != null) {
            i5 i5Var2 = kwVar6.A;
            i5Var2.getClass();
            ow owVar2 = this.p;
            i30.m(owVar2, "listener");
            i5Var2.q.add(owVar2);
        }
        kw kwVar7 = this.t;
        if (kwVar7 != null) {
            i5 i5Var3 = kwVar7.A;
            i5Var3.getClass();
            ow owVar3 = this.q;
            i30.m(owVar3, "listener");
            i5Var3.r.add(owVar3);
        }
        kw kwVar8 = this.t;
        if (kwVar8 == null || iwVar != 0) {
            return;
        }
        i5 i5Var4 = kwVar8.A;
        i5Var4.getClass();
        rw rwVar = this.r;
        i30.m(rwVar, "provider");
        xb4 xb4Var = i5Var4.h;
        ((CopyOnWriteArrayList) xb4Var.h).add(rwVar);
        ((Runnable) xb4Var.g).run();
    }

    public final void c(iw iwVar) {
        if (F(2)) {
            Objects.toString(iwVar);
        }
        if (iwVar.E) {
            iwVar.E = false;
            if (iwVar.p) {
                return;
            }
            this.c.f(iwVar);
            if (F(2)) {
                iwVar.toString();
            }
            if (G(iwVar)) {
                this.D = true;
            }
        }
    }

    public final void d() {
        this.b = false;
        this.J.clear();
        this.I.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        ArrayList arrayListL = this.c.l();
        int size = arrayListL.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListL.get(i);
            i++;
            ViewGroup viewGroup = ((ex) obj).c.I;
            if (viewGroup != null) {
                hashSet.add(tn.f(viewGroup, E()));
            }
        }
        return hashSet;
    }

    public final ex f(iw iwVar) {
        String str = iwVar.j;
        p21 p21Var = this.c;
        ex exVar = (ex) ((HashMap) p21Var.g).get(str);
        if (exVar != null) {
            return exVar;
        }
        ex exVar2 = new ex(this.l, p21Var, iwVar);
        exVar2.m(this.t.x.getClassLoader());
        exVar2.e = this.s;
        return exVar2;
    }

    public final void g(iw iwVar) {
        if (F(2)) {
            Objects.toString(iwVar);
        }
        if (iwVar.E) {
            return;
        }
        iwVar.E = true;
        if (iwVar.p) {
            if (F(2)) {
                iwVar.toString();
            }
            p21 p21Var = this.c;
            synchronized (((ArrayList) p21Var.f)) {
                ((ArrayList) p21Var.f).remove(iwVar);
            }
            iwVar.p = false;
            if (G(iwVar)) {
                this.D = true;
            }
            X(iwVar);
        }
    }

    public final void h(boolean z) {
        if (z && this.t != null) {
            Z(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (iw iwVar : this.c.n()) {
            if (iwVar != null) {
                iwVar.H = true;
                if (z) {
                    iwVar.y.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.s >= 1) {
            for (iw iwVar : this.c.n()) {
                if (iwVar != null) {
                    if (!iwVar.D ? iwVar.y.i() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (iw iwVar : this.c.n()) {
            if (iwVar != null && I(iwVar)) {
                if (!iwVar.D ? iwVar.y.j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(iwVar);
                    z = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                iw iwVar2 = (iw) this.e.get(i);
                if (arrayList == null || !arrayList.contains(iwVar2)) {
                    iwVar2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void k() {
        boolean zIsChangingConfigurations = true;
        this.G = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((tn) it.next()).e();
        }
        kw kwVar = this.t;
        p21 p21Var = this.c;
        if (kwVar != null) {
            zIsChangingConfigurations = ((ax) p21Var.i).f;
        } else {
            i5 i5Var = kwVar.x;
            if (i5Var != null) {
                zIsChangingConfigurations = true ^ i5Var.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.j.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((i9) it2.next()).f;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ax axVar = (ax) p21Var.i;
                    axVar.getClass();
                    F(3);
                    axVar.c((String) obj);
                }
            }
        }
        t(-1);
        kw kwVar2 = this.t;
        if (kwVar2 != null) {
            i5 i5Var2 = kwVar2.A;
            i5Var2.getClass();
            ow owVar = this.o;
            i30.m(owVar, "listener");
            i5Var2.o.remove(owVar);
        }
        kw kwVar3 = this.t;
        if (kwVar3 != null) {
            i5 i5Var3 = kwVar3.A;
            i5Var3.getClass();
            ow owVar2 = this.n;
            i30.m(owVar2, "listener");
            i5Var3.n.remove(owVar2);
        }
        kw kwVar4 = this.t;
        if (kwVar4 != null) {
            i5 i5Var4 = kwVar4.A;
            i5Var4.getClass();
            ow owVar3 = this.p;
            i30.m(owVar3, "listener");
            i5Var4.q.remove(owVar3);
        }
        kw kwVar5 = this.t;
        if (kwVar5 != null) {
            i5 i5Var5 = kwVar5.A;
            i5Var5.getClass();
            ow owVar4 = this.q;
            i30.m(owVar4, "listener");
            i5Var5.r.remove(owVar4);
        }
        kw kwVar6 = this.t;
        if (kwVar6 != null) {
            i5 i5Var6 = kwVar6.A;
            i5Var6.getClass();
            rw rwVar = this.r;
            i30.m(rwVar, "provider");
            xb4 xb4Var = i5Var6.h;
            ((CopyOnWriteArrayList) xb4Var.h).remove(rwVar);
            if (((HashMap) xb4Var.i).remove(rwVar) != null) {
                throw new ClassCastException();
            }
            ((Runnable) xb4Var.g).run();
        }
        this.t = null;
        this.u = null;
        this.v = null;
        if (this.g != null) {
            Iterator it3 = this.h.b.iterator();
            while (it3.hasNext()) {
                ((id) it3.next()).cancel();
            }
            this.g = null;
        }
        vq2 vq2Var = this.z;
        if (vq2Var != null) {
            vq2Var.t();
            this.A.t();
            this.B.t();
        }
    }

    public final void l(boolean z) {
        if (z && this.t != null) {
            Z(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (iw iwVar : this.c.n()) {
            if (iwVar != null) {
                iwVar.H = true;
                if (z) {
                    iwVar.y.l(true);
                }
            }
        }
    }

    public final void m(boolean z) {
        if (z && this.t != null) {
            Z(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (iw iwVar : this.c.n()) {
            if (iwVar != null && z) {
                iwVar.y.m(true);
            }
        }
    }

    public final void n() {
        ArrayList arrayListM = this.c.m();
        int size = arrayListM.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM.get(i);
            i++;
            iw iwVar = (iw) obj;
            if (iwVar != null) {
                iwVar.p();
                iwVar.y.n();
            }
        }
    }

    public final boolean o() {
        if (this.s >= 1) {
            for (iw iwVar : this.c.n()) {
                if (iwVar != null) {
                    if (!iwVar.D ? iwVar.y.o() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.s < 1) {
            return;
        }
        for (iw iwVar : this.c.n()) {
            if (iwVar != null && !iwVar.D) {
                iwVar.y.p();
            }
        }
    }

    public final void q(iw iwVar) {
        if (iwVar != null) {
            if (iwVar.equals(this.c.i(iwVar.j))) {
                iwVar.w.getClass();
                boolean zJ = J(iwVar);
                Boolean bool = iwVar.o;
                if (bool == null || bool.booleanValue() != zJ) {
                    iwVar.o = Boolean.valueOf(zJ);
                    xw xwVar = iwVar.y;
                    xwVar.a0();
                    xwVar.q(xwVar.w);
                }
            }
        }
    }

    public final void r(boolean z) {
        if (z && this.t != null) {
            Z(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (iw iwVar : this.c.n()) {
            if (iwVar != null && z) {
                iwVar.y.r(true);
            }
        }
    }

    public final boolean s() {
        if (this.s < 1) {
            return false;
        }
        boolean z = false;
        for (iw iwVar : this.c.n()) {
            if (iwVar != null && I(iwVar)) {
                if (!iwVar.D ? iwVar.y.s() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void t(int i) {
        try {
            this.b = true;
            for (ex exVar : ((HashMap) this.c.g).values()) {
                if (exVar != null) {
                    exVar.e = i;
                }
            }
            K(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((tn) it.next()).e();
            }
            this.b = false;
            y(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        iw iwVar = this.v;
        if (iwVar != null) {
            sb.append(iwVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.v)));
            sb.append("}");
        } else {
            kw kwVar = this.t;
            if (kwVar != null) {
                sb.append(kwVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        if (this.H) {
            this.H = false;
            Y();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strG = ex0.g(str, "    ");
        p21 p21Var = this.c;
        ArrayList arrayList = (ArrayList) p21Var.f;
        String strG2 = ex0.g(str, "    ");
        HashMap map = (HashMap) p21Var.g;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (ex exVar : map.values()) {
                printWriter.print(str);
                if (exVar != null) {
                    iw iwVar = exVar.c;
                    printWriter.println(iwVar);
                    iwVar.getClass();
                    printWriter.print(strG2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(iwVar.A));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(iwVar.B));
                    printWriter.print(" mTag=");
                    printWriter.println(iwVar.C);
                    printWriter.print(strG2);
                    printWriter.print("mState=");
                    printWriter.print(iwVar.f);
                    printWriter.print(" mWho=");
                    printWriter.print(iwVar.j);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(iwVar.v);
                    printWriter.print(strG2);
                    printWriter.print("mAdded=");
                    printWriter.print(iwVar.p);
                    printWriter.print(" mRemoving=");
                    printWriter.print(iwVar.q);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(iwVar.r);
                    printWriter.print(" mInLayout=");
                    printWriter.println(iwVar.s);
                    printWriter.print(strG2);
                    printWriter.print("mHidden=");
                    printWriter.print(iwVar.D);
                    printWriter.print(" mDetached=");
                    printWriter.print(iwVar.E);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(iwVar.G);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(strG2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(iwVar.F);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(iwVar.L);
                    if (iwVar.w != null) {
                        printWriter.print(strG2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(iwVar.w);
                    }
                    if (iwVar.x != null) {
                        printWriter.print(strG2);
                        printWriter.print("mHost=");
                        printWriter.println(iwVar.x);
                    }
                    if (iwVar.z != null) {
                        printWriter.print(strG2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(iwVar.z);
                    }
                    if (iwVar.k != null) {
                        printWriter.print(strG2);
                        printWriter.print("mArguments=");
                        printWriter.println(iwVar.k);
                    }
                    if (iwVar.g != null) {
                        printWriter.print(strG2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(iwVar.g);
                    }
                    if (iwVar.h != null) {
                        printWriter.print(strG2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(iwVar.h);
                    }
                    if (iwVar.i != null) {
                        printWriter.print(strG2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(iwVar.i);
                    }
                    Object objM = iwVar.m(false);
                    if (objM != null) {
                        printWriter.print(strG2);
                        printWriter.print("mTarget=");
                        printWriter.print(objM);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(iwVar.n);
                    }
                    printWriter.print(strG2);
                    printWriter.print("mPopDirection=");
                    hw hwVar = iwVar.M;
                    printWriter.println(hwVar == null ? false : hwVar.a);
                    hw hwVar2 = iwVar.M;
                    if ((hwVar2 == null ? 0 : hwVar2.b) != 0) {
                        printWriter.print(strG2);
                        printWriter.print("getEnterAnim=");
                        hw hwVar3 = iwVar.M;
                        printWriter.println(hwVar3 == null ? 0 : hwVar3.b);
                    }
                    hw hwVar4 = iwVar.M;
                    if ((hwVar4 == null ? 0 : hwVar4.c) != 0) {
                        printWriter.print(strG2);
                        printWriter.print("getExitAnim=");
                        hw hwVar5 = iwVar.M;
                        printWriter.println(hwVar5 == null ? 0 : hwVar5.c);
                    }
                    hw hwVar6 = iwVar.M;
                    if ((hwVar6 == null ? 0 : hwVar6.d) != 0) {
                        printWriter.print(strG2);
                        printWriter.print("getPopEnterAnim=");
                        hw hwVar7 = iwVar.M;
                        printWriter.println(hwVar7 == null ? 0 : hwVar7.d);
                    }
                    hw hwVar8 = iwVar.M;
                    if ((hwVar8 == null ? 0 : hwVar8.e) != 0) {
                        printWriter.print(strG2);
                        printWriter.print("getPopExitAnim=");
                        hw hwVar9 = iwVar.M;
                        printWriter.println(hwVar9 == null ? 0 : hwVar9.e);
                    }
                    if (iwVar.I != null) {
                        printWriter.print(strG2);
                        printWriter.print("mContainer=");
                        printWriter.println(iwVar.I);
                    }
                    if (iwVar.J != null) {
                        printWriter.print(strG2);
                        printWriter.print("mView=");
                        printWriter.println(iwVar.J);
                    }
                    if (iwVar.i() != null) {
                        jx0 jx0Var = ((v70) new ug0(iwVar.d(), v70.c).t(v70.class)).b;
                        if (jx0Var.h > 0) {
                            printWriter.print(strG2);
                            printWriter.println("Loaders:");
                            if (jx0Var.h > 0) {
                                if (jx0Var.g[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(strG2);
                                printWriter.print("  #");
                                printWriter.print(jx0Var.f[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(strG2);
                    printWriter.println("Child " + iwVar.y + ":");
                    iwVar.y.v(ex0.g(strG2, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                iw iwVar2 = (iw) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(iwVar2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                iw iwVar3 = (iw) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(iwVar3.toString());
            }
        }
        ArrayList arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                g9 g9Var = (g9) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(g9Var.toString());
                g9Var.f(strG, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (vw) this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.u);
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public final void w(vw vwVar, boolean z) {
        if (!z) {
            if (this.t == null) {
                if (!this.G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.E || this.F) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.a) {
            try {
                if (this.t == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(vwVar);
                    T();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.t == null) {
            if (!this.G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.t.y.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && (this.E || this.F)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.I == null) {
            this.I = new ArrayList();
            this.J = new ArrayList();
        }
    }

    public final boolean y(boolean z) {
        boolean zA;
        x(z);
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.I;
            ArrayList arrayList2 = this.J;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.a.size();
                        zA = false;
                        for (int i = 0; i < size; i++) {
                            zA |= ((vw) this.a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zA) {
                a0();
                u();
                ((HashMap) this.c.g).values().removeAll(Collections.singleton(null));
                return z2;
            }
            z2 = true;
            this.b = true;
            try {
                Q(this.I, this.J);
            } finally {
                d();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0234 A[PHI: r14
  0x0234: PHI (r14v24 int) = (r14v23 int), (r14v25 int) binds: [B:103:0x0224, B:108:0x0230] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(java.util.ArrayList r25, java.util.ArrayList r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xw.z(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }
}
