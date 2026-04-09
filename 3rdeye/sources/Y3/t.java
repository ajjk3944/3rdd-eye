package y3;

import java.util.HashMap;
import v3.C5675a;
import v3.C5676b;
import v3.C5677c;
import y3.h;

/* compiled from: TransportImpl.java */
/* loaded from: classes.dex */
public final class t<T> implements v3.h<T> {

    /* renamed from: a, reason: collision with root package name */
    public final j f48096a;

    /* renamed from: b, reason: collision with root package name */
    public final String f48097b;

    /* renamed from: c, reason: collision with root package name */
    public final C5677c f48098c;

    /* renamed from: d, reason: collision with root package name */
    public final v3.g<T, byte[]> f48099d;

    /* renamed from: e, reason: collision with root package name */
    public final u f48100e;

    public t(j jVar, String str, C5677c c5677c, v3.g gVar, u uVar) {
        this.f48096a = jVar;
        this.f48097b = str;
        this.f48098c = c5677c;
        this.f48099d = gVar;
        this.f48100e = uVar;
    }

    public final void a(C5675a c5675a, v3.j jVar) {
        Integer num;
        j jVar2 = this.f48096a;
        String str = this.f48097b;
        v3.g<T, byte[]> gVar = this.f48099d;
        if (gVar == null) {
            throw new NullPointerException("Null transformer");
        }
        i iVar = new i(jVar2, str, c5675a, gVar, this.f48098c);
        u uVar = this.f48100e;
        C5675a c5675a2 = iVar.f48072c;
        j jVarE = iVar.f48070a.e(c5675a2.f47036b);
        h.a aVar = new h.a();
        aVar.f48066f = new HashMap();
        aVar.f48064d = Long.valueOf(uVar.f48102a.b());
        aVar.f48065e = Long.valueOf(uVar.f48103b.b());
        String str2 = iVar.f48071b;
        if (str2 == null) {
            throw new NullPointerException("Null transportName");
        }
        aVar.f48061a = str2;
        aVar.f48063c = new l(iVar.f48074e, iVar.f48073d.apply(c5675a2.f47035a));
        c5675a2.getClass();
        aVar.f48062b = null;
        C5676b c5676b = c5675a2.f47037c;
        if (c5676b != null && (num = c5676b.f47038a) != null) {
            aVar.f48067g = num;
        }
        c5675a2.getClass();
        uVar.f48104c.a(jVarE, aVar.b(), jVar);
    }
}
