package com.google.android.gms.internal.ads;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import r.AbstractC2863f;
import r.AbstractC2864g;
import r.AbstractC2865h;
import r.BinderC2862e;
import r.C2866i;

/* renamed from: com.google.android.gms.internal.ads.Zq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0855Zq {

    /* renamed from: f, reason: collision with root package name */
    public static C0855Zq f12971f;

    /* renamed from: a, reason: collision with root package name */
    public int f12972a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12973b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12974c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f12975d;

    /* renamed from: e, reason: collision with root package name */
    public Object f12976e;

    public C0855Zq(Context context) {
        Executor executorE = AbstractC1114el.e();
        this.f12974c = executorE;
        this.f12975d = new CopyOnWriteArrayList();
        this.f12976e = new Object();
        this.f12972a = 0;
        executorE.execute(new RunnableC0786Vp(this, 3, context));
    }

    public static synchronized C0855Zq b(Context context) {
        try {
            if (f12971f == null) {
                f12971f = new C0855Zq(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f12971f;
    }

    public C2866i a() {
        Intent intent = (Intent) this.f12974c;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f12973b);
        ((p1.e) this.f12975d).getClass();
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f12972a);
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            String strA = AbstractC2864g.a();
            if (!TextUtils.isEmpty(strA)) {
                Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
                if (!bundleExtra.containsKey("Accept-Language")) {
                    bundleExtra.putString("Accept-Language", strA);
                    intent.putExtra("com.android.browser.headers", bundleExtra);
                }
            }
        }
        if (i >= 34) {
            if (((ActivityOptions) this.f12976e) == null) {
                this.f12976e = AbstractC2863f.a();
            }
            AbstractC2865h.a((ActivityOptions) this.f12976e, false);
        }
        ActivityOptions activityOptions = (ActivityOptions) this.f12976e;
        return new C2866i(intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    public int c() {
        int i;
        synchronized (this.f12976e) {
            i = this.f12972a;
        }
        return i;
    }

    public void d(int i) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f12975d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C1766qq c1766qq = (C1766qq) it.next();
            if (c1766qq.f16403a.get() == null) {
                copyOnWriteArrayList.remove(c1766qq);
            }
        }
        synchronized (this.f12976e) {
            try {
                if (this.f12973b && this.f12972a == i) {
                    return;
                }
                this.f12973b = true;
                this.f12972a = i;
                Iterator it2 = ((CopyOnWriteArrayList) this.f12975d).iterator();
                while (it2.hasNext()) {
                    C1766qq c1766qq2 = (C1766qq) it2.next();
                    c1766qq2.getClass();
                    c1766qq2.f16404b.execute(new RunnableC0558Ii(18, c1766qq2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C0855Zq() {
        this.f12974c = new Intent("android.intent.action.VIEW");
        this.f12975d = new p1.e(3);
        this.f12972a = 0;
        this.f12973b = true;
    }

    public C0855Zq(c1.g gVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f12974c = intent;
        this.f12975d = new p1.e(3);
        this.f12972a = 0;
        this.f12973b = true;
        if (gVar != null) {
            intent.setPackage(((ComponentName) gVar.f5899e).getPackageName());
            BinderC2862e binderC2862e = (BinderC2862e) gVar.f5898d;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", binderC2862e);
            intent.putExtras(bundle);
        }
    }
}
