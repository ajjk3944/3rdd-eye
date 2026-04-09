package s2;

import java.io.IOException;
import t2.AbstractC5601b;

/* compiled from: FloatParser.java */
/* renamed from: s2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5565k implements K<Float> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5565k f45989a = new C5565k();

    @Override // s2.K
    public final Float a(AbstractC5601b abstractC5601b, float f10) throws IOException {
        return Float.valueOf(r.d(abstractC5601b) * f10);
    }
}
