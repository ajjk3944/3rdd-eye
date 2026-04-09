package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class on1 implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final qn1 f14754a;

    /* renamed from: b, reason: collision with root package name */
    public qn1 f14755b;

    public on1(qn1 qn1Var) {
        this.f14754a = qn1Var;
        if (qn1Var.h()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f14755b = qn1Var.p();
    }

    public static void g(int i4, List list) {
        int size = list.size() - i4;
        String strV = je.u.v(new StringBuilder(String.valueOf(size).length() + 26), "Element at index ", size, " is null.");
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i4) {
                throw new NullPointerException(strV);
            }
            list.remove(size2);
        }
    }

    public final void a(byte[] bArr, jn1 jn1Var) throws ao1 {
        int length = bArr.length;
        b();
        try {
            ro1.f15723c.a(this.f14755b.getClass()).j(this.f14755b, bArr, 0, length, new vm1(jn1Var));
        } catch (ao1 e2) {
            throw e2;
        } catch (IOException e10) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e10);
        } catch (IndexOutOfBoundsException unused) {
            throw new ao1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final void b() {
        if (this.f14755b.h()) {
            return;
        }
        qn1 qn1VarP = this.f14754a.p();
        ro1.f15723c.a(qn1VarP.getClass()).c(qn1VarP, this.f14755b);
        this.f14755b = qn1VarP;
    }

    public final Object clone() {
        on1 on1Var = (on1) this.f14754a.w(5, null);
        on1Var.f14755b = d();
        return on1Var;
    }

    public final qn1 d() {
        if (!this.f14755b.h()) {
            return this.f14755b;
        }
        this.f14755b.q();
        return this.f14755b;
    }

    public final qn1 e() {
        qn1 qn1VarD = d();
        qn1VarD.getClass();
        if (qn1.x(qn1VarD, true)) {
            return qn1VarD;
        }
        throw new cp1();
    }

    public final on1 f(qn1 qn1Var) {
        if (this.f14754a.equals(qn1Var)) {
            return this;
        }
        b();
        qn1 qn1Var2 = this.f14755b;
        ro1.f15723c.a(qn1Var2.getClass()).c(qn1Var2, qn1Var);
        return this;
    }
}
