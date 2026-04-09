.class public abstract Lg0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 38

    sget-object v0, Lg0/j;->EmailAddress:Lg0/j;

    const-string v1, "emailAddress"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v2

    sget-object v0, Lg0/j;->Username:Lg0/j;

    const-string v1, "username"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v3

    sget-object v0, Lg0/j;->Password:Lg0/j;

    const-string v1, "password"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v4

    sget-object v0, Lg0/j;->NewUsername:Lg0/j;

    const-string v1, "newUsername"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v5

    sget-object v0, Lg0/j;->NewPassword:Lg0/j;

    const-string v1, "newPassword"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v6

    sget-object v0, Lg0/j;->PostalAddress:Lg0/j;

    const-string v1, "postalAddress"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v7

    sget-object v0, Lg0/j;->PostalCode:Lg0/j;

    const-string v1, "postalCode"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v8

    sget-object v0, Lg0/j;->CreditCardNumber:Lg0/j;

    const-string v1, "creditCardNumber"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v9

    sget-object v0, Lg0/j;->CreditCardSecurityCode:Lg0/j;

    const-string v1, "creditCardSecurityCode"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v10

    sget-object v0, Lg0/j;->CreditCardExpirationDate:Lg0/j;

    const-string v1, "creditCardExpirationDate"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v11

    sget-object v0, Lg0/j;->CreditCardExpirationMonth:Lg0/j;

    const-string v1, "creditCardExpirationMonth"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v12

    sget-object v0, Lg0/j;->CreditCardExpirationYear:Lg0/j;

    const-string v1, "creditCardExpirationYear"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v13

    sget-object v0, Lg0/j;->CreditCardExpirationDay:Lg0/j;

    const-string v1, "creditCardExpirationDay"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v14

    sget-object v0, Lg0/j;->AddressCountry:Lg0/j;

    const-string v1, "addressCountry"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v15

    sget-object v0, Lg0/j;->AddressRegion:Lg0/j;

    const-string v1, "addressRegion"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v16

    sget-object v0, Lg0/j;->AddressLocality:Lg0/j;

    const-string v1, "addressLocality"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v17

    sget-object v0, Lg0/j;->AddressStreet:Lg0/j;

    const-string v1, "streetAddress"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v18

    sget-object v0, Lg0/j;->AddressAuxiliaryDetails:Lg0/j;

    const-string v1, "extendedAddress"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v19

    sget-object v0, Lg0/j;->PostalCodeExtended:Lg0/j;

    const-string v1, "extendedPostalCode"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v20

    sget-object v0, Lg0/j;->PersonFullName:Lg0/j;

    const-string v1, "personName"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v21

    sget-object v0, Lg0/j;->PersonFirstName:Lg0/j;

    const-string v1, "personGivenName"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v22

    sget-object v0, Lg0/j;->PersonLastName:Lg0/j;

    const-string v1, "personFamilyName"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v23

    sget-object v0, Lg0/j;->PersonMiddleName:Lg0/j;

    const-string v1, "personMiddleName"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v24

    sget-object v0, Lg0/j;->PersonMiddleInitial:Lg0/j;

    const-string v1, "personMiddleInitial"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v25

    sget-object v0, Lg0/j;->PersonNamePrefix:Lg0/j;

    const-string v1, "personNamePrefix"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v26

    sget-object v0, Lg0/j;->PersonNameSuffix:Lg0/j;

    const-string v1, "personNameSuffix"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v27

    sget-object v0, Lg0/j;->PhoneNumber:Lg0/j;

    const-string v1, "phoneNumber"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v28

    sget-object v0, Lg0/j;->PhoneNumberDevice:Lg0/j;

    const-string v1, "phoneNumberDevice"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v29

    sget-object v0, Lg0/j;->PhoneCountryCode:Lg0/j;

    const-string v1, "phoneCountryCode"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v30

    sget-object v0, Lg0/j;->PhoneNumberNational:Lg0/j;

    const-string v1, "phoneNational"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v31

    sget-object v0, Lg0/j;->Gender:Lg0/j;

    const-string v1, "gender"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v32

    sget-object v0, Lg0/j;->BirthDateFull:Lg0/j;

    const-string v1, "birthDateFull"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v33

    sget-object v0, Lg0/j;->BirthDateDay:Lg0/j;

    const-string v1, "birthDateDay"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v34

    sget-object v0, Lg0/j;->BirthDateMonth:Lg0/j;

    const-string v1, "birthDateMonth"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v35

    sget-object v0, Lg0/j;->BirthDateYear:Lg0/j;

    const-string v1, "birthDateYear"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v36

    sget-object v0, Lg0/j;->SmsOtpCode:Lg0/j;

    const-string v1, "smsOTPCode"

    invoke-static {v0, v1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v37

    filled-new-array/range {v2 .. v37}, [LYg/s;

    move-result-object v0

    invoke-static {v0}, LZg/U;->j([LYg/s;)Ljava/util/HashMap;

    move-result-object v0

    sput-object v0, Lg0/b;->a:Ljava/util/HashMap;

    return-void
.end method

.method public static final a(Lg0/j;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lg0/b;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unsupported autofill type"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
