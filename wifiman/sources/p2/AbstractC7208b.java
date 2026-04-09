package p2;

import Yg.J;
import Zg.AbstractC3689v;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import jh.AbstractC6329b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import m2.q;

/* renamed from: p2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7208b {
    public static final void a(SupportSQLiteDatabase db2) {
        AbstractC6492s.i(db2, "db");
        List listC = AbstractC3689v.c();
        Cursor cursorQuery = db2.query("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorQuery.moveToNext()) {
            try {
                listC.add(cursorQuery.getString(0));
            } finally {
            }
        }
        J j10 = J.f24997a;
        AbstractC6329b.a(cursorQuery, null);
        for (String triggerName : AbstractC3689v.a(listC)) {
            AbstractC6492s.h(triggerName, "triggerName");
            if (t.P(triggerName, "room_fts_content_sync_", false, 2, null)) {
                db2.execSQL("DROP TRIGGER IF EXISTS " + triggerName);
            }
        }
    }

    public static final Cursor b(q db2, SupportSQLiteQuery sqLiteQuery, boolean z10, CancellationSignal cancellationSignal) {
        AbstractC6492s.i(db2, "db");
        AbstractC6492s.i(sqLiteQuery, "sqLiteQuery");
        Cursor cursorY = db2.y(sqLiteQuery, cancellationSignal);
        if (!z10 || !(cursorY instanceof AbstractWindowedCursor)) {
            return cursorY;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorY;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? AbstractC7207a.a(cursorY) : cursorY;
    }

    public static final int c(File databaseFile) {
        AbstractC6492s.i(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i10 = byteBufferAllocate.getInt();
            AbstractC6329b.a(channel, null);
            return i10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC6329b.a(channel, th2);
                throw th3;
            }
        }
    }
}
