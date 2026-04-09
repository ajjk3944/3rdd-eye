package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* loaded from: classes.dex */
public final class E6 {

    /* renamed from: c, reason: collision with root package name */
    public static final ConditionVariable f7912c = new ConditionVariable();

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0963bx f7913d = null;

    /* renamed from: e, reason: collision with root package name */
    public static volatile Random f7914e = null;

    /* renamed from: a, reason: collision with root package name */
    public final X6 f7915a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Boolean f7916b;

    public E6(X6 x6) {
        this.f7915a = x6;
        x6.f12376b.execute(new RunnableC1883t(5, this));
    }

    public final void a(int i, int i3, long j6, String str, Exception exc) {
        try {
            f7912c.block();
            if (!this.f7916b.booleanValue() || f7913d == null) {
                return;
            }
            K5 k5A = N5.A();
            String packageName = this.f7915a.f12375a.getPackageName();
            k5A.b();
            ((N5) k5A.f13551b).B(packageName);
            k5A.b();
            ((N5) k5A.f13551b).C(j6);
            if (str != null) {
                k5A.b();
                ((N5) k5A.f13551b).F(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                String string = stringWriter.toString();
                k5A.b();
                ((N5) k5A.f13551b).D(string);
                String name = exc.getClass().getName();
                k5A.b();
                ((N5) k5A.f13551b).E(name);
            }
            C0963bx c0963bx = f7913d;
            byte[] bArrB = ((N5) k5A.d()).b();
            c0963bx.getClass();
            M3.o oVar = new M3.o(c0963bx, bArrB);
            oVar.f2871b = i;
            if (i3 != -1) {
                oVar.f2870a = i3;
            }
            oVar.b();
        } catch (Exception unused) {
        }
    }
}
