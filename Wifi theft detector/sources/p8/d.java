package p8;

import android.content.Context;
import android.os.AsyncTask;
import com.wifihacker.detector.common.wol.WakeOnLanClient;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class d implements q8.c {

    /* renamed from: a, reason: collision with root package name */
    public r8.c f23920a;

    /* renamed from: b, reason: collision with root package name */
    public o8.a f23921b;

    /* renamed from: c, reason: collision with root package name */
    public Context f23922c;

    public class a extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f23923a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f23924b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f23925c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f23926d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.app.b f23927e;

        public a(byte[] bArr, String str, String str2, String str3, androidx.appcompat.app.b bVar) {
            this.f23923a = bArr;
            this.f23924b = str;
            this.f23925c = str2;
            this.f23926d = str3;
            this.f23927e = bVar;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WakeOnLanClient.WakeState doInBackground(Void... voidArr) {
            return WakeOnLanClient.b(this.f23923a, this.f23924b, Integer.parseInt(this.f23925c));
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(WakeOnLanClient.WakeState wakeState) {
            super.onPostExecute(wakeState);
            if (wakeState == WakeOnLanClient.WakeState.SUCCESS) {
                d.this.f23920a.l(wakeState, this.f23926d);
                d.this.j(this.f23926d, this.f23924b, this.f23925c);
                this.f23927e.dismiss();
            } else if (wakeState == WakeOnLanClient.WakeState.UNKNOWNHOST) {
                d.this.f23920a.l(wakeState, this.f23924b);
            } else {
                d.this.f23920a.l(wakeState, this.f23926d);
            }
        }
    }

    @Override // q8.c
    public void a(int i10) {
        this.f23921b.a(i10);
    }

    @Override // q8.c
    public ArrayList b() {
        return this.f23921b.b();
    }

    @Override // q8.c
    public void c() {
        this.f23920a.c();
    }

    @Override // q8.c
    public void d() {
        this.f23921b.d();
    }

    @Override // q8.c
    public void e(Context context) {
        this.f23922c = context;
    }

    @Override // q8.c
    public void f(androidx.appcompat.app.b bVar, String str, String str2, String str3) {
        d dVar;
        String str4;
        try {
            dVar = this;
            str4 = str;
        } catch (Exception unused) {
            dVar = this;
            str4 = str;
        }
        try {
            dVar.i(bVar, str4, str2, str3, WakeOnLanClient.a(str));
        } catch (Exception unused2) {
            dVar.f23920a.l(null, str4);
        }
    }

    @Override // q8.c
    public void g(r8.c cVar) {
        this.f23920a = cVar;
        this.f23921b = new n8.a(this);
    }

    @Override // q8.c
    public Context getContext() {
        return this.f23922c;
    }

    public final void i(androidx.appcompat.app.b bVar, String str, String str2, String str3, byte[] bArr) {
        new a(bArr, str2, str3, str, bVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void j(String str, String str2, String str3) {
        this.f23921b.e(str, str2, str3);
    }
}
