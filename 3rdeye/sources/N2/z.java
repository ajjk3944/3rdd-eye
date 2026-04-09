package N2;

import N2.h;
import R2.q;
import android.os.SystemClock;
import android.util.Log;
import java.util.Collections;

/* compiled from: SourceGenerator.java */
/* loaded from: classes.dex */
public final class z implements h, h.a {

    /* renamed from: b, reason: collision with root package name */
    public final i<?> f4659b;

    /* renamed from: c, reason: collision with root package name */
    public final j f4660c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f4661d;

    /* renamed from: e, reason: collision with root package name */
    public volatile e f4662e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f4663f;

    /* renamed from: g, reason: collision with root package name */
    public volatile q.a<?> f4664g;

    /* renamed from: h, reason: collision with root package name */
    public volatile f f4665h;

    public z(i iVar, j jVar) {
        this.f4659b = iVar;
        this.f4660c = jVar;
    }

    @Override // N2.h.a
    public final void a(L2.f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, L2.a aVar) {
        this.f4660c.a(fVar, exc, dVar, this.f4664g.f11688c.d());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // N2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f4663f
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L20
            java.lang.Object r0 = r5.f4663f
            r5.f4663f = r1
            boolean r0 = r5.d(r0)     // Catch: java.io.IOException -> L11
            if (r0 != 0) goto L20
            goto L2c
        L11:
            r0 = move-exception
            java.lang.String r3 = "SourceGenerator"
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r3, r4)
            if (r4 == 0) goto L20
            java.lang.String r4 = "Failed to properly rewind or write data to cache"
            android.util.Log.d(r3, r4, r0)
        L20:
            N2.e r0 = r5.f4662e
            if (r0 == 0) goto L2d
            N2.e r0 = r5.f4662e
            boolean r0 = r0.b()
            if (r0 == 0) goto L2d
        L2c:
            return r2
        L2d:
            r5.f4662e = r1
            r5.f4664g = r1
            r0 = 0
        L32:
            if (r0 != 0) goto L90
            int r1 = r5.f4661d
            N2.i<?> r3 = r5.f4659b
            java.util.ArrayList r3 = r3.b()
            int r3 = r3.size()
            if (r1 >= r3) goto L90
            N2.i<?> r1 = r5.f4659b
            java.util.ArrayList r1 = r1.b()
            int r3 = r5.f4661d
            int r4 = r3 + 1
            r5.f4661d = r4
            java.lang.Object r1 = r1.get(r3)
            R2.q$a r1 = (R2.q.a) r1
            r5.f4664g = r1
            R2.q$a<?> r1 = r5.f4664g
            if (r1 == 0) goto L32
            N2.i<?> r1 = r5.f4659b
            N2.l r1 = r1.f4501p
            R2.q$a<?> r3 = r5.f4664g
            com.bumptech.glide.load.data.d<Data> r3 = r3.f11688c
            L2.a r3 = r3.d()
            boolean r1 = r1.c(r3)
            if (r1 != 0) goto L7c
            N2.i<?> r1 = r5.f4659b
            R2.q$a<?> r3 = r5.f4664g
            com.bumptech.glide.load.data.d<Data> r3 = r3.f11688c
            java.lang.Class r3 = r3.a()
            N2.s r1 = r1.c(r3)
            if (r1 == 0) goto L32
        L7c:
            R2.q$a<?> r0 = r5.f4664g
            R2.q$a<?> r1 = r5.f4664g
            com.bumptech.glide.load.data.d<Data> r1 = r1.f11688c
            N2.i<?> r3 = r5.f4659b
            com.bumptech.glide.h r3 = r3.f4500o
            N2.y r4 = new N2.y
            r4.<init>(r5, r0)
            r1.e(r3, r4)
            r0 = r2
            goto L32
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.z.b():boolean");
    }

    @Override // N2.h.a
    public final void c(L2.f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, L2.a aVar, L2.f fVar2) {
        this.f4660c.c(fVar, obj, dVar, this.f4664g.f11688c.d(), fVar);
    }

    @Override // N2.h
    public final void cancel() {
        q.a<?> aVar = this.f4664g;
        if (aVar != null) {
            aVar.f11688c.cancel();
        }
    }

    public final boolean d(Object obj) throws Throwable {
        Throwable th;
        int i = h3.h.f38207b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z10 = false;
        try {
            com.bumptech.glide.load.data.e eVarH = this.f4659b.f4489c.b().h(obj);
            Object objA = eVarH.a();
            Object objD = this.f4659b.d(objA);
            g gVar = new g(objD, objA, this.f4659b.i);
            L2.f fVar = this.f4664g.f11686a;
            i<?> iVar = this.f4659b;
            f fVar2 = new f(fVar, iVar.f4499n);
            P2.a aVarA = iVar.f4494h.a();
            aVarA.f(fVar2, gVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + fVar2 + ", data: " + obj + ", encoder: " + objD + ", duration: " + h3.h.a(jElapsedRealtimeNanos));
            }
            if (aVarA.h(fVar2) != null) {
                this.f4665h = fVar2;
                this.f4662e = new e(Collections.singletonList(this.f4664g.f11686a), this.f4659b, this);
                this.f4664g.f11688c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f4665h + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f4660c.c(this.f4664g.f11686a, eVarH.a(), this.f4664g.f11688c, this.f4664g.f11688c.d(), this.f4664g.f11686a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
                if (z10) {
                    throw th;
                }
                this.f4664g.f11688c.b();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
