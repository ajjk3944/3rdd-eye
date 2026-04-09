package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kc1 extends fc1 implements hz, iz {
    public static final qb1 n = lc1.a;
    public final Context g;
    public final Handler h;
    public final qb1 i;
    public final Set j;
    public final bu1 k;
    public yv0 l;
    public zb1 m;

    public kc1(Context context, wc1 wc1Var, bu1 bu1Var) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.g = context;
        this.h = wc1Var;
        this.k = bu1Var;
        this.j = (Set) bu1Var.g;
        this.i = n;
    }

    @Override // defpackage.hz
    public final void T(int i) {
        this.l.k();
    }

    @Override // defpackage.iz
    public final void U(rh rhVar) {
        this.m.a(rhVar);
    }

    @Override // defpackage.hz
    public final void Y() throws NumberFormatException {
        GoogleSignInAccount googleSignInAccountA;
        yv0 yv0Var = this.l;
        yv0Var.getClass();
        boolean z = false;
        try {
            yv0Var.A.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = yv0Var.c;
                ReentrantLock reentrantLock = jy0.c;
                ou1.j(context);
                ReentrantLock reentrantLock2 = jy0.c;
                reentrantLock2.lock();
                try {
                    if (jy0.d == null) {
                        jy0.d = new jy0(context.getApplicationContext());
                    }
                    jy0 jy0Var = jy0.d;
                    reentrantLock2.unlock();
                    String strA = jy0Var.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strA)) {
                        StringBuilder sb = new StringBuilder(20 + String.valueOf(strA).length());
                        sb.append("googleSignInAccount:");
                        sb.append(strA);
                        String strA2 = jy0Var.a(sb.toString());
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
            Integer num = yv0Var.C;
            ou1.j(num);
            xc1 xc1Var = new xc1(2, account, num.intValue(), googleSignInAccountA);
            nc1 nc1Var = (nc1) yv0Var.t();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(nc1Var.h);
            int i = ec1.a;
            parcelObtain.writeInt(1);
            int I = uk2.I(parcelObtain, 20293);
            uk2.T(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            uk2.C(parcelObtain, 2, xc1Var, 0);
            uk2.O(parcelObtain, I);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                nc1Var.g.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain.recycle();
                parcelObtain2.recycle();
            } catch (Throwable th2) {
                parcelObtain.recycle();
                parcelObtain2.recycle();
                throw th2;
            }
        } catch (RemoteException e) {
            try {
                this.h.post(new jq3(this, new sc1(1, new rh(8, null), null), 18, z));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }
}
