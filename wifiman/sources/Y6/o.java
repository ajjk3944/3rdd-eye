package Y6;

import com.squareup.moshi.JsonDataException;
import ej.InterfaceC5482f;
import ej.InterfaceC5483g;
import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class o implements Closeable, Flushable {

    /* renamed from: e, reason: collision with root package name */
    String f24689e;

    /* renamed from: f, reason: collision with root package name */
    boolean f24690f;

    /* renamed from: g, reason: collision with root package name */
    boolean f24691g;

    /* renamed from: h, reason: collision with root package name */
    boolean f24692h;

    /* renamed from: a, reason: collision with root package name */
    int f24685a = 0;

    /* renamed from: b, reason: collision with root package name */
    int[] f24686b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    String[] f24687c = new String[32];

    /* renamed from: d, reason: collision with root package name */
    int[] f24688d = new int[32];

    /* renamed from: i, reason: collision with root package name */
    int f24693i = -1;

    o() {
    }

    public static o S(InterfaceC5482f interfaceC5482f) {
        return new n(interfaceC5482f);
    }

    public final boolean C() {
        return this.f24690f;
    }

    public abstract o J(String str);

    public abstract o P();

    final int T() {
        int i10 = this.f24685a;
        if (i10 != 0) {
            return this.f24686b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void Y() {
        int iT = T();
        if (iT != 5 && iT != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f24692h = true;
    }

    public abstract o a();

    final void b0(int i10) {
        int[] iArr = this.f24686b;
        int i11 = this.f24685a;
        this.f24685a = i11 + 1;
        iArr[i11] = i10;
    }

    final void d0(int i10) {
        this.f24686b[this.f24685a - 1] = i10;
    }

    public final void f0(boolean z10) {
        this.f24690f = z10;
    }

    public final int g() {
        int iT = T();
        if (iT != 5 && iT != 3 && iT != 2 && iT != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i10 = this.f24693i;
        this.f24693i = this.f24685a;
        return i10;
    }

    public final String getPath() {
        return l.a(this.f24685a, this.f24686b, this.f24687c, this.f24688d);
    }

    public abstract o h();

    final boolean j() {
        int i10 = this.f24685a;
        int[] iArr = this.f24686b;
        if (i10 != iArr.length) {
            return false;
        }
        if (i10 == 256) {
            throw new JsonDataException("Nesting too deep at " + getPath() + ": circular reference?");
        }
        this.f24686b = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.f24687c;
        this.f24687c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.f24688d;
        this.f24688d = Arrays.copyOf(iArr2, iArr2.length * 2);
        return true;
    }

    public final void m0(boolean z10) {
        this.f24691g = z10;
    }

    public abstract o n0(double d10);

    public abstract o o0(long j10);

    public abstract o p();

    public final o p0(InterfaceC5483g interfaceC5483g) {
        if (this.f24692h) {
            throw new IllegalStateException("BufferedSource cannot be used as a map key in JSON at path " + getPath());
        }
        InterfaceC5482f interfaceC5482fT0 = t0();
        try {
            interfaceC5483g.q(interfaceC5482fT0);
            if (interfaceC5482fT0 != null) {
                interfaceC5482fT0.close();
            }
            return this;
        } catch (Throwable th2) {
            if (interfaceC5482fT0 != null) {
                try {
                    interfaceC5482fT0.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public abstract o q0(Number number);

    public abstract o r0(String str);

    public final void s(int i10) {
        this.f24693i = i10;
    }

    public abstract o s0(boolean z10);

    public abstract InterfaceC5482f t0();

    public abstract o v();

    public final boolean y() {
        return this.f24691g;
    }
}
