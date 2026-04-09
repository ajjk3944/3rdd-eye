package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.o;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.u1;
import kotlinx.coroutines.w0;
import kotlinx.coroutines.y0;
import l9.l;
import y8.s;

/* loaded from: classes4.dex */
public final class HandlerContext extends d implements q0 {

    /* renamed from: b, reason: collision with root package name */
    public final Handler f22219b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22220c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f22221d;

    /* renamed from: e, reason: collision with root package name */
    public final HandlerContext f22222e;

    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f22223a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ HandlerContext f22224b;

        public a(o oVar, HandlerContext handlerContext) {
            this.f22223a = oVar;
            this.f22224b = handlerContext;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f22223a.z(this.f22224b, s.f25199a);
        }
    }

    public HandlerContext(Handler handler, String str, boolean z10) {
        super(null);
        this.f22219b = handler;
        this.f22220c = str;
        this.f22221d = z10;
        this.f22222e = z10 ? this : new HandlerContext(handler, str, true);
    }

    public static final void h0(HandlerContext handlerContext, Runnable runnable) {
        handlerContext.f22219b.removeCallbacks(runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void X(kotlin.coroutines.d dVar, Runnable runnable) {
        if (this.f22219b.post(runnable)) {
            return;
        }
        f0(dVar, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean Z(kotlin.coroutines.d dVar) {
        return (this.f22221d && p.a(Looper.myLooper(), this.f22219b.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.q0
    public void b(long j10, o oVar) {
        final a aVar = new a(oVar, this);
        if (this.f22219b.postDelayed(aVar, q9.e.e(j10, 4611686018427387903L))) {
            oVar.e(new l() { // from class: kotlinx.coroutines.android.HandlerContext$scheduleResumeAfterDelay$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // l9.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return s.f25199a;
                }

                public final void invoke(Throwable th) {
                    this.this$0.f22219b.removeCallbacks(aVar);
                }
            });
        } else {
            f0(oVar.getContext(), aVar);
        }
    }

    @Override // kotlinx.coroutines.q0
    public y0 e(long j10, final Runnable runnable, kotlin.coroutines.d dVar) {
        if (this.f22219b.postDelayed(runnable, q9.e.e(j10, 4611686018427387903L))) {
            return new y0() { // from class: kotlinx.coroutines.android.c
                @Override // kotlinx.coroutines.y0
                public final void d() {
                    HandlerContext.h0(this.f22225a, runnable);
                }
            };
        }
        f0(dVar, runnable);
        return f2.f22359a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HandlerContext)) {
            return false;
        }
        HandlerContext handlerContext = (HandlerContext) obj;
        return handlerContext.f22219b == this.f22219b && handlerContext.f22221d == this.f22221d;
    }

    public final void f0(kotlin.coroutines.d dVar, Runnable runnable) {
        u1.c(dVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        w0.b().X(dVar, runnable);
    }

    @Override // kotlinx.coroutines.c2
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public HandlerContext b0() {
        return this.f22222e;
    }

    public int hashCode() {
        return System.identityHashCode(this.f22219b) ^ (this.f22221d ? 1231 : 1237);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String strC0 = c0();
        if (strC0 != null) {
            return strC0;
        }
        String string = this.f22220c;
        if (string == null) {
            string = this.f22219b.toString();
        }
        if (!this.f22221d) {
            return string;
        }
        return string + ".immediate";
    }

    public /* synthetic */ HandlerContext(Handler handler, String str, int i10, i iVar) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public HandlerContext(Handler handler, String str) {
        this(handler, str, false);
    }
}
