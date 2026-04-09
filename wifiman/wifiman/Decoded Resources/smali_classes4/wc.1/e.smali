.class public final Lwc/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc/d;


# instance fields
.field private final a:Lgg/i;

.field private final b:Lgg/i;

.field private final c:Z


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothManager;Landroid/content/pm/PackageManager;Ltc/a;)V
    .locals 2

    const-string v0, "bluetoothManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packageManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "androidSystemReceiverFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-interface {p3, v0}, Ltc/a;->a(Landroid/content/IntentFilter;)Lgg/i;

    move-result-object p3

    new-instance v0, Lwc/e$a;

    invoke-direct {v0, p0}, Lwc/e$a;-><init>(Lwc/e;)V

    invoke-virtual {p3, v0}, Lgg/i;->v0(Lkg/n;)Lgg/i;

    move-result-object p3

    new-instance v0, Lwc/e$b;

    invoke-direct {v0, p1, p0}, Lwc/e$b;-><init>(Landroid/bluetooth/BluetoothManager;Lwc/e;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Lgg/i;->y1(Lgg/D;)Lgg/i;

    move-result-object p3

    const-string v0, "startWith(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lwc/e;->a:Lgg/i;

    new-instance p3, Lwc/e$c;

    invoke-direct {p3, p0}, Lwc/e$c;-><init>(Lwc/e;)V

    invoke-static {p3}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p3

    invoke-static {p3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwc/e$d;

    invoke-direct {v0, p0}, Lwc/e$d;-><init>(Lwc/e;)V

    invoke-virtual {p3, v0}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p3

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p3, v0}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p3

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p3, v0}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p3

    invoke-virtual {p3}, Lgg/i;->W()Lgg/i;

    move-result-object p3

    sget-object v0, Lwc/e$e;->a:Lwc/e$e;

    invoke-virtual {p3, v0}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p3

    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p3

    invoke-virtual {p3}, Ljg/a;->i2()Lgg/i;

    move-result-object p3

    const-string v1, "refCount(...)"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lwc/e;->b:Lgg/i;

    const-string p3, "android.hardware.bluetooth"

    invoke-virtual {p2, p3}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lwc/e;->c:Z

    return-void
.end method

.method public static final synthetic b(Lwc/e;I)Lwc/d$a;
    .locals 0

    invoke-direct {p0, p1}, Lwc/e;->e(I)Lwc/d$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lwc/e;)Z
    .locals 0

    iget-boolean p0, p0, Lwc/e;->c:Z

    return p0
.end method

.method public static final synthetic d(Lwc/e;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lwc/e;->a:Lgg/i;

    return-object p0
.end method

.method private final e(I)Lwc/d$a;
    .locals 3

    const/high16 v0, -0x80000000

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unknown bluetooth state "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object p1, Lwc/d$a;->STATE_TURNING_OFF:Lwc/d$a;

    goto :goto_0

    :pswitch_1
    sget-object p1, Lwc/d$a;->STATE_ON:Lwc/d$a;

    goto :goto_0

    :pswitch_2
    sget-object p1, Lwc/d$a;->STATE_TURNING_ON:Lwc/d$a;

    goto :goto_0

    :pswitch_3
    sget-object p1, Lwc/d$a;->STATE_OFF:Lwc/d$a;

    goto :goto_0

    :cond_0
    sget-object p1, Lwc/d$a;->ERROR:Lwc/d$a;

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lwc/e;->b:Lgg/i;

    return-object v0
.end method
