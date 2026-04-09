package Ri;

import Ii.S;

/* loaded from: classes4.dex */
final class i extends h {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f19988c;

    public i(Runnable runnable, long j10, boolean z10) {
        super(j10, z10);
        this.f19988c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f19988c.run();
    }

    public String toString() {
        return "Task[" + S.a(this.f19988c) + '@' + S.b(this.f19988c) + ", " + this.f19986a + ", " + j.c(this.f19987b) + ']';
    }
}
