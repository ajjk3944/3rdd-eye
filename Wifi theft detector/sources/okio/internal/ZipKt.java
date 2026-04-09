package okio.internal;

import b9.a;
import i9.b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.p;
import l9.l;
import okio.BufferedSource;
import okio.FileHandle;
import okio.FileMetadata;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.ZipFileSystem;
import org.jetbrains.annotations.NotNull;
import s9.r;
import s9.u;
import y8.s;
import z8.z;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0005*\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0017\u001a\u00020\u0013*\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010\u001f\u001a\u00020\u001d*\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010!\u001a\u00020\u001d*\u00020\u0010H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010%\u001a\u00020#*\u00020\u00102\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&\u001a\u001f\u0010'\u001a\u0004\u0018\u00010#*\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b'\u0010&\u001a!\u0010*\u001a\u0004\u0018\u00010\u001c2\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0019H\u0002¢\u0006\u0004\b*\u0010+\"\u0014\u0010,\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010-\"\u0014\u0010.\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010-\"\u0014\u0010/\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010-\"\u0014\u00100\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010-\"\u0014\u00101\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010-\"\u0014\u00102\u001a\u00020\u00198\u0000X\u0080T¢\u0006\u0006\n\u0004\b2\u0010-\"\u0014\u00103\u001a\u00020\u00198\u0000X\u0080T¢\u0006\u0006\n\u0004\b3\u0010-\"\u0014\u00104\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010-\"\u0014\u00105\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u0010-\"\u0014\u00106\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00107\"\u0014\u00108\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u0010-\"\u0014\u00109\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u0010-\"\u0018\u0010=\u001a\u00020:*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lokio/Path;", "zipPath", "Lokio/FileSystem;", "fileSystem", "Lkotlin/Function1;", "Lokio/internal/ZipEntry;", "", "predicate", "Lokio/ZipFileSystem;", "openZip", "(Lokio/Path;Lokio/FileSystem;Ll9/l;)Lokio/ZipFileSystem;", "", "entries", "", "buildIndex", "(Ljava/util/List;)Ljava/util/Map;", "Lokio/BufferedSource;", "readEntry", "(Lokio/BufferedSource;)Lokio/internal/ZipEntry;", "Lokio/internal/EocdRecord;", "readEocdRecord", "(Lokio/BufferedSource;)Lokio/internal/EocdRecord;", "regularRecord", "readZip64EocdRecord", "(Lokio/BufferedSource;Lokio/internal/EocdRecord;)Lokio/internal/EocdRecord;", "", "extraSize", "Lkotlin/Function2;", "", "Ly8/s;", "block", "readExtra", "(Lokio/BufferedSource;ILl9/p;)V", "skipLocalHeader", "(Lokio/BufferedSource;)V", "Lokio/FileMetadata;", "basicMetadata", "readLocalHeader", "(Lokio/BufferedSource;Lokio/FileMetadata;)Lokio/FileMetadata;", "readOrSkipLocalHeader", "date", "time", "dosDateTimeToEpochMillis", "(II)Ljava/lang/Long;", "LOCAL_FILE_HEADER_SIGNATURE", "I", "CENTRAL_FILE_HEADER_SIGNATURE", "END_OF_CENTRAL_DIRECTORY_SIGNATURE", "ZIP64_LOCATOR_SIGNATURE", "ZIP64_EOCD_RECORD_SIGNATURE", "COMPRESSION_METHOD_DEFLATED", "COMPRESSION_METHOD_STORED", "BIT_FLAG_ENCRYPTED", "BIT_FLAG_UNSUPPORTED_MASK", "MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE", "J", "HEADER_ID_ZIP64_EXTENDED_INFO", "HEADER_ID_EXTENDED_TIMESTAMP", "", "getHex", "(I)Ljava/lang/String;", "hex", "okio"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class ZipKt {
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

    private static final Map<Path, ZipEntry> buildIndex(List<ZipEntry> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ZipEntry zipEntry : z.Y(list, new Comparator() { // from class: okio.internal.ZipKt$buildIndex$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return a.a(((ZipEntry) t10).getCanonicalPath(), ((ZipEntry) t11).getCanonicalPath());
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

    private static final Long dosDateTimeToEpochMillis(int i10, int i11) {
        if (i11 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i10 >> 9) & 127) + 1980, ((i10 >> 5) & 15) - 1, i10 & 31, (i11 >> 11) & 31, (i11 >> 5) & 63, (i11 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    private static final String getHex(int i10) {
        String string = Integer.toString(i10, kotlin.text.a.a(16));
        p.d(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        return p.m("0x", string);
    }

    /* JADX WARN: Finally extract failed */
    @NotNull
    public static final ZipFileSystem openZip(@NotNull Path zipPath, @NotNull FileSystem fileSystem, @NotNull l predicate) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        p.e(zipPath, "zipPath");
        p.e(fileSystem, "fileSystem");
        p.e(predicate, "predicate");
        FileHandle fileHandleOpenReadOnly = fileSystem.openReadOnly(zipPath);
        long j10 = 0;
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(FileHandle.source$default(fileHandleOpenReadOnly, 0L, 1, null));
            try {
                int intLe = bufferedSourceBuffer.readIntLe();
                if (intLe != LOCAL_FILE_HEADER_SIGNATURE) {
                    if (intLe == END_OF_CENTRAL_DIRECTORY_SIGNATURE) {
                        throw new IOException("unsupported zip: empty");
                    }
                    throw new IOException("not a zip: expected " + getHex(LOCAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(intLe));
                }
                s sVar = s.f25199a;
                b.a(bufferedSourceBuffer, null);
                long size = fileHandleOpenReadOnly.size() - 22;
                if (size < 0) {
                    throw new IOException(p.m("not a zip: size=", Long.valueOf(fileHandleOpenReadOnly.size())));
                }
                long jMax = Math.max(size - 65536, 0L);
                do {
                    BufferedSource bufferedSourceBuffer2 = Okio.buffer(fileHandleOpenReadOnly.source(size));
                    try {
                        if (bufferedSourceBuffer2.readIntLe() == END_OF_CENTRAL_DIRECTORY_SIGNATURE) {
                            EocdRecord eocdRecord = readEocdRecord(bufferedSourceBuffer2);
                            String utf8 = bufferedSourceBuffer2.readUtf8(eocdRecord.getCommentByteCount());
                            bufferedSourceBuffer2.close();
                            long j11 = size - 20;
                            if (j11 > 0) {
                                bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(j11));
                                try {
                                    if (bufferedSourceBuffer.readIntLe() == ZIP64_LOCATOR_SIGNATURE) {
                                        int intLe2 = bufferedSourceBuffer.readIntLe();
                                        long longLe = bufferedSourceBuffer.readLongLe();
                                        if (bufferedSourceBuffer.readIntLe() != 1 || intLe2 != 0) {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                        bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(longLe));
                                        try {
                                            int intLe3 = bufferedSourceBuffer.readIntLe();
                                            if (intLe3 != ZIP64_EOCD_RECORD_SIGNATURE) {
                                                throw new IOException("bad zip: expected " + getHex(ZIP64_EOCD_RECORD_SIGNATURE) + " but was " + getHex(intLe3));
                                            }
                                            eocdRecord = readZip64EocdRecord(bufferedSourceBuffer, eocdRecord);
                                            s sVar2 = s.f25199a;
                                            b.a(bufferedSourceBuffer, null);
                                        } finally {
                                        }
                                    }
                                    s sVar3 = s.f25199a;
                                    b.a(bufferedSourceBuffer, null);
                                } finally {
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(eocdRecord.getCentralDirectoryOffset()));
                            try {
                                long entryCount = eocdRecord.getEntryCount();
                                if (0 < entryCount) {
                                    do {
                                        j10++;
                                        ZipEntry entry = readEntry(bufferedSourceBuffer);
                                        if (entry.getOffset() >= eocdRecord.getCentralDirectoryOffset()) {
                                            throw new IOException("bad zip: local file header offset >= central directory offset");
                                        }
                                        if (((Boolean) predicate.invoke(entry)).booleanValue()) {
                                            arrayList.add(entry);
                                        }
                                    } while (j10 < entryCount);
                                }
                                s sVar4 = s.f25199a;
                                b.a(bufferedSourceBuffer, null);
                                ZipFileSystem zipFileSystem = new ZipFileSystem(zipPath, fileSystem, buildIndex(arrayList), utf8);
                                b.a(fileHandleOpenReadOnly, null);
                                return zipFileSystem;
                            } catch (Throwable th) {
                                try {
                                    throw th;
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
            } catch (Throwable th2) {
                try {
                    throw th2;
                } finally {
                }
            }
        } finally {
        }
    }

    public static /* synthetic */ ZipFileSystem openZip$default(Path path, FileSystem fileSystem, l lVar, int i10, Object obj) throws IOException {
        if ((i10 & 4) != 0) {
            lVar = new l() { // from class: okio.internal.ZipKt.openZip.1
                @Override // l9.l
                @NotNull
                public final Boolean invoke(@NotNull ZipEntry it) {
                    p.e(it, "it");
                    return Boolean.TRUE;
                }
            };
        }
        return openZip(path, fileSystem, lVar);
    }

    @NotNull
    public static final ZipEntry readEntry(@NotNull final BufferedSource bufferedSource) throws IOException {
        p.e(bufferedSource, "<this>");
        int intLe = bufferedSource.readIntLe();
        if (intLe != CENTRAL_FILE_HEADER_SIGNATURE) {
            throw new IOException("bad zip: expected " + getHex(CENTRAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(intLe));
        }
        bufferedSource.skip(4L);
        short shortLe = bufferedSource.readShortLe();
        int i10 = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException(p.m("unsupported zip: general purpose bit flag=", getHex(i10)));
        }
        int shortLe2 = bufferedSource.readShortLe() & 65535;
        Long lDosDateTimeToEpochMillis = dosDateTimeToEpochMillis(bufferedSource.readShortLe() & 65535, bufferedSource.readShortLe() & 65535);
        long intLe2 = bufferedSource.readIntLe() & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        final Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.element = bufferedSource.readIntLe() & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        final Ref$LongRef ref$LongRef2 = new Ref$LongRef();
        ref$LongRef2.element = bufferedSource.readIntLe() & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        int shortLe3 = bufferedSource.readShortLe() & 65535;
        int shortLe4 = bufferedSource.readShortLe() & 65535;
        int shortLe5 = bufferedSource.readShortLe() & 65535;
        bufferedSource.skip(8L);
        final Ref$LongRef ref$LongRef3 = new Ref$LongRef();
        ref$LongRef3.element = bufferedSource.readIntLe() & MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE;
        String utf8 = bufferedSource.readUtf8(shortLe3);
        if (u.O(utf8, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        final long j10 = ref$LongRef2.element == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? 8 : 0L;
        if (ref$LongRef.element == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
            j10 += 8;
        }
        if (ref$LongRef3.element == MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
            j10 += 8;
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        readExtra(bufferedSource, shortLe4, new l9.p() { // from class: okio.internal.ZipKt.readEntry.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // l9.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
                invoke(((Number) obj).intValue(), ((Number) obj2).longValue());
                return s.f25199a;
            }

            public final void invoke(int i11, long j11) throws IOException {
                if (i11 == 1) {
                    Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef;
                    if (ref$BooleanRef2.element) {
                        throw new IOException("bad zip: zip64 extra repeated");
                    }
                    ref$BooleanRef2.element = true;
                    if (j11 < j10) {
                        throw new IOException("bad zip: zip64 extra too short");
                    }
                    Ref$LongRef ref$LongRef4 = ref$LongRef2;
                    long longLe = ref$LongRef4.element;
                    if (longLe == ZipKt.MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE) {
                        longLe = bufferedSource.readLongLe();
                    }
                    ref$LongRef4.element = longLe;
                    Ref$LongRef ref$LongRef5 = ref$LongRef;
                    ref$LongRef5.element = ref$LongRef5.element == ZipKt.MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? bufferedSource.readLongLe() : 0L;
                    Ref$LongRef ref$LongRef6 = ref$LongRef3;
                    ref$LongRef6.element = ref$LongRef6.element == ZipKt.MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE ? bufferedSource.readLongLe() : 0L;
                }
            }
        });
        if (j10 <= 0 || ref$BooleanRef.element) {
            return new ZipEntry(Path.Companion.get$default(Path.INSTANCE, "/", false, 1, (Object) null).resolve(utf8), r.w(utf8, "/", false, 2, null), bufferedSource.readUtf8(shortLe5), intLe2, ref$LongRef.element, ref$LongRef2.element, shortLe2, lDosDateTimeToEpochMillis, ref$LongRef3.element);
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

    private static final void readExtra(BufferedSource bufferedSource, int i10, l9.p pVar) throws IOException {
        long j10 = i10;
        while (j10 != 0) {
            if (j10 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int shortLe = bufferedSource.readShortLe() & 65535;
            long shortLe2 = bufferedSource.readShortLe() & 65535;
            long j11 = j10 - 4;
            if (j11 < shortLe2) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            bufferedSource.require(shortLe2);
            long size = bufferedSource.getBuffer().size();
            pVar.invoke(Integer.valueOf(shortLe), Long.valueOf(shortLe2));
            long size2 = (bufferedSource.getBuffer().size() + shortLe2) - size;
            if (size2 < 0) {
                throw new IOException(p.m("unsupported zip: too many bytes processed for ", Integer.valueOf(shortLe)));
            }
            if (size2 > 0) {
                bufferedSource.getBuffer().skip(size2);
            }
            j10 = j11 - shortLe2;
        }
    }

    @NotNull
    public static final FileMetadata readLocalHeader(@NotNull BufferedSource bufferedSource, @NotNull FileMetadata basicMetadata) throws IOException {
        p.e(bufferedSource, "<this>");
        p.e(basicMetadata, "basicMetadata");
        FileMetadata orSkipLocalHeader = readOrSkipLocalHeader(bufferedSource, basicMetadata);
        p.b(orSkipLocalHeader);
        return orSkipLocalHeader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final FileMetadata readOrSkipLocalHeader(final BufferedSource bufferedSource, FileMetadata fileMetadata) throws IOException {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = fileMetadata == null ? 0 : fileMetadata.getLastModifiedAtMillis();
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        int intLe = bufferedSource.readIntLe();
        if (intLe != LOCAL_FILE_HEADER_SIGNATURE) {
            throw new IOException("bad zip: expected " + getHex(LOCAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(intLe));
        }
        bufferedSource.skip(2L);
        short shortLe = bufferedSource.readShortLe();
        int i10 = shortLe & 65535;
        if ((shortLe & 1) != 0) {
            throw new IOException(p.m("unsupported zip: general purpose bit flag=", getHex(i10)));
        }
        bufferedSource.skip(18L);
        int shortLe2 = bufferedSource.readShortLe() & 65535;
        bufferedSource.skip(bufferedSource.readShortLe() & 65535);
        if (fileMetadata == null) {
            bufferedSource.skip(shortLe2);
            return null;
        }
        readExtra(bufferedSource, shortLe2, new l9.p() { // from class: okio.internal.ZipKt.readOrSkipLocalHeader.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // l9.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
                invoke(((Number) obj).intValue(), ((Number) obj2).longValue());
                return s.f25199a;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.Long] */
            /* JADX WARN: Type inference failed for: r10v11, types: [T, java.lang.Long] */
            /* JADX WARN: Type inference failed for: r11v3, types: [T, java.lang.Long] */
            public final void invoke(int i11, long j10) throws IOException {
                if (i11 == ZipKt.HEADER_ID_EXTENDED_TIMESTAMP) {
                    if (j10 < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    byte b10 = bufferedSource.readByte();
                    boolean z10 = (b10 & 1) == 1;
                    boolean z11 = (b10 & 2) == 2;
                    boolean z12 = (b10 & 4) == 4;
                    BufferedSource bufferedSource2 = bufferedSource;
                    long j11 = z10 ? 5L : 1L;
                    if (z11) {
                        j11 += 4;
                    }
                    if (z12) {
                        j11 += 4;
                    }
                    if (j10 < j11) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z10) {
                        ref$ObjectRef.element = Long.valueOf(bufferedSource2.readIntLe() * 1000);
                    }
                    if (z11) {
                        ref$ObjectRef2.element = Long.valueOf(bufferedSource.readIntLe() * 1000);
                    }
                    if (z12) {
                        ref$ObjectRef3.element = Long.valueOf(bufferedSource.readIntLe() * 1000);
                    }
                }
            }
        });
        return new FileMetadata(fileMetadata.getIsRegularFile(), fileMetadata.getIsDirectory(), null, fileMetadata.getSize(), (Long) ref$ObjectRef3.element, (Long) ref$ObjectRef.element, (Long) ref$ObjectRef2.element, null, 128, null);
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

    public static final void skipLocalHeader(@NotNull BufferedSource bufferedSource) throws IOException {
        p.e(bufferedSource, "<this>");
        readOrSkipLocalHeader(bufferedSource, null);
    }
}
