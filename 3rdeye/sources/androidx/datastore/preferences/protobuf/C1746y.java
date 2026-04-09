package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1731i;
import androidx.datastore.preferences.protobuf.AbstractC1744w;
import com.singular.sdk.internal.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Internal.java */
/* renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1746y {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f15707a = Charset.forName(Constants.ENCODING);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f15708b;

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.y$a */
    public interface a {
        int getNumber();
    }

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.y$b */
    public interface b {
        boolean a();
    }

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.y$c */
    public interface c<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        c<E> mutableCopyWithCapacity(int i);
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f15708b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new AbstractC1731i.a(bArr, 0, 0, false).f(0);
        } catch (C1747z e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j4) {
        return (int) (j4 ^ (j4 >>> 32));
    }

    public static AbstractC1744w c(Object obj, Object obj2) {
        AbstractC1744w.a builder = ((P) obj).toBuilder();
        P p10 = (P) obj2;
        if (!builder.f15702b.getClass().isInstance(p10)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        builder.f();
        AbstractC1744w.a.g(builder.f15703c, (AbstractC1744w) ((AbstractC1723a) p10));
        return builder.e();
    }
}
