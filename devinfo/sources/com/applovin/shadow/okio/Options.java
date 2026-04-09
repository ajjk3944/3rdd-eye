package com.applovin.shadow.okio;

import java.io.IOException;
import java.util.List;
import java.util.RandomAccess;
import nk.f;
import zj.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class Options extends e implements RandomAccess {
    public static final Companion Companion = new Companion(null);
    private final ByteString[] byteStrings;
    private final int[] trie;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private final void buildTrieRecursive(long j, Buffer buffer, int i4, List<? extends ByteString> list, int i10, int i11, List<Integer> list2) throws IOException {
            int i12;
            int i13;
            int i14;
            long j8;
            int i15 = i4;
            if (i10 >= i11) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i16 = i10; i16 < i11; i16++) {
                if (list.get(i16).size() < i15) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            ByteString byteString = list.get(i10);
            ByteString byteString2 = list.get(i11 - 1);
            if (i15 == byteString.size()) {
                int iIntValue = list2.get(i10).intValue();
                int i17 = i10 + 1;
                ByteString byteString3 = list.get(i17);
                i12 = i17;
                i13 = iIntValue;
                byteString = byteString3;
            } else {
                i12 = i10;
                i13 = -1;
            }
            if (byteString.getByte(i15) == byteString2.getByte(i15)) {
                int iMin = Math.min(byteString.size(), byteString2.size());
                int i18 = 0;
                for (int i19 = i15; i19 < iMin && byteString.getByte(i19) == byteString2.getByte(i19); i19++) {
                    i18++;
                }
                long intCount = j + getIntCount(buffer) + 2 + i18 + 1;
                buffer.writeInt(-i18);
                buffer.writeInt(i13);
                int i20 = i15 + i18;
                while (i15 < i20) {
                    buffer.writeInt(byteString.getByte(i15) & 255);
                    i15++;
                }
                if (i12 + 1 == i11) {
                    if (i20 != list.get(i12).size()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    buffer.writeInt(list2.get(i12).intValue());
                    return;
                } else {
                    Buffer buffer2 = new Buffer();
                    buffer.writeInt(((int) (getIntCount(buffer2) + intCount)) * (-1));
                    buildTrieRecursive(intCount, buffer2, i20, list, i12, i11, list2);
                    buffer.writeAll(buffer2);
                    return;
                }
            }
            int i21 = 1;
            for (int i22 = i12 + 1; i22 < i11; i22++) {
                if (list.get(i22 - 1).getByte(i15) != list.get(i22).getByte(i15)) {
                    i21++;
                }
            }
            long intCount2 = j + getIntCount(buffer) + 2 + (i21 * 2);
            buffer.writeInt(i21);
            buffer.writeInt(i13);
            for (int i23 = i12; i23 < i11; i23++) {
                byte b10 = list.get(i23).getByte(i15);
                if (i23 == i12 || b10 != list.get(i23 - 1).getByte(i15)) {
                    buffer.writeInt(b10 & 255);
                }
            }
            Buffer buffer3 = new Buffer();
            while (i12 < i11) {
                byte b11 = list.get(i12).getByte(i15);
                int i24 = i12 + 1;
                int i25 = i24;
                while (true) {
                    if (i25 >= i11) {
                        i14 = i11;
                        break;
                    } else {
                        if (b11 != list.get(i25).getByte(i15)) {
                            i14 = i25;
                            break;
                        }
                        i25++;
                    }
                }
                if (i24 == i14 && i15 + 1 == list.get(i12).size()) {
                    buffer.writeInt(list2.get(i12).intValue());
                    j8 = intCount2;
                } else {
                    buffer.writeInt(((int) (getIntCount(buffer3) + intCount2)) * (-1));
                    j8 = intCount2;
                    buildTrieRecursive(j8, buffer3, i15 + 1, list, i12, i14, list2);
                }
                intCount2 = j8;
                i12 = i14;
            }
            buffer.writeAll(buffer3);
        }

        public static /* synthetic */ void buildTrieRecursive$default(Companion companion, long j, Buffer buffer, int i4, List list, int i10, int i11, List list2, int i12, Object obj) throws IOException {
            if ((i12 & 1) != 0) {
                j = 0;
            }
            companion.buildTrieRecursive(j, buffer, (i12 & 4) != 0 ? 0 : i4, list, (i12 & 16) != 0 ? 0 : i10, (i12 & 32) != 0 ? list.size() : i11, list2);
        }

        private final long getIntCount(Buffer buffer) {
            return buffer.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00d5, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.applovin.shadow.okio.Options of(com.applovin.shadow.okio.ByteString... r17) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 284
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.Options.Companion.of(com.applovin.shadow.okio.ByteString[]):com.applovin.shadow.okio.Options");
        }

        private Companion() {
        }
    }

    public /* synthetic */ Options(ByteString[] byteStringArr, int[] iArr, f fVar) {
        this(byteStringArr, iArr);
    }

    public static final Options of(ByteString... byteStringArr) {
        return Companion.of(byteStringArr);
    }

    public /* bridge */ boolean contains(ByteString byteString) {
        return super.contains((Object) byteString);
    }

    public final ByteString[] getByteStrings$okio() {
        return this.byteStrings;
    }

    @Override // zj.a
    public int getSize() {
        return this.byteStrings.length;
    }

    public final int[] getTrie$okio() {
        return this.trie;
    }

    public /* bridge */ int indexOf(ByteString byteString) {
        return super.indexOf((Object) byteString);
    }

    public /* bridge */ int lastIndexOf(ByteString byteString) {
        return super.lastIndexOf((Object) byteString);
    }

    private Options(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    @Override // zj.a, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return contains((ByteString) obj);
        }
        return false;
    }

    @Override // java.util.List
    public ByteString get(int i4) {
        return this.byteStrings[i4];
    }

    @Override // zj.e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // zj.e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return lastIndexOf((ByteString) obj);
        }
        return -1;
    }
}
