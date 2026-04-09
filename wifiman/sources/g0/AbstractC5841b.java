package g0;

import Yg.z;
import Zg.U;
import java.util.HashMap;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5841b {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap f47368a = U.j(z.a(j.EmailAddress, "emailAddress"), z.a(j.Username, "username"), z.a(j.Password, "password"), z.a(j.NewUsername, "newUsername"), z.a(j.NewPassword, "newPassword"), z.a(j.PostalAddress, "postalAddress"), z.a(j.PostalCode, "postalCode"), z.a(j.CreditCardNumber, "creditCardNumber"), z.a(j.CreditCardSecurityCode, "creditCardSecurityCode"), z.a(j.CreditCardExpirationDate, "creditCardExpirationDate"), z.a(j.CreditCardExpirationMonth, "creditCardExpirationMonth"), z.a(j.CreditCardExpirationYear, "creditCardExpirationYear"), z.a(j.CreditCardExpirationDay, "creditCardExpirationDay"), z.a(j.AddressCountry, "addressCountry"), z.a(j.AddressRegion, "addressRegion"), z.a(j.AddressLocality, "addressLocality"), z.a(j.AddressStreet, "streetAddress"), z.a(j.AddressAuxiliaryDetails, "extendedAddress"), z.a(j.PostalCodeExtended, "extendedPostalCode"), z.a(j.PersonFullName, "personName"), z.a(j.PersonFirstName, "personGivenName"), z.a(j.PersonLastName, "personFamilyName"), z.a(j.PersonMiddleName, "personMiddleName"), z.a(j.PersonMiddleInitial, "personMiddleInitial"), z.a(j.PersonNamePrefix, "personNamePrefix"), z.a(j.PersonNameSuffix, "personNameSuffix"), z.a(j.PhoneNumber, "phoneNumber"), z.a(j.PhoneNumberDevice, "phoneNumberDevice"), z.a(j.PhoneCountryCode, "phoneCountryCode"), z.a(j.PhoneNumberNational, "phoneNational"), z.a(j.Gender, "gender"), z.a(j.BirthDateFull, "birthDateFull"), z.a(j.BirthDateDay, "birthDateDay"), z.a(j.BirthDateMonth, "birthDateMonth"), z.a(j.BirthDateYear, "birthDateYear"), z.a(j.SmsOtpCode, "smsOTPCode"));

    public static final String a(j jVar) {
        String str = (String) f47368a.get(jVar);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type");
    }
}
