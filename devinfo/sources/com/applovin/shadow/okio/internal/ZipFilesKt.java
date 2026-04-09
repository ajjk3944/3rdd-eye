package com.applovin.shadow.okio.internal;

import cm.g;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.FileHandle;
import com.applovin.shadow.okio.FileMetadata;
import com.applovin.shadow.okio.FileSystem;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Path;
import com.applovin.shadow.okio.ZipFileSystem;
import com.bumptech.glide.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mk.c;
import mk.e;
import nk.k;
import nk.l;
import nk.q;
import nk.t;
import pk.a;
import vk.p;
import yj.i;
import yj.u;
import zj.n;
import zj.w;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ZipFilesKt {
    private static final int BIT_FLAG_ENCRYPTED = 1;
    private static final int BIT_FLAG_UNSUPPORTED_MASK = 1;
    private static final int CENTRAL_FILE_HEADER_SIGNATURE = 33639248;
    public static final int COMPRESSION_METHOD_DEFLATED = 8;
    public static final int COMPRESSION_METHOD_STORED = 0;
    private static final int END_OF_CENTRAL_DIRECTORY_SIGNATURE = 101010256;
    private static final int HEADER_ID_EXTENDED_TIMESTAMP = 21589;
    private static final int HEADER_ID_ZIP64_EXTENDED_INFO = 1;
    private static final int LOCAL_FILE_HEADER_SIGNATURE = 67324752;
    private static final long MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE = 4294967295L;
    private static final int ZIP64_EOCD_RECORD_SIGNATURE = 101075792;
    private static final int ZIP64_LOCATOR_SIGNATURE = 117853008;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.applovin.shadow.okio.internal.ZipFilesKt$openZip$1, reason: invalid class name */
    public static final class AnonymousClass1 extends l implements c {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // mk.c
        public final Boolean invoke(ZipEntry zipEntry) {
            k.e(zipEntry, "it");
            return Boolean.TRUE;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.applovin.shadow.okio.internal.ZipFilesKt$readEntry$1, reason: invalid class name and case insensitive filesystem */
    public static final class C01411 extends l implements e {
        final /* synthetic */ t $compressedSize;
        final /* synthetic */ q $hasZip64Extra;
        final /* synthetic */ t $offset;
        final /* synthetic */ long $requiredZip64ExtraSize;
        final /* synthetic */ t $size;
        final /* synthetic */ BufferedSource $this_readEntry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01411(q qVar, long j, t tVar, BufferedSource bufferedSource, t tVar2, t tVar3) {
            super(2);
            this.$hasZip64Extra = qVar;
            this.$requiredZip64ExtraSize = j;
            this.$size = tVar;
            this.$this_readEntry = bufferedSource;
            this.$compressedSize = tVar2;
            this.$offset = tVar3;
        }

        @Override // mk.e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            invoke(((Number) obj).intValue(), ((Number) obj2).longValue());
            return u.f37649a;
        }

        public final void invoke(int i4, long j) throws IOException {
            if (i4 == 1) {
                q qVar = this.$hasZip64Extra;
                if (qVar.f29982a) {
                    throw new IOException("bad zip: zip64 extra repeated");
                }
                qVar.f29982a = true;
                if (j < this.$requiredZip64ExtraSize) {
                    throw new IOException("bad zip: zip64 extra too short");
                }
                t tVar = this.$size;
                long longLe = tVar.f29985a;
                if (longLe == ZipFilesKt.MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
                    longLe = this.$this_readEntry.readLongLe();
                }
                tVar.f29985a = longLe;
                t tVar2 = this.$compressedSize;
                tVar2.f29985a = tVar2.f29985a == ZipFilesKt.MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? this.$this_readEntry.readLongLe() : 0L;
                t tVar3 = this.$offset;
                tVar3.f29985a = tVar3.f29985a == ZipFilesKt.MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? this.$this_readEntry.readLongLe() : 0L;
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.applovin.shadow.okio.internal.ZipFilesKt$readOrSkipLocalHeader$1, reason: invalid class name and case insensitive filesystem */
    public static final class C01421 extends l implements e {
        final /* synthetic */ nk.u $createdAtMillis;
        final /* synthetic */ nk.u $lastAccessedAtMillis;
        final /* synthetic */ nk.u $lastModifiedAtMillis;
        final /* synthetic */ BufferedSource $this_readOrSkipLocalHeader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01421(BufferedSource bufferedSource, nk.u uVar, nk.u uVar2, nk.u uVar3) {
            super(2);
            this.$this_readOrSkipLocalHeader = bufferedSource;
            this.$lastModifiedAtMillis = uVar;
            this.$lastAccessedAtMillis = uVar2;
            this.$createdAtMillis = uVar3;
        }

        @Override // mk.e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            invoke(((Number) obj).intValue(), ((Number) obj2).longValue());
            return u.f37649a;
        }

        public final void invoke(int i4, long j) throws IOException {
            if (i4 == ZipFilesKt.HEADER_ID_EXTENDED_TIMESTAMP) {
                if (j < 1) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                byte b10 = this.$this_readOrSkipLocalHeader.readByte();
                boolean z3 = (b10 & 1) == 1;
                boolean z10 = (b10 & 2) == 2;
                boolean z11 = (b10 & 4) == 4;
                BufferedSource bufferedSource = this.$this_readOrSkipLocalHeader;
                long j8 = z3 ? 5L : 1L;
                if (z10) {
                    j8 += 4;
                }
                if (z11) {
                    j8 += 4;
                }
                if (j < j8) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                if (z3) {
                    this.$lastModifiedAtMillis.f29986a = Long.valueOf(bufferedSource.readIntLe() * 1000);
                }
                if (z10) {
                    this.$lastAccessedAtMillis.f29986a = Long.valueOf(this.$this_readOrSkipLocalHeader.readIntLe() * 1000);
                }
                if (z11) {
                    this.$createdAtMillis.f29986a = Long.valueOf(this.$this_readOrSkipLocalHeader.readIntLe() * 1000);
                }
            }
        }
    }

    private static final Map<Path, ZipEntry> buildIndex(List<ZipEntry> list) {
        Path path = Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null);
        i[] iVarArr = {new i(path, new ZipEntry(path, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(w.H(1));
        w.J(linkedHashMap, iVarArr);
        for (ZipEntry zipEntry : n.o0(list, new Comparator() { // from class: com.applovin.shadow.okio.internal.ZipFilesKt$buildIndex$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return a.f(((ZipEntry) t10).getCanonicalPath(), ((ZipEntry) t11).getCanonicalPath());
            }
        })) {
            if (((ZipEntry) linkedHashMap.put(zipEntry.getCanonicalPath(), zipEntry)) == null) {
                while (true) {
                    Path pathParent = zipEntry.getCanonicalPath().parent();
                    if (pathParent != null) {
                        ZipEntry zipEntry2 = (ZipEntry) linkedHashMap.get(pathParent);
                        if (zipEntry2 != null) {
                            zipEntry2.getChildren().add(zipEntry.getCanonicalPath());
                            break;
                        }
                        ZipEntry zipEntry3 = new ZipEntry(pathParent, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null);
                        linkedHashMap.put(pathParent, zipEntry3);
                        zipEntry3.getChildren().add(zipEntry.getCanonicalPath());
                        zipEntry = zipEntry3;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static final Long dosDateTimeToEpochMillis(int i4, int i10) {
        if (i10 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i4 >> 9) & 127) + 1980, ((i4 >> 5) & 15) - 1, i4 & 31, (i10 >> 11) & 31, (i10 >> 5) & 63, (i10 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    private static final String getHex(int i4) {
        d.g(16);
        String string = Integer.toString(i4, 16);
        k.d(string, "toString(this, checkRadix(radix))");
        return "0x".concat(string);
    }

    /* JADX WARN: Finally extract failed */
    public static final ZipFileSystem openZip(Path path, FileSystem fileSystem, c cVar) throws IOException {
        BufferedSource bufferedSourceBuffer;
        k.e(path, "zipPath");
        k.e(fileSystem, "fileSystem");
        k.e(cVar, "predicate");
        FileHandle fileHandleOpenReadOnly = fileSystem.openReadOnly(path);
        try {
            long size = fileHandleOpenReadOnly.size() - 22;
            if (size < 0) {
                throw new IOException("not a zip: size=" + fileHandleOpenReadOnly.size());
            }
            long jMax = Math.max(size - 65536, 0L);
            do {
                BufferedSource bufferedSourceBuffer2 = Okio.buffer(fileHandleOpenReadOnly.source(size));
                try {
                    if (bufferedSourceBuffer2.readIntLe() == END_OF_CENTRAL_DIRECTORY_SIGNATURE) {
                        EocdRecord eocdRecord = readEocdRecord(bufferedSourceBuffer2);
                        String utf8 = bufferedSourceBuffer2.readUtf8(eocdRecord.getCommentByteCount());
                        bufferedSourceBuffer2.close();
                        long j = size - 20;
                        if (j > 0) {
                            bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(j));
                            try {
                                if (bufferedSourceBuffer.readIntLe() == ZIP64_LOCATOR_SIGNATURE) {
                                    int intLe = bufferedSourceBuffer.readIntLe();
                                    long longLe = bufferedSourceBuffer.readLongLe();
                                    if (bufferedSourceBuffer.readIntLe() != 1 || intLe != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(longLe));
                                    try {
                                        int intLe2 = bufferedSourceBuffer.readIntLe();
                                        if (intLe2 != ZIP64_EOCD_RECORD_SIGNATURE) {
                                            throw new IOException("bad zip: expected " + getHex(ZIP64_EOCD_RECORD_SIGNATURE) + " but was " + getHex(intLe2));
                                        }
                                        eocdRecord = readZip64EocdRecord(bufferedSourceBuffer, eocdRecord);
                                        g.e(bufferedSourceBuffer, null);
                                    } finally {
                                    }
                                }
                                g.e(bufferedSourceBuffer, null);
                            } finally {
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(eocdRecord.getCentralDirectoryOffset()));
                        try {
                            long entryCount = eocdRecord.getEntryCount();
                            for (long j8 = 0; j8 < entryCount; j8++) {
                                ZipEntry entry = readEntry(bufferedSourceBuffer);
                                if (entry.getOffset() >= eocdRecord.getCentralDirectoryOffset()) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (((Boolean) cVar.invoke(entry)).booleanValue()) {
                                    arrayList.add(entry);
                                }
                            }
                            g.e(bufferedSourceBuffer, null);
                            ZipFileSystem zipFileSystem = new ZipFileSystem(path, fileSystem, buildIndex(arrayList), utf8);
                            g.e(fileHandleOpenReadOnly, null);
                            return zipFileSystem;
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } finally {
                            }
                        }
                    }
                    bufferedSourceBuffer2.close();
                    size--;
                } finally {
                    bufferedSourceBuffer2.close();
                }
            } while (size >= jMax);
            throw new IOException("not a zip: end of central directory signature not found");
        } finally {
        }
    }

    public static /* synthetic */ ZipFileSystem openZip$default(Path path, FileSystem fileSystem, c cVar, int i4, Object obj) throws IOException {
        if ((i4 & 4) != 0) {
            cVar = AnonymousClass1.INSTANCE;
        }
        return openZip(path, fileSystem, cVar);
    }

    public static final ZipEntry readEntry(BufferedSource bufferedSource) throws IOException {
        k.e(bufferedSource, "<this>");
        int intLe = bufferedSource.readIntLe();
        if (intLe != CENTRAL_FILE_HEADER_SIGNATURE) {
            throw new IOException("bad zip: expected " + getHex(CENTRAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(intLe));
        }
        bufferedSource.skip(4L);
        short shortLe = bufferedSource.readShortLe();
        int i4 = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + getHex(i4));
        }
        int shortLe2 = bufferedSource.readShortLe() & 65535;
        Long lDosDateTimeToEpochMillis = dosDateTimeToEpochMillis(bufferedSource.readShortLe() & 65535, bufferedSource.readShortLe() & 65535);
        long intLe2 = bufferedSource.readIntLe() & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        t tVar = new t();
        tVar.f29985a = bufferedSource.readIntLe() & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        t tVar2 = new t();
        tVar2.f29985a = bufferedSource.readIntLe() & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        int shortLe3 = bufferedSource.readShortLe() & 65535;
        int shortLe4 = bufferedSource.readShortLe() & 65535;
        int shortLe5 = bufferedSource.readShortLe() & 65535;
        bufferedSource.skip(8L);
        t tVar3 = new t();
        tVar3.f29985a = bufferedSource.readIntLe() & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        String utf8 = bufferedSource.readUtf8(shortLe3);
        if (vk.i.z0(utf8, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j = tVar2.f29985a == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? 8 : 0L;
        if (tVar.f29985a == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
            j += 8;
        }
        if (tVar3.f29985a == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
            j += 8;
        }
        q qVar = new q();
        readExtra(bufferedSource, shortLe4, new C01411(qVar, j, tVar2, bufferedSource, tVar, tVar3));
        if (j <= 0 || qVar.f29982a) {
            return new ZipEntry(Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null).resolve(utf8), p.p0(utf8, "/", false), bufferedSource.readUtf8(shortLe5), intLe2, tVar.f29985a, tVar2.f29985a, shortLe2, lDosDateTimeToEpochMillis, tVar3.f29985a);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    private static final EocdRecord readEocdRecord(BufferedSource bufferedSource) throws IOException {
        int shortLe = bufferedSource.readShortLe() & 65535;
        int shortLe2 = bufferedSource.readShortLe() & 65535;
        long shortLe3 = bufferedSource.readShortLe() & 65535;
        if (shortLe3 != (bufferedSource.readShortLe() & 65535) || shortLe != 0 || shortLe2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        bufferedSource.skip(4L);
        return new EocdRecord(shortLe3, MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE & bufferedSource.readIntLe(), bufferedSource.readShortLe() & 65535);
    }

    private static final void readExtra(BufferedSource bufferedSource, int i4, e eVar) throws IOException {
        long j = i4;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int shortLe = bufferedSource.readShortLe() & 65535;
            long shortLe2 = bufferedSource.readShortLe() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j8 = j - 4;
            if (j8 < shortLe2) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            bufferedSource.require(shortLe2);
            long size = bufferedSource.getBuffer().size();
            eVar.invoke(Integer.valueOf(shortLe), Long.valueOf(shortLe2));
            long size2 = (bufferedSource.getBuffer().size() + shortLe2) - size;
            if (size2 < 0) {
                throw new IOException(je.u.r(shortLe, "unsupported zip: too many bytes processed for "));
            }
            if (size2 > 0) {
                bufferedSource.getBuffer().skip(size2);
            }
            j = j8 - shortLe2;
        }
    }

    public static final FileMetadata readLocalHeader(BufferedSource bufferedSource, FileMetadata fileMetadata) throws IOException {
        k.e(bufferedSource, "<this>");
        k.e(fileMetadata, "basicMetadata");
        FileMetadata orSkipLocalHeader = readOrSkipLocalHeader(bufferedSource, fileMetadata);
        k.b(orSkipLocalHeader);
        return orSkipLocalHeader;
    }

    private static final FileMetadata readOrSkipLocalHeader(BufferedSource bufferedSource, FileMetadata fileMetadata) throws IOException {
        nk.u uVar = new nk.u();
        uVar.f29986a = fileMetadata != null ? fileMetadata.getLastModifiedAtMillis() : null;
        nk.u uVar2 = new nk.u();
        nk.u uVar3 = new nk.u();
        int intLe = bufferedSource.readIntLe();
        if (intLe != LOCAL_FILE_HEADER_SIGNATURE) {
            throw new IOException("bad zip: expected " + getHex(LOCAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(intLe));
        }
        bufferedSource.skip(2L);
        short shortLe = bufferedSource.readShortLe();
        int i4 = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + getHex(i4));
        }
        bufferedSource.skip(18L);
        long shortLe2 = bufferedSource.readShortLe() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        int shortLe3 = bufferedSource.readShortLe() & 65535;
        bufferedSource.skip(shortLe2);
        if (fileMetadata == null) {
            bufferedSource.skip(shortLe3);
            return null;
        }
        readExtra(bufferedSource, shortLe3, new C01421(bufferedSource, uVar, uVar2, uVar3));
        return new FileMetadata(fileMetadata.isRegularFile(), fileMetadata.isDirectory(), null, fileMetadata.getSize(), (Long) uVar3.f29986a, (Long) uVar.f29986a, (Long) uVar2.f29986a, null, 128, null);
    }

    private static final EocdRecord readZip64EocdRecord(BufferedSource bufferedSource, EocdRecord eocdRecord) throws IOException {
        bufferedSource.skip(12L);
        int intLe = bufferedSource.readIntLe();
        int intLe2 = bufferedSource.readIntLe();
        long longLe = bufferedSource.readLongLe();
        if (longLe != bufferedSource.readLongLe() || intLe != 0 || intLe2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        bufferedSource.skip(8L);
        return new EocdRecord(longLe, bufferedSource.readLongLe(), eocdRecord.getCommentByteCount());
    }

    public static final void skipLocalHeader(BufferedSource bufferedSource) throws IOException {
        k.e(bufferedSource, "<this>");
        readOrSkipLocalHeader(bufferedSource, null);
    }
}
