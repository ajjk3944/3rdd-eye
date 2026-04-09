package org.snmp4j.tools.console;

import java.io.IOException;
import java.io.PrintStream;
import java.text.ParseException;
import java.util.Map;
import org.snmp4j.MessageDispatcherImpl;
import org.snmp4j.PDU;
import org.snmp4j.Snmp;
import org.snmp4j.Target;
import org.snmp4j.event.ResponseEvent;
import org.snmp4j.log.LogLevel;
import org.snmp4j.mp.MPv1;
import org.snmp4j.mp.MPv2c;
import org.snmp4j.mp.MPv3;
import org.snmp4j.security.SecurityProtocols;
import org.snmp4j.security.USM;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.UdpAddress;
import org.snmp4j.smi.VariableBinding;
import org.snmp4j.transport.DefaultUdpTransportMapping;
import org.snmp4j.util.ArgumentParser;
import org.snmp4j.util.PDUFactory;
import org.snmp4j.util.SnmpConfigurator;
import org.snmp4j.util.TableEvent;
import org.snmp4j.util.TableListener;
import org.snmp4j.util.TableUtils;

/* loaded from: classes2.dex */
public class LogControl {
    private static final String COMMAND_PARAMETER = "#command[s<(set|list)>] +following[s] ..";
    private Map parameters;
    public static final OID[] SNMP4J_LOGGER_OIDS = {new OID("1.3.6.1.4.1.4976.10.1.1.1.1.2.2.1.3"), new OID("1.3.6.1.4.1.4976.10.1.1.1.1.2.2.1.4"), new OID("1.3.6.1.4.1.4976.10.1.1.1.1.2.2.1.6")};
    private static final String OPTIONS = "+a[s{=MD5}<(MD5|SHA)>] +A[s] +b[i{=0}] -c[s{=public}] -bc[i{=0}] +u[s{securityName}] -t[l{timeout=5000}] -r[i{retries=0}] +l[o<\\n\\n[:\\n\\n]*>] +e[o<\\n\\n[:\\n\\n]*>] +E[o<\\n\\n[:\\n\\n]*>] +n[s] +Y[s] +y[s<(DES|3DES|AES|AES128|AES192|AES256)>] -v[s{version=3}<(1|2c|3)>] ";
    private static final String[][] COMMANDS = {new String[]{"list", OPTIONS, "#command[s<list>] #address[s<(udp|tcp):.*[/[0-9]+]?>] +filter[s]"}, new String[]{"set", OPTIONS, "#command[s<set>] #address[s<(udp|tcp):.*[/[0-9]+]?>] #logger[s] #level[s<(NONE|OFF|ALL|TRACE|DEBUG|INFO|WARN|ERROR|FATAL)>]"}, new String[]{"help", "", "#command[s<help>] +subject[s<list|set>]"}};

    class LoggerListListener implements TableListener {
        private boolean finished;

        LoggerListListener() {
        }

        private void printLogger(TableEvent tableEvent) {
            if (tableEvent.getStatus() != 0 || tableEvent.getIndex() == null) {
                if (tableEvent.getStatus() != 0) {
                    System.err.println("Logger list command failed with: " + tableEvent.getErrorMessage());
                    return;
                }
                return;
            }
            if (tableEvent.getColumns()[2].getVariable().toInt() == 1) {
                OctetString octetString = new OctetString();
                octetString.fromSubIndex(tableEvent.getIndex(), true);
                LogLevel logLevel = new LogLevel(tableEvent.getColumns()[0].getVariable().toInt());
                LogLevel logLevel2 = new LogLevel(tableEvent.getColumns()[1].getVariable().toInt());
                System.out.println(octetString.toString() + "=" + logLevel + "(" + logLevel2 + ")");
            }
        }

        @Override // org.snmp4j.util.TableListener
        public void finished(TableEvent tableEvent) {
            printLogger(tableEvent);
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
            printLogger(tableEvent);
            return tableEvent.getStatus() == 0;
        }
    }

    public LogControl(Map map) {
        this.parameters = map;
    }

