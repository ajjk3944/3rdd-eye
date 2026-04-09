package com.bumptech.glide;

import W2.f;
import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.b;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    static final k f34195k = new a();

    /* renamed from: a, reason: collision with root package name */
    private final F2.b f34196a;

    /* renamed from: b, reason: collision with root package name */
    private final f.b f34197b;

    /* renamed from: c, reason: collision with root package name */
    private final T2.b f34198c;

    /* renamed from: d, reason: collision with root package name */
    private final b.a f34199d;

    /* renamed from: e, reason: collision with root package name */
    private final List f34200e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f34201f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.j f34202g;

    /* renamed from: h, reason: collision with root package name */
    private final e f34203h;

    /* renamed from: i, reason: collision with root package name */
    private final int f34204i;

    /* renamed from: j, reason: collision with root package name */
    private com.bumptech.glide.request.f f34205j;

    public d(Context context, F2.b bVar, f.b bVar2, T2.b bVar3, b.a aVar, Map map, List list, com.bumptech.glide.load.engine.j jVar, e eVar, int i10) {
        super(context.getApplicationContext());
        this.f34196a = bVar;
        this.f34198c = bVar3;
        this.f34199d = aVar;
        this.f34200e = list;
        this.f34201f = map;
        this.f34202g = jVar;
        this.f34203h = eVar;
        this.f34204i = i10;
        this.f34197b = W2.f.a(bVar2);
    }

    public F2.b a() {
        return this.f34196a;
    }

    public List b() {
        return this.f34200e;
    }

    public synchronized com.bumptech.glide.request.f c() {
        try {
            if (this.f34205j == null) {
                this.f34205j = (com.bumptech.glide.request.f) this.f34199d.a().P();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f34205j;
    }

    public k d(Class cls) {
        k kVar = (k) this.f34201f.get(cls);
        if (kVar == null) {
            for (Map.Entry entry : this.f34201f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    kVar = (k) entry.getValue();
                }
            }
        }
        return kVar == null ? f34195k : kVar;
    }

    public com.bumptech.glide.load.engine.j e() {
        return this.f34202g;
    }

    public e f() {
        return this.f34203h;
    }

    public int g() {
        return this.f34204i;
    }

    public Registry h() {
        return (Registry) this.f34197b.get();
    }
}
