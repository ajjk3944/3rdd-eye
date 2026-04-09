package org.xbill.DNS;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.PrintStream;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class Lookup {
    public static final int HOST_NOT_FOUND = 3;
    public static final int SUCCESSFUL = 0;
    public static final int TRY_AGAIN = 2;
    public static final int TYPE_NOT_FOUND = 4;
    public static final int UNRECOVERABLE = 1;
    static /* synthetic */ Class class$org$xbill$DNS$Lookup;
    private static Map defaultCaches;
    private static int defaultNdots;
    private static Resolver defaultResolver;
    private static Name[] defaultSearchPath;
    private static final Name[] noAliases = new Name[0];
    private List aliases;
    private Record[] answers;
    private boolean badresponse;
    private String badresponse_error;
    private Cache cache;
    private int credibility;
    private int dclass;
    private boolean done;
    private boolean doneCurrent;
    private String error;
    private boolean foundAlias;
    private int iterations;
    private Name name;
    private boolean nametoolong;
    private boolean networkerror;
    private boolean nxdomain;
    private boolean referral;
    private Resolver resolver;
    private int result;
    private Name[] searchPath;
    private boolean temporary_cache;
    private boolean timedout;
    private int type;
    private boolean verbose;

    static {
        refreshDefault();
    }

    public Lookup(Name name, int i10, int i11) throws Throwable {
        Type.check(i10);
        DClass.check(i11);
        if (!Type.isRR(i10) && i10 != 255) {
            throw new IllegalArgumentException("Cannot query for meta-types other than ANY");
        }
        this.name = name;
        this.type = i10;
        this.dclass = i11;
        Class clsClass$ = class$org$xbill$DNS$Lookup;
        if (clsClass$ == null) {
            clsClass$ = class$("org.xbill.DNS.Lookup");
            class$org$xbill$DNS$Lookup = clsClass$;
        }
        synchronized (clsClass$) {
            this.resolver = getDefaultResolver();
            this.searchPath = getDefaultSearchPath();
            this.cache = getDefaultCache(i11);
        }
        this.credibility = 3;
        this.verbose = Options.check("verbose");
        this.result = -1;
    }

    private void checkDone() {
        if (!this.done || this.result == -1) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Lookup of ");
            stringBuffer.append(this.name);
            stringBuffer.append(" ");
            StringBuffer stringBuffer2 = new StringBuffer(stringBuffer.toString());
            if (this.dclass != 1) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append(DClass.string(this.dclass));
                stringBuffer3.append(" ");
                stringBuffer2.append(stringBuffer3.toString());
            }
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(Type.string(this.type));
            stringBuffer4.append(" isn't done");
            stringBuffer2.append(stringBuffer4.toString());
            throw new IllegalStateException(stringBuffer2.toString());
        }
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            throw new NoClassDefFoundError().initCause(e10);
        }
    }

    private void follow(Name name, Name name2) {
        this.foundAlias = true;
        this.badresponse = false;
        this.networkerror = false;
        this.timedout = false;
        this.nxdomain = false;
        this.referral = false;
        int i10 = this.iterations + 1;
        this.iterations = i10;
        if (i10 >= 6 || name.equals(name2)) {
            this.result = 1;
            this.error = "CNAME loop";
            this.done = true;
        } else {
            if (this.aliases == null) {
                this.aliases = new ArrayList();
            }
            this.aliases.add(name2);
            lookup(name);
        }
    }

    public static synchronized Cache getDefaultCache(int i10) {
        Cache cache;
        DClass.check(i10);
        cache = (Cache) defaultCaches.get(Mnemonic.toInteger(i10));
        if (cache == null) {
            cache = new Cache(i10);
            defaultCaches.put(Mnemonic.toInteger(i10), cache);
        }
        return cache;
    }

    public static synchronized Resolver getDefaultResolver() {
        return defaultResolver;
    }

    public static synchronized Name[] getDefaultSearchPath() {
        return defaultSearchPath;
    }

    private void lookup(Name name) {
        SetResponse setResponseLookupRecords = this.cache.lookupRecords(name, this.type, this.credibility);
        if (this.verbose) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("lookup ");
            stringBuffer.append(name);
            stringBuffer.append(" ");
            stringBuffer.append(Type.string(this.type));
            printStream.println(stringBuffer.toString());
            System.err.println(setResponseLookupRecords);
        }
        processResponse(name, setResponseLookupRecords);
        if (this.done || this.doneCurrent) {
            return;
        }
        Message messageNewQuery = Message.newQuery(Record.newRecord(name, this.type, this.dclass));
        try {
            Message messageSend = this.resolver.send(messageNewQuery);
            int rcode = messageSend.getHeader().getRcode();
            if (rcode != 0 && rcode != 3) {
                this.badresponse = true;
                this.badresponse_error = Rcode.string(rcode);
                return;
            }
            if (!messageNewQuery.getQuestion().equals(messageSend.getQuestion())) {
                this.badresponse = true;
                this.badresponse_error = "response does not match query";
                return;
            }
            SetResponse setResponseAddMessage = this.cache.addMessage(messageSend);
            if (setResponseAddMessage == null) {
                setResponseAddMessage = this.cache.lookupRecords(name, this.type, this.credibility);
            }
            if (this.verbose) {
                PrintStream printStream2 = System.err;
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("queried ");
                stringBuffer2.append(name);
                stringBuffer2.append(" ");
                stringBuffer2.append(Type.string(this.type));
                printStream2.println(stringBuffer2.toString());
                System.err.println(setResponseAddMessage);
            }
            processResponse(name, setResponseAddMessage);
        } catch (IOException e10) {
            if (e10 instanceof InterruptedIOException) {
                this.timedout = true;
            } else {
                this.networkerror = true;
            }
        }
    }

    private void processResponse(Name name, SetResponse setResponse) {
        if (setResponse.isSuccessful()) {
            RRset[] rRsetArrAnswers = setResponse.answers();
            ArrayList arrayList = new ArrayList();
            for (RRset rRset : rRsetArrAnswers) {
                Iterator itRrs = rRset.rrs();
                while (itRrs.hasNext()) {
                    arrayList.add(itRrs.next());
                }
            }
            this.result = 0;
            this.answers = (Record[]) arrayList.toArray(new Record[arrayList.size()]);
            this.done = true;
            return;
        }
        if (setResponse.isNXDOMAIN()) {
            this.nxdomain = true;
            this.doneCurrent = true;
            if (this.iterations > 0) {
                this.result = 3;
                this.done = true;
                return;
            }
            return;
        }
        if (setResponse.isNXRRSET()) {
            this.result = 4;
            this.answers = null;
            this.done = true;
        } else {
            if (setResponse.isCNAME()) {
                follow(setResponse.getCNAME().getTarget(), name);
                return;
            }
            if (!setResponse.isDNAME()) {
                if (setResponse.isDelegation()) {
                    this.referral = true;
                }
            } else {
                try {
                    follow(name.fromDNAME(setResponse.getDNAME()), name);
                } catch (NameTooLongException unused) {
                    this.result = 1;
                    this.error = "Invalid DNAME target";
                    this.done = true;
                }
            }
        }
    }

    public static synchronized void refreshDefault() {
        try {
            defaultResolver = new ExtendedResolver();
            defaultSearchPath = ResolverConfig.getCurrentConfig().searchPath();
            defaultCaches = new HashMap();
            defaultNdots = ResolverConfig.getCurrentConfig().ndots();
        } catch (UnknownHostException unused) {
            throw new RuntimeException("Failed to initialize resolver");
        }
    }

    private final void reset() {
        this.iterations = 0;
        this.foundAlias = false;
        this.done = false;
        this.doneCurrent = false;
        this.aliases = null;
        this.answers = null;
        this.result = -1;
        this.error = null;
        this.nxdomain = false;
        this.badresponse = false;
        this.badresponse_error = null;
        this.networkerror = false;
        this.timedout = false;
        this.nametoolong = false;
        this.referral = false;
        if (this.temporary_cache) {
            this.cache.clearCache();
        }
    }

    private void resolve(Name name, Name name2) {
        this.doneCurrent = false;
        if (name2 != null) {
            try {
                name = Name.concatenate(name, name2);
            } catch (NameTooLongException unused) {
                this.nametoolong = true;
                return;
            }
        }
        lookup(name);
    }

    public static synchronized void setDefaultCache(Cache cache, int i10) {
        DClass.check(i10);
        defaultCaches.put(Mnemonic.toInteger(i10), cache);
    }

    public static synchronized void setDefaultResolver(Resolver resolver) {
        defaultResolver = resolver;
    }

    public static synchronized void setDefaultSearchPath(Name[] nameArr) {
        defaultSearchPath = nameArr;
    }

    public static synchronized void setPacketLogger(PacketLogger packetLogger) {
        Client.setPacketLogger(packetLogger);
    }

    public Name[] getAliases() {
        checkDone();
        List list = this.aliases;
        return list == null ? noAliases : (Name[]) list.toArray(new Name[list.size()]);
    }

    public Record[] getAnswers() {
        checkDone();
        return this.answers;
    }

    public String getErrorString() {
        checkDone();
        String str = this.error;
        if (str != null) {
            return str;
        }
        int i10 = this.result;
        if (i10 == 0) {
            return "successful";
        }
        if (i10 == 1) {
            return "unrecoverable error";
        }
        if (i10 == 2) {
            return "try again";
        }
        if (i10 == 3) {
            return "host not found";
        }
        if (i10 == 4) {
            return "type not found";
        }
        throw new IllegalStateException("unknown result");
    }

    public int getResult() {
        checkDone();
        return this.result;
    }

    public Record[] run() {
        if (this.done) {
            reset();
        }
        if (!this.name.isAbsolute()) {
            if (this.searchPath != null) {
                if (this.name.labels() > defaultNdots) {
                    resolve(this.name, Name.root);
                }
                if (!this.done) {
                    int i10 = 0;
                    while (true) {
                        Name[] nameArr = this.searchPath;
                        if (i10 >= nameArr.length) {
                            break;
                        }
                        resolve(this.name, nameArr[i10]);
                        if (this.done) {
                            return this.answers;
                        }
                        if (this.foundAlias) {
                            break;
                        }
                        i10++;
                    }
                } else {
                    return this.answers;
                }
            } else {
                resolve(this.name, Name.root);
            }
        } else {
            resolve(this.name, null);
        }
        if (!this.done) {
            if (this.badresponse) {
                this.result = 2;
                this.error = this.badresponse_error;
                this.done = true;
            } else if (this.timedout) {
                this.result = 2;
                this.error = "timed out";
                this.done = true;
            } else if (this.networkerror) {
                this.result = 2;
                this.error = "network error";
                this.done = true;
            } else if (this.nxdomain) {
                this.result = 3;
                this.done = true;
            } else if (this.referral) {
                this.result = 1;
                this.error = "referral";
                this.done = true;
            } else if (this.nametoolong) {
                this.result = 1;
                this.error = "name too long";
                this.done = true;
            }
        }
        return this.answers;
    }

    public void setCache(Cache cache) {
        if (cache == null) {
            this.cache = new Cache(this.dclass);
            this.temporary_cache = true;
        } else {
            this.cache = cache;
            this.temporary_cache = false;
        }
    }

    public void setCredibility(int i10) {
        this.credibility = i10;
    }

    public void setNdots(int i10) {
        if (i10 >= 0) {
            defaultNdots = i10;
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Illegal ndots value: ");
        stringBuffer.append(i10);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public void setResolver(Resolver resolver) {
        this.resolver = resolver;
    }

    public void setSearchPath(Name[] nameArr) {
        this.searchPath = nameArr;
    }

    public void setSearchPath(String[] strArr) throws TextParseException {
        if (strArr == null) {
            this.searchPath = null;
            return;
        }
        Name[] nameArr = new Name[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            nameArr[i10] = Name.fromString(strArr[i10], Name.root);
        }
        this.searchPath = nameArr;
    }

    public static synchronized void setDefaultSearchPath(String[] strArr) throws TextParseException {
        if (strArr == null) {
            defaultSearchPath = null;
            return;
        }
        Name[] nameArr = new Name[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            nameArr[i10] = Name.fromString(strArr[i10], Name.root);
        }
        defaultSearchPath = nameArr;
    }

    public Lookup(Name name, int i10) {
        this(name, i10, 1);
    }

    public Lookup(Name name) {
        this(name, 1, 1);
    }

    public Lookup(String str, int i10, int i11) throws TextParseException {
        this(Name.fromString(str), i10, i11);
    }

    public Lookup(String str, int i10) throws TextParseException {
        this(Name.fromString(str), i10, 1);
    }

    public Lookup(String str) throws TextParseException {
        this(Name.fromString(str), 1, 1);
    }
}
