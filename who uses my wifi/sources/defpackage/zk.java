package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zk extends ContentObserver {
    public final /* synthetic */ zy0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk(zy0 zy0Var) {
        super(new Handler());
        this.a = zy0Var;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        zy0 zy0Var = this.a;
        if (!zy0Var.g || (cursor = zy0Var.h) == null || cursor.isClosed()) {
            return;
        }
        zy0Var.f = zy0Var.h.requery();
    }
}
