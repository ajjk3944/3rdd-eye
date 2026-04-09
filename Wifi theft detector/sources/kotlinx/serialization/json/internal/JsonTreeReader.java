package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes4.dex */
public final class JsonTreeReader {

    /* renamed from: a, reason: collision with root package name */
    public final a f22979a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22980b;

    /* renamed from: c, reason: collision with root package name */
    public int f22981c;

    public JsonTreeReader(z9.d configuration, a lexer) {
        kotlin.jvm.internal.p.e(configuration, "configuration");
        kotlin.jvm.internal.p.e(lexer, "lexer");
        this.f22979a = lexer;
        this.f22980b = configuration.l();
    }

    public final kotlinx.serialization.json.b e() {
        byte bE = this.f22979a.E();
        if (bE == 1) {
            return j(true);
        }
        if (bE == 0) {
            return j(false);
        }
        if (bE == 6) {
            int i10 = this.f22981c + 1;
            this.f22981c = i10;
            this.f22981c--;
            return i10 == 200 ? g() : i();
        }
        if (bE == 8) {
            return f();
        }
        a.y(this.f22979a, "Cannot begin reading element, unexpected token: " + ((int) bE), 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final kotlinx.serialization.json.b f() {
        byte bM = this.f22979a.m();
        if (this.f22979a.E() == 4) {
            a.y(this.f22979a, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f22979a.f()) {
            arrayList.add(e());
            bM = this.f22979a.m();
            if (bM != 4) {
                a aVar = this.f22979a;
                boolean z10 = bM == 9;
                int i10 = aVar.f22987a;
                if (!z10) {
                    a.y(aVar, "Expected end of the array or comma", i10, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (bM == 8) {
            this.f22979a.n((byte) 9);
        } else if (bM == 4) {
            a.y(this.f22979a, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return new kotlinx.serialization.json.a(arrayList);
    }

    public final kotlinx.serialization.json.b g() {
        return (kotlinx.serialization.json.b) kotlin.a.b(new y8.a(new JsonTreeReader$readDeepRecursive$1(this, null)), y8.s.f25199a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0096 -> B:27:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(y8.b r20, c9.c r21) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.JsonTreeReader.h(y8.b, c9.c):java.lang.Object");
    }

    public final kotlinx.serialization.json.b i() {
        byte bN = this.f22979a.n((byte) 6);
        if (this.f22979a.E() == 4) {
            a.y(this.f22979a, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            if (!this.f22979a.f()) {
                break;
            }
            String strS = this.f22980b ? this.f22979a.s() : this.f22979a.q();
            this.f22979a.n((byte) 5);
            linkedHashMap.put(strS, e());
            bN = this.f22979a.m();
            if (bN != 4) {
                if (bN != 7) {
                    a.y(this.f22979a, "Expected end of the object or comma", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (bN == 6) {
            this.f22979a.n((byte) 7);
        } else if (bN == 4) {
            a.y(this.f22979a, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return new JsonObject(linkedHashMap);
    }

    public final kotlinx.serialization.json.c j(boolean z10) {
        String strS = (this.f22980b || !z10) ? this.f22979a.s() : this.f22979a.q();
        return (z10 || !kotlin.jvm.internal.p.a(strS, "null")) ? new z9.l(strS, z10) : JsonNull.f22952c;
    }
}
