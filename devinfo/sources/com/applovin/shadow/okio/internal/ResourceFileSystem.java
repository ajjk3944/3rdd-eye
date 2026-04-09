package com.applovin.shadow.okio.internal;

import a.a;
import a0.g;
import com.applovin.shadow.okio.FileHandle;
import com.applovin.shadow.okio.FileMetadata;
import com.applovin.shadow.okio.FileSystem;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Path;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import nk.k;
import vk.i;
import vk.p;
import yj.f;
import zj.n;
import zj.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ResourceFileSystem extends FileSystem {
    private static final Companion Companion = new Companion(null);
    private static final Path ROOT = Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null);
    private final ClassLoader classLoader;
    private final f roots$delegate;
    private final FileSystem systemFileSystem;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class Companion {
        public /* synthetic */ Companion(nk.f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean keepPath(Path path) {
            return !p.p0(path.name(), ".class", true);
        }

        public final Path getROOT() {
            return ResourceFileSystem.ROOT;
        }

        public final Path removeBase(Path path, Path path2) {
            k.e(path, "<this>");
            k.e(path2, "base");
            return getROOT().resolve(p.t0(i.N0(path.toString(), path2.toString()), '\\', '/'));
        }

        private Companion() {
        }
    }

    public /* synthetic */ ResourceFileSystem(ClassLoader classLoader, boolean z3, FileSystem fileSystem, int i4, nk.f fVar) {
        this(classLoader, z3, (i4 & 4) != 0 ? FileSystem.SYSTEM : fileSystem);
    }

    private final Path canonicalizeInternal(Path path) {
        return ROOT.resolve(path, true);
    }

    private final List<yj.i> getRoots() {
        return (List) this.roots$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<yj.i> toClasspathRoots(ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources("");
        k.d(resources, "getResources(...)");
        ArrayList list = Collections.list(resources);
        k.d(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i4 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = list.get(i10);
            i10++;
            URL url = (URL) obj;
            k.b(url);
            yj.i fileRoot = toFileRoot(url);
            if (fileRoot != null) {
                arrayList.add(fileRoot);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        k.d(resources2, "getResources(...)");
        ArrayList list2 = Collections.list(resources2);
        k.d(list2, "list(this)");
        ArrayList arrayList2 = new ArrayList();
        int size2 = list2.size();
        while (i4 < size2) {
            Object obj2 = list2.get(i4);
            i4++;
            URL url2 = (URL) obj2;
            k.b(url2);
            yj.i jarRoot = toJarRoot(url2);
            if (jarRoot != null) {
                arrayList2.add(jarRoot);
            }
        }
        return n.j0(arrayList, arrayList2);
    }

    private final yj.i toFileRoot(URL url) {
        if (k.a(url.getProtocol(), "file")) {
            return new yj.i(this.systemFileSystem, Path.Companion.get$default(Path.Companion, new File(url.toURI()), false, 1, (Object) null));
        }
        return null;
    }

    private final yj.i toJarRoot(URL url) {
        int iJ0;
        String string = url.toString();
        k.d(string, "toString(...)");
        if (!p.w0(string, "jar:file:", false) || (iJ0 = i.J0(6, string, "!")) == -1) {
            return null;
        }
        Path.Companion companion = Path.Companion;
        String strSubstring = string.substring(4, iJ0);
        k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new yj.i(ZipFilesKt.openZip(Path.Companion.get$default(companion, new File(URI.create(strSubstring)), false, 1, (Object) null), this.systemFileSystem, ResourceFileSystem$toJarRoot$zip$1.INSTANCE), ROOT);
    }

    private final String toRelativePath(Path path) {
        return canonicalizeInternal(path).relativeTo(ROOT).toString();
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink appendingSink(Path path, boolean z3) throws IOException {
        k.e(path, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void atomicMove(Path path, Path path2) throws IOException {
        k.e(path, "source");
        k.e(path2, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Path canonicalize(Path path) {
        k.e(path, "path");
        return canonicalizeInternal(path);
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createDirectory(Path path, boolean z3) throws IOException {
        k.e(path, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void createSymlink(Path path, Path path2) throws IOException {
        k.e(path, "source");
        k.e(path2, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public void delete(Path path, boolean z3) throws IOException {
        k.e(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public List<Path> list(Path path) throws FileNotFoundException {
        k.e(path, "dir");
        String relativePath = toRelativePath(path);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z3 = false;
        for (yj.i iVar : getRoots()) {
            FileSystem fileSystem = (FileSystem) iVar.f37638a;
            Path path2 = (Path) iVar.f37639b;
            try {
                List<Path> list = fileSystem.list(path2.resolve(relativePath));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(o.T(arrayList, 10));
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    arrayList2.add(Companion.removeBase((Path) obj2, path2));
                }
                n.W(linkedHashSet, arrayList2);
                z3 = true;
            } catch (IOException unused) {
            }
        }
        if (z3) {
            return n.r0(linkedHashSet);
        }
        throw new FileNotFoundException(g.l(path, "file not found: "));
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public List<Path> listOrNull(Path path) {
        k.e(path, "dir");
        String relativePath = toRelativePath(path);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<yj.i> it = getRoots().iterator();
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            yj.i next = it.next();
            FileSystem fileSystem = (FileSystem) next.f37638a;
            Path path2 = (Path) next.f37639b;
            List<Path> listListOrNull = fileSystem.listOrNull(path2.resolve(relativePath));
            if (listListOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listListOrNull) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(o.T(arrayList2, 10));
                int size = arrayList2.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    arrayList3.add(Companion.removeBase((Path) obj2, path2));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                n.W(linkedHashSet, arrayList);
                z3 = true;
            }
        }
        if (z3) {
            return n.r0(linkedHashSet);
        }
        return null;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileMetadata metadataOrNull(Path path) throws IOException {
        k.e(path, "path");
        if (!Companion.keepPath(path)) {
            return null;
        }
        String relativePath = toRelativePath(path);
        for (yj.i iVar : getRoots()) {
            FileMetadata fileMetadataMetadataOrNull = ((FileSystem) iVar.f37638a).metadataOrNull(((Path) iVar.f37639b).resolve(relativePath));
            if (fileMetadataMetadataOrNull != null) {
                return fileMetadataMetadataOrNull;
            }
        }
        return null;
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadOnly(Path path) throws FileNotFoundException {
        k.e(path, "file");
        if (!Companion.keepPath(path)) {
            throw new FileNotFoundException(g.l(path, "file not found: "));
        }
        String relativePath = toRelativePath(path);
        for (yj.i iVar : getRoots()) {
            try {
                return ((FileSystem) iVar.f37638a).openReadOnly(((Path) iVar.f37639b).resolve(relativePath));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException(g.l(path, "file not found: "));
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public FileHandle openReadWrite(Path path, boolean z3, boolean z10) throws IOException {
        k.e(path, "file");
        throw new IOException("resources are not writable");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Sink sink(Path path, boolean z3) throws IOException {
        k.e(path, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // com.applovin.shadow.okio.FileSystem
    public Source source(Path path) throws FileNotFoundException {
        Source source;
        k.e(path, "file");
        if (!Companion.keepPath(path)) {
            throw new FileNotFoundException(g.l(path, "file not found: "));
        }
        Path path2 = ROOT;
        InputStream resourceAsStream = this.classLoader.getResourceAsStream(Path.resolve$default(path2, path, false, 2, (Object) null).relativeTo(path2).toString());
        if (resourceAsStream == null || (source = Okio.source(resourceAsStream)) == null) {
            throw new FileNotFoundException(g.l(path, "file not found: "));
        }
        return source;
    }

    public ResourceFileSystem(ClassLoader classLoader, boolean z3, FileSystem fileSystem) {
        k.e(classLoader, "classLoader");
        k.e(fileSystem, "systemFileSystem");
        this.classLoader = classLoader;
        this.systemFileSystem = fileSystem;
        this.roots$delegate = a.u(new ResourceFileSystem$roots$2(this));
        if (z3) {
            getRoots().size();
        }
    }
}
