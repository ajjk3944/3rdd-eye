package m2;

import android.content.Context;
import android.util.Log;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC6492s;
import p2.AbstractC7208b;
import p2.AbstractC7209c;
import t2.C8025a;

/* loaded from: classes.dex */
public final class u implements SupportSQLiteOpenHelper, InterfaceC6749g {

    /* renamed from: a, reason: collision with root package name */
    private final Context f53099a;

    /* renamed from: b, reason: collision with root package name */
    private final String f53100b;

    /* renamed from: c, reason: collision with root package name */
    private final File f53101c;

    /* renamed from: d, reason: collision with root package name */
    private final Callable f53102d;

    /* renamed from: e, reason: collision with root package name */
    private final int f53103e;

    /* renamed from: f, reason: collision with root package name */
    private final SupportSQLiteOpenHelper f53104f;

    /* renamed from: g, reason: collision with root package name */
    private C6748f f53105g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f53106h;

    public u(Context context, String str, File file, Callable callable, int i10, SupportSQLiteOpenHelper delegate) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(delegate, "delegate");
        this.f53099a = context;
        this.f53100b = str;
        this.f53101c = file;
        this.f53102d = callable;
        this.f53103e = i10;
        this.f53104f = delegate;
    }

    private final void g(File file, boolean z10) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.f53100b != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.f53099a.getAssets().open(this.f53100b));
            AbstractC6492s.h(readableByteChannelNewChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.f53101c != null) {
            readableByteChannelNewChannel = new FileInputStream(this.f53101c).getChannel();
            AbstractC6492s.h(readableByteChannelNewChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable callable = this.f53102d;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel((InputStream) callable.call());
                AbstractC6492s.h(readableByteChannelNewChannel, "newChannel(inputStream)");
            } catch (Exception e10) {
                throw new IOException("inputStreamCallable exception on call", e10);
            }
        }
        File intermediateFile = File.createTempFile("room-copy-helper", ".tmp", this.f53099a.getCacheDir());
        intermediateFile.deleteOnExit();
        FileChannel output = new FileOutputStream(intermediateFile).getChannel();
        AbstractC6492s.h(output, "output");
        AbstractC7209c.a(readableByteChannelNewChannel, output);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        AbstractC6492s.h(intermediateFile, "intermediateFile");
        h(intermediateFile, z10);
        if (intermediateFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + intermediateFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private final void h(File file, boolean z10) {
        C6748f c6748f = this.f53105g;
        if (c6748f == null) {
            AbstractC6492s.v("databaseConfiguration");
            c6748f = null;
        }
        c6748f.getClass();
    }

    private final void p(boolean z10) throws IOException {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databaseFile = this.f53099a.getDatabasePath(databaseName);
        C6748f c6748f = this.f53105g;
        C6748f c6748f2 = null;
        if (c6748f == null) {
            AbstractC6492s.v("databaseConfiguration");
            c6748f = null;
        }
        C8025a c8025a = new C8025a(databaseName, this.f53099a.getFilesDir(), c6748f.f53031s);
        try {
            C8025a.c(c8025a, false, 1, null);
            if (!databaseFile.exists()) {
                try {
                    AbstractC6492s.h(databaseFile, "databaseFile");
                    g(databaseFile, z10);
                    c8025a.d();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            }
            try {
                AbstractC6492s.h(databaseFile, "databaseFile");
                int iC = AbstractC7208b.c(databaseFile);
                if (iC == this.f53103e) {
                    c8025a.d();
                    return;
                }
                C6748f c6748f3 = this.f53105g;
                if (c6748f3 == null) {
                    AbstractC6492s.v("databaseConfiguration");
                } else {
                    c6748f2 = c6748f3;
                }
                if (c6748f2.a(iC, this.f53103e)) {
                    c8025a.d();
                    return;
                }
                if (this.f53099a.deleteDatabase(databaseName)) {
                    try {
                        g(databaseFile, z10);
                    } catch (IOException e11) {
                        Log.w("ROOM", "Unable to copy database file.", e11);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                c8025a.d();
                return;
            } catch (IOException e12) {
                Log.w("ROOM", "Unable to read database version.", e12);
                c8025a.d();
                return;
            }
        } catch (Throwable th2) {
            c8025a.d();
            throw th2;
        }
        c8025a.d();
        throw th2;
    }

    @Override // m2.InterfaceC6749g
    public SupportSQLiteOpenHelper a() {
        return this.f53104f;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        a().close();
        this.f53106h = false;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public String getDatabaseName() {
        return a().getDatabaseName();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getWritableDatabase() throws IOException {
        if (!this.f53106h) {
            p(true);
            this.f53106h = true;
        }
        return a().getWritableDatabase();
    }

    public final void j(C6748f databaseConfiguration) {
        AbstractC6492s.i(databaseConfiguration, "databaseConfiguration");
        this.f53105g = databaseConfiguration;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z10) {
        a().setWriteAheadLoggingEnabled(z10);
    }
}
