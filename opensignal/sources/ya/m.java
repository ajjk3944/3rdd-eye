package ya;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLong f26107e = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final na.c f26108a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26109b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26110c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26111d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(na.c cVar, long j) {
        this(cVar, j, 0L, 0L);
        Object obj = cVar.f17422f;
        Map map = Collections.EMPTY_MAP;
    }

    public m(na.c cVar, long j, long j7, long j10) {
        this.f26108a = cVar;
        this.f26109b = j;
        this.f26110c = j7;
        this.f26111d = j10;
    }
}
