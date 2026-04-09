package org.snmp4j.security.dh;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKeyFactory;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import javax.crypto.spec.DHPublicKeySpec;
import javax.crypto.spec.PBEKeySpec;
import org.snmp4j.Session;
import org.snmp4j.Target;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;
import org.snmp4j.security.SecurityProtocols;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.Variable;
import org.snmp4j.util.PDUFactory;
import org.snmp4j.util.TableEvent;
import org.snmp4j.util.TableUtils;

/* loaded from: classes2.dex */
public class DHOperations {
    public static final String DH_AUTH_PROTOCOL_PROPERTY = "dh.authProtocol.";
    public static final String DH_KICKSTART_SEC_NAME = "dhKickstart";
    public static final String DH_KICKSTART_VIEW_NAME = "dhKickRestricted";
    public static final String DH_PARAMS_PROPERTY = "dh.params";
    public static final String DH_PRIVATE_KEY_PROPERTY = "dh.privateKey.";
    public static final String DH_PRIV_PROTOCOL_PROPERTY = "dh.privProtocol.";
    public static final String DH_PUBLIC_KEY_PROPERTY = "dh.publicKey.";
    public static final String DH_RESET_PROPERTY = "dh.reset.";
    public static final String DH_VACM_ROLE_PROPERTY = "dh.vacm.role.";
    public static final String DIFFIE_HELLMAN = "DH";
    public static final String PBKDF2 = "PBKDF2WithHmacSHA1";
    private static final int PBKDF2_ITERATION_COUNT = 500;
    private static final LogAdapter LOGGER = LogFactory.getLogger(DHOperations.class);
    private static final OctetString PBKDF2_AUTH_SALT = OctetString.fromHexStringPairs("98dfb5ac");
    private static final OctetString PBKDF2_PRIV_SALT = OctetString.fromHexStringPairs("d1310ba6");
    public static final OID oidUsmDHKickstartMyPublic = new OID(new int[]{1, 3, 6, 1, 3, 101, 1, 2, 1, 1, 2});
    public static final OID oidUsmDHKickstartMgrPublic = new OID(new int[]{1, 3, 6, 1, 3, 101, 1, 2, 1, 1, 3});
    public static final OID oidUsmDHKickstartSecurityName = new OID(new int[]{1, 3, 6, 1, 3, 101, 1, 2, 1, 1, 4});

    public static class DHKeyInfo implements Serializable {
        private static final long serialVersionUID = -3564364027967850951L;
        private byte[] authKey;
        private final OID authProtocol;
        private byte[] privKey;
        private final OID privProtocol;
        private byte[] privateKey;
        private final OctetString userName;

        public DHKeyInfo(OctetString octetString, byte[] bArr, OID oid, OID oid2) {
            this.userName = octetString;
            this.privateKey = bArr;
            this.authProtocol = oid;
            this.privProtocol = oid2;
        }

        public byte[] getAuthKey() {
            return this.authKey;
        }

        public OID getAuthProtocol() {
            return this.authProtocol;
        }

        public byte[] getPrivKey() {
            return this.privKey;
        }

        public OID getPrivProtocol() {
            return this.privProtocol;
        }

        public byte[] getPrivateKey() {
            return this.privateKey;
        }

        public OctetString getUserName() {
            return this.userName;
        }

        public void setAuthKey(byte[] bArr) {
            this.authKey = bArr;
        }

        public void setPrivKey(byte[] bArr) {
            this.privKey = bArr;
        }
    }

    public enum KeyType {
        authKeyChange,
        privKeyChange
    }

