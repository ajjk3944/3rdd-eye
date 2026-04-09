package n1;

import android.os.SystemClock;
import android.util.Log;
import java.util.Collections;
import l1.InterfaceC2636b;
import l1.InterfaceC2639e;
import p1.InterfaceC2770a;

/* loaded from: classes.dex */
public final class C implements g, f {

    /* renamed from: a, reason: collision with root package name */
    public final h f22163a;

    /* renamed from: b, reason: collision with root package name */
    public final i f22164b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f22165c;

    /* renamed from: d, reason: collision with root package name */
    public volatile d f22166d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f22167e;

    /* renamed from: f, reason: collision with root package name */
    public volatile r1.q f22168f;

    /* renamed from: g, reason: collision with root package name */
    public volatile e f22169g;

    public C(h hVar, i iVar) {
        this.f22163a = hVar;
        this.f22164b = iVar;
    }

    @Override // n1.f
    public final void a(InterfaceC2639e interfaceC2639e, Exception exc, com.bumptech.glide.load.data.d dVar, int i) {
        this.f22164b.a(interfaceC2639e, exc, dVar, this.f22168f.f23370c.c());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    @Override // n1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f22167e
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L20
            java.lang.Object r0 = r7.f22167e
            r7.f22167e = r1
            boolean r0 = r7.d(r0)     // Catch: java.io.IOException -> L11
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
            n1.d r0 = r7.f22166d
            if (r0 == 0) goto L2d
            n1.d r0 = r7.f22166d
            boolean r0 = r0.b()
            if (r0 == 0) goto L2d
        L2c:
            return r2
        L2d:
            r7.f22166d = r1
            r7.f22168f = r1
            r0 = 0
        L32:
            if (r0 != 0) goto L93
            int r1 = r7.f22165c
            n1.h r3 = r7.f22163a
            java.util.ArrayList r3 = r3.b()
            int r3 = r3.size()
            if (r1 >= r3) goto L93
            n1.h r1 = r7.f22163a
            java.util.ArrayList r1 = r1.b()
            int r3 = r7.f22165c
            int r4 = r3 + 1
            r7.f22165c = r4
            java.lang.Object r1 = r1.get(r3)
            r1.q r1 = (r1.q) r1
            r7.f22168f = r1
            r1.q r1 = r7.f22168f
            if (r1 == 0) goto L32
            n1.h r1 = r7.f22163a
            n1.k r1 = r1.f22199p
            r1.q r3 = r7.f22168f
            com.bumptech.glide.load.data.d r3 = r3.f23370c
            int r3 = r3.c()
            boolean r1 = r1.a(r3)
            if (r1 != 0) goto L7c
            n1.h r1 = r7.f22163a
            r1.q r3 = r7.f22168f
            com.bumptech.glide.load.data.d r3 = r3.f23370c
            java.lang.Class r3 = r3.a()
            n1.x r1 = r1.c(r3)
            if (r1 == 0) goto L32
        L7c:
            r1.q r0 = r7.f22168f
            r1.q r1 = r7.f22168f
            com.bumptech.glide.load.data.d r1 = r1.f23370c
            n1.h r3 = r7.f22163a
            com.bumptech.glide.h r3 = r3.f22198o
            V2.h r4 = new V2.h
            r5 = 24
            r6 = 0
            r4.<init>(r7, r0, r5, r6)
            r1.e(r3, r4)
            r0 = r2
            goto L32
        L93:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.C.b():boolean");
    }

    @Override // n1.f
    public final void c(InterfaceC2639e interfaceC2639e, Object obj, com.bumptech.glide.load.data.d dVar, int i, InterfaceC2639e interfaceC2639e2) {
        this.f22164b.c(interfaceC2639e, obj, dVar, this.f22168f.f23370c.c(), interfaceC2639e);
    }

    @Override // n1.g
    public final void cancel() {
        r1.q qVar = this.f22168f;
        if (qVar != null) {
            qVar.f23370c.cancel();
        }
    }

    public final boolean d(Object obj) throws Throwable {
        Throwable th;
        int i = H1.j.f1768b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z6 = false;
        try {
            com.bumptech.glide.load.data.f fVarH = this.f22163a.f22187c.b().h(obj);
            Object objC = fVarH.c();
            InterfaceC2636b interfaceC2636bD = this.f22163a.d(objC);
            V2.e eVar = new V2.e(interfaceC2636bD, objC, this.f22163a.i, 27);
            InterfaceC2639e interfaceC2639e = this.f22168f.f23368a;
            h hVar = this.f22163a;
            e eVar2 = new e(interfaceC2639e, hVar.f22197n);
            InterfaceC2770a interfaceC2770aA = hVar.f22192h.a();
            interfaceC2770aA.i(eVar2, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + eVar2 + ", data: " + obj + ", encoder: " + interfaceC2636bD + ", duration: " + H1.j.a(jElapsedRealtimeNanos));
            }
            if (interfaceC2770aA.k(eVar2) != null) {
                this.f22169g = eVar2;
                this.f22166d = new d(Collections.singletonList(this.f22168f.f23368a), this.f22163a, this);
                this.f22168f.f23370c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f22169g + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f22164b.c(this.f22168f.f23368a, fVarH.c(), this.f22168f.f23370c, this.f22168f.f23370c.c(), this.f22168f.f23368a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z6 = true;
                if (z6) {
                    throw th;
                }
                this.f22168f.f23370c.b();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
