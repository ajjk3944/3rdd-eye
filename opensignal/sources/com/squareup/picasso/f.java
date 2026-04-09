package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class f implements Runnable {
    public static final Object O = new Object();
    public static final c P = new c(0);
    public static final AtomicInteger Q = new AtomicInteger();
    public static final d R = new d();
    public final k0 B;
    public int D;
    public final m0 E;
    public b F;
    public ArrayList G;
    public Bitmap H;
    public Future I;
    public c0 J;
    public Exception K;
    public int L;
    public int M;
    public d0 N;

    /* renamed from: a, reason: collision with root package name */
    public final int f5882a = Q.incrementAndGet();

    /* renamed from: d, reason: collision with root package name */
    public final f0 f5883d;

    /* renamed from: g, reason: collision with root package name */
    public final n f5884g;

    /* renamed from: r, reason: collision with root package name */
    public final s f5885r;

    /* renamed from: x, reason: collision with root package name */
    public final n0 f5886x;

    /* renamed from: y, reason: collision with root package name */
    public final String f5887y;

    public f(f0 f0Var, n nVar, s sVar, n0 n0Var, b bVar, m0 m0Var) {
        this.f5883d = f0Var;
        this.f5884g = nVar;
        this.f5885r = sVar;
        this.f5886x = n0Var;
        this.F = bVar;
        this.f5887y = bVar.f5873e;
        k0 k0Var = bVar.f5870b;
        this.B = k0Var;
        this.N = k0Var.f5923g;
        this.D = bVar.f5872d;
        this.E = m0Var;
        this.M = m0Var.d();
    }

    public static Bitmap b(InputStream inputStream, k0 k0Var) throws IOException {
        t tVar = new t(inputStream);
        long jF = tVar.f(65536);
        BitmapFactory.Options optionsC = m0.c(k0Var);
        int i10 = k0Var.f5922f;
        int i11 = k0Var.f5921e;
        boolean z10 = optionsC != null && optionsC.inJustDecodeBounds;
        byte[] bArr = new byte[12];
        boolean z11 = tVar.read(bArr, 0, 12) == 12 && "RIFF".equals(new String(bArr, 0, 4, "US-ASCII")) && "WEBP".equals(new String(bArr, 8, 4, "US-ASCII"));
        tVar.b(jF);
        if (!z11) {
            if (z10) {
                BitmapFactory.decodeStream(tVar, null, optionsC);
                m0.a(i11, i10, optionsC.outWidth, optionsC.outHeight, optionsC, k0Var);
                tVar.b(jF);
            }
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(tVar, null, optionsC);
            if (bitmapDecodeStream != null) {
                return bitmapDecodeStream;
            }
            throw new IOException("Failed to decode stream.");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[4096];
        while (true) {
            int i12 = tVar.read(bArr2);
            if (-1 == i12) {
                break;
            }
            byteArrayOutputStream.write(bArr2, 0, i12);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (z10) {
            BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, optionsC);
            m0.a(i11, i10, optionsC.outWidth, optionsC.outHeight, optionsC, k0Var);
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, optionsC);
    }

    public static void e(k0 k0Var) {
        Uri uri = k0Var.f5918b;
        String strValueOf = uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(k0Var.f5919c);
        StringBuilder sb2 = (StringBuilder) P.get();
        sb2.ensureCapacity(strValueOf.length() + 8);
        sb2.replace(8, sb2.length(), strValueOf);
        Thread.currentThread().setName(sb2.toString());
    }

    public final boolean a() {
        ArrayList arrayList;
        Future future;
        return this.F == null && ((arrayList = this.G) == null || arrayList.isEmpty()) && (future = this.I) != null && future.cancel(false);
    }

    public final void c(b bVar) {
        boolean zRemove;
        if (this.F == bVar) {
            this.F = null;
            zRemove = true;
        } else {
            ArrayList arrayList = this.G;
            zRemove = arrayList != null ? arrayList.remove(bVar) : false;
        }
        if (zRemove && bVar.f5870b.f5923g == this.N) {
            d0 d0Var = d0.LOW;
            ArrayList arrayList2 = this.G;
            boolean z10 = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
            b bVar2 = this.F;
            if (bVar2 != null || z10) {
                if (bVar2 != null) {
                    d0Var = bVar2.f5870b.f5923g;
                }
                if (z10) {
                    int size = this.G.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        d0 d0Var2 = ((b) this.G.get(i10)).f5870b.f5923g;
                        if (d0Var2.ordinal() > d0Var.ordinal()) {
                            d0Var = d0Var2;
                        }
                    }
                }
            }
            this.N = d0Var;
        }
        this.f5883d.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064 A[PHI: r1
  0x0064: PHI (r1v3 android.graphics.Bitmap) = (r1v2 android.graphics.Bitmap), (r1v17 android.graphics.Bitmap) binds: [B:14:0x0039, B:16:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap d() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.f.d():android.graphics.Bitmap");
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f5884g;
        try {
            try {
                try {
                    e(this.B);
                    this.f5883d.getClass();
                    Bitmap bitmapD = d();
                    this.H = bitmapD;
                    if (bitmapD == null) {
                        l lVar = nVar.f5939h;
                        lVar.sendMessage(lVar.obtainMessage(6, this));
                    } else {
                        nVar.b(this);
                    }
                } catch (IOException e4) {
                    this.K = e4;
                    l lVar2 = nVar.f5939h;
                    lVar2.sendMessageDelayed(lVar2.obtainMessage(5, this), 500L);
                } catch (Exception e10) {
                    this.K = e10;
                    l lVar3 = nVar.f5939h;
                    lVar3.sendMessage(lVar3.obtainMessage(6, this));
                } catch (OutOfMemoryError e11) {
                    StringWriter stringWriter = new StringWriter();
                    this.f5886x.a().a(new PrintWriter(stringWriter));
                    this.K = new RuntimeException(stringWriter.toString(), e11);
                    l lVar4 = nVar.f5939h;
                    lVar4.sendMessage(lVar4.obtainMessage(6, this));
                }
            } catch (p e12) {
                if (!e12.f5969a || e12.f5970d != 504) {
                    this.K = e12;
                }
                l lVar5 = nVar.f5939h;
                lVar5.sendMessage(lVar5.obtainMessage(6, this));
            } catch (y e13) {
                this.K = e13;
                l lVar6 = nVar.f5939h;
                lVar6.sendMessageDelayed(lVar6.obtainMessage(5, this), 500L);
            }
        } finally {
            Thread.currentThread().setName("Picasso-Idle");
        }
    }
}
