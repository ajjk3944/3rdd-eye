package com.staircase3.opensignal.goldstar.videotest.result;

import al.a;
import android.content.pm.PackageManager;
import br.l;
import com.staircase3.opensignal.goldstar.persistence.VideoTestResult;
import fl.b;
import i.j;
import io.sentry.t;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import nm.e;
import om.f;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/staircase3/opensignal/goldstar/videotest/result/VideoResultActivity;", "Li/j;", "", "<init>", "()V", "openSignal_externalRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VideoResultActivity extends j {

    /* renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ int f6101d0 = 0;
    public a T;
    public t U;
    public e V;
    public t W;
    public f X;
    public b Y;
    public final kn.a Z = new kn.a(1, this);

    /* renamed from: a0, reason: collision with root package name */
    public final Object f6102a0;

    /* renamed from: b0, reason: collision with root package name */
    public final Object f6103b0;

    /* renamed from: c0, reason: collision with root package name */
    public VideoTestResult f6104c0;

    public VideoResultActivity() {
        lq.j jVar = lq.j.SYNCHRONIZED;
        this.f6102a0 = kc.f.E(jVar, new mm.a(this, 0));
        this.f6103b0 = kc.f.E(jVar, new mm.a(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0270  */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, lq.h] */
    @Override // i.j, c.l, g3.g, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r24) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.util.MissingResourceException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.staircase3.opensignal.goldstar.videotest.result.VideoResultActivity.onCreate(android.os.Bundle):void");
    }

    @Override // i.j, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        super.onStart();
        b bVar = this.Y;
        if (bVar != null) {
            bVar.d(this, this.Z);
        } else {
            l.l("networkUiStateDataSource");
            throw null;
        }
    }

    @Override // i.j, android.app.Activity
    public final void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onStop();
        b bVar = this.Y;
        if (bVar != null) {
            bVar.i(this);
        } else {
            l.l("networkUiStateDataSource");
            throw null;
        }
    }
}
