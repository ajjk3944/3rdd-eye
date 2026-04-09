package a8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import bu.n;
import com.google.android.gms.internal.measurement.e5;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import mq.o;
import ou.t;
import wt.d0;
import wt.i1;
import wt.w;
import wt.z;

/* loaded from: classes.dex */
public final class l implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f211a;

    /* renamed from: b, reason: collision with root package name */
    public final l8.c f212b;

    /* renamed from: c, reason: collision with root package name */
    public final lq.h f213c;

    /* renamed from: d, reason: collision with root package name */
    public final lq.h f214d;

    /* renamed from: e, reason: collision with root package name */
    public final lq.h f215e;

    /* renamed from: f, reason: collision with root package name */
    public final c f216f;

    /* renamed from: g, reason: collision with root package name */
    public final a f217g;

    /* renamed from: h, reason: collision with root package name */
    public final q8.l f218h;

    /* renamed from: i, reason: collision with root package name */
    public final bu.c f219i;
    public final io.sentry.k j;
    public final a k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f220l;

    public l(Context context, l8.c cVar, lq.h hVar, lq.h hVar2, lq.h hVar3, c cVar2, a aVar, q8.l lVar) {
        this.f211a = context;
        this.f212b = cVar;
        this.f213c = hVar;
        this.f214d = hVar2;
        this.f215e = hVar3;
        this.f216f = cVar2;
        this.f217g = aVar;
        this.f218h = lVar;
        i1 i1VarC = w.c();
        du.f fVar = d0.f24610a;
        this.f219i = w.b(se.b.M(i1VarC, n.f2983a.f25527y).i0(new k(this)));
        q8.n nVar = new q8.n(this);
        io.sentry.k kVar = new io.sentry.k(this, nVar);
        this.j = kVar;
        cj.a aVar2 = new cj.a(aVar);
        aVar2.k(new i8.a(2), t.class);
        int i10 = 5;
        aVar2.k(new i8.a(i10), String.class);
        aVar2.k(new i8.a(1), Uri.class);
        int i11 = 4;
        aVar2.k(new i8.a(i11), Uri.class);
        int i12 = 3;
        aVar2.k(new i8.a(i12), Integer.class);
        int i13 = 0;
        aVar2.k(new i8.a(i13), byte[].class);
        h8.c cVar3 = new h8.c();
        ArrayList arrayList = (ArrayList) aVar2.f3976r;
        arrayList.add(new lq.l(cVar3, Uri.class));
        arrayList.add(new lq.l(new h8.a(lVar.f20744a), File.class));
        aVar2.j(new f8.i(hVar3, hVar2, lVar.f20746c), Uri.class);
        aVar2.j(new f8.a(i10), File.class);
        aVar2.j(new f8.a(i13), Uri.class);
        aVar2.j(new f8.a(i12), Uri.class);
        aVar2.j(new f8.a(6), Uri.class);
        aVar2.j(new f8.a(i11), Drawable.class);
        aVar2.j(new f8.a(1), Bitmap.class);
        aVar2.j(new f8.a(2), ByteBuffer.class);
        c8.d dVar = new c8.d(lVar.f20747d, lVar.f20748e);
        ArrayList arrayList2 = (ArrayList) aVar2.f3978y;
        arrayList2.add(dVar);
        List listR = e5.R((ArrayList) aVar2.f3974d);
        this.k = new a(listR, e5.R((ArrayList) aVar2.f3975g), e5.R(arrayList), e5.R((ArrayList) aVar2.f3977x), e5.R(arrayList2));
        this.f220l = o.F0(listR, new g8.h(this, nVar, kVar));
        new AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4 A[Catch: all -> 0x00e8, TryCatch #5 {all -> 0x00e8, blocks: (B:39:0x00da, B:41:0x00e4, B:44:0x00eb, B:46:0x00f9, B:47:0x00fc, B:34:0x00be, B:36:0x00c4, B:79:0x0195, B:80:0x019c), top: B:99:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9 A[Catch: all -> 0x00e8, TryCatch #5 {all -> 0x00e8, blocks: (B:39:0x00da, B:41:0x00e4, B:44:0x00eb, B:46:0x00f9, B:47:0x00fc, B:34:0x00be, B:36:0x00c4, B:79:0x0195, B:80:0x019c), top: B:99:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0149 A[Catch: all -> 0x0170, TryCatch #0 {all -> 0x0170, blocks: (B:57:0x0143, B:59:0x0149, B:62:0x015b, B:64:0x0165, B:63:0x015f, B:68:0x0172, B:70:0x0176, B:73:0x0185, B:74:0x018a), top: B:92:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0172 A[Catch: all -> 0x0170, TryCatch #0 {all -> 0x0170, blocks: (B:57:0x0143, B:59:0x0149, B:62:0x015b, B:64:0x0165, B:63:0x015f, B:68:0x0172, B:70:0x0176, B:73:0x0185, B:74:0x018a), top: B:92:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a1 A[Catch: all -> 0x01b3, TRY_LEAVE, TryCatch #3 {all -> 0x01b3, blocks: (B:81:0x019d, B:83:0x01a1, B:88:0x01b5, B:89:0x01be), top: B:96:0x019d }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b5 A[Catch: all -> 0x01b3, TRY_ENTER, TryCatch #3 {all -> 0x01b3, blocks: (B:81:0x019d, B:83:0x01a1, B:88:0x01b5, B:89:0x01be), top: B:96:0x019d }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [l8.p] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, l8.j] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [a8.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(a8.l r21, l8.j r22, rq.c r23) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.l.a(a8.l, l8.j, rq.c):java.lang.Object");
    }

    public static void c(l8.f fVar, n8.a aVar, b bVar) {
        l8.j jVar = fVar.f14907b;
        Drawable drawable = fVar.f14906a;
        if (!(aVar instanceof n8.a)) {
            if (aVar != null) {
            }
            bVar.getClass();
            jVar.getClass();
        }
        jVar.f14928g.getClass();
        aVar.onError(drawable);
        bVar.getClass();
        jVar.getClass();
    }

    public final l8.e b(l8.j jVar) {
        w.d(this.f219i, new h(this, jVar, (pq.c) null, 0));
        n8.a aVar = jVar.f14924c;
        if (!(aVar instanceof n8.a)) {
            return new l8.l(1);
        }
        l8.t tVarC = q8.i.c(aVar.getView());
        synchronized (tVarC) {
            com.google.android.exoplayer2.ui.a aVar2 = tVarC.f14978d;
            if (aVar2 != null && br.l.a(Looper.myLooper(), Looper.getMainLooper()) && tVarC.f14981x) {
                tVarC.f14981x = false;
                return aVar2;
            }
            z zVar = tVarC.f14979g;
            if (zVar != null) {
                zVar.h(null);
            }
            tVarC.f14979g = null;
            com.google.android.exoplayer2.ui.a aVar3 = new com.google.android.exoplayer2.ui.a(tVarC.f14977a);
            tVarC.f14978d = aVar3;
            return aVar3;
        }
    }
}
