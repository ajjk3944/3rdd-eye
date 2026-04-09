package h9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class l1 extends n1 implements m1, k1 {

    /* renamed from: i, reason: collision with root package name */
    public List f10401i = new ArrayList();
    public HashSet j = null;
    public String k = null;

    /* renamed from: l, reason: collision with root package name */
    public HashSet f10402l = null;

    /* renamed from: m, reason: collision with root package name */
    public HashSet f10403m = null;

    @Override // h9.k1
    public final Set a() {
        return null;
    }

    @Override // h9.k1
    public final String b() {
        return this.k;
    }

    @Override // h9.k1
    public final void d(HashSet hashSet) {
        this.j = hashSet;
    }

    @Override // h9.k1
    public final Set e() {
        return this.j;
    }

    @Override // h9.m1
    public final List f() {
        return this.f10401i;
    }

    @Override // h9.k1
    public final void g(HashSet hashSet) {
        this.f10403m = hashSet;
    }

    @Override // h9.k1
    public final void h(String str) {
        this.k = str;
    }

    @Override // h9.k1
    public final void i(HashSet hashSet) {
        this.f10402l = hashSet;
    }

    @Override // h9.k1
    public final Set l() {
        return this.f10402l;
    }

    public void m(q1 q1Var) {
        this.f10401i.add(q1Var);
    }

    @Override // h9.k1
    public final Set n() {
        return this.f10403m;
    }

    @Override // h9.k1
    public final void j(HashSet hashSet) {
    }
}
