package Sh;

import Sh.v;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class w {
    public static final x a(v vVar, Qh.g javaClass, Yh.e jvmMetadataVersion) {
        AbstractC6492s.i(vVar, "<this>");
        AbstractC6492s.i(javaClass, "javaClass");
        AbstractC6492s.i(jvmMetadataVersion, "jvmMetadataVersion");
        v.a aVarB = vVar.b(javaClass, jvmMetadataVersion);
        if (aVarB != null) {
            return aVarB.a();
        }
        return null;
    }

    public static final x b(v vVar, Zh.b classId, Yh.e jvmMetadataVersion) {
        AbstractC6492s.i(vVar, "<this>");
        AbstractC6492s.i(classId, "classId");
        AbstractC6492s.i(jvmMetadataVersion, "jvmMetadataVersion");
        v.a aVarA = vVar.a(classId, jvmMetadataVersion);
        if (aVarA != null) {
            return aVarA.a();
        }
        return null;
    }
}
