package com.yandex.mobile.ads.impl;

import H6.C0675l;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.yandex.mobile.ads.R;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class u20 implements xp {

    /* renamed from: a, reason: collision with root package name */
    private final h61 f33875a;

    /* renamed from: b, reason: collision with root package name */
    private final tr f33876b;

    /* renamed from: c, reason: collision with root package name */
    private final mp1 f33877c;

    /* renamed from: d, reason: collision with root package name */
    private final c30 f33878d;

    /* renamed from: e, reason: collision with root package name */
    private final i30 f33879e;

    /* renamed from: f, reason: collision with root package name */
    private Dialog f33880f;

    public u20(h61 nativeAdPrivate, tr contentCloseListener, mp1 reporter, c30 divKitDesignProvider, i30 divViewCreator) {
        kotlin.jvm.internal.l.f(nativeAdPrivate, "nativeAdPrivate");
        kotlin.jvm.internal.l.f(contentCloseListener, "contentCloseListener");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(divKitDesignProvider, "divKitDesignProvider");
        kotlin.jvm.internal.l.f(divViewCreator, "divViewCreator");
        this.f33875a = nativeAdPrivate;
        this.f33876b = contentCloseListener;
        this.f33877c = reporter;
        this.f33878d = divKitDesignProvider;
        this.f33879e = divViewCreator;
    }

    @Override // com.yandex.mobile.ads.impl.xp
    public final void a() {
        Dialog dialog = this.f33880f;
        if (dialog != null) {
            i10.a(dialog);
        }
    }

    @Override // com.yandex.mobile.ads.impl.xp
    public final void a(Context context) {
        w20 w20Var;
        Object next;
        kotlin.jvm.internal.l.f(context, "context");
        try {
            c30 c30Var = this.f33878d;
            h61 nativeAdPrivate = this.f33875a;
            c30Var.getClass();
            kotlin.jvm.internal.l.f(nativeAdPrivate, "nativeAdPrivate");
            List<w20> listC = nativeAdPrivate.c();
            if (listC != null) {
                Iterator<T> it = listC.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (kotlin.jvm.internal.l.b(((w20) next).e(), c10.f25494e.a())) {
                            break;
                        }
                    }
                }
                w20Var = (w20) next;
            } else {
                w20Var = null;
            }
            if (w20Var == null) {
                this.f33876b.f();
                return;
            }
            v20 v20Var = new v20(context, null);
            i30 i30Var = this.f33879e;
            j6.i iVarA = v20Var.a();
            kotlin.jvm.internal.l.e(iVarA, "<get-divConfiguration>(...)");
            i30Var.getClass();
            C0675l c0675lA = i30.a(context, iVarA, null);
            Dialog dialog = new Dialog(context, R.style.MonetizationAdsInternal_FullscreenDialog);
            dialog.setOnDismissListener(new N0(this, 1));
            c0675lA.setActionHandler(new wp(new vp(dialog, this.f33876b)));
            c0675lA.F(w20Var.b(), w20Var.c());
            dialog.setContentView(c0675lA);
            this.f33880f = dialog;
            dialog.show();
        } catch (Throwable th) {
            this.f33877c.reportError("Failed to show DivKit close dialog", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(u20 this$0, DialogInterface dialogInterface) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        this$0.f33880f = null;
    }
}
