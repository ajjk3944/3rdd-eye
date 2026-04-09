package defpackage;

import android.view.View;
import java.nio.ByteBuffer;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cm implements ti0, dj1 {
    public int f;
    public int g;
    public int h;
    public int i;
    public Object j;

    public cm(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.j = byteBufferWrap;
        this.f = byteBufferWrap.position();
        this.g = byteBufferWrap.limit();
        this.h = -1;
        this.i = -1;
    }

    @Override // defpackage.ti0
    public o91 B(View view, o91 o91Var) {
        View view2 = (View) this.j;
        y20 y20VarF = o91Var.a.f(7);
        int i = this.f;
        if (i >= 0) {
            view2.getLayoutParams().height = i + y20VarF.b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.g + y20VarF.a, this.h + y20VarF.b, this.i + y20VarF.c, view2.getPaddingBottom());
        return o91Var;
    }

    @Override // defpackage.dj1
    public int a() {
        return this.f;
    }

    public byte[] b() {
        ByteBuffer byteBuffer = (ByteBuffer) this.j;
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr, 0, iRemaining);
        return bArr;
    }

    public byte[] c(int i) throws t91 {
        j(i);
        byte[] bArr = new byte[i];
        ((ByteBuffer) this.j).get(bArr, 0, i);
        return bArr;
    }

    @Override // defpackage.dj1
    public int d() {
        return -1;
    }

    public byte[] e() {
        return c(i());
    }

    public int f() throws t91 {
        j(2);
        return ((ByteBuffer) this.j).getShort() & 65535;
    }

    public long g() throws t91 {
        j(4);
        return ((ByteBuffer) this.j).getInt() & 4294967295L;
    }

    @Override // defpackage.dj1
    public int h() {
        kz2 kz2Var = (kz2) this.j;
        int i = this.g;
        if (i == 8) {
            return kz2Var.K();
        }
        if (i == 16) {
            return kz2Var.L();
        }
        int i2 = this.h;
        this.h = i2 + 1;
        if (i2 % 2 != 0) {
            return this.i & 15;
        }
        int iK = kz2Var.K();
        this.i = iK;
        return (iK & 240) >> 4;
    }

    public int i() throws t91 {
        j(1);
        return ((ByteBuffer) this.j).get() & 255;
    }

    public void j(int i) throws t91 {
        if (i > ((ByteBuffer) this.j).remaining()) {
            throw new t91("end of input");
        }
    }

    public long k() {
        int i = this.h;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = (long[]) this.j;
        int i2 = this.f;
        long j = jArr[i2];
        this.f = this.i & (i2 + 1);
        this.h = i - 1;
        return j;
    }
}