    private synchronized void listLoggers(Snmp snmp, Target target, PDUFactory pDUFactory) {
        OID oid;
        OID oidNextPeer;
        try {
            TableUtils tableUtils = new TableUtils(snmp, pDUFactory);
            String str = (String) ArgumentParser.getValue(this.parameters, "filter", 0);
            if (str != null) {
                OID subIndex = new OctetString(str).toSubIndex(true);
                oid = subIndex;
                oidNextPeer = subIndex.nextPeer();
            } else {
                oid = null;
                oidNextPeer = null;
            }
            LoggerListListener loggerListListener = new LoggerListListener();
            tableUtils.getTable(target, SNMP4J_LOGGER_OIDS, loggerListListener, this, oid, oidNextPeer);
            while (!loggerListListener.isFinished()) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void main(String[] strArr) {
        try {
            String[] strArrSelectCommand = ArgumentParser.selectCommand(strArr, OPTIONS, COMMANDS);
            if (strArrSelectCommand == null) {
                printUsage();
                System.exit(2);
            }
            new LogControl(new ArgumentParser(strArrSelectCommand[1], strArrSelectCommand[2]).parse(strArr)).run();
        } catch (ParseException e10) {
            System.out.println(e10.getMessage());
            System.exit(1);
        }
    }

    private static void printHelpUsage() {
        System.out.println(" help [COMMAND]                  Print usage help for the specified command.");
    }

    private static void printListUsage() {
        PrintStream printStream = System.out;
        printStream.println(" list <ADDRESS> [FILTER]         List logger configuration for the agent at");
        printStream.println("                                 ADDRESS (e.g. 'udp:localhost/161') with");
        printStream.println("                                 for all logger names that contain start with");
        printStream.println("                                 the optional parameter string FILTER.");
    }

    private static void printOptions() {
        PrintStream printStream = System.out;
        printStream.println("valid <OPTIONS> are:");
        printStream.println("  -a  authProtocol      Sets the authentication protocol used to");
        printStream.println("                        authenticate SNMPv3 messages. Valid values are");
        printStream.println("                        MD5 and SHA.");
        printStream.println("  -A  authPassphrase    Sets the authentication pass phrase for authenticated");
        printStream.println("                        SNMPv3 messages.");
        printStream.println("  -bc bootCounter       The boot counter to be used (default is 0)");
        printStream.println("  -c  community         The SNMPv1/v2c community to use (default is 'public')");
        printStream.println("  -e  engineID          Sets the authoritative engine ID of the command");
        printStream.println("                        responder used for SNMPv3 request messages. If not");
        printStream.println("                        supplied, the engine ID will be discovered.");
        printStream.println("  -E  contextEngineID   Sets the context engine ID used for the SNMPv3 scoped");
        printStream.println("                        PDU. The authoritative engine ID will be used for the");
        printStream.println("                        context engine ID, if the latter is not specified.");
        printStream.println("  -l  localEngineID     Sets the local engine ID. This option can be");
        printStream.println("                        used to avoid engine ID clashes through duplicate IDs");
        printStream.println("                        leading to usmStatsNotInTimeWindows reports.");
        printStream.println("  -n  contextName       Sets the target context name for SNMPv3 messages. ");
        printStream.println("                        Default is the empty string.");
        printStream.println("  -u  securityName      The SNMPv3 security name");
        printStream.println("  -t  timeout           SNMP timeout in milli-seconds (default is 5000)");
        printStream.println("  -r  retries           SNMP retries (default is 0) ");
        printStream.println("  -v  1|2c|3            The SNMP version (one of 1, 2c, or 3)");
        printStream.println("  -y  privacyProtocol   Sets the privacy protocol to be used to encrypt");
        printStream.println("                        SNMPv3 messages. Valid values are DES, AES (AES128),");
        printStream.println("                        AES192, AES256, and 3DES(DESEDE).");
        printStream.println("  -Y  privacyPassphrase Sets the privacy pass phrase for encrypted");
        printStream.println("                        SNMPv3 messages.");
    }

    private static void printSetUsage() {
        PrintStream printStream = System.out;
        printStream.println(" set <ADDRESS> <LOGGER> <LEVEL>  Set a LOGGER to a new LEVEL at agent");
        printStream.println("                                 ADDRESS (e.g. 'udp:localhost/161').");
        printStream.println("                                 LOGGER is a fully qualified logger name and");
        printStream.println("                                 LEVEL is one of NONE, OFF, ALL, TRACE, DEBUG,");
        printStream.println("                                 INFO, WARN, ERROR, or FATAL.");
    }

    private static void printUsage() {
        printUsageHeader();
        printHelpUsage();
        printListUsage();
        printSetUsage();
        printOptions();
    }

    private static void printUsageHeader() {
        PrintStream printStream = System.out;
        printStream.println("LogControl <OPTIONS> <COMMAND> <PARAMETERS>");
        printStream.println("where <COMMAND> is one of: ");
    }

    private void setLevel(Snmp snmp, Target target, PDUFactory pDUFactory) throws IOException {
        PDU pduCreatePDU = pDUFactory.createPDU(target);
        OID[] oidArr = SNMP4J_LOGGER_OIDS;
        OID oid = new OID(oidArr[0]);
        String str = (String) ArgumentParser.getValue(this.parameters, "logger", 0);
        if (str != null) {
            OID subIndex = new OctetString(str).toSubIndex(true);
            String str2 = (String) ArgumentParser.getValue(this.parameters, "level", 0);
            oid.append(subIndex);
            int level = LogLevel.toLevel(str2).getLevel();
            pduCreatePDU.add(new VariableBinding(oid, new Integer32(level)));
            ResponseEvent responseEvent = snmp.set(pduCreatePDU, target);
            if (responseEvent.getResponse() == null) {
                System.out.println("SET request timed out.");
                return;
            }
            int errorStatus = responseEvent.getResponse().getErrorStatus();
            if (errorStatus == 0) {
                verifyLoggerModification(snmp, target, pduCreatePDU, oid, str, subIndex, str2, responseEvent);
                return;
            }
            if (errorStatus == 11 || errorStatus == 18) {
                pduCreatePDU.clear();
                OID oid2 = new OID(oidArr[2]);
                oid2.append(subIndex);
                pduCreatePDU.add(new VariableBinding(oid, new Integer32(level)));
                pduCreatePDU.add(new VariableBinding(oid2, new Integer32(4)));
                ResponseEvent responseEvent2 = snmp.set(pduCreatePDU, target);
                if (responseEvent2.getResponse() != null && responseEvent2.getResponse().getErrorStatus() == 0) {
                    System.out.println("Logger created successfully.");
                }
                verifyLoggerModification(snmp, target, pduCreatePDU, oid, str, subIndex, str2, responseEvent2);
            }
        }
    }

    private void verifyLoggerModification(Snmp snmp, Target target, PDU pdu, OID oid, String str, OID oid2, String str2, ResponseEvent responseEvent) throws IOException {
        pdu.clear();
        OID oid3 = new OID(SNMP4J_LOGGER_OIDS[1]);
        oid3.append(oid2);
        pdu.add(new VariableBinding(oid));
        pdu.add(new VariableBinding(oid3));
        ResponseEvent responseEvent2 = snmp.get(pdu, target);
        PDU response = responseEvent2.getResponse();
        if (response == null || response.getErrorStatus() != 0 || response.get(0).isException() || response.get(1).isException()) {
            PrintStream printStream = System.out;
            printStream.println("SET request successfully sent, but verfication failed:");
            if (response == null) {
                printStream.println("GET request timed out.");
                return;
            } else if (response.getErrorStatus() != 0) {
                printStream.println(PDU.toErrorStatusText(response.getErrorStatus()));
                return;
            } else {
                printStream.println(response.toString());
                return;
            }
        }
        PDU response2 = responseEvent2.getResponse();
        LogLevel logLevel = new LogLevel(response2.get(0).getVariable().toInt());
        LogLevel logLevel2 = new LogLevel(response2.get(1).getVariable().toInt());
        System.out.println("Set logger '" + str + "' level to " + str2 + ". Now levels are " + logLevel + " (configured) and " + logLevel2 + " (effective).");
    }

    public void run() {
        String str = (String) ArgumentParser.getValue(this.parameters, "command", 0);
        if ("help".equals(str)) {
            String str2 = (String) ArgumentParser.getValue(this.parameters, "subject", 0);
            if (str2 == null) {
                printUsage();
                return;
            }
            if ("list".equalsIgnoreCase(str2)) {
                printUsageHeader();
                printListUsage();
                printOptions();
                return;
            } else {
                if ("set".equalsIgnoreCase(str2)) {
                    printUsageHeader();
                    printListUsage();
                    printOptions();
                    return;
                }
                return;
            }
        }
        try {
            DefaultUdpTransportMapping defaultUdpTransportMapping = new DefaultUdpTransportMapping(new UdpAddress("0.0.0.0/0"));
            MessageDispatcherImpl messageDispatcherImpl = new MessageDispatcherImpl();
            Snmp snmp = new Snmp(messageDispatcherImpl, defaultUdpTransportMapping);
            SecurityProtocols.getInstance().addDefaultProtocols();
            OctetString octetString = new OctetString(MPv3.createLocalEngineID(new OctetString("LogControl" + System.currentTimeMillis())));
            messageDispatcherImpl.addMessageProcessingModel(new MPv1());
            messageDispatcherImpl.addMessageProcessingModel(new MPv2c());
            messageDispatcherImpl.addMessageProcessingModel(new MPv3(new USM(SecurityProtocols.getInstance(), octetString, 0)));
            SnmpConfigurator snmpConfigurator = new SnmpConfigurator();
            snmpConfigurator.configure(snmp, this.parameters);
            snmp.listen();
            Target target = snmpConfigurator.getTarget(this.parameters);
            PDUFactory pDUFactory = snmpConfigurator.getPDUFactory(this.parameters);
            if ("list".equals(str)) {
                listLoggers(snmp, target, pDUFactory);
            } else if ("set".equals(str)) {
                setLevel(snmp, target, pDUFactory);
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }
}
