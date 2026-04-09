package li;

import aa.j;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f28820a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f28821b;

    /* renamed from: c, reason: collision with root package name */
    public int f28822c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f28823d = 0;

    /* renamed from: e, reason: collision with root package name */
    public j f28824e = null;

    public static b a(int i4, String str, String str2) {
        b bVar = new b();
        bVar.f28820a = str;
        bVar.f28821b = str2;
        bVar.f28822c = i4;
        return bVar;
    }

    public static b b(String str, CharSequence charSequence, boolean z3) {
        b bVar = new b();
        bVar.f28820a = str;
        bVar.f28821b = charSequence;
        bVar.f28823d = z3 ? 1 : 0;
        return bVar;
    }
}
