package com.applovin.shadow.okio.internal;

import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Path;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import je.u;
import nk.k;
import zj.n;
import zj.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* renamed from: com.applovin.shadow.okio.internal.-Path, reason: invalid class name */
/* loaded from: classes.dex */
public final class Path {
    private static final ByteString ANY_SLASH;
    private static final ByteString BACKSLASH;
    private static final ByteString DOT;
    private static final ByteString DOT_DOT;
    private static final ByteString SLASH;

    static {
        ByteString.Companion companion = ByteString.Companion;
        SLASH = companion.encodeUtf8("/");
        BACKSLASH = companion.encodeUtf8("\\");
        ANY_SLASH = companion.encodeUtf8("/\\");
        DOT = companion.encodeUtf8(".");
        DOT_DOT = companion.encodeUtf8("..");
    }

    public static final int commonCompareTo(com.applovin.shadow.okio.Path path, com.applovin.shadow.okio.Path path2) {
        k.e(path, "<this>");
        k.e(path2, "other");
        return path.getBytes$okio().compareTo(path2.getBytes$okio());
    }

    public static final boolean commonEquals(com.applovin.shadow.okio.Path path, Object obj) {
        k.e(path, "<this>");
        return (obj instanceof com.applovin.shadow.okio.Path) && k.a(((com.applovin.shadow.okio.Path) obj).getBytes$okio(), path.getBytes$okio());
    }

    public static final int commonHashCode(com.applovin.shadow.okio.Path path) {
        k.e(path, "<this>");
        return path.getBytes$okio().hashCode();
    }

    public static final boolean commonIsAbsolute(com.applovin.shadow.okio.Path path) {
        k.e(path, "<this>");
        return rootLength(path) != -1;
    }

    public static final boolean commonIsRelative(com.applovin.shadow.okio.Path path) {
        k.e(path, "<this>");
        return rootLength(path) == -1;
    }

    public static final boolean commonIsRoot(com.applovin.shadow.okio.Path path) {
        k.e(path, "<this>");
        return rootLength(path) == path.getBytes$okio().size();
    }

    public static final String commonName(com.applovin.shadow.okio.Path path) {
        k.e(path, "<this>");
        return path.nameBytes().utf8();
    }

    public static final ByteString commonNameBytes(com.applovin.shadow.okio.Path path) {
        k.e(path, "<this>");
        int indexOfLastSlash = getIndexOfLastSlash(path);
        return indexOfLastSlash != -1 ? ByteString.substring$default(path.getBytes$okio(), indexOfLastSlash + 1, 0, 2, null) : (path.volumeLetter() == null || path.getBytes$okio().size() != 2) ? path.getBytes$okio() : ByteString.EMPTY;
    }

    public static final com.applovin.shadow.okio.Path commonNormalized(com.applovin.shadow.okio.Path path) {
        k.e(path, "<this>");
        return com.applovin.shadow.okio.Path.Companion.get(path.toString(), true);
    }

    public static final com.applovin.shadow.okio.Path commonParent(com.applovin.shadow.okio.Path path) {
        k.e(path, "<this>");
        if (k.a(path.getBytes$okio(), DOT) || k.a(path.getBytes$okio(), SLASH) || k.a(path.getBytes$okio(), BACKSLASH) || lastSegmentIsDotDot(path)) {
            return null;
        }
        int indexOfLastSlash = getIndexOfLastSlash(path);
        if (indexOfLastSlash == 2 && path.volumeLetter() != null) {
            if (path.getBytes$okio().size() == 3) {
                return null;
            }
            return new com.applovin.shadow.okio.Path(ByteString.substring$default(path.getBytes$okio(), 0, 3, 1, null));
        }
        if (indexOfLastSlash == 1 && path.getBytes$okio().startsWith(BACKSLASH)) {
            return null;
        }
        if (indexOfLastSlash != -1 || path.volumeLetter() == null) {
            return indexOfLastSlash == -1 ? new com.applovin.shadow.okio.Path(DOT) : indexOfLastSlash == 0 ? new com.applovin.shadow.okio.Path(ByteString.substring$default(path.getBytes$okio(), 0, 1, 1, null)) : new com.applovin.shadow.okio.Path(ByteString.substring$default(path.getBytes$okio(), 0, indexOfLastSlash, 1, null));
        }
        if (path.getBytes$okio().size() == 2) {
            return null;
        }
        return new com.applovin.shadow.okio.Path(ByteString.substring$default(path.getBytes$okio(), 0, 2, 1, null));
    }

