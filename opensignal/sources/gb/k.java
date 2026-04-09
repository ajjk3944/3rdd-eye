package gb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class k implements eb.e, n6.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9477a;

    /* renamed from: d, reason: collision with root package name */
    public final List f9478d;

    public /* synthetic */ k(int i10, List list) {
        this.f9477a = i10;
        this.f9478d = list;
    }

    @Override // eb.e, n6.b
    public int a(long j) {
        switch (this.f9477a) {
            case 0:
                break;
            case 1:
                if (j < 0) {
                }
                break;
            default:
                if (j < 0) {
                }
                break;
        }
        return -1;
    }

    @Override // eb.e, n6.b
    public long e(int i10) {
        switch (this.f9477a) {
            case 0:
                break;
            case 1:
                a5.a.e(i10 == 0);
                break;
            default:
                a5.a.e(i10 == 0);
                break;
        }
        return 0L;
    }

    @Override // eb.e, n6.b
    public List f(long j) {
        switch (this.f9477a) {
            case 0:
                break;
            case 1:
                if (j < 0) {
                    break;
                } else {
                    break;
                }
            default:
                if (j < 0) {
                    break;
                } else {
                    break;
                }
        }
        return Collections.EMPTY_LIST;
    }

    @Override // eb.e, n6.b
    public int h() {
        switch (this.f9477a) {
        }
        return 1;
    }

    public k(ArrayList arrayList) {
        this.f9477a = 3;
        this.f9478d = Collections.unmodifiableList(arrayList);
    }
}
