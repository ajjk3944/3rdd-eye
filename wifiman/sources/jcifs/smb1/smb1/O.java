package jcifs.smb1.smb1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class O extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private M f50412a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f50413b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f50414c;

    /* renamed from: d, reason: collision with root package name */
    private int f50415d;

    /* renamed from: e, reason: collision with root package name */
    private int f50416e;

    /* renamed from: f, reason: collision with root package name */
    private int f50417f;

    /* renamed from: g, reason: collision with root package name */
    private long f50418g;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f50419h;

    /* renamed from: i, reason: collision with root package name */
    private I f50420i;

    /* renamed from: j, reason: collision with root package name */
    private J f50421j;

    /* renamed from: k, reason: collision with root package name */
    private H f50422k;

    /* renamed from: l, reason: collision with root package name */
    private K f50423l;

    public O(M m10) {
        this(m10, false);
    }

    void a() {
        if (this.f50412a.q()) {
            return;
        }
        this.f50412a.t(this.f50415d, this.f50416e | 2, 128, 0);
        if (this.f50413b) {
            this.f50418g = this.f50412a.s();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f50412a.b();
        this.f50419h = null;
    }

    public void g(byte[] bArr, int i10, int i11, int i12) throws IOException {
        if (i11 <= 0) {
            return;
        }
        if (this.f50419h == null) {
            throw new IOException("Bad file descriptor");
        }
        a();
        C6270d c6270d = M.f50384y;
        if (Ug.e.f22464b >= 4) {
            M.f50381v.println("write: fid=" + this.f50412a.f50400p + ",off=" + i10 + ",len=" + i11);
        }
        do {
            int i13 = this.f50417f;
            if (i11 <= i13) {
                i13 = i11;
            }
            if (this.f50414c) {
                this.f50420i.H(this.f50412a.f50400p, this.f50418g, i11 - i13, bArr, i10, i13);
                if ((i12 & 1) != 0) {
                    this.f50420i.H(this.f50412a.f50400p, this.f50418g, i11, bArr, i10, i13);
                    this.f50420i.f50348Y = 8;
                } else {
                    this.f50420i.f50348Y = 0;
                }
                this.f50412a.z(this.f50420i, this.f50421j);
                long j10 = this.f50418g;
                long j11 = this.f50421j.f50349E;
                this.f50418g = j10 + j11;
                i11 = (int) (i11 - j11);
                i10 = (int) (i10 + j11);
            } else {
                this.f50422k.E(this.f50412a.f50400p, this.f50418g, i11 - i13, bArr, i10, i13);
                long j12 = this.f50418g;
                K k10 = this.f50423l;
                long j13 = k10.f50350B;
                this.f50418g = j12 + j13;
                i11 = (int) (i11 - j13);
                i10 = (int) (i10 + j13);
                this.f50412a.z(this.f50422k, k10);
            }
        } while (i11 > 0);
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.f50419h;
        bArr[0] = (byte) i10;
        write(bArr, 0, 1);
    }

    public O(M m10, boolean z10) {
        this(m10, z10, z10 ? 22 : 82);
    }

    O(M m10, boolean z10, int i10) throws SmbException {
        this.f50419h = new byte[1];
        this.f50412a = m10;
        this.f50413b = z10;
        this.f50415d = i10;
        this.f50416e = (i10 >>> 16) & 65535;
        if (z10) {
            try {
                this.f50418g = m10.s();
            } catch (SmbAuthException e10) {
                throw e10;
            } catch (SmbException unused) {
                this.f50418g = 0L;
            }
        }
        m10.t(i10, this.f50416e | 2, 128, 0);
        this.f50415d &= -81;
        Q q10 = m10.f50398n.f50492f.f50437h;
        this.f50417f = q10.f50466y - 70;
        boolean zU = q10.u(16);
        this.f50414c = zU;
        if (zU) {
            this.f50420i = new I();
            this.f50421j = new J();
        } else {
            this.f50422k = new H();
            this.f50423l = new K();
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f50412a.q();
        g(bArr, i10, i11, 0);
    }
}
