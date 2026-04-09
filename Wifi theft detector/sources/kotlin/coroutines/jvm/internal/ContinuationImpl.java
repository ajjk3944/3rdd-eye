package kotlin.coroutines.jvm.internal;

import c9.c;
import d9.b;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.d;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lc9/c;", "", "completion", "Lkotlin/coroutines/d;", "_context", "<init>", "(Lc9/c;Lkotlin/coroutines/d;)V", "(Lc9/c;)V", "intercepted", "()Lc9/c;", "Ly8/s;", "releaseIntercepted", "()V", "Lkotlin/coroutines/d;", "Lc9/c;", "getContext", "()Lkotlin/coroutines/d;", "context", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContinuationImpl.kt\nkotlin/coroutines/jvm/internal/ContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
/* loaded from: classes4.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {

    @Nullable
    private final d _context;

    @Nullable
    private transient c intercepted;

    public ContinuationImpl(c cVar, d dVar) {
        super(cVar);
        this._context = dVar;
    }

    @Override // c9.c
    @NotNull
    public d getContext() {
        d dVar = this._context;
        p.b(dVar);
        return dVar;
    }

    @NotNull
    public final c intercepted() {
        c cVarP = this.intercepted;
        if (cVarP == null) {
            kotlin.coroutines.c cVar = (kotlin.coroutines.c) getContext().get(kotlin.coroutines.c.F8);
            if (cVar == null || (cVarP = cVar.P(this)) == null) {
                cVarP = this;
            }
            this.intercepted = cVarP;
        }
        return cVarP;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        c cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            d.b bVar = getContext().get(kotlin.coroutines.c.F8);
            p.b(bVar);
            ((kotlin.coroutines.c) bVar).I(cVar);
        }
        this.intercepted = b.f20809a;
    }

    public ContinuationImpl(c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
