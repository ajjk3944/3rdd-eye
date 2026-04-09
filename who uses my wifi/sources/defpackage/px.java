package defpackage;

import android.database.sqlite.SQLiteStatement;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class px extends lx {
    public final SQLiteStatement i;

    public px(SQLiteStatement sQLiteStatement) {
        super(2, sQLiteStatement);
        this.i = sQLiteStatement;
    }

    public final void t() {
        this.i.executeUpdateDelete();
    }
}
