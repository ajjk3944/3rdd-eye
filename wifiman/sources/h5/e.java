package H5;

import Vi.A;
import Vi.InterfaceC3627a;
import Vi.l;
import Vi.o;
import Vi.w;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
public abstract class e {

    public static final class a extends e {

        /* renamed from: a, reason: collision with root package name */
        private final A f7630a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(A format) {
            super(null);
            AbstractC6492s.i(format, "format");
            this.f7630a = format;
        }

        @Override // H5.e
        public Object a(InterfaceC3627a loader, ResponseBody body) {
            AbstractC6492s.i(loader, "loader");
            AbstractC6492s.i(body, "body");
            String strC = body.C();
            AbstractC6492s.h(strC, "body.string()");
            return b().b(loader, strC);
        }

        @Override // H5.e
        public RequestBody d(MediaType contentType, o saver, Object obj) {
            AbstractC6492s.i(contentType, "contentType");
            AbstractC6492s.i(saver, "saver");
            RequestBody requestBodyD = RequestBody.d(contentType, b().c(saver, obj));
            AbstractC6492s.h(requestBodyD, "create(contentType, string)");
            return requestBodyD;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // H5.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public A b() {
            return this.f7630a;
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Object a(InterfaceC3627a interfaceC3627a, ResponseBody responseBody);

    protected abstract l b();

    public final Vi.b c(Type type) {
        AbstractC6492s.i(type, "type");
        return w.b(b().a(), type);
    }

    public abstract RequestBody d(MediaType mediaType, o oVar, Object obj);

    private e() {
    }
}
