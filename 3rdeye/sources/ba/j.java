package ba;

import ia.C4468d;
import java.io.IOException;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class j extends X9.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f18193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18194f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C4468d f18195g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f18196h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, f fVar, int i, C4468d c4468d, int i10, boolean z10) {
        super(str, true);
        this.f18193e = fVar;
        this.f18194f = i;
        this.f18195g = c4468d;
        this.f18196h = i10;
    }

    @Override // X9.a
    public final long a() {
        try {
            s sVar = this.f18193e.f18153l;
            C4468d c4468d = this.f18195g;
            int i = this.f18196h;
            sVar.getClass();
            c4468d.skip(i);
            this.f18193e.f18165x.n(this.f18194f, b.CANCEL);
            synchronized (this.f18193e) {
                this.f18193e.f18167z.remove(Integer.valueOf(this.f18194f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
