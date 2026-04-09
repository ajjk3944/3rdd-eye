package o9;

import Zg.AbstractC3689v;
import com.ui.common.semver.SemVer;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;

/* renamed from: o9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7110a {

    /* renamed from: b, reason: collision with root package name */
    public static final C2008a f55592b = new C2008a(null);

    /* renamed from: a, reason: collision with root package name */
    private final List f55593a;

    /* renamed from: o9.a$a, reason: collision with other inner class name */
    public static final class C2008a {
        public /* synthetic */ C2008a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7110a a(String buildMetadataString) {
            String str;
            AbstractC6492s.i(buildMetadataString, "buildMetadataString");
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (t.m0(buildMetadataString)) {
                return null;
            }
            List<String> listQ0 = t.Q0(t.q1(buildMetadataString).toString(), new String[]{"."}, false, 0, 6, null);
            for (String str2 : listQ0) {
                if (t.m0(str2)) {
                    str = "Build Metadata identity contains an empty part.";
                } else if (C7111b.f55594a.b().m(str2)) {
                    str = null;
                } else {
                    str = "Build Metadata part '" + str2 + "' contains an invalid character.";
                }
                if (str != null) {
                    throw new SemVer.FormatException(((Object) str) + " (" + buildMetadataString + ')');
                }
            }
            return new C7110a(listQ0, defaultConstructorMarker);
        }

        private C2008a() {
        }
    }

    public /* synthetic */ C7110a(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    public String toString() {
        return AbstractC3689v.z0(this.f55593a, ".", null, null, 0, null, null, 62, null);
    }

    private C7110a(List list) {
        this.f55593a = list;
    }
}
