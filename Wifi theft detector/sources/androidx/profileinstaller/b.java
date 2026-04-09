package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.ProfileInstaller;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import p1.j;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final AssetManager f3606a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f3607b;

    /* renamed from: c, reason: collision with root package name */
    public final ProfileInstaller.c f3608c;

    /* renamed from: e, reason: collision with root package name */
    public final File f3610e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3611f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3612g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3613h;

    /* renamed from: j, reason: collision with root package name */
    public p1.c[] f3615j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f3616k;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3614i = false;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f3609d = d();

    public b(AssetManager assetManager, Executor executor, ProfileInstaller.c cVar, String str, String str2, String str3, File file) {
        this.f3606a = assetManager;
        this.f3607b = executor;
        this.f3608c = cVar;
        this.f3611f = str;
        this.f3612g = str2;
        this.f3613h = str3;
        this.f3610e = file;
    }

    public static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24 || i10 > 34) {
            return null;
        }
        switch (i10) {
            case 24:
            case 25:
                return j.f23879e;
            case 26:
                return j.f23878d;
            case 27:
                return j.f23877c;
            case 28:
            case 29:
            case 30:
                return j.f23876b;
            case 31:
            case 32:
            case 33:
            case 34:
                return j.f23875a;
            default:
                return null;
        }
    }

    public static boolean j() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24 || i10 > 34) {
            return false;
        }
        if (i10 != 24 && i10 != 25) {
            switch (i10) {
                case 31:
                case 32:
                case 33:
                case 34:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public final b b(p1.c[] cVarArr, byte[] bArr) throws IOException {
        InputStream inputStreamG;
        try {
            inputStreamG = g(this.f3606a, this.f3613h);
        } catch (FileNotFoundException e10) {
            this.f3608c.a(9, e10);
        } catch (IOException e11) {
            this.f3608c.a(7, e11);
        } catch (IllegalStateException e12) {
            this.f3615j = null;
            this.f3608c.a(8, e12);
        }
        if (inputStreamG == null) {
            if (inputStreamG != null) {
                inputStreamG.close();
            }
            return null;
        }
        try {
            this.f3615j = c.q(inputStreamG, c.o(inputStreamG, c.f3618b), bArr, cVarArr);
            inputStreamG.close();
            return this;
        } catch (Throwable th) {
            try {
                inputStreamG.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        if (!this.f3614i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    public boolean e() throws IOException {
        if (this.f3609d == null) {
            k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f3610e.exists()) {
            try {
                this.f3610e.createNewFile();
            } catch (IOException unused) {
                k(4, null);
                return false;
            }
        } else if (!this.f3610e.canWrite()) {
            k(4, null);
            return false;
        }
        this.f3614i = true;
        return true;
    }

    public final InputStream f(AssetManager assetManager) {
        try {
            return g(assetManager, this.f3612g);
        } catch (FileNotFoundException e10) {
            this.f3608c.a(6, e10);
            return null;
        } catch (IOException e11) {
            this.f3608c.a(7, e11);
            return null;
        }
    }

    public final InputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f3608c.b(5, null);
            }
            return null;
        }
    }

    public b h() {
        b bVarB;
        c();
        if (this.f3609d != null) {
            InputStream inputStreamF = f(this.f3606a);
            if (inputStreamF != null) {
                this.f3615j = i(inputStreamF);
            }
            p1.c[] cVarArr = this.f3615j;
            if (cVarArr != null && j() && (bVarB = b(cVarArr, this.f3609d)) != null) {
                return bVarB;
            }
        }
        return this;
    }

    public final p1.c[] i(InputStream inputStream) throws IOException {
        try {
            try {
                try {
                    p1.c[] cVarArrW = c.w(inputStream, c.o(inputStream, c.f3617a), this.f3611f);
                    try {
                        inputStream.close();
                        return cVarArrW;
                    } catch (IOException e10) {
                        this.f3608c.a(7, e10);
                        return cVarArrW;
                    }
                } catch (IOException e11) {
                    this.f3608c.a(7, e11);
                    return null;
                }
            } catch (IllegalStateException e12) {
                this.f3608c.a(8, e12);
                return null;
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException e13) {
                this.f3608c.a(7, e13);
            }
        }
    }

    public final void k(final int i10, final Object obj) {
        this.f3607b.execute(new Runnable() { // from class: p1.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f23855a.f3608c.a(i10, obj);
            }
        });
    }

    public b l() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        p1.c[] cVarArr = this.f3615j;
        byte[] bArr = this.f3609d;
        if (cVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e10) {
                this.f3608c.a(7, e10);
            } catch (IllegalStateException e11) {
                this.f3608c.a(8, e11);
            }
            try {
                c.E(byteArrayOutputStream, bArr);
                if (!c.B(byteArrayOutputStream, bArr, cVarArr)) {
                    this.f3608c.a(5, null);
                    this.f3615j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f3616k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f3615j = null;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this;
    }

    public boolean m() {
        byte[] bArr = this.f3616k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f3610e);
                    try {
                        p1.d.l(byteArrayInputStream, fileOutputStream);
                        k(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e10) {
                k(6, e10);
                return false;
            } catch (IOException e11) {
                k(7, e11);
                return false;
            }
        } finally {
            this.f3616k = null;
            this.f3615j = null;
        }
    }
}
