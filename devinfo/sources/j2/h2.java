package j2;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.measurement.a4;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h2 extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27175b = 0;

    /* renamed from: c, reason: collision with root package name */
    public Object f27176c;

    /* renamed from: d, reason: collision with root package name */
    public int f27177d;

    /* renamed from: e, reason: collision with root package name */
    public Object f27178e;

    /* renamed from: f, reason: collision with root package name */
    public Object f27179f;
    public Object g;

    /* renamed from: h, reason: collision with root package name */
    public Object f27180h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f27181i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(ContentResolver contentResolver, Uri uri, a4 a4Var, zk.h hVar, Context context, ck.c cVar) {
        super(2, cVar);
        this.f27179f = contentResolver;
        this.g = uri;
        this.f27180h = a4Var;
        this.f27181i = hVar;
        this.j = context;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f27175b) {
            case 0:
                h2 h2Var = new h2((ContentResolver) this.f27179f, (Uri) this.g, (a4) this.f27180h, (zk.h) this.f27181i, (Context) this.j, cVar);
                h2Var.f27176c = obj;
                return h2Var;
            default:
                h2 h2Var2 = new h2((nm.s) this.j, cVar);
                h2Var2.f27181i = obj;
                return h2Var2;
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        al.i iVar = (al.i) obj;
        ck.c cVar = (ck.c) obj2;
        switch (this.f27175b) {
            case 0:
                return ((h2) create(iVar, cVar)).invokeSuspend(yj.u.f37649a);
            default:
                ((h2) create(iVar, cVar)).invokeSuspend(yj.u.f37649a);
                return dk.a.f22275a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x01ae, code lost:
    
        r6 = r17;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Path cross not found for [B:47:0x011b, B:59:0x014c], limit reached: 159 */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0251 A[Catch: all -> 0x0205, TRY_LEAVE, TryCatch #4 {all -> 0x0205, blocks: (B:114:0x01ff, B:125:0x0237, B:129:0x0249, B:131:0x0251, B:121:0x0218, B:124:0x022e), top: B:146:0x01f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c8 A[LOOP:0: B:40:0x00f9->B:96:0x01c8, LOOP_END] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:134:0x0276 -> B:125:0x0237). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x01ad -> B:83:0x01ae). Please report as a decompilation issue!!! */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.h2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(nm.s sVar, ck.c cVar) {
        super(2, cVar);
        this.j = sVar;
    }
}
