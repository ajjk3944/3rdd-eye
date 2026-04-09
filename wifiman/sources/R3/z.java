package r3;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import t3.AbstractC8026a;
import x3.InterfaceC8420a;

/* loaded from: classes.dex */
public final class z extends AbstractC8026a {
    public static final Parcelable.Creator<z> CREATOR = new C7562A();

    /* renamed from: a, reason: collision with root package name */
    private final String f60117a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f60118b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f60119c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f60120d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f60121e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f60122f;

    z(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13) {
        this.f60117a = str;
        this.f60118b = z10;
        this.f60119c = z11;
        this.f60120d = (Context) x3.b.f(InterfaceC8420a.AbstractBinderC2309a.c(iBinder));
        this.f60121e = z12;
        this.f60122f = z13;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.IBinder, x3.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f60117a;
        int iA = t3.b.a(parcel);
        t3.b.q(parcel, 1, str, false);
        t3.b.c(parcel, 2, this.f60118b);
        t3.b.c(parcel, 3, this.f60119c);
        t3.b.j(parcel, 4, x3.b.n0(this.f60120d), false);
        t3.b.c(parcel, 5, this.f60121e);
        t3.b.c(parcel, 6, this.f60122f);
        t3.b.b(parcel, iA);
    }
}
