package je;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import p.r3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f27559a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f27560b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Thread f27561c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.consent_sdk.d f27562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f27563e;

    public k(m mVar, long j, Throwable th2, Thread thread, com.google.android.gms.internal.consent_sdk.d dVar) {
        this.f27563e = mVar;
        this.f27559a = j;
        this.f27560b = th2;
        this.f27561c = thread;
        this.f27562d = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        pe.c cVar;
        String str;
        long j = this.f27559a;
        long j8 = j / 1000;
        m mVar = this.f27563e;
        String strE = mVar.e();
        if (strE == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        mVar.f27570c.m();
        r3 r3Var = mVar.f27578m;
        r3Var.getClass();
        String strConcat = "Persisting fatal event for session ".concat(strE);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        r3Var.g(this.f27560b, this.f27561c, "crash", new le.c(strE, j8, zj.t.f38318a), true);
        try {
            cVar = mVar.g;
            str = ".ae" + j;
            cVar.getClass();
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e2);
        }
        if (!new File((File) cVar.f31752d, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        com.google.android.gms.internal.consent_sdk.d dVar = this.f27562d;
        mVar.b(false, dVar, false);
        mVar.c(new e().f27546a, Boolean.FALSE);
        return !mVar.f27569b.f() ? Tasks.forResult(null) : ((TaskCompletionSource) ((AtomicReference) dVar.f19302i).get()).getTask().onSuccessTask(mVar.f27572e.f28258a, new o7.c(this, strE));
    }
}
