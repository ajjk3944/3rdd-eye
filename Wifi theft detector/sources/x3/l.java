package x3;

import com.google.firebase.encoders.proto.ProtobufEncoder;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final ProtobufEncoder f24949a = ProtobufEncoder.builder().configureWith(a.f24882a).build();

    public static byte[] a(Object obj) {
        return f24949a.encode(obj);
    }
}
