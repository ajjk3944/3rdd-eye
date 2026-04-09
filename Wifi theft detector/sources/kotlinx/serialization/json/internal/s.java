package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;

/* loaded from: classes4.dex */
public abstract class s {
    public static final JsonDecodingException a(Number value, String key, String output) {
        kotlin.jvm.internal.p.e(value, "value");
        kotlin.jvm.internal.p.e(key, "key");
        kotlin.jvm.internal.p.e(output, "output");
        return e(-1, k(value, key, output));
    }

    public static final JsonEncodingException b(Number value, String output) {
        kotlin.jvm.internal.p.e(value, "value");
        kotlin.jvm.internal.p.e(output, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) i(output, 0, 1, null)));
    }

    public static final JsonEncodingException c(Number value, String key, String output) {
        kotlin.jvm.internal.p.e(value, "value");
        kotlin.jvm.internal.p.e(key, "key");
        kotlin.jvm.internal.p.e(output, "output");
        return new JsonEncodingException(k(value, key, output));
    }

    public static final JsonEncodingException d(kotlinx.serialization.descriptors.f keyDescriptor) {
        kotlin.jvm.internal.p.e(keyDescriptor, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + keyDescriptor.h() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException e(int i10, String message) {
        kotlin.jvm.internal.p.e(message, "message");
        if (i10 >= 0) {
            message = "Unexpected JSON token at offset " + i10 + ": " + message;
        }
        return new JsonDecodingException(message);
    }

    public static final JsonDecodingException f(int i10, String message, CharSequence input) {
        kotlin.jvm.internal.p.e(message, "message");
        kotlin.jvm.internal.p.e(input, "input");
        return e(i10, message + "\nJSON input: " + ((Object) h(input, i10)));
    }

    public static final JsonDecodingException g(String key, String input) {
        kotlin.jvm.internal.p.e(key, "key");
        kotlin.jvm.internal.p.e(input, "input");
        return e(-1, "Encountered unknown key '" + key + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) i(input, 0, 1, null)));
    }

    public static final CharSequence h(CharSequence charSequence, int i10) {
        if (charSequence.length() >= 200) {
            if (i10 != -1) {
                int i11 = i10 - 30;
                int i12 = i10 + 30;
                return (i11 <= 0 ? "" : ".....") + charSequence.subSequence(q9.e.b(i11, 0), q9.e.d(i12, charSequence.length())).toString() + (i12 >= charSequence.length() ? "" : ".....");
            }
            int length = charSequence.length() - 60;
            if (length > 0) {
                return "....." + charSequence.subSequence(length, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static /* synthetic */ CharSequence i(CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        return h(charSequence, i10);
    }

    public static final Void j(a aVar, Number result) {
        kotlin.jvm.internal.p.e(aVar, "<this>");
        kotlin.jvm.internal.p.e(result, "result");
        a.y(aVar, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new KotlinNothingValueException();
    }

    public static final String k(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) i(str2, 0, 1, null));
    }
}
