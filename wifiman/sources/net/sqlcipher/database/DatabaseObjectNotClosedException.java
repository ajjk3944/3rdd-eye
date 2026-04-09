package net.sqlcipher.database;

/* loaded from: classes4.dex */
public class DatabaseObjectNotClosedException extends RuntimeException {

    /* renamed from: s, reason: collision with root package name */
    private static final String f54628s = "Application did not close the cursor or database object that was opened here";

    public DatabaseObjectNotClosedException() {
        super(f54628s);
    }
}
