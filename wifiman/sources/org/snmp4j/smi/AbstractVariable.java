package org.snmp4j.smi;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import org.snmp4j.SNMP4JSettings;
import org.snmp4j.asn1.BERInputStream;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;

/* loaded from: classes2.dex */
public abstract class AbstractVariable implements Variable, Serializable {
    public static final String SMISYNTAXES_PROPERTIES = "org.snmp4j.smisyntaxes";
    private static final String SMISYNTAXES_PROPERTIES_DEFAULT = "smisyntaxes.properties";
    private static final long serialVersionUID = 1395840752909725320L;
    private static final Object[][] SYNTAX_NAME_MAPPING = {new Object[]{"Integer32", 2}, new Object[]{"BIT STRING", 3}, new Object[]{"OCTET STRING", 4}, new Object[]{"OBJECT IDENTIFIER", 6}, new Object[]{"TimeTicks", 67}, new Object[]{"Counter", 65}, new Object[]{"Counter64", 70}, new Object[]{"EndOfMibView", 130}, new Object[]{"Gauge", 66}, new Object[]{"Unsigned32", 66}, new Object[]{"IpAddress", 64}, new Object[]{"NoSuchInstance", 129}, new Object[]{"NoSuchObject", 128}, new Object[]{"Null", 5}, new Object[]{"Opaque", 68}};
    private static Hashtable<Integer, Class<? extends Variable>> registeredSyntaxes = null;
    private static final LogAdapter logger = LogFactory.getLogger(AbstractVariable.class);

    public static Variable createFromBER(BERInputStream bERInputStream) throws IllegalAccessException, InstantiationException, IOException {
        Variable variableCreateVariable;
        if (!bERInputStream.markSupported()) {
            throw new IOException("InputStream for decoding a Variable must support marks");
        }
        if (SNMP4JSettings.isExtensibilityEnabled() && registeredSyntaxes == null) {
            registerSyntaxes();
        }
        bERInputStream.mark(2);
        int i10 = bERInputStream.read();
        if (SNMP4JSettings.isExtensibilityEnabled()) {
            Class<? extends Variable> cls = registeredSyntaxes.get(Integer.valueOf(i10));
            if (cls == null) {
                throw new IOException("Encountered unsupported variable syntax: " + i10);
            }
            try {
                variableCreateVariable = cls.newInstance();
            } catch (IllegalAccessException unused) {
                throw new IOException("Could not access variable syntax class for: " + cls.getName());
            } catch (InstantiationException unused2) {
                throw new IOException("Could not instantiate variable syntax class for: " + cls.getName());
            }
        } else {
            variableCreateVariable = createVariable(i10);
        }
        bERInputStream.reset();
        variableCreateVariable.decodeBER(bERInputStream);
        return variableCreateVariable;
    }

    public static Variable createFromSyntax(int i10) {
        if (!SNMP4JSettings.isExtensibilityEnabled()) {
            return createVariable(i10);
        }
        if (registeredSyntaxes == null) {
            registerSyntaxes();
        }
        Class<? extends Variable> cls = registeredSyntaxes.get(Integer.valueOf(i10));
        if (cls == null) {
            throw new IllegalArgumentException("Unsupported variable syntax: " + i10);
        }
        try {
            return cls.newInstance();
        } catch (IllegalAccessException unused) {
            throw new RuntimeException("Could not access variable syntax class for: " + cls.getName());
        } catch (InstantiationException unused2) {
            throw new RuntimeException("Could not instantiate variable syntax class for: " + cls.getName());
        }
    }

    private static Variable createVariable(int i10) {
        if (i10 == 2) {
            return new Integer32();
        }
        if (i10 == 70) {
            return new Counter64();
        }
        if (i10 == 4) {
            return new OctetString();
        }
        if (i10 == 5) {
            return new Null();
        }
        if (i10 == 6) {
            return new OID();
        }
        switch (i10) {
            case 64:
                return new IpAddress();
            case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
                return new Counter32();
            case 66:
                return new Gauge32();
            case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
                return new TimeTicks();
            case SMIConstants.SYNTAX_OPAQUE /* 68 */:
                return new Opaque();
            default:
                switch (i10) {
                    case 128:
                        return new Null(128);
                    case 129:
                        return new Null(129);
                    case 130:
                        return new Null(130);
                    default:
                        throw new IllegalArgumentException("Unsupported variable syntax: " + i10);
                }
        }
    }

    public static boolean equal(AbstractVariable abstractVariable, AbstractVariable abstractVariable2) {
        return abstractVariable == null ? abstractVariable2 == null : abstractVariable.equals(abstractVariable2);
    }

