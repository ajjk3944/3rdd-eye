package B3;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.IBinder;
import android.util.SparseIntArray;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.internal.ads.AbstractC0582Jp;
import com.google.android.gms.internal.ads.AbstractC0640Nf;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.google.android.gms.internal.ads.C0657Of;
import com.google.android.gms.internal.ads.C0697Ql;
import com.google.android.gms.internal.ads.C1576nF;
import com.google.android.gms.internal.ads.CD;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.InterfaceC0674Pf;
import com.google.android.gms.internal.ads.InterfaceC0691Qf;
import com.google.android.gms.internal.ads.L6;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.AEADBadTagException;
import k0.U;
import q2.C2841s;
import t2.C2909E;
import u.C2940i;

/* loaded from: classes.dex */
public abstract class u implements r1.s {

    /* renamed from: a, reason: collision with root package name */
    public Object f662a;

    /* renamed from: b, reason: collision with root package name */
    public Object f663b;

    public u(C0697Ql c0697Ql, C2909E c2909e) {
        this.f663b = c0697Ql;
        this.f662a = c2909e;
    }

    public static float i(int i, int i3, int i6) {
        return d5.y.e((i - i3) / i6, 0.0f, 1.0f);
    }

    public void A(InterfaceC0691Qf interfaceC0691Qf, InterfaceC0674Pf interfaceC0674Pf) {
        C0697Ql c0697Ql = new C0697Ql(this, interfaceC0691Qf, interfaceC0674Pf, 11);
        C0657Of c0657Of = (C0657Of) this.f662a;
        c0657Of.a(new CD(c0657Of, 0, c0697Ql), AbstractC0640Nf.f10011g);
    }

    public void B() {
        ((C0657Of) this.f662a).c(new Exception());
    }

