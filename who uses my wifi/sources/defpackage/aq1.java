package defpackage;

import java.util.function.Supplier;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class aq1 implements Supplier {
    public final /* synthetic */ int a;
    public static final /* synthetic */ aq1 c = new aq1(1);
    public static final /* synthetic */ aq1 b = new aq1(0);

    public /* synthetic */ aq1(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a != 0 ? oq1.a(null) : new dq1();
    }
}
