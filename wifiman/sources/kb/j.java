package kb;

import java.nio.ByteBuffer;
import kb.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.C6510d;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final f f51362a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f51363b;

    /* renamed from: c, reason: collision with root package name */
    private final ByteBuffer f51364c;

    public j(f header, byte[] body, boolean z10) {
        AbstractC6492s.i(header, "header");
        AbstractC6492s.i(body, "body");
        this.f51362a = header;
        this.f51363b = body;
        this.f51364c = c.f51354a.d(header.d(), l.b.JSON, body, l.b.BINARY, z10);
    }

    public final ByteBuffer a() {
        return this.f51364c;
    }

    public final f b() {
        return this.f51362a;
    }

    public String toString() {
        return this.f51362a + new String(this.f51363b, C6510d.f52215b);
    }
}
