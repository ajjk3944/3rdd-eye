package Zi;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlinx.serialization.SerializationException;

/* renamed from: Zi.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3698c {
    public static final Void a(String str, th.d baseClass) {
        String str2;
        AbstractC6492s.i(baseClass, "baseClass");
        String str3 = "in the polymorphic scope of '" + baseClass.v() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.v() + "' has to be sealed and '@Serializable'.";
        }
        throw new SerializationException(str2);
    }

    public static final Void b(th.d subClass, th.d baseClass) {
        AbstractC6492s.i(subClass, "subClass");
        AbstractC6492s.i(baseClass, "baseClass");
        String strV = subClass.v();
        if (strV == null) {
            strV = String.valueOf(subClass);
        }
        a(strV, baseClass);
        throw new KotlinNothingValueException();
    }
}
