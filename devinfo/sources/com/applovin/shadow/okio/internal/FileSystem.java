package com.applovin.shadow.okio.internal;

import androidx.recyclerview.widget.LinearLayoutManager;
import ci.b;
import com.applovin.shadow.okio.FileMetadata;
import com.applovin.shadow.okio.Path;
import dk.a;
import ek.c;
import ek.e;
import ek.i;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import nk.k;
import uk.f;
import uk.g;
import uk.h;
import uk.j;
import yj.u;
import zj.l;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* renamed from: com.applovin.shadow.okio.internal.-FileSystem, reason: invalid class name */
/* loaded from: classes.dex */
public final class FileSystem {

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    @e(c = "com.applovin.shadow.okio.internal.-FileSystem", f = "FileSystem.kt", l = {116, 135, 145}, m = "collectRecursively")
    /* renamed from: com.applovin.shadow.okio.internal.-FileSystem$collectRecursively$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(ck.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // ek.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= LinearLayoutManager.INVALID_OFFSET;
            return FileSystem.collectRecursively(null, null, null, null, false, false, this);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    @e(c = "com.applovin.shadow.okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", l = {96}, m = "invokeSuspend")
    /* renamed from: com.applovin.shadow.okio.internal.-FileSystem$commonListRecursively$1, reason: invalid class name and case insensitive filesystem */
    public static final class C01401 extends i implements mk.e {
        final /* synthetic */ Path $dir;
        final /* synthetic */ boolean $followSymlinks;
        final /* synthetic */ com.applovin.shadow.okio.FileSystem $this_commonListRecursively;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01401(Path path, com.applovin.shadow.okio.FileSystem fileSystem, boolean z3, ck.c<? super C01401> cVar) {
            super(2, cVar);
            this.$dir = path;
            this.$this_commonListRecursively = fileSystem;
            this.$followSymlinks = z3;
        }

        @Override // ek.a
        public final ck.c<u> create(Object obj, ck.c<?> cVar) {
            C01401 c01401 = new C01401(this.$dir, this.$this_commonListRecursively, this.$followSymlinks, cVar);
            c01401.L$0 = obj;
            return c01401;
        }

        @Override // ek.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            h hVar;
            l lVar;
            Iterator<Path> it;
            int i4 = this.label;
            if (i4 == 0) {
                b.D(obj);
                h hVar2 = (h) this.L$0;
                l lVar2 = new l();
                lVar2.addLast(this.$dir);
                hVar = hVar2;
                lVar = lVar2;
                it = this.$this_commonListRecursively.list(this.$dir).iterator();
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                l lVar3 = (l) this.L$1;
                hVar = (h) this.L$0;
                b.D(obj);
                lVar = lVar3;
            }
            while (it.hasNext()) {
                Path next = it.next();
                com.applovin.shadow.okio.FileSystem fileSystem = this.$this_commonListRecursively;
                boolean z3 = this.$followSymlinks;
                this.L$0 = hVar;
                this.L$1 = lVar;
                this.L$2 = it;
                this.label = 1;
                Object objCollectRecursively = FileSystem.collectRecursively(hVar, fileSystem, lVar, next, z3, false, this);
                a aVar = a.f22275a;
                if (objCollectRecursively == aVar) {
                    return aVar;
                }
            }
            return u.f37649a;
        }

