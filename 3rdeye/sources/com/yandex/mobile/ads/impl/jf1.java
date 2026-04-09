package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.vy1;

/* loaded from: classes3.dex */
public final class jf1 implements vy1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f29126a;

    /* renamed from: b, reason: collision with root package name */
    private final vy1 f29127b;

    /* renamed from: c, reason: collision with root package name */
    private final vy1 f29128c;

    public jf1(Context appContext, lb0 portraitSizeInfo, lb0 landscapeSizeInfo) {
        kotlin.jvm.internal.l.f(appContext, "appContext");
        kotlin.jvm.internal.l.f(portraitSizeInfo, "portraitSizeInfo");
        kotlin.jvm.internal.l.f(landscapeSizeInfo, "landscapeSizeInfo");
        this.f29126a = appContext;
        this.f29127b = portraitSizeInfo;
        this.f29128c = landscapeSizeInfo;
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    public final int a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return es.b(context) == ef1.f26821c ? this.f29128c.a(context) : this.f29127b.a(context);
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    public final int b(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return es.b(context) == ef1.f26821c ? this.f29128c.b(context) : this.f29127b.b(context);
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    public final int c(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return es.b(context) == ef1.f26821c ? this.f29128c.c(context) : this.f29127b.c(context);
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    public final int d(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        return es.b(context) == ef1.f26821c ? this.f29128c.d(context) : this.f29127b.d(context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf1)) {
            return false;
        }
        jf1 jf1Var = (jf1) obj;
        return kotlin.jvm.internal.l.b(this.f29126a, jf1Var.f29126a) && kotlin.jvm.internal.l.b(this.f29127b, jf1Var.f29127b) && kotlin.jvm.internal.l.b(this.f29128c, jf1Var.f29128c);
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    public final int getHeight() {
        return es.b(this.f29126a) == ef1.f26821c ? this.f29128c.getHeight() : this.f29127b.getHeight();
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    public final int getWidth() {
        return es.b(this.f29126a) == ef1.f26821c ? this.f29128c.getWidth() : this.f29127b.getWidth();
    }

    public final int hashCode() {
        return this.f29128c.hashCode() + ((this.f29127b.hashCode() + (this.f29126a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return es.b(this.f29126a) == ef1.f26821c ? this.f29128c.toString() : this.f29127b.toString();
    }

    @Override // com.yandex.mobile.ads.impl.vy1
    public final vy1.a a() {
        if (es.b(this.f29126a) == ef1.f26821c) {
            return this.f29128c.a();
        }
        return this.f29127b.a();
    }
}
