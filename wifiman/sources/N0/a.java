package N0;

import M0.AbstractC3247c;
import android.text.SegmentFinder;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f14868a = new a();

    /* renamed from: N0.a$a, reason: collision with other inner class name */
    public static final class C0563a extends SegmentFinder {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f14869a;

        C0563a(f fVar) {
            this.f14869a = fVar;
        }

        public int nextEndBoundary(int i10) {
            return this.f14869a.d(i10);
        }

        public int nextStartBoundary(int i10) {
            return this.f14869a.a(i10);
        }

        public int previousEndBoundary(int i10) {
            return this.f14869a.b(i10);
        }

        public int previousStartBoundary(int i10) {
            return this.f14869a.c(i10);
        }
    }

    private a() {
    }

    public final SegmentFinder a(f fVar) {
        return AbstractC3247c.a(new C0563a(fVar));
    }
}
