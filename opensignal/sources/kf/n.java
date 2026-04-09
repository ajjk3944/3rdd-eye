package kf;

import io.sentry.android.core.e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14328a;

    /* renamed from: b, reason: collision with root package name */
    public int f14329b;

    public n(int i10) {
        switch (i10) {
            case 1:
                this.f14328a = new ArrayList();
                this.f14329b = 0;
                break;
            default:
                this.f14328a = new ArrayList();
                this.f14329b = 128;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0101 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.Object r28) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.n.a(java.lang.Object):void");
    }

    public synchronized List b() {
        return Collections.unmodifiableList(new ArrayList(this.f14328a));
    }

    public boolean c() {
        return this.f14329b < this.f14328a.size();
    }

    public synchronized boolean d(List list) {
        this.f14328a.clear();
        if (list.size() <= this.f14329b) {
            return this.f14328a.addAll(list);
        }
        e0.q("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f14329b, null);
        return this.f14328a.addAll(list.subList(0, this.f14329b));
    }

    public n(ArrayList arrayList) {
        this.f14328a = arrayList;
    }
}
