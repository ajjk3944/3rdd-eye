package com.google.gson.internal;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20846a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f20847b;

    public /* synthetic */ k(m mVar, int i4) {
        this.f20846a = i4;
        this.f20847b = mVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f20846a) {
            case 0:
                this.f20847b.clear();
                break;
            default:
                this.f20847b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        l lVarA;
        switch (this.f20846a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                m mVar = this.f20847b;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                l lVar = null;
                if (key != null) {
                    try {
                        lVarA = mVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                } else {
                    lVarA = null;
                }
                if (lVarA != null && Objects.equals(lVarA.f20854h, entry.getValue())) {
                    lVar = lVarA;
                }
                return lVar != null;
            default:
                return this.f20847b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f20846a) {
            case 0:
                return new j(this.f20847b, 0);
            default:
                return new j(this.f20847b, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        l lVarA;
        switch (this.f20846a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    m mVar = this.f20847b;
                    l lVar = null;
                    if (key != null) {
                        try {
                            lVarA = mVar.a(key, false);
                        } catch (ClassCastException unused) {
                        }
                    } else {
                        lVarA = null;
                    }
                    if (lVarA != null && Objects.equals(lVarA.f20854h, entry.getValue())) {
                        lVar = lVarA;
                    }
                    if (lVar != null) {
                        mVar.c(lVar, true);
                        break;
                    }
                }
                break;
            default:
                m mVar2 = this.f20847b;
                l lVarA2 = null;
                if (obj != null) {
                    try {
                        lVarA2 = mVar2.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (lVarA2 != null) {
                    mVar2.c(lVarA2, true);
                }
                if (lVarA2 != null) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f20846a) {
        }
        return this.f20847b.f20860d;
    }
}
