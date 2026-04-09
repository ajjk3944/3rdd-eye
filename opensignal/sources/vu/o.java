package vu;

import java.io.IOException;

/* loaded from: classes.dex */
public final class o extends ru.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f24022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f24023f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f24024g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, q qVar, int i10, c cVar) {
        super(str, true);
        this.f24022e = qVar;
        this.f24023f = i10;
        this.f24024g = cVar;
    }

    @Override // ru.a
    public final long a() throws IOException {
        q qVar = this.f24022e;
        try {
            int i10 = this.f24023f;
            c cVar = this.f24024g;
            br.l.e(cVar, "statusCode");
            qVar.S.y(i10, cVar);
            return -1L;
        } catch (IOException e4) {
            qVar.f(e4);
            return -1L;
        }
    }
}
