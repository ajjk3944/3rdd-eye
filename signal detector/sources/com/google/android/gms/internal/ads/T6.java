package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class T6 implements InterfaceC0908ax {

    /* renamed from: a, reason: collision with root package name */
    public final Ew f11341a;

    /* renamed from: b, reason: collision with root package name */
    public final C1431kf f11342b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0919b7 f11343c;

    /* renamed from: d, reason: collision with root package name */
    public final S6 f11344d;

    /* renamed from: e, reason: collision with root package name */
    public final L6 f11345e;

    /* renamed from: f, reason: collision with root package name */
    public final C1028d7 f11346f;

    /* renamed from: g, reason: collision with root package name */
    public final C1453l0 f11347g;

    /* renamed from: h, reason: collision with root package name */
    public final F3 f11348h;

    public T6(Ew ew, C1431kf c1431kf, ViewOnAttachStateChangeListenerC0919b7 viewOnAttachStateChangeListenerC0919b7, S6 s6, L6 l6, C1028d7 c1028d7, C1453l0 c1453l0, F3 f32) {
        this.f11341a = ew;
        this.f11342b = c1431kf;
        this.f11343c = viewOnAttachStateChangeListenerC0919b7;
        this.f11344d = s6;
        this.f11345e = l6;
        this.f11346f = c1028d7;
        this.f11347g = c1453l0;
        this.f11348h = f32;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x011d A[Catch: all -> 0x00fd, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {all -> 0x00fd, blocks: (B:12:0x00ec, B:14:0x00f2, B:16:0x00f9, B:20:0x00ff, B:22:0x010a, B:24:0x010e, B:26:0x0119, B:28:0x011d), top: B:41:0x00ec }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.HashMap a() {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.T6.a():java.util.HashMap");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0908ax
    public final HashMap b() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0908ax
    public final HashMap c() {
        return a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0908ax
    public final HashMap f() {
        HashMap mapA = a();
        F3 f32 = this.f11348h;
        if (f32 != null) {
            List list = f32.f8064a;
            f32.f8064a = Collections.EMPTY_LIST;
            mapA.put("vst", list);
        }
        return mapA;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0908ax
    public final HashMap m() {
        HashMap mapA = a();
        ViewOnAttachStateChangeListenerC0919b7 viewOnAttachStateChangeListenerC0919b7 = this.f11343c;
        if (viewOnAttachStateChangeListenerC0919b7.f13323l <= -2) {
            WeakReference weakReference = viewOnAttachStateChangeListenerC0919b7.f13320h;
            if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                viewOnAttachStateChangeListenerC0919b7.f13323l = -3L;
            }
        }
        mapA.put("lts", Long.valueOf(viewOnAttachStateChangeListenerC0919b7.f13323l));
        return mapA;
    }
}