    public void C(String str, Throwable th) {
        ((C0657Of) this.f662a).c(th);
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.B8)).booleanValue()) {
            p2.j.f22785C.f22795h.g(str, th);
        }
    }

    public abstract void c();

    @Override // r1.s
    public r1.r d(r1.x xVar) {
        Context context = (Context) this.f662a;
        Class cls = (Class) this.f663b;
        return new s1.d(context, xVar.c(File.class, cls), xVar.c(Uri.class, cls), cls);
    }

    public void e() {
        A1.t tVar = (A1.t) this.f662a;
        if (tVar != null) {
            try {
                ((h.v) this.f663b).f20418k.unregisterReceiver(tVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f662a = null;
        }
    }

    public void f() {
        U u6 = (U) this.f662a;
        N.d dVar = (N.d) this.f663b;
        LinkedHashSet linkedHashSet = u6.f21581e;
        if (linkedHashSet.remove(dVar) && linkedHashSet.isEmpty()) {
            u6.b();
        }
    }

    public abstract IntentFilter g();

    public abstract int h();

    public MenuItem j(MenuItem menuItem) {
        if (!(menuItem instanceof L.a)) {
            return menuItem;
        }
        L.a aVar = (L.a) menuItem;
        if (((C2940i) this.f663b) == null) {
            this.f663b = new C2940i(0);
        }
        MenuItem menuItem2 = (MenuItem) ((C2940i) this.f663b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        n.r rVar = new n.r((Context) this.f662a, aVar);
        ((C2940i) this.f663b).put(aVar, rVar);
        return rVar;
    }

    public abstract Object k(IBinder iBinder);

    public Object l(Context context) throws S2.c, PackageManager.NameNotFoundException {
        Context contextCreatePackageContext;
        if (this.f663b == null) {
            M2.u.e(context);
            int i = J2.h.f2062c;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext == null) {
                throw new S2.c("Could not get remote context.");
            }
            try {
                this.f663b = k((IBinder) contextCreatePackageContext.getClassLoader().loadClass((String) this.f662a).newInstance());
            } catch (ClassNotFoundException e6) {
                throw new S2.c("Could not load creator class.", e6);
            } catch (IllegalAccessException e7) {
                throw new S2.c("Could not access creator.", e7);
            } catch (InstantiationException e8) {
                throw new S2.c("Could not instantiate creator.", e8);
            }
        }
        return this.f663b;
    }

    public int m(int i, int i3) {
        int iO = o(i);
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            int iO2 = o(i8);
            i6 += iO2;
            if (i6 == i3) {
                i7++;
                i6 = 0;
            } else if (i6 > i3) {
                i7++;
                i6 = iO2;
            }
        }
        return i6 + iO > i3 ? i7 + 1 : i7;
    }

    public int n(int i, int i3) {
        int iO = o(i);
        if (iO == i3) {
            return 0;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < i; i7++) {
            int iO2 = o(i7);
            i6 += iO2;
            if (i6 == i3) {
                i6 = 0;
            } else if (i6 > i3) {
                i6 = iO2;
            }
        }
        if (iO + i6 <= i3) {
            return i6;
        }
        return 0;
    }

    public abstract int o(int i);

    public void p() {
        ((SparseIntArray) this.f662a).clear();
    }

    public abstract void q();

    public boolean r() {
        U u6 = (U) this.f662a;
        View view = u6.f21579c.f21696T;
        q5.i.d(view, "operation.fragment.mView");
        int i = 4;
        if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
            int visibility = view.getVisibility();
            if (visibility == 0) {
                i = 2;
            } else if (visibility != 4) {
                if (visibility != 8) {
                    throw new IllegalArgumentException(AbstractC1135f5.l(visibility, "Unknown visibility "));
                }
                i = 3;
            }
        }
        int i3 = u6.f21577a;
        if (i != i3) {
            return (i == 2 || i3 == 2) ? false : true;
        }
        return true;
    }

    public abstract void s();

    public abstract void t(c cVar);

    public abstract void u();

    public void v() {
        e();
        IntentFilter intentFilterG = g();
        if (intentFilterG.countActions() == 0) {
            return;
        }
        if (((A1.t) this.f662a) == null) {
            this.f662a = new A1.t(14, this);
        }
        ((h.v) this.f663b).f20418k.registerReceiver((A1.t) this.f662a, intentFilterG);
    }

    public abstract void w();

    public abstract void x();

    public abstract C1576nF y(int i, byte[] bArr);

    public byte[] z(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
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
            ((C1576nF) this.f663b).b(0, bArr).get(bArr4);
            int length = bArr2.length;
            int i = length & 15;
            int i3 = i == 0 ? length : (length + 16) - i;
            int iRemaining = byteBuffer.remaining();
            int i6 = iRemaining % 16;
            int i7 = (i6 == 0 ? iRemaining : (iRemaining + 16) - i6) + i3;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i7 + 16).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put(bArr2);
            byteBufferOrder.position(i3);
            byteBufferOrder.put(byteBuffer);
            byteBufferOrder.position(i7);
            byteBufferOrder.putLong(length);
            byteBufferOrder.putLong(iRemaining);
            if (!MessageDigest.isEqual(AbstractC0582Jp.p(bArr4, byteBufferOrder.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            C1576nF c1576nF = (C1576nF) this.f662a;
            c1576nF.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            if (bArr.length != c1576nF.a()) {
                int iA = c1576nF.a();
                throw new GeneralSecurityException(A.f.i(iA, "The nonce length (in bytes) must be ", new StringBuilder(String.valueOf(iA).length() + 36)));
            }
            int iRemaining2 = byteBuffer.remaining();
            int i8 = iRemaining2 / 64;
            for (int i9 = 0; i9 < i8 + 1; i9++) {
                ByteBuffer byteBufferB = c1576nF.b(c1576nF.f15761b + i9, bArr);
                if (i9 == i8) {
                    AbstractC0582Jp.L(byteBufferAllocate, byteBuffer, byteBufferB, iRemaining2 % 64);
                } else {
                    AbstractC0582Jp.L(byteBufferAllocate, byteBuffer, byteBufferB, 64);
                }
            }
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e6) {
            throw new AEADBadTagException(e6.toString());
        }
    }

    public /* synthetic */ u(Object obj) {
        this.f662a = obj;
    }

    public /* synthetic */ u(Object obj, Object obj2) {
        this.f662a = obj;
        this.f663b = obj2;
    }

    public u(int i) {
        this.f663b = new ArrayList();
        for (int i3 = 0; i3 < i; i3++) {
            ((ArrayList) this.f663b).add(new r());
        }
    }

    public u(int i, boolean z6) {
        switch (i) {
            case 3:
                C0657Of c0657Of = new C0657Of();
                this.f662a = c0657Of;
                this.f663b = new AtomicInteger(0);
                L6 l6 = new L6(10, this);
                c0657Of.a(new CD(c0657Of, 0, l6), AbstractC0640Nf.f10011g);
                break;
            default:
                this.f662a = new SparseIntArray();
                this.f663b = new SparseIntArray();
                break;
        }
    }

    public u(h.v vVar) {
        this.f663b = vVar;
    }
}
