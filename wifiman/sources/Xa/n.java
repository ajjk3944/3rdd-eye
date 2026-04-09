package xa;

import ab.C3781d;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import xa.InterfaceC8439a;

/* loaded from: classes3.dex */
public final class n implements InterfaceC8439a.d {

    /* renamed from: a, reason: collision with root package name */
    private final C3781d f65534a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f65535b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f65536c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f65537d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f65538e;

    public n(C3781d latestRecord, Object obj, Object obj2) {
        AbstractC6492s.i(latestRecord, "latestRecord");
        this.f65534a = latestRecord;
        this.f65535b = obj;
        this.f65536c = obj2;
        this.f65537d = latestRecord.a();
        Map mapD = latestRecord.D();
        if (mapD == null) {
            Ea.c cVarP0 = p0();
            mapD = cVarP0 != null ? cVarP0.D() : null;
            if (mapD == null) {
                Fa.b bVarJ0 = j0();
                mapD = bVarJ0 != null ? bVarJ0.D() : null;
            }
        }
        this.f65538e = mapD;
    }

    public Map D() {
        return this.f65538e;
    }

    @Override // ua.InterfaceC8153a
    public String I() {
        return this.f65534a.I();
    }

    @Override // xa.InterfaceC8439a.d
    public Object N() {
        return this.f65535b;
    }

    @Override // ua.InterfaceC8153a
    public Set Q0() {
        return this.f65534a.Q0();
    }

    public Set a() {
        return this.f65537d;
    }

    public final C3781d c() {
        return this.f65534a;
    }

    public String d() {
        return this.f65534a.g();
    }

    public Set g() {
        return this.f65534a.h();
    }

    @Override // ua.InterfaceC8153a
    /* renamed from: getId-2jxHnRY */
    public String mo3getId2jxHnRY() {
        return this.f65534a.mo3getId2jxHnRY();
    }

    @Override // ua.InterfaceC8153a
    public String getName() {
        return this.f65534a.getName();
    }

    @Override // ua.InterfaceC8153a
    public ua.b h0() {
        return this.f65534a.h0();
    }

    @Override // ua.InterfaceC8153a
    public Fa.b j0() {
        return this.f65534a.l();
    }

    @Override // ua.InterfaceC8153a
    public Ea.c p0() {
        return this.f65534a.j();
    }

    @Override // ua.InterfaceC8153a
    public Ca.a z() {
        return this.f65534a.z();
    }
}
