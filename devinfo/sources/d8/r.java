package d8;

import android.content.Context;
import android.net.Uri;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22043a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f22044b;

    public r(Context context, int i4) {
        this.f22043a = i4;
        switch (i4) {
            case 1:
                this.f22044b = context.getApplicationContext();
                break;
            case 2:
                this.f22044b = context.getApplicationContext();
                break;
            default:
                this.f22044b = context;
                break;
        }
    }

    @Override // d8.v
    public final u a(Object obj, int i4, int i10, x7.h hVar) {
        Long l10;
        switch (this.f22043a) {
            case 0:
                Uri uri = (Uri) obj;
                return new u(new s8.d(uri), new q(0, this.f22044b, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i4 == Integer.MIN_VALUE || i10 == Integer.MIN_VALUE || i4 > 512 || i10 > 384) {
                    return null;
                }
                s8.d dVar = new s8.d(uri2);
                Context context = this.f22044b;
                return new u(dVar, e.c(context, uri2, new y7.a(context.getContentResolver(), 0)));
            default:
                Uri uri3 = (Uri) obj;
                if (i4 == Integer.MIN_VALUE || i10 == Integer.MIN_VALUE || i4 > 512 || i10 > 384 || (l10 = (Long) hVar.c(g8.f0.f24566d)) == null || l10.longValue() != -1) {
                    return null;
                }
                s8.d dVar2 = new s8.d(uri3);
                Context context2 = this.f22044b;
                return new u(dVar2, e.c(context2, uri3, new y7.a(context2.getContentResolver(), 1)));
        }
    }

    @Override // d8.v
    public final boolean b(Object obj) {
        switch (this.f22043a) {
            case 0:
                return f4.d.g((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return f4.d.g(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return f4.d.g(uri2) && uri2.getPathSegments().contains("video");
        }
    }
}
