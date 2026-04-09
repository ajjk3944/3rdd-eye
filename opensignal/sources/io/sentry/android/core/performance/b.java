package io.sentry.android.core.performance;

import android.os.Looper;
import io.sentry.i1;
import io.sentry.k4;
import io.sentry.p1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f11717a;

    /* renamed from: b, reason: collision with root package name */
    public k4 f11718b = null;

    /* renamed from: c, reason: collision with root package name */
    public k4 f11719c = null;

    /* renamed from: d, reason: collision with root package name */
    public i1 f11720d = null;

    /* renamed from: e, reason: collision with root package name */
    public i1 f11721e = null;

    public b(String str) {
        this.f11717a = str;
    }

    public static i1 a(i1 i1Var, String str, k4 k4Var) {
        i1 i1VarJ = i1Var.j("activity.load", str, k4Var, p1.SENTRY);
        i1VarJ.l(Long.valueOf(Looper.getMainLooper().getThread().getId()), "thread.id");
        i1VarJ.l("main", "thread.name");
        Boolean bool = Boolean.TRUE;
        i1VarJ.l(bool, "ui.contributes_to_ttid");
        i1VarJ.l(bool, "ui.contributes_to_ttfd");
        return i1VarJ;
    }
}
