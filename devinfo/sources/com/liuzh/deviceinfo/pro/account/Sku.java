package com.liuzh.deviceinfo.pro.account;

import a0.g;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.i0;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import d.h;
import nk.k;
import uf.b;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Keep
/* loaded from: classes3.dex */
public final class Sku implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Sku> CREATOR = new i0(8);
    private final long amount;
    private final int duration;

    @b("hwpay_sku_id")
    private final String hwpaySkuId;

    @b("limit_time")
    private final boolean limitTime;

    @b("ori_amount")
    private final long oriAmount;

    @b("sku_id")
    private final long skuId;

    public Sku(long j, long j8, long j9, int i4, boolean z3, String str) {
        k.e(str, "hwpaySkuId");
        this.skuId = j;
        this.oriAmount = j8;
        this.amount = j9;
        this.duration = i4;
        this.limitTime = z3;
        this.hwpaySkuId = str;
    }

    public static /* synthetic */ Sku copy$default(Sku sku, long j, long j8, long j9, int i4, boolean z3, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j = sku.skuId;
        }
        long j10 = j;
        if ((i10 & 2) != 0) {
            j8 = sku.oriAmount;
        }
        return sku.copy(j10, j8, (i10 & 4) != 0 ? sku.amount : j9, (i10 & 8) != 0 ? sku.duration : i4, (i10 & 16) != 0 ? sku.limitTime : z3, (i10 & 32) != 0 ? sku.hwpaySkuId : str);
    }

    public final long component1() {
        return this.skuId;
    }

    public final long component2() {
        return this.oriAmount;
    }

    public final long component3() {
        return this.amount;
    }

    public final int component4() {
        return this.duration;
    }

    public final boolean component5() {
        return this.limitTime;
    }

    public final String component6() {
        return this.hwpaySkuId;
    }

    public final Sku copy(long j, long j8, long j9, int i4, boolean z3, String str) {
        k.e(str, "hwpaySkuId");
        return new Sku(j, j8, j9, i4, z3, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String duration() throws Resources.NotFoundException {
        String string;
        int i4 = this.duration;
        if (i4 == -1) {
            string = DeviceInfoApp.f21145f.getString(R.string.lifetime);
        } else if (i4 == 30) {
            string = DeviceInfoApp.f21145f.getResources().getQuantityString(R.plurals.month, 1, 1);
        } else if (i4 != 365) {
            Resources resources = DeviceInfoApp.f21145f.getResources();
            int i10 = this.duration;
            string = resources.getQuantityString(R.plurals.day, i10, Integer.valueOf(i10));
        } else {
            string = DeviceInfoApp.f21145f.getResources().getQuantityString(R.plurals.year, 1, 1);
        }
        k.b(string);
        return string;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sku)) {
            return false;
        }
        Sku sku = (Sku) obj;
        return this.skuId == sku.skuId && this.oriAmount == sku.oriAmount && this.amount == sku.amount && this.duration == sku.duration && this.limitTime == sku.limitTime && k.a(this.hwpaySkuId, sku.hwpaySkuId);
    }

    public final long getAmount() {
        return this.amount;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final String getHwpaySkuId() {
        return this.hwpaySkuId;
    }

    public final boolean getLimitTime() {
        return this.limitTime;
    }

    public final long getOriAmount() {
        return this.oriAmount;
    }

    public final long getSkuId() {
        return this.skuId;
    }

    public int hashCode() {
        long j = this.skuId;
        long j8 = this.oriAmount;
        int i4 = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.amount;
        return this.hwpaySkuId.hashCode() + ((((((i4 + ((int) ((j9 >>> 32) ^ j9))) * 31) + this.duration) * 31) + (this.limitTime ? 1231 : 1237)) * 31);
    }

    public String toString() {
        long j = this.skuId;
        long j8 = this.oriAmount;
        long j9 = this.amount;
        int i4 = this.duration;
        boolean z3 = this.limitTime;
        String str = this.hwpaySkuId;
        StringBuilder sbY = h.y(j, "Sku(skuId=", ", oriAmount=");
        sbY.append(j8);
        g.A(sbY, ", amount=", j9, ", duration=");
        sbY.append(i4);
        sbY.append(", limitTime=");
        sbY.append(z3);
        sbY.append(", hwpaySkuId=");
        return h.w(sbY, str, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        k.e(parcel, "dest");
        parcel.writeLong(this.skuId);
        parcel.writeLong(this.oriAmount);
        parcel.writeLong(this.amount);
        parcel.writeInt(this.duration);
        parcel.writeInt(this.limitTime ? 1 : 0);
        parcel.writeString(this.hwpaySkuId);
    }
}
