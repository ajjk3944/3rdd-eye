package com.google.android.gms.common.api.internal;

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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w extends ac.i implements ob.g, ob.h {

    /* renamed from: i, reason: collision with root package name */
    public static final gc.b f9135i = gc.c.f24629a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f9136b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f9137c;

    /* renamed from: d, reason: collision with root package name */
    public final gc.b f9138d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f9139e;

    /* renamed from: f, reason: collision with root package name */
    public final va.o f9140f;
    public hc.a g;

    /* renamed from: h, reason: collision with root package name */
    public p f9141h;

    public w(Context context, ac.k kVar, va.o oVar) {
        super(2);
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f9136b = context;
        this.f9137c = kVar;
        this.f9140f = oVar;
        this.f9139e = (Set) oVar.f36146b;
        this.f9138d = f9135i;
    }

    @Override // ob.h
    public final void O(nb.b bVar) {
        this.f9141h.b(bVar);
    }

    @Override // ob.g
    public final void S(int i4) {
        p pVar = this.f9141h;
        n nVar = (n) ((d) pVar.f9119f).j.get((a) pVar.f9116c);
        if (nVar != null) {
            if (nVar.f9108i) {
                nVar.m(new nb.b(17, null, null));
            } else {
                nVar.S(i4);
            }
        }
    }

    @Override // ob.g
    public final void T() throws NumberFormatException {
        GoogleSignInAccount googleSignInAccountA;
        hc.a aVar = this.g;
        aVar.getClass();
        boolean z3 = false;
        try {
            aVar.A.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = aVar.f31569c;
                ReentrantLock reentrantLock = mb.a.f29020c;
                pb.y.h(context);
                ReentrantLock reentrantLock2 = mb.a.f29020c;
                reentrantLock2.lock();
                try {
                    if (mb.a.f29021d == null) {
                        mb.a.f29021d = new mb.a(context.getApplicationContext());
                    }
                    mb.a aVar2 = mb.a.f29021d;
                    reentrantLock2.unlock();
                    String strA = aVar2.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strA)) {
                        String strA2 = aVar2.a("googleSignInAccount:" + strA);
                        if (strA2 != null) {
                            try {
                                googleSignInAccountA = GoogleSignInAccount.a(strA2);
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    googleSignInAccountA = null;
                } catch (Throwable th2) {
                    reentrantLock2.unlock();
                    throw th2;
                }
            } else {
                googleSignInAccountA = null;
            }
            Integer num = aVar.C;
            pb.y.h(num);
            pb.r rVar = new pb.r(2, account, num.intValue(), googleSignInAccountA);
            hc.c cVar = (hc.c) aVar.t();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(cVar.f304c);
            int i4 = zb.a.f38165a;
            parcelObtain.writeInt(1);
            int iO = com.bumptech.glide.f.O(parcelObtain, 20293);
            com.bumptech.glide.f.N(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            com.bumptech.glide.f.H(parcelObtain, 2, rVar, 0);
            com.bumptech.glide.f.P(parcelObtain, iO);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                cVar.f303b.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain.recycle();
                parcelObtain2.recycle();
            } catch (Throwable th3) {
                parcelObtain.recycle();
                parcelObtain2.recycle();
                throw th3;
            }
        } catch (RemoteException e2) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f9137c.post(new vd.a(this, z3, new hc.e(1, new nb.b(8, null, null), null), 8));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }
}
