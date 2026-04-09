package de;

import com.google.android.gms.internal.ads.sh0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f22189a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f22190b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f22191c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22192d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22193e;

    /* renamed from: f, reason: collision with root package name */
    public final d f22194f;
    public final Set g;

    public a(String str, Set set, Set set2, int i4, int i10, d dVar, Set set3) {
        this.f22189a = str;
        this.f22190b = DesugarCollections.unmodifiableSet(set);
        this.f22191c = DesugarCollections.unmodifiableSet(set2);
        this.f22192d = i4;
        this.f22193e = i10;
        this.f22194f = dVar;
        this.g = DesugarCollections.unmodifiableSet(set3);
    }

    public static sh0 a(q qVar) {
        return new sh0(qVar, new q[0]);
    }

    public static sh0 b(Class cls) {
        return new sh0(cls, new Class[0]);
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            wb.e.f(cls2, "Null interface");
            hashSet.add(q.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new ca.b(6, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f22190b.toArray()) + ">{" + this.f22192d + ", type=" + this.f22193e + ", deps=" + Arrays.toString(this.f22191c.toArray()) + "}";
    }
}
