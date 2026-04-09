package bj;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public abstract class r {
    public static final JsonDecodingException a(Number value, String key, String output) {
        AbstractC6492s.i(value, "value");
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(output, "output");
        return d(-1, k(value, key, output));
    }

    public static final JsonEncodingException b(Number value, String output) {
        AbstractC6492s.i(value, "value");
        AbstractC6492s.i(output, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) i(output, 0, 1, null)));
    }

    public static final JsonEncodingException c(Xi.f keyDescriptor) {
        AbstractC6492s.i(keyDescriptor, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + keyDescriptor.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.h() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException d(int i10, String message) {
        AbstractC6492s.i(message, "message");
        if (i10 >= 0) {
            message = "Unexpected JSON token at offset " + i10 + ": " + message;
        }
        return new JsonDecodingException(message);
    }

    public static final JsonDecodingException e(int i10, String message, CharSequence input) {
        AbstractC6492s.i(message, "message");
        AbstractC6492s.i(input, "input");
        return d(i10, message + "\nJSON input: " + ((Object) h(input, i10)));
    }

    public static final Void f(AbstractC4118a abstractC4118a, String entity) {
        AbstractC6492s.i(abstractC4118a, "<this>");
        AbstractC6492s.i(entity, "entity");
        abstractC4118a.y("Trailing comma before the end of JSON " + entity, abstractC4118a.f33431a - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Void g(AbstractC4118a abstractC4118a, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "object";
        }
        return f(abstractC4118a, str);
    }

    public static final CharSequence h(CharSequence charSequence, int i10) {
        AbstractC6492s.i(charSequence, "<this>");
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i10 == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i11 = i10 - 30;
        int i12 = i10 + 30;
        return (i11 <= 0 ? "" : ".....") + charSequence.subSequence(AbstractC7978m.d(i11, 0), AbstractC7978m.g(i12, charSequence.length())).toString() + (i12 >= charSequence.length() ? "" : ".....");
    }

    public static /* synthetic */ CharSequence i(CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        return h(charSequence, i10);
    }

    public static final Void j(AbstractC4118a abstractC4118a, Number result) {
        AbstractC6492s.i(abstractC4118a, "<this>");
        AbstractC6492s.i(result, "result");
        AbstractC4118a.z(abstractC4118a, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new KotlinNothingValueException();
    }

    private static final String k(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) i(str2, 0, 1, null));
    }
}
