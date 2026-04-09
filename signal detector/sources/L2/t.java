package L2;

import a.AbstractC0241a;
import a3.AbstractC0273b;
import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import b3.C0331a;
import b3.C0333c;
import b3.C0335e;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import q2.C2834o;

/* loaded from: classes.dex */
public final class t extends S3.d implements K2.g, K2.h {
    public static final O2.b i = AbstractC0273b.f4678a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2557b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f2558c;

    /* renamed from: d, reason: collision with root package name */
    public final O2.b f2559d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f2560e;

    /* renamed from: f, reason: collision with root package name */
    public final C2834o f2561f;

    /* renamed from: g, reason: collision with root package name */
    public C0331a f2562g;

    /* renamed from: h, reason: collision with root package name */
    public m f2563h;

    public t(Context context, W2.e eVar, C2834o c2834o) {
        super(3);
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f2557b = context;
        this.f2558c = eVar;
        this.f2561f = c2834o;
        this.f2560e = (Set) c2834o.f23252b;
        this.f2559d = i;
    }

    @Override // K2.g
    public final void g0(int i3) {
        this.f2562g.h();
    }

    @Override // K2.g
    public final void h0() throws NumberFormatException {
        GoogleSignInAccount googleSignInAccountA;
        C0331a c0331a = this.f2562g;
        c0331a.getClass();
        try {
            c0331a.f5719A.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = c0331a.f2735c;
                ReentrantLock reentrantLock = I2.a.f1890c;
                M2.u.e(context);
                ReentrantLock reentrantLock2 = I2.a.f1890c;
                reentrantLock2.lock();
                try {
                    if (I2.a.f1891d == null) {
                        I2.a.f1891d = new I2.a(context.getApplicationContext());
                    }
                    I2.a aVar = I2.a.f1891d;
                    reentrantLock2.unlock();
                    String strA = aVar.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strA)) {
                        StringBuilder sb = new StringBuilder(20 + String.valueOf(strA).length());
                        sb.append("googleSignInAccount:");
                        sb.append(strA);
                        String strA2 = aVar.a(sb.toString());
                        if (strA2 != null) {
                            try {
                                googleSignInAccountA = GoogleSignInAccount.a(strA2);
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    googleSignInAccountA = null;
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } else {
                googleSignInAccountA = null;
            }
            Integer num = c0331a.f5721C;
            M2.u.e(num);
            M2.q qVar = new M2.q(2, account, num.intValue(), googleSignInAccountA);
            C0333c c0333c = (C0333c) c0331a.t();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(c0333c.f4017c);
            int i3 = W2.b.f4018a;
            parcelObtain.writeInt(1);
            int iE = AbstractC0241a.E(parcelObtain, 20293);
            AbstractC0241a.B(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            AbstractC0241a.t(parcelObtain, 2, qVar, 0);
            AbstractC0241a.H(parcelObtain, iE);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                c0333c.f4016b.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain.recycle();
                parcelObtain2.recycle();
            } catch (Throwable th2) {
                parcelObtain.recycle();
                parcelObtain2.recycle();
                throw th2;
            }
        } catch (RemoteException e6) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f2558c.post(new A1.d(this, 10, new C0335e(1, new J2.b(8, null, null), null)));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e6);
            }
        }
    }

    @Override // K2.h
    public final void k0(J2.b bVar) {
        this.f2563h.d(bVar);
    }
}
