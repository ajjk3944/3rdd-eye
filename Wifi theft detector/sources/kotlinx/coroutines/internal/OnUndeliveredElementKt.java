package kotlinx.coroutines.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public abstract class OnUndeliveredElementKt {
    public static final l9.l a(final l9.l lVar, final Object obj, final kotlin.coroutines.d dVar) {
        return new l9.l() { // from class: kotlinx.coroutines.internal.OnUndeliveredElementKt$bindCancellationFun$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // l9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                invoke((Throwable) obj2);
                return y8.s.f25199a;
            }

            public final void invoke(Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                OnUndeliveredElementKt.b(lVar, obj, dVar);
            }
        };
    }

    public static final void b(l9.l lVar, Object obj, kotlin.coroutines.d dVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        UndeliveredElementException undeliveredElementExceptionC = c(lVar, obj, null);
        if (undeliveredElementExceptionC != null) {
            kotlinx.coroutines.h0.a(dVar, undeliveredElementExceptionC);
        }
    }

    public static final UndeliveredElementException c(l9.l lVar, Object obj, UndeliveredElementException undeliveredElementException) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            lVar.invoke(obj);
            return undeliveredElementException;
        } catch (Throwable th) {
            if (undeliveredElementException != null && undeliveredElementException.getCause() != th) {
                y8.d.a(undeliveredElementException, th);
                return undeliveredElementException;
            }
            return new UndeliveredElementException("Exception in undelivered element handler for " + obj, th);
        }
    }

    public static /* synthetic */ UndeliveredElementException d(l9.l lVar, Object obj, UndeliveredElementException undeliveredElementException, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            undeliveredElementException = null;
        }
        return c(lVar, obj, undeliveredElementException);
    }
}
