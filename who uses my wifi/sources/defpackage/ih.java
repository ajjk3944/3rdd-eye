package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ih {
    public final ArrayList a = new ArrayList();

    public ih(x12 x12Var) {
        b22 a22Var;
        try {
            x12Var.d();
        } catch (RemoteException e) {
            gi2.c0("", e);
        }
        try {
            ArrayList arrayListH = x12Var.h();
            int size = arrayListH.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListH.get(i);
                i++;
                if (obj instanceof IBinder) {
                    IBinder iBinder = (IBinder) obj;
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    a22Var = iInterfaceQueryLocalInterface instanceof b22 ? (b22) iInterfaceQueryLocalInterface : new a22(iBinder);
                } else {
                    a22Var = null;
                }
                if (a22Var != null) {
                    this.a.add(new c22(a22Var));
                }
            }
        } catch (RemoteException e2) {
            gi2.c0("", e2);
        }
    }

    public void a(Path path) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e31 e31Var = (e31) arrayList.get(size);
            Matrix matrix = l41.a;
            if (e31Var != null && !e31Var.a) {
                l41.a(path, e31Var.d.l() / 100.0f, e31Var.e.l() / 100.0f, e31Var.f.l() / 360.0f);
            }
        }
    }

    public ih() {
    }
}
