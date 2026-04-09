package jh;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: jh.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C6330c extends ByteArrayOutputStream {
    public C6330c(int i10) {
        super(i10);
    }

    public final byte[] a() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        AbstractC6492s.h(buf, "buf");
        return buf;
    }
}
