package y0;

import android.view.MotionEvent;
import java.util.List;

/* renamed from: y0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8593n {

    /* renamed from: a, reason: collision with root package name */
    private final List f66302a;

    /* renamed from: b, reason: collision with root package name */
    private final C8585f f66303b;

    /* renamed from: c, reason: collision with root package name */
    private final int f66304c;

    /* renamed from: d, reason: collision with root package name */
    private final int f66305d;

    /* renamed from: e, reason: collision with root package name */
    private int f66306e;

    public C8593n(List list, C8585f c8585f) {
        this.f66302a = list;
        this.f66303b = c8585f;
        MotionEvent motionEventE = e();
        this.f66304c = AbstractC8592m.a(motionEventE != null ? motionEventE.getButtonState() : 0);
        MotionEvent motionEventE2 = e();
        this.f66305d = C8571K.b(motionEventE2 != null ? motionEventE2.getMetaState() : 0);
        this.f66306e = a();
    }

    private final int a() {
        MotionEvent motionEventE = e();
        if (motionEventE != null) {
            int actionMasked = motionEventE.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                        }
                        return AbstractC8596q.f66307a.d();
                    }
                    return AbstractC8596q.f66307a.c();
                }
                return AbstractC8596q.f66307a.e();
            }
            return AbstractC8596q.f66307a.d();
        }
        List list = this.f66302a;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C8604y c8604y = (C8604y) list.get(i10);
            if (AbstractC8594o.d(c8604y)) {
                return AbstractC8596q.f66307a.e();
            }
            if (AbstractC8594o.b(c8604y)) {
                return AbstractC8596q.f66307a.d();
            }
        }
        return AbstractC8596q.f66307a.c();
    }

    public final int b() {
        return this.f66304c;
    }

    public final List c() {
        return this.f66302a;
    }

    public final C8585f d() {
        return this.f66303b;
    }

    public final MotionEvent e() {
        C8585f c8585f = this.f66303b;
        if (c8585f != null) {
            return c8585f.c();
        }
        return null;
    }

    public final int f() {
        return this.f66306e;
    }

    public final void g(int i10) {
        this.f66306e = i10;
    }

    public C8593n(List list) {
        this(list, null);
    }
}
