package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k41 extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13026a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m41 f13027b;

    public /* synthetic */ k41(m41 m41Var, int i4) {
        this.f13026a = i4;
        this.f13027b = m41Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f13026a) {
            case 0:
                this.f13027b.clear();
                break;
            default:
                this.f13027b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f13026a) {
            case 0:
                m41 m41Var = this.f13027b;
                Map mapE = m41Var.e();
                if (mapE != null) {
                    return mapE.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int i4 = m41Var.i(entry.getKey());
                    if (i4 != -1 && Objects.equals(m41Var.c()[i4], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f13027b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f13026a) {
            case 0:
                m41 m41Var = this.f13027b;
                Map mapE = m41Var.e();
                return mapE != null ? mapE.entrySet().iterator() : new j41(m41Var, 1);
            default:
                m41 m41Var2 = this.f13027b;
                Map mapE2 = m41Var2.e();
                return mapE2 != null ? mapE2.keySet().iterator() : new j41(m41Var2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f13026a) {
            case 0:
                m41 m41Var = this.f13027b;
                Map mapE = m41Var.e();
                if (mapE != null) {
                    return mapE.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!m41Var.d()) {
                        int iG = m41Var.g();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = m41Var.f13754a;
                        Objects.requireNonNull(obj2);
                        int iS = mq0.S(key, value, iG, obj2, m41Var.a(), m41Var.b(), m41Var.c());
                        if (iS != -1) {
                            m41Var.f(iS, iG);
                            m41Var.f13759f--;
                            m41Var.f13758e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                m41 m41Var2 = this.f13027b;
                Map mapE2 = m41Var2.e();
                return mapE2 != null ? mapE2.keySet().remove(obj) : m41Var2.j(obj) != m41.j;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f13026a) {
        }
        return this.f13027b.size();
    }
}
