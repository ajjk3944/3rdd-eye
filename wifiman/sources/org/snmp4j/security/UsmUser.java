package org.snmp4j.security;

import org.snmp4j.SNMP4JSettings;
import org.snmp4j.User;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.Variable;

/* loaded from: classes2.dex */
public class UsmUser implements User, Comparable, Cloneable {
    private static final long serialVersionUID = -2258973598142206767L;
    private OctetString authenticationPassphrase;
    private OID authenticationProtocol;
    private OctetString localizationEngineID;
    private OctetString privacyPassphrase;
    private OID privacyProtocol;
    private OctetString securityName;

    public UsmUser(OctetString octetString, OID oid, OctetString octetString2, OID oid2, OctetString octetString3) {
        octetString.getClass();
        if (SNMP4JSettings.isCheckUsmUserPassphraseLength()) {
            if (oid != null && octetString2 != null && octetString2.length() < 8) {
                throw new IllegalArgumentException("USM passphrases must be at least 8 bytes long (RFC3414 §11.2)");
            }
            if (oid2 != null && octetString3 != null && octetString3.length() < 8) {
                throw new IllegalArgumentException("USM passphrases must be at least 8 bytes long (RFC3414 §11.2)");
            }
        }
        this.securityName = octetString;
        this.authenticationProtocol = oid;
        this.authenticationPassphrase = octetString2;
        this.privacyProtocol = oid2;
        this.privacyPassphrase = octetString3;
    }

    public Object clone() {
        return new UsmUser(this.securityName, this.authenticationProtocol, this.authenticationPassphrase, this.privacyProtocol, this.privacyPassphrase, this.localizationEngineID);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return this.securityName.compareTo((Variable) ((UsmUser) obj).securityName);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UsmUser usmUser = (UsmUser) obj;
        if (!this.securityName.equals(usmUser.securityName)) {
            return false;
        }
        OctetString octetString = this.authenticationPassphrase;
        if (octetString == null ? usmUser.authenticationPassphrase != null : !octetString.equals(usmUser.authenticationPassphrase)) {
            return false;
        }
        OctetString octetString2 = this.privacyPassphrase;
        if (octetString2 == null ? usmUser.privacyPassphrase != null : !octetString2.equals(usmUser.privacyPassphrase)) {
            return false;
        }
        OID oid = this.authenticationProtocol;
        if (oid == null ? usmUser.authenticationProtocol != null : !oid.equals(usmUser.authenticationProtocol)) {
            return false;
        }
        OID oid2 = this.privacyProtocol;
        if (oid2 == null ? usmUser.privacyProtocol != null : !oid2.equals(usmUser.privacyProtocol)) {
            return false;
        }
        OctetString octetString3 = this.localizationEngineID;
        OctetString octetString4 = usmUser.localizationEngineID;
        return octetString3 == null ? octetString4 == null : octetString3.equals(octetString4);
    }

    public OctetString getAuthenticationPassphrase() {
        OctetString octetString = this.authenticationPassphrase;
        if (octetString == null) {
            return null;
        }
        return (OctetString) octetString.clone();
    }

    public OID getAuthenticationProtocol() {
        OID oid = this.authenticationProtocol;
        if (oid == null) {
            return null;
        }
        return (OID) oid.clone();
    }

    public OctetString getLocalizationEngineID() {
        return this.localizationEngineID;
    }

    public OctetString getPrivacyPassphrase() {
        OctetString octetString = this.privacyPassphrase;
        if (octetString == null) {
            return null;
        }
        return (OctetString) octetString.clone();
    }

    public OID getPrivacyProtocol() {
        OID oid = this.privacyProtocol;
        if (oid == null) {
            return null;
        }
        return (OID) oid.clone();
    }

    public int getSecurityModel() {
        return 3;
    }

    public OctetString getSecurityName() {
        return (OctetString) this.securityName.clone();
    }

    public int hashCode() {
        return this.securityName.hashCode();
    }

    public boolean isLocalized() {
        return this.localizationEngineID != null;
    }

    public String toString() {
        return "UsmUser[secName=" + this.securityName + ",authProtocol=" + this.authenticationProtocol + ",authPassphrase=" + this.authenticationPassphrase + ",privProtocol=" + this.privacyProtocol + ",privPassphrase=" + this.privacyPassphrase + ",localizationEngineID=" + getLocalizationEngineID() + "]";
    }

    public UsmUser(OctetString octetString, OID oid, OctetString octetString2, OID oid2, OctetString octetString3, OctetString octetString4) {
        this(octetString, oid, octetString2, oid2, octetString3);
        this.localizationEngineID = octetString4;
    }
}
