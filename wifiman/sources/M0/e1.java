package m0;

import android.graphics.Shader;
import kotlin.jvm.internal.AbstractC6492s;
import l0.C6537m;
import m0.C6733v0;

/* loaded from: classes.dex */
public abstract class e1 extends AbstractC6713l0 {

    /* renamed from: c, reason: collision with root package name */
    private Shader f52912c;

    /* renamed from: d, reason: collision with root package name */
    private long f52913d;

    public e1() {
        super(null);
        this.f52913d = C6537m.f52356b.a();
    }

    @Override // m0.AbstractC6713l0
    public final void a(long j10, S0 s02, float f10) {
        Shader shaderB = this.f52912c;
        if (shaderB == null || !C6537m.f(this.f52913d, j10)) {
            if (C6537m.k(j10)) {
                shaderB = null;
                this.f52912c = null;
                this.f52913d = C6537m.f52356b.a();
            } else {
                shaderB = b(j10);
                this.f52912c = shaderB;
                this.f52913d = j10;
            }
        }
        long jC = s02.c();
        C6733v0.a aVar = C6733v0.f52951b;
        if (!C6733v0.m(jC, aVar.a())) {
            s02.I(aVar.a());
        }
        if (!AbstractC6492s.d(s02.z(), shaderB)) {
            s02.y(shaderB);
        }
        if (s02.b() == f10) {
            return;
        }
        s02.a(f10);
    }

    public abstract Shader b(long j10);
}
