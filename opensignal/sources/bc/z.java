package bc;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zaw;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import h9.r2;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class z extends bd.b implements ac.g, ac.h {

    /* renamed from: l, reason: collision with root package name */
    public static final ad.b f2665l = ad.c.f339a;

    /* renamed from: e, reason: collision with root package name */
    public final Context f2666e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f2667f;

    /* renamed from: g, reason: collision with root package name */
    public final ad.b f2668g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f2669h;

    /* renamed from: i, reason: collision with root package name */
    public final r2 f2670i;
    public bd.a j;
    public p k;

    public z(Context context, yh.a aVar, r2 r2Var) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 0);
        this.f2666e = context;
        this.f2667f = aVar;
        this.f2670i = r2Var;
        this.f2669h = (Set) r2Var.f10470a;
        this.f2668g = f2665l;
    }

    @Override // ac.g
    public final void d(int i10) {
        p pVar = this.k;
        n nVar = (n) ((d) pVar.f2641f).F.get((a) pVar.f2638c);
        if (nVar != null) {
            if (nVar.f2629l) {
                nVar.m(new ConnectionResult(17, null, null));
            } else {
                nVar.d(i10);
            }
        }
    }

    @Override // ac.g
    public final void e() throws NumberFormatException {
        GoogleSignInAccount googleSignInAccountD;
        bd.a aVar = this.j;
        aVar.getClass();
        boolean z10 = false;
        try {
            aVar.B.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = aVar.f3617c;
                ReentrantLock reentrantLock = wb.a.f24404c;
                cc.s.h(context);
                ReentrantLock reentrantLock2 = wb.a.f24404c;
                reentrantLock2.lock();
                try {
                    if (wb.a.f24405d == null) {
                        wb.a.f24405d = new wb.a(context.getApplicationContext());
                    }
                    wb.a aVar2 = wb.a.f24405d;
                    reentrantLock2.unlock();
                    String strA = aVar2.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strA)) {
                        StringBuilder sb2 = new StringBuilder(20 + String.valueOf(strA).length());
                        sb2.append("googleSignInAccount:");
                        sb2.append(strA);
                        String strA2 = aVar2.a(sb2.toString());
                        if (strA2 != null) {
                            try {
                                googleSignInAccountD = GoogleSignInAccount.d(strA2);
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    googleSignInAccountD = null;
                } catch (Throwable th2) {
                    reentrantLock2.unlock();
                    throw th2;
                }
            } else {
                googleSignInAccountD = null;
            }
            Integer num = aVar.D;
            cc.s.h(num);
            zaw zawVar = new zaw(2, account, num.intValue(), googleSignInAccountD);
            bd.c cVar = (bd.c) aVar.m();
            zai zaiVar = new zai(1, zawVar);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(cVar.f5252f);
            int i10 = mc.b.f16672a;
            parcelObtain.writeInt(1);
            zaiVar.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                cVar.f5251e.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain.recycle();
                parcelObtain2.recycle();
            } catch (Throwable th3) {
                parcelObtain.recycle();
                parcelObtain2.recycle();
                throw th3;
            }
        } catch (RemoteException e4) {
            io.sentry.android.core.e0.p("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f2667f.post(new re.a(3, this, new zak(1, new ConnectionResult(8, null, null), null), z10));
            } catch (RemoteException unused2) {
                io.sentry.android.core.e0.r("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e4);
            }
        }
    }

    @Override // ac.h
    public final void f(ConnectionResult connectionResult) {
        this.k.f(connectionResult);
    }
}
