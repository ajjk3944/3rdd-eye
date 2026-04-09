package pi;

import android.content.Context;
import km.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g extends cm.g {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f32016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f32017f;
    public final /* synthetic */ cm.g g;

    public g(Context context, cm.g gVar, a aVar) {
        this.f32016e = aVar;
        this.f32017f = context;
        this.g = gVar;
    }

    @Override // cm.g
    public final void A() {
        this.g.A();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    @Override // cm.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(java.lang.String r6) {
        /*
            r5 = this;
            pi.a r0 = r5.f32016e
            pi.a r1 = r0.g
            cm.g r2 = r5.g
            if (r1 == 0) goto L3d
            android.content.Context r1 = r5.f32017f
            boolean r3 = r1 instanceof android.app.Activity
            if (r3 == 0) goto L12
            r3 = r1
            android.app.Activity r3 = (android.app.Activity) r3
            goto L25
        L12:
            boolean r3 = r1 instanceof android.content.ContextWrapper
            if (r3 == 0) goto L24
            r3 = r1
            android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3
            android.content.Context r3 = r3.getBaseContext()
            boolean r4 = r3 instanceof android.app.Activity
            if (r4 == 0) goto L24
            android.app.Activity r3 = (android.app.Activity) r3
            goto L25
        L24:
            r3 = 0
        L25:
            if (r3 == 0) goto L37
            boolean r4 = r3.isFinishing()
            if (r4 != 0) goto L33
            boolean r3 = r3.isDestroyed()
            if (r3 == 0) goto L37
        L33:
            r2.B(r6)
            return
        L37:
            pi.a r6 = r0.g
            je.u.k(r1, r2, r6)
            return
        L3d:
            r2.B(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pi.g.B(java.lang.String):void");
    }

    @Override // cm.g
    public final void C(i0.f fVar) {
        this.g.C(fVar);
    }

    @Override // cm.g
    public final void D(n.a aVar) {
        this.g.D(aVar);
    }

    @Override // cm.g
    public final void E(o oVar) {
        this.g.E(oVar);
    }

    @Override // cm.g
    public final void w() {
        this.g.w();
    }

    @Override // cm.g
    public final void x(b bVar) {
        this.g.x(bVar);
    }

    @Override // cm.g
    public final void y() {
        this.g.y();
    }

    @Override // cm.g
    public final void z(o oVar) {
        this.g.z(oVar);
    }
}
