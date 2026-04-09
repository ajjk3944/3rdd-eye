package D3;

import B3.c;
import C.C;
import F3.m;
import G3.b;
import H.g;
import N7.C1094a9;
import P7.x;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.Y;
import androidx.camera.view.PreviewView;
import com.applovin.impl.AbstractActivityC2136o;
import com.applovin.impl.AbstractC2113d;
import com.applovin.impl.C2131m;
import com.applovin.impl.d2;
import com.applovin.impl.sdk.k;
import com.applovin.mediation.MaxDebuggerWaterfallSegmentsActivity;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.screenshot.impl.C5147m;
import io.appmetrica.analytics.screenshot.impl.a0;
import io.appmetrica.analytics.screenshot.impl.d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import o0.b;
import p9.InterfaceC5480a;
import v.RunnableC5655j;
import v3.C5677c;
import va.a;
import y3.h;
import y3.j;
import y3.l;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements b.a, m.a, b.c, FunctionWithThrowable, ConsentInformation.OnConsentInfoUpdateFailureListener, AbstractC2113d.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1041b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1042c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1044e;

    public /* synthetic */ b(m mVar, Object obj, j jVar, int i) {
        this.f1041b = i;
        this.f1044e = mVar;
        this.f1042c = obj;
        this.f1043d = jVar;
    }

    @Override // com.applovin.impl.AbstractC2113d.b
    public void a(Activity activity) {
        d2 d2Var = (d2) this.f1043d;
        AbstractActivityC2136o.a((C2131m) this.f1044e, d2Var, (k) this.f1042c, (MaxDebuggerWaterfallSegmentsActivity) activity);
    }

    @Override // F3.m.a
    public Object apply(Object obj) {
        long jInsert;
        switch (this.f1041b) {
            case 1:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                m mVar = (m) this.f1044e;
                long jSimpleQueryForLong = mVar.k().compileStatement("PRAGMA page_size").simpleQueryForLong() * mVar.k().compileStatement("PRAGMA page_count").simpleQueryForLong();
                F3.e eVar = mVar.f1622e;
                long jE = eVar.e();
                y3.m mVar2 = (y3.m) this.f1042c;
                if (jSimpleQueryForLong >= jE) {
                    mVar.c(1L, c.a.CACHE_FULL, mVar2.k());
                    return -1L;
                }
                j jVar = (j) this.f1043d;
                Long l5 = m.l(sQLiteDatabase, jVar);
                if (l5 != null) {
                    jInsert = l5.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", jVar.f48075a);
                    contentValues.put("priority", Integer.valueOf(I3.a.a(jVar.f48077c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = jVar.f48076b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int iD = eVar.d();
                byte[] bArr2 = mVar2.d().f48088b;
                boolean z10 = bArr2.length <= iD;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", mVar2.k());
                contentValues2.put("timestamp_ms", Long.valueOf(mVar2.e()));
                contentValues2.put("uptime_ms", Long.valueOf(mVar2.l()));
                contentValues2.put("payload_encoding", mVar2.d().f48087a.f47039a);
                contentValues2.put("code", mVar2.c());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z10));
                contentValues2.put("payload", z10 ? bArr2 : new byte[0]);
                contentValues2.put("product_id", mVar2.i());
                contentValues2.put("pseudonymous_id", mVar2.j());
                contentValues2.put("experiment_ids_clear_blob", mVar2.f());
                contentValues2.put("experiment_ids_encrypted_blob", mVar2.g());
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z10) {
                    int iCeil = (int) Math.ceil(bArr2.length / iD);
                    for (int i = 1; i <= iCeil; i++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i - 1) * iD, Math.min(i * iD, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(mVar2.b()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put(AppMeasurementSdk.ConditionalUserProperty.NAME, (String) entry.getKey());
                    contentValues4.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 2:
                Cursor cursor = (Cursor) obj;
                m mVar3 = (m) this.f1044e;
                mVar3.getClass();
                while (cursor.moveToNext()) {
                    long j4 = cursor.getLong(0);
                    boolean z11 = cursor.getInt(7) != 0;
                    h.a aVar = new h.a();
                    aVar.f48066f = new HashMap();
                    String string = cursor.getString(1);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    aVar.f48061a = string;
                    aVar.f48064d = Long.valueOf(cursor.getLong(2));
                    aVar.f48065e = Long.valueOf(cursor.getLong(3));
                    if (z11) {
                        String string2 = cursor.getString(4);
                        aVar.f48063c = new l(string2 == null ? m.f1618g : new C5677c(string2), cursor.getBlob(5));
                    } else {
                        String string3 = cursor.getString(4);
                        C5677c c5677c = string3 == null ? m.f1618g : new C5677c(string3);
                        Cursor cursorQuery = mVar3.k().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j4)}, null, null, "sequence_num");
                        try {
                            Cursor cursor2 = cursorQuery;
                            ArrayList arrayList = new ArrayList();
                            int length = 0;
                            while (cursor2.moveToNext()) {
                                byte[] blob = cursor2.getBlob(0);
                                arrayList.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr3 = new byte[length];
                            int length2 = 0;
                            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                byte[] bArr4 = (byte[]) arrayList.get(i10);
                                System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                length2 += bArr4.length;
                            }
                            cursorQuery.close();
                            aVar.f48063c = new l(c5677c, bArr3);
                        } catch (Throwable th) {
                            cursorQuery.close();
                            throw th;
                        }
                    }
                    if (!cursor.isNull(6)) {
                        aVar.f48062b = Integer.valueOf(cursor.getInt(6));
                    }
                    if (!cursor.isNull(8)) {
                        aVar.f48067g = Integer.valueOf(cursor.getInt(8));
                    }
                    if (!cursor.isNull(9)) {
                        aVar.f48068h = cursor.getString(9);
                    }
                    if (!cursor.isNull(10)) {
                        aVar.i = cursor.getBlob(10);
                    }
                    if (!cursor.isNull(11)) {
                        aVar.f48069j = cursor.getBlob(11);
                    }
                    ((ArrayList) this.f1042c).add(new F3.b(j4, (j) this.f1043d, aVar.b()));
                }
                return null;
            default:
                return a0.a((d0) this.f1044e, (a0) this.f1043d, (C5147m) this.f1042c, (ActivityManager) obj);
        }
    }

    public void b() {
        androidx.camera.view.a aVar;
        AtomicReference<androidx.camera.view.a> atomicReference = PreviewView.this.f15164h;
        while (true) {
            aVar = (androidx.camera.view.a) this.f1043d;
            if (atomicReference.compareAndSet(aVar, null)) {
                aVar.b(PreviewView.e.IDLE);
                break;
            } else if (atomicReference.get() != aVar) {
                break;
            }
        }
        I.d dVar = aVar.f15175e;
        if (dVar != null) {
            dVar.cancel(false);
            aVar.f15175e = null;
        }
        ((J) this.f1042c).e().a(aVar);
    }

    @Override // G3.b.a
    public Object execute() {
        c cVar = (c) this.f1044e;
        F3.d dVar = cVar.f1049d;
        j jVar = (j) this.f1043d;
        dVar.M0(jVar, (y3.m) this.f1042c);
        cVar.f1046a.a(jVar, 1);
        return null;
    }

    @Override // o0.b.c
    public Object i(b.a aVar) {
        switch (this.f1041b) {
            case 3:
                O.h hVar = (O.h) this.f1044e;
                hVar.getClass();
                Map map = Collections.EMPTY_MAP;
                hVar.e(new O.e(hVar, (C) this.f1043d, aVar), new RunnableC5655j(0));
                return "Init GlRenderer";
            default:
                b.d dVar = (b.d) this.f1044e;
                B.b bVar = new B.b(dVar, 11);
                g gVar = (g) this.f1043d;
                aVar.a(bVar, gVar);
                I.j.a(dVar, new Y(aVar), gVar);
                return C1094a9.h(new StringBuilder("surfaceList["), (List) this.f1042c, "]");
        }
    }

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
    public void onConsentInfoUpdateFailure(FormError formError) {
        a.b bVar = va.a.f47104a;
        bVar.o("x");
        bVar.c("Consent info request error: " + formError.getErrorCode() + " -  " + formError.getMessage(), new Object[0]);
        x.a aVar = new x.a(formError, formError.getMessage());
        x.d dVar = (x.d) this.f1044e;
        dVar.f10835a = aVar;
        x xVar = (x) this.f1043d;
        xVar.f(dVar);
        xVar.f10829f = false;
        xVar.d();
        ((InterfaceC5480a) this.f1042c).invoke();
    }

    public /* synthetic */ b(O.h hVar, C c10) {
        this.f1041b = 3;
        Map map = Collections.EMPTY_MAP;
        this.f1044e = hVar;
        this.f1043d = c10;
        this.f1042c = map;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i) {
        this.f1041b = i;
        this.f1044e = obj;
        this.f1043d = obj2;
        this.f1042c = obj3;
    }

    public /* synthetic */ b(b.d dVar, g gVar, List list) {
        this.f1041b = 6;
        this.f1044e = dVar;
        this.f1043d = gVar;
        this.f1042c = list;
    }
}
