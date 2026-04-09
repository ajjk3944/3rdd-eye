package c0;

import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h extends ek.i implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2432a;

    /* renamed from: b, reason: collision with root package name */
    public int f2433b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2434c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2435d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, ck.c cVar, int i4) {
        super(2, cVar);
        this.f2432a = i4;
        this.f2435d = obj;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f2432a) {
            case 0:
                h hVar = new h((j) this.f2435d, cVar, 0);
                hVar.f2434c = obj;
                return hVar;
            default:
                h hVar2 = new h((View) this.f2435d, cVar, 1);
                hVar2.f2434c = obj;
                return hVar2;
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2432a) {
            case 0:
                return ((h) create((c2.k0) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            default:
                return ((h) create((uk.h) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00bb -> B:41:0x00be). Please report as a decompilation issue!!! */
    @Override // ek.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
