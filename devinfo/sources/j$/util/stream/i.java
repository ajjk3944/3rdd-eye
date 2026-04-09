package j$.util.stream;

import java.util.stream.Collector;

/* loaded from: classes2.dex */
public final /* synthetic */ class i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Collector f26603a;

    public final /* synthetic */ boolean equals(Object obj) {
        Collector collector = this.f26603a;
        if (obj instanceof i) {
            obj = ((i) obj).f26603a;
        }
        return collector.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26603a.hashCode();
    }
}
