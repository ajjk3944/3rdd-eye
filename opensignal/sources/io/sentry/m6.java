package io.sentry;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final /* synthetic */ class m6 implements io.sentry.util.d, r3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12440a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12441d;

    public /* synthetic */ m6(io.sentry.protocol.t tVar, String str) {
        this.f12440a = 2;
        this.f12441d = str;
    }

    @Override // io.sentry.util.d
    public Object e() {
        int i10 = this.f12440a;
        String str = this.f12441d;
        switch (i10) {
            case 0:
                return str;
            default:
                Charset charset = io.sentry.util.k.f12817a;
                if (str.equals("0000-0000")) {
                    str = "00000000-0000-0000-0000-000000000000";
                }
                return str.replace("-", "");
        }
    }

    @Override // io.sentry.r3
    public void i(z0 z0Var) {
        z0Var.x(this.f12441d);
    }

    public /* synthetic */ m6(String str, int i10) {
        this.f12440a = i10;
        this.f12441d = str;
    }
}
