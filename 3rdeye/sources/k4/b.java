package K4;

import H6.I;
import N7.C1154e9;
import Q9.C1540l;
import Q9.y0;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.work.impl.WorkDatabase_Impl;
import b2.C1820a;
import b2.C1822c;
import b2.InterfaceC1821b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import g5.InterfaceC4392b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;
import t4.i;
import t4.j;
import u4.InterfaceC5634c;
import u4.u;
import w1.o;
import w9.InterfaceC5748c;
import y.C5787a;
import y4.n;

/* compiled from: CrashlyticsAnalyticsListener.java */
/* loaded from: classes2.dex */
public final class b implements y0, InterfaceC1821b, InterfaceC5634c, OnCompleteListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3142b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3143c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3144d;

    public /* synthetic */ b() {
        this.f3142b = 0;
    }

    private final void h(Task task) {
        u uVar = (u) this.f3143c;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f3144d;
        synchronized (uVar.f46591f) {
            uVar.f46590e.remove(taskCompletionSource);
        }
    }

    @Override // b2.InterfaceC1821b
    public void a(C1820a c1820a) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f3143c;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((C1822c) this.f3144d).j(c1820a);
            workDatabase_Impl.r();
        } finally {
            workDatabase_Impl.n();
        }
    }

    @Override // b2.InterfaceC1821b
    public ArrayList b(String str) throws IOException {
        o oVarD = o.d(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            oVarD.f(1);
        } else {
            oVarD.h(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f3143c;
        workDatabase_Impl.b();
        Cursor cursorY = B7.d.y(workDatabase_Impl, oVarD, false);
        try {
            ArrayList arrayList = new ArrayList(cursorY.getCount());
            while (cursorY.moveToNext()) {
                arrayList.add(cursorY.isNull(0) ? null : cursorY.getString(0));
            }
            return arrayList;
        } finally {
            cursorY.close();
            oVarD.release();
        }
    }

    @Override // b2.InterfaceC1821b
    public boolean c(String str) throws IOException {
        o oVarD = o.d(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            oVarD.f(1);
        } else {
            oVarD.h(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f3143c;
        workDatabase_Impl.b();
        boolean z10 = false;
        Cursor cursorY = B7.d.y(workDatabase_Impl, oVarD, false);
        try {
            if (cursorY.moveToFirst()) {
                z10 = cursorY.getInt(0) != 0;
            }
            return z10;
        } finally {
            cursorY.close();
            oVarD.release();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.internal.m, p9.l] */
    @Override // Q9.y0
    public M9.b d(InterfaceC5748c interfaceC5748c) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f3144d;
        Class clsC = E.u.C(interfaceC5748c);
        Object c1540l = concurrentHashMap.get(clsC);
        if (c1540l == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsC, (c1540l = new C1540l((M9.b) ((m) this.f3143c).invoke(interfaceC5748c))))) != null) {
            c1540l = objPutIfAbsent;
        }
        return ((C1540l) c1540l).f11502a;
    }

    @Override // b2.InterfaceC1821b
    public boolean e(String str) throws IOException {
        o oVarD = o.d(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            oVarD.f(1);
        } else {
            oVarD.h(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f3143c;
        workDatabase_Impl.b();
        boolean z10 = false;
        Cursor cursorY = B7.d.y(workDatabase_Impl, oVarD, false);
        try {
            if (cursorY.moveToFirst()) {
                z10 = cursorY.getInt(0) != 0;
            }
            return z10;
        } finally {
            cursorY.close();
            oVarD.release();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.internal.m, p9.a] */
    public Object f() {
        if (this.f3144d == null) {
            this.f3144d = ((m) this.f3143c).invoke();
        }
        Object obj = this.f3144d;
        if (obj != null) {
            return obj;
        }
        throw new ConcurrentModificationException("Set to null by another thread");
    }

    public void g() throws IOException {
        String str = (String) this.f3143c;
        if (((FileChannel) this.f3144d) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.f3144d = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.f3144d;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f3144d = null;
            throw new IllegalStateException(C1154e9.i("Unable to lock file: '", str, "'."), th);
        }
    }

    public void i(int i, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            M4.b bVar = "clx".equals(bundle2.getString("_o")) ? (A6.b) this.f3143c : (M4.c) this.f3144d;
            if (bVar == null) {
                return;
            }
            bVar.onEvent(string, bundle2);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f3142b) {
            case 6:
                h(task);
                return;
            default:
                n nVar = (n) this.f3143c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f3144d;
                synchronized (nVar.f48123f) {
                    nVar.f48122e.remove(taskCompletionSource);
                }
                return;
        }
    }

    @Override // u4.InterfaceC5634c
    public Object zza() {
        return new i((Context) ((A3.c) ((I) this.f3143c).f2053c).f36c, (j) ((InterfaceC5634c) this.f3144d).zza());
    }

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.f3142b = i;
        this.f3143c = obj;
        this.f3144d = obj2;
    }

    public b(WorkDatabase_Impl workDatabase_Impl) {
        this.f3142b = 3;
        this.f3143c = workDatabase_Impl;
        this.f3144d = new C1822c(workDatabase_Impl, 0);
    }

    public b(String filename, int i) {
        this.f3142b = i;
        switch (i) {
            case 9:
                this.f3143c = (ExtraSupportedOutputSizeQuirk) C5787a.f47852a.e(ExtraSupportedOutputSizeQuirk.class);
                this.f3144d = new B7.e(filename, 12);
                break;
            default:
                l.f(filename, "filename");
                this.f3143c = filename.concat(".lck");
                break;
        }
    }

    public b(InterfaceC4392b interfaceC4392b) {
        this.f3142b = 4;
        this.f3144d = Collections.synchronizedMap(new HashMap());
        this.f3143c = interfaceC4392b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(p9.l compute) {
        this.f3142b = 1;
        l.f(compute, "compute");
        this.f3143c = (m) compute;
        this.f3144d = new ConcurrentHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(InterfaceC5480a interfaceC5480a) {
        this.f3142b = 2;
        this.f3143c = (m) interfaceC5480a;
    }
}
