package v;

import android.hardware.camera2.TotalCaptureResult;
import u.C5616a;
import v.C5658m;

/* compiled from: ZoomControl.java */
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final C5658m f46940a;

    /* renamed from: b, reason: collision with root package name */
    public final x0 f46941b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.E<Object> f46942c;

    /* renamed from: d, reason: collision with root package name */
    public final b f46943d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f46944e = false;

    /* renamed from: f, reason: collision with root package name */
    public final a f46945f = new a();

    /* compiled from: ZoomControl.java */
    public class a implements C5658m.c {
        public a() {
        }

        @Override // v.C5658m.c
        public final boolean a(TotalCaptureResult totalCaptureResult) {
            w0.this.f46943d.a(totalCaptureResult);
            return false;
        }
    }

    /* compiled from: ZoomControl.java */
    public interface b {
        void a(TotalCaptureResult totalCaptureResult);

        float b();

        float c();

        void d(C5616a.C0536a c0536a);

        void e();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public w0(v.C5658m r5, w.C5698l r6, H.g r7) throws java.lang.IllegalArgumentException {
        /*
            r4 = this;
            r4.<init>()
            r7 = 0
            r4.f46944e = r7
            v.w0$a r7 = new v.w0$a
            r7.<init>()
            r4.f46945f = r7
            r4.f46940a = r5
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r7 < r0) goto L31
            android.hardware.camera2.CameraCharacteristics$Key r7 = I0.m.d()     // Catch: java.lang.AssertionError -> L20
            java.lang.Object r7 = r6.a(r7)     // Catch: java.lang.AssertionError -> L20
            android.util.Range r7 = (android.util.Range) r7     // Catch: java.lang.AssertionError -> L20
            goto L29
        L20:
            r7 = move-exception
            java.lang.String r0 = "ZoomControl"
            java.lang.String r1 = "AssertionError, fail to get camera characteristic."
            C.S.h(r0, r1, r7)
            r7 = 0
        L29:
            if (r7 == 0) goto L31
            v.a r7 = new v.a
            r7.<init>(r6)
            goto L36
        L31:
            v.b0 r7 = new v.b0
            r7.<init>(r6)
        L36:
            r4.f46943d = r7
            v.x0 r6 = new v.x0
            float r0 = r7.b()
            float r7 = r7.c()
            r6.<init>(r0, r7)
            r4.f46941b = r6
            r6.e()
            androidx.lifecycle.E r7 = new androidx.lifecycle.E
            J.b r0 = new J.b
            float r1 = r6.d()
            float r2 = r6.b()
            float r3 = r6.c()
            float r6 = r6.a()
            r0.<init>(r1, r2, r3, r6)
            r7.<init>(r0)
            r4.f46942c = r7
            v.w0$a r6 = r4.f46945f
            r5.l(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.w0.<init>(v.m, w.l, H.g):void");
    }
}
