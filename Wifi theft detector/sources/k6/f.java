package k6;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f21869b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    public final List f21870a = new ArrayList();

    public List a() {
        return this.f21870a;
    }

    public void b() {
        this.f21870a.clear();
    }
}
