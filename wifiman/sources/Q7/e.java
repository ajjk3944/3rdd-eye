package Q7;

import Sj.a;
import kotlin.jvm.internal.AbstractC6492s;
import ve.g;

/* loaded from: classes3.dex */
public final class e extends a.C0767a {

    /* renamed from: e, reason: collision with root package name */
    private final g f19235e;

    public e(g fileLog) {
        AbstractC6492s.i(fileLog, "fileLog");
        this.f19235e = fileLog;
    }

    @Override // Sj.a.C0767a, Sj.a.c
    protected void l(int i10, String str, String message, Throwable th2) {
        AbstractC6492s.i(message, "message");
        super.l(i10, str, message, th2);
        this.f19235e.a(i10, str, message);
    }
}
