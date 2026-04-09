package je;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.lifecycle.f1;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import kd.a0;
import p.r3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements Continuation, de.d, a0, SuccessContinuation, la.f, OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27633a;

    public /* synthetic */ y(int i4) {
        this.f27633a = i4;
    }

    public static /* bridge */ /* synthetic */ AutofillId b(Object obj) {
        return (AutofillId) obj;
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession d(Object obj) {
        return (ContentCaptureSession) obj;
    }

    @Override // la.f
    public Object apply(Object obj) {
        Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorRawQuery.moveToNext()) {
                yb.e eVarA = ea.i.a();
                eVarA.v(cursorRawQuery.getString(1));
                eVarA.f37511d = oa.a.b(cursorRawQuery.getInt(2));
                String string = cursorRawQuery.getString(3);
                eVarA.f37510c = string == null ? null : Base64.decode(string, 0);
                arrayList.add(eVarA.i());
            }
            return arrayList;
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // de.d
    public Object c(f1 f1Var) {
        Set setK = f1Var.K(jf.a.class);
        jf.c cVar = jf.c.f27639c;
        if (cVar == null) {
            synchronized (jf.c.class) {
                try {
                    cVar = jf.c.f27639c;
                    if (cVar == null) {
                        cVar = new jf.c(0);
                        jf.c.f27639c = cVar;
                    }
                } finally {
                }
            }
        }
        return new jf.b(setK, cVar);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        task.isSuccessful();
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        switch (this.f27633a) {
            case 3:
                break;
            default:
                break;
        }
        return Tasks.forResult(null);
    }

    public /* synthetic */ y(r3 r3Var) {
        this.f27633a = 0;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z3;
        if (task.isSuccessful()) {
            b bVar = (b) task.getResult();
            String str = "Crashlytics report successfully enqueued to DataTransport: " + bVar.f27536b;
            ge.e eVar = ge.e.f24699a;
            eVar.b(str);
            File file = bVar.f27537c;
            z3 = true;
            if (file.delete()) {
                eVar.b("Deleted report file: " + file.getPath());
            } else {
                eVar.d("Crashlytics could not delete report file: " + file.getPath(), null);
            }
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }
}