    public static BigInteger bytesToBigInteger(byte[] bArr) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 1);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put(bArr);
        return new BigInteger(byteBufferAllocate.array());
    }

    public static byte[] computeSharedKey(KeyAgreement keyAgreement, byte[] bArr, DHParameters dHParameters) throws IllegalStateException, InvalidKeyException {
        if (keyAgreement == null) {
            return null;
        }
        try {
            keyAgreement.doPhase(KeyFactory.getInstance(DIFFIE_HELLMAN).generatePublic(new DHPublicKeySpec(bytesToBigInteger(bArr), dHParameters.getPrime(), dHParameters.getGenerator())), true);
            byte[] bArrGenerateSecret = keyAgreement.generateSecret();
            LogAdapter logAdapter = LOGGER;
            if (logAdapter.isDebugEnabled()) {
                logAdapter.debug("Computing shared key " + new OctetString(bArrGenerateSecret).toHexString() + " from public key " + new OctetString(bArr).toHexString() + " and parameters " + dHParameters);
            }
            return bArrGenerateSecret;
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static KeyPair createKeyPair(OctetString octetString, OctetString octetString2, DHParameters dHParameters) throws NoSuchAlgorithmException {
        try {
            KeyFactory keyFactory = KeyFactory.getInstance(DIFFIE_HELLMAN);
            return new KeyPair(keyFactory.generatePublic(new DHPublicKeySpec(bytesToBigInteger(octetString.getValue()), dHParameters.getPrime(), dHParameters.getGenerator())), keyFactory.generatePrivate(new DHPrivateKeySpec(bytesToBigInteger(octetString2.getValue()), dHParameters.getPrime(), dHParameters.getGenerator())));
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        } catch (InvalidKeySpecException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static byte[] deriveKey(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, bArr.length - i10, bArr2, 0, i10);
        return bArr2;
    }

    public static byte[] deriveKeyPBKDF2(byte[] bArr, int i10, SecurityProtocols.SecurityProtocolType securityProtocolType) {
        try {
            return SecretKeyFactory.getInstance(PBKDF2).generateSecret(new PBEKeySpec(new String(bArr).toCharArray(), (securityProtocolType == SecurityProtocols.SecurityProtocolType.authentication ? PBKDF2_AUTH_SALT : PBKDF2_PRIV_SALT).getValue(), PBKDF2_ITERATION_COUNT, i10 * 8)).getEncoded();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static OctetString derivePrivateKey(KeyPair keyPair) {
        return new OctetString(keyToBytes(keyPair.getPrivate()));
    }

    public static OctetString derivePublicKey(KeyPair keyPair) {
        return new OctetString(keyToBytes(keyPair.getPublic()));
    }

    public static KeyPair generatePublicKey(DHParameters dHParameters) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        DHParameterSpec dHParameterSpec = new DHParameterSpec(dHParameters.getPrime(), dHParameters.getGenerator(), dHParameters.getPrivateValueLength());
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(DIFFIE_HELLMAN);
        keyPairGenerator.initialize(dHParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    public static Map<OctetString, OctetString[]> getDHKickstartPublicKeys(Session session, PDUFactory pDUFactory, Target target, Set<OctetString> set) throws IOException {
        target.setSecurityName(new OctetString(DH_KICKSTART_SEC_NAME));
        List<TableEvent> table = new TableUtils(session, pDUFactory).getTable(target, new OID[]{oidUsmDHKickstartMyPublic, oidUsmDHKickstartMgrPublic, oidUsmDHKickstartSecurityName}, null, null);
        HashMap map = new HashMap();
        for (TableEvent tableEvent : table) {
            if (tableEvent.getStatus() == 0) {
                Variable variable = tableEvent.getColumns()[1].getVariable();
                if (!tableEvent.isError() && (variable instanceof OctetString) && set.contains(variable)) {
                    map.put((OctetString) variable, new OctetString[]{(OctetString) tableEvent.getColumns()[0].getVariable(), (OctetString) tableEvent.getColumns()[2].getVariable()});
                } else {
                    LogAdapter logAdapter = LOGGER;
                    if (logAdapter.isDebugEnabled()) {
                        logAdapter.debug("DH kickstart table retrieval from '" + target + "' returned error: " + tableEvent.getErrorMessage());
                    }
                }
            }
        }
        return map;
    }

    public static KeyAgreement getInitializedKeyAgreement(KeyPair keyPair) throws NoSuchAlgorithmException, InvalidKeyException {
        try {
            KeyAgreement keyAgreement = KeyAgreement.getInstance(DIFFIE_HELLMAN);
            keyAgreement.init(keyPair.getPrivate());
            return keyAgreement;
        } catch (InvalidKeyException | NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static byte[] keyToBytes(Key key) {
        byte[] byteArray = key instanceof DHPublicKey ? ((DHPublicKey) key).getY().toByteArray() : key instanceof DHPrivateKey ? ((DHPrivateKey) key).getX().toByteArray() : null;
        if (byteArray == null) {
            return null;
        }
        return (byteArray.length % 8 == 0 || byteArray[0] != 0) ? byteArray : Arrays.copyOfRange(byteArray, 1, byteArray.length);
    }
}
