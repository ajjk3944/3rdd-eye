package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.RegularImmutableMap;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
final class RegularImmutableBiMap<K, V> extends ImmutableBiMap<K, V> {

    /* renamed from: j, reason: collision with root package name */
    public static final RegularImmutableBiMap f11930j = new RegularImmutableBiMap();

    /* renamed from: e, reason: collision with root package name */
    public final transient Object f11931e;

    /* renamed from: f, reason: collision with root package name */
    public final transient Object[] f11932f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f11933g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f11934h;

    /* renamed from: i, reason: collision with root package name */
    public final transient RegularImmutableBiMap f11935i;

    private RegularImmutableBiMap() {
        this.f11931e = null;
        this.f11932f = new Object[0];
        this.f11933g = 0;
        this.f11934h = 0;
        this.f11935i = this;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public Object get(Object obj) {
        Object objT = RegularImmutableMap.t(this.f11931e, this.f11932f, this.f11934h, this.f11933g, obj);
        if (objT == null) {
            return null;
        }
        return objT;
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet h() {
        return new RegularImmutableMap.EntrySet(this, this.f11932f, this.f11933g, this.f11934h);
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet i() {
        return new RegularImmutableMap.KeySet(this, new RegularImmutableMap.KeysOrValuesAsList(this.f11932f, this.f11933g, this.f11934h));
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean m() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.i
    /* renamed from: r */
    public ImmutableBiMap g() {
        return this.f11935i;
    }

    @Override // java.util.Map
    public int size() {
        return this.f11934h;
    }

    public RegularImmutableBiMap(Object[] objArr, int i10) {
        this.f11932f = objArr;
        this.f11934h = i10;
        this.f11933g = 0;
        int iX = i10 >= 2 ? ImmutableSet.x(i10) : 0;
        this.f11931e = RegularImmutableMap.s(objArr, i10, iX, 0);
        this.f11935i = new RegularImmutableBiMap(RegularImmutableMap.s(objArr, i10, iX, 1), objArr, i10, this);
    }

    public RegularImmutableBiMap(Object obj, Object[] objArr, int i10, RegularImmutableBiMap regularImmutableBiMap) {
        this.f11931e = obj;
        this.f11932f = objArr;
        this.f11933g = 1;
        this.f11934h = i10;
        this.f11935i = regularImmutableBiMap;
    }
}
