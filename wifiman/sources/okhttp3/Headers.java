package okhttp3;

import Yg.s;
import Yg.z;
import Zg.AbstractC3689v;
import gh.AbstractC5918c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6477c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import kotlin.text.t;
import nh.InterfaceC6944a;
import okhttp3.internal.Util;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 \t2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002()B\u0017\b\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0016H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b'\u0010\"¨\u0006*"}, d2 = {"Lokhttp3/Headers;", "", "LYg/s;", "", "", "namesAndValues", "<init>", "([Ljava/lang/String;)V", "name", SnmpConfigurator.O_BIND_ADDRESS, "(Ljava/lang/String;)Ljava/lang/String;", "", "index", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(I)Ljava/lang/String;", "j", "", "f", "()Ljava/util/Set;", "", "k", "(Ljava/lang/String;)Ljava/util/List;", "", "iterator", "()Ljava/util/Iterator;", "Lokhttp3/Headers$Builder;", "g", "()Lokhttp3/Headers$Builder;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", SnmpConfigurator.O_AUTH_PROTOCOL, "[Ljava/lang/String;", "size", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Headers implements Iterable<s>, InterfaceC6944a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String[] namesAndValues;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u000bJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0007J \u0010\u0013\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lokhttp3/Headers$Builder;", "", "<init>", "()V", "", "line", SnmpConfigurator.O_COMMUNITY, "(Ljava/lang/String;)Lokhttp3/Headers$Builder;", "name", "value", SnmpConfigurator.O_AUTH_PROTOCOL, "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Lokhttp3/Headers;", "headers", SnmpConfigurator.O_BIND_ADDRESS, "(Lokhttp3/Headers;)Lokhttp3/Headers$Builder;", "d", "i", "j", "g", "(Ljava/lang/String;)Ljava/lang/String;", "f", "()Lokhttp3/Headers;", "", "Ljava/util/List;", "h", "()Ljava/util/List;", "namesAndValues", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List namesAndValues = new ArrayList(20);

        public final Builder a(String name, String value) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(value, "value");
            Companion companion = Headers.INSTANCE;
            companion.d(name);
            companion.e(value, name);
            d(name, value);
            return this;
        }

        public final Builder b(Headers headers) {
            AbstractC6492s.i(headers, "headers");
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                d(headers.e(i10), headers.j(i10));
            }
            return this;
        }

        public final Builder c(String line) {
            AbstractC6492s.i(line, "line");
            int iJ0 = t.j0(line, ':', 1, false, 4, null);
            if (iJ0 != -1) {
                String strSubstring = line.substring(0, iJ0);
                AbstractC6492s.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iJ0 + 1);
                AbstractC6492s.h(strSubstring2, "this as java.lang.String).substring(startIndex)");
                d(strSubstring, strSubstring2);
            } else if (line.charAt(0) == ':') {
                String strSubstring3 = line.substring(1);
                AbstractC6492s.h(strSubstring3, "this as java.lang.String).substring(startIndex)");
                d("", strSubstring3);
            } else {
                d("", line);
            }
            return this;
        }

        public final Builder d(String name, String value) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(value, "value");
            this.namesAndValues.add(name);
            this.namesAndValues.add(t.q1(value).toString());
            return this;
        }

        public final Builder e(String name, String value) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(value, "value");
            Headers.INSTANCE.d(name);
            d(name, value);
            return this;
        }

        public final Headers f() {
            return new Headers((String[]) this.namesAndValues.toArray(new String[0]), null);
        }

        public final String g(String name) {
            AbstractC6492s.i(name, "name");
            int size = this.namesAndValues.size() - 2;
            int iC = AbstractC5918c.c(size, 0, -2);
            if (iC > size) {
                return null;
            }
            while (!t.C(name, (String) this.namesAndValues.get(size), true)) {
                if (size == iC) {
                    return null;
                }
                size -= 2;
            }
            return (String) this.namesAndValues.get(size + 1);
        }

        /* renamed from: h, reason: from getter */
        public final List getNamesAndValues() {
            return this.namesAndValues;
        }

        public final Builder i(String name) {
            AbstractC6492s.i(name, "name");
            int i10 = 0;
            while (i10 < this.namesAndValues.size()) {
                if (t.C(name, (String) this.namesAndValues.get(i10), true)) {
                    this.namesAndValues.remove(i10);
                    this.namesAndValues.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        public final Builder j(String name, String value) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(value, "value");
            Companion companion = Headers.INSTANCE;
            companion.d(name);
            companion.e(value, name);
            i(name);
            d(name, value);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lokhttp3/Headers$Companion;", "", "<init>", "()V", "", "", "namesAndValues", "name", "f", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "LYg/J;", "d", "(Ljava/lang/String;)V", "value", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Ljava/lang/String;Ljava/lang/String;)V", "Lokhttp3/Headers;", "g", "([Ljava/lang/String;)Lokhttp3/Headers;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(String name) {
            if (name.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = name.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = name.charAt(i10);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(Util.t("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), name).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(String value, String name) {
            int length = value.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = value.charAt(i10);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(Util.t("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), name));
                    sb2.append(Util.H(name) ? "" : ": " + value);
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(String[] namesAndValues, String name) {
            int length = namesAndValues.length - 2;
            int iC = AbstractC5918c.c(length, 0, -2);
            if (iC > length) {
                return null;
            }
            while (!t.C(name, namesAndValues[length], true)) {
                if (length == iC) {
                    return null;
                }
                length -= 2;
            }
            return namesAndValues[length + 1];
        }

        public final Headers g(String... namesAndValues) {
            AbstractC6492s.i(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                String str = strArr[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr[i11] = t.q1(str).toString();
            }
            int iC = AbstractC5918c.c(0, strArr.length - 1, 2);
            if (iC >= 0) {
                while (true) {
                    String str2 = strArr[i10];
                    String str3 = strArr[i10 + 1];
                    d(str2);
                    e(str3, str2);
                    if (i10 == iC) {
                        break;
                    }
                    i10 += 2;
                }
            }
            return new Headers(strArr, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ Headers(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }

    public static final Headers i(String... strArr) {
        return INSTANCE.g(strArr);
    }

    public final String b(String name) {
        AbstractC6492s.i(name, "name");
        return INSTANCE.f(this.namesAndValues, name);
    }

    public final String e(int index) {
        return this.namesAndValues[index * 2];
    }

    public boolean equals(Object other) {
        return (other instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) other).namesAndValues);
    }

    public final Set f() {
        TreeSet treeSet = new TreeSet(t.E(U.f51694a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(e(i10));
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        AbstractC6492s.h(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public final Builder g() {
        Builder builder = new Builder();
        AbstractC3689v.E(builder.getNamesAndValues(), this.namesAndValues);
        return builder;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    public Iterator<s> iterator() {
        int size = size();
        s[] sVarArr = new s[size];
        for (int i10 = 0; i10 < size; i10++) {
            sVarArr[i10] = z.a(e(i10), j(i10));
        }
        return AbstractC6477c.a(sVarArr);
    }

    public final String j(int index) {
        return this.namesAndValues[(index * 2) + 1];
    }

    public final List k(String name) {
        AbstractC6492s.i(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (t.C(name, e(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(j(i10));
            }
        }
        if (arrayList == null) {
            return AbstractC3689v.l();
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        AbstractC6492s.h(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strE = e(i10);
            String strJ = j(i10);
            sb2.append(strE);
            sb2.append(": ");
            if (Util.H(strE)) {
                strJ = "██";
            }
            sb2.append(strJ);
            sb2.append("\n");
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }
}
