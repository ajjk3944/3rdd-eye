package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class lx implements Closeable {
    public static final String[] h = new String[0];
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ lx(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    public static String n(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }

    public void a() {
        ((SQLiteDatabase) this.g).beginTransaction();
    }

    public void c(int i, byte[] bArr) {
        ((SQLiteProgram) this.g).bindBlob(i, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f) {
            case 0:
                ((SQLiteDatabase) this.g).close();
                break;
            case 1:
                ((HttpURLConnection) this.g).disconnect();
                break;
            case 2:
                ((SQLiteProgram) this.g).close();
                break;
        }
    }

    public void f(int i, long j) {
        ((SQLiteProgram) this.g).bindLong(i, j);
    }

    public void g(int i) {
        ((SQLiteProgram) this.g).bindNull(i);
    }

    public void h(String str, int i) {
        ((SQLiteProgram) this.g).bindString(i, str);
    }

    public void k() {
        ((SQLiteDatabase) this.g).endTransaction();
    }

    public String l() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.g;
        boolean z = false;
        try {
            try {
                if (httpURLConnection.getResponseCode() / 100 == 2) {
                    z = true;
                }
            } catch (IOException unused) {
            }
            if (z) {
                return null;
            }
            try {
                return "Unable to fetch " + httpURLConnection.getURL() + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + n(httpURLConnection);
            } catch (IOException e) {
                e = e;
                j80.c("get error failed ", e);
                return e.getMessage();
            }
        } catch (NullPointerException e2) {
            e = e2;
            j80.c("get error failed ", e);
            return e.getMessage();
        }
    }

    public void m(String str) throws SQLException {
        ((SQLiteDatabase) this.g).execSQL(str);
    }

    public Cursor o(lz0 lz0Var) {
        return ((SQLiteDatabase) this.g).rawQueryWithFactory(new kx(lz0Var), lz0Var.a(), h, null);
    }

    public Cursor p(String str) {
        return o(new ts3(str, 2));
    }

    public void q() {
        ((SQLiteDatabase) this.g).setTransactionSuccessful();
    }

    public int r(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = (ByteBuffer) this.g;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    public long s() {
        return ((ByteBuffer) this.g).position();
    }

    public lx(ByteBuffer byteBuffer) {
        this.f = 3;
        this.g = byteBuffer.duplicate();
    }

    private final void i() {
    }
}
