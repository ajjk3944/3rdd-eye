package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class le {

    /* renamed from: c, reason: collision with root package name */
    public static final ConditionVariable f13465c = new ConditionVariable();

    /* renamed from: d, reason: collision with root package name */
    public static volatile fw0 f13466d = null;

    /* renamed from: e, reason: collision with root package name */
    public static volatile Random f13467e = null;

    /* renamed from: a, reason: collision with root package name */
    public final ff f13468a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Boolean f13469b;

    public le(ff ffVar) {
        this.f13468a = ffVar;
        ffVar.f11117b.execute(new s(4, this));
    }

    public final void a(int i4, int i10, long j, String str, Exception exc) {
        try {
            f13465c.block();
            if (!this.f13469b.booleanValue() || f13466d == null) {
                return;
            }
            rc rcVarA = uc.A();
            String packageName = this.f13468a.f11116a.getPackageName();
            rcVarA.b();
            ((uc) rcVarA.f14755b).B(packageName);
            rcVarA.b();
            ((uc) rcVarA.f14755b).C(j);
            if (str != null) {
                rcVarA.b();
                ((uc) rcVarA.f14755b).F(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                String string = stringWriter.toString();
                rcVarA.b();
                ((uc) rcVarA.f14755b).D(string);
                String name = exc.getClass().getName();
                rcVarA.b();
                ((uc) rcVarA.f14755b).E(name);
            }
            fw0 fw0Var = f13466d;
            byte[] bArrB = ((uc) rcVarA.e()).b();
            fw0Var.getClass();
            k5 k5Var = new k5(fw0Var, bArrB);
            k5Var.f13029b = i4;
            if (i10 != -1) {
                k5Var.f13028a = i10;
            }
            k5Var.a();
        } catch (Exception unused) {
        }
    }
}
