package W4;

import W4.h;
import W4.i;
import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.e;
import s3.AbstractC7892g;
import s3.C7889d;

/* loaded from: classes3.dex */
public class e extends AbstractC7892g {
    public e(Context context, Looper looper, C7889d c7889d, e.a aVar, e.b bVar) {
        super(context, looper, 131, c7889d, aVar, bVar);
    }

    @Override // s3.AbstractC7888c
    protected String C() {
        return "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
    }

    @Override // s3.AbstractC7888c
    protected String D() {
        return "com.google.firebase.dynamiclinks.service.START";
    }

    @Override // s3.AbstractC7888c
    public boolean Q() {
        return true;
    }

    @Override // s3.AbstractC7888c, com.google.android.gms.common.api.a.f
    public int h() {
        return 12451000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // s3.AbstractC7888c
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public i q(IBinder iBinder) {
        return i.a.b(iBinder);
    }

    void k0(h.a aVar, String str) {
        try {
            ((i) B()).q(aVar, str);
        } catch (RemoteException unused) {
        }
    }
}
