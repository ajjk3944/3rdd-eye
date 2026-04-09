package kb;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.C6510d;

/* loaded from: classes3.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    private q f51384a;

    /* renamed from: b, reason: collision with root package name */
    private String f51385b;

    /* renamed from: c, reason: collision with root package name */
    private k f51386c = new k();

    public final void a(ByteBuffer buffer) {
        AbstractC6492s.i(buffer, "buffer");
        if (!this.f51386c.d()) {
            this.f51386c.a(buffer);
        }
        if (this.f51386c.d() && this.f51384a == null) {
            String str = new String(this.f51386c.c(), C6510d.f52215b);
            this.f51385b = str;
            this.f51384a = g(str);
        }
        if (buffer.hasRemaining()) {
            f(buffer);
        }
    }

    public abstract byte[] b();

    public final q c() {
        return this.f51384a;
    }

    public abstract boolean d();

    public final boolean e() {
        return this.f51386c.d();
    }

    public abstract void f(ByteBuffer byteBuffer);

    public abstract q g(String str);

    public String toString() {
        if (!d()) {
            return "Still waiting!";
        }
        String str = this.f51385b;
        if (str == null) {
            AbstractC6492s.v("_headerString");
            str = null;
        }
        return "header: " + str;
    }
}
