package b0;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public SparseIntArray f4560a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    public HashMap f4561b = new HashMap();

    public interface a {
    }

    public void a(int i10, a aVar) {
        HashSet hashSet = (HashSet) this.f4561b.get(Integer.valueOf(i10));
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f4561b.put(Integer.valueOf(i10), hashSet);
        }
        hashSet.add(new WeakReference(aVar));
    }
}
