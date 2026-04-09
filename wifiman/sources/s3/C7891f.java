package s3;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import r3.C7566d;
import s3.InterfaceC7895j;
import t3.AbstractC8026a;

/* renamed from: s3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7891f extends AbstractC8026a {
    public static final Parcelable.Creator<C7891f> CREATOR = new g0();

    /* renamed from: o, reason: collision with root package name */
    static final Scope[] f61268o = new Scope[0];

    /* renamed from: p, reason: collision with root package name */
    static final C7566d[] f61269p = new C7566d[0];

    /* renamed from: a, reason: collision with root package name */
    final int f61270a;

    /* renamed from: b, reason: collision with root package name */
    final int f61271b;

    /* renamed from: c, reason: collision with root package name */
    final int f61272c;

    /* renamed from: d, reason: collision with root package name */
    String f61273d;

    /* renamed from: e, reason: collision with root package name */
    IBinder f61274e;

    /* renamed from: f, reason: collision with root package name */
    Scope[] f61275f;

    /* renamed from: g, reason: collision with root package name */
    Bundle f61276g;

    /* renamed from: h, reason: collision with root package name */
    Account f61277h;

    /* renamed from: i, reason: collision with root package name */
    C7566d[] f61278i;

    /* renamed from: j, reason: collision with root package name */
    C7566d[] f61279j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f61280k;

    /* renamed from: l, reason: collision with root package name */
    final int f61281l;

    /* renamed from: m, reason: collision with root package name */
    boolean f61282m;

    /* renamed from: n, reason: collision with root package name */
    private final String f61283n;

    C7891f(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C7566d[] c7566dArr, C7566d[] c7566dArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f61268o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        c7566dArr = c7566dArr == null ? f61269p : c7566dArr;
        c7566dArr2 = c7566dArr2 == null ? f61269p : c7566dArr2;
        this.f61270a = i10;
        this.f61271b = i11;
        this.f61272c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f61273d = "com.google.android.gms";
        } else {
            this.f61273d = str;
        }
        if (i10 < 2) {
            this.f61277h = iBinder != null ? AbstractBinderC7886a.f(InterfaceC7895j.a.c(iBinder)) : null;
        } else {
            this.f61274e = iBinder;
            this.f61277h = account;
        }
        this.f61275f = scopeArr;
        this.f61276g = bundle;
        this.f61278i = c7566dArr;
        this.f61279j = c7566dArr2;
        this.f61280k = z10;
        this.f61281l = i13;
        this.f61282m = z11;
        this.f61283n = str2;
    }

    public String b() {
        return this.f61283n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        g0.a(this, parcel, i10);
    }
}
