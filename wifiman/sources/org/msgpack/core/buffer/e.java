package org.msgpack.core.buffer;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes3.dex */
public interface e extends Closeable, Flushable {
    void B(int i10);

    MessageBuffer L(int i10);

    void write(byte[] bArr, int i10, int i11);
}
