package okio.internal;

import c9.c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.i;
import l9.p;
import okio.FileSystem;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;
import z8.j;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/i;", "Lokio/Path;", "Ly8/s;", "<anonymous>", "(Lkotlin/sequences/i;)V"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "okio.internal._FileSystemKt$commonDeleteRecursively$sequence$1", f = "-FileSystem.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class _FileSystemKt$commonDeleteRecursively$sequence$1 extends RestrictedSuspendLambda implements p {
    final /* synthetic */ Path $fileOrDirectory;
    final /* synthetic */ FileSystem $this_commonDeleteRecursively;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public _FileSystemKt$commonDeleteRecursively$sequence$1(FileSystem fileSystem, Path path, c cVar) {
        super(2, cVar);
        this.$this_commonDeleteRecursively = fileSystem;
        this.$fileOrDirectory = path;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c create(@Nullable Object obj, @NotNull c cVar) {
        _FileSystemKt$commonDeleteRecursively$sequence$1 _filesystemkt_commondeleterecursively_sequence_1 = new _FileSystemKt$commonDeleteRecursively$sequence$1(this.$this_commonDeleteRecursively, this.$fileOrDirectory, cVar);
        _filesystemkt_commondeleterecursively_sequence_1.L$0 = obj;
        return _filesystemkt_commondeleterecursively_sequence_1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objF = a.f();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            i iVar = (i) this.L$0;
            FileSystem fileSystem = this.$this_commonDeleteRecursively;
            j jVar = new j();
            Path path = this.$fileOrDirectory;
            this.label = 1;
            if (_FileSystemKt.collectRecursively(iVar, fileSystem, jVar, path, false, true, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return s.f25199a;
    }

    @Override // l9.p
    @Nullable
    public final Object invoke(@NotNull i iVar, @Nullable c cVar) {
        return ((_FileSystemKt$commonDeleteRecursively$sequence$1) create(iVar, cVar)).invokeSuspend(s.f25199a);
    }
}
