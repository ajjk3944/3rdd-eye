package kotlin.reflect.jvm.internal.impl.types.error;

import Bh.InterfaceC2498h;
import ii.C6157d;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public final class m extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h kind, String... formatParams) {
        super(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        AbstractC6492s.i(kind, "kind");
        AbstractC6492s.i(formatParams, "formatParams");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.g, ii.InterfaceC6164k
    public Set a() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.g, ii.InterfaceC6164k
    public Set c() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.g, ii.InterfaceC6167n
    public Collection e(C6157d kindFilter, InterfaceC6835l nameFilter) {
        AbstractC6492s.i(kindFilter, "kindFilter");
        AbstractC6492s.i(nameFilter, "nameFilter");
        throw new IllegalStateException(j());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.g, ii.InterfaceC6164k
    public Set f() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.g, ii.InterfaceC6167n
    public InterfaceC2498h g(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        throw new IllegalStateException(j() + ", required name: " + name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.g, ii.InterfaceC6164k
    /* renamed from: h */
    public Set b(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        throw new IllegalStateException(j() + ", required name: " + name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.g, ii.InterfaceC6164k
    /* renamed from: i */
    public Set d(Zh.f name, Ih.b location) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(location, "location");
        throw new IllegalStateException(j() + ", required name: " + name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.g
    public String toString() {
        return "ThrowingScope{" + j() + '}';
    }
}