    public static final com.applovin.shadow.okio.Path commonRelativeTo(com.applovin.shadow.okio.Path path, com.applovin.shadow.okio.Path path2) {
        k.e(path, "<this>");
        k.e(path2, "other");
        if (!k.a(path.getRoot(), path2.getRoot())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + path + " and " + path2).toString());
        }
        List<ByteString> segmentsBytes = path.getSegmentsBytes();
        List<ByteString> segmentsBytes2 = path2.getSegmentsBytes();
        int iMin = Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i4 = 0;
        while (i4 < iMin && k.a(segmentsBytes.get(i4), segmentsBytes2.get(i4))) {
            i4++;
        }
        if (i4 == iMin && path.getBytes$okio().size() == path2.getBytes$okio().size()) {
            return Path.Companion.get$default(com.applovin.shadow.okio.Path.Companion, ".", false, 1, (Object) null);
        }
        if (segmentsBytes2.subList(i4, segmentsBytes2.size()).indexOf(DOT_DOT) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + path + " and " + path2).toString());
        }
        Buffer buffer = new Buffer();
        ByteString slash = getSlash(path2);
        if (slash == null && (slash = getSlash(path)) == null) {
            slash = toSlash(com.applovin.shadow.okio.Path.DIRECTORY_SEPARATOR);
        }
        int size = segmentsBytes2.size();
        for (int i10 = i4; i10 < size; i10++) {
            buffer.write(DOT_DOT);
            buffer.write(slash);
        }
        int size2 = segmentsBytes.size();
        while (i4 < size2) {
            buffer.write(segmentsBytes.get(i4));
            buffer.write(slash);
            i4++;
        }
        return toPath(buffer, false);
    }

    public static final com.applovin.shadow.okio.Path commonResolve(com.applovin.shadow.okio.Path path, String str, boolean z3) {
        k.e(path, "<this>");
        k.e(str, "child");
        return commonResolve(path, toPath(new Buffer().writeUtf8(str), false), z3);
    }

    public static final com.applovin.shadow.okio.Path commonRoot(com.applovin.shadow.okio.Path path) {
        k.e(path, "<this>");
        int iRootLength = rootLength(path);
        if (iRootLength == -1) {
            return null;
        }
        return new com.applovin.shadow.okio.Path(path.getBytes$okio().substring(0, iRootLength));
    }

    public static final List<String> commonSegments(com.applovin.shadow.okio.Path path) {
        k.e(path, "<this>");
        ArrayList arrayList = new ArrayList();
        int iRootLength = rootLength(path);
        int i4 = 0;
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < path.getBytes$okio().size() && path.getBytes$okio().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = path.getBytes$okio().size();
        int i10 = iRootLength;
        while (iRootLength < size) {
            if (path.getBytes$okio().getByte(iRootLength) == 47 || path.getBytes$okio().getByte(iRootLength) == 92) {
                arrayList.add(path.getBytes$okio().substring(i10, iRootLength));
                i10 = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i10 < path.getBytes$okio().size()) {
            arrayList.add(path.getBytes$okio().substring(i10, path.getBytes$okio().size()));
        }
        ArrayList arrayList2 = new ArrayList(o.T(arrayList, 10));
        int size2 = arrayList.size();
        while (i4 < size2) {
            Object obj = arrayList.get(i4);
            i4++;
            arrayList2.add(((ByteString) obj).utf8());
        }
        return arrayList2;
    }

    public static final List<ByteString> commonSegmentsBytes(com.applovin.shadow.okio.Path path) {
        k.e(path, "<this>");
        ArrayList arrayList = new ArrayList();
        int iRootLength = rootLength(path);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < path.getBytes$okio().size() && path.getBytes$okio().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = path.getBytes$okio().size();
        int i4 = iRootLength;
        while (iRootLength < size) {
            if (path.getBytes$okio().getByte(iRootLength) == 47 || path.getBytes$okio().getByte(iRootLength) == 92) {
                arrayList.add(path.getBytes$okio().substring(i4, iRootLength));
                i4 = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i4 < path.getBytes$okio().size()) {
            arrayList.add(path.getBytes$okio().substring(i4, path.getBytes$okio().size()));
        }
        return arrayList;
    }

    public static final com.applovin.shadow.okio.Path commonToPath(String str, boolean z3) {
        k.e(str, "<this>");
        return toPath(new Buffer().writeUtf8(str), z3);
    }

    public static final String commonToString(com.applovin.shadow.okio.Path path) {
        k.e(path, "<this>");
        return path.getBytes$okio().utf8();
    }

    public static final Character commonVolumeLetter(com.applovin.shadow.okio.Path path) {
        k.e(path, "<this>");
        if (ByteString.indexOf$default(path.getBytes$okio(), SLASH, 0, 2, (Object) null) != -1 || path.getBytes$okio().size() < 2 || path.getBytes$okio().getByte(1) != 58) {
            return null;
        }
        char c9 = (char) path.getBytes$okio().getByte(0);
        if (('a' > c9 || c9 >= '{') && ('A' > c9 || c9 >= '[')) {
            return null;
        }
        return Character.valueOf(c9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getIndexOfLastSlash(com.applovin.shadow.okio.Path path) {
        int iLastIndexOf$default = ByteString.lastIndexOf$default(path.getBytes$okio(), SLASH, 0, 2, (Object) null);
        return iLastIndexOf$default != -1 ? iLastIndexOf$default : ByteString.lastIndexOf$default(path.getBytes$okio(), BACKSLASH, 0, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteString getSlash(com.applovin.shadow.okio.Path path) {
        ByteString bytes$okio = path.getBytes$okio();
        ByteString byteString = SLASH;
        if (ByteString.indexOf$default(bytes$okio, byteString, 0, 2, (Object) null) != -1) {
            return byteString;
        }
        ByteString bytes$okio2 = path.getBytes$okio();
        ByteString byteString2 = BACKSLASH;
        if (ByteString.indexOf$default(bytes$okio2, byteString2, 0, 2, (Object) null) != -1) {
            return byteString2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lastSegmentIsDotDot(com.applovin.shadow.okio.Path path) {
        return path.getBytes$okio().endsWith(DOT_DOT) && (path.getBytes$okio().size() == 2 || path.getBytes$okio().rangeEquals(path.getBytes$okio().size() + (-3), SLASH, 0, 1) || path.getBytes$okio().rangeEquals(path.getBytes$okio().size() + (-3), BACKSLASH, 0, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rootLength(com.applovin.shadow.okio.Path path) {
        if (path.getBytes$okio().size() == 0) {
            return -1;
        }
        if (path.getBytes$okio().getByte(0) == 47) {
            return 1;
        }
        if (path.getBytes$okio().getByte(0) == 92) {
            if (path.getBytes$okio().size() <= 2 || path.getBytes$okio().getByte(1) != 92) {
                return 1;
            }
            int iIndexOf = path.getBytes$okio().indexOf(BACKSLASH, 2);
            return iIndexOf == -1 ? path.getBytes$okio().size() : iIndexOf;
        }
        if (path.getBytes$okio().size() > 2 && path.getBytes$okio().getByte(1) == 58 && path.getBytes$okio().getByte(2) == 92) {
            char c9 = (char) path.getBytes$okio().getByte(0);
            if ('a' <= c9 && c9 < '{') {
                return 3;
            }
            if ('A' <= c9 && c9 < '[') {
                return 3;
            }
        }
        return -1;
    }

    private static final boolean startsWithVolumeLetterAndColon(Buffer buffer, ByteString byteString) {
        if (!k.a(byteString, BACKSLASH) || buffer.size() < 2 || buffer.getByte(1L) != 58) {
            return false;
        }
        char c9 = (char) buffer.getByte(0L);
        if ('a' > c9 || c9 >= '{') {
            return 'A' <= c9 && c9 < '[';
        }
        return true;
    }

    public static final com.applovin.shadow.okio.Path toPath(Buffer buffer, boolean z3) throws EOFException {
        ByteString byteString;
        ByteString byteString2;
        k.e(buffer, "<this>");
        Buffer buffer2 = new Buffer();
        ByteString slash = null;
        int i4 = 0;
        while (true) {
            if (!buffer.rangeEquals(0L, SLASH)) {
                byteString = BACKSLASH;
                if (!buffer.rangeEquals(0L, byteString)) {
                    break;
                }
            }
            byte b10 = buffer.readByte();
            if (slash == null) {
                slash = toSlash(b10);
            }
            i4++;
        }
        boolean z10 = i4 >= 2 && k.a(slash, byteString);
        if (z10) {
            k.b(slash);
            buffer2.write(slash);
            buffer2.write(slash);
        } else if (i4 > 0) {
            k.b(slash);
            buffer2.write(slash);
        } else {
            long jIndexOfElement = buffer.indexOfElement(ANY_SLASH);
            if (slash == null) {
                slash = jIndexOfElement == -1 ? toSlash(com.applovin.shadow.okio.Path.DIRECTORY_SEPARATOR) : toSlash(buffer.getByte(jIndexOfElement));
            }
            if (startsWithVolumeLetterAndColon(buffer, slash)) {
                if (jIndexOfElement == 2) {
                    buffer2.write(buffer, 3L);
                } else {
                    buffer2.write(buffer, 2L);
                }
            }
        }
        boolean z11 = buffer2.size() > 0;
        ArrayList arrayList = new ArrayList();
        while (!buffer.exhausted()) {
            long jIndexOfElement2 = buffer.indexOfElement(ANY_SLASH);
            if (jIndexOfElement2 == -1) {
                byteString2 = buffer.readByteString();
            } else {
                byteString2 = buffer.readByteString(jIndexOfElement2);
                buffer.readByte();
            }
            ByteString byteString3 = DOT_DOT;
            if (k.a(byteString2, byteString3)) {
                if (!z11 || !arrayList.isEmpty()) {
                    if (!z3 || (!z11 && (arrayList.isEmpty() || k.a(n.h0(arrayList), byteString3)))) {
                        arrayList.add(byteString2);
                    } else if (!z10 || arrayList.size() != 1) {
                        n.m0(arrayList);
                    }
                }
            } else if (!k.a(byteString2, DOT) && !k.a(byteString2, ByteString.EMPTY)) {
                arrayList.add(byteString2);
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                buffer2.write(slash);
            }
            buffer2.write((ByteString) arrayList.get(i10));
        }
        if (buffer2.size() == 0) {
            buffer2.write(DOT);
        }
        return new com.applovin.shadow.okio.Path(buffer2.readByteString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteString toSlash(String str) {
        if (k.a(str, "/")) {
            return SLASH;
        }
        if (k.a(str, "\\")) {
            return BACKSLASH;
        }
        throw new IllegalArgumentException(u.t("not a directory separator: ", str));
    }

    public static final com.applovin.shadow.okio.Path commonResolve(com.applovin.shadow.okio.Path path, ByteString byteString, boolean z3) {
        k.e(path, "<this>");
        k.e(byteString, "child");
        return commonResolve(path, toPath(new Buffer().write(byteString), false), z3);
    }

    public static final com.applovin.shadow.okio.Path commonResolve(com.applovin.shadow.okio.Path path, Buffer buffer, boolean z3) {
        k.e(path, "<this>");
        k.e(buffer, "child");
        return commonResolve(path, toPath(buffer, false), z3);
    }

    public static final com.applovin.shadow.okio.Path commonResolve(com.applovin.shadow.okio.Path path, com.applovin.shadow.okio.Path path2, boolean z3) {
        k.e(path, "<this>");
        k.e(path2, "child");
        if (path2.isAbsolute() || path2.volumeLetter() != null) {
            return path2;
        }
        ByteString slash = getSlash(path);
        if (slash == null && (slash = getSlash(path2)) == null) {
            slash = toSlash(com.applovin.shadow.okio.Path.DIRECTORY_SEPARATOR);
        }
        Buffer buffer = new Buffer();
        buffer.write(path.getBytes$okio());
        if (buffer.size() > 0) {
            buffer.write(slash);
        }
        buffer.write(path2.getBytes$okio());
        return toPath(buffer, z3);
    }

    private static final ByteString toSlash(byte b10) {
        if (b10 == 47) {
            return SLASH;
        }
        if (b10 == 92) {
            return BACKSLASH;
        }
        throw new IllegalArgumentException(u.r(b10, "not a directory separator: "));
    }

    private static /* synthetic */ void getANY_SLASH$annotations() {
    }

    private static /* synthetic */ void getBACKSLASH$annotations() {
    }

    private static /* synthetic */ void getDOT$annotations() {
    }

    private static /* synthetic */ void getDOT_DOT$annotations() {
    }

    private static /* synthetic */ void getSLASH$annotations() {
    }
}
