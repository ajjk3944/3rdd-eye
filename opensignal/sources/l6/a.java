package l6;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends c5.a {

    /* renamed from: g, reason: collision with root package name */
    public final long f14776g;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f14777r;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f14778x;

    public a(int i10, long j) {
        super(i10, 2);
        this.f14776g = j;
        this.f14777r = new ArrayList();
        this.f14778x = new ArrayList();
    }

    public final a p(int i10) {
        ArrayList arrayList = this.f14778x;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            if (aVar.f3295d == i10) {
                return aVar;
            }
        }
        return null;
    }

    public final b q(int i10) {
        ArrayList arrayList = this.f14777r;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) arrayList.get(i11);
            if (bVar.f3295d == i10) {
                return bVar;
            }
        }
        return null;
    }

    @Override // c5.a
    public final String toString() {
        return c5.a.d(this.f3295d) + " leaves: " + Arrays.toString(this.f14777r.toArray()) + " containers: " + Arrays.toString(this.f14778x.toArray());
    }
}
