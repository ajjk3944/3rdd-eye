package d9;

import java.lang.reflect.Field;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract class d {
    public static final void a(int i10, int i11) {
        if (i11 <= i10) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i10 + ", got " + i11 + ". Please update the Kotlin standard library.").toString());
    }

    public static final DebugMetadata b(BaseContinuationImpl baseContinuationImpl) {
        return (DebugMetadata) baseContinuationImpl.getClass().getAnnotation(DebugMetadata.class);
    }

    public static final int c(BaseContinuationImpl baseContinuationImpl) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement d(BaseContinuationImpl baseContinuationImpl) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        String strC;
        p.e(baseContinuationImpl, "<this>");
        DebugMetadata debugMetadataB = b(baseContinuationImpl);
        if (debugMetadataB == null) {
            return null;
        }
        a(1, debugMetadataB.v());
        int iC = c(baseContinuationImpl);
        int i10 = iC < 0 ? -1 : debugMetadataB.l()[iC];
        String strB = f.f20810a.b(baseContinuationImpl);
        if (strB == null) {
            strC = debugMetadataB.c();
        } else {
            strC = strB + '/' + debugMetadataB.c();
        }
        return new StackTraceElement(strC, debugMetadataB.m(), debugMetadataB.f(), i10);
    }
}
