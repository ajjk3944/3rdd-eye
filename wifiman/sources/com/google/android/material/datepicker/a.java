package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1205a();

    /* renamed from: a, reason: collision with root package name */
    private final m f37337a;

    /* renamed from: b, reason: collision with root package name */
    private final m f37338b;

    /* renamed from: c, reason: collision with root package name */
    private final c f37339c;

    /* renamed from: d, reason: collision with root package name */
    private m f37340d;

    /* renamed from: e, reason: collision with root package name */
    private final int f37341e;

    /* renamed from: f, reason: collision with root package name */
    private final int f37342f;

    /* renamed from: g, reason: collision with root package name */
    private final int f37343g;

    /* renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    class C1205a implements Parcelable.Creator {
        C1205a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a((m) parcel.readParcelable(m.class.getClassLoader()), (m) parcel.readParcelable(m.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (m) parcel.readParcelable(m.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public static final class b {

        /* renamed from: f, reason: collision with root package name */
        static final long f37344f = t.a(m.b(1900, 0).f37449f);

        /* renamed from: g, reason: collision with root package name */
        static final long f37345g = t.a(m.b(2100, 11).f37449f);

        /* renamed from: a, reason: collision with root package name */
        private long f37346a;

        /* renamed from: b, reason: collision with root package name */
        private long f37347b;

        /* renamed from: c, reason: collision with root package name */
        private Long f37348c;

        /* renamed from: d, reason: collision with root package name */
        private int f37349d;

        /* renamed from: e, reason: collision with root package name */
        private c f37350e;

        b(a aVar) {
            this.f37346a = f37344f;
            this.f37347b = f37345g;
            this.f37350e = f.a(Long.MIN_VALUE);
            this.f37346a = aVar.f37337a.f37449f;
            this.f37347b = aVar.f37338b.f37449f;
            this.f37348c = Long.valueOf(aVar.f37340d.f37449f);
            this.f37349d = aVar.f37341e;
            this.f37350e = aVar.f37339c;
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f37350e);
            m mVarC = m.c(this.f37346a);
            m mVarC2 = m.c(this.f37347b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f37348c;
            return new a(mVarC, mVarC2, cVar, l10 == null ? null : m.c(l10.longValue()), this.f37349d, null);
        }

        public b b(long j10) {
            this.f37348c = Long.valueOf(j10);
            return this;
        }
    }

    public interface c extends Parcelable {
        boolean s(long j10);
    }

    /* synthetic */ a(m mVar, m mVar2, c cVar, m mVar3, int i10, C1205a c1205a) {
        this(mVar, mVar2, cVar, mVar3, i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f37337a.equals(aVar.f37337a) && this.f37338b.equals(aVar.f37338b) && E1.d.a(this.f37340d, aVar.f37340d) && this.f37341e == aVar.f37341e && this.f37339c.equals(aVar.f37339c);
    }

    public c f() {
        return this.f37339c;
    }

    m g() {
        return this.f37338b;
    }

    int h() {
        return this.f37341e;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f37337a, this.f37338b, this.f37340d, Integer.valueOf(this.f37341e), this.f37339c});
    }

    int i() {
        return this.f37343g;
    }

    m j() {
        return this.f37340d;
    }

    m k() {
        return this.f37337a;
    }

    int l() {
        return this.f37342f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f37337a, 0);
        parcel.writeParcelable(this.f37338b, 0);
        parcel.writeParcelable(this.f37340d, 0);
        parcel.writeParcelable(this.f37339c, 0);
        parcel.writeInt(this.f37341e);
    }

    private a(m mVar, m mVar2, c cVar, m mVar3, int i10) {
        Objects.requireNonNull(mVar, "start cannot be null");
        Objects.requireNonNull(mVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f37337a = mVar;
        this.f37338b = mVar2;
        this.f37340d = mVar3;
        this.f37341e = i10;
        this.f37339c = cVar;
        if (mVar3 != null && mVar.compareTo(mVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (mVar3 != null && mVar3.compareTo(mVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > t.i().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f37343g = mVar.r(mVar2) + 1;
        this.f37342f = (mVar2.f37446c - mVar.f37446c) + 1;
    }
}
