package H7;

import C.S;
import N2.u;
import a9.InterfaceC1676a;
import android.content.res.Resources;
import android.os.Handler;
import android.util.Log;
import b9.C2001h;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import p9.InterfaceC5480a;
import v.l0;

/* compiled from: ExecutionResult.kt */
/* loaded from: classes.dex */
public final class e implements InterfaceC1676a, L2.d, Z2.b, a7.k, I.c {

    /* renamed from: b, reason: collision with root package name */
    public Object f2291b;

    public /* synthetic */ e(Object obj) {
        this.f2291b = obj;
    }

    public void a(Runnable runnable) {
        ((Handler) this.f2291b).removeCallbacks(runnable);
    }

    @Override // Z2.b
    public u c(u uVar, L2.h hVar) {
        if (uVar == null) {
            return null;
        }
        return new U2.u((Resources) this.f2291b, uVar);
    }

    @Override // a7.k
    public a7.g d(String str, ArrayList arrayList) {
        return ((a7.k) this.f2291b).d(str, arrayList);
    }

    @Override // a7.k
    public a7.g e(String str, ArrayList arrayList) {
        return ((a7.k) this.f2291b).e(str, arrayList);
    }

    @Override // L2.d
    public boolean f(Object obj, File file, L2.h hVar) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        O2.g gVar = (O2.g) this.f2291b;
        byte[] bArr = (byte[]) gVar.d(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    } catch (IOException e4) {
                        e = e4;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        gVar.h(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        gVar.h(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                gVar.h(bArr);
                return true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e10) {
            e = e10;
        }
    }

    public void g(Runnable runnable, long j4) {
        ((Handler) this.f2291b).postDelayed(runnable, j4);
    }

    @Override // a9.InterfaceC1676a
    public Object get() {
        return ((b9.p) this.f2291b).getValue();
    }

    @Override // I.c
    public void onFailure(Throwable th) {
        S.c("ProcessingCaptureSession", "open session failed ", th);
        l0 l0Var = (l0) this.f2291b;
        l0Var.close();
        l0Var.release();
    }

    @Override // I.c
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    public e(InterfaceC5480a init) {
        kotlin.jvm.internal.l.f(init, "init");
        this.f2291b = C2001h.b(init);
    }
}
