package com.applovin.shadow.okio;

import com.applovin.shadow.okio.Path;
import com.applovin.shadow.okio.internal.ResourceFileSystem;
import java.io.IOException;
import java.util.List;
import mk.c;
import nk.f;
import nk.k;
import wd.b;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class FileSystem {
    public static final Companion Companion = new Companion(null);
    public static final FileSystem RESOURCES;
    public static final FileSystem SYSTEM;
    public static final Path SYSTEM_TEMPORARY_DIRECTORY;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final FileSystem get(java.nio.file.FileSystem fileSystem) {
            k.e(fileSystem, "<this>");
            return new NioFileSystemWrappingFileSystem(fileSystem);
        }

        private Companion() {
        }
    }

    /* renamed from: -write$default, reason: not valid java name */
    public static /* synthetic */ Object m148write$default(FileSystem fileSystem, Path path, boolean z3, c cVar, int i4, Object obj) throws Throwable {
        Object objInvoke;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        k.e(path, "file");
        k.e(cVar, "writerAction");
        BufferedSink bufferedSinkBuffer = Okio.buffer(fileSystem.sink(path, z3));
        Throwable th2 = null;
        try {
            objInvoke = cVar.invoke(bufferedSinkBuffer);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
        } catch (Throwable th4) {
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th5) {
                    b.a(th4, th5);
                }
            }
            objInvoke = null;
            th2 = th4;
        }
        if (th2 != null) {
            throw th2;
        }
        k.b(objInvoke);
        return objInvoke;
    }

    static {
        FileSystem jvmSystemFileSystem;
        try {
            Class.forName("java.nio.file.Files");
            jvmSystemFileSystem = new NioSystemFileSystem();
        } catch (ClassNotFoundException unused) {
            jvmSystemFileSystem = new JvmSystemFileSystem();
        }
        SYSTEM = jvmSystemFileSystem;
        Path.Companion companion = Path.Companion;
        String property = System.getProperty("java.io.tmpdir");
        k.d(property, "getProperty(...)");
        SYSTEM_TEMPORARY_DIRECTORY = Path.Companion.get$default(companion, property, false, 1, (Object) null);
        ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
        k.d(classLoader, "getClassLoader(...)");
        RESOURCES = new ResourceFileSystem(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ Sink appendingSink$default(FileSystem fileSystem, Path path, boolean z3, int i4, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
        }
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return fileSystem.appendingSink(path, z3);
    }

    public static /* synthetic */ void createDirectories$default(FileSystem fileSystem, Path path, boolean z3, int i4, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        fileSystem.createDirectories(path, z3);
    }

    public static /* synthetic */ void createDirectory$default(FileSystem fileSystem, Path path, boolean z3, int i4, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        fileSystem.createDirectory(path, z3);
    }

    public static /* synthetic */ void delete$default(FileSystem fileSystem, Path path, boolean z3, int i4, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        fileSystem.delete(path, z3);
    }

    public static /* synthetic */ void deleteRecursively$default(FileSystem fileSystem, Path path, boolean z3, int i4, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
        }
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        fileSystem.deleteRecursively(path, z3);
    }

    public static final FileSystem get(java.nio.file.FileSystem fileSystem) {
        return Companion.get(fileSystem);
    }

    public static /* synthetic */ uk.f listRecursively$default(FileSystem fileSystem, Path path, boolean z3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
        }
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return fileSystem.listRecursively(path, z3);
    }

    public static /* synthetic */ FileHandle openReadWrite$default(FileSystem fileSystem, Path path, boolean z3, boolean z10, int i4, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
        }
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        if ((i4 & 4) != 0) {
            z10 = false;
        }
        return fileSystem.openReadWrite(path, z3, z10);
    }

    public static /* synthetic */ Sink sink$default(FileSystem fileSystem, Path path, boolean z3, int i4, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return fileSystem.sink(path, z3);
    }

    /* renamed from: -read, reason: not valid java name */
    public final <T> T m149read(Path path, c cVar) throws Throwable {
        T t10;
        k.e(path, "file");
        k.e(cVar, "readerAction");
        BufferedSource bufferedSourceBuffer = Okio.buffer(source(path));
        Throwable th2 = null;
        try {
            t10 = (T) cVar.invoke(bufferedSourceBuffer);
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
        } catch (Throwable th4) {
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th5) {
                    b.a(th4, th5);
                }
            }
            th2 = th4;
            t10 = null;
        }
        if (th2 != null) {
            throw th2;
        }
        k.b(t10);
        return t10;
    }

    /* renamed from: -write, reason: not valid java name */
    public final <T> T m150write(Path path, boolean z3, c cVar) throws Throwable {
        T t10;
        k.e(path, "file");
        k.e(cVar, "writerAction");
        BufferedSink bufferedSinkBuffer = Okio.buffer(sink(path, z3));
        Throwable th2 = null;
        try {
            t10 = (T) cVar.invoke(bufferedSinkBuffer);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
        } catch (Throwable th4) {
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th5) {
                    b.a(th4, th5);
                }
            }
            t10 = null;
            th2 = th4;
        }
        if (th2 != null) {
            throw th2;
        }
        k.b(t10);
        return t10;
    }

    public final Sink appendingSink(Path path) throws IOException {
        k.e(path, "file");
        return appendingSink(path, false);
    }

    public abstract Sink appendingSink(Path path, boolean z3) throws IOException;

    public abstract void atomicMove(Path path, Path path2) throws IOException;

    public abstract Path canonicalize(Path path) throws IOException;

    public void copy(Path path, Path path2) throws IOException {
        k.e(path, "source");
        k.e(path2, "target");
        com.applovin.shadow.okio.internal.FileSystem.commonCopy(this, path, path2);
    }

    public final void createDirectories(Path path, boolean z3) throws IOException {
        k.e(path, "dir");
        com.applovin.shadow.okio.internal.FileSystem.commonCreateDirectories(this, path, z3);
    }

    public final void createDirectory(Path path) throws IOException {
        k.e(path, "dir");
        createDirectory(path, false);
    }

    public abstract void createDirectory(Path path, boolean z3) throws IOException;

    public abstract void createSymlink(Path path, Path path2) throws IOException;

    public final void delete(Path path) throws IOException {
        k.e(path, "path");
        delete(path, false);
    }

    public abstract void delete(Path path, boolean z3) throws IOException;

    public void deleteRecursively(Path path, boolean z3) throws IOException {
        k.e(path, "fileOrDirectory");
        com.applovin.shadow.okio.internal.FileSystem.commonDeleteRecursively(this, path, z3);
    }

    public final boolean exists(Path path) throws IOException {
        k.e(path, "path");
        return com.applovin.shadow.okio.internal.FileSystem.commonExists(this, path);
    }

    public abstract List<Path> list(Path path) throws IOException;

    public abstract List<Path> listOrNull(Path path);

    public uk.f listRecursively(Path path, boolean z3) {
        k.e(path, "dir");
        return com.applovin.shadow.okio.internal.FileSystem.commonListRecursively(this, path, z3);
    }

    public final FileMetadata metadata(Path path) throws IOException {
        k.e(path, "path");
        return com.applovin.shadow.okio.internal.FileSystem.commonMetadata(this, path);
    }

    public abstract FileMetadata metadataOrNull(Path path) throws IOException;

    public abstract FileHandle openReadOnly(Path path) throws IOException;

    public final FileHandle openReadWrite(Path path) throws IOException {
        k.e(path, "file");
        return openReadWrite(path, false, false);
    }

    public abstract FileHandle openReadWrite(Path path, boolean z3, boolean z10) throws IOException;

    public final Sink sink(Path path) throws IOException {
        k.e(path, "file");
        return sink(path, false);
    }

    public abstract Sink sink(Path path, boolean z3) throws IOException;

    public abstract Source source(Path path) throws IOException;

    public final void createDirectories(Path path) throws IOException {
        k.e(path, "dir");
        createDirectories(path, false);
    }

    public final void deleteRecursively(Path path) throws IOException {
        k.e(path, "fileOrDirectory");
        deleteRecursively(path, false);
    }

    public final uk.f listRecursively(Path path) {
        k.e(path, "dir");
        return listRecursively(path, false);
    }
}
