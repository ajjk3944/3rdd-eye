package g1;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.p1;
import p.l3;
import p.x2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24269a;

    public /* synthetic */ p(int i4) {
        this.f24269a = i4;
    }

    public static q a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = p.class.getClassLoader();
        }
        int i4 = parcel.readInt();
        if (i4 == 0) {
            return new q();
        }
        y0.e eVarF = y0.h.f37308b.f();
        for (int i10 = 0; i10 < i4; i10++) {
            eVarF.add(parcel.readValue(classLoader));
        }
        return new q(eVarF.d());
    }

    public static v b(Parcel parcel, ClassLoader classLoader) {
        v vVar = new v();
        if (classLoader == null) {
            classLoader = v.class.getClassLoader();
        }
        int i4 = parcel.readInt();
        for (int i10 = 0; i10 < i4; i10++) {
            vVar.add(parcel.readValue(classLoader));
        }
        return vVar;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f24269a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                return new p1(parcel, classLoader);
            case 2:
                return new fd.e(parcel, classLoader);
            case 3:
                return b(parcel, classLoader);
            case 4:
                return new id.a(parcel, classLoader);
            case 5:
                return new kd.b0(parcel, classLoader);
            case 6:
                if (parcel.readParcelable(classLoader) == null) {
                    return m4.b.f28875b;
                }
                throw new IllegalStateException("superState must be null");
            case 7:
                return new n6.f(parcel, classLoader);
            case 8:
                return new oc.c(parcel, classLoader);
            case 9:
                return new x2(parcel, classLoader);
            case 10:
                return new l3(parcel, classLoader);
            case 11:
                return new p3.f(parcel, classLoader);
            case 12:
                return new pc.d(parcel, classLoader);
            default:
                return new zc.a(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.f24269a) {
            case 0:
                return new q[i4];
            case 1:
                return new p1[i4];
            case 2:
                return new fd.e[i4];
            case 3:
                return new v[i4];
            case 4:
                return new id.a[i4];
            case 5:
                return new kd.b0[i4];
            case 6:
                return new m4.b[i4];
            case 7:
                return new n6.f[i4];
            case 8:
                return new oc.c[i4];
            case 9:
                return new x2[i4];
            case 10:
                return new l3[i4];
            case 11:
                return new p3.f[i4];
            case 12:
                return new pc.d[i4];
            default:
                return new zc.a[i4];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f24269a) {
            case 0:
                return a(parcel, null);
            case 1:
                return new p1(parcel, null);
            case 2:
                return new fd.e(parcel, null);
            case 3:
                return b(parcel, null);
            case 4:
                return new id.a(parcel, null);
            case 5:
                return new kd.b0(parcel, null);
            case 6:
                if (parcel.readParcelable(null) == null) {
                    return m4.b.f28875b;
                }
                throw new IllegalStateException("superState must be null");
            case 7:
                return new n6.f(parcel, null);
            case 8:
                return new oc.c(parcel, null);
            case 9:
                return new x2(parcel, null);
            case 10:
                return new l3(parcel, null);
            case 11:
                return new p3.f(parcel, null);
            case 12:
                return new pc.d(parcel, null);
            default:
                return new zc.a(parcel, null);
        }
    }
}
