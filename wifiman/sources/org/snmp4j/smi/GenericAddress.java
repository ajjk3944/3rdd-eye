package org.snmp4j.smi;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import org.snmp4j.SNMP4JSettings;
import org.snmp4j.asn1.BERInputStream;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;

/* loaded from: classes2.dex */
public class GenericAddress extends SMIAddress {
    public static final String ADDRESS_TYPES_PROPERTIES = "org.snmp4j.addresses";
    private static final String ADDRESS_TYPES_PROPERTIES_DEFAULT = "address.properties";
    public static final String TYPE_IP = "ip";
    public static final String TYPE_TCP = "tcp";
    public static final String TYPE_TLS = "tls";
    public static final String TYPE_UDP = "udp";
    static final long serialVersionUID = -6102594326202231511L;
    private SMIAddress address;
    private static final LogAdapter logger = LogFactory.getLogger(GenericAddress.class);
    private static Map<String, Class<? extends Address>> knownAddressTypes = null;

    public GenericAddress() {
    }

    public static String getTDomainPrefix(Class<? extends Address> cls) {
        if (knownAddressTypes == null) {
            registerAddressTypes();
        }
        for (Map.Entry<String, Class<? extends Address>> entry : knownAddressTypes.entrySet()) {
            if (entry.getValue().equals(cls)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static Address parse(String str) throws IllegalAccessException, InstantiationException {
        String strSubstring;
        if (knownAddressTypes == null) {
            registerAddressTypes();
        }
        int iIndexOf = str.indexOf(58);
        if (iIndexOf > 0) {
            strSubstring = str.substring(0, iIndexOf);
            str = str.substring(iIndexOf + 1);
        } else {
            strSubstring = TYPE_UDP;
        }
        String lowerCase = strSubstring.toLowerCase();
        Class<? extends Address> cls = knownAddressTypes.get(lowerCase);
        if (cls == null) {
            throw new IllegalArgumentException("Address type " + lowerCase + " unknown");
        }
        try {
            Address addressNewInstance = cls.newInstance();
            if (addressNewInstance.parseAddress(str)) {
                return addressNewInstance;
            }
            return null;
        } catch (Exception e10) {
            logger.warn(e10);
            return null;
        }
    }

    private static synchronized void registerAddressTypes() {
        if (SNMP4JSettings.isExtensibilityEnabled()) {
            String property = System.getProperty(ADDRESS_TYPES_PROPERTIES, ADDRESS_TYPES_PROPERTIES_DEFAULT);
            InputStream resourceAsStream = Variable.class.getResourceAsStream(property);
            if (resourceAsStream == null) {
                throw new InternalError("Could not read '" + property + "' from classpath!");
            }
            Properties properties = new Properties();
            try {
                try {
                    properties.load(resourceAsStream);
                    TreeMap treeMap = new TreeMap();
                    Enumeration<?> enumerationPropertyNames = properties.propertyNames();
                    while (enumerationPropertyNames.hasMoreElements()) {
                        String string = enumerationPropertyNames.nextElement().toString();
                        String property2 = properties.getProperty(string);
                        try {
                            treeMap.put(string, Class.forName(property2));
                        } catch (ClassCastException unused) {
                            logger.error("Class name '" + property2 + "' is not a subclass of " + Address.class.getName());
                        } catch (ClassNotFoundException e10) {
                            logger.error(e10);
                        }
                    }
                    knownAddressTypes = treeMap;
                } catch (IOException e11) {
                    String str = "Could not read '" + property + "': " + e11.getMessage();
                    logger.error(str);
                    throw new InternalError(str);
                }
            } finally {
                try {
                    resourceAsStream.close();
                } catch (IOException e12) {
                    logger.warn(e12);
                }
            }
        } else {
            TreeMap treeMap2 = new TreeMap();
            treeMap2.put(TYPE_UDP, UdpAddress.class);
            treeMap2.put(TYPE_TCP, TcpAddress.class);
            treeMap2.put(TYPE_IP, IpAddress.class);
            treeMap2.put(TYPE_TLS, TlsAddress.class);
            knownAddressTypes = treeMap2;
        }
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public Object clone() {
        return new GenericAddress(this.address);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public void decodeBER(BERInputStream bERInputStream) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public void encodeBER(OutputStream outputStream) throws IOException {
        this.address.encodeBER(outputStream);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public boolean equals(Object obj) {
        return this.address.equals(obj);
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public void fromSubIndex(OID oid, boolean z10) {
        throw new UnsupportedOperationException();
    }

    public Address getAddress() {
        return this.address;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.asn1.BERSerializable
    public int getBERLength() {
        return this.address.getBERLength();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int getSyntax() {
        return this.address.getSyntax();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int hashCode() {
        return this.address.hashCode();
    }

    @Override // org.snmp4j.smi.Address
    public boolean isValid() {
        SMIAddress sMIAddress = this.address;
        return sMIAddress != null && sMIAddress.isValid();
    }

    @Override // org.snmp4j.smi.Address
    public boolean parseAddress(String str) throws IllegalAccessException, InstantiationException {
        Address address = parse(str);
        if (!(address instanceof SMIAddress)) {
            return false;
        }
        setAddress((SMIAddress) address);
        return true;
    }

    public void setAddress(SMIAddress sMIAddress) {
        this.address = sMIAddress;
    }

    @Override // org.snmp4j.smi.AssignableFromByteArray
    public void setValue(byte[] bArr) {
        this.address.setValue(bArr);
    }

    @Override // org.snmp4j.smi.AssignableFromByteArray
    public byte[] toByteArray() {
        return this.address.toByteArray();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public int toInt() {
        throw new UnsupportedOperationException();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public long toLong() {
        throw new UnsupportedOperationException();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public String toString() {
        return this.address.toString();
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable
    public OID toSubIndex(boolean z10) {
        throw new UnsupportedOperationException();
    }

    public GenericAddress(SMIAddress sMIAddress) {
        this.address = sMIAddress;
    }

    @Override // org.snmp4j.smi.AbstractVariable, org.snmp4j.smi.Variable, java.lang.Comparable
    public int compareTo(Variable variable) {
        return this.address.compareTo(variable);
    }

    @Override // org.snmp4j.smi.Address, org.snmp4j.smi.AssignableFromString
    public void setValue(String str) {
        if (parseAddress(str)) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be parsed by " + getClass().getName());
    }
}
