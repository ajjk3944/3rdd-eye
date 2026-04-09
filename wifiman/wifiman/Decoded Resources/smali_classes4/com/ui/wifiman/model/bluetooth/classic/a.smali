.class public final Lcom/ui/wifiman/model/bluetooth/classic/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/bluetooth/classic/a$a;
    }
.end annotation


# static fields
.field public static final k:Lcom/ui/wifiman/model/bluetooth/classic/a$a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/bluetooth/BluetoothManager;

.field private final c:Lgg/i;

.field private final d:Lgg/b;

.field private final e:Ljava/util/List;

.field private final f:Lgg/i;

.field private final g:Lgg/i;

.field private final h:Lgg/i;

.field private final i:Lgg/i;

.field private final j:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/classic/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/bluetooth/classic/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/bluetooth/classic/a;->k:Lcom/ui/wifiman/model/bluetooth/classic/a$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/bluetooth/BluetoothManager;Lwc/d;Ltc/a;Lcom/ui/wifiman/model/vendor/d$b;Lcom/ui/wifiman/model/android/permissions/d;)V
    .locals 4

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothReceiver"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "androidSystemReceiverFactory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "macVendorManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permissionsService"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/classic/a;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/ui/wifiman/model/bluetooth/classic/a;->b:Landroid/bluetooth/BluetoothManager;

    sget-object p1, LAg/c;->a:LAg/c;

    new-instance p2, Landroid/content/IntentFilter;

    const-string v0, "android.bluetooth.device.action.FOUND"

    invoke-direct {p2, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-interface {p4, p2}, Ltc/a;->a(Landroid/content/IntentFilter;)Lgg/i;

    move-result-object p2

    invoke-interface {p5}, Lcom/ui/wifiman/model/vendor/d$b;->a()Lgg/z;

    move-result-object p4

    invoke-virtual {p4}, Lgg/z;->W()Lgg/i;

    move-result-object p4

    const-string v0, "toFlowable(...)"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, p4}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/bluetooth/classic/a$b;

    invoke-direct {p2, p0}, Lcom/ui/wifiman/model/bluetooth/classic/a$b;-><init>(Lcom/ui/wifiman/model/bluetooth/classic/a;)V

    invoke-virtual {p1, p2}, Lgg/i;->v0(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string p2, "flatMapMaybe(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/classic/a;->c:Lgg/i;

    new-instance p1, Lcom/ui/wifiman/model/bluetooth/classic/a$p;

    invoke-direct {p1, p0}, Lcom/ui/wifiman/model/bluetooth/classic/a$p;-><init>(Lcom/ui/wifiman/model/bluetooth/classic/a;)V

    invoke-static {p1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string p2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x2710

    sget-object p4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, p4}, Lgg/b;->a0(JLjava/util/concurrent/TimeUnit;)Lgg/b;

    move-result-object p4

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/classic/a$q;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/bluetooth/classic/a$q;-><init>(Lcom/ui/wifiman/model/bluetooth/classic/a;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x3

    new-array p2, p2, [Lgg/f;

    const/4 v1, 0x0

    aput-object p1, p2, v1

    const/4 p1, 0x1

    aput-object p4, p2, p1

    const/4 p4, 0x2

    aput-object v0, p2, p4

    invoke-static {p2}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p2

    sget-object v0, Lcom/ui/wifiman/model/bluetooth/classic/a$i;->a:Lcom/ui/wifiman/model/bluetooth/classic/a$i;

    invoke-virtual {p2, v0}, Lgg/b;->P(Lkg/n;)Lgg/b;

    move-result-object p2

    new-instance v0, Lxc/a;

    invoke-direct {v0, p0}, Lxc/a;-><init>(Lcom/ui/wifiman/model/bluetooth/classic/a;)V

    invoke-virtual {p2, v0}, Lgg/b;->y(Lkg/a;)Lgg/b;

    move-result-object p2

    invoke-virtual {p2}, Lgg/b;->f0()Lgg/s;

    move-result-object p2

    invoke-virtual {p2}, Lgg/s;->r0()LBg/a;

    move-result-object p2

    invoke-virtual {p2}, LBg/a;->l1()Lgg/s;

    move-result-object p2

    invoke-virtual {p2}, Lgg/s;->f0()Lgg/b;

    move-result-object p2

    const-string v0, "ignoreElements(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ui/wifiman/model/bluetooth/classic/a;->d:Lgg/b;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p2, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget p4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1c

    if-lt p4, v0, :cond_0

    const/16 v0, 0x13

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    const/16 v0, 0x1e

    if-lt p4, v0, :cond_1

    const/16 p4, 0x15

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p2, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    iput-object p2, p0, Lcom/ui/wifiman/model/bluetooth/classic/a;->e:Ljava/util/List;

    check-cast p2, Ljava/lang/Iterable;

    new-instance p4, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p2, v0}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p4, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/bluetooth/classic/a;->m(I)Lgg/i;

    move-result-object v2

    new-instance v3, Lcom/ui/wifiman/model/bluetooth/classic/a$c;

    invoke-direct {v3, v0}, Lcom/ui/wifiman/model/bluetooth/classic/a$c;-><init>(I)V

    invoke-virtual {v2, v3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-interface {p4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {p4}, LAg/b;->a(Ljava/lang/Iterable;)Lgg/i;

    move-result-object p2

    invoke-static {}, Lfg/b;->g()Lgg/y;

    move-result-object p4

    invoke-virtual {p2, p4}, Lgg/i;->g2(Lgg/y;)Lgg/i;

    move-result-object p2

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p4

    invoke-virtual {p2, p4}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p2

    new-instance p4, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sget-object v0, Lcom/ui/wifiman/model/bluetooth/classic/a$d;->a:Lcom/ui/wifiman/model/bluetooth/classic/a$d;

    invoke-virtual {p2, p4, v0}, Lgg/i;->q1(Ljava/lang/Object;Lkg/b;)Lgg/i;

    move-result-object p2

    sget-object p4, Lcom/ui/wifiman/model/bluetooth/classic/a$e;->a:Lcom/ui/wifiman/model/bluetooth/classic/a$e;

    invoke-virtual {p2, p4}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    const-string p4, "map(...)"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ui/wifiman/model/bluetooth/classic/a;->f:Lgg/i;

    invoke-interface {p5}, Lcom/ui/wifiman/model/vendor/d$b;->a()Lgg/z;

    move-result-object p2

    new-instance p4, Lcom/ui/wifiman/model/bluetooth/classic/a$f;

    invoke-direct {p4, p0}, Lcom/ui/wifiman/model/bluetooth/classic/a$f;-><init>(Lcom/ui/wifiman/model/bluetooth/classic/a;)V

    invoke-virtual {p2, p4}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->e1()Lgg/i;

    move-result-object p2

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p4

    invoke-virtual {p2, p4, v1, p1}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    invoke-virtual {p2, p1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    const-string p4, "refCount(...)"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ui/wifiman/model/bluetooth/classic/a;->g:Lgg/i;

    iget-object p2, p0, Lcom/ui/wifiman/model/bluetooth/classic/a;->c:Lgg/i;

    new-instance p5, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sget-object v0, Lcom/ui/wifiman/model/bluetooth/classic/a$m;->a:Lcom/ui/wifiman/model/bluetooth/classic/a$m;

    invoke-virtual {p2, p5, v0}, Lgg/i;->q1(Ljava/lang/Object;Lkg/b;)Lgg/i;

    move-result-object p2

    new-instance p5, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-virtual {p2, p5}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p2

    const-wide/16 v2, 0x3e8

    sget-object p5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2, v2, v3, p5}, Lgg/i;->U1(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->e1()Lgg/i;

    move-result-object p2

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p5

    invoke-virtual {p2, p5, v1, p1}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p2

    sget-object p5, Lcom/ui/wifiman/model/bluetooth/classic/a$n;->a:Lcom/ui/wifiman/model/bluetooth/classic/a$n;

    invoke-virtual {p2, p5}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    sget-object p5, Lcom/ui/wifiman/model/bluetooth/classic/a$o;->a:Lcom/ui/wifiman/model/bluetooth/classic/a$o;

    invoke-virtual {p2, p5}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p2

    iget-object p5, p0, Lcom/ui/wifiman/model/bluetooth/classic/a;->d:Lgg/b;

    invoke-virtual {p2, p5}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p2

    const-string p5, "mergeWith(...)"

    invoke-static {p2, p5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ui/wifiman/model/bluetooth/classic/a;->h:Lgg/i;

    invoke-interface {p3}, Lwc/d;->a()Lgg/i;

    move-result-object p2

    new-instance p3, Lcom/ui/wifiman/model/bluetooth/classic/a$l;

    invoke-direct {p3, p0}, Lcom/ui/wifiman/model/bluetooth/classic/a$l;-><init>(Lcom/ui/wifiman/model/bluetooth/classic/a;)V

    invoke-virtual {p2, p3}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p2

    const-string p3, "switchMap(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ui/wifiman/model/bluetooth/classic/a;->i:Lgg/i;

    invoke-interface {p6}, Lcom/ui/wifiman/model/android/permissions/d;->b()Lgg/i;

    move-result-object p2

    sget-object p3, Lcom/ui/wifiman/model/bluetooth/classic/a$j;->a:Lcom/ui/wifiman/model/bluetooth/classic/a$j;

    invoke-virtual {p2, p3}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    new-instance p3, Lcom/ui/wifiman/model/bluetooth/classic/a$k;

    invoke-direct {p3, p0}, Lcom/ui/wifiman/model/bluetooth/classic/a$k;-><init>(Lcom/ui/wifiman/model/bluetooth/classic/a;)V

    invoke-virtual {p2, p3}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2, p1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/bluetooth/classic/a;->j:Lgg/i;

    return-void
.end method

.method public static synthetic b(ILcom/ui/wifiman/model/bluetooth/classic/a;Lgg/j;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/model/bluetooth/classic/a;->n(ILcom/ui/wifiman/model/bluetooth/classic/a;Lgg/j;)V

    return-void
.end method

.method public static synthetic c(I)V
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/bluetooth/classic/a;->p(I)V

    return-void
.end method

.method public static synthetic d(Lcom/ui/wifiman/model/bluetooth/classic/a;)V
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/bluetooth/classic/a;->r(Lcom/ui/wifiman/model/bluetooth/classic/a;)V

    return-void
.end method

.method public static synthetic e(Lkotlin/jvm/internal/N;Lcom/ui/wifiman/model/bluetooth/classic/a;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/model/bluetooth/classic/a;->o(Lkotlin/jvm/internal/N;Lcom/ui/wifiman/model/bluetooth/classic/a;I)V

    return-void
.end method

.method public static final synthetic f(Lcom/ui/wifiman/model/bluetooth/classic/a;Landroid/bluetooth/BluetoothDevice;Ljava/lang/Integer;ZLcom/ui/wifiman/model/vendor/d$a;)Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/model/bluetooth/classic/a;->q(Landroid/bluetooth/BluetoothDevice;Ljava/lang/Integer;ZLcom/ui/wifiman/model/vendor/d$a;)Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lcom/ui/wifiman/model/bluetooth/classic/a;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/bluetooth/classic/a;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic h(Lcom/ui/wifiman/model/bluetooth/classic/a;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/bluetooth/classic/a;->f:Lgg/i;

    return-object p0
.end method

.method public static final synthetic i(Lcom/ui/wifiman/model/bluetooth/classic/a;)Landroid/bluetooth/BluetoothManager;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/bluetooth/classic/a;->b:Landroid/bluetooth/BluetoothManager;

    return-object p0
.end method

.method public static final synthetic j(Lcom/ui/wifiman/model/bluetooth/classic/a;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/bluetooth/classic/a;->g:Lgg/i;

    return-object p0
.end method

.method public static final synthetic k(Lcom/ui/wifiman/model/bluetooth/classic/a;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/bluetooth/classic/a;->i:Lgg/i;

    return-object p0
.end method

.method public static final synthetic l(Lcom/ui/wifiman/model/bluetooth/classic/a;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/bluetooth/classic/a;->h:Lgg/i;

    return-object p0
.end method

.method private final m(I)Lgg/i;
    .locals 2

    new-instance v0, Lxc/b;

    invoke-direct {v0, p1, p0}, Lxc/b;-><init>(ILcom/ui/wifiman/model/bluetooth/classic/a;)V

    sget-object v1, Lgg/a;->LATEST:Lgg/a;

    invoke-static {v0, v1}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/bluetooth/classic/a$h;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/bluetooth/classic/a$h;-><init>(I)V

    invoke-virtual {v0, v1}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object v0

    new-instance v1, Lxc/c;

    invoke-direct {v1, p1}, Lxc/c;-><init>(I)V

    invoke-virtual {v0, v1}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p1

    const-string v0, "doFinally(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final n(ILcom/ui/wifiman/model/bluetooth/classic/a;Lgg/j;)V
    .locals 4

    const-string v0, "emitter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/jvm/internal/N;

    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v1, Lcom/ui/wifiman/model/bluetooth/classic/a$g;

    invoke-direct {v1, v0, p2, p1}, Lcom/ui/wifiman/model/bluetooth/classic/a$g;-><init>(Lkotlin/jvm/internal/N;Lgg/j;Lcom/ui/wifiman/model/bluetooth/classic/a;)V

    new-instance v2, Lxc/d;

    invoke-direct {v2, v0, p1, p0}, Lxc/d;-><init>(Lkotlin/jvm/internal/N;Lcom/ui/wifiman/model/bluetooth/classic/a;I)V

    invoke-interface {p2, v2}, Lgg/j;->d(Lkg/e;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Bluetooth proxy requested for "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v3}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :try_start_0
    iget-object v0, p1, Lcom/ui/wifiman/model/bluetooth/classic/a;->b:Landroid/bluetooth/BluetoothManager;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    iget-object p1, p1, Lcom/ui/wifiman/model/bluetooth/classic/a;->a:Landroid/content/Context;

    invoke-virtual {v0, p1, v1, p0}, Landroid/bluetooth/BluetoothAdapter;->getProfileProxy(Landroid/content/Context;Landroid/bluetooth/BluetoothProfile$ServiceListener;I)Z
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance p0, Ll9/a;

    invoke-direct {p0, v3}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, p0}, Lgg/h;->h(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private static final o(Lkotlin/jvm/internal/N;Lcom/ui/wifiman/model/bluetooth/classic/a;I)V
    .locals 0

    iget-object p0, p0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast p0, Landroid/bluetooth/BluetoothProfile;

    if-eqz p0, :cond_0

    iget-object p1, p1, Lcom/ui/wifiman/model/bluetooth/classic/a;->b:Landroid/bluetooth/BluetoothManager;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p1

    invoke-virtual {p1, p2, p0}, Landroid/bluetooth/BluetoothAdapter;->closeProfileProxy(ILandroid/bluetooth/BluetoothProfile;)V

    :cond_0
    return-void
.end method

.method private static final p(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Bluetooth proxy disposed for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private final q(Landroid/bluetooth/BluetoothDevice;Ljava/lang/Integer;ZLcom/ui/wifiman/model/vendor/d$a;)Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;
    .locals 12

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v2, Lh9/a;->b:Lh9/a$b;

    invoke-virtual {v2, v0}, Lh9/a$b;->e(Ljava/lang/String;)Lh9/a;

    move-result-object v0

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, v1

    :goto_0
    if-eqz v3, :cond_2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {p1}, Lzc/a;->a(Landroid/bluetooth/BluetoothDevice;)LCc/b;

    move-result-object v7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    move-object/from16 v0, p4

    invoke-interface {v0, v3}, Lcom/ui/wifiman/model/vendor/d$a;->a(Lh9/a;)Lcom/ui/wifiman/model/vendor/d;

    move-result-object v8

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getType()I

    move-result v0

    invoke-static {v0}, Lzc/a;->b(I)Ljava/util/Set;

    move-result-object v9

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result v0

    sget-object v1, LU7/a;->e:LU7/a$a;

    invoke-virtual {v1, v0}, LU7/a$a;->a(I)LU7/a;

    move-result-object v1

    :cond_1
    move-object v6, v1

    new-instance v0, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;

    move-object v2, v0

    move v5, p3

    invoke-direct/range {v2 .. v11}, Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$a;-><init>(Lh9/a;Ljava/lang/String;ZLU7/a;LCc/b;Lcom/ui/wifiman/model/vendor/d;Ljava/util/Set;J)V

    return-object v0

    :cond_2
    return-object v1
.end method

.method private static final r(Lcom/ui/wifiman/model/bluetooth/classic/a;)V
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/classic/a;->b:Landroid/bluetooth/BluetoothManager;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isDiscovering()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object p0, p0, Lcom/ui/wifiman/model/bluetooth/classic/a;->b:Landroid/bluetooth/BluetoothManager;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothAdapter;->cancelDiscovery()Z

    :cond_0
    const-string p0, "Bluetooth Scanner discovery CANCELLED"

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/bluetooth/classic/a;->j:Lgg/i;

    return-object v0
.end method