    public static int getSyntaxFromString(String str) {
        for (Object[] objArr : SYNTAX_NAME_MAPPING) {
            if (objArr[0].equals(str)) {
                return ((Integer) objArr[1]).intValue();
            }
        }
        return 5;
    }

    public static String getSyntaxString(int i10) {
        if (i10 == 2) {
            return "Integer32";
        }
        if (i10 == 3) {
            return "BIT STRING";
        }
        if (i10 == 4) {
            return "OCTET STRING";
        }
        if (i10 == 5) {
            return "Null";
        }
        if (i10 == 6) {
            return "OBJECT IDENTIFIER";
        }
        if (i10 == 70) {
            return "Counter64";
        }
        switch (i10) {
            case 64:
                return "IpAddress";
            case SMIConstants.SYNTAX_COUNTER32 /* 65 */:
                return "Counter";
            case 66:
                return "Gauge";
            case SMIConstants.SYNTAX_TIMETICKS /* 67 */:
                return "TimeTicks";
            case SMIConstants.SYNTAX_OPAQUE /* 68 */:
                return "Opaque";
            default:
                switch (i10) {
                    case 128:
                        return "NoSuchObject";
                    case 129:
                        return "NoSuchInstance";
                    case 130:
                        return "EndOfMibView";
                    default:
                        return "?";
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static synchronized void registerSyntaxes() {
        String property = System.getProperty(SMISYNTAXES_PROPERTIES, SMISYNTAXES_PROPERTIES_DEFAULT);
        InputStream resourceAsStream = Variable.class.getResourceAsStream(property);
        if (resourceAsStream == null) {
            throw new InternalError("Could not read '" + property + "' from classpath!");
        }
        Properties properties = new Properties();
        try {
            try {
                properties.load(resourceAsStream);
                Hashtable<Integer, Class<? extends Variable>> hashtable = new Hashtable<>(properties.size());
                Enumeration<?> enumerationPropertyNames = properties.propertyNames();
                while (enumerationPropertyNames.hasMoreElements()) {
                    String string = enumerationPropertyNames.nextElement().toString();
                    try {
                        hashtable.put(new Integer(string), Class.forName(properties.getProperty(string)));
                    } catch (ClassCastException e10) {
                        logger.error(e10);
                    } catch (ClassNotFoundException e11) {
                        logger.error(e11);
                    }
                }
                registeredSyntaxes = hashtable;
            } finally {
                try {
                    resourceAsStream.close();
                } catch (IOException e12) {
                    logger.warn(e12);
                }
            }
        } catch (IOException e13) {
            String str = "Could not read '" + property + "': " + e13.getMessage();
            logger.error(str);
            throw new InternalError(str);
        }
    }

    @Override // org.snmp4j.smi.Variable
    public abstract Object clone();

    @Override // org.snmp4j.smi.Variable, java.lang.Comparable
    public abstract int compareTo(Variable variable);

    public abstract void decodeBER(BERInputStream bERInputStream) throws IOException;

    @Override // org.snmp4j.asn1.BERSerializable
    public abstract void encodeBER(OutputStream outputStream) throws IOException;

    @Override // org.snmp4j.smi.Variable
    public abstract boolean equals(Object obj);

    @Override // org.snmp4j.smi.Variable
    public abstract void fromSubIndex(OID oid, boolean z10);

    @Override // org.snmp4j.asn1.BERSerializable
    public abstract int getBERLength();

    @Override // org.snmp4j.asn1.BERSerializable
    public int getBERPayloadLength() {
        return getBERLength();
    }

    @Override // org.snmp4j.smi.Variable
    public abstract int getSyntax();

    @Override // org.snmp4j.smi.Variable
    public abstract int hashCode();

    @Override // org.snmp4j.smi.Variable
    public boolean isDynamic() {
        return false;
    }

    @Override // org.snmp4j.smi.Variable
    public boolean isException() {
        return Null.isExceptionSyntax(getSyntax());
    }

    @Override // org.snmp4j.smi.Variable
    public abstract int toInt();

    @Override // org.snmp4j.smi.Variable
    public abstract long toLong();

    @Override // org.snmp4j.smi.Variable
    public abstract String toString();

    @Override // org.snmp4j.smi.Variable
    public abstract OID toSubIndex(boolean z10);

    @Override // org.snmp4j.smi.Variable
    public final String getSyntaxString() {
        return getSyntaxString(getSyntax());
    }
}
