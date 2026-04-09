package androidx.datastore.core;

import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class f extends j {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f2925a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Throwable finalException) {
        super(null);
        p.e(finalException, "finalException");
        this.f2925a = finalException;
    }

    public final Throwable a() {
        return this.f2925a;
    }
}
