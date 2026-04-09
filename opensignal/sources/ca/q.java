package ca;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.VorbisComment;
import io.sentry.android.core.e0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f3491a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3492b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3493c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3494d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3495e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3496f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3497g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3498h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3499i;
    public final long j;
    public final p k;

    /* renamed from: l, reason: collision with root package name */
    public final Metadata f3500l;

    public q(int i10, byte[] bArr) {
        a5.u uVar = new a5.u(bArr, bArr.length, 3, (byte) 0);
        uVar.p(i10 * 8);
        this.f3491a = uVar.i(16);
        this.f3492b = uVar.i(16);
        this.f3493c = uVar.i(24);
        this.f3494d = uVar.i(24);
        int i11 = uVar.i(20);
        this.f3495e = i11;
        this.f3496f = e(i11);
        this.f3497g = uVar.i(3) + 1;
        int i12 = uVar.i(5) + 1;
        this.f3498h = i12;
        this.f3499i = b(i12);
        int i13 = uVar.i(4);
        int i14 = uVar.i(32);
        int i15 = qb.v.f20828a;
        this.j = ((i13 & 4294967295L) << 32) | (i14 & 4294967295L);
        this.k = null;
        this.f3500l = null;
    }

    public static Metadata a(List list, List list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            int i11 = qb.v.f20828a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                e0.p("FlacStreamMetadata", str.length() != 0 ? "Failed to parse Vorbis comment: ".concat(str) : new String("Failed to parse Vorbis comment: "));
            } else {
                arrayList.add(new VorbisComment(strArrSplit[0], strArrSplit[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static int b(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int e(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long c() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.f3495e;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.exoplayer2.Format d(byte[] r7, com.google.android.exoplayer2.metadata.Metadata r8) {
        /*
            r6 = this;
            r0 = 4
            r1 = -128(0xffffffffffffff80, float:NaN)
            r7[r0] = r1
            int r0 = r6.f3494d
            if (r0 <= 0) goto La
            goto Lb
        La:
            r0 = -1
        Lb:
            com.google.android.exoplayer2.metadata.Metadata r1 = r6.f3500l
            if (r1 != 0) goto L10
            goto L33
        L10:
            if (r8 != 0) goto L13
            goto L18
        L13:
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r8 = r8.f4241a
            int r2 = r8.length
            if (r2 != 0) goto L1a
        L18:
            r8 = r1
            goto L33
        L1a:
            com.google.android.exoplayer2.metadata.Metadata r2 = new com.google.android.exoplayer2.metadata.Metadata
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r1 = r1.f4241a
            int r3 = qb.v.f20828a
            int r3 = r1.length
            int r4 = r8.length
            int r3 = r3 + r4
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r1, r3)
            int r1 = r1.length
            int r4 = r8.length
            r5 = 0
            java.lang.System.arraycopy(r8, r5, r3, r1, r4)
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r3 = (com.google.android.exoplayer2.metadata.Metadata.Entry[]) r3
            r2.<init>(r3)
            r8 = r2
        L33:
            com.google.android.exoplayer2.g0 r1 = new com.google.android.exoplayer2.g0
            r1.<init>()
            java.lang.String r2 = "audio/flac"
            r1.k = r2
            r1.f4151l = r0
            int r0 = r6.f3497g
            r1.f4163x = r0
            int r0 = r6.f3495e
            r1.f4164y = r0
            java.util.List r7 = java.util.Collections.singletonList(r7)
            r1.f4152m = r7
            r1.f4150i = r8
            com.google.android.exoplayer2.Format r7 = new com.google.android.exoplayer2.Format
            r7.<init>(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.q.d(byte[], com.google.android.exoplayer2.metadata.Metadata):com.google.android.exoplayer2.Format");
    }

    public q(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j, p pVar, Metadata metadata) {
        this.f3491a = i10;
        this.f3492b = i11;
        this.f3493c = i12;
        this.f3494d = i13;
        this.f3495e = i14;
        this.f3496f = e(i14);
        this.f3497g = i15;
        this.f3498h = i16;
        this.f3499i = b(i16);
        this.j = j;
        this.k = pVar;
        this.f3500l = metadata;
    }
}
