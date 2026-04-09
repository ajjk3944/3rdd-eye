package kotlin;

import kotlin.Result;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f21919a;

    static {
        Result.Companion companion = Result.INSTANCE;
        f21919a = Result.b(kotlin.coroutines.intrinsics.a.f());
    }

    public static final Object b(y8.a aVar, Object obj) {
        p.e(aVar, "<this>");
        return new y8.c(aVar.a(), obj).b();
    }
}
