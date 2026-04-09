package kotlin.reflect.jvm.internal.impl.types.error;

import Bh.InterfaceC2498h;
import Zg.AbstractC3689v;
import Zg.d0;
import ii.C6157d;
import ii.InterfaceC6164k;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public class g implements InterfaceC6164k {

    /* renamed from: b, reason: collision with root package name */
    private final h f52186b;

    /* renamed from: c, reason: collision with root package name */
    private final String f52187c;

    public g(h kind, String... formatParams) {
        AbstractC6492s.i(kind, "kind");
        AbstractC6492s.i(formatParams, "formatParams");
        this.f52186b = kind;
        String debugMessage = kind.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        AbstractC6492s.h(str, "format(...)");
        this.f52187c = str;
    }

    @Override // ii.InterfaceC6164k
    public Set a() {
        return d0.e();
    }

    @Override // ii.InterfaceC6164k
    public Set c() {
        return d0.e();
    }

    @Override // ii.InterfaceC6167n
    public Collection e(C6157d kindFilter, InterfaceC6835l nameFilter) {
        AbstractC6492s.i(kindFilter, "kindFilter");
        AbstractC6492s.i(nameFilter, "nameFilter");
        return AbstractC3689v.l();
    }

    @Override // ii.InterfaceC6164k
    public Set f() {
        return d0.e();
    }

    @Override // ii.InterfaceC6167n
    public InterfaceC2498h g(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        String str = String.format(b.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{name}, 1));
        AbstractC6492s.h(str, "format(...)");
        Zh.f fVarN = Zh.f.n(str);
        AbstractC6492s.h(fVarN, "special(...)");
        return new a(fVarN);
    }

    @Override // ii.InterfaceC6164k
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set b(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        return d0.c(new c(l.f52198a.h()));
    }

    @Override // ii.InterfaceC6164k
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set d(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        return l.f52198a.j();
    }

    protected final String j() {
        return this.f52187c;
    }

    public String toString() {
        return "ErrorScope{" + this.f52187c + '}';
    }
}
