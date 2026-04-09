package androidx.datastore.core;

import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class h extends j {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f2926a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Throwable readException) {
        super(null);
        p.e(readException, "readException");
        this.f2926a = readException;
    }

    public final Throwable a() {
        return this.f2926a;
    }
}
