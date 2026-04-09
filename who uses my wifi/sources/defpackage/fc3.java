package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fc3 extends ContentObserver {
    public final Handler a;
    public final Context b;
    public final AudioManager c;
    public final AtomicReference d;
    public final AtomicBoolean e;
    public final ExecutorService f;
    public final pc3 g;

    public fc3(Handler handler, Context context, pc3 pc3Var) {
        super(handler);
        this.d = new AtomicReference(Float.valueOf(-1.0f));
        this.e = new AtomicBoolean(false);
        this.f = Executors.newSingleThreadExecutor();
        this.a = handler;
        this.b = context;
        this.c = (AudioManager) context.getSystemService("audio");
        this.g = pc3Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (this.e.getAndSet(true)) {
            return;
        }
        this.f.submit(new bs2(25, this));
    }
}
