package com.facebook.ads.androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.AbstractC22614a;
import com.facebook.ads.redexgen.core.C2589Hg;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class PrivFrame extends Id3Frame {
    public static byte[] A02;
    public static String[] A03 = {"EWOInCaIHCzogpd", "fs9ugozw1c5kvUCIqsvCcWemveC1sf1J", "NT8OM95pl0Jx8yQ64hFxmReoXGuhAEeW", "iJI9GReRfI7hh21r5IzNiPRGAwsaTEq4", "tJNEz0EhemzaODezwv68GjVKxVwF2XHD", "CfB", "doDcIJ4JyUsYbIdMITVPy357", "yuRfgYSExXdGEzX5nOmQsyIvKxDppAIu"};
    public static final Parcelable.Creator<PrivFrame> CREATOR;
    public final String A00;
    public final byte[] A01;

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            int i13 = bArrCopyOfRange[i12] ^ i11;
            String[] strArr = A03;
            if (strArr[4].charAt(8) == strArr[1].charAt(8)) {
                throw new RuntimeException();
            }
            A03[0] = "DmEtIuuy4dqW5fO";
            bArrCopyOfRange[i12] = (byte) (i13 ^ 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{89, 67, 12, 20, 13, 6, 17, 94, 88, 90, 65, 94};
    }

    static {
        A01();
        CREATOR = new C2589Hg();
    }

    public PrivFrame(Parcel parcel) {
        super(A00(8, 4, 119));
        this.A00 = (String) AbstractC22614a.A0f(parcel.readString());
        this.A01 = (byte[]) AbstractC22614a.A0f(parcel.createByteArray());
    }

    public PrivFrame(String str, byte[] bArr) {
        super(A00(8, 4, 119));
        this.A00 = str;
        this.A01 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return AbstractC22614a.A1E(this.A00, privFrame.A00) && Arrays.equals(this.A01, privFrame.A01);
    }

    public final int hashCode() {
        int i = 17 * 31;
        int result = this.A00 != null ? this.A00.hashCode() : 0;
        return ((i + result) * 31) + Arrays.hashCode(this.A01);
    }

    @Override // com.facebook.ads.androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(0, 8, 28) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A01);
    }
}
