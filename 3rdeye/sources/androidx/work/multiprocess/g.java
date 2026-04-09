package androidx.work.multiprocess;

import android.os.IBinder;
import android.os.RemoteException;
import androidx.work.multiprocess.c;
import d2.C4268c;
import java.util.NoSuchElementException;

/* compiled from: RemoteCallback.java */
/* loaded from: classes.dex */
public class g extends c.a {

    /* renamed from: b, reason: collision with root package name */
    public final C4268c<byte[]> f17005b;

    /* renamed from: c, reason: collision with root package name */
    public IBinder f17006c;

    /* renamed from: d, reason: collision with root package name */
    public final a f17007d;

    /* compiled from: RemoteCallback.java */
    public static class a implements IBinder.DeathRecipient {

        /* renamed from: a, reason: collision with root package name */
        public final g f17008a;

        public a(g gVar) {
            this.f17008a = gVar;
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            this.f17008a.onFailure("Binder died");
        }
    }

    public g() {
        attachInterface(this, c.f16985i8);
        this.f17006c = null;
        this.f17005b = new C4268c<>();
        this.f17007d = new a(this);
    }

    @Override // androidx.work.multiprocess.c
    public final void n(byte[] bArr) throws RemoteException {
        this.f17005b.i(bArr);
        IBinder iBinder = this.f17006c;
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this.f17007d, 0);
            } catch (NoSuchElementException unused) {
            }
        }
        w();
    }

    @Override // androidx.work.multiprocess.c
    public final void onFailure(String str) {
        this.f17005b.j(new RuntimeException(str));
        IBinder iBinder = this.f17006c;
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this.f17007d, 0);
            } catch (NoSuchElementException unused) {
            }
        }
        w();
    }

    public void w() {
    }
}
