package kb;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public abstract class m extends p {

    /* renamed from: d, reason: collision with root package name */
    private k f51376d = new k();

    @Override // kb.p
    public byte[] b() {
        return this.f51376d.c();
    }

    @Override // kb.p
    public boolean d() {
        return e() && this.f51376d.d();
    }

    @Override // kb.p
    public void f(ByteBuffer buffer) {
        AbstractC6492s.i(buffer, "buffer");
        if (this.f51376d.d()) {
            return;
        }
        this.f51376d.a(buffer);
    }
}
