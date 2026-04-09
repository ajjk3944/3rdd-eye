package A5;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

/* loaded from: classes3.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    public static final F4.c f337b = F4.c.e(k.class).b(F4.q.j(h.class)).b(F4.q.j(Context.class)).e(new F4.g() { // from class: A5.v
        @Override // F4.g
        public final Object a(F4.d dVar) {
            return new k((Context) dVar.a(Context.class));
        }
    }).c();

    /* renamed from: a, reason: collision with root package name */
    protected final Context f338a;

    public k(Context context) {
        this.f338a = context;
    }

    public synchronized String a() {
        String string = b().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        b().edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }

    protected final SharedPreferences b() {
        return this.f338a.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
