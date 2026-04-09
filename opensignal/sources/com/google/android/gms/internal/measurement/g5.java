package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class g5 implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final h5 f5041a;

    /* renamed from: d, reason: collision with root package name */
    public h5 f5042d;

    public g5(h5 h5Var) {
        this.f5041a = h5Var;
        if (h5Var.e()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f5042d = (h5) h5Var.o(4);
    }

    public static void a(int i10, List list) {
        int size = list.size() - i10;
        StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 26);
        sb2.append("Element at index ");
        sb2.append(size);
        sb2.append(" is null.");
        String string = sb2.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i10) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    public final void b() {
        if (this.f5042d.e()) {
            return;
        }
        h5 h5Var = (h5) this.f5041a.o(4);
        g6.f5043c.a(h5Var.getClass()).a(h5Var, this.f5042d);
        this.f5042d = h5Var;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final g5 clone() {
        g5 g5Var = (g5) this.f5041a.o(5);
        g5Var.f5042d = d();
        return g5Var;
    }

    public final h5 d() {
        if (!this.f5042d.e()) {
            return this.f5042d;
        }
        this.f5042d.g();
        return this.f5042d;
    }

    public final h5 e() {
        h5 h5VarD = d();
        h5VarD.getClass();
        boolean zD = true;
        byte bByteValue = ((Byte) h5VarD.o(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zD = false;
            } else {
                zD = g6.f5043c.a(h5VarD.getClass()).d(h5VarD);
                h5VarD.o(2);
            }
        }
        if (zD) {
            return h5VarD;
        }
        throw new bf.n("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final void f(h5 h5Var) {
        h5 h5Var2 = this.f5041a;
        if (h5Var2.equals(h5Var)) {
            return;
        }
        if (!this.f5042d.e()) {
            h5 h5Var3 = (h5) h5Var2.o(4);
            g6.f5043c.a(h5Var3.getClass()).a(h5Var3, this.f5042d);
            this.f5042d = h5Var3;
        }
        h5 h5Var4 = this.f5042d;
        g6.f5043c.a(h5Var4.getClass()).a(h5Var4, h5Var);
    }

    public final void g(byte[] bArr, int i10, a5 a5Var) throws q5 {
        if (!this.f5042d.e()) {
            h5 h5Var = (h5) this.f5041a.o(4);
            g6.f5043c.a(h5Var.getClass()).a(h5Var, this.f5042d);
            this.f5042d = h5Var;
        }
        try {
            j6 j6VarA = g6.f5043c.a(this.f5042d.getClass());
            h5 h5Var2 = this.f5042d;
            v4 v4Var = new v4();
            a5Var.getClass();
            j6VarA.g(h5Var2, bArr, 0, i10, v4Var);
        } catch (q5 e4) {
            throw e4;
        } catch (IOException e10) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e10);
        } catch (IndexOutOfBoundsException unused) {
            throw new q5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
