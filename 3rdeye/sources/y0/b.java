package Y0;

import X0.C1638a;
import X0.InterfaceC1639b;
import java.io.IOException;
import kotlin.jvm.internal.m;
import p9.l;

/* compiled from: ReplaceFileCorruptionHandler.kt */
/* loaded from: classes.dex */
public final class b<T> implements InterfaceC1639b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final m f13700a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(l<? super C1638a, ? extends T> produceNewData) {
        kotlin.jvm.internal.l.f(produceNewData, "produceNewData");
        this.f13700a = (m) produceNewData;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.m, p9.l] */
    @Override // X0.InterfaceC1639b
    public final Object a(C1638a c1638a) throws IOException {
        return this.f13700a.invoke(c1638a);
    }
}
