package H6;

import H6.C0682t;
import K6.C0747o;
import L0.C0770a;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import b9.C1992A;

/* compiled from: AccessibilityDelegateWrapper.kt */
/* renamed from: H6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0666c extends C0770a {

    /* renamed from: d, reason: collision with root package name */
    public final C0770a f2129d;

    /* renamed from: e, reason: collision with root package name */
    public p9.p<? super View, ? super M0.g, C1992A> f2130e;

    /* renamed from: f, reason: collision with root package name */
    public p9.p<? super View, ? super M0.g, C1992A> f2131f;

    public C0666c() {
        throw null;
    }

    public C0666c(C0770a c0770a, C0682t.d dVar, C0747o c0747o, int i) {
        p9.p initializeAccessibilityNodeInfo = dVar;
        initializeAccessibilityNodeInfo = (i & 2) != 0 ? C0664a.f2127g : initializeAccessibilityNodeInfo;
        p9.p actionsAccessibilityNodeInfo = c0747o;
        actionsAccessibilityNodeInfo = (i & 4) != 0 ? C0665b.f2128g : actionsAccessibilityNodeInfo;
        kotlin.jvm.internal.l.f(initializeAccessibilityNodeInfo, "initializeAccessibilityNodeInfo");
        kotlin.jvm.internal.l.f(actionsAccessibilityNodeInfo, "actionsAccessibilityNodeInfo");
        this.f2129d = c0770a;
        this.f2130e = initializeAccessibilityNodeInfo;
        this.f2131f = actionsAccessibilityNodeInfo;
    }

    @Override // L0.C0770a
    public final boolean a(View host, AccessibilityEvent event) {
        kotlin.jvm.internal.l.f(host, "host");
        kotlin.jvm.internal.l.f(event, "event");
        C0770a c0770a = this.f2129d;
        return c0770a != null ? c0770a.a(host, event) : this.f3883a.dispatchPopulateAccessibilityEvent(host, event);
    }

    @Override // L0.C0770a
    public final M0.h b(View host) {
        M0.h hVarB;
        kotlin.jvm.internal.l.f(host, "host");
        C0770a c0770a = this.f2129d;
        return (c0770a == null || (hVarB = c0770a.b(host)) == null) ? super.b(host) : hVarB;
    }

    @Override // L0.C0770a
    public final void c(View host, AccessibilityEvent event) {
        C1992A c1992a;
        kotlin.jvm.internal.l.f(host, "host");
        kotlin.jvm.internal.l.f(event, "event");
        C0770a c0770a = this.f2129d;
        if (c0770a != null) {
            c0770a.c(host, event);
            c1992a = C1992A.f18074a;
        } else {
            c1992a = null;
        }
        if (c1992a == null) {
            super.c(host, event);
        }
    }

    @Override // L0.C0770a
    public final void d(View host, M0.g gVar) {
        C1992A c1992a;
        kotlin.jvm.internal.l.f(host, "host");
        C0770a c0770a = this.f2129d;
        if (c0770a != null) {
            c0770a.d(host, gVar);
            c1992a = C1992A.f18074a;
        } else {
            c1992a = null;
        }
        if (c1992a == null) {
            this.f3883a.onInitializeAccessibilityNodeInfo(host, gVar.f4122a);
        }
        this.f2130e.invoke(host, gVar);
        this.f2131f.invoke(host, gVar);
    }

    @Override // L0.C0770a
    public final void e(View host, AccessibilityEvent event) {
        C1992A c1992a;
        kotlin.jvm.internal.l.f(host, "host");
        kotlin.jvm.internal.l.f(event, "event");
        C0770a c0770a = this.f2129d;
        if (c0770a != null) {
            c0770a.e(host, event);
            c1992a = C1992A.f18074a;
        } else {
            c1992a = null;
        }
        if (c1992a == null) {
            super.e(host, event);
        }
    }

    @Override // L0.C0770a
    public final boolean f(ViewGroup host, View child, AccessibilityEvent event) {
        kotlin.jvm.internal.l.f(host, "host");
        kotlin.jvm.internal.l.f(child, "child");
        kotlin.jvm.internal.l.f(event, "event");
        C0770a c0770a = this.f2129d;
        return c0770a != null ? c0770a.f(host, child, event) : this.f3883a.onRequestSendAccessibilityEvent(host, child, event);
    }

    @Override // L0.C0770a
    public final boolean g(View host, int i, Bundle bundle) {
        kotlin.jvm.internal.l.f(host, "host");
        C0770a c0770a = this.f2129d;
        return c0770a != null ? c0770a.g(host, i, bundle) : super.g(host, i, bundle);
    }

    @Override // L0.C0770a
    public final void h(View host, int i) {
        C1992A c1992a;
        kotlin.jvm.internal.l.f(host, "host");
        C0770a c0770a = this.f2129d;
        if (c0770a != null) {
            c0770a.h(host, i);
            c1992a = C1992A.f18074a;
        } else {
            c1992a = null;
        }
        if (c1992a == null) {
            super.h(host, i);
        }
    }

    @Override // L0.C0770a
    public final void i(View host, AccessibilityEvent event) {
        C1992A c1992a;
        kotlin.jvm.internal.l.f(host, "host");
        kotlin.jvm.internal.l.f(event, "event");
        C0770a c0770a = this.f2129d;
        if (c0770a != null) {
            c0770a.i(host, event);
            c1992a = C1992A.f18074a;
        } else {
            c1992a = null;
        }
        if (c1992a == null) {
            super.i(host, event);
        }
    }
}
