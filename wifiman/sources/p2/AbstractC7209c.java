package p2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: p2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7209c {
    public static final void a(ReadableByteChannel input, FileChannel output) throws IOException {
        AbstractC6492s.i(input, "input");
        AbstractC6492s.i(output, "output");
        try {
            output.transferFrom(input, 0L, Long.MAX_VALUE);
            output.force(false);
        } finally {
            input.close();
            output.close();
        }
    }
}
