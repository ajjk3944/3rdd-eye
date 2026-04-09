package kotlin.reflect.jvm.internal.impl.types.error;

import Bh.InterfaceC2498h;
import Zg.AbstractC3689v;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import pi.v0;

/* loaded from: classes4.dex */
public final class j implements v0 {

    /* renamed from: a, reason: collision with root package name */
    private final k f52195a;

    /* renamed from: b, reason: collision with root package name */
    private final String[] f52196b;

    /* renamed from: c, reason: collision with root package name */
    private final String f52197c;

    public j(k kind, String... formatParams) {
        AbstractC6492s.i(kind, "kind");
        AbstractC6492s.i(formatParams, "formatParams");
        this.f52195a = kind;
        this.f52196b = formatParams;
        String debugText = b.ERROR_TYPE.getDebugText();
        String debugMessage = kind.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        AbstractC6492s.h(str, "format(...)");
        String str2 = String.format(debugText, Arrays.copyOf(new Object[]{str}, 1));
        AbstractC6492s.h(str2, "format(...)");
        this.f52197c = str2;
    }

    @Override // pi.v0
    public Collection a() {
        return AbstractC3689v.l();
    }

    @Override // pi.v0
    public v0 b(kotlin.reflect.jvm.internal.impl.types.checker.g kotlinTypeRefiner) {
        AbstractC6492s.i(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // pi.v0
    public InterfaceC2498h c() {
        return l.f52198a.h();
    }

    @Override // pi.v0
    public boolean d() {
        return false;
    }

    public final k f() {
        return this.f52195a;
    }

    public final String g(int i10) {
        return this.f52196b[i10];
    }

    @Override // pi.v0
    public List getParameters() {
        return AbstractC3689v.l();
    }

    @Override // pi.v0
    public kotlin.reflect.jvm.internal.impl.builtins.i q() {
        return kotlin.reflect.jvm.internal.impl.builtins.g.f51736h.a();
    }

    public String toString() {
        return this.f52197c;
    }
}
