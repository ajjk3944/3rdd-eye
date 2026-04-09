package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class g42 extends ei0 {
    public static final Parcelable.Creator<g42> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f27538c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27539d;

    public class a implements Parcelable.Creator<g42> {
        @Override // android.os.Parcelable.Creator
        public final g42 createFromParcel(Parcel parcel) {
            return new g42(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final g42[] newArray(int i) {
            return new g42[i];
        }
    }

    public g42(Parcel parcel) {
        super((String) s82.a(parcel.readString()));
        this.f27538c = parcel.readString();
        this.f27539d = (String) s82.a(parcel.readString());
    }

    private static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g42.class == obj.getClass()) {
            g42 g42Var = (g42) obj;
            if (s82.a(this.f26869b, g42Var.f26869b) && s82.a(this.f27538c, g42Var.f27538c) && s82.a(this.f27539d, g42Var.f27539d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA = C4121h3.a(this.f26869b, 527, 31);
        String str = this.f27538c;
        int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f27539d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.yandex.mobile.ads.impl.ei0
    public final String toString() {
        return this.f26869b + ": description=" + this.f27538c + ": value=" + this.f27539d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26869b);
        parcel.writeString(this.f27538c);
        parcel.writeString(this.f27539d);
    }

    public g42(String str, String str2, String str3) {
        super(str);
        this.f27538c = str2;
        this.f27539d = str3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0012  */
    @Override // com.yandex.mobile.ads.impl.ei0, com.yandex.mobile.ads.impl.yz0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.yandex.mobile.ads.impl.aw0.a r9) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.g42.a(com.yandex.mobile.ads.impl.aw0$a):void");
    }
}
