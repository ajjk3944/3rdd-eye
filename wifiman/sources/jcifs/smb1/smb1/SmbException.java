package jcifs.smb1.smb1;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes4.dex */
public class SmbException extends IOException implements InterfaceC6274h, InterfaceC6271e, Z {

    /* renamed from: a, reason: collision with root package name */
    private int f50496a;

    /* renamed from: b, reason: collision with root package name */
    private Throwable f50497b;

    SmbException() {
    }

    static String a(int i10) {
        if (i10 == 0) {
            return "NT_STATUS_SUCCESS";
        }
        int i11 = 1;
        if ((i10 & (-1073741824)) == -1073741824) {
            int length = InterfaceC6274h.f50559u0.length - 1;
            while (length >= i11) {
                int i12 = (i11 + length) / 2;
                int i13 = InterfaceC6274h.f50559u0[i12];
                if (i10 > i13) {
                    i11 = i12 + 1;
                } else {
                    if (i10 >= i13) {
                        return InterfaceC6274h.f50560v0[i12];
                    }
                    length = i12 - 1;
                }
            }
        } else {
            int length2 = InterfaceC6271e.f50556s0.length - 1;
            int i14 = 0;
            while (length2 >= i14) {
                int i15 = (i14 + length2) / 2;
                int i16 = InterfaceC6271e.f50556s0[i15][0];
                if (i10 > i16) {
                    i14 = i15 + 1;
                } else {
                    if (i10 >= i16) {
                        return InterfaceC6271e.f50557t0[i15];
                    }
                    length2 = i15 - 1;
                }
            }
        }
        return "0x" + Ug.d.c(i10, 8);
    }

    static String c(int i10) {
        int length = Z.f50539a1.length - 1;
        int i11 = 0;
        while (length >= i11) {
            int i12 = (i11 + length) / 2;
            int i13 = Z.f50539a1[i12];
            if (i10 > i13) {
                i11 = i12 + 1;
            } else {
                if (i10 >= i13) {
                    return Z.f50540b1[i12];
                }
                length = i12 - 1;
            }
        }
        return i10 + "";
    }

    static int h(int i10) {
        if (((-1073741824) & i10) != 0) {
            return i10;
        }
        int length = InterfaceC6271e.f50556s0.length - 1;
        int i11 = 0;
        while (length >= i11) {
            int i12 = (i11 + length) / 2;
            int[] iArr = InterfaceC6271e.f50556s0[i12];
            int i13 = iArr[0];
            if (i10 > i13) {
                i11 = i12 + 1;
            } else {
                if (i10 >= i13) {
                    return iArr[1];
                }
                length = i12 - 1;
            }
        }
        return -1073741823;
    }

    public int d() {
        return this.f50496a;
    }

    public Throwable g() {
        return this.f50497b;
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (this.f50497b == null) {
            return super.toString();
        }
        StringWriter stringWriter = new StringWriter();
        this.f50497b.printStackTrace(new PrintWriter(stringWriter));
        return super.toString() + "\n" + stringWriter;
    }

    SmbException(int i10, Throwable th2) {
        super(a(i10));
        this.f50496a = h(i10);
        this.f50497b = th2;
    }

    SmbException(String str) {
        super(str);
        this.f50496a = -1073741823;
    }

    SmbException(String str, Throwable th2) {
        super(str);
        this.f50497b = th2;
        this.f50496a = -1073741823;
    }

    public SmbException(int i10, boolean z10) {
        super(z10 ? c(i10) : a(i10));
        this.f50496a = z10 ? i10 : h(i10);
    }
}
