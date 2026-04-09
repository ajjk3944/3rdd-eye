package org.snmp4j.tools.console;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;
import org.snmp4j.CommandResponder;
import org.snmp4j.CommandResponderEvent;
import org.snmp4j.CommunityTarget;
import org.snmp4j.MessageDispatcherImpl;
import org.snmp4j.MessageException;
import org.snmp4j.PDU;
import org.snmp4j.PDUv1;
import org.snmp4j.ScopedPDU;
import org.snmp4j.Snmp;
import org.snmp4j.Target;
import org.snmp4j.TransportMapping;
import org.snmp4j.UserTarget;
import org.snmp4j.asn1.BER;
import org.snmp4j.event.ResponseEvent;
import org.snmp4j.log.ConsoleLogFactory;
import org.snmp4j.log.LogFactory;
import org.snmp4j.log.LogLevel;
import org.snmp4j.mp.CounterSupport;
import org.snmp4j.mp.DefaultCounterListener;
import org.snmp4j.mp.MPv1;
import org.snmp4j.mp.MPv2c;
import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.MessageProcessingModel;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.mp.StatusInformation;
import org.snmp4j.security.AuthHMAC192SHA256;
import org.snmp4j.security.AuthHMAC384SHA512;
import org.snmp4j.security.AuthMD5;
import org.snmp4j.security.AuthSHA;
import org.snmp4j.security.Priv3DES;
import org.snmp4j.security.PrivAES128;
import org.snmp4j.security.PrivAES192;
import org.snmp4j.security.PrivAES256;
import org.snmp4j.security.PrivDES;
import org.snmp4j.security.SecurityModels;
import org.snmp4j.security.SecurityProtocols;
import org.snmp4j.security.TSM;
import org.snmp4j.security.USM;
import org.snmp4j.security.UsmUser;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.Counter32;
import org.snmp4j.smi.GenericAddress;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.IpAddress;
import org.snmp4j.smi.Null;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.TcpAddress;
import org.snmp4j.smi.TimeTicks;
import org.snmp4j.smi.TlsAddress;
import org.snmp4j.smi.UdpAddress;
import org.snmp4j.smi.UnsignedInteger32;
import org.snmp4j.smi.Variable;
import org.snmp4j.smi.VariableBinding;
import org.snmp4j.transport.DefaultTcpTransportMapping;
import org.snmp4j.transport.DefaultUdpTransportMapping;
import org.snmp4j.transport.TLSTM;
import org.snmp4j.util.MultiThreadedMessageDispatcher;
import org.snmp4j.util.PDUFactory;
import org.snmp4j.util.TableEvent;
import org.snmp4j.util.TableListener;
import org.snmp4j.util.TableUtils;
import org.snmp4j.util.ThreadPool;
import org.snmp4j.util.TreeEvent;
import org.snmp4j.util.TreeListener;
import org.snmp4j.util.TreeUtils;
import org.snmp4j.version.VersionInfo;

/* loaded from: classes2.dex */
public class SnmpRequest implements CommandResponder, PDUFactory {
    public static final int CVS_TABLE = 4;
    public static final int DEFAULT = 0;
    public static final int LISTEN = 2;
    public static final int SNAPSHOT_CREATION = 6;
    public static final int SNAPSHOT_DUMP = 7;
    public static final int TABLE = 3;
    public static final int TIME_BASED_CVS_TABLE = 5;
    public static final int WALK = 1;
    Address address;
    OctetString authPassphrase;
    OID authProtocol;
    OctetString authoritativeEngineID;
    OctetString contextEngineID;
    OID lowerBoundIndex;
    OctetString privPassphrase;
    OID privProtocol;
    File snapshotFile;
    Target target;
    OID upperBoundIndex;
    Vector<VariableBinding> vbs;
    OctetString community = new OctetString("public");
    OctetString contextName = new OctetString();
    OctetString securityName = new OctetString();
    OctetString localEngineID = new OctetString(MPv3.createLocalEngineID());
    TimeTicks sysUpTime = new TimeTicks(0);
    OID trapOID = SnmpConstants.coldStart;
    PDUv1 v1TrapPDU = new PDUv1();
    int version = 3;
    int engineBootCount = 0;
    int retries = 1;
    int timeout = 1000;
    int pduType = -95;
    int maxRepetitions = 10;
    int nonRepeaters = 0;
    int maxSizeResponsePDU = 65535;
    protected int operation = 0;
    int numDispatcherThreads = 2;
    boolean useDenseTableOperation = false;

    class CVSTableListener implements TableListener {
        private boolean finished;
        private long requestTime;

        public CVSTableListener(long j10) {
            this.requestTime = j10;
        }

        @Override // org.snmp4j.util.TableListener
        public void finished(TableEvent tableEvent) {
            this.finished = true;
            synchronized (tableEvent.getUserObject()) {
                tableEvent.getUserObject().notify();
            }
        }

