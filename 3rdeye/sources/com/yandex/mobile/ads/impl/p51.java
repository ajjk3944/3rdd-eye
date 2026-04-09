package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import b9.C1992A;

/* loaded from: classes3.dex */
public final class p51 {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f31595c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static volatile p51 f31596d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f31597e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f31598a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f31599b;

    public static final class a {
        public static p51 a() {
            if (p51.f31596d == null) {
                synchronized (p51.f31595c) {
                    try {
                        if (p51.f31596d == null) {
                            p51.f31596d = new p51();
                        }
                        C1992A c1992a = C1992A.f18074a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            p51 p51Var = p51.f31596d;
            if (p51Var != null) {
                return p51Var;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public /* synthetic */ p51() {
        this(new Handler(Looper.getMainLooper()));
    }

    private final void a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (!this.f31599b) {
                view.setAlpha(view.getAlpha() / 2);
                this.f31599b = true;
            }
            this.f31598a.postDelayed(new V1(13, this, view), 100L);
        }
    }

    public final void b(View view, MotionEvent motionEvent) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(motionEvent, "motionEvent");
        if ((view instanceof TextView) || (view instanceof gn1)) {
            a(view, motionEvent);
        }
    }

    private p51(Handler handler) {
        this.f31598a = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(p51 this$0, View view) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(view, "$view");
        if (this$0.f31599b) {
            view.setAlpha(view.getAlpha() * 2);
            this$0.f31599b = false;
        }
    }
}
