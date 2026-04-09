package kotlinx.serialization.internal;

import kotlin.KotlinNothingValueException;
import kotlinx.serialization.SerializationException;

/* loaded from: classes4.dex */
public abstract class c {
    public static final Void a(String str, r9.c baseClass) {
        String str2;
        kotlin.jvm.internal.p.e(baseClass, "baseClass");
        String str3 = "in the scope of '" + baseClass.i() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default polymorphic serializers were registered " + str3;
        } else {
            str2 = "Class '" + str + "' is not registered for polymorphic serialization " + str3 + ".\nMark the base class as 'sealed' or register the serializer explicitly.";
        }
        throw new SerializationException(str2);
    }

    public static final Void b(r9.c subClass, r9.c baseClass) {
        kotlin.jvm.internal.p.e(subClass, "subClass");
        kotlin.jvm.internal.p.e(baseClass, "baseClass");
        String strI = subClass.i();
        if (strI == null) {
            strI = String.valueOf(subClass);
        }
        a(strI, baseClass);
        throw new KotlinNothingValueException();
    }
}
