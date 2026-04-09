package defpackage;

import android.os.RemoteException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zs3 {
    public static final zs3 c = new zs3("TINK");
    public static final zs3 d = new zs3("NO_PREFIX");
    public final /* synthetic */ int a = 0;
    public final String b;

    public zs3(String str) {
        this.b = str;
    }

    public final String toString() {
        switch (this.a) {
        }
        return this.b;
    }

    public zs3(nq2 nq2Var) {
        String strB;
        try {
            strB = nq2Var.b();
        } catch (RemoteException e) {
            gi2.c0("", e);
            strB = null;
        }
        this.b = strB;
    }
}
