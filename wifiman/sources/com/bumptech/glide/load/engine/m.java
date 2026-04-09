package com.bumptech.glide.load.engine;

import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
class m implements C2.e {

    /* renamed from: b, reason: collision with root package name */
    private final Object f34450b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34451c;

    /* renamed from: d, reason: collision with root package name */
    private final int f34452d;

    /* renamed from: e, reason: collision with root package name */
    private final Class f34453e;

    /* renamed from: f, reason: collision with root package name */
    private final Class f34454f;

    /* renamed from: g, reason: collision with root package name */
    private final C2.e f34455g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f34456h;

    /* renamed from: i, reason: collision with root package name */
    private final C2.g f34457i;

    /* renamed from: j, reason: collision with root package name */
    private int f34458j;

    m(Object obj, C2.e eVar, int i10, int i11, Map map, Class cls, Class cls2, C2.g gVar) {
        this.f34450b = W2.k.d(obj);
        this.f34455g = (C2.e) W2.k.e(eVar, "Signature must not be null");
        this.f34451c = i10;
        this.f34452d = i11;
        this.f34456h = (Map) W2.k.d(map);
        this.f34453e = (Class) W2.k.e(cls, "Resource class must not be null");
        this.f34454f = (Class) W2.k.e(cls2, "Transcode class must not be null");
        this.f34457i = (C2.g) W2.k.d(gVar);
    }

    @Override // C2.e
    public void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // C2.e
    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f34450b.equals(mVar.f34450b) && this.f34455g.equals(mVar.f34455g) && this.f34452d == mVar.f34452d && this.f34451c == mVar.f34451c && this.f34456h.equals(mVar.f34456h) && this.f34453e.equals(mVar.f34453e) && this.f34454f.equals(mVar.f34454f) && this.f34457i.equals(mVar.f34457i);
    }

    @Override // C2.e
    public int hashCode() {
        if (this.f34458j == 0) {
            int iHashCode = this.f34450b.hashCode();
            this.f34458j = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f34455g.hashCode()) * 31) + this.f34451c) * 31) + this.f34452d;
            this.f34458j = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f34456h.hashCode();
            this.f34458j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f34453e.hashCode();
            this.f34458j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f34454f.hashCode();
            this.f34458j = iHashCode5;
            this.f34458j = (iHashCode5 * 31) + this.f34457i.hashCode();
        }
        return this.f34458j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f34450b + ", width=" + this.f34451c + ", height=" + this.f34452d + ", resourceClass=" + this.f34453e + ", transcodeClass=" + this.f34454f + ", signature=" + this.f34455g + ", hashCode=" + this.f34458j + ", transformations=" + this.f34456h + ", options=" + this.f34457i + '}';
    }
}
