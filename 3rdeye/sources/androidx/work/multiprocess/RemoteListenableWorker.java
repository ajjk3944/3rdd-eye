package androidx.work.multiprocess;

import T1.z;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import androidx.work.l;
import androidx.work.m;
import androidx.work.multiprocess.f;
import d2.C4268c;
import g2.C4377a;
import g2.InterfaceC4379c;
import h2.C4407a;
import h2.C4411e;
import r.InterfaceC5503a;

/* loaded from: classes.dex */
public abstract class RemoteListenableWorker extends l {

    /* renamed from: e, reason: collision with root package name */
    public static final String f16954e = m.g("RemoteListenableWorker");

    /* renamed from: b, reason: collision with root package name */
    public final WorkerParameters f16955b;

    /* renamed from: c, reason: collision with root package name */
    public final f f16956c;

    /* renamed from: d, reason: collision with root package name */
    public ComponentName f16957d;

    public class a implements InterfaceC4379c<androidx.work.multiprocess.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z f16958a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f16959b;

        public a(z zVar, String str) {
            this.f16958a = zVar;
            this.f16959b = str;
        }

        @Override // g2.InterfaceC4379c
        public final void a(Object obj, g gVar) throws Throwable {
            ((androidx.work.multiprocess.a) obj).i(C4407a.a(new h2.f(this.f16958a.f12232c.y().u(this.f16959b).f17140c, RemoteListenableWorker.this.f16955b)), gVar);
        }
    }

    public class b implements InterfaceC5503a<byte[], l.a> {
        public b() {
        }

        @Override // r.InterfaceC5503a
        public final l.a apply(byte[] bArr) {
            h2.g gVar = (h2.g) C4407a.b(bArr, h2.g.CREATOR);
            m.e().a(RemoteListenableWorker.f16954e, "Cleaning up");
            f fVar = RemoteListenableWorker.this.f16956c;
            synchronized (fVar.f17001c) {
                try {
                    f.a aVar = fVar.f17002d;
                    if (aVar != null) {
                        fVar.f16999a.unbindService(aVar);
                        fVar.f17002d = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return gVar.f38168b;
        }
    }

    public RemoteListenableWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f16955b = workerParameters;
        this.f16956c = new f(context, getBackgroundExecutor());
    }

    @Override // androidx.work.l
    @SuppressLint({"NewApi"})
    public void onStopped() {
        super.onStopped();
        final int stopReason = getStopReason();
        ComponentName componentName = this.f16957d;
        if (componentName != null) {
            this.f16956c.a(componentName, new InterfaceC4379c() { // from class: g2.d
                @Override // g2.InterfaceC4379c
                public final void a(Object obj, androidx.work.multiprocess.g gVar) throws RemoteException {
                    ((androidx.work.multiprocess.a) obj).s(C4407a.a(new C4411e(this.f37947a.f16955b.f16852a.toString(), stopReason)), gVar);
                }
            });
        }
    }

    @Override // androidx.work.l
    public final A4.a<l.a> startWork() {
        C4268c c4268c = new C4268c();
        androidx.work.e inputData = getInputData();
        String string = this.f16955b.f16852a.toString();
        String strH = inputData.h("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        String strH2 = inputData.h("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        boolean zIsEmpty = TextUtils.isEmpty(strH);
        String str = f16954e;
        if (zIsEmpty) {
            m.e().c(str, "Need to specify a package name for the Remote Service.");
            c4268c.j(new IllegalArgumentException("Need to specify a package name for the Remote Service."));
            return c4268c;
        }
        if (TextUtils.isEmpty(strH2)) {
            m.e().c(str, "Need to specify a class name for the Remote Service.");
            c4268c.j(new IllegalArgumentException("Need to specify a class name for the Remote Service."));
            return c4268c;
        }
        this.f16957d = new ComponentName(strH, strH2);
        z zVarC = z.c(getApplicationContext());
        return C4377a.a(this.f16956c.a(this.f16957d, new a(zVarC, string)), new b(), getBackgroundExecutor());
    }
}
