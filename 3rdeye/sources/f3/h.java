package F3;

import F3.m;
import I0.b;
import K1.i;
import android.database.Cursor;
import android.util.Base64;
import android.view.ViewGroup;
import androidx.camera.core.impl.T0;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.ArrayList;
import java.util.List;
import y3.j;
import y7.x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements m.a, b.c, I4.d, i.e, y7.k, l7.l, l7.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1608b;

    public /* synthetic */ h(int i) {
        this.f1608b = i;
    }

    public static String d(T0 t02) {
        return (String) t02.b(J.l.f2690b);
    }

    public static String h(T0 t02, String str) {
        return (String) t02.o(J.l.f2690b, str);
    }

    public static String i(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    @Override // l7.g
    public boolean a(List it) {
        switch (this.f1608b) {
            case 11:
                kotlin.jvm.internal.l.f(it, "it");
                if (it.size() >= 1) {
                }
                break;
            case 14:
                kotlin.jvm.internal.l.f(it, "it");
                if (it.size() >= 1) {
                }
                break;
            default:
                kotlin.jvm.internal.l.f(it, "it");
                if (it.size() >= 1) {
                }
                break;
        }
        return true;
    }

    @Override // F3.m.a
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        switch (this.f1608b) {
            case 0:
                ArrayList arrayList = new ArrayList();
                while (cursor.moveToNext()) {
                    j.a aVarA = y3.r.a();
                    aVarA.b(cursor.getString(1));
                    aVarA.f48080c = I3.a.b(cursor.getInt(2));
                    String string = cursor.getString(3);
                    aVarA.f48079b = string == null ? null : Base64.decode(string, 0);
                    arrayList.add(aVarA.a());
                }
                return arrayList;
            default:
                return Boolean.valueOf(cursor.getCount() > 0);
        }
    }

    @Override // K1.i.e
    public void b(i.d dVar, K1.i iVar) {
        dVar.c(iVar);
    }

    @Override // y7.k
    public x.a c(ViewGroup viewGroup, B.f fVar, B.f fVar2) {
        return new y7.l(viewGroup, fVar, fVar2);
    }

    @Override // l7.l
    public boolean e(Object obj) {
        switch (this.f1608b) {
            case 8:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 9:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 10:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 11:
            case 14:
            default:
                double dDoubleValue = ((Double) obj).doubleValue();
                if (dDoubleValue < 0.0d || dDoubleValue > 1.0d) {
                }
                break;
            case 12:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 13:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 15:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 16:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 17:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 18:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 19:
                double dDoubleValue2 = ((Double) obj).doubleValue();
                if (dDoubleValue2 < 0.0d || dDoubleValue2 > 1.0d) {
                }
                break;
            case 20:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 21:
                double dDoubleValue3 = ((Double) obj).doubleValue();
                if (dDoubleValue3 < 0.0d || dDoubleValue3 > 1.0d) {
                }
                break;
            case 22:
                double dDoubleValue4 = ((Double) obj).doubleValue();
                if (dDoubleValue4 < 0.0d || dDoubleValue4 > 1.0d) {
                }
                break;
            case 23:
                double dDoubleValue5 = ((Double) obj).doubleValue();
                if (dDoubleValue5 < 0.0d || dDoubleValue5 > 1.0d) {
                }
                break;
            case 24:
                if (((Long) obj).longValue() > 0) {
                }
                break;
            case 25:
                double dDoubleValue6 = ((Double) obj).doubleValue();
                if (dDoubleValue6 < 0.0d || dDoubleValue6 > 1.0d) {
                }
                break;
            case 26:
                if (((Long) obj).longValue() >= 0) {
                }
                break;
            case 27:
                if (((Double) obj).doubleValue() >= 0.0d) {
                }
                break;
        }
        return false;
    }

    @Override // I0.b.c
    public boolean f() {
        return false;
    }

    @Override // I4.d
    public Object g(I4.t tVar) {
        return ExecutorsRegistrar.f23247c.get();
    }
}
