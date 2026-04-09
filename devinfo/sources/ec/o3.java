package ec;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22974a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f22975b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r3 f22976c;

    public o3(r3 r3Var, long j, int i4) {
        this.f22974a = i4;
        switch (i4) {
            case 1:
                this.f22975b = j;
                Objects.requireNonNull(r3Var);
                this.f22976c = r3Var;
                break;
            default:
                this.f22975b = j;
                Objects.requireNonNull(r3Var);
                this.f22976c = r3Var;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.o3.run():void");
    }
}
