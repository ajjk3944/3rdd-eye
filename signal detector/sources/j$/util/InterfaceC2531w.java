package j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2531w extends B {
    @Override // java.util.Iterator, j$.util.InterfaceC2391k
    void forEachRemaining(Consumer consumer);

    void forEachRemaining(IntConsumer intConsumer);

    @Override // java.util.Iterator
    Integer next();

    int nextInt();
}
