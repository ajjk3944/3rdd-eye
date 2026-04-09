package ol;

import com.google.android.gms.internal.play_billing.m1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final h f30588a = new h();

    public static final kl.d a(kl.d dVar, j6.i iVar) {
        nk.k.e(dVar, "<this>");
        nk.k.e(iVar, "module");
        if (!nk.k.a(dVar.e(), kl.e.f28376c)) {
            return dVar.h() ? a(dVar.j(0), iVar) : dVar;
        }
        m1.o(dVar);
        return dVar;
    }

    public static final byte b(char c9) {
        if (c9 < '~') {
            return c.f30584b[c9];
        }
        return (byte) 0;
    }

    public static final void c(i iVar, String str) {
        iVar.j(iVar.f30591b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence d(int i4, CharSequence charSequence) {
        nk.k.e(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i4 != -1) {
                int i10 = i4 - 30;
                int i11 = i4 + 30;
                String str = i10 <= 0 ? "" : ".....";
                String str2 = i11 >= charSequence.length() ? "" : ".....";
                StringBuilder sbZ = d.h.z(str);
                if (i10 < 0) {
                    i10 = 0;
                }
                int length = charSequence.length();
                if (i11 > length) {
                    i11 = length;
                }
                sbZ.append(charSequence.subSequence(i10, i11).toString());
                sbZ.append(str2);
                return sbZ.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void e(kl.d dVar, nl.b bVar) {
        nk.k.e(dVar, "<this>");
        nk.k.e(bVar, "json");
        if (nk.k.a(dVar.e(), kl.f.f28378c)) {
            bVar.f29991a.getClass();
        }
    }

    public static final k f(kl.d dVar, nl.b bVar) {
        nk.k.e(dVar, "desc");
        ii.a aVarE = dVar.e();
        if (aVarE instanceof kl.a) {
            return k.f30601f;
        }
        if (nk.k.a(aVarE, kl.f.f28379d)) {
            return k.f30599d;
        }
        if (!nk.k.a(aVarE, kl.f.f28380e)) {
            return k.f30598c;
        }
        kl.d dVarA = a(dVar.j(0), bVar.f29992b);
        ii.a aVarE2 = dVarA.e();
        if ((aVarE2 instanceof kl.c) || nk.k.a(aVarE2, kl.e.f28377d)) {
            return k.f30600e;
        }
        bVar.f29991a.getClass();
        throw new e("Value of type '" + dVarA.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + dVarA.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }
}
