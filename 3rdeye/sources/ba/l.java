package ba;

import java.io.IOException;
import java.util.List;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class l extends X9.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f18200e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18201f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f18202g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, f fVar, int i, List list) {
        super(str, true);
        this.f18200e = fVar;
        this.f18201f = i;
        this.f18202g = list;
    }

    @Override // X9.a
    public final long a() {
        this.f18200e.f18153l.getClass();
        try {
            this.f18200e.f18165x.n(this.f18201f, b.CANCEL);
            synchronized (this.f18200e) {
                this.f18200e.f18167z.remove(Integer.valueOf(this.f18201f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
