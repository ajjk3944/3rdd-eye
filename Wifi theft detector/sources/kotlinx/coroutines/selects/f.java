package kotlinx.coroutines.selects;

import l9.q;

/* loaded from: classes4.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f22664a;

    /* renamed from: b, reason: collision with root package name */
    public final q f22665b;

    /* renamed from: c, reason: collision with root package name */
    public final q f22666c;

    /* renamed from: d, reason: collision with root package name */
    public final q f22667d;

    public f(Object obj, q qVar, q qVar2, q qVar3) {
        this.f22664a = obj;
        this.f22665b = qVar;
        this.f22666c = qVar2;
        this.f22667d = qVar3;
    }

    @Override // kotlinx.coroutines.selects.g
    public q a() {
        return this.f22665b;
    }

    @Override // kotlinx.coroutines.selects.g
    public q b() {
        return this.f22667d;
    }

    @Override // kotlinx.coroutines.selects.g
    public q c() {
        return this.f22666c;
    }

    @Override // kotlinx.coroutines.selects.g
    public Object d() {
        return this.f22664a;
    }
}
