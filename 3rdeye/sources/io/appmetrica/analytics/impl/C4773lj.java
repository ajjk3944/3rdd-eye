package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.lang.ref.WeakReference;

/* renamed from: io.appmetrica.analytics.impl.lj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4773lj implements InterfaceC4727k {

    /* renamed from: a, reason: collision with root package name */
    public C4666hf f41207a;

    /* renamed from: b, reason: collision with root package name */
    public ScreenInfo f41208b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f41209c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f41210d;

    /* renamed from: e, reason: collision with root package name */
    public final C4747kj f41211e = new C4747kj();

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f41212f = new WeakReference(null);

    public final synchronized void a(Activity activity) {
        try {
            this.f41212f = new WeakReference(activity);
            if (!this.f41210d) {
                if (this.f41207a == null) {
                    this.f41207a = new C4666hf(C4916r7.a(activity).a());
                }
                C4666hf c4666hf = this.f41207a;
                kotlin.jvm.internal.l.c(c4666hf);
                this.f41208b = c4666hf.p();
                if (this.f41207a == null) {
                    this.f41207a = new C4666hf(C4916r7.a(activity).a());
                }
                C4666hf c4666hf2 = this.f41207a;
                kotlin.jvm.internal.l.c(c4666hf2);
                this.f41209c = c4666hf2.t();
                this.f41210d = true;
            }
            if (this.f41208b == null) {
                b(activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(Context context) {
        if (context != null) {
            this.f41211e.getClass();
            ScreenInfo screenInfoA = C4747kj.a(context);
            if (screenInfoA == null || screenInfoA.equals(this.f41208b)) {
                return;
            }
            this.f41208b = screenInfoA;
            if (this.f41207a == null) {
                this.f41207a = new C4666hf(C4916r7.a(context).a());
            }
            C4666hf c4666hf = this.f41207a;
            kotlin.jvm.internal.l.c(c4666hf);
            c4666hf.a(this.f41208b);
        }
    }

    public final synchronized ScreenInfo a(Context context) {
        try {
            if (!this.f41210d) {
                if (this.f41207a == null) {
                    this.f41207a = new C4666hf(C4916r7.a(context).a());
                }
                C4666hf c4666hf = this.f41207a;
                kotlin.jvm.internal.l.c(c4666hf);
                this.f41208b = c4666hf.p();
                if (this.f41207a == null) {
                    this.f41207a = new C4666hf(C4916r7.a(context).a());
                }
                C4666hf c4666hf2 = this.f41207a;
                kotlin.jvm.internal.l.c(c4666hf2);
                this.f41209c = c4666hf2.t();
                this.f41210d = true;
            }
            b((Context) this.f41212f.get());
            if (this.f41208b == null) {
                if (AndroidUtils.isApiAchieved(30)) {
                    if (!this.f41209c) {
                        b(context);
                        this.f41209c = true;
                        if (this.f41207a == null) {
                            this.f41207a = new C4666hf(C4916r7.a(context).a());
                        }
                        C4666hf c4666hf3 = this.f41207a;
                        kotlin.jvm.internal.l.c(c4666hf3);
                        c4666hf3.v();
                    }
                } else {
                    b(context);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f41208b;
    }

    public final void a(C4666hf c4666hf) {
        this.f41207a = c4666hf;
    }
}
