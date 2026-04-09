package io.sentry.android.replay.capture;

import ir.v;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11856a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f11857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f11858c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f11859d;

    public b(c cVar, c cVar2, int i10) {
        this.f11856a = i10;
        switch (i10) {
            case 2:
                this.f11858c = cVar;
                this.f11859d = cVar2;
                this.f11857b = new AtomicReference(null);
                break;
            case 3:
                this.f11858c = cVar;
                this.f11859d = cVar2;
                this.f11857b = new AtomicReference(null);
                break;
            case 4:
                this.f11858c = cVar;
                this.f11859d = cVar2;
                this.f11857b = new AtomicReference(null);
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                this.f11858c = cVar;
                this.f11859d = cVar2;
                this.f11857b = new AtomicReference(null);
                break;
            default:
                this.f11858c = cVar;
                this.f11859d = cVar2;
                this.f11857b = new AtomicReference(-1);
                break;
        }
    }

    public final Object a(v vVar, Object obj) {
        switch (this.f11856a) {
            case 0:
                br.l.e(vVar, "property");
                break;
            case 1:
                br.l.e(vVar, "property");
                break;
            case 2:
                br.l.e(vVar, "property");
                break;
            case 3:
                br.l.e(vVar, "property");
                break;
            case 4:
                br.l.e(vVar, "property");
                break;
            default:
                br.l.e(vVar, "property");
                break;
        }
        return this.f11857b.get();
    }

    public b(Object obj, c cVar, c cVar2) {
        this.f11856a = 0;
        this.f11858c = cVar;
        this.f11859d = cVar2;
        this.f11857b = new AtomicReference(obj);
    }
}
