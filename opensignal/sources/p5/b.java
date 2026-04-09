package p5;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.database.DatabaseRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import h9.r2;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.util.ArrayList;
import lf.n2;
import t7.p;
import t7.q;
import tg.k0;
import tg.l0;
import w.o;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements j9.e, bf.f, p, t9.f, ua.a, o, qb.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20251a;

    public /* synthetic */ b(int i10) {
        this.f20251a = i10;
    }

    @Override // w.o
    public float a(float f10) {
        return f10;
    }

    @Override // j9.e, t9.f
    public Object apply(Object obj) throws IOException {
        switch (this.f20251a) {
            case 1:
                pf.a.f20466b.getClass();
                return mf.a.f16702a.b((n2) obj).getBytes(Charset.forName("UTF-8"));
            case 12:
                Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursorRawQuery.moveToNext()) {
                        io.sentry.k kVarA = m9.i.a();
                        kVarA.m0(cursorRawQuery.getString(1));
                        kVarA.f12399r = w9.a.b(cursorRawQuery.getInt(2));
                        String string = cursorRawQuery.getString(3);
                        kVarA.f12398g = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(kVarA.n());
                    }
                    return arrayList;
                } finally {
                    cursorRawQuery.close();
                }
            case 13:
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            default:
                k0 k0Var = (k0) obj;
                String strB = l0.f22818b.b(k0Var);
                br.l.d(strB, "encode(...)");
                k0Var.f22813a.name();
                byte[] bytes = strB.getBytes(tt.a.f22975a);
                br.l.d(bytes, "getBytes(...)");
                return bytes;
        }
    }

    @Override // ua.a
    public boolean b(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override // t7.p
    public void c(t7.o oVar, q qVar, boolean z10) {
        switch (this.f20251a) {
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                oVar.f(qVar);
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                oVar.c(qVar);
                break;
            case 9:
                oVar.b(qVar);
                break;
            case 10:
                oVar.a();
                break;
            default:
                oVar.d();
                break;
        }
    }

    @Override // qb.i
    public void d(Object obj, qb.f fVar) {
        AnalyticsCollector.lambda$new$0((AnalyticsListener) obj, fVar);
    }

    public Constructor e() {
        switch (this.f20251a) {
            case 20:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(u5.k.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(u5.k.class).getConstructor(null);
        }
    }

    @Override // bf.f
    public Object f(r2 r2Var) {
        switch (this.f20251a) {
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return DatabaseRegistrar.lambda$getComponents$0(r2Var);
            case 16:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(r2Var);
            case 17:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(r2Var);
            case 23:
                return AbtRegistrar.lambda$getComponents$0(r2Var);
            case 24:
                return TransportRegistrar.lambda$getComponents$0(r2Var);
            case 25:
                return TransportRegistrar.lambda$getComponents$1(r2Var);
            default:
                return TransportRegistrar.lambda$getComponents$2(r2Var);
        }
    }

    public /* synthetic */ b(tg.l lVar) {
        this.f20251a = 14;
    }
}
