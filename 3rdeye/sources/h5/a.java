package H5;

import A2.l;
import I5.c;
import I5.i;
import I5.j;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2028a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager f2029b;

    /* renamed from: c, reason: collision with root package name */
    public final l f2030c;

    /* renamed from: d, reason: collision with root package name */
    public final j f2031d;

    /* renamed from: e, reason: collision with root package name */
    public float f2032e;

    public a(Handler handler, Context context, l lVar, j jVar) {
        super(handler);
        this.f2028a = context;
        this.f2029b = (AudioManager) context.getSystemService("audio");
        this.f2030c = lVar;
        this.f2031d = jVar;
    }

    public final float a() {
        AudioManager audioManager = this.f2029b;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        this.f2030c.getClass();
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f10 = streamVolume / streamMaxVolume;
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }

    public final void b() {
        float f10 = this.f2032e;
        j jVar = this.f2031d;
        jVar.f2511a = f10;
        if (jVar.f2514d == null) {
            jVar.f2514d = c.f2496c;
        }
        Iterator it = Collections.unmodifiableCollection(jVar.f2514d.f2498b).iterator();
        while (it.hasNext()) {
            K5.a aVar = ((G5.l) it.next()).f1927e;
            i.f2509a.a(aVar.f(), "setDeviceVolume", Float.valueOf(f10), aVar.f3149a);
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (fA != this.f2032e) {
            this.f2032e = fA;
            b();
        }
    }
}
