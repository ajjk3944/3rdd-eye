package androidx.recyclerview.widget;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.IBinder;
import android.util.SparseIntArray;
import android.view.MenuItem;
import com.google.android.gms.internal.ads.fk0;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.gx;
import com.google.android.gms.internal.ads.hx;
import com.google.android.gms.internal.ads.ix;
import com.google.android.gms.internal.ads.kf;
import com.google.android.gms.internal.ads.l90;
import com.google.android.gms.internal.ads.mq0;
import com.google.android.gms.internal.ads.q81;
import com.google.android.gms.internal.ads.sk;
import com.liuzh.deviceinfo.DeviceInfoApp;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.AEADBadTagException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class d0 implements d8.w {

    /* renamed from: a, reason: collision with root package name */
    public Object f1325a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1326b;

    public d0(l90 l90Var, ya.c0 c0Var) {
        this.f1326b = l90Var;
        this.f1325a = c0Var;
    }

    public void c() {
        kf kfVar = (kf) this.f1325a;
        if (kfVar != null) {
            try {
                ((i.v) this.f1326b).f25374k.unregisterReceiver(kfVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f1325a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int[] e(int i4);

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof y3.a)) {
            return menuItem;
        }
        y3.a aVar = (y3.a) menuItem;
        if (((x.n0) this.f1326b) == null) {
            this.f1326b = new x.n0(0);
        }
        MenuItem menuItem2 = (MenuItem) ((x.n0) this.f1326b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        o.t tVar = new o.t((Context) this.f1325a, aVar);
        ((x.n0) this.f1326b).put(aVar, tVar);
        return tVar;
    }

    public int[] h(int i4, int i10) {
        if (i4 < 0 || i10 < 0 || i4 == i10) {
            return null;
        }
        int[] iArr = (int[]) this.f1326b;
        iArr[0] = i4;
        iArr[1] = i10;
        return iArr;
    }

    @Override // d8.w
    public d8.v i(d8.b0 b0Var) {
        Context context = (Context) this.f1325a;
        Class cls = (Class) this.f1326b;
        return new e8.d(context, b0Var.b(File.class, cls), b0Var.b(Uri.class, cls), cls);
    }

    public abstract Object j(IBinder iBinder);

    public Object k(Context context) throws vb.c, PackageManager.NameNotFoundException {
        Context contextCreatePackageContext;
        if (this.f1326b == null) {
            pb.y.h(context);
            AtomicBoolean atomicBoolean = nb.i.f29900a;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext == null) {
                throw new vb.c("Could not get remote context.");
            }
            try {
                this.f1326b = j((IBinder) contextCreatePackageContext.getClassLoader().loadClass((String) this.f1325a).newInstance());
            } catch (ClassNotFoundException e2) {
                throw new vb.c("Could not load creator class.", e2);
            } catch (IllegalAccessException e10) {
                throw new vb.c("Could not access creator.", e10);
            } catch (InstantiationException e11) {
                throw new vb.c("Could not instantiate creator.", e11);
            }
        }
        return this.f1326b;
    }

    public int l(int i4, int i10) {
        int iN = n(i4);
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i4; i13++) {
            int iN2 = n(i13);
            i11 += iN2;
            if (i11 == i10) {
                i12++;
                i11 = 0;
            } else if (i11 > i10) {
                i12++;
                i11 = iN2;
            }
        }
        return i11 + iN > i10 ? i12 + 1 : i12;
    }

    public int m(int i4, int i10) {
        int iN = n(i4);
        if (iN == i10) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i4; i12++) {
            int iN2 = n(i12);
            i11 += iN2;
            if (i11 == i10) {
                i11 = 0;
            } else if (i11 > i10) {
                i11 = iN2;
            }
        }
        if (iN + i11 <= i10) {
            return i11;
        }
        return 0;
    }

    public abstract int n(int i4);

    public String o() {
        String str = (String) this.f1325a;
        if (str != null) {
            return str;
        }
        nk.k.k("text");
        throw null;
    }

    public void p() {
        ((SparseIntArray) this.f1325a).clear();
    }

    public abstract void q();

    public abstract int[] r(int i4);

    public void s() {
        c();
        IntentFilter intentFilterD = d();
        if (intentFilterD.countActions() == 0) {
            return;
        }
        if (((kf) this.f1325a) == null) {
            this.f1325a = new kf(8, this);
        }
        ((i.v) this.f1326b).f25374k.registerReceiver((kf) this.f1325a, intentFilterD);
    }

    public abstract androidx.datastore.preferences.protobuf.j t(int i4, byte[] bArr);

    public byte[] u(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((androidx.datastore.preferences.protobuf.j) this.f1326b).G(0, bArr).get(bArr4);
            int length = bArr2.length;
            int i4 = length & 15;
            int i10 = i4 == 0 ? length : (length + 16) - i4;
            int iRemaining = byteBuffer.remaining();
            int i11 = iRemaining % 16;
            int i12 = (i11 == 0 ? iRemaining : (iRemaining + 16) - i11) + i10;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i12 + 16).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put(bArr2);
            byteBufferOrder.position(i10);
            byteBufferOrder.put(byteBuffer);
            byteBufferOrder.position(i12);
            byteBufferOrder.putLong(length);
            byteBufferOrder.putLong(iRemaining);
            if (!MessageDigest.isEqual(mq0.p(bArr4, byteBufferOrder.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f1325a;
            jVar.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            if (bArr.length != jVar.F()) {
                int iF = jVar.F();
                throw new GeneralSecurityException(d.h.q(iF, "The nonce length (in bytes) must be ", new StringBuilder(String.valueOf(iF).length() + 36)));
            }
            int iRemaining2 = byteBuffer.remaining();
            int i13 = iRemaining2 / 64;
            for (int i14 = 0; i14 < i13 + 1; i14++) {
                ByteBuffer byteBufferG = jVar.G(jVar.f995a + i14, bArr);
                if (i14 == i13) {
                    mq0.K(byteBufferAllocate, byteBuffer, byteBufferG, iRemaining2 % 64);
                } else {
                    mq0.K(byteBufferAllocate, byteBuffer, byteBufferG, 64);
                }
            }
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e2) {
            throw new AEADBadTagException(e2.toString());
        }
    }

    public void v(ix ixVar, hx hxVar) {
        l90 l90Var = new l90(this, ixVar, hxVar, 7);
        gx gxVar = (gx) this.f1325a;
        gxVar.a(new q81(0, gxVar, l90Var), fx.g);
    }

    public void w() {
        ((gx) this.f1325a).d(new Exception());
    }

    public void x(String str, Throwable th2) {
        ((gx) this.f1325a).d(th2);
        if (((Boolean) va.s.f36163e.f36166c.a(sk.B8)).booleanValue()) {
            ua.j.C.f35265h.g(str, th2);
        }
    }

    public /* synthetic */ d0(Object obj) {
        this.f1325a = obj;
    }

    public d0(Context context, Class cls) {
        this.f1325a = context;
        this.f1326b = cls;
    }

    public d0(int i4) {
        switch (i4) {
            case 1:
                gx gxVar = new gx();
                this.f1325a = gxVar;
                this.f1326b = new AtomicInteger(0);
                fk0 fk0Var = new fk0(16, this);
                gxVar.a(new q81(0, gxVar, fk0Var), fx.g);
                break;
            case 6:
                this.f1326b = new int[2];
                break;
            case 9:
                this.f1325a = new r3.y(DeviceInfoApp.f21145f);
                this.f1326b = new AtomicInteger(new Random().nextInt(12453) + 5678);
                break;
            default:
                this.f1325a = new SparseIntArray();
                this.f1326b = new SparseIntArray();
                break;
        }
    }

    public d0(i.v vVar) {
        this.f1326b = vVar;
    }
}
