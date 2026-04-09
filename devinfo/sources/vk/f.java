package vk;

import java.util.List;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Matcher f36283a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f36284b;

    /* renamed from: c, reason: collision with root package name */
    public final e f36285c;

    /* renamed from: d, reason: collision with root package name */
    public d f36286d;

    public f(Matcher matcher, CharSequence charSequence) {
        nk.k.e(charSequence, "input");
        this.f36283a = matcher;
        this.f36284b = charSequence;
        this.f36285c = new e(0, this);
    }

    public final List a() {
        if (this.f36286d == null) {
            this.f36286d = new d(this);
        }
        d dVar = this.f36286d;
        nk.k.b(dVar);
        return dVar;
    }
}
