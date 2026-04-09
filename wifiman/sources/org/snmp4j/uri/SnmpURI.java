package org.snmp4j.uri;

import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.snmp4j.CertifiedTarget;
import org.snmp4j.CommunityTarget;
import org.snmp4j.PDU;
import org.snmp4j.ScopedPDU;
import org.snmp4j.Session;
import org.snmp4j.Snmp;
import org.snmp4j.Target;
import org.snmp4j.UserTarget;
import org.snmp4j.event.ResponseEvent;
import org.snmp4j.event.ResponseListener;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.security.USM;
import org.snmp4j.security.UsmUserEntry;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.TlsAddress;
import org.snmp4j.smi.UdpAddress;
import org.snmp4j.smi.Variable;
import org.snmp4j.smi.VariableBinding;
import org.snmp4j.uri.SnmpUriResponse;
import org.snmp4j.util.DefaultPDUFactory;
import org.snmp4j.util.PDUFactory;
import org.snmp4j.util.TreeEvent;
import org.snmp4j.util.TreeListener;
import org.snmp4j.util.TreeUtils;

/* loaded from: classes2.dex */
public class SnmpURI {
    private Target defaultTarget;
    private Session snmp;
    private USM usm;
    private int version = 3;
    private int securityModel = 3;
    private long timeout = 5000;
    private int retries = 1;
    private String defaultUserInfo = "public";
    private PDUFactory pduFactory = new DefaultPDUFactory();

    /* renamed from: org.snmp4j.uri.SnmpURI$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$snmp4j$uri$SnmpURI$SnmpUriType;

        static {
            int[] iArr = new int[SnmpUriType.values().length];
            $SwitchMap$org$snmp4j$uri$SnmpURI$SnmpUriType = iArr;
            try {
                iArr[SnmpUriType.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$snmp4j$uri$SnmpURI$SnmpUriType[SnmpUriType.NEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$snmp4j$uri$SnmpURI$SnmpUriType[SnmpUriType.SUBTREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private class AsyncResponseListener implements ResponseListener {
        private SnmpUriCallback callback;
        private URI url;

        /* synthetic */ AsyncResponseListener(SnmpURI snmpURI, URI uri, SnmpUriCallback snmpUriCallback, AnonymousClass1 anonymousClass1) {
            this(uri, snmpUriCallback);
        }

        @Override // org.snmp4j.event.ResponseListener
        public void onResponse(ResponseEvent responseEvent) {
            SnmpUriResponse snmpUriResponse = new SnmpUriResponse(SnmpUriResponse.Type.TIMEOUT);
            PDU response = responseEvent.getResponse();
            if (response != null) {
                snmpUriResponse = response.getErrorStatus() != 0 ? new SnmpUriResponse(response.getErrorStatus()) : new SnmpUriResponse((List<VariableBinding[]>) Collections.singletonList(response.getVariableBindings().toArray(new VariableBinding[response.size()])));
            }
            this.callback.onResponse(snmpUriResponse, this.url, responseEvent.getUserObject());
        }

