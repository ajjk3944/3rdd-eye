package yl;

import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final u f37720a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f37721b;

    public p(q qVar, u uVar) {
        this.f37721b = qVar;
        this.f37720a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [yl.q] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [yl.b] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // mk.a
    public final Object invoke() throws Throwable {
        Throwable th2;
        b bVar;
        ?? r02 = this.f37721b;
        u uVar = this.f37720a;
        b bVar2 = b.INTERNAL_ERROR;
        ?? r32 = 1;
        IOException e2 = null;
        try {
            try {
                try {
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (IOException e10) {
                e2 = e10;
                bVar = bVar2;
            }
            if (!uVar.c(true, this)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            do {
                try {
                } catch (Throwable th4) {
                    th2 = th4;
                    r32 = bVar2;
                    r02.c(r32, bVar2, e2);
                    sl.f.b(uVar);
                    throw th2;
                }
            } while (uVar.c(false, this));
            bVar = b.NO_ERROR;
            try {
                bVar2 = b.CANCEL;
                r02.c(bVar, bVar2, null);
                r32 = bVar;
            } catch (IOException e11) {
                e2 = e11;
                bVar2 = b.PROTOCOL_ERROR;
                r02.c(bVar2, bVar2, e2);
                r32 = bVar;
                sl.f.b(uVar);
                return yj.u.f37649a;
            }
            sl.f.b(uVar);
            return yj.u.f37649a;
        } catch (Throwable th5) {
            th2 = th5;
            r02.c(r32, bVar2, e2);
            sl.f.b(uVar);
            throw th2;
        }
    }
}
