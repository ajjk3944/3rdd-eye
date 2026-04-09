package com.liuzh.deviceinfo.monitor;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.internal.Buffer;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import j4.g;
import java.util.Iterator;
import java.util.List;
import je.u;
import nk.f;
import nk.k;
import r5.c;
import wg.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Keep
/* loaded from: classes3.dex */
public final class CustomMonitorConfig implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CustomMonitorConfig> CREATOR = new g(26);
    private final long addedTime;
    private final float containerPaddingDp;
    private final List<s> content;
    private final boolean darkText;

    /* renamed from: id, reason: collision with root package name */
    private final String f21222id;
    private final boolean isShowing;
    private final float itemSpacingDp;
    private final int landscapeX;
    private final int landscapeY;
    private final long modifiedTime;
    private final boolean moveable;
    private final String name;
    private final int portraitX;
    private final int portraitY;
    private final boolean showName;
    private final float textSizeSp;
    private final float transparency;
    private final boolean verticalLayout;

    /* JADX WARN: Multi-variable type inference failed */
    public CustomMonitorConfig(String str, String str2, boolean z3, float f10, float f11, boolean z10, float f12, float f13, int i4, int i10, int i11, int i12, long j, long j8, boolean z11, boolean z12, boolean z13, List<? extends s> list) {
        k.e(str, FacebookMediationAdapter.KEY_ID);
        k.e(str2, "name");
        k.e(list, AppLovinEventTypes.USER_VIEWED_CONTENT);
        this.f21222id = str;
        this.name = str2;
        this.darkText = z3;
        this.textSizeSp = f10;
        this.transparency = f11;
        this.verticalLayout = z10;
        this.containerPaddingDp = f12;
        this.itemSpacingDp = f13;
        this.landscapeX = i4;
        this.landscapeY = i10;
        this.portraitX = i11;
        this.portraitY = i12;
        this.addedTime = j;
        this.modifiedTime = j8;
        this.moveable = z11;
        this.showName = z12;
        this.isShowing = z13;
        this.content = list;
    }

    public static /* synthetic */ CustomMonitorConfig copy$default(CustomMonitorConfig customMonitorConfig, String str, String str2, boolean z3, float f10, float f11, boolean z10, float f12, float f13, int i4, int i10, int i11, int i12, long j, long j8, boolean z11, boolean z12, boolean z13, List list, int i13, Object obj) {
        List list2;
        boolean z14;
        String str3 = (i13 & 1) != 0 ? customMonitorConfig.f21222id : str;
        String str4 = (i13 & 2) != 0 ? customMonitorConfig.name : str2;
        boolean z15 = (i13 & 4) != 0 ? customMonitorConfig.darkText : z3;
        float f14 = (i13 & 8) != 0 ? customMonitorConfig.textSizeSp : f10;
        float f15 = (i13 & 16) != 0 ? customMonitorConfig.transparency : f11;
        boolean z16 = (i13 & 32) != 0 ? customMonitorConfig.verticalLayout : z10;
        float f16 = (i13 & 64) != 0 ? customMonitorConfig.containerPaddingDp : f12;
        float f17 = (i13 & 128) != 0 ? customMonitorConfig.itemSpacingDp : f13;
        int i14 = (i13 & 256) != 0 ? customMonitorConfig.landscapeX : i4;
        int i15 = (i13 & 512) != 0 ? customMonitorConfig.landscapeY : i10;
        int i16 = (i13 & Segment.SHARE_MINIMUM) != 0 ? customMonitorConfig.portraitX : i11;
        int i17 = (i13 & 2048) != 0 ? customMonitorConfig.portraitY : i12;
        long j9 = (i13 & Buffer.SEGMENTING_THRESHOLD) != 0 ? customMonitorConfig.addedTime : j;
        String str5 = str3;
        String str6 = str4;
        long j10 = (i13 & Segment.SIZE) != 0 ? customMonitorConfig.modifiedTime : j8;
        boolean z17 = (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? customMonitorConfig.moveable : z11;
        boolean z18 = (32768 & i13) != 0 ? customMonitorConfig.showName : z12;
        boolean z19 = (i13 & 65536) != 0 ? customMonitorConfig.isShowing : z13;
        if ((i13 & 131072) != 0) {
            z14 = z19;
            list2 = customMonitorConfig.content;
        } else {
            list2 = list;
            z14 = z19;
        }
        return customMonitorConfig.copy(str5, str6, z15, f14, f15, z16, f16, f17, i14, i15, i16, i17, j9, j10, z17, z18, z14, list2);
    }

    public final String component1() {
        return this.f21222id;
    }

    public final int component10() {
        return this.landscapeY;
    }

    public final int component11() {
        return this.portraitX;
    }

    public final int component12() {
        return this.portraitY;
    }

    public final long component13() {
        return this.addedTime;
    }

    public final long component14() {
        return this.modifiedTime;
    }

    public final boolean component15() {
        return this.moveable;
    }

    public final boolean component16() {
        return this.showName;
    }

    public final boolean component17() {
        return this.isShowing;
    }

    public final List<s> component18() {
        return this.content;
    }

    public final String component2() {
        return this.name;
    }

    public final boolean component3() {
        return this.darkText;
    }

    public final float component4() {
        return this.textSizeSp;
    }

    public final float component5() {
        return this.transparency;
    }

    public final boolean component6() {
        return this.verticalLayout;
    }

    public final float component7() {
        return this.containerPaddingDp;
    }

    public final float component8() {
        return this.itemSpacingDp;
    }

    public final int component9() {
        return this.landscapeX;
    }

    public final CustomMonitorConfig copy(String str, String str2, boolean z3, float f10, float f11, boolean z10, float f12, float f13, int i4, int i10, int i11, int i12, long j, long j8, boolean z11, boolean z12, boolean z13, List<? extends s> list) {
        k.e(str, FacebookMediationAdapter.KEY_ID);
        k.e(str2, "name");
        k.e(list, AppLovinEventTypes.USER_VIEWED_CONTENT);
        return new CustomMonitorConfig(str, str2, z3, f10, f11, z10, f12, f13, i4, i10, i11, i12, j, j8, z11, z12, z13, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomMonitorConfig)) {
            return false;
        }
        CustomMonitorConfig customMonitorConfig = (CustomMonitorConfig) obj;
        return k.a(this.f21222id, customMonitorConfig.f21222id) && k.a(this.name, customMonitorConfig.name) && this.darkText == customMonitorConfig.darkText && Float.compare(this.textSizeSp, customMonitorConfig.textSizeSp) == 0 && Float.compare(this.transparency, customMonitorConfig.transparency) == 0 && this.verticalLayout == customMonitorConfig.verticalLayout && Float.compare(this.containerPaddingDp, customMonitorConfig.containerPaddingDp) == 0 && Float.compare(this.itemSpacingDp, customMonitorConfig.itemSpacingDp) == 0 && this.landscapeX == customMonitorConfig.landscapeX && this.landscapeY == customMonitorConfig.landscapeY && this.portraitX == customMonitorConfig.portraitX && this.portraitY == customMonitorConfig.portraitY && this.addedTime == customMonitorConfig.addedTime && this.modifiedTime == customMonitorConfig.modifiedTime && this.moveable == customMonitorConfig.moveable && this.showName == customMonitorConfig.showName && this.isShowing == customMonitorConfig.isShowing && k.a(this.content, customMonitorConfig.content);
    }

    public final long getAddedTime() {
        return this.addedTime;
    }

    public final float getContainerPaddingDp() {
        return this.containerPaddingDp;
    }

    public final List<s> getContent() {
        return this.content;
    }

    public final boolean getDarkText() {
        return this.darkText;
    }

    public final String getId() {
        return this.f21222id;
    }

    public final float getItemSpacingDp() {
        return this.itemSpacingDp;
    }

    public final int getLandscapeX() {
        return this.landscapeX;
    }

    public final int getLandscapeY() {
        return this.landscapeY;
    }

    public final long getModifiedTime() {
        return this.modifiedTime;
    }

    public final boolean getMoveable() {
        return this.moveable;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPortraitX() {
        return this.portraitX;
    }

    public final int getPortraitY() {
        return this.portraitY;
    }

    public final boolean getShowName() {
        return this.showName;
    }

    public final float getTextSizeSp() {
        return this.textSizeSp;
    }

    public final float getTransparency() {
        return this.transparency;
    }

    public final boolean getVerticalLayout() {
        return this.verticalLayout;
    }

    public int hashCode() {
        int iD = (((((((c.d(this.itemSpacingDp, c.d(this.containerPaddingDp, (c.d(this.transparency, c.d(this.textSizeSp, (u.m(this.f21222id.hashCode() * 31, 31, this.name) + (this.darkText ? 1231 : 1237)) * 31, 31), 31) + (this.verticalLayout ? 1231 : 1237)) * 31, 31), 31) + this.landscapeX) * 31) + this.landscapeY) * 31) + this.portraitX) * 31) + this.portraitY) * 31;
        long j = this.addedTime;
        int i4 = (iD + ((int) (j ^ (j >>> 32)))) * 31;
        long j8 = this.modifiedTime;
        return this.content.hashCode() + ((((((((i4 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (this.moveable ? 1231 : 1237)) * 31) + (this.showName ? 1231 : 1237)) * 31) + (this.isShowing ? 1231 : 1237)) * 31);
    }

    public final boolean isShowing() {
        return this.isShowing;
    }

    public String toString() {
        String str = this.f21222id;
        String str2 = this.name;
        boolean z3 = this.darkText;
        float f10 = this.textSizeSp;
        float f11 = this.transparency;
        boolean z10 = this.verticalLayout;
        float f12 = this.containerPaddingDp;
        float f13 = this.itemSpacingDp;
        int i4 = this.landscapeX;
        int i10 = this.landscapeY;
        int i11 = this.portraitX;
        int i12 = this.portraitY;
        long j = this.addedTime;
        long j8 = this.modifiedTime;
        boolean z11 = this.moveable;
        boolean z12 = this.showName;
        boolean z13 = this.isShowing;
        List<s> list = this.content;
        StringBuilder sbO = c.o("CustomMonitorConfig(id=", str, ", name=", str2, ", darkText=");
        sbO.append(z3);
        sbO.append(", textSizeSp=");
        sbO.append(f10);
        sbO.append(", transparency=");
        sbO.append(f11);
        sbO.append(", verticalLayout=");
        sbO.append(z10);
        sbO.append(", containerPaddingDp=");
        sbO.append(f12);
        sbO.append(", itemSpacingDp=");
        sbO.append(f13);
        sbO.append(", landscapeX=");
        u.x(i4, i10, ", landscapeY=", ", portraitX=", sbO);
        u.x(i11, i12, ", portraitY=", ", addedTime=", sbO);
        sbO.append(j);
        a0.g.A(sbO, ", modifiedTime=", j8, ", moveable=");
        sbO.append(z11);
        sbO.append(", showName=");
        sbO.append(z12);
        sbO.append(", isShowing=");
        sbO.append(z13);
        sbO.append(", content=");
        sbO.append(list);
        sbO.append(")");
        return sbO.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        k.e(parcel, "dest");
        parcel.writeString(this.f21222id);
        parcel.writeString(this.name);
        parcel.writeInt(this.darkText ? 1 : 0);
        parcel.writeFloat(this.textSizeSp);
        parcel.writeFloat(this.transparency);
        parcel.writeInt(this.verticalLayout ? 1 : 0);
        parcel.writeFloat(this.containerPaddingDp);
        parcel.writeFloat(this.itemSpacingDp);
        parcel.writeInt(this.landscapeX);
        parcel.writeInt(this.landscapeY);
        parcel.writeInt(this.portraitX);
        parcel.writeInt(this.portraitY);
        parcel.writeLong(this.addedTime);
        parcel.writeLong(this.modifiedTime);
        parcel.writeInt(this.moveable ? 1 : 0);
        parcel.writeInt(this.showName ? 1 : 0);
        parcel.writeInt(this.isShowing ? 1 : 0);
        List<s> list = this.content;
        parcel.writeInt(list.size());
        Iterator<s> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next().name());
        }
    }

    public /* synthetic */ CustomMonitorConfig(String str, String str2, boolean z3, float f10, float f11, boolean z10, float f12, float f13, int i4, int i10, int i11, int i12, long j, long j8, boolean z11, boolean z12, boolean z13, List list, int i13, f fVar) {
        this(str, str2, z3, f10, f11, z10, f12, f13, i4, i10, i11, i12, j, j8, z11, (i13 & 32768) != 0 ? false : z12, (i13 & 65536) != 0 ? false : z13, list);
    }
}
