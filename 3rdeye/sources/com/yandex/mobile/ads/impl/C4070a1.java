package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.yandex.mobile.ads.impl.a1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4070a1 {

    /* renamed from: a, reason: collision with root package name */
    private final Set<InterfaceC4119h1> f24360a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<InterfaceC4077b1> f24361b;

    /* renamed from: c, reason: collision with root package name */
    private int f24362c;

    public C4070a1(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f24360a = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f24361b = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f24362c = a(context);
    }

    public final void a(InterfaceC4077b1 focusListener) {
        kotlin.jvm.internal.l.f(focusListener, "focusListener");
        this.f24361b.add(focusListener);
    }

    public final void b() {
        Iterator<InterfaceC4077b1> it = this.f24361b.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private static int a(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    public final void b(InterfaceC4077b1 focusListener) {
        kotlin.jvm.internal.l.f(focusListener, "focusListener");
        this.f24361b.remove(focusListener);
    }

    public final void a(Configuration config) {
        kotlin.jvm.internal.l.f(config, "config");
        int i = config.orientation;
        if (i != this.f24362c) {
            Iterator<InterfaceC4119h1> it = this.f24360a.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.f24362c = i;
        }
    }

    public final void a() {
        Iterator<InterfaceC4077b1> it = this.f24361b.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }
}
