package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Intent;
import android.view.Window;
import android.widget.RelativeLayout;
import java.util.LinkedHashMap;

/* renamed from: com.yandex.mobile.ads.impl.k1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4140k1 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f29460b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    private static volatile C4140k1 f29461c;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f29462a;

    /* renamed from: com.yandex.mobile.ads.impl.k1$a */
    public static final class a {
        private a() {
        }

        public final C4140k1 a() {
            C4140k1 c4140k1;
            C4140k1 c4140k12 = C4140k1.f29461c;
            if (c4140k12 != null) {
                return c4140k12;
            }
            synchronized (this) {
                c4140k1 = C4140k1.f29461c;
                if (c4140k1 == null) {
                    c4140k1 = new C4140k1(0);
                    C4140k1.f29461c = c4140k1;
                }
            }
            return c4140k1;
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    private C4140k1() {
        this.f29462a = new LinkedHashMap();
        a("window_type_browser", new C4208u0());
        a("window_type_activity_result", new C4168o1());
    }

    public final synchronized InterfaceC4126i1 a(Activity activity, RelativeLayout rootLayout, C4188r1 listener, C4070a1 eventController, Intent intent, Window window, C4236y0 c4236y0) {
        InterfaceC4133j1 interfaceC4133j1;
        kotlin.jvm.internal.l.f(activity, "activity");
        kotlin.jvm.internal.l.f(rootLayout, "rootLayout");
        kotlin.jvm.internal.l.f(listener, "listener");
        kotlin.jvm.internal.l.f(eventController, "eventController");
        kotlin.jvm.internal.l.f(intent, "intent");
        kotlin.jvm.internal.l.f(window, "window");
        String stringExtra = intent.getStringExtra("window_type");
        if (stringExtra == null || (interfaceC4133j1 = (InterfaceC4133j1) this.f29462a.get(stringExtra)) == null) {
            return null;
        }
        return interfaceC4133j1.a(activity, rootLayout, listener, eventController, intent, window, c4236y0);
    }

    public final synchronized void a(String windowType, InterfaceC4133j1 creator) {
        kotlin.jvm.internal.l.f(windowType, "windowType");
        kotlin.jvm.internal.l.f(creator, "creator");
        if (!this.f29462a.containsKey(windowType)) {
            this.f29462a.put(windowType, creator);
        }
    }

    public /* synthetic */ C4140k1(int i) {
        this();
    }
}
