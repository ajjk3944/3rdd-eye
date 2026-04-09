package androidx.work.multiprocess;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import androidx.work.m;
import androidx.work.multiprocess.a;
import d2.C4268c;
import g2.InterfaceC4379c;
import java.util.concurrent.Executor;

/* compiled from: ListenableWorkerImplClient.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final String f16998e = m.g("ListenableWorkerImplClient");

    /* renamed from: a, reason: collision with root package name */
    public final Context f16999a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f17000b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17001c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public a f17002d;

    /* compiled from: ListenableWorkerImplClient.java */
    public static class a implements ServiceConnection {

        /* renamed from: b, reason: collision with root package name */
        public static final String f17003b = m.g("ListenableWorkerImplSession");

        /* renamed from: a, reason: collision with root package name */
        public final C4268c<androidx.work.multiprocess.a> f17004a = new C4268c<>();

        @Override // android.content.ServiceConnection
        public final void onBindingDied(ComponentName componentName) {
            m.e().h(f17003b, "Binding died");
            this.f17004a.j(new RuntimeException("Binding died"));
        }

        @Override // android.content.ServiceConnection
        public final void onNullBinding(ComponentName componentName) {
            m.e().c(f17003b, "Unable to bind to service");
            this.f17004a.j(new RuntimeException("Cannot bind to service " + componentName));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v6, types: [androidx.work.multiprocess.a] */
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            a.AbstractBinderC0268a.C0269a c0269a;
            m.e().a(f17003b, "Service connected");
            int i = a.AbstractBinderC0268a.f16980b;
            if (iBinder == null) {
                c0269a = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(androidx.work.multiprocess.a.f16979g8);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof androidx.work.multiprocess.a)) {
                    a.AbstractBinderC0268a.C0269a c0269a2 = new a.AbstractBinderC0268a.C0269a();
                    c0269a2.f16981b = iBinder;
                    c0269a = c0269a2;
                } else {
                    c0269a = (androidx.work.multiprocess.a) iInterfaceQueryLocalInterface;
                }
            }
            this.f17004a.i(c0269a);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            m.e().h(f17003b, "Service disconnected");
            this.f17004a.j(new RuntimeException("Service disconnected"));
        }
    }

    public f(Context context, Executor executor) {
        this.f16999a = context;
        this.f17000b = executor;
    }

    public final C4268c a(ComponentName componentName, InterfaceC4379c interfaceC4379c) {
        C4268c<androidx.work.multiprocess.a> c4268c;
        synchronized (this.f17001c) {
            try {
                if (this.f17002d == null) {
                    m mVarE = m.e();
                    String str = f16998e;
                    mVarE.a(str, "Binding to " + componentName.getPackageName() + ", " + componentName.getClassName());
                    this.f17002d = new a();
                    try {
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        if (!this.f16999a.bindService(intent, this.f17002d, 1)) {
                            a aVar = this.f17002d;
                            RuntimeException runtimeException = new RuntimeException("Unable to bind to service");
                            m.e().d(str, "Unable to bind to service", runtimeException);
                            aVar.f17004a.j(runtimeException);
                        }
                    } catch (Throwable th) {
                        a aVar2 = this.f17002d;
                        m.e().d(f16998e, "Unable to bind to service", th);
                        aVar2.f17004a.j(th);
                    }
                }
                c4268c = this.f17002d.f17004a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g gVar = new g();
        c4268c.addListener(new e(this, c4268c, gVar, interfaceC4379c), this.f17000b);
        return gVar.f17005b;
    }
}
