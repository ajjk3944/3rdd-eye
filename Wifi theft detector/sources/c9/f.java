package c9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class f implements c, d9.c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f4759b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4760c = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "result");

    /* renamed from: a, reason: collision with root package name */
    public final c f4761a;

    @Nullable
    private volatile Object result;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public a() {
        }
    }

    public f(c delegate, Object obj) {
        p.e(delegate, "delegate");
        this.f4761a = delegate;
        this.result = obj;
    }

    public final Object a() throws Throwable {
        Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f21984b;
        if (obj == coroutineSingletons) {
            if (t.a.a(f4760c, this, coroutineSingletons, kotlin.coroutines.intrinsics.a.f())) {
                return kotlin.coroutines.intrinsics.a.f();
            }
            obj = this.result;
        }
        if (obj == CoroutineSingletons.f21985c) {
            return kotlin.coroutines.intrinsics.a.f();
        }
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
        return obj;
    }

    @Override // d9.c
    public d9.c getCallerFrame() {
        c cVar = this.f4761a;
        if (cVar instanceof d9.c) {
            return (d9.c) cVar;
        }
        return null;
    }

    @Override // c9.c
    public kotlin.coroutines.d getContext() {
        return this.f4761a.getContext();
    }

    @Override // c9.c
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f21984b;
            if (obj2 == coroutineSingletons) {
                if (t.a.a(f4760c, this, coroutineSingletons, obj)) {
                    return;
                }
            } else {
                if (obj2 != kotlin.coroutines.intrinsics.a.f()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (t.a.a(f4760c, this, kotlin.coroutines.intrinsics.a.f(), CoroutineSingletons.f21985c)) {
                    this.f4761a.resumeWith(obj);
                    return;
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f4761a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(c delegate) {
        this(delegate, CoroutineSingletons.f21984b);
        p.e(delegate, "delegate");
    }
}
