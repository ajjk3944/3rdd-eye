package com.ui.core.ui.sso;

import com.ui.core.ui.sso.UiSSO;
import com.ui.sso.api.UiAccountApi;
import dh.InterfaceC5380e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Ab.a f41421a;

    /* renamed from: b, reason: collision with root package name */
    private final Gb.f f41422b;

    /* renamed from: c, reason: collision with root package name */
    private final UiAccountApi.b f41423c;

    /* renamed from: d, reason: collision with root package name */
    private final UiSSO.d f41424d;

    /* renamed from: e, reason: collision with root package name */
    private final UiSSO.e f41425e;

    /* renamed from: f, reason: collision with root package name */
    private a f41426f;

    /* renamed from: g, reason: collision with root package name */
    private UiSSO.a f41427g;

    public interface a {
        Object G(UiSSO.a aVar, InterfaceC5380e interfaceC5380e);
    }

    public c(Ab.a ssoClient, Gb.f ssoStorage, UiAccountApi.b uiAccountApiManager, UiSSO.d dVar, UiSSO.e eVar, a finishDelegate, UiSSO.a aVar) {
        AbstractC6492s.i(ssoClient, "ssoClient");
        AbstractC6492s.i(ssoStorage, "ssoStorage");
        AbstractC6492s.i(uiAccountApiManager, "uiAccountApiManager");
        AbstractC6492s.i(finishDelegate, "finishDelegate");
        this.f41421a = ssoClient;
        this.f41422b = ssoStorage;
        this.f41423c = uiAccountApiManager;
        this.f41424d = dVar;
        this.f41425e = eVar;
        this.f41426f = finishDelegate;
        this.f41427g = aVar;
    }

    public static /* synthetic */ c b(c cVar, Ab.a aVar, Gb.f fVar, UiAccountApi.b bVar, UiSSO.d dVar, UiSSO.e eVar, a aVar2, UiSSO.a aVar3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = cVar.f41421a;
        }
        if ((i10 & 2) != 0) {
            fVar = cVar.f41422b;
        }
        Gb.f fVar2 = fVar;
        if ((i10 & 4) != 0) {
            bVar = cVar.f41423c;
        }
        UiAccountApi.b bVar2 = bVar;
        if ((i10 & 8) != 0) {
            dVar = cVar.f41424d;
        }
        UiSSO.d dVar2 = dVar;
        if ((i10 & 16) != 0) {
            eVar = cVar.f41425e;
        }
        UiSSO.e eVar2 = eVar;
        if ((i10 & 32) != 0) {
            aVar2 = cVar.f41426f;
        }
        a aVar4 = aVar2;
        if ((i10 & 64) != 0) {
            aVar3 = cVar.f41427g;
        }
        return cVar.a(aVar, fVar2, bVar2, dVar2, eVar2, aVar4, aVar3);
    }

    public final c a(Ab.a ssoClient, Gb.f ssoStorage, UiAccountApi.b uiAccountApiManager, UiSSO.d dVar, UiSSO.e eVar, a finishDelegate, UiSSO.a aVar) {
        AbstractC6492s.i(ssoClient, "ssoClient");
        AbstractC6492s.i(ssoStorage, "ssoStorage");
        AbstractC6492s.i(uiAccountApiManager, "uiAccountApiManager");
        AbstractC6492s.i(finishDelegate, "finishDelegate");
        return new c(ssoClient, ssoStorage, uiAccountApiManager, dVar, eVar, finishDelegate, aVar);
    }

    public final a c() {
        return this.f41426f;
    }

    public final UiSSO.d d() {
        return this.f41424d;
    }

    public final UiSSO.e e() {
        return this.f41425e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC6492s.d(this.f41421a, cVar.f41421a) && AbstractC6492s.d(this.f41422b, cVar.f41422b) && AbstractC6492s.d(this.f41423c, cVar.f41423c) && AbstractC6492s.d(this.f41424d, cVar.f41424d) && AbstractC6492s.d(this.f41425e, cVar.f41425e) && AbstractC6492s.d(this.f41426f, cVar.f41426f) && AbstractC6492s.d(this.f41427g, cVar.f41427g);
    }

    public final UiSSO.a f() {
        return this.f41427g;
    }

    public final Ab.a g() {
        return this.f41421a;
    }

    public final Gb.f h() {
        return this.f41422b;
    }

    public int hashCode() {
        int iHashCode = ((((this.f41421a.hashCode() * 31) + this.f41422b.hashCode()) * 31) + this.f41423c.hashCode()) * 31;
        UiSSO.d dVar = this.f41424d;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        UiSSO.e eVar = this.f41425e;
        int iHashCode3 = (((iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.f41426f.hashCode()) * 31;
        UiSSO.a aVar = this.f41427g;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final UiAccountApi.b i() {
        return this.f41423c;
    }

    public String toString() {
        return "SSOActivitySession(ssoClient=" + this.f41421a + ", ssoStorage=" + this.f41422b + ", uiAccountApiManager=" + this.f41423c + ", mfaParams=" + this.f41424d + ", pkceParams=" + this.f41425e + ", finishDelegate=" + this.f41426f + ", ssoAuthResponse=" + this.f41427g + ")";
    }

    public /* synthetic */ c(Ab.a aVar, Gb.f fVar, UiAccountApi.b bVar, UiSSO.d dVar, UiSSO.e eVar, a aVar2, UiSSO.a aVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, fVar, bVar, dVar, eVar, aVar2, (i10 & 64) != 0 ? null : aVar3);
    }
}
