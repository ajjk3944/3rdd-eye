package A1;

import Yg.s;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public abstract class d {
    public static final Bundle a() {
        return new Bundle(0);
    }

    public static final Bundle b(s... sVarArr) {
        Bundle bundle = new Bundle(sVarArr.length);
        for (s sVar : sVarArr) {
            String str = (String) sVar.a();
            Object objC = sVar.c();
            if (objC == null) {
                bundle.putString(str, null);
            } else if (objC instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) objC).booleanValue());
            } else if (objC instanceof Byte) {
                bundle.putByte(str, ((Number) objC).byteValue());
            } else if (objC instanceof Character) {
                bundle.putChar(str, ((Character) objC).charValue());
            } else if (objC instanceof Double) {
                bundle.putDouble(str, ((Number) objC).doubleValue());
            } else if (objC instanceof Float) {
                bundle.putFloat(str, ((Number) objC).floatValue());
            } else if (objC instanceof Integer) {
                bundle.putInt(str, ((Number) objC).intValue());
            } else if (objC instanceof Long) {
                bundle.putLong(str, ((Number) objC).longValue());
            } else if (objC instanceof Short) {
                bundle.putShort(str, ((Number) objC).shortValue());
            } else if (objC instanceof Bundle) {
                bundle.putBundle(str, (Bundle) objC);
            } else if (objC instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) objC);
            } else if (objC instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) objC);
            } else if (objC instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) objC);
            } else if (objC instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) objC);
            } else if (objC instanceof char[]) {
                bundle.putCharArray(str, (char[]) objC);
            } else if (objC instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) objC);
            } else if (objC instanceof float[]) {
                bundle.putFloatArray(str, (float[]) objC);
            } else if (objC instanceof int[]) {
                bundle.putIntArray(str, (int[]) objC);
            } else if (objC instanceof long[]) {
                bundle.putLongArray(str, (long[]) objC);
            } else if (objC instanceof short[]) {
                bundle.putShortArray(str, (short[]) objC);
            } else if (objC instanceof Object[]) {
                Class<?> componentType = objC.getClass().getComponentType();
                AbstractC6492s.f(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    AbstractC6492s.g(objC, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(str, (Parcelable[]) objC);
                } else if (String.class.isAssignableFrom(componentType)) {
                    AbstractC6492s.g(objC, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(str, (String[]) objC);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    AbstractC6492s.g(objC, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(str, (CharSequence[]) objC);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) objC);
                }
            } else if (objC instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) objC);
            } else if (objC instanceof IBinder) {
                bundle.putBinder(str, (IBinder) objC);
            } else if (objC instanceof Size) {
                b.a(bundle, str, (Size) objC);
            } else {
                if (!(objC instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + objC.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                b.b(bundle, str, (SizeF) objC);
            }
        }
        return bundle;
    }
}
