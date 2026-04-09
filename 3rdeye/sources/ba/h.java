package ba;

import java.io.IOException;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class h extends X9.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f18189e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f18190f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, f fVar, p pVar) {
        super(str, true);
        this.f18189e = fVar;
        this.f18190f = pVar;
    }

    @Override // X9.a
    public final long a() {
        try {
            this.f18189e.f18144b.b(this.f18190f);
            return -1L;
        } catch (IOException e4) {
            da.h hVar = da.h.f37600a;
            da.h hVar2 = da.h.f37600a;
            String str = "Http2Connection.Listener failure for " + this.f18189e.f18146d;
            hVar2.getClass();
            da.h.i(4, str, e4);
            try {
                this.f18190f.c(b.PROTOCOL_ERROR, e4);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}
