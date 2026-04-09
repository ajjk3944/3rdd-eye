package defpackage;

import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class n54 implements Cloneable {
    public final p54 f;
    public p54 g;

    public n54(p54 p54Var) {
        this.f = p54Var;
        if (p54Var.h()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.g = p54Var.p();
    }

    public static void f(int i, List list) {
        int size = list.size() - i;
        String strK = ga1.k(new StringBuilder(String.valueOf(size).length() + 26), "Element at index ", size, " is null.");
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(strK);
            }
            list.remove(size2);
        }
    }

    public final void a(byte[] bArr, h54 h54Var) throws a64 {
        int length = bArr.length;
        b();
        try {
            p64.c.a(this.g.getClass()).i(this.g, bArr, 0, length, new v44(h54Var));
        } catch (a64 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final void b() {
        if (this.g.h()) {
            return;
        }
        p54 p54VarP = this.f.p();
        p64.c.a(p54VarP.getClass()).d(p54VarP, this.g);
        this.g = p54VarP;
    }

    public final p54 c() {
        if (!this.g.h()) {
            return this.g;
        }
        this.g.q();
        return this.g;
    }

    public final Object clone() {
        n54 n54Var = (n54) this.f.w(5, null);
        n54Var.g = c();
        return n54Var;
    }

    public final p54 d() {
        p54 p54VarC = c();
        p54VarC.getClass();
        if (p54.x(p54VarC, true)) {
            return p54VarC;
        }
        throw new a74();
    }

    public final n54 e(p54 p54Var) {
        if (this.f.equals(p54Var)) {
            return this;
        }
        b();
        p54 p54Var2 = this.g;
        p64.c.a(p54Var2.getClass()).d(p54Var2, p54Var);
        return this;
    }
}
