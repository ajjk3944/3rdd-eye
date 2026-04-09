package q1;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/* loaded from: classes.dex */
public class e implements u1.c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23991a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23992b;

    /* renamed from: c, reason: collision with root package name */
    public final File f23993c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23994d;

    /* renamed from: e, reason: collision with root package name */
    public final u1.c f23995e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.room.a f23996f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23997g;

    public e(Context context, String str, File file, int i10, u1.c cVar) {
        this.f23991a = context;
        this.f23992b = str;
        this.f23993c = file;
        this.f23994d = i10;
        this.f23995e = cVar;
    }

    public final void a(File file) throws Throwable {
        ReadableByteChannel channel;
        if (this.f23992b != null) {
            channel = Channels.newChannel(this.f23991a.getAssets().open(this.f23992b));
        } else {
            if (this.f23993c == null) {
                throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
            }
            channel = new FileInputStream(this.f23993c).getChannel();
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f23991a.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        s1.d.a(channel, new FileOutputStream(fileCreateTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        if (fileCreateTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    public void b(androidx.room.a aVar) {
        this.f23996f = aVar;
    }

    @Override // u1.c, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f23995e.close();
        this.f23997g = false;
    }

    public final void d() throws IOException {
        String databaseName = getDatabaseName();
        File databasePath = this.f23991a.getDatabasePath(databaseName);
        androidx.room.a aVar = this.f23996f;
        s1.a aVar2 = new s1.a(databaseName, this.f23991a.getFilesDir(), aVar == null || aVar.f4066j);
        try {
            aVar2.b();
            if (!databasePath.exists()) {
                try {
                    a(databasePath);
                    aVar2.c();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            }
            if (this.f23996f == null) {
                aVar2.c();
                return;
            }
            try {
                int iC = s1.c.c(databasePath);
                int i10 = this.f23994d;
                if (iC == i10) {
                    aVar2.c();
                    return;
                }
                if (this.f23996f.a(iC, i10)) {
                    aVar2.c();
                    return;
                }
                if (this.f23991a.deleteDatabase(databaseName)) {
                    try {
                        a(databasePath);
                    } catch (IOException e11) {
                        Log.w("ROOM", "Unable to copy database file.", e11);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                aVar2.c();
                return;
            } catch (IOException e12) {
                Log.w("ROOM", "Unable to read database version.", e12);
                aVar2.c();
                return;
            }
        } catch (Throwable th) {
            aVar2.c();
            throw th;
        }
        aVar2.c();
        throw th;
    }

    @Override // u1.c
    public String getDatabaseName() {
        return this.f23995e.getDatabaseName();
    }

    @Override // u1.c
    public synchronized u1.b getWritableDatabase() {
        try {
            if (!this.f23997g) {
                d();
                this.f23997g = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f23995e.getWritableDatabase();
    }

    @Override // u1.c
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f23995e.setWriteAheadLoggingEnabled(z10);
    }
}
