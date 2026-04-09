package okhttp3;

import ej.C5481e;
import ej.InterfaceC5482f;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u001bB%\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001c"}, d2 = {"Lokhttp3/FormBody;", "Lokhttp3/RequestBody;", "", "", "encodedNames", "encodedValues", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Lej/f;", "sink", "", "countBytes", "", "i", "(Lej/f;Z)J", "Lokhttp3/MediaType;", SnmpConfigurator.O_BIND_ADDRESS, "()Lokhttp3/MediaType;", SnmpConfigurator.O_AUTH_PROTOCOL, "()J", "LYg/J;", "h", "(Lej/f;)V", "Ljava/util/List;", SnmpConfigurator.O_COMMUNITY, "d", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FormBody extends RequestBody {

    /* renamed from: e, reason: collision with root package name */
    private static final MediaType f56014e = MediaType.INSTANCE.a("application/x-www-form-urlencoded");

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List encodedNames;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List encodedValues;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0014"}, d2 = {"Lokhttp3/FormBody$Builder;", "", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Ljava/nio/charset/Charset;)V", "", "name", "value", SnmpConfigurator.O_AUTH_PROTOCOL, "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/FormBody$Builder;", SnmpConfigurator.O_BIND_ADDRESS, "Lokhttp3/FormBody;", SnmpConfigurator.O_COMMUNITY, "()Lokhttp3/FormBody;", "Ljava/nio/charset/Charset;", "", "Ljava/util/List;", "names", "values", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Charset charset;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List names;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List values;

        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final Builder a(String name, String value) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(value, "value");
            List list = this.names;
            HttpUrl.Companion companion = HttpUrl.INSTANCE;
            list.add(HttpUrl.Companion.b(companion, name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.charset, 91, null));
            this.values.add(HttpUrl.Companion.b(companion, value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.charset, 91, null));
            return this;
        }

        public final Builder b(String name, String value) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(value, "value");
            List list = this.names;
            HttpUrl.Companion companion = HttpUrl.INSTANCE;
            list.add(HttpUrl.Companion.b(companion, name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.charset, 83, null));
            this.values.add(HttpUrl.Companion.b(companion, value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.charset, 83, null));
            return this;
        }

        public final FormBody c() {
            return new FormBody(this.names, this.values);
        }

        public Builder(Charset charset) {
            this.charset = charset;
            this.names = new ArrayList();
            this.values = new ArrayList();
        }

        public /* synthetic */ Builder(Charset charset, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : charset);
        }
    }

    public FormBody(List encodedNames, List encodedValues) {
        AbstractC6492s.i(encodedNames, "encodedNames");
        AbstractC6492s.i(encodedValues, "encodedValues");
        this.encodedNames = Util.V(encodedNames);
        this.encodedValues = Util.V(encodedValues);
    }

    private final long i(InterfaceC5482f sink, boolean countBytes) throws EOFException {
        C5481e c5481eB;
        if (countBytes) {
            c5481eB = new C5481e();
        } else {
            AbstractC6492s.f(sink);
            c5481eB = sink.b();
        }
        int size = this.encodedNames.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                c5481eB.u(38);
            }
            c5481eB.F((String) this.encodedNames.get(i10));
            c5481eB.u(61);
            c5481eB.F((String) this.encodedValues.get(i10));
        }
        if (!countBytes) {
            return 0L;
        }
        long jD0 = c5481eB.D0();
        c5481eB.clear();
        return jD0;
    }

    @Override // okhttp3.RequestBody
    public long a() {
        return i(null, true);
    }

    @Override // okhttp3.RequestBody
    /* renamed from: b */
    public MediaType getContentType() {
        return f56014e;
    }

    @Override // okhttp3.RequestBody
    public void h(InterfaceC5482f sink) throws EOFException {
        AbstractC6492s.i(sink, "sink");
        i(sink, false);
    }
}
