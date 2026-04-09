package androidx.work.impl.workers;

import T1.z;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.l;
import androidx.work.m;
import b2.InterfaceC1818E;
import b2.InterfaceC1829j;
import b2.InterfaceC1836q;
import b2.InterfaceC1843x;
import f2.c;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;

/* compiled from: DiagnosticsWorker.kt */
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        l.f(context, "context");
        l.f(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final l.a doWork() {
        z zVarC = z.c(getApplicationContext());
        kotlin.jvm.internal.l.e(zVarC, "getInstance(applicationContext)");
        WorkDatabase workDatabase = zVarC.f12232c;
        kotlin.jvm.internal.l.e(workDatabase, "workManager.workDatabase");
        InterfaceC1843x interfaceC1843xY = workDatabase.y();
        InterfaceC1836q interfaceC1836qW = workDatabase.w();
        InterfaceC1818E interfaceC1818EZ = workDatabase.z();
        InterfaceC1829j interfaceC1829jV = workDatabase.v();
        zVarC.f12231b.f16867c.getClass();
        ArrayList arrayListF = interfaceC1843xY.f(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        ArrayList arrayListM = interfaceC1843xY.m();
        ArrayList arrayListB = interfaceC1843xY.b();
        if (!arrayListF.isEmpty()) {
            m mVarE = m.e();
            String str = c.f37815a;
            mVarE.f(str, "Recently completed work:\n\n");
            m.e().f(str, c.a(interfaceC1836qW, interfaceC1818EZ, interfaceC1829jV, arrayListF));
        }
        if (!arrayListM.isEmpty()) {
            m mVarE2 = m.e();
            String str2 = c.f37815a;
            mVarE2.f(str2, "Running work:\n\n");
            m.e().f(str2, c.a(interfaceC1836qW, interfaceC1818EZ, interfaceC1829jV, arrayListM));
        }
        if (!arrayListB.isEmpty()) {
            m mVarE3 = m.e();
            String str3 = c.f37815a;
            mVarE3.f(str3, "Enqueued work:\n\n");
            m.e().f(str3, c.a(interfaceC1836qW, interfaceC1818EZ, interfaceC1829jV, arrayListB));
        }
        return new l.a.c();
    }
}
