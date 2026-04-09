package kotlin.text;

/* loaded from: classes4.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f52285a = new s();

    /* renamed from: b, reason: collision with root package name */
    public static final p f52286b;

    static {
        String str = "[eE][+-]?(\\p{Digit}+)";
        f52286b = new p("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ("((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)(" + str + ")?)|(\\.((\\p{Digit}+))(" + str + ")?)|((" + ("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))") + ")[pP][+-]?(\\p{Digit}+))") + ")[fFdD]?))[\\x00-\\x20]*");
    }

    private s() {
    }
}
