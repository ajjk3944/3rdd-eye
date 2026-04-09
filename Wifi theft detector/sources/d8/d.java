package d8;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* loaded from: classes3.dex */
public abstract class d {
    public static PublicKey a(String str) throws IOException {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        } catch (InvalidKeySpecException e11) {
            String str2 = "Invalid key specification: " + e11;
            Log.w("IABUtil/Security", str2);
            throw new IOException(str2);
        }
    }

    public static Boolean b(PublicKey publicKey, String str, String str2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        try {
            byte[] bArrDecode = Base64.decode(str2, 0);
            try {
                Signature signature = Signature.getInstance("SHA1withRSA");
                signature.initVerify(publicKey);
                signature.update(str.getBytes());
                if (signature.verify(bArrDecode)) {
                    return Boolean.TRUE;
                }
                Log.w("IABUtil/Security", "Signature verification failed...");
                return Boolean.FALSE;
            } catch (InvalidKeyException unused) {
                Log.e("IABUtil/Security", "Invalid key specification.");
                return Boolean.FALSE;
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            } catch (SignatureException unused2) {
                Log.e("IABUtil/Security", "Signature exception.");
                return Boolean.FALSE;
            }
        } catch (IllegalArgumentException unused3) {
            Log.w("IABUtil/Security", "Base64 decoding failed.");
            return Boolean.FALSE;
        }
    }

    public static boolean c(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwFzld8M0BoFRNYWgk4MQuPC435MW1KxRTA52AZTEVy55fUhaSTIW9PCjliRHeWov0R+WbgCz3S4nqJQlLVq4F1G1eR8V/nFnyPy9PsOXCqXaWx1mXikgnLDzR5X0D2yjDuBOcIIVRY86lZ5xNJvJHUZB1gY8/hGfP4pS0awFmuYBxzPtBGMdc0vTpgqmd3ByZ2/fMy0udrO/XEQukeTWCjUak1kI2WjEtDBJEbLDwPKtmNV/jmFLntmEysmG328sF5ODvkto/+vL0X3Xpso6YvimEhGyA6BCqrmAcSTID2rn7GHF0e35r3zpiDVbQaoBWukJk98D3a3mF2lVdivoEwIDAQAB") || TextUtils.isEmpty(str2)) {
            Log.w("IABUtil/Security", "Purchase verification failed: missing data.");
            return false;
        }
        try {
            return b(a("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwFzld8M0BoFRNYWgk4MQuPC435MW1KxRTA52AZTEVy55fUhaSTIW9PCjliRHeWov0R+WbgCz3S4nqJQlLVq4F1G1eR8V/nFnyPy9PsOXCqXaWx1mXikgnLDzR5X0D2yjDuBOcIIVRY86lZ5xNJvJHUZB1gY8/hGfP4pS0awFmuYBxzPtBGMdc0vTpgqmd3ByZ2/fMy0udrO/XEQukeTWCjUak1kI2WjEtDBJEbLDwPKtmNV/jmFLntmEysmG328sF5ODvkto/+vL0X3Xpso6YvimEhGyA6BCqrmAcSTID2rn7GHF0e35r3zpiDVbQaoBWukJk98D3a3mF2lVdivoEwIDAQAB"), str, str2).booleanValue();
        } catch (IOException e10) {
            Log.e("IABUtil/Security", "Error generating PublicKey from encoded key: " + e10.getMessage());
            return false;
        }
    }
}
