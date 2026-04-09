package com.google.android.gms.internal.ads;

import j$.util.Base64;
import j$.util.Optional;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class Uz {

    /* renamed from: a, reason: collision with root package name */
    public Optional f11852a;

    /* renamed from: b, reason: collision with root package name */
    public Optional f11853b;

    public final boolean a(C1891t7 c1891t7) throws GeneralSecurityException {
        byte[] bArrU = c1891t7.A().B().B().u();
        byte[] bArrU2 = c1891t7.A().D().u();
        try {
            try {
                if (this.f11852a == null && this.f11853b == null) {
                    try {
                        BJ.a();
                        C2041vw c2041vwB = AbstractC1984ut.b(new String(Base64.getDecoder().decode("eyJwcmltYXJ5S2V5SWQiOjMzMTUxOTk4MTksImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQVNoRGZwOUM5QjcrMU1nMmJQbHJ5WExPOHVScDd6YWZJMldSYURmR1ZqVmlJaEFJNFZzTmVrcCs0bVY0d2toZlhVb3pQZWs5TjgxcUdIK2plNnhjOFpoQkhQIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMzE1MTk5ODE5LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=")));
                        C1792rG c1792rG = C1792rG.f16506c;
                        this.f11852a = Optional.of((InterfaceC1199gE) c2041vwB.A(c1792rG, InterfaceC1199gE.class));
                        this.f11853b = Optional.of((InterfaceC1199gE) AbstractC1984ut.b(new String(Base64.getDecoder().decode("eyJwcmltYXJ5S2V5SWQiOjMwODI3ODA4ODgsImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQkEyWW5HaWFpc3pEcGtJcWpjalorUTJ2alFUUldQZjhFcTlkZVlhNFpKa3lJaEFCQWFESTd6QWJkQXVpQmlnOWdHSkJ1VTUzSGg5Z0RCa0t2amswS2tabDhjIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMDgyNzgwODg4LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0="))).A(c1792rG, InterfaceC1199gE.class));
                    } catch (Exception e6) {
                        throw new GeneralSecurityException("Failed to verify program", e6);
                    }
                }
                this.f11852a.isPresent();
                ((InterfaceC1199gE) this.f11852a.get()).a(bArrU, bArrU2);
                return true;
            } catch (GeneralSecurityException unused) {
                this.f11853b.isPresent();
                ((InterfaceC1199gE) this.f11853b.get()).a(bArrU, bArrU2);
                return true;
            }
        } catch (GeneralSecurityException unused2) {
            return false;
        }
    }
}
