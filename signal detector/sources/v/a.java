package V;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import o.V0;

/* loaded from: classes.dex */
public final class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V0 f3786a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(V0 v0) {
        super(new Handler());
        this.f3786a = v0;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z6) {
        Cursor cursor;
        V0 v0 = this.f3786a;
        if (!v0.f3790b || (cursor = v0.f3791c) == null || cursor.isClosed()) {
            return;
        }
        v0.f3789a = v0.f3791c.requery();
    }
}
