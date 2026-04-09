package Sh;

import Bh.h0;
import kotlin.jvm.internal.AbstractC6492s;
import li.C6647y;
import ni.EnumC6986r;
import ni.InterfaceC6987s;

/* loaded from: classes4.dex */
public final class z implements InterfaceC6987s {

    /* renamed from: b, reason: collision with root package name */
    private final x f20811b;

    /* renamed from: c, reason: collision with root package name */
    private final C6647y f20812c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f20813d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumC6986r f20814e;

    public z(x binaryClass, C6647y c6647y, boolean z10, EnumC6986r abiStability) {
        AbstractC6492s.i(binaryClass, "binaryClass");
        AbstractC6492s.i(abiStability, "abiStability");
        this.f20811b = binaryClass;
        this.f20812c = c6647y;
        this.f20813d = z10;
        this.f20814e = abiStability;
    }

    @Override // Bh.g0
    public h0 a() {
        h0 NO_SOURCE_FILE = h0.f1785a;
        AbstractC6492s.h(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    @Override // ni.InterfaceC6987s
    public String c() {
        return "Class '" + this.f20811b.b().a().b() + '\'';
    }

    public final x d() {
        return this.f20811b;
    }

    public String toString() {
        return z.class.getSimpleName() + ": " + this.f20811b;
    }
}
