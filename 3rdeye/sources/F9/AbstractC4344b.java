package f9;

import f9.InterfaceC4350h;
import f9.InterfaceC4350h.a;
import kotlin.jvm.internal.m;
import p9.l;

/* compiled from: CoroutineContextImpl.kt */
/* renamed from: f9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4344b<B extends InterfaceC4350h.a, E extends B> implements InterfaceC4350h.b<E> {

    /* renamed from: b, reason: collision with root package name */
    public final m f37866b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4350h.b<?> f37867c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [f9.h$b<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, p9.l<? super f9.h$a, ? extends E extends B>] */
    public AbstractC4344b(InterfaceC4350h.b<B> baseKey, l<? super InterfaceC4350h.a, ? extends E> safeCast) {
        kotlin.jvm.internal.l.f(baseKey, "baseKey");
        kotlin.jvm.internal.l.f(safeCast, "safeCast");
        this.f37866b = (m) safeCast;
        this.f37867c = baseKey instanceof AbstractC4344b ? (InterfaceC4350h.b<B>) ((AbstractC4344b) baseKey).f37867c : baseKey;
    }
}
