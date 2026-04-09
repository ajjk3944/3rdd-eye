package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import s3.AbstractC7901p;
import t3.AbstractC8026a;

/* renamed from: com.google.android.gms.measurement.internal.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4877j extends AbstractC8026a {
    public static final Parcelable.Creator<C4877j> CREATOR = new C4869i();

    /* renamed from: a, reason: collision with root package name */
    public String f36543a;

    /* renamed from: b, reason: collision with root package name */
    public String f36544b;

    /* renamed from: c, reason: collision with root package name */
    public r7 f36545c;

    /* renamed from: d, reason: collision with root package name */
    public long f36546d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f36547e;

    /* renamed from: f, reason: collision with root package name */
    public String f36548f;

    /* renamed from: g, reason: collision with root package name */
    public L f36549g;

    /* renamed from: h, reason: collision with root package name */
    public long f36550h;

    /* renamed from: i, reason: collision with root package name */
    public L f36551i;

    /* renamed from: j, reason: collision with root package name */
    public long f36552j;

    /* renamed from: k, reason: collision with root package name */
    public L f36553k;

    C4877j(C4877j c4877j) {
        AbstractC7901p.l(c4877j);
        this.f36543a = c4877j.f36543a;
        this.f36544b = c4877j.f36544b;
        this.f36545c = c4877j.f36545c;
        this.f36546d = c4877j.f36546d;
        this.f36547e = c4877j.f36547e;
        this.f36548f = c4877j.f36548f;
        this.f36549g = c4877j.f36549g;
        this.f36550h = c4877j.f36550h;
        this.f36551i = c4877j.f36551i;
        this.f36552j = c4877j.f36552j;
        this.f36553k = c4877j.f36553k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.q(parcel, 2, this.f36543a, false);
        t3.b.q(parcel, 3, this.f36544b, false);
        t3.b.p(parcel, 4, this.f36545c, i10, false);
        t3.b.n(parcel, 5, this.f36546d);
        t3.b.c(parcel, 6, this.f36547e);
        t3.b.q(parcel, 7, this.f36548f, false);
        t3.b.p(parcel, 8, this.f36549g, i10, false);
        t3.b.n(parcel, 9, this.f36550h);
        t3.b.p(parcel, 10, this.f36551i, i10, false);
        t3.b.n(parcel, 11, this.f36552j);
        t3.b.p(parcel, 12, this.f36553k, i10, false);
        t3.b.b(parcel, iA);
    }

    C4877j(String str, String str2, r7 r7Var, long j10, boolean z10, String str3, L l10, long j11, L l11, long j12, L l12) {
        this.f36543a = str;
        this.f36544b = str2;
        this.f36545c = r7Var;
        this.f36546d = j10;
        this.f36547e = z10;
        this.f36548f = str3;
        this.f36549g = l10;
        this.f36550h = j11;
        this.f36551i = l11;
        this.f36552j = j12;
        this.f36553k = l12;
    }
}
