package okio;

import java.io.IOException;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.i;
import org.jetbrains.annotations.NotNull;
import z8.d;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0018B!\b\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lokio/Options;", "Lz8/d;", "Lokio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "byteStrings", "", "trie", "<init>", "([Lokio/ByteString;[I)V", "", "index", "get", "(I)Lokio/ByteString;", "[Lokio/ByteString;", "getByteStrings$okio", "()[Lokio/ByteString;", "[I", "getTrie$okio", "()[I", "getSize", "()I", "size", "Companion", "okio"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class Options extends d implements RandomAccess {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ByteString[] byteStrings;

    @NotNull
    private final int[] trie;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u00142\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0013\"\u00020\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u00020\u0004*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lokio/Options$Companion;", "", "<init>", "()V", "", "nodeOffset", "Lokio/Buffer;", "node", "", "byteStringOffset", "", "Lokio/ByteString;", "byteStrings", "fromIndex", "toIndex", "indexes", "Ly8/s;", "buildTrieRecursive", "(JLokio/Buffer;ILjava/util/List;IILjava/util/List;)V", "", "Lokio/Options;", "of", "([Lokio/ByteString;)Lokio/Options;", "getIntCount", "(Lokio/Buffer;)J", "intCount", "okio"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(i iVar) {
            this();
        }

        private final void buildTrieRecursive(long nodeOffset, Buffer node, int byteStringOffset, List<? extends ByteString> byteStrings, int fromIndex, int toIndex, List<Integer> indexes) throws IOException {
            int i10;
            int i11;
            int i12;
            long j10;
            int i13 = byteStringOffset;
            int i14 = fromIndex;
            if (!(i14 < toIndex)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i14 < toIndex) {
                int i15 = i14;
                while (true) {
                    int i16 = i15 + 1;
                    if (!(byteStrings.get(i15).size() >= i13)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    if (i16 >= toIndex) {
                        break;
                    } else {
                        i15 = i16;
                    }
                }
            }
            ByteString byteString = byteStrings.get(fromIndex);
            ByteString byteString2 = byteStrings.get(toIndex - 1);
            if (i13 == byteString.size()) {
                int iIntValue = indexes.get(i14).intValue();
                i14++;
                i10 = iIntValue;
                byteString = byteStrings.get(i14);
            } else {
                i10 = -1;
            }
            if (byteString.getByte(i13) == byteString2.getByte(i13)) {
                int iMin = Math.min(byteString.size(), byteString2.size());
                if (i13 < iMin) {
                    int i17 = i13;
                    i11 = 0;
                    while (true) {
                        int i18 = i17 + 1;
                        if (byteString.getByte(i17) != byteString2.getByte(i17)) {
                            break;
                        }
                        i11++;
                        if (i18 >= iMin) {
                            break;
                        } else {
                            i17 = i18;
                        }
                    }
                } else {
                    i11 = 0;
                }
                long intCount = nodeOffset + getIntCount(node) + 2 + i11 + 1;
                node.writeInt(-i11);
                node.writeInt(i10);
                int i19 = i13 + i11;
                if (i13 < i19) {
                    while (true) {
                        int i20 = i13 + 1;
                        node.writeInt(byteString.getByte(i13) & 255);
                        if (i20 >= i19) {
                            break;
                        } else {
                            i13 = i20;
                        }
                    }
                }
                if (i14 + 1 == toIndex) {
                    if (!(i19 == byteStrings.get(i14).size())) {
                        throw new IllegalStateException("Check failed.");
                    }
                    node.writeInt(indexes.get(i14).intValue());
                    return;
                } else {
                    Buffer buffer = new Buffer();
                    node.writeInt(((int) (getIntCount(buffer) + intCount)) * (-1));
                    buildTrieRecursive(intCount, buffer, i19, byteStrings, i14, toIndex, indexes);
                    node.writeAll(buffer);
                    return;
                }
            }
            int i21 = i14 + 1;
            int i22 = 1;
            if (i21 < toIndex) {
                while (true) {
                    int i23 = i21 + 1;
                    if (byteStrings.get(i21 - 1).getByte(i13) != byteStrings.get(i21).getByte(i13)) {
                        i22++;
                    }
                    if (i23 >= toIndex) {
                        break;
                    } else {
                        i21 = i23;
                    }
                }
            }
            long intCount2 = nodeOffset + getIntCount(node) + 2 + (i22 * 2);
            node.writeInt(i22);
            node.writeInt(i10);
            if (i14 < toIndex) {
                int i24 = i14;
                while (true) {
                    int i25 = i24 + 1;
                    byte b10 = byteStrings.get(i24).getByte(i13);
                    if (i24 == i14 || b10 != byteStrings.get(i24 - 1).getByte(i13)) {
                        node.writeInt(b10 & 255);
                    }
                    if (i25 >= toIndex) {
                        break;
                    } else {
                        i24 = i25;
                    }
                }
            }
            Buffer buffer2 = new Buffer();
            int i26 = i14;
            while (i26 < toIndex) {
                byte b11 = byteStrings.get(i26).getByte(i13);
                int i27 = i26 + 1;
                if (i27 < toIndex) {
                    int i28 = i27;
                    while (true) {
                        int i29 = i28 + 1;
                        if (b11 != byteStrings.get(i28).getByte(i13)) {
                            i12 = i28;
                            break;
                        } else if (i29 >= toIndex) {
                            break;
                        } else {
                            i28 = i29;
                        }
                    }
                    i12 = toIndex;
                } else {
                    i12 = toIndex;
                }
                if (i27 == i12 && i13 + 1 == byteStrings.get(i26).size()) {
                    node.writeInt(indexes.get(i26).intValue());
                    j10 = intCount2;
                } else {
                    node.writeInt(((int) (getIntCount(buffer2) + intCount2)) * (-1));
                    j10 = intCount2;
                    buildTrieRecursive(j10, buffer2, i13 + 1, byteStrings, i26, i12, indexes);
                }
                intCount2 = j10;
                i26 = i12;
            }
            node.writeAll(buffer2);
        }

        public static /* synthetic */ void buildTrieRecursive$default(Companion companion, long j10, Buffer buffer, int i10, List list, int i11, int i12, List list2, int i13, Object obj) throws IOException {
            if ((i13 & 1) != 0) {
                j10 = 0;
            }
            companion.buildTrieRecursive(j10, buffer, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        private final long getIntCount(Buffer buffer) {
            return buffer.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x00d9, code lost:
        
            continue;
         */
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okio.Options of(@org.jetbrains.annotations.NotNull okio.ByteString... r17) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 299
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.Options.Companion.of(okio.ByteString[]):okio.Options");
        }

        private Companion() {
        }
    }

    public /* synthetic */ Options(ByteString[] byteStringArr, int[] iArr, i iVar) {
        this(byteStringArr, iArr);
    }

    @JvmStatic
    @NotNull
    public static final Options of(@NotNull ByteString... byteStringArr) {
        return INSTANCE.of(byteStringArr);
    }

    @Override // z8.b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return contains((ByteString) obj);
        }
        return false;
    }

    @NotNull
    /* renamed from: getByteStrings$okio, reason: from getter */
    public final ByteString[] getByteStrings() {
        return this.byteStrings;
    }

    @Override // z8.b
    public int getSize() {
        return this.byteStrings.length;
    }

    @NotNull
    /* renamed from: getTrie$okio, reason: from getter */
    public final int[] getTrie() {
        return this.trie;
    }

    @Override // z8.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // z8.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return lastIndexOf((ByteString) obj);
        }
        return -1;
    }

    private Options(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    public /* bridge */ boolean contains(ByteString byteString) {
        return super.contains((Object) byteString);
    }

    @Override // z8.d, java.util.List
    @NotNull
    public ByteString get(int index) {
        return this.byteStrings[index];
    }

    public /* bridge */ int indexOf(ByteString byteString) {
        return super.indexOf((Object) byteString);
    }

    public /* bridge */ int lastIndexOf(ByteString byteString) {
        return super.lastIndexOf((Object) byteString);
    }
}
