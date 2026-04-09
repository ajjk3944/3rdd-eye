package g7;

import android.opengl.GLES20;
import android.opengl.GLException;
import android.opengl.GLU;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.U;

/* renamed from: g7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5870c {

    /* renamed from: a, reason: collision with root package name */
    public static final C5870c f47725a = new C5870c();

    private C5870c() {
    }

    private final String a(String str, String str2, List list) {
        U u10 = U.f51694a;
        String str3 = String.format("%s: %s: ", Arrays.copyOf(new Object[]{str, str2}, 2));
        AbstractC6492s.h(str3, "format(...)");
        StringBuilder sb2 = new StringBuilder(str3);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            U u11 = U.f51694a;
            String str4 = String.format(Locale.US, "%s (%d)", Arrays.copyOf(new Object[]{GLU.gluErrorString(iIntValue), Integer.valueOf(iIntValue)}, 2));
            AbstractC6492s.h(str4, "format(...)");
            sb2.append(str4);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }

    private final List b() {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(iGlGetError));
        while (true) {
            int iGlGetError2 = GLES20.glGetError();
            if (iGlGetError2 == 0) {
                return arrayList;
            }
            arrayList.add(Integer.valueOf(iGlGetError2));
        }
    }

    public static final void c(String reason, String api) {
        AbstractC6492s.i(reason, "reason");
        AbstractC6492s.i(api, "api");
        C5870c c5870c = f47725a;
        List listB = c5870c.b();
        if (listB != null) {
            throw new GLException(((Number) listB.get(0)).intValue(), c5870c.a(reason, api, listB));
        }
    }
}
