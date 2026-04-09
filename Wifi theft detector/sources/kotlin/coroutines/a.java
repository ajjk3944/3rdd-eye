package kotlin.coroutines;

import kotlin.coroutines.d;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public abstract class a implements d.b {

    @NotNull
    private final d.c key;

    public a(d.c key) {
        p.e(key, "key");
        this.key = key;
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r10, @NotNull l9.p pVar) {
        return (R) d.b.a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @Nullable
    public <E extends d.b> E get(@NotNull d.c cVar) {
        return (E) d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    @NotNull
    public d.c getKey() {
        return this.key;
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public d minusKey(@NotNull d.c cVar) {
        return d.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public d plus(@NotNull d dVar) {
        return d.b.a.d(this, dVar);
    }
}
