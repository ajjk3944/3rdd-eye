package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import r3.C7564b;
import s3.AbstractC7900o;
import s3.AbstractC7901p;
import t3.AbstractC8026a;

/* loaded from: classes.dex */
public final class Status extends AbstractC8026a implements g, ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    private final int f34722a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34723b;

    /* renamed from: c, reason: collision with root package name */
    private final PendingIntent f34724c;

    /* renamed from: d, reason: collision with root package name */
    private final C7564b f34725d;

    /* renamed from: e, reason: collision with root package name */
    public static final Status f34714e = new Status(-1);

    /* renamed from: f, reason: collision with root package name */
    public static final Status f34715f = new Status(0);

    /* renamed from: g, reason: collision with root package name */
    public static final Status f34716g = new Status(14);

    /* renamed from: h, reason: collision with root package name */
    public static final Status f34717h = new Status(8);

    /* renamed from: i, reason: collision with root package name */
    public static final Status f34718i = new Status(15);

    /* renamed from: j, reason: collision with root package name */
    public static final Status f34719j = new Status(16);

    /* renamed from: l, reason: collision with root package name */
    public static final Status f34721l = new Status(17);

    /* renamed from: k, reason: collision with root package name */
    public static final Status f34720k = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new l();

    Status(int i10, String str, PendingIntent pendingIntent, C7564b c7564b) {
        this.f34722a = i10;
        this.f34723b = str;
        this.f34724c = pendingIntent;
        this.f34725d = c7564b;
    }

    public C7564b b() {
        return this.f34725d;
    }

    public int e() {
        return this.f34722a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f34722a == status.f34722a && AbstractC7900o.a(this.f34723b, status.f34723b) && AbstractC7900o.a(this.f34724c, status.f34724c) && AbstractC7900o.a(this.f34725d, status.f34725d);
    }

    public String f() {
        return this.f34723b;
    }

    public boolean g() {
        return this.f34724c != null;
    }

    public int hashCode() {
        return AbstractC7900o.b(Integer.valueOf(this.f34722a), this.f34723b, this.f34724c, this.f34725d);
    }

    public boolean i() {
        return this.f34722a <= 0;
    }

    public void j(Activity activity, int i10) throws IntentSender.SendIntentException {
        if (g()) {
            Bundle bundle = com.google.android.gms.common.util.k.i() ? ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle() : null;
            PendingIntent pendingIntent = this.f34724c;
            AbstractC7901p.l(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, null, 0, 0, 0, bundle);
        }
    }

    public final String k() {
        String str = this.f34723b;
        return str != null ? str : b.a(this.f34722a);
    }

    public String toString() {
        AbstractC7900o.a aVarC = AbstractC7900o.c(this);
        aVarC.a("statusCode", k());
        aVarC.a("resolution", this.f34724c);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = t3.b.a(parcel);
        t3.b.k(parcel, 1, e());
        t3.b.q(parcel, 2, f(), false);
        t3.b.p(parcel, 3, this.f34724c, i10, false);
        t3.b.p(parcel, 4, b(), i10, false);
        t3.b.b(parcel, iA);
    }

    public Status(int i10) {
        this(i10, (String) null);
    }

    public Status(C7564b c7564b, String str) {
        this(c7564b, str, 17);
    }

    public Status(int i10, String str) {
        this(i10, str, (PendingIntent) null);
    }

    public Status(C7564b c7564b, String str, int i10) {
        this(i10, str, c7564b.f(), c7564b);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(i10, str, pendingIntent, null);
    }
}
