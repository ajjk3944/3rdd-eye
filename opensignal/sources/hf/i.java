package hf;

import java.util.Objects;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final cj.a f10656a;

    /* renamed from: b, reason: collision with root package name */
    public final h f10657b;

    public i(cj.a aVar, of.b bVar) {
        this.f10656a = aVar;
        this.f10657b = new h(bVar);
    }

    public final void a(String str) {
        h hVar = this.f10657b;
        synchronized (hVar) {
            if (!Objects.equals(hVar.f10654b, str)) {
                h.a(hVar.f10653a, str, hVar.f10655c);
                hVar.f10654b = str;
            }
        }
    }
}
