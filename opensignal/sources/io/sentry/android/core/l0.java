package io.sentry.android.core;

import android.os.FileObserver;
import io.sentry.b5;
import io.sentry.z2;
import java.io.File;

/* loaded from: classes.dex */
public final class l0 extends FileObserver {

    /* renamed from: a, reason: collision with root package name */
    public final String f11698a;

    /* renamed from: b, reason: collision with root package name */
    public final z2 f11699b;

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.u0 f11700c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11701d;

    public l0(String str, z2 z2Var, io.sentry.u0 u0Var, long j) {
        super(str);
        this.f11698a = str;
        this.f11699b = z2Var;
        ir.f0.T(u0Var, "Logger is required.");
        this.f11700c = u0Var;
        this.f11701d = j;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i10, String str) {
        if (str == null || i10 != 8) {
            return;
        }
        b5 b5Var = b5.DEBUG;
        Integer numValueOf = Integer.valueOf(i10);
        String str2 = this.f11698a;
        io.sentry.u0 u0Var = this.f11700c;
        u0Var.m(b5Var, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", numValueOf, str2, str);
        io.sentry.h0 h0VarJ = dr.a.j(new k0(this.f11701d, u0Var));
        StringBuilder sbT = c7.a.t(str2);
        sbT.append(File.separator);
        sbT.append(str);
        String string = sbT.toString();
        z2 z2Var = this.f11699b;
        z2Var.getClass();
        ir.f0.T(string, "Path is required.");
        z2Var.b(new File(string), h0VarJ);
    }
}
