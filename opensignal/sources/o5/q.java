package o5;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicLong f19025e = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final b5.k f19026a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19027b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19028c;

    /* renamed from: d, reason: collision with root package name */
    public final long f19029d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(b5.k kVar, long j) {
        this(kVar, j, 0L, 0L);
        Uri uri = kVar.f2443a;
        Map map = Collections.EMPTY_MAP;
    }

    public q(b5.k kVar, long j, long j7, long j10) {
        this.f19026a = kVar;
        this.f19027b = j;
        this.f19028c = j7;
        this.f19029d = j10;
    }
}
