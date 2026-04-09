package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.j;
import androidx.lifecycle.n;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.random.Random;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: a, reason: collision with root package name */
    public final Map f283a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f284b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Map f285c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f286d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient Map f287e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final Map f288f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f289g = new Bundle();

    public class a extends androidx.activity.result.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f294a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.a f295b;

        public a(String str, b.a aVar) {
            this.f294a = str;
            this.f295b = aVar;
        }

        @Override // androidx.activity.result.b
        public void b(Object obj, f0.c cVar) throws Exception {
            Integer num = (Integer) ActivityResultRegistry.this.f284b.get(this.f294a);
            if (num != null) {
                ActivityResultRegistry.this.f286d.add(this.f294a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f295b, obj, cVar);
                    return;
                } catch (Exception e10) {
                    ActivityResultRegistry.this.f286d.remove(this.f294a);
                    throw e10;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f295b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.b
        public void c() {
            ActivityResultRegistry.this.l(this.f294a);
        }
    }

    public class b extends androidx.activity.result.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f297a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.a f298b;

        public b(String str, b.a aVar) {
            this.f297a = str;
            this.f298b = aVar;
        }

        @Override // androidx.activity.result.b
        public void b(Object obj, f0.c cVar) throws Exception {
            Integer num = (Integer) ActivityResultRegistry.this.f284b.get(this.f297a);
            if (num != null) {
                ActivityResultRegistry.this.f286d.add(this.f297a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f298b, obj, cVar);
                    return;
                } catch (Exception e10) {
                    ActivityResultRegistry.this.f286d.remove(this.f297a);
                    throw e10;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f298b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.b
        public void c() {
            ActivityResultRegistry.this.l(this.f297a);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.activity.result.a f300a;

        /* renamed from: b, reason: collision with root package name */
        public final b.a f301b;

        public c(androidx.activity.result.a aVar, b.a aVar2) {
            this.f300a = aVar;
            this.f301b = aVar2;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final Lifecycle f302a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f303b = new ArrayList();

        public d(Lifecycle lifecycle) {
            this.f302a = lifecycle;
        }

        public void a(j jVar) {
            this.f302a.a(jVar);
            this.f303b.add(jVar);
        }

        public void b() {
            ArrayList arrayList = this.f303b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                this.f302a.d((j) obj);
            }
            this.f303b.clear();
        }
    }

    public final void a(int i10, String str) {
        this.f283a.put(Integer.valueOf(i10), str);
        this.f284b.put(str, Integer.valueOf(i10));
    }

    public final boolean b(int i10, int i11, Intent intent) {
        String str = (String) this.f283a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        d(str, i11, intent, (c) this.f287e.get(str));
        return true;
    }

    public final boolean c(int i10, Object obj) {
        androidx.activity.result.a aVar;
        String str = (String) this.f283a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        c cVar = (c) this.f287e.get(str);
        if (cVar == null || (aVar = cVar.f300a) == null) {
            this.f289g.remove(str);
            this.f288f.put(str, obj);
            return true;
        }
        if (!this.f286d.remove(str)) {
            return true;
        }
        aVar.onActivityResult(obj);
        return true;
    }

    public final void d(String str, int i10, Intent intent, c cVar) {
        if (cVar == null || cVar.f300a == null || !this.f286d.contains(str)) {
            this.f288f.remove(str);
            this.f289g.putParcelable(str, new ActivityResult(i10, intent));
        } else {
            cVar.f300a.onActivityResult(cVar.f301b.c(i10, intent));
            this.f286d.remove(str);
        }
    }

    public final int e() {
        int iH = Random.f22054a.h(2147418112);
        while (true) {
            int i10 = iH + C.DEFAULT_BUFFER_SEGMENT_SIZE;
            if (!this.f283a.containsKey(Integer.valueOf(i10))) {
                return i10;
            }
            iH = Random.f22054a.h(2147418112);
        }
    }

    public abstract void f(int i10, b.a aVar, Object obj, f0.c cVar);

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f286d = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f289g.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
            String str = stringArrayList.get(i10);
            if (this.f284b.containsKey(str)) {
                Integer num = (Integer) this.f284b.remove(str);
                if (!this.f289g.containsKey(str)) {
                    this.f283a.remove(num);
                }
            }
            a(integerArrayList.get(i10).intValue(), stringArrayList.get(i10));
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f284b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f284b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f286d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f289g.clone());
    }

    public final androidx.activity.result.b i(final String str, n nVar, final b.a aVar, final androidx.activity.result.a aVar2) {
        Lifecycle lifecycle = nVar.getLifecycle();
        if (lifecycle.b().f(Lifecycle.State.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + nVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        k(str);
        d dVar = (d) this.f285c.get(str);
        if (dVar == null) {
            dVar = new d(lifecycle);
        }
        dVar.a(new j() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.j
            public void onStateChanged(n nVar2, Lifecycle.Event event) {
                if (!Lifecycle.Event.ON_START.equals(event)) {
                    if (Lifecycle.Event.ON_STOP.equals(event)) {
                        ActivityResultRegistry.this.f287e.remove(str);
                        return;
                    } else {
                        if (Lifecycle.Event.ON_DESTROY.equals(event)) {
                            ActivityResultRegistry.this.l(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.f287e.put(str, new c(aVar2, aVar));
                if (ActivityResultRegistry.this.f288f.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f288f.get(str);
                    ActivityResultRegistry.this.f288f.remove(str);
                    aVar2.onActivityResult(obj);
                }
                ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f289g.getParcelable(str);
                if (activityResult != null) {
                    ActivityResultRegistry.this.f289g.remove(str);
                    aVar2.onActivityResult(aVar.c(activityResult.e(), activityResult.c()));
                }
            }
        });
        this.f285c.put(str, dVar);
        return new a(str, aVar);
    }

    public final androidx.activity.result.b j(String str, b.a aVar, androidx.activity.result.a aVar2) {
        k(str);
        this.f287e.put(str, new c(aVar2, aVar));
        if (this.f288f.containsKey(str)) {
            Object obj = this.f288f.get(str);
            this.f288f.remove(str);
            aVar2.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f289g.getParcelable(str);
        if (activityResult != null) {
            this.f289g.remove(str);
            aVar2.onActivityResult(aVar.c(activityResult.e(), activityResult.c()));
        }
        return new b(str, aVar);
    }

    public final void k(String str) {
        if (((Integer) this.f284b.get(str)) != null) {
            return;
        }
        a(e(), str);
    }

    public final void l(String str) {
        Integer num;
        if (!this.f286d.contains(str) && (num = (Integer) this.f284b.remove(str)) != null) {
            this.f283a.remove(num);
        }
        this.f287e.remove(str);
        if (this.f288f.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f288f.get(str));
            this.f288f.remove(str);
        }
        if (this.f289g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f289g.getParcelable(str));
            this.f289g.remove(str);
        }
        d dVar = (d) this.f285c.get(str);
        if (dVar != null) {
            dVar.b();
            this.f285c.remove(str);
        }
    }
}
