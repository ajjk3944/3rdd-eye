package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;

/* renamed from: j$.util.stream.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2434h extends AutoCloseable {
    boolean isParallel();

    Iterator iterator();

    InterfaceC2434h onClose(Runnable runnable);

    InterfaceC2434h parallel();

    InterfaceC2434h sequential();

    Spliterator spliterator();

    InterfaceC2434h unordered();
}
