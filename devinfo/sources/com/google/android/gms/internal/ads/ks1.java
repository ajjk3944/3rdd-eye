package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ks1 implements fs1 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f13231c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final List f13232a;

    /* renamed from: b, reason: collision with root package name */
    public final List f13233b;

    static {
        gs1.b(Collections.EMPTY_SET);
    }

    public /* synthetic */ ks1(List list, List list2) {
        this.f13232a = list;
        this.f13233b = list2;
    }

    public static l90 b(int i4, int i10) {
        return new l90(i4, i10);
    }

    @Override // com.google.android.gms.internal.ads.js1
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Set a() {
        List list = this.f13232a;
        int size = list.size();
        List list2 = this.f13233b;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Collection collection = (Collection) ((js1) list2.get(i4)).a();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = list.size();
        for (int i10 = 0; i10 < size3; i10++) {
            Object objA = ((js1) list.get(i10)).a();
            objA.getClass();
            hashSet.add(objA);
        }
        int size4 = arrayList.size();
        for (int i11 = 0; i11 < size4; i11++) {
            for (Object obj : (Collection) arrayList.get(i11)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return DesugarCollections.unmodifiableSet(hashSet);
    }
}
