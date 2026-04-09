package V0;

import com.google.android.gms.internal.ads.C0677Pi;
import com.google.android.gms.internal.ads.InterfaceC1973ui;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class b implements InterfaceC1973ui {

    /* renamed from: a, reason: collision with root package name */
    public int f3800a;

    /* renamed from: b, reason: collision with root package name */
    public int f3801b;

    /* renamed from: c, reason: collision with root package name */
    public int f3802c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3803d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3804e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3805f;

    /* renamed from: g, reason: collision with root package name */
    public Object f3806g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f3807h;

    public b(C0677Pi c0677Pi) {
        this.f3807h = c0677Pi;
        int i = c0677Pi.f10473h;
        this.f3803d = new short[i];
        int i3 = i * c0677Pi.f10467b;
        this.f3804e = new short[i3];
        this.f3805f = new short[i3];
        this.f3806g = new short[i3];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public int a() {
        return 2;
    }

    public int b(short[] sArr, int i, int i3, int i6) {
        int i7 = 1;
        int i8 = 255;
        int i9 = 0;
        int i10 = 0;
        while (i3 <= i6) {
            int iAbs = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                int i12 = ((C0677Pi) this.f3807h).f10467b * i;
                iAbs += Math.abs(sArr[i12 + i11] - sArr[(i12 + i3) + i11]);
            }
            int i13 = iAbs * i9;
            int i14 = i7 * i3;
            if (i13 < i14) {
                i7 = iAbs;
            }
            if (i13 < i14) {
                i9 = i3;
            }
            int i15 = iAbs * i8;
            int i16 = i10 * i3;
            if (i15 > i16) {
                i10 = iAbs;
            }
            if (i15 > i16) {
                i8 = i3;
            }
            i3++;
        }
        this.f3800a = i7 / i9;
        this.f3801b = i10 / i8;
        return i9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public void c(int i) {
        this.f3804e = s((short[]) this.f3804e, ((C0677Pi) this.f3807h).f10474j, i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public int d(int i, int i3, int i6) {
        return b((short[]) this.f3804e, i, i3, i6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public void e() {
        this.f3802c = 0;
        this.f3800a = 0;
        this.f3801b = 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public boolean f() {
        int i = this.f3800a;
        return i != 0 && ((C0677Pi) this.f3807h).f10480p != 0 && this.f3801b <= i * 3 && i + i > this.f3802c * 3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public void g(int i) {
        this.f3806g = s((short[]) this.f3806g, ((C0677Pi) this.f3807h).f10476l, i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public void h(ByteBuffer byteBuffer, int i) {
        C0677Pi c0677Pi = (C0677Pi) this.f3807h;
        byteBuffer.asShortBuffer().put((short[]) this.f3805f, 0, c0677Pi.f10467b * i);
        byteBuffer.position(((i + i) * c0677Pi.f10467b) + byteBuffer.position());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public void i(ByteBuffer byteBuffer, int i) {
        C0677Pi c0677Pi = (C0677Pi) this.f3807h;
        byteBuffer.asShortBuffer().get((short[]) this.f3804e, c0677Pi.f10474j * c0677Pi.f10467b, i / 2);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public void j() {
        this.f3802c = this.f3800a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public void k(int i, int i3, int i6, int i7, int i8) {
        short[] sArr = (short[]) this.f3805f;
        short[] sArr2 = (short[]) this.f3804e;
        for (int i9 = 0; i9 < i3; i9++) {
            int i10 = (i7 * i3) + i9;
            int i11 = (i8 * i3) + i9;
            int i12 = (i6 * i3) + i9;
            for (int i13 = 0; i13 < i; i13++) {
                sArr[i12] = (short) (((sArr2[i11] * i13) + ((i - i13) * sArr2[i10])) / i);
                i12 += i3;
                i10 += i3;
                i11 += i3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public /* synthetic */ Object l() {
        return (short[]) this.f3805f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public void m(int i, int i3) {
        int i6;
        short[] sArr = (short[]) this.f3804e;
        int i7 = 0;
        while (true) {
            C0677Pi c0677Pi = (C0677Pi) this.f3807h;
            if (i7 >= c0677Pi.f10473h / i3) {
                return;
            }
            int i8 = 0;
            int i9 = 0;
            while (true) {
                int i10 = c0677Pi.f10467b;
                i6 = i10 * i3;
                if (i8 < i6) {
                    i9 += sArr[(i6 * i7) + (i10 * i) + i8];
                    i8++;
                }
            }
            ((short[]) this.f3803d)[i7] = (short) (i9 / i6);
            i7++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public void n(int i, int i3) {
        for (int i6 = 0; i6 < ((C0677Pi) this.f3807h).f10467b * i3; i6++) {
            ((short[]) this.f3804e)[i + i6] = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public void o(long j6, long j7, int i) {
        int i3 = 0;
        while (true) {
            C0677Pi c0677Pi = (C0677Pi) this.f3807h;
            int i6 = c0677Pi.f10467b;
            if (i3 >= i6) {
                return;
            }
            short[] sArr = (short[]) this.f3805f;
            int i7 = c0677Pi.f10475k;
            short[] sArr2 = (short[]) this.f3806g;
            int i8 = (i * i6) + i3;
            short s5 = sArr2[i8];
            short s6 = sArr2[i8 + i6];
            long j8 = c0677Pi.f10478n * j6;
            long j9 = c0677Pi.f10477m * j7;
            long j10 = (r2 + 1) * j7;
            int i9 = i3;
            long j11 = j10 - j9;
            long j12 = j10 - j8;
            sArr[(i7 * i6) + i9] = (short) ((((j11 - j12) * s6) + (j12 * s5)) / j11);
            i3 = i9 + 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public int p(int i, int i3) {
        return b((short[]) this.f3803d, 0, i, i3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public /* synthetic */ Object q() {
        return (short[]) this.f3806g;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public void r(int i) {
        this.f3805f = s((short[]) this.f3805f, ((C0677Pi) this.f3807h).f10475k, i);
    }

    public short[] s(short[] sArr, int i, int i3) {
        C0677Pi c0677Pi = (C0677Pi) this.f3807h;
        int length = sArr.length;
        int i6 = c0677Pi.f10467b;
        int i7 = length / i6;
        return i + i3 <= i7 ? sArr : Arrays.copyOf(sArr, (((i7 * 3) / 2) + i3) * i6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1973ui
    public /* synthetic */ Object w() {
        return (short[]) this.f3804e;
    }

    public b(S4.r rVar) {
        this.f3803d = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(false));
        this.f3804e = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(true));
        String str = t.f3837a;
        this.f3805f = new s();
        this.f3806g = new S4.r(5);
        this.f3807h = new U0.j();
        this.f3800a = 4;
        this.f3801b = Integer.MAX_VALUE;
        this.f3802c = 20;
    }
}
