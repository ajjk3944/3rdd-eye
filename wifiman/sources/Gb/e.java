package Gb;

import kotlin.jvm.internal.AbstractC6492s;
import th.l;

/* loaded from: classes3.dex */
public final class e implements ph.d {

    /* renamed from: a, reason: collision with root package name */
    private final d f7273a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7274b;

    public e(d storage, String key) {
        AbstractC6492s.i(storage, "storage");
        AbstractC6492s.i(key, "key");
        this.f7273a = storage;
        this.f7274b = key;
    }

    @Override // ph.d, ph.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String a(Object obj, l property) {
        AbstractC6492s.i(property, "property");
        return this.f7273a.b(this.f7274b);
    }

    @Override // ph.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(Object obj, l property, String str) {
        AbstractC6492s.i(property, "property");
        this.f7273a.a(this.f7274b, str);
    }
}
