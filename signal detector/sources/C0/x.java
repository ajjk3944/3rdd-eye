package C0;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/* loaded from: classes.dex */
public final class x implements G0.b, c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1125a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1126b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1127c;

    /* renamed from: d, reason: collision with root package name */
    public final G0.b f1128d;

    /* renamed from: e, reason: collision with root package name */
    public C0146b f1129e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1130f;

    public x(Context context, String str, int i, G0.b bVar) {
        q5.i.e(context, "context");
        q5.i.e(bVar, "delegate");
        this.f1125a = context;
        this.f1126b = str;
        this.f1127c = i;
        this.f1128d = bVar;
    }

    @Override // C0.c
    public final G0.b a() {
        return this.f1128d;
    }

    public final void b(File file) throws IOException {
        String str = this.f1126b;
        if (str == null) {
            throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
        }
        Context context = this.f1125a;
        ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(context.getAssets().open(str));
        q5.i.d(readableByteChannelNewChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", context.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(fileCreateTempFile).getChannel();
        q5.i.d(channel, "output");
        try {
            if (Build.VERSION.SDK_INT <= 23) {
                InputStream inputStreamNewInputStream = Channels.newInputStream(readableByteChannelNewChannel);
                OutputStream outputStreamNewOutputStream = Channels.newOutputStream(channel);
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = inputStreamNewInputStream.read(bArr);
                    if (i <= 0) {
                        break;
                    } else {
                        outputStreamNewOutputStream.write(bArr, 0, i);
                    }
                }
            } else {
                channel.transferFrom(readableByteChannelNewChannel, 0L, Long.MAX_VALUE);
            }
            channel.force(false);
            readableByteChannelNewChannel.close();
            channel.close();
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                throw new IOException("Failed to create directories for " + file.getAbsolutePath());
            }
            if (this.f1129e == null) {
                q5.i.g("databaseConfiguration");
                throw null;
            }
            if (fileCreateTempFile.renameTo(file)) {
                return;
            }
            throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
        } catch (Throwable th) {
            readableByteChannelNewChannel.close();
            channel.close();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f1128d.close();
        this.f1130f = false;
    }

    @Override // G0.b
    public final String getDatabaseName() {
        return this.f1128d.getDatabaseName();
    }

    @Override // G0.b
    public final H0.c i() throws IOException {
        if (!this.f1130f) {
            String databaseName = this.f1128d.getDatabaseName();
            if (databaseName == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Context context = this.f1125a;
            File databasePath = context.getDatabasePath(databaseName);
            C0146b c0146b = this.f1129e;
            if (c0146b == null) {
                q5.i.g("databaseConfiguration");
                throw null;
            }
            boolean z6 = c0146b.f1041m;
            I0.a aVar = new I0.a(context.getFilesDir(), databaseName, z6);
            try {
                aVar.a(z6);
                if (databasePath.exists()) {
                    try {
                        int iA = R2.a.A(databasePath);
                        int i = this.f1127c;
                        if (iA != i) {
                            C0146b c0146b2 = this.f1129e;
                            if (c0146b2 == null) {
                                q5.i.g("databaseConfiguration");
                                throw null;
                            }
                            if (!c0146b2.a(iA, i)) {
                                if (context.deleteDatabase(databaseName)) {
                                    try {
                                        b(databasePath);
                                    } catch (IOException e6) {
                                        Log.w("ROOM", "Unable to copy database file.", e6);
                                    }
                                } else {
                                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                                }
                            }
                        }
                    } catch (IOException e7) {
                        Log.w("ROOM", "Unable to read database version.", e7);
                    }
                } else {
                    try {
                        b(databasePath);
                    } catch (IOException e8) {
                        throw new RuntimeException("Unable to copy database file.", e8);
                    }
                }
                this.f1130f = true;
            } finally {
                aVar.b();
            }
        }
        return this.f1128d.i();
    }

    @Override // G0.b
    public final void setWriteAheadLoggingEnabled(boolean z6) {
        this.f1128d.setWriteAheadLoggingEnabled(z6);
    }
}
