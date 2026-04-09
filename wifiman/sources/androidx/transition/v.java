package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class v {

    /* renamed from: b, reason: collision with root package name */
    public View f32517b;

    /* renamed from: a, reason: collision with root package name */
    public final Map f32516a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f32518c = new ArrayList();

    public v(View view) {
        this.f32517b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f32517b == vVar.f32517b && this.f32516a.equals(vVar.f32516a);
    }

    public int hashCode() {
        return (this.f32517b.hashCode() * 31) + this.f32516a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f32517b + "\n") + "    values:";
        for (String str2 : this.f32516a.keySet()) {
            str = str + "    " + str2 + ": " + this.f32516a.get(str2) + "\n";
        }
        return str;
    }
}
