package vu;

import java.io.IOException;

/* loaded from: classes.dex */
public final class d0 extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final c f23986a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(c cVar) {
        super("stream was reset: " + cVar);
        br.l.e(cVar, "errorCode");
        this.f23986a = cVar;
    }
}
