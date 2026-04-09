package K6;

import H6.C0672i;
import H6.C0675l;
import N7.C1363t5;
import N7.EnumC1305p2;
import N7.EnumC1319q2;
import N7.K2;
import N7.S2;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.view.View;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.lang.ref.WeakReference;
import w6.C5738b;

/* compiled from: DivGifImageBinder.kt */
/* renamed from: K6.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0738k0 extends H6.B {

    /* renamed from: c, reason: collision with root package name */
    public final D9.G f3509c;

    /* renamed from: d, reason: collision with root package name */
    public final H6.x f3510d;

    /* renamed from: e, reason: collision with root package name */
    public final Q6.d f3511e;

    /* compiled from: DivGifImageBinder.kt */
    /* renamed from: K6.k0$a */
    public static final class a extends AsyncTask<Void, Void, Drawable> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<O6.j> f3512a;

        /* renamed from: b, reason: collision with root package name */
        public final C5738b f3513b;

        public a(WeakReference<O6.j> weakReference, C5738b c5738b) {
            this.f3512a = weakReference;
            this.f3513b = c5738b;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0030 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final android.graphics.drawable.Drawable doInBackground(java.lang.Void[] r3) {
            /*
                r2 = this;
                w6.b r0 = r2.f3513b
                java.lang.Void[] r3 = (java.lang.Void[]) r3
                java.lang.String r1 = "params"
                kotlin.jvm.internal.l.f(r3, r1)
                r0.getClass()     // Catch: java.lang.IllegalStateException -> L14 java.io.IOException -> L1c
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.IllegalStateException -> L14 java.io.IOException -> L1c
                java.lang.String r1 = "no bytes stored in cached bitmap"
                r3.<init>(r1)     // Catch: java.lang.IllegalStateException -> L14 java.io.IOException -> L1c
                throw r3     // Catch: java.lang.IllegalStateException -> L14 java.io.IOException -> L1c
            L14:
                int r3 = h7.C4421b.f38269a
                C7.a r3 = C7.a.ERROR
                h7.C4421b.a(r3)
                goto L23
            L1c:
                int r3 = h7.C4421b.f38269a
                C7.a r3 = C7.a.ERROR
                h7.C4421b.a(r3)
            L23:
                android.net.Uri r3 = r0.f47496b
                r0 = 0
                if (r3 == 0) goto L2d
                java.lang.String r3 = r3.getPath()
                goto L2e
            L2d:
                r3 = r0
            L2e:
                if (r3 == 0) goto L42
                java.io.File r1 = new java.io.File     // Catch: java.io.IOException -> L3a
                r1.<init>(r3)     // Catch: java.io.IOException -> L3a
                android.graphics.ImageDecoder$Source r3 = J0.d.e(r1)     // Catch: java.io.IOException -> L3a
                goto L48
            L3a:
                int r3 = h7.C4421b.f38269a
                C7.a r3 = C7.a.ERROR
                h7.C4421b.a(r3)
                goto L47
            L42:
                C7.a r3 = C7.a.ERROR
                h7.C4421b.a(r3)
            L47:
                r3 = r0
            L48:
                if (r3 == 0) goto L56
                android.graphics.drawable.Drawable r0 = J0.f.g(r3)     // Catch: java.io.IOException -> L4f
                goto L56
            L4f:
                int r3 = h7.C4421b.f38269a
                C7.a r3 = C7.a.ERROR
                h7.C4421b.a(r3)
            L56:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: K6.C0738k0.a.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Drawable drawable) {
            Drawable drawable2 = drawable;
            super.onPostExecute(drawable2);
            WeakReference<O6.j> weakReference = this.f3512a;
            if (drawable2 == null || !J0.e.l(drawable2)) {
                O6.j jVar = weakReference.get();
                if (jVar != null) {
                    jVar.setImage(this.f3513b.f47495a);
                }
            } else {
                O6.j jVar2 = weakReference.get();
                if (jVar2 != null) {
                    jVar2.setImage(drawable2);
                }
            }
            O6.j jVar3 = weakReference.get();
            if (jVar3 != null) {
                jVar3.setTag(R.id.image_loaded_flag, Boolean.TRUE);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0738k0(D d10, D9.G imageLoader, H6.x xVar, Q6.d dVar) {
        super(d10);
        kotlin.jvm.internal.l.f(imageLoader, "imageLoader");
        this.f3509c = imageLoader;
        this.f3510d = xVar;
        this.f3511e = dVar;
    }

    @Override // H6.B
    public final void d(View view, C0672i c0672i, S2 s22, S2 s23) {
        O6.j jVar = (O6.j) view;
        C1363t5 c1363t5 = (C1363t5) s22;
        C1363t5 c1363t52 = (C1363t5) s23;
        kotlin.jvm.internal.l.f(jVar, "<this>");
        C0675l c0675l = c0672i.f2146a;
        Q6.c cVarA = this.f3511e.a(c0675l.getDivData(), c0675l.getDataTag());
        C0713c.d(jVar, c0672i, c1363t5.f9251b, c1363t5.f9253d, c1363t5.f9225A, c1363t5.f9265q, c1363t5.f9272x, c1363t5.f9271w, c1363t5.f9231G, c1363t5.f9230F, c1363t5.f9252c, c1363t5.f9250a, c1363t5.f9260l);
        K2 k22 = c1363t52 != null ? c1363t52.i : null;
        K2 k23 = c1363t5.i;
        A7.d dVar = c0672i.f2147b;
        C0713c.s(jVar, k23, k22, dVar);
        jVar.b(c1363t5.f9235K.e(dVar, new C0746n0(jVar)));
        A7.b<EnumC1305p2> bVar = c1363t5.f9262n;
        EnumC1305p2 enumC1305p2A = bVar.a(dVar);
        A7.b<EnumC1319q2> bVar2 = c1363t5.f9263o;
        jVar.setGravity(C0713c.F(enumC1305p2A, bVar2.a(dVar)));
        C0768z c0768z = new C0768z(this, jVar, dVar, bVar, bVar2, 1);
        jVar.b(bVar.d(dVar, c0768z));
        jVar.b(bVar2.d(dVar, c0768z));
        jVar.b(c1363t5.f9269u.e(dVar, new H6.W(this, jVar, c0675l, dVar, c1363t5, cVarA)));
    }
}
