package org.msgpack.core;

import java.io.IOException;
import org.msgpack.core.d;

/* loaded from: classes.dex */
public class b extends e {
    protected b(d.b bVar) {
        this(new org.msgpack.core.buffer.b(), bVar);
    }

    private org.msgpack.core.buffer.b q0() {
        return (org.msgpack.core.buffer.b) this.f57011d;
    }

    public byte[] r0() {
        try {
            flush();
            return q0().g();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    protected b(org.msgpack.core.buffer.b bVar, d.b bVar2) {
        super(bVar, bVar2);
    }
}
