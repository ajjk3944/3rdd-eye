package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.h;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f31737a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f31738b;

    /* renamed from: c, reason: collision with root package name */
    private final h.c f31739c;

    /* renamed from: e, reason: collision with root package name */
    private final File f31741e;

    /* renamed from: f, reason: collision with root package name */
    private final String f31742f;

    /* renamed from: g, reason: collision with root package name */
    private final String f31743g;

    /* renamed from: h, reason: collision with root package name */
    private final String f31744h;

    /* renamed from: j, reason: collision with root package name */
    private d[] f31746j;

    /* renamed from: k, reason: collision with root package name */
    private byte[] f31747k;

    /* renamed from: i, reason: collision with root package name */
    private boolean f31745i = false;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f31740d = d();

    public c(AssetManager assetManager, Executor executor, h.c cVar, String str, String str2, String str3, File file) {
        this.f31737a = assetManager;
        this.f31738b = executor;
        this.f31739c = cVar;
        this.f31742f = str;
        this.f31743g = str2;
        this.f31744h = str3;
        this.f31741e = file;
    }

    private c b(d[] dVarArr, byte[] bArr) throws IOException {
        InputStream inputStreamH;
        try {
            inputStreamH = h(this.f31737a, this.f31744h);
        } catch (FileNotFoundException e10) {
            this.f31739c.b(9, e10);
        } catch (IOException e11) {
            this.f31739c.b(7, e11);
        } catch (IllegalStateException e12) {
            this.f31746j = null;
            this.f31739c.b(8, e12);
        }
        if (inputStreamH == null) {
            if (inputStreamH != null) {
                inputStreamH.close();
            }
            return null;
        }
        try {
            this.f31746j = l.r(inputStreamH, l.p(inputStreamH, l.f31767b), bArr, dVarArr);
            inputStreamH.close();
            return this;
        } catch (Throwable th2) {
            try {
                inputStreamH.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private void c() {
        if (!this.f31745i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return n.f31779a;
        }
        switch (i10) {
            case 26:
                return n.f31782d;
            case 27:
                return n.f31781c;
            case 28:
            case 29:
            case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                return n.f31780b;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        try {
            return h(assetManager, this.f31743g);
        } catch (FileNotFoundException e10) {
            this.f31739c.b(6, e10);
            return null;
        } catch (IOException e11) {
            this.f31739c.b(7, e11);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(int i10, Object obj) {
        this.f31739c.b(i10, obj);
    }

    private InputStream h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f31739c.a(5, null);
            }
            return null;
        }
    }

    private d[] j(InputStream inputStream) throws IOException {
        try {
            try {
                try {
                    try {
                        d[] dVarArrX = l.x(inputStream, l.p(inputStream, l.f31766a), this.f31742f);
                        try {
                            inputStream.close();
                            return dVarArrX;
                        } catch (IOException e10) {
                            this.f31739c.b(7, e10);
                            return dVarArrX;
                        }
                    } catch (IOException e11) {
                        this.f31739c.b(7, e11);
                        inputStream.close();
                        return null;
                    }
                } catch (IllegalStateException e12) {
                    this.f31739c.b(8, e12);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e13) {
                this.f31739c.b(7, e13);
                return null;
            }
        } catch (Throwable th2) {
            try {
                inputStream.close();
            } catch (IOException e14) {
                this.f31739c.b(7, e14);
            }
            throw th2;
        }
    }

    private static boolean k() {
        return Build.VERSION.SDK_INT >= 31;
    }

    private void l(final int i10, final Object obj) {
        this.f31738b.execute(new Runnable() { // from class: androidx.profileinstaller.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f31734a.g(i10, obj);
            }
        });
    }

    public boolean e() {
        if (this.f31740d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f31741e.exists()) {
            try {
                if (!this.f31741e.createNewFile()) {
                    l(4, null);
                    return false;
                }
            } catch (IOException unused) {
                l(4, null);
                return false;
            }
        } else if (!this.f31741e.canWrite()) {
            l(4, null);
            return false;
        }
        this.f31745i = true;
        return true;
    }

    public c i() {
        c cVarB;
        c();
        if (this.f31740d == null) {
            return this;
        }
        InputStream inputStreamF = f(this.f31737a);
        if (inputStreamF != null) {
            this.f31746j = j(inputStreamF);
        }
        d[] dVarArr = this.f31746j;
        return (dVarArr == null || !k() || (cVarB = b(dVarArr, this.f31740d)) == null) ? this : cVarB;
    }

    public c m() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        d[] dVarArr = this.f31746j;
        byte[] bArr = this.f31740d;
        if (dVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e10) {
                this.f31739c.b(7, e10);
            } catch (IllegalStateException e11) {
                this.f31739c.b(8, e11);
            }
            try {
                l.F(byteArrayOutputStream, bArr);
                if (!l.C(byteArrayOutputStream, bArr, dVarArr)) {
                    this.f31739c.b(5, null);
                    this.f31746j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f31747k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f31746j = null;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return this;
    }

    public boolean n() {
        byte[] bArr = this.f31747k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f31741e);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock fileLockTryLock = channel.tryLock();
                            try {
                                e.l(byteArrayInputStream, fileOutputStream, fileLockTryLock);
                                l(1, null);
                                if (fileLockTryLock != null) {
                                    fileLockTryLock.close();
                                }
                                channel.close();
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                return true;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (FileNotFoundException e10) {
                l(6, e10);
                return false;
            } catch (IOException e11) {
                l(7, e11);
                return false;
            }
        } finally {
            this.f31747k = null;
            this.f31746j = null;
        }
    }
}
