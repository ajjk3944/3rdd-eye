package q0;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class u implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final v f23029a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f23030b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23031c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23032d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f23033e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23034f;

    public u(v vVar, Bundle bundle, boolean z6, int i, boolean z7, int i3) {
        this.f23029a = vVar;
        this.f23030b = bundle;
        this.f23031c = z6;
        this.f23032d = i;
        this.f23033e = z7;
        this.f23034f = i3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(u uVar) {
        q5.i.e(uVar, "other");
        boolean z6 = uVar.f23033e;
        boolean z7 = uVar.f23031c;
        Bundle bundle = uVar.f23030b;
        boolean z8 = this.f23031c;
        if (z8 && !z7) {
            return 1;
        }
        if (!z8 && z7) {
            return -1;
        }
        int i = this.f23032d - uVar.f23032d;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle2 = this.f23030b;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            q5.i.b(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z9 = this.f23033e;
        if (z9 && !z6) {
            return 1;
        }
        if (z9 || !z6) {
            return this.f23034f - uVar.f23034f;
        }
        return -1;
    }
}
