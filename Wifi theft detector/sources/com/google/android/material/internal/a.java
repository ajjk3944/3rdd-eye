package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final Map f10625a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Set f10626b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public b f10627c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10628d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10629e;

    /* renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    public class C0209a implements l.a {
        public C0209a() {
        }

        @Override // com.google.android.material.internal.l.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(l lVar, boolean z10) {
            if (!z10) {
                a aVar = a.this;
                if (!aVar.r(lVar, aVar.f10629e)) {
                    return;
                }
            } else if (!a.this.g(lVar)) {
                return;
            }
            a.this.m();
        }
    }

    public interface b {
        void a(Set set);
    }

    public void e(l lVar) {
        this.f10625a.put(Integer.valueOf(lVar.getId()), lVar);
        if (lVar.isChecked()) {
            g(lVar);
        }
        lVar.setInternalOnCheckedChangeListener(new C0209a());
    }

    public void f(int i10) {
        l lVar = (l) this.f10625a.get(Integer.valueOf(i10));
        if (lVar != null && g(lVar)) {
            m();
        }
    }

    public final boolean g(l lVar) {
        int id = lVar.getId();
        if (this.f10626b.contains(Integer.valueOf(id))) {
            return false;
        }
        l lVar2 = (l) this.f10625a.get(Integer.valueOf(k()));
        if (lVar2 != null) {
            r(lVar2, false);
        }
        boolean zAdd = this.f10626b.add(Integer.valueOf(id));
        if (!lVar.isChecked()) {
            lVar.setChecked(true);
        }
        return zAdd;
    }

    public void h() {
        boolean zIsEmpty = this.f10626b.isEmpty();
        Iterator it = this.f10625a.values().iterator();
        while (it.hasNext()) {
            r((l) it.next(), false);
        }
        if (zIsEmpty) {
            return;
        }
        m();
    }

    public Set i() {
        return new HashSet(this.f10626b);
    }

    public List j(ViewGroup viewGroup) {
        Set setI = i();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof l) && setI.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int k() {
        if (!this.f10628d || this.f10626b.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f10626b.iterator().next()).intValue();
    }

    public boolean l() {
        return this.f10628d;
    }

    public final void m() {
        b bVar = this.f10627c;
        if (bVar != null) {
            bVar.a(i());
        }
    }

    public void n(l lVar) {
        lVar.setInternalOnCheckedChangeListener(null);
        this.f10625a.remove(Integer.valueOf(lVar.getId()));
        this.f10626b.remove(Integer.valueOf(lVar.getId()));
    }

    public void o(b bVar) {
        this.f10627c = bVar;
    }

    public void p(boolean z10) {
        this.f10629e = z10;
    }

    public void q(boolean z10) {
        if (this.f10628d != z10) {
            this.f10628d = z10;
            h();
        }
    }

    public final boolean r(l lVar, boolean z10) {
        int id = lVar.getId();
        if (!this.f10626b.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z10 && this.f10626b.size() == 1 && this.f10626b.contains(Integer.valueOf(id))) {
            lVar.setChecked(true);
            return false;
        }
        boolean zRemove = this.f10626b.remove(Integer.valueOf(id));
        if (lVar.isChecked()) {
            lVar.setChecked(false);
        }
        return zRemove;
    }
}
