package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.mm;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class pm implements nv {

    /* renamed from: a, reason: collision with root package name */
    private final mm f31824a;

    /* renamed from: b, reason: collision with root package name */
    private final long f31825b = 5242880;

    /* renamed from: c, reason: collision with root package name */
    private final int f31826c = 20480;

    /* renamed from: d, reason: collision with root package name */
    private sv f31827d;

    /* renamed from: e, reason: collision with root package name */
    private long f31828e;

    /* renamed from: f, reason: collision with root package name */
    private File f31829f;

    /* renamed from: g, reason: collision with root package name */
    private OutputStream f31830g;

    /* renamed from: h, reason: collision with root package name */
    private long f31831h;
    private long i;

    /* renamed from: j, reason: collision with root package name */
    private ir1 f31832j;

    public static final class a extends mm.a {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private mm f31833a;

        public final b a(mm mmVar) {
            this.f31833a = mmVar;
            return this;
        }

        public final pm a() {
            mm mmVar = this.f31833a;
            mmVar.getClass();
            return new pm(mmVar);
        }
    }

    public pm(mm mmVar) {
        this.f31824a = (mm) zf.a(mmVar);
    }

    private void a() throws IOException {
        OutputStream outputStream = this.f31830g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            s82.a((Closeable) this.f31830g);
            this.f31830g = null;
            File file = this.f31829f;
            this.f31829f = null;
            this.f31824a.a(file, this.f31831h);
        } catch (Throwable th) {
            s82.a((Closeable) this.f31830g);
            this.f31830g = null;
            File file2 = this.f31829f;
            this.f31829f = null;
            file2.delete();
            throw th;
        }
    }

    private void b(sv svVar) throws IOException {
        long j4 = svVar.f33256g;
        long jMin = j4 != -1 ? Math.min(j4 - this.i, this.f31828e) : -1L;
        mm mmVar = this.f31824a;
        String str = svVar.f33257h;
        int i = s82.f32899a;
        this.f31829f = mmVar.a(str, svVar.f33255f + this.i, jMin);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f31829f);
        if (this.f31826c > 0) {
            ir1 ir1Var = this.f31832j;
            if (ir1Var == null) {
                this.f31832j = new ir1(fileOutputStream, this.f31826c);
            } else {
                ir1Var.a(fileOutputStream);
            }
            this.f31830g = this.f31832j;
        } else {
            this.f31830g = fileOutputStream;
        }
        this.f31831h = 0L;
    }

    @Override // com.yandex.mobile.ads.impl.nv
    public final void close() throws a {
        if (this.f31827d == null) {
            return;
        }
        try {
            a();
        } catch (IOException e4) {
            throw new a(e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.nv
    public final void write(byte[] bArr, int i, int i10) throws IOException {
        sv svVar = this.f31827d;
        if (svVar == null) {
            return;
        }
        int i11 = 0;
        while (i11 < i10) {
            try {
                if (this.f31831h == this.f31828e) {
                    a();
                    b(svVar);
                }
                int iMin = (int) Math.min(i10 - i11, this.f31828e - this.f31831h);
                OutputStream outputStream = this.f31830g;
                int i12 = s82.f32899a;
                outputStream.write(bArr, i + i11, iMin);
                i11 += iMin;
                long j4 = iMin;
                this.f31831h += j4;
                this.i += j4;
            } catch (IOException e4) {
                throw new a(e4);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.nv
    public final void a(sv svVar) throws a {
        svVar.f33257h.getClass();
        if (svVar.f33256g == -1 && (svVar.i & 2) == 2) {
            this.f31827d = null;
            return;
        }
        this.f31827d = svVar;
        this.f31828e = (svVar.i & 4) == 4 ? this.f31825b : Long.MAX_VALUE;
        this.i = 0L;
        try {
            b(svVar);
        } catch (IOException e4) {
            throw new a(e4);
        }
    }
}
