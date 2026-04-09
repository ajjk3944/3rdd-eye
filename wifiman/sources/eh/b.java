package Eh;

import Bh.v0;
import Bh.w0;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class b extends w0 {

    /* renamed from: c, reason: collision with root package name */
    public static final b f4759c = new b();

    private b() {
        super("protected_and_package", true);
    }

    @Override // Bh.w0
    public Integer a(w0 visibility) {
        AbstractC6492s.i(visibility, "visibility");
        if (AbstractC6492s.d(this, visibility)) {
            return 0;
        }
        if (visibility == v0.b.f1814c) {
            return null;
        }
        return Integer.valueOf(v0.f1810a.b(visibility) ? 1 : -1);
    }

    @Override // Bh.w0
    public String b() {
        return "protected/*protected and package*/";
    }

    @Override // Bh.w0
    public w0 d() {
        return v0.g.f1819c;
    }
}
