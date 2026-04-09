package e5;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements a5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7807a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f7808d;

    public /* synthetic */ d(a aVar, int i10) {
        this.f7807a = i10;
        this.f7808d = aVar;
    }

    @Override // a5.j
    public final void a(Object obj) {
        switch (this.f7807a) {
            case 0:
                ((c) obj).onPlayerReleased(this.f7808d);
                break;
            case 1:
                ((c) obj).onDrmKeysRemoved(this.f7808d);
                break;
            case 2:
                ((c) obj).onSeekProcessed(this.f7808d);
                break;
            case 3:
                ((c) obj).onDrmKeysRestored(this.f7808d);
                break;
            case 4:
                ((c) obj).onSeekStarted(this.f7808d);
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                ((c) obj).onDrmKeysLoaded(this.f7808d);
                break;
            default:
                ((c) obj).onDrmSessionReleased(this.f7808d);
                break;
        }
    }
}
