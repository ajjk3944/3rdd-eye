package com.facebook.ads.androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.viewpoint.core.AnonymousClass53;
import com.instagram.common.viewpoint.core.C02434v;
import com.instagram.common.viewpoint.core.IW;
import com.instagram.common.viewpoint.core.IX;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network/classes2.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static String[] A0D = {"2fVUWVW5Hj7LHoGITBtqA0sUitS4PTb4", "Q8qvKmypWvqXriKcaeBTncTBfq8seygK", "PB3TBbluvnbAoPy", "V5r7AKyrTxu4nkwu31wVya7iCL5S2t7X", "ptiIvLXZk7optwegrSJTcSLpf9JtKnje", "Im1w1jT", "8VlbtMqcAJkMoCkUmgZltZaiEM6o3", "PsL5EDhhHapqBInAVo5dkvRq7GvOLwYr"};
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new IW();
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final List<IX> A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 27 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public SpliceInsertCommand(long j, boolean z3, boolean z10, boolean z11, boolean z12, long j8, long j9, List<IX> list, boolean z13, long j10, int i4, int i10, int i11) {
        this.A06 = j;
        this.A0B = z3;
        this.A09 = z10;
        this.A0A = z11;
        this.A0C = z12;
        this.A05 = j8;
        this.A04 = j9;
        this.A07 = Collections.unmodifiableList(list);
        this.A08 = z13;
        this.A03 = j10;
        this.A02 = i4;
        this.A00 = i10;
        this.A01 = i11;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.A06 = parcel.readLong();
        this.A0B = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        this.A0A = parcel.readByte() == 1;
        this.A0C = parcel.readByte() == 1;
        this.A05 = parcel.readLong();
        this.A04 = parcel.readLong();
        int i4 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i4);
        for (int i10 = 0; i10 < i4; i10++) {
            arrayList.add(IX.A00(parcel));
        }
        this.A07 = Collections.unmodifiableList(arrayList);
        int componentSpliceListSize = parcel.readByte();
        this.A08 = componentSpliceListSize == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListSize2 = parcel.readInt();
        this.A02 = componentSpliceListSize2;
        int componentSpliceListSize3 = parcel.readInt();
        this.A00 = componentSpliceListSize3;
        int componentSpliceListSize4 = parcel.readInt();
        this.A01 = componentSpliceListSize4;
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, IW iw) {
        this(parcel);
    }

    public static SpliceInsertCommand A00(C02434v c02434v, long j, AnonymousClass53 anonymousClass53) {
        long jA0Q = c02434v.A0Q();
        boolean z3 = (c02434v.A0I() & 128) != 0;
        boolean z10 = false;
        boolean outOfNetworkIndicator = false;
        boolean z11 = false;
        long jA00 = -9223372036854775807L;
        List listEmptyList = Collections.emptyList();
        if (A0D[6].length() == 19) {
            throw new RuntimeException();
        }
        A0D[4] = "mssbEGkdhdKHHgY1hMK2RaJspuJCG0bt";
        int iA0M = 0;
        int iA0I = 0;
        int iA0I2 = 0;
        boolean z12 = false;
        long jA0Q2 = -9223372036854775807L;
        if (!z3) {
            int iA0I3 = c02434v.A0I();
            z10 = (iA0I3 & 128) != 0;
            outOfNetworkIndicator = (iA0I3 & 64) != 0;
            boolean autoReturn = (iA0I3 & 32) != 0;
            z11 = (iA0I3 & 16) != 0;
            if (outOfNetworkIndicator && !z11) {
                jA00 = TimeSignalCommand.A00(c02434v, j);
            }
            if (!outOfNetworkIndicator) {
                int componentCount = c02434v.A0I();
                listEmptyList = new ArrayList(componentCount);
                for (int i4 = 0; i4 < componentCount; i4++) {
                    int componentTag = c02434v.A0I();
                    long jA002 = -9223372036854775807L;
                    if (!z11) {
                        jA002 = TimeSignalCommand.A00(c02434v, j);
                    }
                    listEmptyList.add(new IX(componentTag, jA002, anonymousClass53.A06(jA002), null));
                }
            }
            if (autoReturn) {
                long jA0I = c02434v.A0I();
                z12 = (jA0I & 128) != 0;
                jA0Q2 = (1000 * (((jA0I & 1) << 32) | c02434v.A0Q())) / 90;
            }
            iA0M = c02434v.A0M();
            iA0I = c02434v.A0I();
            iA0I2 = c02434v.A0I();
        }
        return new SpliceInsertCommand(jA0Q, z3, z10, outOfNetworkIndicator, z11, jA00, anonymousClass53.A06(jA00), listEmptyList, z12, jA0Q2, iA0M, iA0I, iA0I2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A04);
        int size = this.A07.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            this.A07.get(i10).A01(parcel);
            String[] strArr = A0D;
            if (strArr[1].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A0D[5] = "b82jUGYrdOItwNOnrxCotui81UmrwpK";
        }
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
