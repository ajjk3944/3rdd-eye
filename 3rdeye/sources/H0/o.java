package H0;

import android.os.Handler;

/* compiled from: RequestExecutor.java */
/* loaded from: classes.dex */
public final class o<T> implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public i f2012b;

    /* renamed from: c, reason: collision with root package name */
    public j f2013c;

    /* renamed from: d, reason: collision with root package name */
    public Handler f2014d;

    /* compiled from: RequestExecutor.java */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f2015b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f2016c;

        public a(j jVar, Object obj) {
            this.f2015b = jVar;
            this.f2016c = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.f2015b.accept(this.f2016c);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        try {
            objCall = this.f2012b.call();
        } catch (Exception unused) {
            objCall = null;
        }
        this.f2014d.post(new a(this.f2013c, objCall));
    }
}
