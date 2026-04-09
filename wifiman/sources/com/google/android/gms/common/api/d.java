package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.AbstractC4285n;
import com.google.android.gms.common.api.internal.AbstractServiceConnectionC4281j;
import com.google.android.gms.common.api.internal.C4272a;
import com.google.android.gms.common.api.internal.C4273b;
import com.google.android.gms.common.api.internal.C4276e;
import com.google.android.gms.common.api.internal.C4296z;
import com.google.android.gms.common.api.internal.E;
import com.google.android.gms.common.api.internal.InterfaceC4284m;
import com.google.android.gms.common.api.internal.O;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import f.AbstractC5487d;
import java.util.Collections;
import s3.AbstractC7888c;
import s3.AbstractC7901p;
import s3.C7889d;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f34731a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34732b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.api.a f34733c;

    /* renamed from: d, reason: collision with root package name */
    private final a.d f34734d;

    /* renamed from: e, reason: collision with root package name */
    private final C4273b f34735e;

    /* renamed from: f, reason: collision with root package name */
    private final Looper f34736f;

    /* renamed from: g, reason: collision with root package name */
    private final int f34737g;

    /* renamed from: h, reason: collision with root package name */
    private final e f34738h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC4284m f34739i;

    /* renamed from: j, reason: collision with root package name */
    protected final C4276e f34740j;

    public static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f34741c = new C1200a().a();

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC4284m f34742a;

        /* renamed from: b, reason: collision with root package name */
        public final Looper f34743b;

        /* renamed from: com.google.android.gms.common.api.d$a$a, reason: collision with other inner class name */
        public static class C1200a {

            /* renamed from: a, reason: collision with root package name */
            private InterfaceC4284m f34744a;

            /* renamed from: b, reason: collision with root package name */
            private Looper f34745b;

            public a a() {
                if (this.f34744a == null) {
                    this.f34744a = new C4272a();
                }
                if (this.f34745b == null) {
                    this.f34745b = Looper.getMainLooper();
                }
                return new a(this.f34744a, this.f34745b);
            }
        }

        private a(InterfaceC4284m interfaceC4284m, Account account, Looper looper) {
            this.f34742a = interfaceC4284m;
            this.f34743b = looper;
        }
    }

    public d(Activity activity, com.google.android.gms.common.api.a aVar, a.d dVar, a aVar2) {
        this(activity, activity, aVar, dVar, aVar2);
    }

    private final Task o(int i10, AbstractC4285n abstractC4285n) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f34740j.z(this, i10, abstractC4285n, taskCompletionSource, this.f34739i);
        return taskCompletionSource.getTask();
    }

    protected C7889d.a e() {
        C7889d.a aVar = new C7889d.a();
        aVar.d(null);
        aVar.c(Collections.emptySet());
        aVar.e(this.f34731a.getClass().getName());
        aVar.b(this.f34731a.getPackageName());
        return aVar;
    }

    public Task f(AbstractC4285n abstractC4285n) {
        return o(2, abstractC4285n);
    }

    public Task g(AbstractC4285n abstractC4285n) {
        return o(0, abstractC4285n);
    }

    public Task h(AbstractC4285n abstractC4285n) {
        return o(1, abstractC4285n);
    }

    protected String i(Context context) {
        return null;
    }

    public final C4273b j() {
        return this.f34735e;
    }

    protected String k() {
        return this.f34732b;
    }

    public final int l() {
        return this.f34737g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f m(Looper looper, C4296z c4296z) {
        C7889d c7889dA = e().a();
        a.f fVarA = ((a.AbstractC1198a) AbstractC7901p.l(this.f34733c.a())).a(this.f34731a, looper, c7889dA, this.f34734d, c4296z, c4296z);
        String strK = k();
        if (strK != null && (fVarA instanceof AbstractC7888c)) {
            ((AbstractC7888c) fVarA).N(strK);
        }
        if (strK == null || !(fVarA instanceof AbstractServiceConnectionC4281j)) {
            return fVarA;
        }
        AbstractC5487d.a(fVarA);
        throw null;
    }

    public final O n(Context context, Handler handler) {
        return new O(context, handler, e().a());
    }

    private d(Context context, Activity activity, com.google.android.gms.common.api.a aVar, a.d dVar, a aVar2) {
        AbstractC7901p.m(context, "Null context is not permitted.");
        AbstractC7901p.m(aVar, "Api must not be null.");
        AbstractC7901p.m(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) AbstractC7901p.m(context.getApplicationContext(), "The provided context did not have an application context.");
        this.f34731a = context2;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : i(context);
        this.f34732b = attributionTag;
        this.f34733c = aVar;
        this.f34734d = dVar;
        this.f34736f = aVar2.f34743b;
        C4273b c4273bA = C4273b.a(aVar, dVar, attributionTag);
        this.f34735e = c4273bA;
        this.f34738h = new E(this);
        C4276e c4276eT = C4276e.t(context2);
        this.f34740j = c4276eT;
        this.f34737g = c4276eT.k();
        this.f34739i = aVar2.f34742a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            r.j(activity, c4276eT, c4273bA);
        }
        c4276eT.D(this);
    }

    public d(Context context, com.google.android.gms.common.api.a aVar, a.d dVar, a aVar2) {
        this(context, null, aVar, dVar, aVar2);
    }
}
