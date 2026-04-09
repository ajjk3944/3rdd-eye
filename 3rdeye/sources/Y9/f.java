package Y9;

import ia.C4466b;
import java.io.IOException;

/* compiled from: RealCall.kt */
/* loaded from: classes3.dex */
public final class f extends C4466b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f13856b;

    public f(e eVar) {
        this.f13856b = eVar;
    }

    @Override // ia.C4466b
    public final void timedOut() throws IOException {
        this.f13856b.cancel();
    }
}
