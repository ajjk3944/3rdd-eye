package A0;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f56a;

    /* renamed from: b, reason: collision with root package name */
    public final f f57b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f58c;

    /* renamed from: d, reason: collision with root package name */
    public final File f59d;

    /* renamed from: e, reason: collision with root package name */
    public final String f60e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f61f = false;

    /* renamed from: g, reason: collision with root package name */
    public d[] f62g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f63h;

    public c(AssetManager assetManager, Executor executor, f fVar, String str, File file) {
        this.f56a = executor;
        this.f57b = fVar;
        this.f60e = str;
        this.f59d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i >= 24 && i <= 34) {
            switch (i) {
                case 24:
                case 25:
                    bArr = g.f81h;
                    break;
                case 26:
                    bArr = g.f80g;
                    break;
                case 27:
                    bArr = g.f79f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = g.f78e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = g.f77d;
                    break;
            }
        }
        this.f58c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e6) {
            String message = e6.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f57b.c();
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        this.f56a.execute(new b(i, 0, this, serializable));
    }
}
