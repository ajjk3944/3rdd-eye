package org.xbill.DNS;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class Update extends Message {
    private int dclass;
    private Name origin;

    public Update(Name name, int i10) {
        if (!name.isAbsolute()) {
            throw new RelativeNameException(name);
        }
        DClass.check(i10);
        getHeader().setOpcode(5);
        addRecord(Record.newRecord(name, 6, 1), 0);
        this.origin = name;
        this.dclass = i10;
    }

    private void newPrereq(Record record) {
        addRecord(record, 1);
    }

    private void newUpdate(Record record) {
        addRecord(record, 2);
    }

    public void absent(Name name) {
        newPrereq(Record.newRecord(name, 255, 254, 0L));
    }

    public void add(Name name, int i10, long j10, String str) throws IOException {
        newUpdate(Record.fromString(name, i10, this.dclass, j10, str, this.origin));
    }

    public void delete(Name name) {
        newUpdate(Record.newRecord(name, 255, 255, 0L));
    }

    public void present(Name name) {
        newPrereq(Record.newRecord(name, 255, 255, 0L));
    }

    public void replace(Name name, int i10, long j10, String str) throws IOException {
        delete(name, i10);
        add(name, i10, j10, str);
    }

    public void absent(Name name, int i10) {
        newPrereq(Record.newRecord(name, i10, 254, 0L));
    }

    public void add(Name name, int i10, long j10, Tokenizer tokenizer) throws IOException {
        newUpdate(Record.fromString(name, i10, this.dclass, j10, tokenizer, this.origin));
    }

    public void delete(Name name, int i10) {
        newUpdate(Record.newRecord(name, i10, 255, 0L));
    }

    public void present(Name name, int i10) {
        newPrereq(Record.newRecord(name, i10, 255, 0L));
    }

    public void add(Record record) {
        newUpdate(record);
    }

    public void delete(Name name, int i10, String str) throws IOException {
        newUpdate(Record.fromString(name, i10, 254, 0L, str, this.origin));
    }

    public void present(Name name, int i10, String str) throws IOException {
        newPrereq(Record.fromString(name, i10, this.dclass, 0L, str, this.origin));
    }

    public void replace(Name name, int i10, long j10, Tokenizer tokenizer) throws IOException {
        delete(name, i10);
        add(name, i10, j10, tokenizer);
    }

    public void add(Record[] recordArr) {
        for (Record record : recordArr) {
            add(record);
        }
    }

    public void delete(Name name, int i10, Tokenizer tokenizer) throws IOException {
        newUpdate(Record.fromString(name, i10, 254, 0L, tokenizer, this.origin));
    }

    public void present(Name name, int i10, Tokenizer tokenizer) throws IOException {
        newPrereq(Record.fromString(name, i10, this.dclass, 0L, tokenizer, this.origin));
    }

    public void delete(Record record) {
        newUpdate(record.withDClass(254, 0L));
    }

    public void present(Record record) {
        newPrereq(record);
    }

    public void replace(Record record) {
        delete(record.getName(), record.getType());
        add(record);
    }

    public void add(RRset rRset) {
        Iterator itRrs = rRset.rrs();
        while (itRrs.hasNext()) {
            add((Record) itRrs.next());
        }
    }

    public void delete(Record[] recordArr) {
        for (Record record : recordArr) {
            delete(record);
        }
    }

    public void replace(Record[] recordArr) {
        for (Record record : recordArr) {
            replace(record);
        }
    }

    public void delete(RRset rRset) {
        Iterator itRrs = rRset.rrs();
        while (itRrs.hasNext()) {
            delete((Record) itRrs.next());
        }
    }

    public void replace(RRset rRset) {
        delete(rRset.getName(), rRset.getType());
        Iterator itRrs = rRset.rrs();
        while (itRrs.hasNext()) {
            add((Record) itRrs.next());
        }
    }

    public Update(Name name) {
        this(name, 1);
    }
}
