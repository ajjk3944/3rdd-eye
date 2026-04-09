package V6;

import T.S0;
import android.content.Context;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class x implements S0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23086a;

    /* renamed from: b, reason: collision with root package name */
    private final b f23087b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23088c;

    public x(Context context, b target, boolean z10) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(target, "target");
        this.f23086a = context;
        this.f23087b = target;
        this.f23088c = z10;
    }

    public final b a() {
        return this.f23087b;
    }

    @Override // T.S0
    public void b() {
        if (this.f23088c) {
            com.bumptech.glide.b.t(this.f23086a).p(this.f23087b);
        }
    }

    @Override // T.S0
    public void c() {
        if (this.f23088c) {
            com.bumptech.glide.b.t(this.f23086a).p(this.f23087b);
        }
    }

    @Override // T.S0
    public void d() {
    }
}
