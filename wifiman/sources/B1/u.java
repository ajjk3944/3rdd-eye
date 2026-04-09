package b1;

import android.util.Log;
import f1.C5493b;
import f1.C5494c;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private Y0.h f32777a;

    /* renamed from: b, reason: collision with root package name */
    private String f32778b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32779c;

    public /* synthetic */ u(Y0.h hVar, String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, str, str2);
    }

    public final androidx.constraintlayout.core.parser.b a() {
        Y0.h hVar = this.f32777a;
        if (hVar != null) {
            return new C5493b(hVar.s());
        }
        String str = this.f32778b;
        if (str != null) {
            return C5494c.x(str);
        }
        Log.e("CCL", "DimensionDescription: Null value & symbol for " + this.f32779c + ". Using WrapContent.");
        return C5494c.x("wrap");
    }

    public final boolean b() {
        return this.f32777a == null && this.f32778b == null;
    }

    private u(Y0.h hVar, String str, String str2) {
        this.f32777a = hVar;
        this.f32778b = str;
        this.f32779c = str2;
    }
}
