package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qo {
    public final Executor a;
    public final qm0 b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public so[] g;
    public byte[] h;

    public qo(AssetManager assetManager, Executor executor, qm0 qm0Var, String str, File file) {
        byte[] bArr;
        this.a = executor;
        this.b = qm0Var;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 26:
                    bArr = ob1.g;
                    break;
                case 27:
                    bArr = ob1.f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = ob1.e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = ob1.d;
        }
        this.c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    public final void b(final int i, final Serializable serializable) {
        this.a.execute(new Runnable() { // from class: po
            @Override // java.lang.Runnable
            public final void run() {
                this.f.b.i(i, serializable);
            }
        });
    }
}
