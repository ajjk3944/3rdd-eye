package com.applovin.shadow.okio;

import java.util.ArrayList;
import java.util.Map;
import nk.e;
import nk.f;
import nk.k;
import tk.b;
import zj.n;
import zj.t;
import zj.w;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class FileMetadata {
    private final Long createdAtMillis;
    private final Map<b, Object> extras;
    private final boolean isDirectory;
    private final boolean isRegularFile;
    private final Long lastAccessedAtMillis;
    private final Long lastModifiedAtMillis;
    private final Long size;
    private final Path symlinkTarget;

    public FileMetadata() {
        this(false, false, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ FileMetadata copy$default(FileMetadata fileMetadata, boolean z3, boolean z10, Path path, Long l10, Long l11, Long l12, Long l13, Map map, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = fileMetadata.isRegularFile;
        }
        if ((i4 & 2) != 0) {
            z10 = fileMetadata.isDirectory;
        }
        if ((i4 & 4) != 0) {
            path = fileMetadata.symlinkTarget;
        }
        if ((i4 & 8) != 0) {
            l10 = fileMetadata.size;
        }
        if ((i4 & 16) != 0) {
            l11 = fileMetadata.createdAtMillis;
        }
        if ((i4 & 32) != 0) {
            l12 = fileMetadata.lastModifiedAtMillis;
        }
        if ((i4 & 64) != 0) {
            l13 = fileMetadata.lastAccessedAtMillis;
        }
        if ((i4 & 128) != 0) {
            map = fileMetadata.extras;
        }
        Long l14 = l13;
        Map map2 = map;
        Long l15 = l11;
        Long l16 = l12;
        return fileMetadata.copy(z3, z10, path, l10, l15, l16, l14, map2);
    }

    public final FileMetadata copy(boolean z3, boolean z10, Path path, Long l10, Long l11, Long l12, Long l13, Map<b, ? extends Object> map) {
        k.e(map, "extras");
        return new FileMetadata(z3, z10, path, l10, l11, l12, l13, map);
    }

    public final <T> T extra(b bVar) {
        k.e(bVar, "type");
        T t10 = (T) this.extras.get(bVar);
        if (t10 == null) {
            return null;
        }
        e eVar = (e) bVar;
        if (eVar.d(t10)) {
            return t10;
        }
        throw new ClassCastException("Value cannot be cast to " + eVar.b());
    }

    public final Long getCreatedAtMillis() {
        return this.createdAtMillis;
    }

    public final Map<b, Object> getExtras() {
        return this.extras;
    }

    public final Long getLastAccessedAtMillis() {
        return this.lastAccessedAtMillis;
    }

    public final Long getLastModifiedAtMillis() {
        return this.lastModifiedAtMillis;
    }

    public final Long getSize() {
        return this.size;
    }

    public final Path getSymlinkTarget() {
        return this.symlinkTarget;
    }

    public final boolean isDirectory() {
        return this.isDirectory;
    }

    public final boolean isRegularFile() {
        return this.isRegularFile;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.isRegularFile) {
            arrayList.add("isRegularFile");
        }
        if (this.isDirectory) {
            arrayList.add("isDirectory");
        }
        if (this.size != null) {
            arrayList.add("byteCount=" + this.size);
        }
        if (this.createdAtMillis != null) {
            arrayList.add("createdAt=" + this.createdAtMillis);
        }
        if (this.lastModifiedAtMillis != null) {
            arrayList.add("lastModifiedAt=" + this.lastModifiedAtMillis);
        }
        if (this.lastAccessedAtMillis != null) {
            arrayList.add("lastAccessedAt=" + this.lastAccessedAtMillis);
        }
        if (!this.extras.isEmpty()) {
            arrayList.add("extras=" + this.extras);
        }
        return n.g0(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public FileMetadata(boolean z3, boolean z10, Path path, Long l10, Long l11, Long l12, Long l13, Map<b, ? extends Object> map) {
        k.e(map, "extras");
        this.isRegularFile = z3;
        this.isDirectory = z10;
        this.symlinkTarget = path;
        this.size = l10;
        this.createdAtMillis = l11;
        this.lastModifiedAtMillis = l12;
        this.lastAccessedAtMillis = l13;
        this.extras = w.L(map);
    }

    public /* synthetic */ FileMetadata(boolean z3, boolean z10, Path path, Long l10, Long l11, Long l12, Long l13, Map map, int i4, f fVar) {
        this((i4 & 1) != 0 ? false : z3, (i4 & 2) != 0 ? false : z10, (i4 & 4) != 0 ? null : path, (i4 & 8) != 0 ? null : l10, (i4 & 16) != 0 ? null : l11, (i4 & 32) != 0 ? null : l12, (i4 & 64) != 0 ? null : l13, (i4 & 128) != 0 ? t.f38318a : map);
    }
}
