package com.applovin.shadow.okio.internal;

import ci.b;
import ck.c;
import com.applovin.shadow.okio.FileSystem;
import com.applovin.shadow.okio.Path;
import dk.a;
import ek.e;
import ek.i;
import uk.h;
import yj.u;
import zj.l;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@e(c = "com.applovin.shadow.okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", f = "FileSystem.kt", l = {75}, m = "invokeSuspend")
/* renamed from: com.applovin.shadow.okio.internal.-FileSystem$commonDeleteRecursively$sequence$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class FileSystem$commonDeleteRecursively$sequence$1 extends i implements mk.e {
    final /* synthetic */ Path $fileOrDirectory;
    final /* synthetic */ FileSystem $this_commonDeleteRecursively;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystem$commonDeleteRecursively$sequence$1(FileSystem fileSystem, Path path, c<? super FileSystem$commonDeleteRecursively$sequence$1> cVar) {
        super(2, cVar);
        this.$this_commonDeleteRecursively = fileSystem;
        this.$fileOrDirectory = path;
    }

    @Override // ek.a
    public final c<u> create(Object obj, c<?> cVar) {
        FileSystem$commonDeleteRecursively$sequence$1 fileSystem$commonDeleteRecursively$sequence$1 = new FileSystem$commonDeleteRecursively$sequence$1(this.$this_commonDeleteRecursively, this.$fileOrDirectory, cVar);
        fileSystem$commonDeleteRecursively$sequence$1.L$0 = obj;
        return fileSystem$commonDeleteRecursively$sequence$1;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i4 = this.label;
        if (i4 == 0) {
            b.D(obj);
            h hVar = (h) this.L$0;
            FileSystem fileSystem = this.$this_commonDeleteRecursively;
            l lVar = new l();
            Path path = this.$fileOrDirectory;
            this.label = 1;
            Object objCollectRecursively = FileSystem.collectRecursively(hVar, fileSystem, lVar, path, false, true, this);
            a aVar = a.f22275a;
            if (objCollectRecursively == aVar) {
                return aVar;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.D(obj);
        }
        return u.f37649a;
    }

    @Override // mk.e
    public final Object invoke(h hVar, c<? super u> cVar) {
        return ((FileSystem$commonDeleteRecursively$sequence$1) create(hVar, cVar)).invokeSuspend(u.f37649a);
    }
}
