package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.tK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1904tK extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16898a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2120xK f16899b;

    public /* synthetic */ C1904tK(C2120xK c2120xK, int i) {
        this.f16898a = i;
        this.f16899b = c2120xK;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f16898a) {
            case 0:
                this.f16899b.clear();
                break;
            default:
                this.f16899b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        C2066wK c2066wKA;
        switch (this.f16898a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C2120xK c2120xK = this.f16899b;
                c2120xK.getClass();
                Object key = entry.getKey();
                C2066wK c2066wK = null;
                if (key != null) {
                    try {
                        c2066wKA = c2120xK.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                } else {
                    c2066wKA = null;
                }
                if (c2066wKA != null && Objects.equals(c2066wKA.f17429g, entry.getValue())) {
                    c2066wK = c2066wKA;
                }
                return c2066wK != null;
            default:
                return this.f16899b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f16898a) {
            case 0:
                return new C1850sK(this.f16899b, 0);
            default:
                return new C1850sK(this.f16899b, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C2066wK c2066wKA;
        switch (this.f16898a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    C2120xK c2120xK = this.f16899b;
                    c2120xK.getClass();
                    Object key = entry.getKey();
                    C2066wK c2066wK = null;
                    if (key != null) {
                        try {
                            c2066wKA = c2120xK.a(key, false);
                        } catch (ClassCastException unused) {
                        }
                    } else {
                        c2066wKA = null;
                    }
                    if (c2066wKA != null && Objects.equals(c2066wKA.f17429g, entry.getValue())) {
                        c2066wK = c2066wKA;
                    }
                    if (c2066wK != null) {
                        c2120xK.b(c2066wK, true);
                        break;
                    }
                }
                break;
            default:
                C2120xK c2120xK2 = this.f16899b;
                c2120xK2.getClass();
                C2066wK c2066wKA2 = null;
                if (obj != null) {
                    try {
                        c2066wKA2 = c2120xK2.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (c2066wKA2 != null) {
                    c2120xK2.b(c2066wKA2, true);
                }
                if (c2066wKA2 != null) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f16898a) {
        }
        return this.f16899b.f17579c;
    }
}
