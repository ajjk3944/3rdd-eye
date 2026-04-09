package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.view.MenuItem;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.AEADBadTagException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class e6 {
    public Object a;
    public Object b;

    public /* synthetic */ e6(Object obj) {
        this.a = obj;
    }

    public abstract void c();

    public void d() {
        d6 d6Var = (d6) this.a;
        if (d6Var != null) {
            try {
                ((h6) this.b).p.unregisterReceiver(d6Var);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public void e() {
        lx0 lx0Var = (lx0) this.a;
        md mdVar = (md) this.b;
        HashSet hashSet = lx0Var.e;
        if (hashSet.remove(mdVar) && hashSet.isEmpty()) {
            lx0Var.b();
        }
    }

    public abstract IntentFilter f();

    public abstract int g();

    public MenuItem h(MenuItem menuItem) {
        if (!(menuItem instanceof iz0)) {
            return menuItem;
        }
        iz0 iz0Var = (iz0) menuItem;
        if (((bw0) this.b) == null) {
            this.b = new bw0(0);
        }
        MenuItem menuItem2 = (MenuItem) ((bw0) this.b).get(iz0Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        wd0 wd0Var = new wd0((Context) this.a, iz0Var);
        ((bw0) this.b).put(iz0Var, wd0Var);
        return wd0Var;
    }

    public abstract Object i(IBinder iBinder);

    public Object j(Context context) throws PackageManager.NameNotFoundException, hp0 {
        Context contextCreatePackageContext;
        if (this.b == null) {
            ou1.j(context);
            int i = oz.c;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext == null) {
                throw new hp0("Could not get remote context.");
            }
            try {
                this.b = i((IBinder) contextCreatePackageContext.getClassLoader().loadClass((String) this.a).newInstance());
            } catch (ClassNotFoundException e) {
                throw new hp0("Could not load creator class.", e);
            } catch (IllegalAccessException e2) {
                throw new hp0("Could not access creator.", e2);
            } catch (InstantiationException e3) {
                throw new hp0("Could not instantiate creator.", e3);
            }
        }
        return this.b;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m(fa faVar);

    public abstract void n();

    public void o() {
        d();
        IntentFilter intentFilterF = f();
        if (intentFilterF.countActions() == 0) {
            return;
        }
        if (((d6) this.a) == null) {
            this.a = new d6(0, this);
        }
        ((h6) this.b).p.registerReceiver((d6) this.a, intentFilterF);
    }

    public abstract void p();

    public abstract void q();

    public abstract eu3 r(int i, byte[] bArr);

    public byte[] s(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
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
            ((eu3) this.b).b(0, bArr).get(bArr4);
            int length = bArr2.length;
            int i = length & 15;
            int i2 = i == 0 ? length : (length + 16) - i;
            int iRemaining = byteBuffer.remaining();
            int i3 = iRemaining % 16;
            int i4 = (i3 == 0 ? iRemaining : (iRemaining + 16) - i3) + i2;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i4 + 16).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put(bArr2);
            byteBufferOrder.position(i2);
            byteBufferOrder.put(byteBuffer);
            byteBufferOrder.position(i4);
            byteBufferOrder.putLong(length);
            byteBufferOrder.putLong(iRemaining);
            if (!MessageDigest.isEqual(m54.H(bArr4, byteBufferOrder.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            eu3 eu3Var = (eu3) this.a;
            eu3Var.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            if (bArr.length != eu3Var.a()) {
                int iA = eu3Var.a();
                throw new GeneralSecurityException(ex0.j(new StringBuilder(String.valueOf(iA).length() + 36), "The nonce length (in bytes) must be ", iA));
            }
            int iRemaining2 = byteBuffer.remaining();
            int i5 = iRemaining2 / 64;
            for (int i6 = 0; i6 < i5 + 1; i6++) {
                ByteBuffer byteBufferB = eu3Var.b(eu3Var.b + i6, bArr);
                if (i6 == i5) {
                    i41.Q(byteBufferAllocate, byteBuffer, byteBufferB, iRemaining2 % 64);
                } else {
                    i41.Q(byteBufferAllocate, byteBuffer, byteBufferB, 64);
                }
            }
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    public void t(td2 td2Var, rd2 rd2Var) {
        vq2 vq2Var = new vq2(this, td2Var, rd2Var, 26);
        pd2 pd2Var = (pd2) this.a;
        pd2Var.c(new jq3(pd2Var, vq2Var, 0), md2.g);
    }

    public void u() {
        ((pd2) this.a).b(new Exception());
    }

    public void v(String str, Throwable th) {
        ((pd2) this.a).b(th);
        if (((Boolean) tw1.e.c.a(mz1.g8)).booleanValue()) {
            hg4.C.h.e(str, th);
        }
    }

    public e6(wt2 wt2Var, ra4 ra4Var) {
        this.b = wt2Var;
        this.a = ra4Var;
    }

    public e6() {
        pd2 pd2Var = new pd2();
        this.a = pd2Var;
        this.b = new AtomicInteger(0);
        kf3 kf3Var = new kf3(18, this);
        pd2Var.c(new jq3(pd2Var, kf3Var, 0), md2.g);
    }

    public e6(int i) {
        this.b = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            ((ArrayList) this.b).add(new cq());
        }
    }

    public e6(lx0 lx0Var, md mdVar) {
        this.a = lx0Var;
        this.b = mdVar;
    }

    public e6(h6 h6Var) {
        this.b = h6Var;
    }
}
