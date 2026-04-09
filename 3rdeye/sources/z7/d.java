package z7;

import kotlin.jvm.internal.l;

/* compiled from: ParsingException.kt */
/* loaded from: classes.dex */
public final class d extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public final f f48476b;

    /* renamed from: c, reason: collision with root package name */
    public final I9.g f48477c;

    /* renamed from: d, reason: collision with root package name */
    public final String f48478d;

    public /* synthetic */ d(f fVar, String str, Exception exc, I9.g gVar, String str2, int i) {
        this(fVar, str, (i & 4) != 0 ? null : exc, (i & 8) != 0 ? null : gVar, (i & 16) != 0 ? null : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f reason, String message, Throwable th, I9.g gVar, String str) {
        super(message, th);
        l.f(reason, "reason");
        l.f(message, "message");
        this.f48476b = reason;
        this.f48477c = gVar;
        this.f48478d = str;
    }
}
