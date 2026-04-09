package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.gu0;

/* loaded from: classes3.dex */
public final class jb implements gu0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f29042a;

    /* renamed from: b, reason: collision with root package name */
    private final g10 f29043b;

    /* renamed from: c, reason: collision with root package name */
    private final j10 f29044c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f29045d;

    public /* synthetic */ jb(Context context, boolean z10, int i) {
        this(context, (i & 2) != 0 ? false : z10, new g10(), new j10());
    }

    @Override // com.yandex.mobile.ads.impl.gu0
    public final gu0.a a(int i, int i10) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode != 0) {
            Context context = this.f29045d;
            kotlin.jvm.internal.l.e(context, "context");
            int i11 = jh2.f29145b;
            int iMin = context.getResources().getDisplayMetrics().widthPixels;
            j10 j10Var = this.f29044c;
            Context context2 = this.f29045d;
            kotlin.jvm.internal.l.e(context2, "context");
            j10Var.getClass();
            int iA = j10.a(context2, 420.0f);
            int i12 = this.f29045d.getResources().getConfiguration().orientation;
            g10 g10Var = this.f29043b;
            Context context3 = this.f29045d;
            kotlin.jvm.internal.l.e(context3, "context");
            if (g10Var.a(context3) != f10.f27166b || i12 != 1) {
                iMin = (int) Math.min(iMin, iA);
            }
            i = View.MeasureSpec.makeMeasureSpec((int) Math.min(iMin, size), 1073741824);
        }
        if (mode2 != 0) {
            boolean z10 = this.f29042a;
            Context context4 = this.f29045d;
            kotlin.jvm.internal.l.e(context4, "context");
            int iC = jh2.c(context4);
            j10 j10Var2 = this.f29044c;
            Context context5 = this.f29045d;
            kotlin.jvm.internal.l.e(context5, "context");
            j10Var2.getClass();
            int iA2 = j10.a(context5, 350.0f);
            if (!z10) {
                iC = (int) Math.min(iC, iA2);
            }
            i10 = View.MeasureSpec.makeMeasureSpec((int) Math.min(iC, size2), 1073741824);
        }
        gu0.a aVar = new gu0.a();
        aVar.f27986b = i10;
        aVar.f27985a = i;
        return aVar;
    }

    public jb(Context context, boolean z10, g10 deviceTypeProvider, j10 dimensionConverter) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(deviceTypeProvider, "deviceTypeProvider");
        kotlin.jvm.internal.l.f(dimensionConverter, "dimensionConverter");
        this.f29042a = z10;
        this.f29043b = deviceTypeProvider;
        this.f29044c = dimensionConverter;
        this.f29045d = context.getApplicationContext();
    }
}
