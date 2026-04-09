package org.snmp4j.transport;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import org.snmp4j.SNMP4JSettings;
import org.snmp4j.TransportMapping;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.TcpAddress;
import org.snmp4j.smi.TlsAddress;
import org.snmp4j.smi.UdpAddress;

/* loaded from: classes2.dex */
public class TransportMappings {
    public static final String TRANSPORT_MAPPINGS = "org.snmp4j.transportMappings";
    private static final String TRANSPORT_MAPPINGS_DEFAULT = "transports.properties";
    private Hashtable<String, Class<? extends TransportMapping>> transportMappings = null;
    private static final LogAdapter logger = LogFactory.getLogger(TransportMappings.class);
    private static TransportMappings instance = null;

    protected TransportMappings() {
    }

    public static TransportMappings getInstance() {
        if (instance == null) {
            instance = new TransportMappings();
        }
        return instance;
    }

    public TransportMapping<? extends Address> createTransportMapping(Address address) throws SecurityException {
        if (this.transportMappings == null) {
            registerTransportMappings();
        }
        Class<? extends TransportMapping> cls = this.transportMappings.get(address.getClass().getName());
        if (cls == null) {
            return null;
        }
        Class<?>[] clsArr = {address.getClass()};
        try {
            try {
                return cls.getConstructor(clsArr).newInstance(address);
            } catch (InvocationTargetException e10) {
                LogAdapter logAdapter = logger;
                if (logAdapter.isDebugEnabled()) {
                    e10.printStackTrace();
                }
                logAdapter.error(e10);
                throw new RuntimeException(e10.getTargetException());
            } catch (Exception e11) {
                LogAdapter logAdapter2 = logger;
                if (logAdapter2.isDebugEnabled()) {
                    e11.printStackTrace();
                }
                logAdapter2.error(e11);
                return null;
            }
        } catch (NoSuchMethodException e12) {
            for (Constructor<?> constructor : cls.getConstructors()) {
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0].isAssignableFrom(clsArr[0])) {
                    return (TransportMapping) constructor.newInstance(address);
                }
            }
            logger.error("NoSuchMethodException while instantiating " + cls.getName(), e12);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected synchronized void registerTransportMappings() {
        if (SNMP4JSettings.isExtensibilityEnabled()) {
            String property = System.getProperty(TRANSPORT_MAPPINGS, TRANSPORT_MAPPINGS_DEFAULT);
            InputStream resourceAsStream = TransportMappings.class.getResourceAsStream(property);
            if (resourceAsStream == null) {
                throw new InternalError("Could not read '" + property + "' from classpath!");
            }
            Properties properties = new Properties();
            try {
                try {
                    properties.load(resourceAsStream);
                    Hashtable<String, Class<? extends TransportMapping>> hashtable = new Hashtable<>(properties.size());
                    Enumeration<?> enumerationPropertyNames = properties.propertyNames();
                    while (enumerationPropertyNames.hasMoreElements()) {
                        String string = enumerationPropertyNames.nextElement().toString();
                        try {
                            hashtable.put(string, Class.forName(properties.getProperty(string)));
                        } catch (ClassNotFoundException e10) {
                            logger.error(e10);
                        }
                    }
                    this.transportMappings = hashtable;
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
            Hashtable<String, Class<? extends TransportMapping>> hashtable2 = new Hashtable<>(2);
            hashtable2.put(UdpAddress.class.getName(), DefaultUdpTransportMapping.class);
            hashtable2.put(TcpAddress.class.getName(), DefaultTcpTransportMapping.class);
            hashtable2.put(TlsAddress.class.getName(), TLSTM.class);
            this.transportMappings = hashtable2;
        }
    }
}
