package vu;

import java.io.IOException;

/* loaded from: classes.dex */
public final class p extends ru.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f24025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f24026f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f24027g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, q qVar, int i10, long j) {
        super(str, true);
        this.f24025e = qVar;
        this.f24026f = i10;
        this.f24027g = j;
    }

    @Override // ru.a
    public final long a() throws IOException {
        q qVar = this.f24025e;
        try {
            qVar.S.G(this.f24026f, this.f24027g);
            return -1L;
        } catch (IOException e4) {
            qVar.f(e4);
            return -1L;
        }
    }
}
