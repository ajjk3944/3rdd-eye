package je;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final t f27557a;

    /* renamed from: b, reason: collision with root package name */
    public final i f27558b;

    public j(t tVar, pe.c cVar) {
        this.f27557a = tVar;
        this.f27558b = new i(cVar);
    }

    public final void a(String str) {
        i iVar = this.f27558b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f27555b, str)) {
                i.a(iVar.f27554a, str, iVar.f27556c);
                iVar.f27555b = str;
            }
        }
    }
}
