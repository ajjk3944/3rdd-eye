package W;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class X implements Continuation, OnSuccessListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13215b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13216c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13217d;

    public /* synthetic */ X(Object obj, Object obj2, Object obj3) {
        this.f13215b = obj;
        this.f13216c = obj2;
        this.f13217d = obj3;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        Task task = (Task) this.f13216c;
        v5.f fVar = (v5.f) this.f13217d;
        t5.b bVar = (t5.b) this.f13215b;
        try {
            com.google.firebase.remoteconfig.internal.b bVar2 = (com.google.firebase.remoteconfig.internal.b) task.getResult();
            if (bVar2 != null) {
                bVar.f46428c.execute(new d0.r(2, fVar, bVar.f46427b.a(bVar2)));
            }
        } catch (r5.g e4) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e4);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        URL url;
        com.google.firebase.remoteconfig.internal.e eVar = (com.google.firebase.remoteconfig.internal.e) this.f13215b;
        eVar.getClass();
        Task task2 = (Task) this.f13216c;
        if (!task2.isSuccessful()) {
            return Tasks.forException(new r5.f("Firebase Installations failed to get installation auth token for config update listener connection.", task2.getException()));
        }
        Task task3 = (Task) this.f13217d;
        if (!task3.isSuccessful()) {
            return Tasks.forException(new r5.f("Firebase Installations failed to get installation ID for config update listener connection.", task3.getException()));
        }
        try {
            try {
                url = new URL(eVar.c(eVar.f23346l));
            } catch (MalformedURLException unused) {
                Log.e("FirebaseRemoteConfig", "URL is malformed");
                url = null;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            eVar.j(httpURLConnection, (String) task3.getResult(), ((h5.g) task2.getResult()).a());
            return Tasks.forResult(httpURLConnection);
        } catch (IOException e4) {
            return Tasks.forException(new r5.f("Failed to open HTTP stream connection", e4));
        }
    }
}
