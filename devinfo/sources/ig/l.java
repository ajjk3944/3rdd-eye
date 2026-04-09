package ig;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import b5.i0;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.internal.play_billing.m1;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import p.r3;
import w4.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25989a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25990b;

    public /* synthetic */ l(int i4, Object obj) {
        this.f25989a = i4;
        this.f25990b = obj;
    }

    private final void a() {
        i0 i0Var = (i0) this.f25990b;
        Map mapA = null;
        ((AtomicReference) i0Var.f1822c).set(null);
        synchronized (i0Var) {
            try {
                if (((AtomicMarkableReference) i0Var.f1821b).isMarked()) {
                    mapA = ((le.e) ((AtomicMarkableReference) i0Var.f1821b).getReference()).a();
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) i0Var.f1821b;
                    atomicMarkableReference.set((le.e) atomicMarkableReference.getReference(), false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (mapA != null) {
            r3 r3Var = (r3) i0Var.f1823d;
            ((le.h) r3Var.f30844a).h((String) r3Var.f30846c, mapA, i0Var.f1820a);
        }
    }

    private final void b() {
        n nVar = (n) this.f25990b;
        synchronized (nVar.f36448d) {
            try {
                if (nVar.f36451h == null) {
                    return;
                }
                try {
                    b4.k kVarD = nVar.d();
                    int i4 = kVarD.f1699f;
                    if (i4 == 2) {
                        synchronized (nVar.f36448d) {
                        }
                    }
                    if (i4 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i4 + ")");
                    }
                    try {
                        Method method = a4.m.f199b;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        j6.i iVar = nVar.f36447c;
                        Context context = nVar.f36445a;
                        iVar.getClass();
                        b4.k[] kVarArr = {kVarD};
                        wd.b bVar = v3.e.f35800a;
                        Trace.beginSection(z3.w("TypefaceCompat.createFromFontInfo"));
                        try {
                            Typeface typefaceI = v3.e.f35800a.i(context, kVarArr, 0);
                            Trace.endSection();
                            MappedByteBuffer mappedByteBufferV = a.a.v(nVar.f36445a, kVarD.f1694a);
                            if (mappedByteBufferV == null || typefaceI == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                se.b bVar2 = new se.b(typefaceI, jm.a.u(mappedByteBufferV));
                                Trace.endSection();
                                synchronized (nVar.f36448d) {
                                    try {
                                        m1 m1Var = nVar.f36451h;
                                        if (m1Var != null) {
                                            m1Var.z(bVar2);
                                        }
                                    } finally {
                                    }
                                }
                                nVar.a();
                            } finally {
                                Method method2 = a4.m.f199b;
                            }
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (Throwable th3) {
                    synchronized (nVar.f36448d) {
                        try {
                            m1 m1Var2 = nVar.f36451h;
                            if (m1Var2 != null) {
                                m1Var2.y(th3);
                            }
                            nVar.a();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0354 A[PHI: r26 r35
  0x0354: PHI (r26v7 long) = (r26v1 long), (r26v8 long) binds: [B:154:0x0472, B:119:0x0350] A[DONT_GENERATE, DONT_INLINE]
  0x0354: PHI (r35v7 long) = (r35v3 long), (r35v8 long) binds: [B:154:0x0472, B:119:0x0350] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0474  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 2330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ig.l.run():void");
    }
}
