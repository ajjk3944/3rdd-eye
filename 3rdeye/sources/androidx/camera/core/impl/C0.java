package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l2.AbstractC5268a;
import l2.C5277j;
import l2.C5278k;
import o2.InterfaceC5418i;
import v2.C5673a;

/* compiled from: Quirks.java */
/* loaded from: classes.dex */
public final class C0 implements InterfaceC5418i {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14871a;

    public C0() {
        this.f14871a = new ArrayList();
    }

    public static String g(C0 c02) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c02.f14871a.iterator();
        while (it.hasNext()) {
            arrayList.add(((y0) it.next()).getClass().getSimpleName());
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            while (true) {
                sb.append((CharSequence) it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                sb.append((CharSequence) " | ");
            }
        }
        return sb.toString();
    }

    @Override // o2.InterfaceC5418i
    public AbstractC5268a a() {
        ArrayList arrayList = this.f14871a;
        return ((C5673a) arrayList.get(0)).c() ? new C5278k(arrayList) : new C5277j(arrayList);
    }

    @Override // o2.InterfaceC5418i
    public List b() {
        return this.f14871a;
    }

    @Override // o2.InterfaceC5418i
    public boolean c() {
        ArrayList arrayList = this.f14871a;
        return arrayList.size() == 1 && ((C5673a) arrayList.get(0)).c();
    }

    public boolean d(Class cls) {
        Iterator it = this.f14871a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((y0) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public y0 e(Class cls) {
        Iterator it = this.f14871a.iterator();
        while (it.hasNext()) {
            y0 y0Var = (y0) it.next();
            if (y0Var.getClass() == cls) {
                return y0Var;
            }
        }
        return null;
    }

    public ArrayList f(Class cls) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f14871a.iterator();
        while (it.hasNext()) {
            y0 y0Var = (y0) it.next();
            if (cls.isAssignableFrom(y0Var.getClass())) {
                arrayList.add(y0Var);
            }
        }
        return arrayList;
    }

    public C0(ArrayList arrayList) {
        this.f14871a = arrayList;
    }

    public C0(List list) {
        this.f14871a = new ArrayList(list);
    }
}
