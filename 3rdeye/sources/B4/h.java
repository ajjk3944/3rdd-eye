package B4;

import F3.m;
import I4.t;
import K1.i;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.abt.component.AbtRegistrar;
import java.util.List;
import q5.e;
import va.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements e.a, I4.d, m.a, OnFailureListener, i.e, l7.l, l7.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f501b;

    public /* synthetic */ h(int i) {
        this.f501b = i;
    }

    public static Z6.b c(D7.i iVar, D7.f context, Object obj) {
        kotlin.jvm.internal.l.f(context, "context");
        return iVar.c(context, obj);
    }

    @Override // l7.g
    public boolean a(List it) {
        switch (this.f501b) {
            case 10:
                kotlin.jvm.internal.l.f(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 20:
                kotlin.jvm.internal.l.f(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 21:
                kotlin.jvm.internal.l.f(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 22:
                kotlin.jvm.internal.l.f(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 25:
                kotlin.jvm.internal.l.f(it, "it");
                if (it.size() >= 1) {
                }
                break;
            default:
                kotlin.jvm.internal.l.f(it, "it");
                if (it.size() >= 2) {
                }
                break;
        }
        return true;
    }

    @Override // F3.m.a
    public Object apply(Object obj) {
        return (List) m.D(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new F3.h(0));
    }

    @Override // K1.i.e
    public void b(i.d dVar, K1.i iVar) {
        dVar.f(iVar);
    }

    @Override // q5.e.a
    public String d(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
    }

    @Override // l7.l
    public boolean e(Object obj) {
        switch (this.f501b) {
            case 7:
                return ((Long) obj).longValue() >= 0;
            case 8:
                return ((Long) obj).longValue() >= 0;
            case 9:
                return ((Double) obj).doubleValue() > 0.0d;
            case 10:
            case 20:
            case 21:
            case 22:
            case 25:
            case 26:
            default:
                return ((Long) obj).longValue() >= 0;
            case 11:
                double dDoubleValue = ((Double) obj).doubleValue();
                return dDoubleValue >= 0.0d && dDoubleValue <= 1.0d;
            case 12:
                return ((Long) obj).longValue() >= 0;
            case 13:
                return ((Long) obj).longValue() >= 0;
            case 14:
                long jLongValue = ((Long) obj).longValue();
                return jLongValue >= 0 && jLongValue < 100;
            case 15:
                return ((Long) obj).longValue() >= 0;
            case 16:
                return ((Long) obj).longValue() >= 0;
            case 17:
                return ((String) obj).length() >= 1;
            case 18:
                return ((Long) obj).longValue() > 0;
            case 19:
                return ((Long) obj).longValue() >= 0;
            case 23:
                return ((Long) obj).longValue() >= 0;
            case 24:
                return ((Long) obj).longValue() > 0;
            case 27:
                return ((Double) obj).doubleValue() >= 0.0d;
            case 28:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                return dDoubleValue2 >= 0.0d && dDoubleValue2 <= 1.0d;
        }
    }

    @Override // I4.d
    public Object g(t tVar) {
        return AbtRegistrar.lambda$getComponents$0(tVar);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception it) {
        kotlin.jvm.internal.l.f(it, "it");
        a.b bVar = va.a.f47104a;
        bVar.o("PremiumHelper");
        bVar.d(it);
    }
}
