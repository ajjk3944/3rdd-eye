package com.google.firebase.installations;

import F4.t;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallationsException;
import f.AbstractC5487d;
import f5.InterfaceC5536b;
import h5.AbstractC5952d;
import h5.C5950b;
import h5.C5951c;
import i5.d;
import i5.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import s3.AbstractC7901p;

/* loaded from: classes3.dex */
public class c implements g5.e {

    /* renamed from: m, reason: collision with root package name */
    private static final Object f38883m = new Object();

    /* renamed from: n, reason: collision with root package name */
    private static final ThreadFactory f38884n = new a();

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.f f38885a;

    /* renamed from: b, reason: collision with root package name */
    private final i5.c f38886b;

    /* renamed from: c, reason: collision with root package name */
    private final C5951c f38887c;

    /* renamed from: d, reason: collision with root package name */
    private final h f38888d;

    /* renamed from: e, reason: collision with root package name */
    private final t f38889e;

    /* renamed from: f, reason: collision with root package name */
    private final g5.g f38890f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f38891g;

    /* renamed from: h, reason: collision with root package name */
    private final ExecutorService f38892h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f38893i;

    /* renamed from: j, reason: collision with root package name */
    private String f38894j;

    /* renamed from: k, reason: collision with root package name */
    private Set f38895k;

