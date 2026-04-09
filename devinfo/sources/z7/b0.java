package z7;

import android.os.SystemClock;
import android.util.Log;
import java.util.Collections;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b0 implements f, e {

    /* renamed from: a, reason: collision with root package name */
    public final g f37984a;

    /* renamed from: b, reason: collision with root package name */
    public final h f37985b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f37986c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f37987d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f37988e;

    /* renamed from: f, reason: collision with root package name */
    public volatile d8.u f37989f;
    public volatile d g;

    public b0(g gVar, h hVar) {
        this.f37984a = gVar;
        this.f37985b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // z7.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f37988e
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L20
            java.lang.Object r0 = r5.f37988e
            r5.f37988e = r1
            boolean r0 = r5.d(r0)     // Catch: java.io.IOException -> L11
            if (r0 != 0) goto L20
            goto L2c
        L11:
            r0 = move-exception
            r3 = 3
            java.lang.String r4 = "SourceGenerator"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L20
            java.lang.String r3 = "Failed to properly rewind or write data to cache"
            android.util.Log.d(r4, r3, r0)
        L20:
            z7.c r0 = r5.f37987d
            if (r0 == 0) goto L2d
            z7.c r0 = r5.f37987d
            boolean r0 = r0.a()
            if (r0 == 0) goto L2d
        L2c:
            return r2
        L2d:
            r5.f37987d = r1
            r5.f37989f = r1
            r0 = 0
        L32:
            if (r0 != 0) goto L90
            int r1 = r5.f37986c
            z7.g r3 = r5.f37984a
            java.util.ArrayList r3 = r3.b()
            int r3 = r3.size()
            if (r1 >= r3) goto L90
            z7.g r1 = r5.f37984a
            java.util.ArrayList r1 = r1.b()
            int r3 = r5.f37986c
            int r4 = r3 + 1
            r5.f37986c = r4
            java.lang.Object r1 = r1.get(r3)
            d8.u r1 = (d8.u) r1
            r5.f37989f = r1
            d8.u r1 = r5.f37989f
            if (r1 == 0) goto L32
            z7.g r1 = r5.f37984a
            z7.j r1 = r1.f38013p
            d8.u r3 = r5.f37989f
            com.bumptech.glide.load.data.d r3 = r3.f22049c
            int r3 = r3.d()
            boolean r1 = r1.a(r3)
            if (r1 != 0) goto L7c
            z7.g r1 = r5.f37984a
            d8.u r3 = r5.f37989f
            com.bumptech.glide.load.data.d r3 = r3.f22049c
            java.lang.Class r3 = r3.a()
            z7.w r1 = r1.c(r3)
            if (r1 == 0) goto L32
        L7c:
            d8.u r0 = r5.f37989f
            d8.u r1 = r5.f37989f
            com.bumptech.glide.load.data.d r1 = r1.f22049c
            z7.g r3 = r5.f37984a
            com.bumptech.glide.i r3 = r3.f38012o
            ya.d0 r4 = new ya.d0
            r4.<init>(r5, r0)
            r1.e(r3, r4)
            r0 = r2
            goto L32
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.b0.a():boolean");
    }

    @Override // z7.e
    public final void b(x7.e eVar, Exception exc, com.bumptech.glide.load.data.d dVar, int i4) {
        this.f37985b.b(eVar, exc, dVar, this.f37989f.f22049c.d());
    }

    @Override // z7.e
    public final void c(x7.e eVar, Object obj, com.bumptech.glide.load.data.d dVar, int i4, x7.e eVar2) {
        this.f37985b.c(eVar, obj, dVar, this.f37989f.f22049c.d(), eVar);
    }

    @Override // z7.f
    public final void cancel() {
        d8.u uVar = this.f37989f;
        if (uVar != null) {
            uVar.f22049c.cancel();
        }
    }

    public final boolean d(Object obj) throws Throwable {
        Throwable th2;
        int i4 = t8.h.f34512b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z3 = false;
        try {
            com.bumptech.glide.load.data.f fVarH = this.f37984a.f38002c.b().h(obj);
            Object objA = fVarH.a();
            x7.b bVarD = this.f37984a.d(objA);
            w4.m mVar = new w4.m(bVarD, objA, this.f37984a.f38007i);
            x7.e eVar = this.f37989f.f22047a;
            g gVar = this.f37984a;
            d dVar = new d(eVar, gVar.f38011n);
            b8.a aVarA = gVar.f38006h.a();
            aVarA.g(dVar, mVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + dVar + ", data: " + obj + ", encoder: " + bVarD + ", duration: " + t8.h.a(jElapsedRealtimeNanos));
            }
            if (aVarA.f(dVar) != null) {
                this.g = dVar;
                this.f37987d = new c(Collections.singletonList(this.f37989f.f22047a), this.f37984a, this);
                this.f37989f.f22049c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.g + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f37985b.c(this.f37989f.f22047a, fVarH.a(), this.f37989f.f22049c, this.f37989f.f22049c.d(), this.f37989f.f22047a);
                return false;
            } catch (Throwable th3) {
                th2 = th3;
                z3 = true;
                if (z3) {
                    throw th2;
                }
                this.f37989f.f22049c.b();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }
}
