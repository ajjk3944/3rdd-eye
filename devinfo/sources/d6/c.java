package d6;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public interface c extends AutoCloseable {
    String D(int i4);

    boolean P();

    void a(int i4, long j);

    void b(int i4, byte[] bArr);

    void d(int i4);

    byte[] getBlob(int i4);

    int getColumnCount();

    String getColumnName(int i4);

    long getLong(int i4);

    boolean isNull(int i4);

    void q(int i4, String str);

    boolean r();

    void reset();
}
