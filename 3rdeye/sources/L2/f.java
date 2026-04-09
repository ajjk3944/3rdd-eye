package L2;

import com.singular.sdk.internal.Constants;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: Key.java */
/* loaded from: classes.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f4027a = Charset.forName(Constants.ENCODING);

    void b(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
