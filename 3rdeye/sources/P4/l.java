package P4;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: RolloutAssignmentList.java */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10637a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final int f10638b = 128;

    public final synchronized List<k> a() {
        return Collections.unmodifiableList(new ArrayList(this.f10637a));
    }

    public final synchronized boolean b(List<k> list) {
        this.f10637a.clear();
        if (list.size() <= this.f10638b) {
            return this.f10637a.addAll(list);
        }
        Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f10638b, null);
        return this.f10637a.addAll(list.subList(0, this.f10638b));
    }
}
