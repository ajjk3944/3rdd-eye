package com.ui.wifiman.model.signalmapper.floorplan;

import S8.l;
import W7.d;
import Yg.J;
import Zg.AbstractC3689v;
import java.util.LinkedList;
import kotlin.jvm.internal.AbstractC6492s;
import od.InterfaceC7122d;
import oh.AbstractC7137b;

/* loaded from: classes4.dex */
public final class b implements InterfaceC7122d {

    /* renamed from: a, reason: collision with root package name */
    private final float f42859a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedList f42860b = new LinkedList();

    /* renamed from: c, reason: collision with root package name */
    private final LinkedList f42861c = new LinkedList();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final d f42862a;

        /* renamed from: b, reason: collision with root package name */
        private final long f42863b;

        /* renamed from: c, reason: collision with root package name */
        private final String f42864c;

        public a(d coordinates, long j10, String model) {
            AbstractC6492s.i(coordinates, "coordinates");
            AbstractC6492s.i(model, "model");
            this.f42862a = coordinates;
            this.f42863b = j10;
            this.f42864c = model;
        }

        public final d a() {
            return this.f42862a;
        }

        public final String b() {
            return this.f42864c;
        }

        public final long c() {
            return this.f42863b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f42862a, aVar.f42862a) && this.f42863b == aVar.f42863b && AbstractC6492s.d(this.f42864c, aVar.f42864c);
        }

        public int hashCode() {
            return (((this.f42862a.hashCode() * 31) + Long.hashCode(this.f42863b)) * 31) + this.f42864c.hashCode();
        }

        public String toString() {
            return "ObjectDetection(coordinates=" + this.f42862a + ", timestamp=" + this.f42863b + ", model=" + this.f42864c + ")";
        }
    }

    /* renamed from: com.ui.wifiman.model.signalmapper.floorplan.b$b, reason: collision with other inner class name */
    public static final class C1415b {

        /* renamed from: a, reason: collision with root package name */
        private final d f42865a;

        /* renamed from: b, reason: collision with root package name */
        private final long f42866b;

        /* renamed from: c, reason: collision with root package name */
        private final l f42867c;

        public C1415b(d coordinates, long j10, l lVar) {
            AbstractC6492s.i(coordinates, "coordinates");
            this.f42865a = coordinates;
            this.f42866b = j10;
            this.f42867c = lVar;
        }

        public final d a() {
            return this.f42865a;
        }

        public final long b() {
            return this.f42866b;
        }

        public final l c() {
            return this.f42867c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1415b)) {
                return false;
            }
            C1415b c1415b = (C1415b) obj;
            return AbstractC6492s.d(this.f42865a, c1415b.f42865a) && this.f42866b == c1415b.f42866b && AbstractC6492s.d(this.f42867c, c1415b.f42867c);
        }

        public int hashCode() {
            int iHashCode = ((this.f42865a.hashCode() * 31) + Long.hashCode(this.f42866b)) * 31;
            l lVar = this.f42867c;
            return iHashCode + (lVar == null ? 0 : lVar.hashCode());
        }

        public String toString() {
            return "PathPoint(coordinates=" + this.f42865a + ", timestamp=" + this.f42866b + ", wifiSignal=" + this.f42867c + ")";
        }
    }

    public b(float f10) {
        this.f42859a = f10;
    }

    private final d f(float f10, float f11) {
        return new d(AbstractC7137b.e(f10 / this.f42859a), AbstractC7137b.e(f11 / this.f42859a));
    }

    @Override // od.InterfaceC7122d
    public void a(float f10, float f11, long j10, String model) {
        AbstractC6492s.i(model, "model");
        synchronized (this.f42861c) {
            this.f42861c.add(new a(f(f10, f11), j10, model));
        }
    }

    @Override // od.InterfaceC7122d
    public void b(float f10, float f11, long j10, l lVar) {
        synchronized (this.f42860b) {
            try {
                C1415b c1415b = (C1415b) AbstractC3689v.D0(this.f42860b);
                d dVarA = c1415b != null ? c1415b.a() : null;
                d dVarF = f(f10, f11);
                if (AbstractC6492s.d(dVarA, dVarF)) {
                    LinkedList linkedList = this.f42860b;
                    linkedList.set(AbstractC3689v.n(linkedList), new C1415b(dVarF, j10, lVar));
                    J j11 = J.f24997a;
                } else {
                    this.f42860b.add(new C1415b(dVarF, j10, lVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final LinkedList c() {
        return this.f42861c;
    }

    public final LinkedList d() {
        return this.f42860b;
    }

    public final float e() {
        return this.f42859a;
    }
}
