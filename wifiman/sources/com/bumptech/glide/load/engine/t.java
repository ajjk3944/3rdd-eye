package com.bumptech.glide.load.engine;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
final class t implements C2.e {

    /* renamed from: j, reason: collision with root package name */
    private static final W2.h f34487j = new W2.h(50);

    /* renamed from: b, reason: collision with root package name */
    private final F2.b f34488b;

    /* renamed from: c, reason: collision with root package name */
    private final C2.e f34489c;

    /* renamed from: d, reason: collision with root package name */
    private final C2.e f34490d;

    /* renamed from: e, reason: collision with root package name */
    private final int f34491e;

    /* renamed from: f, reason: collision with root package name */
    private final int f34492f;

    /* renamed from: g, reason: collision with root package name */
    private final Class f34493g;

    /* renamed from: h, reason: collision with root package name */
    private final C2.g f34494h;

    /* renamed from: i, reason: collision with root package name */
    private final C2.k f34495i;

    t(F2.b bVar, C2.e eVar, C2.e eVar2, int i10, int i11, C2.k kVar, Class cls, C2.g gVar) {
        this.f34488b = bVar;
        this.f34489c = eVar;
        this.f34490d = eVar2;
        this.f34491e = i10;
        this.f34492f = i11;
        this.f34495i = kVar;
        this.f34493g = cls;
        this.f34494h = gVar;
    }

    private byte[] c() {
        W2.h hVar = f34487j;
        byte[] bArr = (byte[]) hVar.g(this.f34493g);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f34493g.getName().getBytes(C2.e.f2192a);
        hVar.k(this.f34493g, bytes);
        return bytes;
    }

    @Override // C2.e
    public void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f34488b.c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f34491e).putInt(this.f34492f).array();
        this.f34490d.a(messageDigest);
        this.f34489c.a(messageDigest);
        messageDigest.update(bArr);
        C2.k kVar = this.f34495i;
        if (kVar != null) {
            kVar.a(messageDigest);
        }
        this.f34494h.a(messageDigest);
        messageDigest.update(c());
        this.f34488b.d(bArr);
    }

    @Override // C2.e
    public boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f34492f == tVar.f34492f && this.f34491e == tVar.f34491e && W2.l.d(this.f34495i, tVar.f34495i) && this.f34493g.equals(tVar.f34493g) && this.f34489c.equals(tVar.f34489c) && this.f34490d.equals(tVar.f34490d) && this.f34494h.equals(tVar.f34494h);
    }

    @Override // C2.e
    public int hashCode() {
        int iHashCode = (((((this.f34489c.hashCode() * 31) + this.f34490d.hashCode()) * 31) + this.f34491e) * 31) + this.f34492f;
        C2.k kVar = this.f34495i;
        if (kVar != null) {
            iHashCode = (iHashCode * 31) + kVar.hashCode();
        }
        return (((iHashCode * 31) + this.f34493g.hashCode()) * 31) + this.f34494h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f34489c + ", signature=" + this.f34490d + ", width=" + this.f34491e + ", height=" + this.f34492f + ", decodedResourceClass=" + this.f34493g + ", transformation='" + this.f34495i + "', options=" + this.f34494h + '}';
    }
}
