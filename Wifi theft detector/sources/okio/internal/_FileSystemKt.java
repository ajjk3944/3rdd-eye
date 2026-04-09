package okio.internal;

import c9.c;
import com.mbridge.msdk.MBridgeConstans;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.g;
import kotlin.sequences.i;
import l9.p;
import okio.BufferedSink;
import okio.FileMetadata;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xbill.DNS.WKSRecord;
import y8.d;
import y8.s;
import z8.j;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0010\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0014\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0014\u0010\r\u001a)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001aK\u0010\u001e\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001d\u0010 \u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lokio/FileSystem;", "Lokio/Path;", MBridgeConstans.DYNAMIC_VIEW_WX_PATH, "Lokio/FileMetadata;", "commonMetadata", "(Lokio/FileSystem;Lokio/Path;)Lokio/FileMetadata;", "", "commonExists", "(Lokio/FileSystem;Lokio/Path;)Z", "dir", "mustCreate", "Ly8/s;", "commonCreateDirectories", "(Lokio/FileSystem;Lokio/Path;Z)V", "source", "target", "commonCopy", "(Lokio/FileSystem;Lokio/Path;Lokio/Path;)V", "fileOrDirectory", "mustExist", "commonDeleteRecursively", "followSymlinks", "Lkotlin/sequences/g;", "commonListRecursively", "(Lokio/FileSystem;Lokio/Path;Z)Lkotlin/sequences/g;", "Lkotlin/sequences/i;", "fileSystem", "Lz8/j;", "stack", "postorder", "collectRecursively", "(Lkotlin/sequences/i;Lokio/FileSystem;Lz8/j;Lokio/Path;ZZLc9/c;)Ljava/lang/Object;", "symlinkTarget", "(Lokio/FileSystem;Lokio/Path;)Lokio/Path;", "okio"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class _FileSystemKt {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "okio.internal._FileSystemKt", f = "-FileSystem.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {113, 132, WKSRecord.Service.BL_IDM}, m = "collectRecursively", n = {"$this$collectRecursively", "fileSystem", "stack", MBridgeConstans.DYNAMIC_VIEW_WX_PATH, "followSymlinks", "postorder", "$this$collectRecursively", "fileSystem", "stack", MBridgeConstans.DYNAMIC_VIEW_WX_PATH, "followSymlinks", "postorder"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1"})
    /* renamed from: okio.internal._FileSystemKt$collectRecursively$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return _FileSystemKt.collectRecursively(null, null, null, null, false, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/i;", "Lokio/Path;", "Ly8/s;", "<anonymous>", "(Lkotlin/sequences/i;)V"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "okio.internal._FileSystemKt$commonListRecursively$1", f = "-FileSystem.kt", i = {0, 0}, l = {93}, m = "invokeSuspend", n = {"$this$sequence", "stack"}, s = {"L$0", "L$1"})
    /* renamed from: okio.internal._FileSystemKt$commonListRecursively$1, reason: invalid class name and case insensitive filesystem */
    public static final class C25781 extends RestrictedSuspendLambda implements p {
        final /* synthetic */ Path $dir;
        final /* synthetic */ boolean $followSymlinks;
        final /* synthetic */ FileSystem $this_commonListRecursively;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25781(Path path, FileSystem fileSystem, boolean z10, c cVar) {
            super(2, cVar);
            this.$dir = path;
            this.$this_commonListRecursively = fileSystem;
            this.$followSymlinks = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c create(@Nullable Object obj, @NotNull c cVar) {
            C25781 c25781 = new C25781(this.$dir, this.$this_commonListRecursively, this.$followSymlinks, cVar);
            c25781.L$0 = obj;
            return c25781;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            i iVar;
            j jVar;
            Iterator<Path> it;
            Object objF = a.f();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                i iVar2 = (i) this.L$0;
                j jVar2 = new j();
                jVar2.addLast(this.$dir);
                iVar = iVar2;
                jVar = jVar2;
                it = this.$this_commonListRecursively.list(this.$dir).iterator();
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                j jVar3 = (j) this.L$1;
                iVar = (i) this.L$0;
                kotlin.c.b(obj);
                jVar = jVar3;
            }
            while (it.hasNext()) {
                Path next = it.next();
                FileSystem fileSystem = this.$this_commonListRecursively;
                boolean z10 = this.$followSymlinks;
                this.L$0 = iVar;
                this.L$1 = jVar;
                this.L$2 = it;
                this.label = 1;
                if (_FileSystemKt.collectRecursively(iVar, fileSystem, jVar, next, z10, false, this) == objF) {
                    return objF;
                }
            }
            return s.f25199a;
        }

        @Override // l9.p
        @Nullable
        public final Object invoke(@NotNull i iVar, @Nullable c cVar) {
            return ((C25781) create(iVar, cVar)).invokeSuspend(s.f25199a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        if (r15.a(r1, r4) == r5) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00db, code lost:
    
        if (r0 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dd, code lost:
    
        if (r11 != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00df, code lost:
    
        r6.addLast(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e2, code lost:
    
        r3 = r3.iterator();
        r3 = r1;
        r1 = r2;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012e, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0155, code lost:
    
        if (r10.a(r1, r4) == r5) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0 A[Catch: all -> 0x012d, TRY_LEAVE, TryCatch #2 {all -> 0x012d, blocks: (B:48:0x00ea, B:50:0x00f0, B:47:0x00e2), top: B:77:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0125 -> B:19:0x005d). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object collectRecursively(@org.jetbrains.annotations.NotNull kotlin.sequences.i r15, @org.jetbrains.annotations.NotNull okio.FileSystem r16, @org.jetbrains.annotations.NotNull z8.j r17, @org.jetbrains.annotations.NotNull okio.Path r18, boolean r19, boolean r20, @org.jetbrains.annotations.NotNull c9.c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal._FileSystemKt.collectRecursively(kotlin.sequences.i, okio.FileSystem, z8.j, okio.Path, boolean, boolean, c9.c):java.lang.Object");
    }

    public static final void commonCopy(@NotNull FileSystem fileSystem, @NotNull Path source, @NotNull Path target) throws IOException {
        Long lValueOf;
        Long lValueOf2;
        kotlin.jvm.internal.p.e(fileSystem, "<this>");
        kotlin.jvm.internal.p.e(source, "source");
        kotlin.jvm.internal.p.e(target, "target");
        Source source2 = fileSystem.source(source);
        Throwable th = null;
        try {
            BufferedSink bufferedSinkBuffer = Okio.buffer(fileSystem.sink(target));
            try {
                lValueOf2 = Long.valueOf(bufferedSinkBuffer.writeAll(source2));
                th = null;
            } catch (Throwable th2) {
                th = th2;
                lValueOf2 = null;
            }
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    } else {
                        d.a(th, th3);
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
            lValueOf = null;
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.p.b(lValueOf2);
        lValueOf = Long.valueOf(lValueOf2.longValue());
        if (source2 != null) {
            try {
                source2.close();
            } catch (Throwable th5) {
                if (th == null) {
                    th = th5;
                } else {
                    d.a(th, th5);
                }
            }
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.p.b(lValueOf);
    }

    public static final void commonCreateDirectories(@NotNull FileSystem fileSystem, @NotNull Path dir, boolean z10) throws IOException {
        kotlin.jvm.internal.p.e(fileSystem, "<this>");
        kotlin.jvm.internal.p.e(dir, "dir");
        j jVar = new j();
        for (Path pathParent = dir; pathParent != null && !fileSystem.exists(pathParent); pathParent = pathParent.parent()) {
            jVar.addFirst(pathParent);
        }
        if (z10 && jVar.isEmpty()) {
            throw new IOException(dir + " already exist.");
        }
        Iterator<E> it = jVar.iterator();
        while (it.hasNext()) {
            fileSystem.createDirectory((Path) it.next());
        }
    }

    public static final void commonDeleteRecursively(@NotNull FileSystem fileSystem, @NotNull Path fileOrDirectory, boolean z10) throws IOException {
        kotlin.jvm.internal.p.e(fileSystem, "<this>");
        kotlin.jvm.internal.p.e(fileOrDirectory, "fileOrDirectory");
        Iterator it = kotlin.sequences.j.b(new _FileSystemKt$commonDeleteRecursively$sequence$1(fileSystem, fileOrDirectory, null)).iterator();
        while (it.hasNext()) {
            fileSystem.delete((Path) it.next(), z10 && !it.hasNext());
        }
    }

    public static final boolean commonExists(@NotNull FileSystem fileSystem, @NotNull Path path) throws IOException {
        kotlin.jvm.internal.p.e(fileSystem, "<this>");
        kotlin.jvm.internal.p.e(path, "path");
        return fileSystem.metadataOrNull(path) != null;
    }

    @NotNull
    public static final g commonListRecursively(@NotNull FileSystem fileSystem, @NotNull Path dir, boolean z10) throws IOException {
        kotlin.jvm.internal.p.e(fileSystem, "<this>");
        kotlin.jvm.internal.p.e(dir, "dir");
        return kotlin.sequences.j.b(new C25781(dir, fileSystem, z10, null));
    }

    @NotNull
    public static final FileMetadata commonMetadata(@NotNull FileSystem fileSystem, @NotNull Path path) throws IOException {
        kotlin.jvm.internal.p.e(fileSystem, "<this>");
        kotlin.jvm.internal.p.e(path, "path");
        FileMetadata fileMetadataMetadataOrNull = fileSystem.metadataOrNull(path);
        if (fileMetadataMetadataOrNull != null) {
            return fileMetadataMetadataOrNull;
        }
        throw new FileNotFoundException(kotlin.jvm.internal.p.m("no such file: ", path));
    }

    @Nullable
    public static final Path symlinkTarget(@NotNull FileSystem fileSystem, @NotNull Path path) throws IOException {
        kotlin.jvm.internal.p.e(fileSystem, "<this>");
        kotlin.jvm.internal.p.e(path, "path");
        Path symlinkTarget = fileSystem.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        Path pathParent = path.parent();
        kotlin.jvm.internal.p.b(pathParent);
        return pathParent.resolve(symlinkTarget);
    }
}
