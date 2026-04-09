package s5;

import r5.k;

/* compiled from: FirebaseRemoteConfigValueImpl.java */
/* renamed from: s5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5579e implements k {

    /* renamed from: a, reason: collision with root package name */
    public final String f46083a;

    /* renamed from: b, reason: collision with root package name */
    public final int f46084b;

    public C5579e(String str, int i) {
        this.f46083a = str;
        this.f46084b = i;
    }

    @Override // r5.k
    public final int a() {
        return this.f46084b;
    }

    @Override // r5.k
    public final String b() {
        return this.f46084b == 0 ? "" : this.f46083a;
    }
}
