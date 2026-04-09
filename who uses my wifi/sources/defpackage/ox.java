package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ox implements kz0 {
    public final Context f;
    public final String g;
    public final l92 h;
    public final boolean i;
    public final Object j = new Object();
    public nx k;
    public boolean l;

    public ox(Context context, String str, l92 l92Var, boolean z) {
        this.f = context;
        this.g = str;
        this.h = l92Var;
        this.i = z;
    }

    public final nx a() {
        nx nxVar;
        synchronized (this.j) {
            try {
                if (this.k == null) {
                    lx[] lxVarArr = new lx[1];
                    if (this.g == null || !this.i) {
                        this.k = new nx(this.f, this.g, lxVarArr, this.h);
                    } else {
                        this.k = new nx(this.f, new File(this.f.getNoBackupFilesDir(), this.g).getAbsolutePath(), lxVarArr, this.h);
                    }
                    this.k.setWriteAheadLoggingEnabled(this.l);
                }
                nxVar = this.k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nxVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a().close();
    }

    @Override // defpackage.kz0
    public final lx j() {
        return a().c();
    }

    @Override // defpackage.kz0
    public final void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.j) {
            try {
                nx nxVar = this.k;
                if (nxVar != null) {
                    nxVar.setWriteAheadLoggingEnabled(z);
                }
                this.l = z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
