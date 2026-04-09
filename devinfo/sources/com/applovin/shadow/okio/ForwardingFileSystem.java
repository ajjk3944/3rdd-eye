package com.applovin.shadow.okio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mk.c;
import nk.k;
import nk.l;
import nk.v;
import uk.e;
import uk.f;
import zj.q;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class ForwardingFileSystem extends FileSystem {
    private final FileSystem delegate;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.applovin.shadow.okio.ForwardingFileSystem$listRecursively$1, reason: invalid class name */
    public static final class AnonymousClass1 extends l implements c {
        public AnonymousClass1() {
            super(1);
        }

        @Override // mk.c
        public final Path invoke(Path path) {
            k.e(path, "it");
            return ForwardingFileSystem.this.onPathResult(path, "listRecursively");
        }
    }

    public ForwardingFileSystem(FileSystem fileSystem) {
        k.e(fileSystem, "delegate");
        this.delegate = fileSystem;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink appendingSink(Path path, boolean z3) throws IOException {
        k.e(path, "file");
        return this.delegate.appendingSink(onPathParameter(path, "appendingSink", "file"), z3);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void atomicMove(Path path, Path path2) throws IOException {
        k.e(path, "source");
        k.e(path2, "target");
        this.delegate.atomicMove(onPathParameter(path, "atomicMove", "source"), onPathParameter(path2, "atomicMove", "target"));
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Path canonicalize(Path path) throws IOException {
        k.e(path, "path");
        return onPathResult(this.delegate.canonicalize(onPathParameter(path, "canonicalize", "path")), "canonicalize");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createDirectory(Path path, boolean z3) throws IOException {
        k.e(path, "dir");
        this.delegate.createDirectory(onPathParameter(path, "createDirectory", "dir"), z3);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createSymlink(Path path, Path path2) throws IOException {
        k.e(path, "source");
        k.e(path2, "target");
        this.delegate.createSymlink(onPathParameter(path, "createSymlink", "source"), onPathParameter(path2, "createSymlink", "target"));
    }

    public final FileSystem delegate() {
        return this.delegate;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void delete(Path path, boolean z3) throws IOException {
        k.e(path, "path");
        this.delegate.delete(onPathParameter(path, "delete", "path"), z3);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public List<Path> list(Path path) throws IOException {
        k.e(path, "dir");
        List<Path> list = this.delegate.list(onPathParameter(path, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "list"));
        }
        q.U(arrayList);
        return arrayList;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public List<Path> listOrNull(Path path) {
        k.e(path, "dir");
        List<Path> listListOrNull = this.delegate.listOrNull(onPathParameter(path, "listOrNull", "dir"));
        if (listListOrNull == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listListOrNull.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "listOrNull"));
        }
        q.U(arrayList);
        return arrayList;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public f listRecursively(Path path, boolean z3) {
        k.e(path, "dir");
        f fVarListRecursively = this.delegate.listRecursively(onPathParameter(path, "listRecursively", "dir"), z3);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        k.e(fVarListRecursively, "<this>");
        return new e(fVarListRecursively, anonymousClass1);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileMetadata metadataOrNull(Path path) throws IOException {
        k.e(path, "path");
        FileMetadata fileMetadataMetadataOrNull = this.delegate.metadataOrNull(onPathParameter(path, "metadataOrNull", "path"));
        if (fileMetadataMetadataOrNull == null) {
            return null;
        }
        return fileMetadataMetadataOrNull.getSymlinkTarget() == null ? fileMetadataMetadataOrNull : FileMetadata.copy$default(fileMetadataMetadataOrNull, false, false, onPathResult(fileMetadataMetadataOrNull.getSymlinkTarget(), "metadataOrNull"), null, null, null, null, null, 251, null);
    }

    public Path onPathParameter(Path path, String str, String str2) {
        k.e(path, "path");
        k.e(str, "functionName");
        k.e(str2, "parameterName");
        return path;
    }

    public Path onPathResult(Path path, String str) {
        k.e(path, "path");
        k.e(str, "functionName");
        return path;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadOnly(Path path) throws IOException {
        k.e(path, "file");
        return this.delegate.openReadOnly(onPathParameter(path, "openReadOnly", "file"));
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadWrite(Path path, boolean z3, boolean z10) throws IOException {
        k.e(path, "file");
        return this.delegate.openReadWrite(onPathParameter(path, "openReadWrite", "file"), z3, z10);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink sink(Path path, boolean z3) throws IOException {
        k.e(path, "file");
        return this.delegate.sink(onPathParameter(path, "sink", "file"), z3);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Source source(Path path) throws IOException {
        k.e(path, "file");
        return this.delegate.source(onPathParameter(path, "source", "file"));
    }

    public String toString() {
        return v.a(getClass()).c() + '(' + this.delegate + ')';
    }
}
