package b1;

import b1.AbstractC4052i;

/* renamed from: b1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4049f extends x {

    /* renamed from: c, reason: collision with root package name */
    private final Object f32723c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC4052i.c f32724d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC4052i.c f32725e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC4052i.b f32726f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC4052i.c f32727g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC4052i.c f32728h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC4052i.b f32729i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC4052i.a f32730j;

    public C4049f(Object obj) {
        super(obj);
        this.f32723c = obj;
        this.f32724d = new AbstractC4052i.c(a(), -2, this);
        this.f32725e = new AbstractC4052i.c(a(), 0, this);
        this.f32726f = new AbstractC4052i.b(a(), 0, this);
        this.f32727g = new AbstractC4052i.c(a(), -1, this);
        this.f32728h = new AbstractC4052i.c(a(), 1, this);
        this.f32729i = new AbstractC4052i.b(a(), 1, this);
        this.f32730j = new AbstractC4052i.a(a(), this);
    }

    @Override // b1.x
    public Object a() {
        return this.f32723c;
    }

    public final AbstractC4052i.a b() {
        return this.f32730j;
    }

    public final AbstractC4052i.b c() {
        return this.f32729i;
    }

    public final AbstractC4052i.c d() {
        return this.f32727g;
    }

    public final AbstractC4052i.c e() {
        return this.f32724d;
    }

    public final AbstractC4052i.b f() {
        return this.f32726f;
    }
}
