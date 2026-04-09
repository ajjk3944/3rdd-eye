package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import u1.C5619b;
import u1.RunnableC5618a;
import u1.g;

/* compiled from: DeviceProfileWriter.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f16348a;

    /* renamed from: b, reason: collision with root package name */
    public final c.InterfaceC0258c f16349b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f16350c;

    /* renamed from: d, reason: collision with root package name */
    public final File f16351d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16352e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16353f = false;

    /* renamed from: g, reason: collision with root package name */
    public C5619b[] f16354g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f16355h;

    public b(AssetManager assetManager, Executor executor, c.InterfaceC0258c interfaceC0258c, String str, File file) {
        this.f16348a = executor;
        this.f16349b = interfaceC0258c;
        this.f16352e = str;
        this.f16351d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i >= 24 && i <= 34) {
            switch (i) {
                case 24:
                case 25:
                    bArr = g.f46530e;
                    break;
                case 26:
                    bArr = g.f46529d;
                    break;
                case 27:
                    bArr = g.f46528c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = g.f46527b;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = g.f46526a;
                    break;
            }
        }
        this.f16350c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e4) {
            String message = e4.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f16349b.b();
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        this.f16348a.execute(new RunnableC5618a(this, i, 0, serializable));
    }
}
