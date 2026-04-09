package com.bumptech.glide.load.engine;

import I2.n;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
class s implements f, d.a {

    /* renamed from: a, reason: collision with root package name */
    private final f.a f34477a;

    /* renamed from: b, reason: collision with root package name */
    private final g f34478b;

    /* renamed from: c, reason: collision with root package name */
    private int f34479c;

    /* renamed from: d, reason: collision with root package name */
    private int f34480d = -1;

    /* renamed from: e, reason: collision with root package name */
    private C2.e f34481e;

    /* renamed from: f, reason: collision with root package name */
    private List f34482f;

    /* renamed from: g, reason: collision with root package name */
    private int f34483g;

    /* renamed from: h, reason: collision with root package name */
    private volatile n.a f34484h;

    /* renamed from: i, reason: collision with root package name */
    private File f34485i;

    /* renamed from: j, reason: collision with root package name */
    private t f34486j;

    s(g gVar, f.a aVar) {
        this.f34478b = gVar;
        this.f34477a = aVar;
    }

    private boolean a() {
        return this.f34483g < this.f34482f.size();
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean b() {
        X2.b.a("ResourceCacheGenerator.startNext");
        try {
            List listC = this.f34478b.c();
            boolean z10 = false;
            if (listC.isEmpty()) {
                X2.b.e();
                return false;
            }
            List listM = this.f34478b.m();
            if (listM.isEmpty()) {
                if (File.class.equals(this.f34478b.r())) {
                    X2.b.e();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f34478b.i() + " to " + this.f34478b.r());
            }
            while (true) {
                if (this.f34482f != null && a()) {
                    this.f34484h = null;
                    while (!z10 && a()) {
                        List list = this.f34482f;
                        int i10 = this.f34483g;
                        this.f34483g = i10 + 1;
                        this.f34484h = ((I2.n) list.get(i10)).a(this.f34485i, this.f34478b.t(), this.f34478b.f(), this.f34478b.k());
                        if (this.f34484h != null && this.f34478b.u(this.f34484h.f8513c.a())) {
                            this.f34484h.f8513c.e(this.f34478b.l(), this);
                            z10 = true;
                        }
                    }
                    X2.b.e();
                    return z10;
                }
                int i11 = this.f34480d + 1;
                this.f34480d = i11;
                if (i11 >= listM.size()) {
                    int i12 = this.f34479c + 1;
                    this.f34479c = i12;
                    if (i12 >= listC.size()) {
                        X2.b.e();
                        return false;
                    }
                    this.f34480d = 0;
                }
                C2.e eVar = (C2.e) listC.get(this.f34479c);
                Class cls = (Class) listM.get(this.f34480d);
                this.f34486j = new t(this.f34478b.b(), eVar, this.f34478b.p(), this.f34478b.t(), this.f34478b.f(), this.f34478b.s(cls), cls, this.f34478b.k());
                File fileB = this.f34478b.d().b(this.f34486j);
                this.f34485i = fileB;
                if (fileB != null) {
                    this.f34481e = eVar;
                    this.f34482f = this.f34478b.j(fileB);
                    this.f34483g = 0;
                }
            }
        } catch (Throwable th2) {
            X2.b.e();
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f34477a.c(this.f34486j, exc, this.f34484h.f8513c, C2.a.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        n.a aVar = this.f34484h;
        if (aVar != null) {
            aVar.f8513c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f34477a.a(this.f34481e, obj, this.f34484h.f8513c, C2.a.RESOURCE_DISK_CACHE, this.f34486j);
    }
}
