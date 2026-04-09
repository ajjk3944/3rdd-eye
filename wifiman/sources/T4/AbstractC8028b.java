package t4;

import A4.J;
import java.security.GeneralSecurityException;
import s4.AbstractC7911a;

/* renamed from: t4.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8028b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f61717a = new C8027a().d();

    /* renamed from: b, reason: collision with root package name */
    public static final J f61718b = J.U();

    /* renamed from: c, reason: collision with root package name */
    public static final J f61719c = J.U();

    static {
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() {
        C8029c.e();
        if (AbstractC7911a.a()) {
            return;
        }
        C8027a.m(true);
    }
}