        private AsyncResponseListener(URI uri, SnmpUriCallback snmpUriCallback) {
            this.url = uri;
            this.callback = snmpUriCallback;
        }
    }

    private class AsyncTreeListener implements TreeListener {
        private SnmpUriCallback callback;
        private volatile boolean finished = false;
        private URI url;

        public AsyncTreeListener(URI uri, SnmpUriCallback snmpUriCallback) {
            this.url = uri;
            this.callback = snmpUriCallback;
        }

        private SnmpUriResponse createResponse(TreeEvent treeEvent) {
            SnmpUriResponse snmpUriResponse = new SnmpUriResponse(SnmpUriResponse.Type.TIMEOUT);
            if (treeEvent.getStatus() != 0) {
                if (treeEvent.getStatus() == -4) {
                    return new SnmpUriResponse(SnmpUriResponse.Type.IO_ERROR, treeEvent.getException().getMessage());
                }
                if (treeEvent.getStatus() == -3) {
                    return new SnmpUriResponse(SnmpUriResponse.Type.SECURITY_ERROR, treeEvent.getReportPDU().size() > 0 ? treeEvent.getReportPDU().get(0).toString() : "<empty report PDU>");
                }
                return treeEvent.getStatus() == -2 ? new SnmpUriResponse(SnmpUriResponse.Type.LEXICOGRAPHIC_ORDER_ERROR) : snmpUriResponse;
            }
            VariableBinding[] variableBindings = treeEvent.getVariableBindings();
            int status = treeEvent.getStatus();
            SnmpUriResponse snmpUriResponse2 = new SnmpUriResponse((List<VariableBinding[]>) Collections.singletonList(variableBindings), status);
            if (status == 0) {
                snmpUriResponse2.setResponseType(SnmpUriResponse.Type.NEXT);
            }
            return snmpUriResponse2;
        }

        @Override // org.snmp4j.util.TreeListener
        public void finished(TreeEvent treeEvent) {
            if (this.finished) {
                return;
            }
            SnmpUriResponse snmpUriResponseCreateResponse = createResponse(treeEvent);
            if (snmpUriResponseCreateResponse.getResponseType() == SnmpUriResponse.Type.NEXT) {
                snmpUriResponseCreateResponse.setResponseType(SnmpUriResponse.Type.FINAL);
            }
            this.callback.onResponse(snmpUriResponseCreateResponse, this.url, treeEvent.getUserObject());
            this.finished = true;
        }

        @Override // org.snmp4j.util.TreeListener
        public boolean isFinished() {
            return this.finished;
        }

        @Override // org.snmp4j.util.TreeListener
        public boolean next(TreeEvent treeEvent) {
            if (!this.finished) {
                this.finished = this.callback.onResponse(createResponse(treeEvent), this.url, treeEvent.getUserObject()) | this.finished;
            }
            return !this.finished;
        }
    }

    private class Request {
        private OID[] oids;
        private PDU pdu;
        private Target target;
        SnmpUriType type;

        /* synthetic */ Request(SnmpURI snmpURI, Target target, PDU pdu, OID[] oidArr, SnmpUriType snmpUriType, AnonymousClass1 anonymousClass1) {
            this(snmpURI, target, pdu, oidArr, snmpUriType);
        }

        public OID[] getOIDs() {
            return this.oids;
        }

        public PDU getPdu() {
            return this.pdu;
        }

        public Target getTarget() {
            return this.target;
        }

        public SnmpUriType getType() {
            return this.type;
        }

        private Request(Target target, PDU pdu, OID[] oidArr) {
            this.type = SnmpUriType.GET;
            this.target = target;
            this.pdu = pdu;
            this.oids = oidArr;
        }

        private Request(SnmpURI snmpURI, Target target, PDU pdu, OID[] oidArr, SnmpUriType snmpUriType) {
            this(target, pdu, oidArr);
            this.type = snmpUriType;
        }
    }

    public enum SnmpUriType {
        GET,
        NEXT,
        SUBTREE
    }

    public SnmpURI(Session session) throws IOException {
        this.snmp = session;
        if (session instanceof Snmp) {
            this.usm = ((Snmp) session).getUSM();
        }
    }

    private Request createSnmpRequest(URI uri) throws UnknownHostException {
        String strSubstring;
        String str;
        List listSingletonList;
        String host = uri.getHost();
        int port = uri.getPort();
        if (port == -1) {
            port = SnmpConstants.DEFAULT_COMMAND_RESPONDER_PORT;
        }
        String userInfo = uri.getUserInfo();
        if (userInfo == null) {
            userInfo = this.defaultUserInfo;
        }
        String[] strArrSplit = uri.getPath().split(MqttTopic.TOPIC_LEVEL_SEPARATOR);
        if (strArrSplit.length > 1) {
            String str2 = strArrSplit[0];
            strSubstring = strArrSplit[1];
            String[] strArrSplit2 = str2.split(";");
            octetStringFromHexStringPairs = strArrSplit2.length > 1 ? OctetString.fromHexStringPairs(strArrSplit2[1]) : null;
            str = strArrSplit2[0];
        } else {
            strSubstring = strArrSplit.length == 1 ? strArrSplit[0] : null;
            str = "";
        }
        Target targetCreateTarget = createTarget(new OctetString(userInfo));
        if (host == null) {
            targetCreateTarget = this.defaultTarget;
        } else if (targetCreateTarget instanceof CertifiedTarget) {
            targetCreateTarget.setAddress(new TlsAddress(InetAddress.getByName(host), port));
        } else {
            targetCreateTarget.setAddress(new UdpAddress(InetAddress.getByName(host), port));
        }
        Target target = targetCreateTarget;
        PDU pduCreatePDU = this.pduFactory.createPDU(target);
        if (pduCreatePDU instanceof ScopedPDU) {
            if (octetStringFromHexStringPairs != null) {
                ((ScopedPDU) pduCreatePDU).setContextEngineID(octetStringFromHexStringPairs);
            }
            if (str != null) {
                ((ScopedPDU) pduCreatePDU).setContextName(new OctetString(str));
            }
        }
        SnmpUriType snmpUriType = SnmpUriType.GET;
        if (strSubstring != null && strSubstring.endsWith(".*")) {
            snmpUriType = SnmpUriType.SUBTREE;
            strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
        } else if (strSubstring != null && strSubstring.endsWith(MqttTopic.SINGLE_LEVEL_WILDCARD)) {
            snmpUriType = SnmpUriType.NEXT;
            strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
        }
        SnmpUriType snmpUriType2 = snmpUriType;
        if (strSubstring == null || !strSubstring.contains("(")) {
            listSingletonList = strSubstring != null ? Collections.singletonList(new OID(strSubstring)) : Collections.emptyList();
        } else {
            String[] strArrSplit3 = strSubstring.split("[\\(,\\),\\,]");
            listSingletonList = new ArrayList(strArrSplit3.length);
            for (String str3 : strArrSplit3) {
                if (str3.length() > 0) {
                    OID oid = new OID(str3);
                    if (oid.isValid()) {
                        listSingletonList.add(oid);
                    }
                }
            }
        }
        return new Request(this, target, pduCreatePDU, (OID[]) listSingletonList.toArray(new OID[listSingletonList.size()]), snmpUriType2, null);
    }

    private Target createTarget(OctetString octetString) {
        USM usm;
        if (octetString == null || octetString.length() == 0) {
            return this.defaultTarget;
        }
        if (this.version != 3) {
            CommunityTarget communityTarget = new CommunityTarget();
            communityTarget.setCommunity(octetString);
            communityTarget.setVersion(this.version);
            communityTarget.setSecurityModel(this.securityModel);
            communityTarget.setTimeout(this.timeout);
            communityTarget.setRetries(this.retries);
            return communityTarget;
        }
        int i10 = this.securityModel;
        if (i10 != 3 || (usm = this.usm) == null) {
            if (i10 != 4) {
                return null;
            }
            CertifiedTarget certifiedTarget = new CertifiedTarget(octetString);
            certifiedTarget.setVersion(this.version);
            certifiedTarget.setSecurityModel(this.securityModel);
            certifiedTarget.setTimeout(this.timeout);
            certifiedTarget.setRetries(this.retries);
            return certifiedTarget;
        }
        UsmUserEntry user = usm.getUser(null, octetString);
        UserTarget userTarget = new UserTarget();
        if (user != null) {
            if (user.getAuthenticationKey() == null) {
                userTarget.setSecurityLevel(1);
            } else if (user.getPrivacyKey() != null) {
                userTarget.setSecurityLevel(3);
            } else {
                userTarget.setSecurityLevel(2);
            }
        }
        userTarget.setVersion(this.version);
        userTarget.setSecurityName(octetString);
        userTarget.setSecurityModel(this.securityModel);
        userTarget.setTimeout(this.timeout);
        userTarget.setRetries(this.retries);
        return userTarget;
    }

    private SnmpUriResponse sendSnmpRequest(Request request, PDU pdu) {
        SnmpUriResponse snmpUriResponse = new SnmpUriResponse(5);
        try {
            ResponseEvent responseEventSend = this.snmp.send(pdu, request.getTarget());
            if (responseEventSend == null) {
                return new SnmpUriResponse(SnmpUriResponse.Type.FINAL);
            }
            PDU response = responseEventSend.getResponse();
            return response != null ? response.getErrorStatus() != 0 ? new SnmpUriResponse(response.getErrorStatus()) : new SnmpUriResponse((List<VariableBinding[]>) Collections.singletonList(response.getVariableBindings().toArray(new VariableBinding[response.size()]))) : new SnmpUriResponse(SnmpUriResponse.Type.TIMEOUT);
        } catch (IOException e10) {
            e10.printStackTrace();
            return snmpUriResponse;
        }
    }

    public void browse(URI uri, SnmpUriCallback snmpUriCallback, Object obj) throws UnknownHostException {
        Request requestCreateSnmpRequest = createSnmpRequest(uri);
        PDU pdu = requestCreateSnmpRequest.getPdu();
        int i10 = AnonymousClass1.$SwitchMap$org$snmp4j$uri$SnmpURI$SnmpUriType[requestCreateSnmpRequest.getType().ordinal()];
        if (i10 == 1) {
            pdu.setType(-96);
            pdu.addAll(VariableBinding.createFromOIDs(requestCreateSnmpRequest.getOIDs()));
            sendSnmpRequest(requestCreateSnmpRequest, pdu, uri, snmpUriCallback, obj);
        } else if (i10 == 2) {
            pdu.setType(-95);
            pdu.addAll(VariableBinding.createFromOIDs(requestCreateSnmpRequest.getOIDs()));
            sendSnmpRequest(requestCreateSnmpRequest, pdu, uri, snmpUriCallback, obj);
        } else {
            if (i10 != 3) {
                return;
            }
            new TreeUtils(this.snmp, this.pduFactory).walk(requestCreateSnmpRequest.getTarget(), requestCreateSnmpRequest.getOIDs(), obj, new AsyncTreeListener(uri, snmpUriCallback));
        }
    }

    public String getDefaultUserInfo() {
        return this.defaultUserInfo;
    }

    public PDUFactory getPduFactory() {
        return this.pduFactory;
    }

    public int getRetries() {
        return this.retries;
    }

    public int getSecurityModel() {
        return this.securityModel;
    }

    public long getTimeout() {
        return this.timeout;
    }

    public USM getUsm() {
        return this.usm;
    }

    public int getVersion() {
        return this.version;
    }

    public SnmpUriResponse sendByBinding(URI uri, List<VariableBinding> list, int i10) throws UnknownHostException {
        Request requestCreateSnmpRequest = createSnmpRequest(uri);
        PDU pdu = requestCreateSnmpRequest.getPdu();
        pdu.setType(i10);
        Iterator<VariableBinding> it = list.iterator();
        while (it.hasNext()) {
            pdu.add(it.next());
        }
        return sendSnmpRequest(requestCreateSnmpRequest, pdu);
    }

    public void setDefaultUserInfo(String str) {
        this.defaultUserInfo = str;
    }

    public void setPduFactory(PDUFactory pDUFactory) {
        this.pduFactory = pDUFactory;
    }

    public void setRetries(int i10) {
        this.retries = i10;
    }

    public void setSecurityModel(int i10) {
        this.securityModel = i10;
    }

    public void setSnmp(Session session) {
        this.snmp = session;
    }

    public void setTimeout(long j10) {
        this.timeout = j10;
    }

    public void setUsm(USM usm) {
        this.usm = usm;
    }

    public void setVersion(int i10) {
        this.version = i10;
    }

    public SnmpUriResponse updateByBinding(URI uri, List<VariableBinding> list) throws UnknownHostException {
        return sendByBinding(uri, list, -93);
    }

    public SnmpUriResponse updateByValue(URI uri, List<Variable> list) throws UnknownHostException {
        Request requestCreateSnmpRequest = createSnmpRequest(uri);
        PDU pdu = requestCreateSnmpRequest.getPdu();
        pdu.setType(-93);
        OID[] oIDs = requestCreateSnmpRequest.getOIDs();
        for (int i10 = 0; i10 < oIDs.length && i10 < list.size(); i10++) {
            pdu.add(new VariableBinding(oIDs[i10], list.get(i10)));
        }
        return sendSnmpRequest(requestCreateSnmpRequest, pdu);
    }

    public SnmpURI(Session session, Target target) throws IOException {
        this.snmp = session;
        this.defaultTarget = target;
        if (session instanceof Snmp) {
            this.usm = ((Snmp) session).getUSM();
        }
    }

    private void sendSnmpRequest(Request request, PDU pdu, URI uri, SnmpUriCallback snmpUriCallback, Object obj) {
        try {
            this.snmp.send(pdu, request.getTarget(), obj, new AsyncResponseListener(this, uri, snmpUriCallback, null));
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public SnmpUriResponse browse(URI uri) throws UnknownHostException {
        SnmpUriResponse snmpUriResponse = new SnmpUriResponse(5);
        Request requestCreateSnmpRequest = createSnmpRequest(uri);
        PDU pdu = requestCreateSnmpRequest.getPdu();
        int i10 = AnonymousClass1.$SwitchMap$org$snmp4j$uri$SnmpURI$SnmpUriType[requestCreateSnmpRequest.getType().ordinal()];
        if (i10 == 1) {
            pdu.setType(-96);
            pdu.addAll(VariableBinding.createFromOIDs(requestCreateSnmpRequest.getOIDs()));
            return sendSnmpRequest(requestCreateSnmpRequest, pdu);
        }
        if (i10 == 2) {
            pdu.setType(-95);
            pdu.addAll(VariableBinding.createFromOIDs(requestCreateSnmpRequest.getOIDs()));
            return sendSnmpRequest(requestCreateSnmpRequest, pdu);
        }
        if (i10 != 3) {
            return snmpUriResponse;
        }
        List<TreeEvent> listWalk = new TreeUtils(this.snmp, this.pduFactory).walk(requestCreateSnmpRequest.getTarget(), requestCreateSnmpRequest.getOIDs());
        ArrayList arrayList = new ArrayList(listWalk.size());
        int status = 0;
        for (TreeEvent treeEvent : listWalk) {
            arrayList.add(treeEvent.getVariableBindings());
            status = treeEvent.getStatus();
        }
        return new SnmpUriResponse(arrayList, status);
    }
}