    /* renamed from: l, reason: collision with root package name */
    private final List f38896l;

    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f38897a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f38897a.getAndIncrement())));
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38898a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f38899b;

        static {
            int[] iArr = new int[f.b.values().length];
            f38899b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38899b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38899b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f38898a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38898a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    c(final com.google.firebase.f fVar, InterfaceC5536b interfaceC5536b, ExecutorService executorService, Executor executor) {
        this(executorService, executor, fVar, new i5.c(fVar.k(), interfaceC5536b), new C5951c(fVar), h.c(), new t(new InterfaceC5536b() { // from class: g5.a
            @Override // f5.InterfaceC5536b
            public final Object get() {
                return com.google.firebase.installations.c.y(fVar);
            }
        }), new g5.g());
    }

    private String A(AbstractC5952d abstractC5952d) {
        if ((!this.f38885a.m().equals("CHIME_ANDROID_SDK") && !this.f38885a.u()) || !abstractC5952d.m()) {
            return this.f38890f.a();
        }
        String strF = o().f();
        return TextUtils.isEmpty(strF) ? this.f38890f.a() : strF;
    }

    private AbstractC5952d B(AbstractC5952d abstractC5952d) throws FirebaseInstallationsException {
        i5.d dVarD = this.f38886b.d(l(), abstractC5952d.d(), t(), m(), (abstractC5952d.d() == null || abstractC5952d.d().length() != 11) ? null : o().i());
        int i10 = b.f38898a[dVarD.e().ordinal()];
        if (i10 == 1) {
            return abstractC5952d.s(dVarD.c(), dVarD.d(), this.f38888d.b(), dVarD.b().c(), dVarD.b().d());
        }
        if (i10 == 2) {
            return abstractC5952d.q("BAD CONFIG");
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
    }

    private void C(Exception exc) {
        synchronized (this.f38891g) {
            try {
                Iterator it = this.f38896l.iterator();
                while (it.hasNext()) {
                    if (((g) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void D(AbstractC5952d abstractC5952d) {
        synchronized (this.f38891g) {
            try {
                Iterator it = this.f38896l.iterator();
                while (it.hasNext()) {
                    if (((g) it.next()).a(abstractC5952d)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private synchronized void E(String str) {
        this.f38894j = str;
    }

    private synchronized void F(AbstractC5952d abstractC5952d, AbstractC5952d abstractC5952d2) {
        if (this.f38895k.size() != 0 && !TextUtils.equals(abstractC5952d.d(), abstractC5952d2.d())) {
            Iterator it = this.f38895k.iterator();
            if (it.hasNext()) {
                AbstractC5487d.a(it.next());
                abstractC5952d2.d();
                throw null;
            }
        }
    }

    private Task f() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h(new d(this.f38888d, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task g() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h(new e(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void h(g gVar) {
        synchronized (this.f38891g) {
            this.f38896l.add(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void v(boolean z10) {
        AbstractC5952d abstractC5952dB;
        AbstractC5952d abstractC5952dR = r();
        try {
            if (abstractC5952dR.i() || abstractC5952dR.l()) {
                abstractC5952dB = B(abstractC5952dR);
            } else {
                if (!z10 && !this.f38888d.f(abstractC5952dR)) {
                    return;
                }
                abstractC5952dB = k(abstractC5952dR);
            }
            u(abstractC5952dB);
            F(abstractC5952dR, abstractC5952dB);
            if (abstractC5952dB.k()) {
                E(abstractC5952dB.d());
            }
            if (abstractC5952dB.i()) {
                C(new FirebaseInstallationsException(FirebaseInstallationsException.a.BAD_CONFIG));
            } else if (abstractC5952dB.j()) {
                C(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                D(abstractC5952dB);
            }
        } catch (FirebaseInstallationsException e10) {
            C(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void x(final boolean z10) {
        AbstractC5952d abstractC5952dS = s();
        if (z10) {
            abstractC5952dS = abstractC5952dS.p();
        }
        D(abstractC5952dS);
        this.f38893i.execute(new Runnable() { // from class: g5.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f47715a.v(z10);
            }
        });
    }

    private AbstractC5952d k(AbstractC5952d abstractC5952d) throws FirebaseInstallationsException {
        i5.f fVarE = this.f38886b.e(l(), abstractC5952d.d(), t(), abstractC5952d.f());
        int i10 = b.f38899b[fVarE.b().ordinal()];
        if (i10 == 1) {
            return abstractC5952d.o(fVarE.c(), fVarE.d(), this.f38888d.b());
        }
        if (i10 == 2) {
            return abstractC5952d.q("BAD CONFIG");
        }
        if (i10 != 3) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
        }
        E(null);
        return abstractC5952d.r();
    }

    private synchronized String n() {
        return this.f38894j;
    }

    private C5950b o() {
        return (C5950b) this.f38889e.get();
    }

    public static c p() {
        return q(com.google.firebase.f.l());
    }

    public static c q(com.google.firebase.f fVar) {
        AbstractC7901p.b(fVar != null, "Null is not a valid value of FirebaseApp.");
        return (c) fVar.j(g5.e.class);
    }

    /* JADX WARN: Finally extract failed */
    private AbstractC5952d r() {
        AbstractC5952d abstractC5952dD;
        synchronized (f38883m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f38885a.k(), "generatefid.lock");
                try {
                    abstractC5952dD = this.f38887c.d();
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th2) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return abstractC5952dD;
    }

    /* JADX WARN: Finally extract failed */
    private AbstractC5952d s() {
        AbstractC5952d abstractC5952dD;
        synchronized (f38883m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f38885a.k(), "generatefid.lock");
                try {
                    abstractC5952dD = this.f38887c.d();
                    if (abstractC5952dD.j()) {
                        abstractC5952dD = this.f38887c.b(abstractC5952dD.t(A(abstractC5952dD)));
                    }
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th2) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return abstractC5952dD;
    }

    /* JADX WARN: Finally extract failed */
    private void u(AbstractC5952d abstractC5952d) {
        synchronized (f38883m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f38885a.k(), "generatefid.lock");
                try {
                    this.f38887c.b(abstractC5952d);
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th2) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        x(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C5950b y(com.google.firebase.f fVar) {
        return new C5950b(fVar);
    }

    private void z() {
        AbstractC7901p.g(m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC7901p.g(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC7901p.g(l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC7901p.b(h.h(m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        AbstractC7901p.b(h.g(l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Override // g5.e
    public Task a(final boolean z10) {
        z();
        Task taskF = f();
        this.f38892h.execute(new Runnable() { // from class: g5.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f47713a.x(z10);
            }
        });
        return taskF;
    }

    @Override // g5.e
    public Task getId() {
        z();
        String strN = n();
        if (strN != null) {
            return Tasks.forResult(strN);
        }
        Task taskG = g();
        this.f38892h.execute(new Runnable() { // from class: g5.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f47712a.w();
            }
        });
        return taskG;
    }

    String l() {
        return this.f38885a.n().b();
    }

    String m() {
        return this.f38885a.n().c();
    }

    String t() {
        return this.f38885a.n().e();
    }

    c(ExecutorService executorService, Executor executor, com.google.firebase.f fVar, i5.c cVar, C5951c c5951c, h hVar, t tVar, g5.g gVar) {
        this.f38891g = new Object();
        this.f38895k = new HashSet();
        this.f38896l = new ArrayList();
        this.f38885a = fVar;
        this.f38886b = cVar;
        this.f38887c = c5951c;
        this.f38888d = hVar;
        this.f38889e = tVar;
        this.f38890f = gVar;
        this.f38892h = executorService;
        this.f38893i = executor;
    }
}
