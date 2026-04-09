package p7;

import android.os.Handler;
import android.os.Looper;
import b9.C1992A;
import java.util.Iterator;
import kotlin.jvm.internal.l;
import m0.C5308a;
import p7.C5472d;

/* compiled from: ViewPoolProfiler.kt */
/* renamed from: p7.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5476h {

    /* renamed from: a, reason: collision with root package name */
    public final b.a f45269a;

    /* renamed from: b, reason: collision with root package name */
    public final C5472d f45270b;

    /* renamed from: c, reason: collision with root package name */
    public final a f45271c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f45272d;

    /* compiled from: ViewPoolProfiler.kt */
    /* renamed from: p7.h$a */
    public final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public boolean f45273b;

        public a() {
        }

        public final void a(Handler handler) {
            l.f(handler, "handler");
            if (this.f45273b) {
                return;
            }
            handler.post(this);
            this.f45273b = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            C5308a.d dVar;
            C5476h c5476h = C5476h.this;
            synchronized (c5476h.f45270b) {
                try {
                    C5472d c5472d = c5476h.f45270b;
                    if (c5472d.f45257b.f45260b <= 0) {
                        Iterator it = ((C5308a.C0496a) c5472d.f45258c.entrySet()).iterator();
                        do {
                            dVar = (C5308a.d) it;
                            if (!dVar.hasNext()) {
                                break;
                            } else {
                                dVar.next();
                            }
                        } while (((C5472d.a) dVar.getValue()).f45260b <= 0);
                    }
                    c5476h.f45270b.a();
                    c5476h.f45269a.getClass();
                    C5472d c5472d2 = c5476h.f45270b;
                    C5472d.a aVar = c5472d2.f45256a;
                    aVar.f45259a = 0L;
                    aVar.f45260b = 0;
                    C5472d.a aVar2 = c5472d2.f45257b;
                    aVar2.f45259a = 0L;
                    aVar2.f45260b = 0;
                    Iterator it2 = ((C5308a.C0496a) c5472d2.f45258c.entrySet()).iterator();
                    while (true) {
                        C5308a.d dVar2 = (C5308a.d) it2;
                        if (dVar2.hasNext()) {
                            dVar2.next();
                            C5472d.a aVar3 = (C5472d.a) dVar2.getValue();
                            aVar3.f45259a = 0L;
                            aVar3.f45260b = 0;
                        } else {
                            C1992A c1992a = C1992A.f18074a;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f45273b = false;
        }
    }

    /* compiled from: ViewPoolProfiler.kt */
    /* renamed from: p7.h$b */
    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f45275a = new a();

        /* compiled from: ViewPoolProfiler.kt */
        /* renamed from: p7.h$b$a */
        public static final class a implements b {
        }
    }

    public C5476h(b.a reporter) {
        l.f(reporter, "reporter");
        this.f45269a = reporter;
        this.f45270b = new C5472d();
        this.f45271c = new a();
        this.f45272d = new Handler(Looper.getMainLooper());
    }

    public final void a(long j4) {
        synchronized (this.f45270b) {
            C5472d.a aVar = this.f45270b.f45256a;
            aVar.f45259a += j4;
            aVar.f45260b++;
            this.f45271c.a(this.f45272d);
            C1992A c1992a = C1992A.f18074a;
        }
    }
}
