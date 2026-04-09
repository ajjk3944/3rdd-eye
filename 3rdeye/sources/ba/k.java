package ba;

import java.io.IOException;
import java.util.List;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class k extends X9.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f18197e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18198f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f18199g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, f fVar, int i, List list, boolean z10) {
        super(str, true);
        this.f18197e = fVar;
        this.f18198f = i;
        this.f18199g = list;
    }

    @Override // X9.a
    public final long a() {
        this.f18197e.f18153l.getClass();
        try {
            this.f18197e.f18165x.n(this.f18198f, b.CANCEL);
            synchronized (this.f18197e) {
                this.f18197e.f18167z.remove(Integer.valueOf(this.f18198f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
