package dd;

import com.google.android.gms.internal.measurement.e5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class s implements a, eb.e, n6.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7324a;

    /* renamed from: d, reason: collision with root package name */
    public final List f7325d;

    public /* synthetic */ s(int i10, List list) {
        this.f7324a = i10;
        this.f7325d = list;
    }

    @Override // eb.e, n6.b
    public int a(long j) {
        switch (this.f7324a) {
            case 1:
                if (j < 0) {
                }
                break;
            case 3:
                if (j < 0) {
                }
                break;
        }
        return -1;
    }

    @Override // eb.e, n6.b
    public long e(int i10) {
        switch (this.f7324a) {
            case 1:
                qb.b.g(i10 == 0);
                break;
            case 3:
                qb.b.g(i10 == 0);
                break;
        }
        return 0L;
    }

    @Override // eb.e, n6.b
    public List f(long j) {
        switch (this.f7324a) {
            case 1:
                if (j < 0) {
                    break;
                } else {
                    break;
                }
            case 3:
                if (j < 0) {
                    break;
                } else {
                    break;
                }
        }
        return this.f7325d;
    }

    @Override // eb.e, n6.b
    public int h() {
        switch (this.f7324a) {
        }
        return 1;
    }

    @Override // dd.a
    public /* bridge */ /* synthetic */ Object j(r rVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f7325d);
        return e5.u(arrayList);
    }

    public s(ArrayList arrayList) {
        this.f7324a = 3;
        this.f7325d = Collections.unmodifiableList(arrayList);
    }
}
