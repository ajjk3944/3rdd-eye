package vu;

import java.io.IOException;

/* loaded from: classes.dex */
public final class m extends ru.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f24015e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f24016f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cv.g f24017g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f24018h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, q qVar, int i10, cv.g gVar, int i11, boolean z10) {
        super(str, true);
        this.f24015e = qVar;
        this.f24016f = i10;
        this.f24017g = gVar;
        this.f24018h = i11;
    }

    @Override // ru.a
    public final long a() {
        try {
            b0 b0Var = this.f24015e.G;
            cv.g gVar = this.f24017g;
            int i10 = this.f24018h;
            b0Var.getClass();
            gVar.skip(i10);
            this.f24015e.S.y(this.f24016f, c.CANCEL);
            synchronized (this.f24015e) {
                this.f24015e.U.remove(Integer.valueOf(this.f24016f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
