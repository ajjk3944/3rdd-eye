package com.yandex.mobile.ads.impl;

import android.app.Activity;
import b9.C1992A;
import c9.C2095p;
import c9.C2097r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.yandex.mobile.ads.impl.o0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4167o0 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f31113a;

    /* renamed from: com.yandex.mobile.ads.impl.o0$a */
    public static final class a extends kotlin.jvm.internal.m implements p9.l<WeakReference<Activity>, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f31114b = new a();

        public a() {
            super(1);
        }

        @Override // p9.l
        public final Boolean invoke(WeakReference<Activity> weakReference) {
            WeakReference<Activity> it = weakReference;
            kotlin.jvm.internal.l.f(it, "it");
            Activity activity = it.get();
            return Boolean.valueOf(activity == null || activity.isFinishing() || activity.isDestroyed());
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.o0$b */
    public static final class b extends kotlin.jvm.internal.m implements p9.l<WeakReference<Activity>, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f31115b = new b();

        public b() {
            super(1);
        }

        @Override // p9.l
        public final Boolean invoke(WeakReference<Activity> weakReference) {
            WeakReference<Activity> it = weakReference;
            kotlin.jvm.internal.l.f(it, "it");
            Activity activity = it.get();
            return Boolean.valueOf(activity == null || activity.isFinishing() || activity.isDestroyed());
        }
    }

    public C4167o0(Activity activity) {
        ArrayList arrayList = new ArrayList();
        this.f31113a = arrayList;
        if (activity != null) {
            arrayList.add(new WeakReference(activity));
        }
    }

    public final void a(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        synchronized (this) {
            try {
                ArrayList arrayList = this.f31113a;
                if (!(arrayList != null) || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (kotlin.jvm.internal.l.b(((WeakReference) it.next()).get(), activity)) {
                            break;
                        }
                    }
                }
                this.f31113a.add(new WeakReference(activity));
                activity.toString();
                fp0.a(new Object[0]);
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Activity b() {
        Activity activity;
        synchronized (this) {
            C2095p.f0(this.f31113a, b.f31115b);
            WeakReference weakReference = (WeakReference) C2097r.w0(this.f31113a);
            activity = weakReference != null ? (Activity) weakReference.get() : null;
        }
        return activity;
    }

    public final void b(Activity activity) {
        Object next;
        kotlin.jvm.internal.l.f(activity, "activity");
        synchronized (this) {
            try {
                Iterator it = this.f31113a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (kotlin.jvm.internal.l.b(((WeakReference) next).get(), activity)) {
                            break;
                        }
                    }
                }
                WeakReference weakReference = (WeakReference) next;
                if (weakReference != null) {
                    this.f31113a.remove(weakReference);
                    activity.toString();
                    fp0.a(new Object[0]);
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Activity a() {
        Activity activity;
        synchronized (this) {
            C2095p.f0(this.f31113a, a.f31114b);
            WeakReference weakReference = (WeakReference) C2097r.q0(this.f31113a);
            activity = weakReference != null ? (Activity) weakReference.get() : null;
        }
        return activity;
    }
}
