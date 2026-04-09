package r3;

import android.app.Notification;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final String f32775a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32776b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f32777c;

    public u(String str, int i4, Notification notification) {
        this.f32775a = str;
        this.f32776b = i4;
        this.f32777c = notification;
    }

    public final void a(c.c cVar) {
        String str = this.f32775a;
        int i4 = this.f32776b;
        c.a aVar = (c.a) cVar;
        aVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(c.c.F8);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i4);
            parcelObtain.writeString(null);
            Notification notification = this.f32777c;
            if (notification != null) {
                parcelObtain.writeInt(1);
                notification.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            aVar.f2351a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f32775a);
        sb2.append(", id:");
        return r5.c.j(this.f32776b, ", tag:null]", sb2);
    }
}
