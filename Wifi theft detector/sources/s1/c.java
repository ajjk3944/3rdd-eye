package s1;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class c {
    public static void a(u1.b bVar) {
        int i10;
        ArrayList arrayList = new ArrayList();
        Cursor cursorO = bVar.O("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (true) {
            try {
                i10 = 0;
                if (!cursorO.moveToNext()) {
                    break;
                } else {
                    arrayList.add(cursorO.getString(0));
                }
            } catch (Throwable th) {
                cursorO.close();
                throw th;
            }
        }
        cursorO.close();
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str = (String) obj;
            if (str.startsWith("room_fts_content_sync_")) {
                bVar.y("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static Cursor b(RoomDatabase roomDatabase, u1.e eVar, boolean z10, CancellationSignal cancellationSignal) {
        Cursor cursorQ = roomDatabase.q(eVar, cancellationSignal);
        if (!z10 || !(cursorQ instanceof AbstractWindowedCursor)) {
            return cursorQ;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQ;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? b.a(abstractWindowedCursor) : cursorQ;
    }

    public static int c(File file) throws Throwable {
        Throwable th;
        FileChannel fileChannel = null;
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            try {
                channel.tryLock(60L, 4L, true);
                channel.position(60L);
                if (channel.read(byteBufferAllocate) != 4) {
                    throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
                }
                byteBufferAllocate.rewind();
                int i10 = byteBufferAllocate.getInt();
                channel.close();
                return i10;
            } catch (Throwable th2) {
                th = th2;
                fileChannel = channel;
                if (fileChannel == null) {
                    throw th;
                }
                fileChannel.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
