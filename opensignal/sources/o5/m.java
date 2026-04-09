package o5;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class m implements y {

    /* renamed from: a, reason: collision with root package name */
    public final cj.a f18987a;

    /* renamed from: b, reason: collision with root package name */
    public final bm.e f18988b;

    /* renamed from: c, reason: collision with root package name */
    public final long f18989c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18990d;

    /* renamed from: e, reason: collision with root package name */
    public final long f18991e;

    /* renamed from: f, reason: collision with root package name */
    public final float f18992f;

    /* renamed from: g, reason: collision with root package name */
    public final float f18993g;

    public m(Context context, u5.i iVar) {
        bm.e eVar = new bm.e(context, 4);
        this.f18988b = eVar;
        cj.a aVar = new cj.a(iVar);
        this.f18987a = aVar;
        if (eVar != ((bm.e) aVar.f3978y)) {
            aVar.f3978y = eVar;
            ((HashMap) aVar.f3975g).clear();
            ((HashMap) aVar.f3977x).clear();
        }
        this.f18989c = -9223372036854775807L;
        this.f18990d = -9223372036854775807L;
        this.f18991e = -9223372036854775807L;
        this.f18992f = -3.4028235E38f;
        this.f18993g = -3.4028235E38f;
    }

    public static y a(Class cls, b5.g gVar) {
        try {
            return (y) cls.getConstructor(b5.g.class).newInstance(gVar);
        } catch (Exception e4) {
            throw new IllegalStateException(e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    @Override // o5.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o5.b0 createMediaSource(androidx.media3.common.e0 r14) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.m.createMediaSource(androidx.media3.common.e0):o5.b0");
    }
}
