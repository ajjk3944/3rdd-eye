package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.vm1;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class f5 implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final g5 f19739a;

    /* renamed from: b, reason: collision with root package name */
    public g5 f19740b;

    public f5(g5 g5Var) {
        this.f19739a = g5Var;
        if (g5Var.e()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f19740b = (g5) g5Var.o(4);
    }

    public static void a(int i4, List list) {
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

    public final void b() {
        if (this.f19740b.e()) {
            return;
        }
        g5 g5Var = (g5) this.f19739a.o(4);
        f6.f19741c.a(g5Var.getClass()).c(g5Var, this.f19740b);
        this.f19740b = g5Var;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final f5 clone() {
        f5 f5Var = (f5) this.f19739a.o(5);
        f5Var.f19740b = e();
        return f5Var;
    }

    public final g5 e() {
        if (!this.f19740b.e()) {
            return this.f19740b;
        }
        this.f19740b.g();
        return this.f19740b;
    }

    public final g5 f() {
        g5 g5VarE = e();
        g5VarE.getClass();
        boolean zA = true;
        byte bByteValue = ((Byte) g5VarE.o(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zA = false;
            } else {
                zA = f6.f19741c.a(g5VarE.getClass()).a(g5VarE);
                g5VarE.o(2);
            }
        }
        if (zA) {
            return g5VarE;
        }
        throw new ac.m("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final void g(g5 g5Var) {
        g5 g5Var2 = this.f19739a;
        if (g5Var2.equals(g5Var)) {
            return;
        }
        if (!this.f19740b.e()) {
            g5 g5Var3 = (g5) g5Var2.o(4);
            f6.f19741c.a(g5Var3.getClass()).c(g5Var3, this.f19740b);
            this.f19740b = g5Var3;
        }
        g5 g5Var4 = this.f19740b;
        f6.f19741c.a(g5Var4.getClass()).c(g5Var4, g5Var);
    }

    public final void h(byte[] bArr, int i4, z4 z4Var) throws p5 {
        if (!this.f19740b.e()) {
            g5 g5Var = (g5) this.f19739a.o(4);
            f6.f19741c.a(g5Var.getClass()).c(g5Var, this.f19740b);
            this.f19740b = g5Var;
        }
        try {
            i6 i6VarA = f6.f19741c.a(this.f19740b.getClass());
            g5 g5Var2 = this.f19740b;
            vm1 vm1Var = new vm1();
            z4Var.getClass();
            i6VarA.h(g5Var2, bArr, 0, i4, vm1Var);
        } catch (p5 e2) {
            throw e2;
        } catch (IOException e10) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e10);
        } catch (IndexOutOfBoundsException unused) {
            throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
