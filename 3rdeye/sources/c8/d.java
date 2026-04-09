package c8;

import I9.g;
import java.util.HashMap;
import java.util.UUID;

/* compiled from: Session.java */
/* loaded from: classes3.dex */
public final class d extends g {

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f18558b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f18559c = UUID.randomUUID().toString();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18560d;

    public d(boolean z10) {
        this.f18560d = z10;
    }

    @Override // I9.g
    public final C2074a R(C2074a c2074a) {
        return S(c2074a.f18549a, c2074a.f18550b);
    }

    @Override // I9.g
    public final C2074a S(String str, String str2) {
        return (C2074a) this.f18558b.get(C2074a.a(str, str2));
    }

    @Override // I9.g
    public final void a0(C2074a c2074a) {
        this.f18558b.put(C2074a.a(c2074a.f18549a, c2074a.f18550b), c2074a);
    }
}
