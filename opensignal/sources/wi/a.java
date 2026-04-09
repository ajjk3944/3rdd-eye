package wi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ch.l;
import ch.n;

/* loaded from: classes.dex */
public abstract class a extends BroadcastReceiver {
    private final l _serviceLocator;
    private final boolean isExported;

    public a() {
        this.isExported = true;
        this._serviceLocator = l.f3962t5;
    }

    public final l getServiceLocator() {
        return this._serviceLocator;
    }

    public boolean isExported() {
        return this.isExported;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        br.l.e(context, "context");
        br.l.e(intent, "intent");
        n.b("BaseBroadcastReceiver", "onReceive() on thread: " + Thread.currentThread().getName() + "(id: " + Thread.currentThread().getId() + ") intent: " + intent);
        l lVar = l.f3962t5;
        Context applicationContext = context.getApplicationContext();
        br.l.d(applicationContext, "getApplicationContext(...)");
        if (lVar.f3775a == null) {
            lVar.f3775a = applicationContext;
        }
        this._serviceLocator.I().execute(new ch.a(this, context, intent, 18));
    }

    public abstract void onReceiveIntent(Context context, Intent intent);

    public a(l lVar) {
        this.isExported = true;
        this._serviceLocator = lVar;
    }
}
