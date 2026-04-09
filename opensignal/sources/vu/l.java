package vu;

import java.io.IOException;

/* loaded from: classes.dex */
public final class l extends ru.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f24012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f24013f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f24014g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, q qVar, int i10, int i11) {
        super(str, true);
        this.f24012e = qVar;
        this.f24013f = i10;
        this.f24014g = i11;
    }

    @Override // ru.a
    public final long a() throws IOException {
        q qVar = this.f24012e;
        try {
            qVar.S.w(this.f24013f, true, this.f24014g);
            return -1L;
        } catch (IOException e4) {
            qVar.f(e4);
            return -1L;
        }
    }
}
