package c2;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: c, reason: collision with root package name */
    public static final Set f4656c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f4657a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4658b;

    public static class a extends s {
        public a(String str, String str2) {
            super(str, str2);
        }
    }

    public static class b extends s {
        public b(String str, String str2) {
            super(str, str2);
        }
    }

    public s(String str, String str2) {
        this.f4657a = str;
        this.f4658b = str2;
        f4656c.add(this);
    }
}
