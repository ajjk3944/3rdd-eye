package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.xN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2123xN implements InterfaceC1853sN {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f17584c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final List f17585a;

    /* renamed from: b, reason: collision with root package name */
    public final List f17586b;

    static {
        C1907tN.a(Collections.EMPTY_SET);
    }

    public /* synthetic */ C2123xN(List list, List list2) {
        this.f17585a = list;
        this.f17586b = list2;
    }

    public static Vu a(int i, int i3) {
        return new Vu(i, i3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set c() {
        List list = this.f17585a;
        int size = list.size();
        List list2 = this.f17586b;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((InterfaceC2069wN) list2.get(i)).c();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object objC = ((InterfaceC2069wN) list.get(i3)).c();
            objC.getClass();
            hashSet.add(objC);
        }
        int size4 = arrayList.size();
        for (int i6 = 0; i6 < size4; i6++) {
            for (Object obj : (Collection) arrayList.get(i6)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
