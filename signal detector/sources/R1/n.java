package r1;

import android.content.Context;
import android.net.Uri;
import m1.AbstractC2652a;
import m1.C2653b;

/* loaded from: classes.dex */
public final class n implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23364a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f23365b;

    public n(Context context, int i) {
        this.f23364a = i;
        switch (i) {
            case 1:
                this.f23365b = context.getApplicationContext();
                break;
            case 2:
                this.f23365b = context.getApplicationContext();
                break;
            default:
                this.f23365b = context;
                break;
        }
    }

    @Override // r1.r
    public final q a(Object obj, int i, int i3, l1.h hVar) {
        Long l2;
        switch (this.f23364a) {
            case 0:
                Uri uri = (Uri) obj;
                return new q(new G1.b(uri), new m(this.f23365b, 0, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || i > 512 || i3 > 384) {
                    return null;
                }
                G1.b bVar = new G1.b(uri2);
                Context context = this.f23365b;
                return new q(bVar, m1.c.d(context, uri2, new C2653b(context.getContentResolver(), 0)));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || i > 512 || i3 > 384 || (l2 = (Long) hVar.c(u1.E.f23717d)) == null || l2.longValue() != -1) {
                    return null;
                }
                G1.b bVar2 = new G1.b(uri3);
                Context context2 = this.f23365b;
                return new q(bVar2, m1.c.d(context2, uri3, new C2653b(context2.getContentResolver(), 1)));
        }
    }

    @Override // r1.r
    public final boolean b(Object obj) {
        switch (this.f23364a) {
            case 0:
                return AbstractC2652a.a((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return AbstractC2652a.a(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return AbstractC2652a.a(uri2) && uri2.getPathSegments().contains("video");
        }
    }
}
