package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class bg2 implements qf2 {
    public ce2 b;
    public ce2 c;
    public ce2 d;
    public ce2 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public bg2() {
        ByteBuffer byteBuffer = qf2.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        ce2 ce2Var = ce2.e;
        this.d = ce2Var;
        this.e = ce2Var;
        this.b = ce2Var;
        this.c = ce2Var;
    }

    @Override // defpackage.qf2
    public final ce2 a(ce2 ce2Var) {
        this.d = ce2Var;
        this.e = k(ce2Var);
        return h() ? this.e : ce2.e;
    }

    @Override // defpackage.qf2
    public final void b() {
        this.h = true;
        l();
    }

    @Override // defpackage.qf2
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.g;
        this.g = qf2.a;
        return byteBuffer;
    }

    @Override // defpackage.qf2
    public boolean e() {
        return this.h && this.g == qf2.a;
    }

    @Override // defpackage.qf2
    public final void g() {
        ByteBuffer byteBuffer = qf2.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        ce2 ce2Var = ce2.e;
        this.d = ce2Var;
        this.e = ce2Var;
        this.b = ce2Var;
        this.c = ce2Var;
        n();
    }

    @Override // defpackage.qf2
    public boolean h() {
        return this.e != ce2.e;
    }

    public final ByteBuffer i(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // defpackage.qf2
    public final void j() {
        this.g = qf2.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        m();
    }

    public abstract ce2 k(ce2 ce2Var);

    public void l() {
    }

    public void m() {
    }

    public void n() {
    }
}
