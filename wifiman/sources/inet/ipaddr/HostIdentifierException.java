package inet.ipaddr;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* loaded from: classes4.dex */
public class HostIdentifierException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    static ResourceBundle f49272a;

    static {
        String str = HostIdentifierException.class.getPackage().getName() + ".IPAddressResources";
        try {
            f49272a = ResourceBundle.getBundle(str);
        } catch (MissingResourceException unused) {
            System.err.println("bundle " + str + " is missing");
        }
    }

    public HostIdentifierException(CharSequence charSequence, String str, String str2, Throwable th2) {
        super(charSequence.toString() + ' ' + str + ' ' + a(str2), th2);
    }

    static String a(String str) {
        ResourceBundle resourceBundle = f49272a;
        if (resourceBundle == null) {
            return str;
        }
        try {
            return resourceBundle.getString(str);
        } catch (MissingResourceException unused) {
            return str;
        }
    }

    public HostIdentifierException(CharSequence charSequence, String str, String str2) {
        super(charSequence.toString() + ' ' + str + ' ' + a(str2));
    }

    public HostIdentifierException(CharSequence charSequence) {
        super(charSequence.toString());
    }

    public HostIdentifierException(CharSequence charSequence, Throwable th2) {
        super(charSequence.toString(), th2);
    }

    public HostIdentifierException(CharSequence charSequence, String str) {
        super(charSequence.toString() + ' ' + a(str));
    }
}
