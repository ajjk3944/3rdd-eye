package q1;

import androidx.room.RoomDatabase;

/* loaded from: classes.dex */
public abstract class a extends g {
    public a(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    public abstract void g(u1.f fVar, Object obj);

    public final void h(Object obj) {
        u1.f fVarA = a();
        try {
            g(fVarA, obj);
            fVarA.H();
        } finally {
            f(fVarA);
        }
    }
}