        @Override // org.snmp4j.util.TableListener
        public boolean isFinished() {
            return this.finished;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x009a A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0033 A[SYNTHETIC] */
        @Override // org.snmp4j.util.TableListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean next(org.snmp4j.util.TableEvent r8) {
            /*
                r7 = this;
                org.snmp4j.tools.console.SnmpRequest r0 = org.snmp4j.tools.console.SnmpRequest.this
                int r0 = r0.operation
                r1 = 5
                java.lang.String r2 = ","
                if (r0 != r1) goto L13
                java.io.PrintStream r0 = java.lang.System.out
                long r3 = r7.requestTime
                r0.print(r3)
                r0.print(r2)
            L13:
                java.io.PrintStream r0 = java.lang.System.out
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "\""
                r1.append(r3)
                org.snmp4j.smi.OID r4 = r8.getIndex()
                r1.append(r4)
                java.lang.String r4 = "\","
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.print(r1)
                r0 = 0
            L33:
                org.snmp4j.smi.VariableBinding[] r1 = r8.getColumns()
                int r1 = r1.length
                r4 = 1
                if (r0 >= r1) goto La0
                org.snmp4j.smi.VariableBinding[] r1 = r8.getColumns()
                r1 = r1[r0]
                org.snmp4j.smi.Variable r1 = r1.getVariable()
                java.lang.String r5 = r1.toString()
                int r1 = r1.getSyntax()
                r6 = 4
                if (r1 == r6) goto L61
                r4 = 6
                if (r1 == r4) goto L86
                r4 = 64
                if (r1 == r4) goto L86
                r4 = 68
                if (r1 == r4) goto L86
                java.io.PrintStream r1 = java.lang.System.out
                r1.print(r5)
                goto L91
            L61:
                java.lang.StringBuffer r1 = new java.lang.StringBuffer
                int r6 = r5.length()
                r1.<init>(r6)
                java.util.StringTokenizer r6 = new java.util.StringTokenizer
                r6.<init>(r5, r3, r4)
            L6f:
                boolean r4 = r6.hasMoreTokens()
                if (r4 == 0) goto L86
                java.lang.String r4 = r6.nextToken()
                r1.append(r4)
                boolean r4 = r4.equals(r3)
                if (r4 == 0) goto L6f
                r1.append(r3)
                goto L6f
            L86:
                java.io.PrintStream r1 = java.lang.System.out
                r1.print(r3)
                r1.print(r5)
                r1.print(r3)
            L91:
                int r0 = r0 + 1
                org.snmp4j.smi.VariableBinding[] r1 = r8.getColumns()
                int r1 = r1.length
                if (r0 >= r1) goto L33
                java.io.PrintStream r1 = java.lang.System.out
                r1.print(r2)
                goto L33
            La0:
                java.io.PrintStream r8 = java.lang.System.out
                r8.println()
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: org.snmp4j.tools.console.SnmpRequest.CVSTableListener.next(org.snmp4j.util.TableEvent):boolean");
        }
    }

    class TextTableListener implements TableListener {
        private boolean finished;

        TextTableListener() {
        }

        @Override // org.snmp4j.util.TableListener
        public void finished(TableEvent tableEvent) {
            PrintStream printStream = System.out;
            printStream.println();
            printStream.println("Table walk completed with status " + tableEvent.getStatus() + ". Received " + tableEvent.getUserObject() + " rows.");
            this.finished = true;
            synchronized (tableEvent.getUserObject()) {
                tableEvent.getUserObject().notify();
            }
        }

        @Override // org.snmp4j.util.TableListener
        public boolean isFinished() {
            return this.finished;
        }

        @Override // org.snmp4j.util.TableListener
        public boolean next(TableEvent tableEvent) {
            System.out.println("Index = " + tableEvent.getIndex() + ":");
            for (int i10 = 0; i10 < tableEvent.getColumns().length; i10++) {
                System.out.println(tableEvent.getColumns()[i10]);
            }
            System.out.println();
            ((Counter32) tableEvent.getUserObject()).increment();
            return true;
        }
    }

    class WalkCounts {
        public int objects;
        public int requests;

        WalkCounts() {
        }
    }

    static {
        LogFactory.setLogFactory(new ConsoleLogFactory());
        BER.setCheckSequenceLength(false);
    }

    public SnmpRequest(String[] strArr) throws NumberFormatException {
        this.vbs = new Vector<>();
        CounterSupport.getInstance().addCounterListener(new DefaultCounterListener());
        this.vbs.add(new VariableBinding(new OID("1.3.6")));
        int args = parseArgs(strArr);
        if (args >= strArr.length) {
            printUsage();
            System.exit(1);
        } else if (this.operation != 7) {
            checkOptions();
            this.address = getAddress(strArr[args]);
            Vector<VariableBinding> variableBindings = getVariableBindings(strArr, args + 1);
            checkTrapVariables(variableBindings);
            if (variableBindings.size() > 0) {
                this.vbs = variableBindings;
            }
        }
    }

    private void addUsmUser(Snmp snmp) {
        USM usm = snmp.getUSM();
        OctetString octetString = this.securityName;
        usm.addUser(octetString, new UsmUser(octetString, this.authProtocol, this.authPassphrase, this.privProtocol, this.privPassphrase));
    }

    private void checkOptions() {
        int i10;
        int i11 = this.operation;
        if (i11 == 1 && (i10 = this.pduType) != -91 && i10 != -95) {
            throw new IllegalArgumentException("Walk operation is not supported for PDU type: " + PDU.getTypeString(this.pduType));
        }
        if (i11 == 1 && this.vbs.size() != 1) {
            throw new IllegalArgumentException("There must be exactly one OID supplied for walk operations");
        }
        if (this.pduType == -92 && this.version != 0) {
            throw new IllegalArgumentException("V1TRAP PDU type is only available for SNMP version 1");
        }
    }

    private void checkTrapVariables(Vector<VariableBinding> vector) {
        int i10 = this.pduType;
        if (i10 == -90 || i10 == -89) {
            if (vector.size() == 0 || (vector.size() > 1 && !vector.get(0).getOid().equals(SnmpConstants.sysUpTime))) {
                vector.add(0, new VariableBinding(SnmpConstants.sysUpTime, this.sysUpTime));
            }
            if (vector.size() == 1 || (vector.size() > 2 && !vector.get(1).getOid().equals(SnmpConstants.snmpTrapOID))) {
                vector.add(1, new VariableBinding(SnmpConstants.snmpTrapOID, this.trapOID));
            }
        }
    }

    private static OctetString createOctetString(String str) {
        return str.startsWith("0x") ? OctetString.fromHexString(str.substring(2), ':') : new OctetString(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void createSnapshot(List<VariableBinding> list) throws Throwable {
        FileOutputStream fileOutputStream = null;
        fileOutputStream = null;
        fileOutputStream = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(this.snapshotFile);
                    try {
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream2);
                        objectOutputStream.writeObject(list);
                        objectOutputStream.flush();
                        fileOutputStream2.close();
                        fileOutputStream = objectOutputStream;
                    } catch (Exception e10) {
                        e = e10;
                        fileOutputStream = fileOutputStream2;
                        e.printStackTrace();
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                            fileOutputStream = fileOutputStream;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e11) {
                                e11.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            } catch (IOException e13) {
                e13.printStackTrace();
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private Snmp createSnmpSession() throws IOException {
        Address address = this.address;
        Snmp snmp = new Snmp((TransportMapping<? extends Address>) (address instanceof TlsAddress ? new TLSTM() : address instanceof TcpAddress ? new DefaultTcpTransportMapping() : new DefaultUdpTransportMapping()));
        MPv3 mPv3 = (MPv3) snmp.getMessageProcessingModel(3);
        mPv3.setLocalEngineID(this.localEngineID.getValue());
        mPv3.setCurrentMsgID(MPv3.randomMsgID(this.engineBootCount));
        if (this.version == 3) {
            SecurityModels.getInstance().addSecurityModel(new USM(SecurityProtocols.getInstance(), this.localEngineID, this.engineBootCount));
            addUsmUser(snmp);
            SecurityModels.getInstance().addSecurityModel(new TSM(this.localEngineID, false));
        }
        return snmp;
    }

    private Target createTarget() {
        if (this.version != 3) {
            CommunityTarget communityTarget = new CommunityTarget();
            communityTarget.setCommunity(this.community);
            return communityTarget;
        }
        UserTarget userTarget = new UserTarget();
        if (this.authPassphrase == null) {
            userTarget.setSecurityLevel(1);
        } else if (this.privPassphrase != null) {
            userTarget.setSecurityLevel(3);
        } else {
            userTarget.setSecurityLevel(2);
        }
        userTarget.setSecurityName(this.securityName);
        OctetString octetString = this.authoritativeEngineID;
        if (octetString != null) {
            userTarget.setAuthoritativeEngineID(octetString.getValue());
        }
        if (this.address instanceof TlsAddress) {
            userTarget.setSecurityModel(4);
        }
        return userTarget;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void dumpSnapshot() throws java.lang.Throwable {
        /*
            r8 = this;
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8f
            java.io.File r2 = r8.snapshotFile     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8f
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8f
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            java.lang.Object r0 = r0.readObject()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            java.io.PrintStream r2 = java.lang.System.out     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            r3.<init>()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            java.lang.String r4 = "Dumping snapshot file '"
            r3.append(r4)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            java.io.File r4 = r8.snapshotFile     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            r3.append(r4)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            java.lang.String r4 = "':"
            r3.append(r4)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            r2.println(r3)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            r3 = 1
        L35:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            if (r4 == 0) goto L64
            java.io.PrintStream r4 = java.lang.System.out     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            r5.<init>()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            java.lang.String r6 = ""
            r5.append(r6)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            r5.append(r3)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            java.lang.String r6 = ": "
            r5.append(r6)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            java.lang.Object r6 = r2.next()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            r5.append(r6)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            r4.println(r5)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            int r3 = r3 + 1
            goto L35
        L60:
            r0 = move-exception
            goto L9a
        L62:
            r0 = move-exception
            goto L93
        L64:
            java.io.PrintStream r2 = java.lang.System.out     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            r2.println()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            r3.<init>()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            java.lang.String r4 = "Dumped "
            r3.append(r4)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            r3.append(r0)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            java.lang.String r0 = " variable bindings."
            r3.append(r0)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
            r2.println(r0)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L62
        L86:
            r1.close()     // Catch: java.io.IOException -> L99
            goto L99
        L8a:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
            goto L9a
        L8f:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
        L93:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto L99
            goto L86
        L99:
            return
        L9a:
            if (r1 == 0) goto L9f
            r1.close()     // Catch: java.io.IOException -> L9f
        L9f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.snmp4j.tools.console.SnmpRequest.dumpSnapshot():void");
    }

    private static Vector<VariableBinding> getVariableBindings(String[] strArr, int i10) throws NumberFormatException {
        String strSubstring;
        char cCharAt;
        Variable ipAddress;
        Vector<VariableBinding> vector = new Vector<>((strArr.length - i10) + 1);
        while (i10 < strArr.length) {
            String strSubstring2 = strArr[i10];
            int iIndexOf = strSubstring2.indexOf("={");
            if (iIndexOf > 0) {
                strSubstring2 = strArr[i10].substring(0, iIndexOf);
                cCharAt = strArr[i10].charAt(iIndexOf + 2);
                String str = strArr[i10];
                strSubstring = str.substring(str.indexOf(125) + 1);
            } else if (strSubstring2.indexOf(45) > 0) {
                StringTokenizer stringTokenizer = new StringTokenizer(strSubstring2, "-");
                if (stringTokenizer.countTokens() != 2) {
                    throw new IllegalArgumentException("Illegal OID range specified: '" + strSubstring2);
                }
                VariableBinding variableBinding = new VariableBinding(new OID(stringTokenizer.nextToken()));
                vector.add(variableBinding);
                long j10 = Long.parseLong(stringTokenizer.nextToken());
                long jLastUnsigned = variableBinding.getOid().lastUnsigned();
                while (true) {
                    jLastUnsigned++;
                    if (jLastUnsigned <= j10) {
                        OID oid = new OID(variableBinding.getOid().getValue(), 0, variableBinding.getOid().size() - 1);
                        oid.appendUnsigned(jLastUnsigned);
                        vector.add(new VariableBinding(oid));
                    }
                }
                i10++;
            } else {
                strSubstring = null;
                cCharAt = 'i';
            }
            VariableBinding variableBinding2 = new VariableBinding(new OID(strSubstring2));
            if (strSubstring != null) {
                if (cCharAt == 'a') {
                    ipAddress = new IpAddress(strSubstring);
                } else if (cCharAt == 'b') {
                    ipAddress = OctetString.fromString(strSubstring, ' ', 2);
                } else if (cCharAt == 'd') {
                    ipAddress = OctetString.fromString(strSubstring, '.', 10);
                } else if (cCharAt == 'i') {
                    ipAddress = new Integer32(Integer.parseInt(strSubstring));
                } else if (cCharAt == 'x') {
                    ipAddress = OctetString.fromString(strSubstring, ':', 16);
                } else if (cCharAt == 'n') {
                    ipAddress = new Null();
                } else if (cCharAt != 'o') {
                    switch (cCharAt) {
                        case 's':
                            ipAddress = new OctetString(strSubstring);
                            break;
                        case 't':
                            ipAddress = new TimeTicks(Long.parseLong(strSubstring));
                            break;
                        case 'u':
                            ipAddress = new UnsignedInteger32(Long.parseLong(strSubstring));
                            break;
                        default:
                            throw new IllegalArgumentException("Variable type " + cCharAt + " not supported");
                    }
                } else {
                    ipAddress = new OID(strSubstring);
                }
                variableBinding2.setVariable(ipAddress);
            }
            vector.add(variableBinding2);
            i10++;
        }
        return vector;
    }

    public static void main(String[] strArr) throws Throwable {
        try {
            SnmpRequest snmpRequest = new SnmpRequest(strArr);
            int i10 = snmpRequest.operation;
            if (i10 == 7) {
                snmpRequest.dumpSnapshot();
            } else {
                try {
                    if (i10 == 2) {
                        snmpRequest.listen();
                    } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                        snmpRequest.table();
                    } else {
                        PDU pduSend = snmpRequest.send();
                        if (snmpRequest.getPduType() == -89 || snmpRequest.getPduType() == -88 || snmpRequest.getPduType() == -92 || snmpRequest.getPduType() == -94) {
                            System.out.println(PDU.getTypeString(snmpRequest.getPduType()) + " sent successfully");
                        } else if (pduSend == null) {
                            if (snmpRequest.operation != 1) {
                                System.out.println("Request timed out.");
                            }
                        } else if (pduSend.getType() == -88) {
                            printReport(pduSend);
                        } else if (snmpRequest.operation == 0) {
                            System.out.println("Response received with requestID=" + pduSend.getRequestID() + ", errorIndex=" + pduSend.getErrorIndex() + ", errorStatus=" + pduSend.getErrorStatusText() + "(" + pduSend.getErrorStatus() + ")");
                            printVariableBindings(pduSend);
                        } else {
                            System.out.println("Received something strange: requestID=" + pduSend.getRequestID() + ", errorIndex=" + pduSend.getErrorIndex() + ", errorStatus=" + pduSend.getErrorStatusText() + "(" + pduSend.getErrorStatus() + ")");
                            printVariableBindings(pduSend);
                        }
                    }
                } catch (IOException e10) {
                    System.err.println("Error while trying to send request: " + e10.getMessage());
                    e10.printStackTrace();
                }
            }
        } catch (IllegalArgumentException e11) {
            System.err.print("Error: " + e11.getMessage());
            e11.printStackTrace();
        }
    }

    private static String nextOption(String[] strArr, int i10) {
        int i11 = i10 + 1;
        if (i11 < strArr.length) {
            return strArr[i11];
        }
        throw new IllegalArgumentException("Missing option value for " + strArr[i10]);
    }

    private int parseArgs(String[] strArr) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        while (i13 < strArr.length) {
            if (strArr[i13].equals("-a")) {
                i10 = i13 + 1;
                String strNextOption = nextOption(strArr, i13);
                if (strNextOption.equals("MD5")) {
                    this.authProtocol = AuthMD5.ID;
                } else if (strNextOption.equals("SHA")) {
                    this.authProtocol = AuthSHA.ID;
                } else if (strNextOption.equals("SHA256")) {
                    this.authProtocol = AuthHMAC192SHA256.ID;
                } else {
                    if (!strNextOption.equals("SHA512")) {
                        throw new IllegalArgumentException("Authentication protocol unsupported: " + strNextOption);
                    }
                    this.authProtocol = AuthHMAC384SHA512.ID;
                }
            } else if (strArr[i13].equals("-A")) {
                i10 = i13 + 1;
                this.authPassphrase = createOctetString(nextOption(strArr, i13));
            } else if (strArr[i13].equals("-X") || strArr[i13].equals("-P")) {
                i10 = i13 + 1;
                this.privPassphrase = createOctetString(nextOption(strArr, i13));
            } else if (strArr[i13].equals("-c")) {
                i10 = i13 + 1;
                this.community = createOctetString(nextOption(strArr, i13));
            } else if (strArr[i13].equals("-b")) {
                i10 = i13 + 1;
                this.engineBootCount = Math.max(Integer.parseInt(nextOption(strArr, i13)), 0);
            } else if (strArr[i13].equals("-d")) {
                i10 = i13 + 1;
                LogFactory.getLogFactory().getRootLogger().setLogLevel(LogLevel.toLevel(nextOption(strArr, i13)));
            } else if (strArr[i13].equals("-l")) {
                i10 = i13 + 1;
                this.localEngineID = createOctetString(nextOption(strArr, i13));
            } else if (strArr[i13].equals("-e")) {
                i10 = i13 + 1;
                this.authoritativeEngineID = createOctetString(nextOption(strArr, i13));
            } else if (strArr[i13].equals("-E")) {
                i10 = i13 + 1;
                this.contextEngineID = createOctetString(nextOption(strArr, i13));
            } else {
                if (strArr[i13].equals("-h")) {
                    printUsage();
                    System.exit(0);
                } else if (strArr[i13].equals("-n")) {
                    i10 = i13 + 1;
                    this.contextName = createOctetString(nextOption(strArr, i13));
                } else if (strArr[i13].equals("-m")) {
                    i10 = i13 + 1;
                    this.maxSizeResponsePDU = Integer.parseInt(nextOption(strArr, i13));
                } else if (strArr[i13].equals("-r")) {
                    i10 = i13 + 1;
                    this.retries = Integer.parseInt(nextOption(strArr, i13));
                } else if (strArr[i13].equals("-t")) {
                    i10 = i13 + 1;
                    this.timeout = Integer.parseInt(nextOption(strArr, i13));
                } else if (strArr[i13].equals("-u")) {
                    i10 = i13 + 1;
                    this.securityName = createOctetString(nextOption(strArr, i13));
                } else if (strArr[i13].equals("-V")) {
                    printVersion();
                    System.exit(0);
                } else if (strArr[i13].equals("-Cr")) {
                    i10 = i13 + 1;
                    this.maxRepetitions = Integer.parseInt(nextOption(strArr, i13));
                } else if (strArr[i13].equals("-Cn")) {
                    i10 = i13 + 1;
                    this.nonRepeaters = Integer.parseInt(nextOption(strArr, i13));
                } else {
                    if (strArr[i13].equals("-Ce")) {
                        i12 = i13 + 1;
                        this.v1TrapPDU.setEnterprise(new OID(nextOption(strArr, i13)));
                    } else {
                        if (strArr[i13].equals("-Ct")) {
                            i11 = i13 + 1;
                            this.trapOID = new OID(nextOption(strArr, i13));
                        } else if (strArr[i13].equals("-Cg")) {
                            i11 = i13 + 1;
                            this.v1TrapPDU.setGenericTrap(Integer.parseInt(nextOption(strArr, i13)));
                        } else if (strArr[i13].equals("-Cs")) {
                            i11 = i13 + 1;
                            this.v1TrapPDU.setSpecificTrap(Integer.parseInt(nextOption(strArr, i13)));
                        } else if (strArr[i13].equals("-Ca")) {
                            i12 = i13 + 1;
                            this.v1TrapPDU.setAgentAddress(new IpAddress(nextOption(strArr, i13)));
                        } else if (strArr[i13].equals("-Cu")) {
                            i10 = i13 + 1;
                            String strNextOption2 = nextOption(strArr, i13);
                            this.v1TrapPDU.setTimestamp(Long.parseLong(strNextOption2));
                            this.sysUpTime.setValue(Long.parseLong(strNextOption2));
                        } else if (strArr[i13].equals("-Ow")) {
                            this.operation = 1;
                        } else if (strArr[i13].equals("-Ocs")) {
                            this.operation = 6;
                            i12 = i13 + 1;
                            File file = new File(nextOption(strArr, i13));
                            this.snapshotFile = file;
                            if (!file.canWrite() && this.snapshotFile.exists()) {
                                throw new IllegalArgumentException("Snapshot file '" + this.snapshotFile + "' cannot be written");
                            }
                        } else if (strArr[i13].equals("-Ods")) {
                            this.operation = 7;
                            i12 = i13 + 1;
                            File file2 = new File(nextOption(strArr, i13));
                            this.snapshotFile = file2;
                            if (!file2.canRead()) {
                                throw new IllegalArgumentException("Snapshot file '" + this.snapshotFile + "' cannot be read");
                            }
                        } else if (strArr[i13].equals("-Ol")) {
                            this.operation = 2;
                        } else if (strArr[i13].equals("-OtCSV")) {
                            this.operation = 4;
                        } else if (strArr[i13].equals("-OttCSV")) {
                            this.operation = 5;
                        } else if (strArr[i13].equals("-Ot")) {
                            this.operation = 3;
                        } else if (strArr[i13].equals("-Otd")) {
                            this.operation = 3;
                            this.useDenseTableOperation = true;
                        } else if (strArr[i13].equals("-Cil")) {
                            i11 = i13 + 1;
                            this.lowerBoundIndex = new OID(nextOption(strArr, i13));
                        } else if (strArr[i13].equals("-Ciu")) {
                            i11 = i13 + 1;
                            this.upperBoundIndex = new OID(nextOption(strArr, i13));
                        } else if (strArr[i13].equals("-v")) {
                            i10 = i13 + 1;
                            String strNextOption3 = nextOption(strArr, i13);
                            if (strNextOption3.equals("1")) {
                                this.version = 0;
                            } else if (strNextOption3.equals("2c")) {
                                this.version = 1;
                            } else {
                                if (!strNextOption3.equals("3")) {
                                    throw new IllegalArgumentException("Version " + strNextOption3 + " not supported");
                                }
                                this.version = 3;
                            }
                        } else if (strArr[i13].equals("-x")) {
                            i10 = i13 + 1;
                            String strNextOption4 = nextOption(strArr, i13);
                            if (strNextOption4.equals("DES")) {
                                this.privProtocol = PrivDES.ID;
                            } else if (strNextOption4.equals("AES128") || strNextOption4.equals("AES")) {
                                this.privProtocol = PrivAES128.ID;
                            } else if (strNextOption4.equals("AES192")) {
                                this.privProtocol = PrivAES192.ID;
                            } else if (strNextOption4.equals("AES256")) {
                                this.privProtocol = PrivAES256.ID;
                            } else {
                                if (!strNextOption4.equals("3DES") && !strNextOption4.equalsIgnoreCase("DESEDE")) {
                                    throw new IllegalArgumentException("Privacy protocol " + strNextOption4 + " not supported");
                                }
                                this.privProtocol = Priv3DES.ID;
                            }
                        } else {
                            if (!strArr[i13].equals("-p")) {
                                if (!strArr[i13].startsWith("-")) {
                                    return i13;
                                }
                                throw new IllegalArgumentException("Unknown option " + strArr[i13]);
                            }
                            i10 = i13 + 1;
                            String strNextOption5 = nextOption(strArr, i13);
                            int typeFromString = PDU.getTypeFromString(strNextOption5);
                            this.pduType = typeFromString;
                            if (typeFromString == Integer.MIN_VALUE) {
                                throw new IllegalArgumentException("Unknown PDU type " + strNextOption5);
                            }
                        }
                        i13 = i11;
                    }
                    i13 = i12;
                }
                i13++;
            }
            i13 = i10;
            i13++;
        }
        return 0;
    }

    protected static void printReport(PDU pdu) {
        if (pdu.size() < 1) {
            System.out.println("REPORT PDU does not contain a variable binding.");
            return;
        }
        VariableBinding variableBinding = pdu.get(0);
        OID oid = variableBinding.getOid();
        if (SnmpConstants.usmStatsUnsupportedSecLevels.equals(oid)) {
            System.out.print("REPORT: Unsupported Security Level.");
        } else if (SnmpConstants.usmStatsNotInTimeWindows.equals(oid)) {
            System.out.print("REPORT: Message not within time window.");
        } else if (SnmpConstants.usmStatsUnknownUserNames.equals(oid)) {
            System.out.print("REPORT: Unknown user name.");
        } else if (SnmpConstants.usmStatsUnknownEngineIDs.equals(oid)) {
            System.out.print("REPORT: Unknown engine id.");
        } else if (SnmpConstants.usmStatsWrongDigests.equals(oid)) {
            System.out.print("REPORT: Wrong digest.");
        } else if (SnmpConstants.usmStatsDecryptionErrors.equals(oid)) {
            System.out.print("REPORT: Decryption error.");
        } else if (SnmpConstants.snmpUnknownSecurityModels.equals(oid)) {
            System.out.print("REPORT: Unknown security model.");
        } else if (SnmpConstants.snmpInvalidMsgs.equals(oid)) {
            System.out.print("REPORT: Invalid message.");
        } else if (SnmpConstants.snmpUnknownPDUHandlers.equals(oid)) {
            System.out.print("REPORT: Unknown PDU handler.");
        } else if (SnmpConstants.snmpUnavailableContexts.equals(oid)) {
            System.out.print("REPORT: Unavailable context.");
        } else if (SnmpConstants.snmpUnknownContexts.equals(oid)) {
            System.out.print("REPORT: Unknown context.");
        } else {
            System.out.print("REPORT contains unknown OID (" + oid.toString() + ").");
        }
        System.out.println(" Current counter value is " + variableBinding.getVariable().toString() + ".");
    }

    protected static void printUsage() {
        String[] strArr = {"", "Usage: SNMP4J [options] [transport:]address [OID[={type}value] ...]", "", "  -a  authProtocol      Sets the authentication protocol used to", "                        authenticate SNMPv3 messages. Valid values are", "                        MD5 and SHA.", "  -A  authPassphrase    Sets the authentication pass phrase for authenticated", "                        SNMPv3 messages.", "  -b  engineBootCount   Sets the engine boot count to the specified value", "                        greater or equal to zero. Default is zero.", "  -c  community         Sets the community for SNMPv1/v2c messages.", "  -Ca agentAddress      Sets the agent address field of a V1TRAP PDU.", "                        The default value is '0.0.0.0'.", "  -Cg genericID         Sets the generic ID for SNMPv1 TRAPs (V1TRAP).", "                        The default is 0 (coldStart).", "  -Ce enterpriseOID     Sets the enterprise OID field of a V1TRAP PDU.", "  -Cil lowerBoundIndex  Sets the lower bound index for TABLE operations.", "  -Ciu upperBoundIndex  Sets the upper bound index for TABLE operations.", "  -Cn non-repeaters     Sets  the  non-repeaters field for GETBULK PDUs.", "                        It specifies the number of supplied variables that", "                        should not be iterated over. The default is 0.", "  -Cr max-repetitions   Sets the max-repetitions field for GETBULK PDUs.", "                        This specifies the maximum number of iterations", "                        over the repeating variables. The default is 10.", "  -Cs specificID        Sets the specific ID for V1TRAP PDU. The default is 0.", "  -Ct trapOID           Sets the trapOID (1.3.6.1.6.3.1.1.4.1.0) of an INFORM", "                        or TRAP PDU. The default is 1.3.6.1.6.3.1.1.5.1.", "  -Cu upTime            Sets the sysUpTime field of an INFORM, TRAP, or", "                        V1TRAP PDU.", "  -d  debugLevel        Sets the global debug level for Log4J logging output.", "                        Valid values are OFF, ERROR, WARN, INFO, and DEBUG.", "  -e  engineID          Sets the authoritative engine ID of the command", "                        responder used for SNMPv3 request messages. If not", "                        supplied, the engine ID will be discovered.", "  -E  contextEngineID   Sets the context engine ID used for the SNMPv3 scoped", "                        PDU. The authoritative engine ID will be used for the", "                        context engine ID, if the latter is not specified.", "  -h                    Displays this message and then exits the application.", "  -l  localEngineID     Sets the local engine ID of the command generator", "                        and the notification receiver (thus this SNMP4J-Tool)", "                        used for SNMPv3 request messages. This option can be", "                        used to avoid engine ID clashes through duplicate IDs", "                        leading to usmStatsNotInTimeWindows reports.", "  -n  contextName       Sets the target context name for SNMPv3 messages. ", "                        Default is the empty string.", "  -m  maxSizeRespPDU    The maximum size of the response PDU in bytes.", "  -Ocs <file>           Same as -Ow except that the retrieved values are also", "                        written as a serialized ArrayList of VariableBinding", "                        instances to the specified file. The snapshot format", "                        can be read later by other applications, for example", "                        MIB Explorer Pro 2.2 or later. See also -Ods.", "  -Ods <file>           Reads the snapshot file and dumps its contents on", "                        standard out. No SNMP operation will be done.", "                        See also -Ocs.", "  -Ol                   Activates listen operation mode. In this mode, the", "                        application will listen for incoming TRAPs and INFORMs", "                        on the supplied address. Received request will be", "                        dumped to the console until the application is stopped.", "  -Ot                   Activates table operation mode. In this mode, the", "                        application receives tabular data from the column", "                        OIDs specified as parameters. The retrieved rows will", "                        be dumped to the console ordered by their index values.", "  -Otd                  Activates dense table operation mode. In this mode, the", "                        application receives tabular data from the column", "                        OIDs specified as parameters. The retrieved rows will", "                        be dumped to the console ordered by their index values.", "                        In contrast to -Ot this option must not be used with", "                        sparse tables. ", "  -OtCSV                Same as -Ot except that for each SNMP row received", "                        exactly one row of comma separated values will printed", "                        to the console where the first column contains the row", "                        index.", "  -OttCSV               Same as -OtCSV except that each row's first column", "                        will report the current time (millis after 1.1.1970)", "                        when the request has been sent.", "  -Ow                   Activates walk operation mode for GETNEXT and GETBULK", "                        PDUs. If activated, the GETNEXT and GETBULK operations", "                        will be repeated until all instances within the", "                        OID subtree of the supplied OID have been retrieved", "                        successfully or until an error occurred.", "  -p  pduType           Specifies the PDU type to be used for the message.", "                        Valid types are GET, GETNEXT, GETBULK (SNMPv2c/v3),", "                        SET, INFORM, TRAP, and V1TRAP (SNMPv1).", "  -P  privacyPassphrase Sets the privacy pass phrase for encrypted", "                        SNMPv3 messages (same as -X).", "  -r  retries           Sets the number of retries used for requests. A zero", "                        value will send out a request exactly once.", "                        Default is 1.", "  -t  timeout           Sets the timeout in milliseconds between retries.", "                        Default is 1000 milliseconds.", "  -u  securityName      Sets the security name for authenticated v3 messages.", "  -v  1|2c|3            Sets the SNMP protocol version to be used.", "                        Default is 3.", "  -V                    Displays version information and then exits.", "  -x  privacyProtocol   Sets the privacy protocol to be used to encrypt", "                        SNMPv3 messages. Valid values are DES, AES (AES128),", "                        AES192, AES256, and 3DES(DESEDE).", "  -X  privacyPassphrase Sets the privacy pass phrase for encrypted", "                        SNMPv3 messages (same as -P).", "", "The address of the target SNMP engine is parsed according to the", "specified <transport> selector (default selector is udp):", "", "  udp | tcp | tls       hostname[/port]", "                        ipv4Address[/port]", "                        ipv6Address[/port]", "", "The OIDs have to be specified in numerical form where strings may beenclosed in single quotes ('), for example:", "  1.3.6.1.2.1.1.5.0  (which will return the sysName.0 instance with a GET)", "  1.3.6.1.6.3.16.1.2.1.3.2.6.'public'  (which will return the ", "    vacmGroupName.2.6.112.117.98.108.105.99 instance with a GET)", "To request multiple instances, add additional OIDs with a space as", "separator. For the last sub-identifier of a plain OID (without an assigned", "value) a range can be specified, for example '1.3.6.1.2.1.2.2.1-10' will", "has the same effect as enumerating all OIDs from '1.3.6.1.2.1.2.2.1' to", "'1.3.6.1.2.1.2.2.10'.", "For SET and INFORM request, you can specify a value for each OID by", "using the following form: OID={type}value where <type> is one of", "the following single characters enclosed by '{' and '}':", "  i                     Integer32", "  u                     UnsingedInteger32, Gauge32", "  s                     OCTET STRING", "  x                     OCTET STRING specified as hex string where", "                        bytes separated by colons (':').", "  d                     OCTET STRING specified as decimal string", "                        where bytes are separated by dots ('.').", "  n                     Null", "  o                     OBJECT IDENTIFIER", "  t                     TimeTicks", "  a                     IpAddress", "  b                     OCTET STRING specified as binary string where", "                        bytes are separated by spaces.", "", "An example for a complete SNMPv2c SET request to set sysName:", " SNMP4J -c private -v 2c -p SET udp:localhost/161 \"1.3.6.1.2.1.1.5.0={s}SNMP4J\"", "", "To walk the whole MIB tree with GETBULK and using SNMPv3 MD5 authentication:", " SNMP4J -a MD5 -A MD5UserAuthPassword -u MD5User -p GETBULK -Ow 127.0.0.1/161", "", "Listen for unauthenticated SNMPv3 INFORMs and TRAPs and all v1/v2c TRAPs:", " SNMP4J -u aSecurityName -Ol 0.0.0.0/162", "", "Send an unauthenticated SNMPv3 notification (trap):", " SNMP4J -p TRAP -v 3 -u aSecurityName 127.0.0.1/162 \"1.3.6.1.2.1.1.3.0={t}0\" \\", "  \"1.3.6.1.6.3.1.1.4.1.0={o}1.3.6.1.6.3.1.1.5.1\" \\", "  \"1.3.6.1.2.1.1.1.0={s}System XYZ, Version N.M\"", "Retrieve rows of the columnar objects ifDescr to ifInOctets and ifOutOctets:", " SNMP4J -c public -v 2c -Ot localhost 1.3.6.1.2.1.2.2.1.2-10\\", "  1.3.6.1.2.1.2.2.1.16", ""};
        for (int i10 = 0; i10 < 150; i10++) {
            System.out.println(strArr[i10]);
        }
    }

    protected static void printVariableBindings(PDU pdu) {
        for (int i10 = 0; i10 < pdu.size(); i10++) {
            System.out.println(pdu.get(i10).toString());
        }
    }

    protected static void printVersion() {
        PrintStream printStream = System.out;
        printStream.println();
        printStream.println("SNMP4J Command Line Tool v" + VersionInfo.getVersion() + " Copyright © 2004-2011, Frank Fock and Jochen Katz");
        printStream.println("http://www.snmp4j.org");
        printStream.println();
        printStream.println("SNMP4J is licensed under the Apache License 2.0:");
        printStream.println("http://www.apache.org/licenses/LICENSE-2.0.txt");
        printStream.println();
    }

    private PDU walk(Snmp snmp, PDU pdu, Target target, final List<VariableBinding> list) throws IOException {
        pdu.setNonRepeaters(0);
        OID oid = pdu.get(0).getOid();
        final WalkCounts walkCounts = new WalkCounts();
        final long jNanoTime = System.nanoTime();
        TreeUtils treeUtils = new TreeUtils(snmp, this);
        TreeListener treeListener = new TreeListener() { // from class: org.snmp4j.tools.console.SnmpRequest.1
            private boolean finished;

            @Override // org.snmp4j.util.TreeListener
            public void finished(TreeEvent treeEvent) {
                if (treeEvent.getVariableBindings() != null && treeEvent.getVariableBindings().length > 0) {
                    next(treeEvent);
                }
                PrintStream printStream = System.out;
                printStream.println();
                printStream.println("Total requests sent:    " + walkCounts.requests);
                printStream.println("Total objects received: " + walkCounts.objects);
                printStream.println("Total walk time:        " + ((System.nanoTime() - jNanoTime) / 1000000) + " milliseconds");
                if (treeEvent.isError()) {
                    PrintStream printStream2 = System.err;
                    printStream2.println("The following error occurred during walk:");
                    printStream2.println(treeEvent.getErrorMessage());
                }
                this.finished = true;
                synchronized (this) {
                    notify();
                }
            }

            @Override // org.snmp4j.util.TreeListener
            public boolean isFinished() {
                return this.finished;
            }

            @Override // org.snmp4j.util.TreeListener
            public boolean next(TreeEvent treeEvent) {
                walkCounts.requests++;
                if (treeEvent.getVariableBindings() != null) {
                    VariableBinding[] variableBindings = treeEvent.getVariableBindings();
                    walkCounts.objects += variableBindings.length;
                    for (VariableBinding variableBinding : variableBindings) {
                        List list2 = list;
                        if (list2 != null) {
                            list2.add(variableBinding);
                        }
                        System.out.println(variableBinding.toString());
                    }
                }
                return true;
            }
        };
        synchronized (treeListener) {
            treeUtils.getSubtree(target, oid, null, treeListener);
            try {
                treeListener.wait();
            } catch (InterruptedException e10) {
                System.err.println("Tree retrieval interrupted: " + e10.getMessage());
                Thread.currentThread().interrupt();
            }
        }
        return null;
    }

    @Override // org.snmp4j.util.PDUFactory
    public PDU createPDU(Target target) {
        PDU pdu;
        if (target.getVersion() == 3) {
            ScopedPDU scopedPDU = new ScopedPDU();
            OctetString octetString = this.contextEngineID;
            if (octetString != null) {
                scopedPDU.setContextEngineID(octetString);
            }
            OctetString octetString2 = this.contextName;
            pdu = scopedPDU;
            if (octetString2 != null) {
                scopedPDU.setContextName(octetString2);
                pdu = scopedPDU;
            }
        } else {
            pdu = this.pduType == -92 ? this.v1TrapPDU : new PDU();
        }
        pdu.setType(this.pduType);
        return pdu;
    }

    public Address getAddress() {
        return this.address;
    }

    public OctetString getAuthPassphrase() {
        return this.authPassphrase;
    }

    public OID getAuthProtocol() {
        return this.authProtocol;
    }

    public OctetString getAuthoritativeEngineID() {
        return this.authoritativeEngineID;
    }

    public OctetString getCommunity() {
        return this.community;
    }

    public OctetString getContextEngineID() {
        return this.contextEngineID;
    }

    public OctetString getContextName() {
        return this.contextName;
    }

    public OID getLowerBoundIndex() {
        return this.lowerBoundIndex;
    }

    public int getMaxRepetitions() {
        return this.maxRepetitions;
    }

    public int getNonRepeaters() {
        return this.nonRepeaters;
    }

    public int getNumDispatcherThreads() {
        return this.numDispatcherThreads;
    }

    public int getOperation() {
        return this.operation;
    }

    public int getPduType() {
        return this.pduType;
    }

    public OctetString getPrivPassphrase() {
        return this.privPassphrase;
    }

    public OID getPrivProtocol() {
        return this.privProtocol;
    }

    public int getRetries() {
        return this.retries;
    }

    public OctetString getSecurityName() {
        return this.securityName;
    }

    public TimeTicks getSysUpTime() {
        return this.sysUpTime;
    }

    public Target getTarget() {
        return this.target;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public OID getTrapOID() {
        return this.trapOID;
    }

    public OID getUpperBoundIndex() {
        return this.upperBoundIndex;
    }

    public Vector<? extends VariableBinding> getVbs() {
        return this.vbs;
    }

    public int getVersion() {
        return this.version;
    }

    public boolean isUseDenseTableOperation() {
        return this.useDenseTableOperation;
    }

    public synchronized void listen() throws IOException {
        try {
            TransportMapping defaultTcpTransportMapping = this.address instanceof TcpAddress ? new DefaultTcpTransportMapping((TcpAddress) this.address) : new DefaultUdpTransportMapping((UdpAddress) this.address);
            MultiThreadedMessageDispatcher multiThreadedMessageDispatcher = new MultiThreadedMessageDispatcher(ThreadPool.create("DispatcherPool", this.numDispatcherThreads), new MessageDispatcherImpl());
            multiThreadedMessageDispatcher.addMessageProcessingModel(new MPv1());
            multiThreadedMessageDispatcher.addMessageProcessingModel(new MPv2c());
            multiThreadedMessageDispatcher.addMessageProcessingModel(new MPv3(this.localEngineID.getValue()));
            SecurityProtocols.getInstance().addDefaultProtocols();
            SecurityProtocols.getInstance().addPrivacyProtocol(new Priv3DES());
            Snmp snmp = new Snmp(multiThreadedMessageDispatcher, defaultTcpTransportMapping);
            if (this.version == 3) {
                SecurityModels.getInstance().addSecurityModel(new USM(SecurityProtocols.getInstance(), this.localEngineID, 0));
                addUsmUser(snmp);
            } else {
                CommunityTarget communityTarget = new CommunityTarget();
                communityTarget.setCommunity(this.community);
                this.target = communityTarget;
            }
            snmp.addCommandResponder(this);
            defaultTcpTransportMapping.listen();
            System.out.println("Listening on " + this.address);
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.snmp4j.CommandResponder
    public synchronized void processPdu(CommandResponderEvent commandResponderEvent) {
        PDU pdu = commandResponderEvent.getPDU();
        if (pdu != null) {
            System.out.println(pdu.toString());
            if (pdu.getType() != -89 && pdu.getType() != -92 && pdu.getType() != -88 && pdu.getType() != -94) {
                pdu.setErrorIndex(0);
                pdu.setErrorStatus(0);
                pdu.setType(-94);
                try {
                    commandResponderEvent.getMessageDispatcher().returnResponsePdu(commandResponderEvent.getMessageProcessingModel(), commandResponderEvent.getSecurityModel(), commandResponderEvent.getSecurityName(), commandResponderEvent.getSecurityLevel(), pdu, commandResponderEvent.getMaxSizeResponsePDU(), commandResponderEvent.getStateReference(), new StatusInformation());
                } catch (MessageException e10) {
                    System.err.println("Error while sending response: " + e10.getMessage());
                    LogFactory.getLogger(SnmpRequest.class).error(e10);
                }
            }
        }
    }

    public PDU send() throws Throwable {
        Snmp snmpCreateSnmpSession = createSnmpSession();
        Target targetCreateTarget = createTarget();
        this.target = targetCreateTarget;
        targetCreateTarget.setVersion(this.version);
        this.target.setAddress(this.address);
        this.target.setRetries(this.retries);
        this.target.setTimeout(this.timeout);
        this.target.setMaxSizeRequestPDU(this.maxSizeResponsePDU);
        snmpCreateSnmpSession.listen();
        PDU pduCreatePDU = createPDU(this.target);
        if (pduCreatePDU.getType() == -91) {
            pduCreatePDU.setMaxRepetitions(this.maxRepetitions);
            pduCreatePDU.setNonRepeaters(this.nonRepeaters);
        }
        Iterator<VariableBinding> it = this.vbs.iterator();
        while (it.hasNext()) {
            pduCreatePDU.add(it.next());
        }
        int i10 = this.operation;
        PDU response = null;
        if (i10 == 1 || i10 == 6) {
            ArrayList arrayList = i10 == 6 ? new ArrayList() : null;
            walk(snmpCreateSnmpSession, pduCreatePDU, this.target, arrayList);
            if (arrayList != null) {
                createSnapshot(arrayList);
            }
            return null;
        }
        long jNanoTime = System.nanoTime();
        ResponseEvent responseEventSend = snmpCreateSnmpSession.send(pduCreatePDU, this.target);
        if (responseEventSend != null) {
            response = responseEventSend.getResponse();
            System.out.println("Received response after " + ((System.nanoTime() - jNanoTime) / 1000000) + " milliseconds");
        }
        snmpCreateSnmpSession.close();
        return response;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setAuthPassphrase(OctetString octetString) {
        this.authPassphrase = octetString;
    }

    public void setAuthProtocol(OID oid) {
        this.authProtocol = oid;
    }

    public void setAuthoritativeEngineID(OctetString octetString) {
        this.authoritativeEngineID = octetString;
    }

    public void setCommunity(OctetString octetString) {
        this.community = octetString;
    }

    public void setContextEngineID(OctetString octetString) {
        this.contextEngineID = octetString;
    }

    public void setContextName(OctetString octetString) {
        this.contextName = octetString;
    }

    public void setLowerBoundIndex(OID oid) {
        this.lowerBoundIndex = oid;
    }

    public void setMaxRepetitions(int i10) {
        this.maxRepetitions = i10;
    }

    public void setNonRepeaters(int i10) {
        this.nonRepeaters = i10;
    }

    public void setNumDispatcherThreads(int i10) {
        this.numDispatcherThreads = i10;
    }

    public void setOperation(int i10) {
        this.operation = i10;
    }

    public void setPduType(int i10) {
        this.pduType = i10;
    }

    public void setPrivPassphrase(OctetString octetString) {
        this.privPassphrase = octetString;
    }

    public void setPrivProtocol(OID oid) {
        this.privProtocol = oid;
    }

    public void setRetries(int i10) {
        this.retries = i10;
    }

    public void setSecurityName(OctetString octetString) {
        this.securityName = octetString;
    }

    public void setSysUpTime(TimeTicks timeTicks) {
        this.sysUpTime = timeTicks;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public void setTimeout(int i10) {
        this.timeout = i10;
    }

    public void setTrapOID(OID oid) {
        this.trapOID = oid;
    }

    public void setUpperBoundIndex(OID oid) {
        this.upperBoundIndex = oid;
    }

    public void setUseDenseTableOperation(boolean z10) {
        this.useDenseTableOperation = z10;
    }

    public void setVbs(Vector<VariableBinding> vector) {
        this.vbs = vector;
    }

    public void setVersion(int i10) {
        this.version = i10;
    }

    public void table() throws IOException {
        Snmp snmpCreateSnmpSession = createSnmpSession();
        Target targetCreateTarget = createTarget();
        this.target = targetCreateTarget;
        targetCreateTarget.setVersion(this.version);
        this.target.setAddress(this.address);
        this.target.setRetries(this.retries);
        this.target.setTimeout(this.timeout);
        snmpCreateSnmpSession.listen();
        TableUtils tableUtils = new TableUtils(snmpCreateSnmpSession, this);
        tableUtils.setMaxNumRowsPerPDU(this.maxRepetitions);
        Counter32 counter32 = new Counter32();
        int size = this.vbs.size();
        OID[] oidArr = new OID[size];
        for (int i10 = 0; i10 < size; i10++) {
            oidArr[i10] = this.vbs.get(i10).getOid();
        }
        long jNanoTime = System.nanoTime();
        synchronized (counter32) {
            try {
                TableListener textTableListener = this.operation == 3 ? new TextTableListener() : new CVSTableListener(System.nanoTime());
                if (this.useDenseTableOperation) {
                    tableUtils.getDenseTable(this.target, oidArr, textTableListener, counter32, this.lowerBoundIndex, this.upperBoundIndex);
                } else {
                    tableUtils.getTable(this.target, oidArr, textTableListener, counter32, this.lowerBoundIndex, this.upperBoundIndex);
                }
                try {
                    counter32.wait(this.timeout);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        System.out.println("Table received in " + ((System.nanoTime() - jNanoTime) / 1000000) + " milliseconds.");
        snmpCreateSnmpSession.close();
    }

    private static Address getAddress(String str) {
        String strSubstring;
        int iIndexOf = str.indexOf(58);
        if (iIndexOf > 0) {
            strSubstring = str.substring(0, iIndexOf);
            str = str.substring(iIndexOf + 1);
        } else {
            strSubstring = GenericAddress.TYPE_UDP;
        }
        if (str.indexOf(47) < 0) {
            str = str + "/161";
        }
        if (strSubstring.equalsIgnoreCase(GenericAddress.TYPE_UDP)) {
            return new UdpAddress(str);
        }
        if (strSubstring.equalsIgnoreCase(GenericAddress.TYPE_TCP)) {
            return new TcpAddress(str);
        }
        if (strSubstring.equalsIgnoreCase(GenericAddress.TYPE_TLS)) {
            return new TlsAddress(str);
        }
        throw new IllegalArgumentException("Unknown transport " + strSubstring);
    }

    @Override // org.snmp4j.util.PDUFactory
    public PDU createPDU(MessageProcessingModel messageProcessingModel) {
        return createPDU((Target) null);
    }
}