        @Override // mk.e
        public final Object invoke(h hVar, ck.c<? super u> cVar) {
            return ((C01401) create(hVar, cVar)).invokeSuspend(u.f37649a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d4, code lost:
    
        if (r0 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d6, code lost:
    
        if (r12 != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d8, code lost:
    
        r5.addLast(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00db, code lost:
    
        r3 = r3.iterator();
        r3 = r1;
        r1 = r2;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0128, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0129, code lost:
    
        r9 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9 A[Catch: all -> 0x0128, TRY_LEAVE, TryCatch #2 {all -> 0x0128, blocks: (B:47:0x00e3, B:49:0x00e9, B:46:0x00db), top: B:72:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0150 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0120 -> B:20:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object collectRecursively(uk.h r16, com.applovin.shadow.okio.FileSystem r17, zj.l r18, com.applovin.shadow.okio.Path r19, boolean r20, boolean r21, ck.c<? super yj.u> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.FileSystem.collectRecursively(uk.h, com.applovin.shadow.okio.FileSystem, zj.l, com.applovin.shadow.okio.Path, boolean, boolean, ck.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #4 {all -> 0x003a, blocks: (B:3:0x0014, B:21:0x0040, B:27:0x0053, B:16:0x0036, B:13:0x0031, B:4:0x001c), top: B:46:0x0014, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053 A[Catch: all -> 0x003a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x003a, blocks: (B:3:0x0014, B:21:0x0040, B:27:0x0053, B:16:0x0036, B:13:0x0031, B:4:0x001c), top: B:46:0x0014, inners: #1, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void commonCopy(com.applovin.shadow.okio.FileSystem r4, com.applovin.shadow.okio.Path r5, com.applovin.shadow.okio.Path r6) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            nk.k.e(r4, r0)
            java.lang.String r0 = "source"
            nk.k.e(r5, r0)
            java.lang.String r0 = "target"
            nk.k.e(r6, r0)
            com.applovin.shadow.okio.Source r5 = r4.source(r5)
            r0 = 0
            com.applovin.shadow.okio.Sink r4 = r4.sink(r6)     // Catch: java.lang.Throwable -> L3a
            com.applovin.shadow.okio.BufferedSink r4 = com.applovin.shadow.okio.Okio.buffer(r4)     // Catch: java.lang.Throwable -> L3a
            long r1 = r4.writeAll(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r6 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L2c
            r4.close()     // Catch: java.lang.Throwable -> L2a
            goto L2c
        L2a:
            r4 = move-exception
            goto L3e
        L2c:
            r4 = r0
            goto L3e
        L2e:
            r6 = move-exception
            if (r4 == 0) goto L3c
            r4.close()     // Catch: java.lang.Throwable -> L35
            goto L3c
        L35:
            r4 = move-exception
            wd.b.a(r6, r4)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            r4 = move-exception
            goto L54
        L3c:
            r4 = r6
            r6 = r0
        L3e:
            if (r4 != 0) goto L53
            nk.k.b(r6)     // Catch: java.lang.Throwable -> L3a
            long r1 = r6.longValue()     // Catch: java.lang.Throwable -> L3a
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L61
            r5.close()     // Catch: java.lang.Throwable -> L51
            goto L61
        L51:
            r0 = move-exception
            goto L61
        L53:
            throw r4     // Catch: java.lang.Throwable -> L3a
        L54:
            if (r5 == 0) goto L5e
            r5.close()     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r5 = move-exception
            wd.b.a(r4, r5)
        L5e:
            r3 = r0
            r0 = r4
            r4 = r3
        L61:
            if (r0 != 0) goto L67
            nk.k.b(r4)
            return
        L67:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.FileSystem.commonCopy(com.applovin.shadow.okio.FileSystem, com.applovin.shadow.okio.Path, com.applovin.shadow.okio.Path):void");
    }

    public static final void commonCreateDirectories(com.applovin.shadow.okio.FileSystem fileSystem, Path path, boolean z3) throws IOException {
        k.e(fileSystem, "<this>");
        k.e(path, "dir");
        l lVar = new l();
        for (Path pathParent = path; pathParent != null && !fileSystem.exists(pathParent); pathParent = pathParent.parent()) {
            lVar.addFirst(pathParent);
        }
        if (z3 && lVar.isEmpty()) {
            throw new IOException(path + " already exists.");
        }
        Iterator<E> it = lVar.iterator();
        while (it.hasNext()) {
            fileSystem.createDirectory((Path) it.next());
        }
    }

    public static final void commonDeleteRecursively(com.applovin.shadow.okio.FileSystem fileSystem, Path path, boolean z3) throws IOException {
        k.e(fileSystem, "<this>");
        k.e(path, "fileOrDirectory");
        g gVarR = jm.a.r(new FileSystem$commonDeleteRecursively$sequence$1(fileSystem, path, null));
        while (gVarR.hasNext()) {
            fileSystem.delete((Path) gVarR.next(), z3 && !gVarR.hasNext());
        }
    }

    public static final boolean commonExists(com.applovin.shadow.okio.FileSystem fileSystem, Path path) throws IOException {
        k.e(fileSystem, "<this>");
        k.e(path, "path");
        return fileSystem.metadataOrNull(path) != null;
    }

    public static final f commonListRecursively(com.applovin.shadow.okio.FileSystem fileSystem, Path path, boolean z3) throws IOException {
        k.e(fileSystem, "<this>");
        k.e(path, "dir");
        return new j(new C01401(path, fileSystem, z3, null));
    }

    public static final FileMetadata commonMetadata(com.applovin.shadow.okio.FileSystem fileSystem, Path path) throws IOException {
        k.e(fileSystem, "<this>");
        k.e(path, "path");
        FileMetadata fileMetadataMetadataOrNull = fileSystem.metadataOrNull(path);
        if (fileMetadataMetadataOrNull != null) {
            return fileMetadataMetadataOrNull;
        }
        throw new FileNotFoundException(a0.g.l(path, "no such file: "));
    }

    public static final Path symlinkTarget(com.applovin.shadow.okio.FileSystem fileSystem, Path path) throws IOException {
        k.e(fileSystem, "<this>");
        k.e(path, "path");
        Path symlinkTarget = fileSystem.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        Path pathParent = path.parent();
        k.b(pathParent);
        return pathParent.resolve(symlinkTarget);
    }
}
