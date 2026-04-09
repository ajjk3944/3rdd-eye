package Eh;

import Bh.v0;
import Bh.w0;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class a extends w0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f4758c = new a();

    private a() {
        super("package", false);
    }

    @Override // Bh.w0
    public Integer a(w0 visibility) {
        AbstractC6492s.i(visibility, "visibility");
        if (this == visibility) {
            return 0;
        }
        return v0.f1810a.b(visibility) ? 1 : -1;
    }

    @Override // Bh.w0
    public String b() {
        return "public/*package*/";
    }

    @Override // Bh.w0
    public w0 d() {
        return v0.g.f1819c;
    }
}
