package W;

import android.util.Size;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: Quality.java */
/* renamed from: W.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1635x {

    /* renamed from: a, reason: collision with root package name */
    public static final C1622j f13307a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1622j f13308b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1622j f13309c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1622j f13310d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1622j f13311e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1622j f13312f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1622j f13313g;

    /* renamed from: h, reason: collision with root package name */
    public static final HashSet f13314h;
    public static final List<C1635x> i;

    /* compiled from: Quality.java */
    /* renamed from: W.x$a */
    public static abstract class a extends C1635x {
        public abstract String a();

        public abstract List<Size> b();

        public abstract int c();
    }

    static {
        C1622j c1622j = new C1622j(4, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        f13307a = c1622j;
        C1622j c1622j2 = new C1622j(5, "HD", Collections.singletonList(new Size(1280, 720)));
        f13308b = c1622j2;
        C1622j c1622j3 = new C1622j(6, "FHD", Collections.singletonList(new Size(1920, 1080)));
        f13309c = c1622j3;
        C1622j c1622j4 = new C1622j(8, "UHD", Collections.singletonList(new Size(3840, 2160)));
        f13310d = c1622j4;
        List list = Collections.EMPTY_LIST;
        C1622j c1622j5 = new C1622j(0, "LOWEST", list);
        f13311e = c1622j5;
        C1622j c1622j6 = new C1622j(1, "HIGHEST", list);
        f13312f = c1622j6;
        f13313g = new C1622j(-1, "NONE", list);
        f13314h = new HashSet(Arrays.asList(c1622j5, c1622j6, c1622j, c1622j2, c1622j3, c1622j4));
        i = Arrays.asList(c1622j4, c1622j3, c1622j2, c1622j);
    }
}
