package hf;

/* loaded from: classes.dex */
public enum t {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* renamed from: id, reason: collision with root package name */
    private final int f10717id;

    t(int i10) {
        this.f10717id = i10;
    }

    public static t determineFrom(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int getId() {
        return this.f10717id;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f10717id);
    }
}
