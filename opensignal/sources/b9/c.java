package b9;

import android.graphics.Region;
import android.os.Build;
import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import android.view.autofill.AutofillManager;
import androidx.media3.common.o;
import androidx.recyclerview.widget.RecyclerView;
import br.l;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.material.appbar.AppBarLayout;
import d8.f;
import dd.h;
import h7.y0;
import h7.y1;
import h7.z0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import mq.w;
import pb.o0;
import r5.i;
import r5.j;
import r5.k;
import r5.q;
import sm.m;
import u3.h1;
import u3.n;

/* loaded from: classes.dex */
public class c implements i, o0, bc.i, n, gt.n, y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2477a;

    /* renamed from: d, reason: collision with root package name */
    public Object f2478d;

    public /* synthetic */ c(int i10, Object obj) {
        this.f2477a = i10;
        this.f2478d = obj;
    }

    public static boolean f(String str, String str2) {
        l.e(str, "className");
        try {
            Field[] declaredFields = Class.forName(str).getDeclaredFields();
            l.d(declaredFields, "getDeclaredFields(...)");
            for (Field field : declaredFields) {
                if (field.getName().equals(str2)) {
                    return true;
                }
            }
        } catch (Exception | NoClassDefFoundError unused) {
        }
        return false;
    }

    public static String g(String str, b bVar, boolean z10) {
        String strTempExtension = z10 ? bVar.tempExtension() : bVar.extension;
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strTempExtension.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strReplaceAll.getBytes());
                StringBuilder sb2 = new StringBuilder();
                for (byte b2 : bArrDigest) {
                    sb2.append(String.format("%02x", Byte.valueOf(b2)));
                }
                strReplaceAll = sb2.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return h0.b.o("lottie_cache_", strReplaceAll, strTempExtension);
    }

    public static boolean l(ej.a aVar) {
        l.e(aVar, "dependency");
        return n(aVar.getClassName());
    }

    public static boolean n(String str) throws ClassNotFoundException {
        l.e(str, "className");
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException e4) {
            ch.n.g("DependenciesChecker", h0.b.o("Class ", str, " in not available"), e4);
            return false;
        } catch (NoClassDefFoundError e10) {
            ch.n.g("DependenciesChecker", h0.b.o("Class ", str, " is not found"), e10);
            return false;
        }
    }

    public static boolean o(String str, String str2) throws SecurityException {
        l.e(str, "className");
        try {
            Method[] declaredMethods = Class.forName(str).getDeclaredMethods();
            l.d(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (method.getName().equals(str2)) {
                    return true;
                }
            }
        } catch (Exception | NoClassDefFoundError unused) {
        }
        return false;
    }

    @Override // pb.o0
    public void a() throws IOException {
        DashMediaSource dashMediaSource = (DashMediaSource) this.f2478d;
        dashMediaSource.loader.a();
        if (dashMediaSource.manifestFatalError != null) {
            throw dashMediaSource.manifestFatalError;
        }
    }

    @Override // bc.i
    public void accept(Object obj, Object obj2) {
        h hVar = (h) obj2;
        ec.b bVar = (ec.b) ((ec.a) obj).m();
        zab zabVar = (zab) this.f2478d;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(bVar.f5252f);
        int i10 = mc.b.f16672a;
        parcelObtain.writeInt(1);
        zabVar.writeToParcel(parcelObtain, 0);
        try {
            bVar.f5251e.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            hVar.a(null);
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }

    public void b(int i10, boolean z10) {
        o oVar = (o) this.f2478d;
        if (z10) {
            oVar.a(i10);
        } else {
            oVar.getClass();
        }
    }

    public a c() {
        d8.c cVarH;
        d8.a aVar = (d8.a) this.f2478d;
        f fVar = (f) aVar.f7150d;
        synchronized (fVar) {
            aVar.c(true);
            cVarH = fVar.h(((d8.b) aVar.f7149c).f7151a);
        }
        if (cVarH != null) {
            return new a(1, cVarH);
        }
        return null;
    }

    @Override // u3.n
    public h1 c0(View view, h1 h1Var) {
        AppBarLayout appBarLayout = (AppBarLayout) this.f2478d;
        h1 h1Var2 = appBarLayout.getFitsSystemWindows() ? h1Var : null;
        if (!Objects.equals(appBarLayout.B, h1Var2)) {
            appBarLayout.B = h1Var2;
            appBarLayout.setWillNotDraw(!(appBarLayout.S != null && appBarLayout.getTopInset() > 0));
            appBarLayout.requestLayout();
        }
        return h1Var;
    }

    @Override // h7.y1
    public int d(View view) {
        return (view.getLeft() - ((z0) view.getLayoutParams()).f10293b.left) - ((ViewGroup.MarginLayoutParams) ((z0) view.getLayoutParams())).leftMargin;
    }

    @Override // h7.y1
    public int e() {
        return ((y0) this.f2478d).E();
    }

    @Override // h7.y1
    public int h() {
        y0 y0Var = (y0) this.f2478d;
        return y0Var.f10284n - y0Var.F();
    }

    public File i(String str) {
        File file = new File(u(), g(str, b.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(u(), g(str, b.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(u(), g(str, b.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    public boolean j(hk.h hVar) {
        l.e(hVar, "task");
        Iterator it = hVar.f10810g.iterator();
        while (it.hasNext()) {
            String strF = ((vj.b) it.next()).f();
            ((m) this.f2478d).getClass();
            l.e(strF, "jobName");
            List listI = strF.equals("VIDEO") ? e5.I(ej.b.EXOPLAYER, ej.c.MEDIA3) : w.f16945a;
            if (!listI.isEmpty()) {
                if (listI.isEmpty()) {
                    return false;
                }
                Iterator it2 = listI.iterator();
                while (it2.hasNext()) {
                    if (l((ej.a) it2.next())) {
                        break;
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // h7.y1
    public View k(int i10) {
        return ((y0) this.f2478d).u(i10);
    }

    @Override // gt.n
    public void lock() {
        ((ReentrantLock) this.f2478d).lock();
    }

    @Override // h7.y1
    public int m(View view) {
        return view.getRight() + ((z0) view.getLayoutParams()).f10293b.right + ((ViewGroup.MarginLayoutParams) ((z0) view.getLayoutParams())).rightMargin;
    }

    public void p(View view, int i10, boolean z10) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.f2478d).notifyViewVisibilityChanged(view, i10, z10);
        }
    }

    @Override // r5.i
    public j q(k kVar, long j, long j7, IOException iOException, int i10) {
        switch (this.f2477a) {
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                ((g5.f) this.f2478d).f9352a.onUtcTimestampResolutionError(iOException);
                return r5.n.f21248x;
            default:
                return ((androidx.media3.exoplayer.dash.DashMediaSource) this.f2478d).onUtcTimestampLoadError((q) kVar, j, j7, iOException);
        }
    }

    @Override // r5.i
    public void r(k kVar, long j, long j7) {
        boolean z10;
        switch (this.f2477a) {
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                g5.f fVar = (g5.f) this.f2478d;
                synchronized (androidx.media3.exoplayer.util.c.f1938b) {
                    z10 = androidx.media3.exoplayer.util.c.f1939c;
                }
                if (z10) {
                    fVar.a();
                    return;
                } else {
                    fVar.f9352a.onUtcTimestampResolutionError(new IOException(new ConcurrentModificationException()));
                    return;
                }
            default:
                ((androidx.media3.exoplayer.dash.DashMediaSource) this.f2478d).onUtcTimestampLoadCompleted((q) kVar, j, j7);
                return;
        }
    }

    @Override // r5.i
    public void s(k kVar, long j, long j7, boolean z10) {
        switch (this.f2477a) {
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                break;
            default:
                ((androidx.media3.exoplayer.dash.DashMediaSource) this.f2478d).onLoadCanceled((q) kVar, j, j7);
                break;
        }
    }

    public File u() {
        File file = new File(((io.sentry.android.core.l) this.f2478d).f11697d.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // gt.n
    public void unlock() {
        ((ReentrantLock) this.f2478d).unlock();
    }

    public void v(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f2478d;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    public File w(String str, InputStream inputStream, b bVar) {
        File file = new File(u(), g(str, bVar, true));
        try {
            FileOutputStream fileOutputStreamK = xu.l.k(new FileOutputStream(file), file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 == -1) {
                        fileOutputStreamK.flush();
                        fileOutputStreamK.close();
                        return file;
                    }
                    fileOutputStreamK.write(bArr, 0, i10);
                }
            } catch (Throwable th2) {
                fileOutputStreamK.close();
                throw th2;
            }
        } finally {
            inputStream.close();
        }
    }

    public /* synthetic */ c(int i10, boolean z10) {
        this.f2477a = i10;
    }

    public c(m mVar) {
        this.f2477a = 18;
        l.e(mVar, "dependencyFactory");
        this.f2478d = mVar;
    }

    public c(int i10) {
        this.f2477a = i10;
        switch (i10) {
            case 13:
                this.f2478d = new AtomicInteger(0);
                break;
            case 14:
            default:
                this.f2478d = new o(1);
                break;
            case 15:
                this.f2478d = new Region();
                break;
        }
    }

    private final void t(k kVar, long j, long j7, boolean z10) {
    }
}
