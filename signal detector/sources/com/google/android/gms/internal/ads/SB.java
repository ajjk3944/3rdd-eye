package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class SB extends RB {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11151d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object f11152e;

    public SB(TB tb) {
        this.f11152e = tb;
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final AbstractC1896tC a() {
        switch (this.f11151d) {
            case 0:
                return new NB((TB) this.f11152e);
            default:
                return new XB(this.f11152e);
        }
    }

    @Override // com.google.android.gms.internal.ads.HB, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f11151d) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    TB tb = (TB) this.f11152e;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    Collection collection = (Collection) ((C1465lC) tb.d()).get(key);
                    if (collection != null && collection.contains(value)) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f11152e.equals(obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.RB, com.google.android.gms.internal.ads.HB
    public LB e() {
        switch (this.f11151d) {
            case 1:
                return LB.i(this.f11152e);
            default:
                return super.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final boolean f() {
        switch (this.f11151d) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.HB
    public int g(Object[] objArr, int i) {
        switch (this.f11151d) {
            case 1:
                objArr[i] = this.f11152e;
                return i + 1;
            default:
                return super.g(objArr, i);
        }
    }

    @Override // com.google.android.gms.internal.ads.RB, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.f11151d) {
            case 1:
                return this.f11152e.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        switch (this.f11151d) {
            case 0:
                return new NB((TB) this.f11152e);
            default:
                return new XB(this.f11152e);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f11151d) {
            case 0:
                return ((TB) this.f11152e).f11357e;
            default:
                return 1;
        }
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        switch (this.f11151d) {
            case 1:
                String string = this.f11152e.toString();
                return AbstractC1135f5.n(new StringBuilder(String.valueOf(string).length() + 2), "[", string, "]");
            default:
                return super.toString();
        }
    }

    public SB(Object obj) {
        obj.getClass();
        this.f11152e = obj;
    }
}
