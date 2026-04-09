package com.staircase3.opensignal.osca.domain.model;

import ac.l;
import android.os.Parcel;
import android.os.Parcelable;
import bh.m;
import c7.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/staircase3/opensignal/osca/domain/model/ResolutionCardInfo;", "Landroid/os/Parcelable;", "io/sentry/config/a", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ResolutionCardInfo implements Parcelable {
    public static final Parcelable.Creator<ResolutionCardInfo> CREATOR = new l(17);

    /* renamed from: a, reason: collision with root package name */
    public final String f6133a;

    /* renamed from: d, reason: collision with root package name */
    public final String f6134d;

    /* renamed from: g, reason: collision with root package name */
    public final String f6135g;

    /* renamed from: r, reason: collision with root package name */
    public final m f6136r;

    /* renamed from: x, reason: collision with root package name */
    public final int f6137x;

    public ResolutionCardInfo(String str, String str2, String str3, m mVar, int i10) {
        br.l.e(str, "title");
        br.l.e(str2, "content");
        br.l.e(mVar, "assistantSolution");
        this.f6133a = str;
        this.f6134d = str2;
        this.f6135g = str3;
        this.f6136r = mVar;
        this.f6137x = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolutionCardInfo)) {
            return false;
        }
        ResolutionCardInfo resolutionCardInfo = (ResolutionCardInfo) obj;
        return br.l.a(this.f6133a, resolutionCardInfo.f6133a) && br.l.a(this.f6134d, resolutionCardInfo.f6134d) && br.l.a(this.f6135g, resolutionCardInfo.f6135g) && this.f6136r == resolutionCardInfo.f6136r && this.f6137x == resolutionCardInfo.f6137x;
    }

    public final int hashCode() {
        int iG = a.g(this.f6134d, this.f6133a.hashCode() * 31, 31);
        String str = this.f6135g;
        return Integer.hashCode(this.f6137x) + ((this.f6136r.hashCode() + ((iG + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResolutionCardInfo(title=");
        sb2.append(this.f6133a);
        sb2.append(", content=");
        sb2.append(this.f6134d);
        sb2.append(", buttonActionUrl=");
        sb2.append(this.f6135g);
        sb2.append(", assistantSolution=");
        sb2.append(this.f6136r);
        sb2.append(", parentResultCode=");
        return a.q(sb2, this.f6137x, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        br.l.e(parcel, "dest");
        parcel.writeString(this.f6133a);
        parcel.writeString(this.f6134d);
        parcel.writeString(this.f6135g);
        parcel.writeString(this.f6136r.name());
        parcel.writeInt(this.f6137x);
    }
}
