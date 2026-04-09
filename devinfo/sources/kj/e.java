package kj;

import com.google.android.gms.internal.ads.pl1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements aj.a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f28353a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f28354b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f28355c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f28356d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f28357e = 1048576;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28358f = false;
    public boolean g = false;

    /* renamed from: h, reason: collision with root package name */
    public long f28359h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f28360i = 0;
    public final pl1 j = new pl1(1, this);

    @Override // aj.a
    public final void a(long j, boolean z3, aj.b bVar) {
        this.f28359h += j;
        this.f28360i--;
        if (z3) {
            bVar.e(this);
        }
    }

    public final void b(Object obj, aj.b bVar, HashMap map) {
        if (this.g) {
            return;
        }
        List arrayList = (List) map.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.add(bVar);
        map.put(obj, arrayList);
    }
}
