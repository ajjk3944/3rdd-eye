.class public final Lwc/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwc/m$a;
    }
.end annotation


# static fields
.field public static final n:Lwc/m$a;


# instance fields
.field private final a:Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner;

.field private final b:Lcom/ui/wifiman/model/bluetooth/le/BleScanner;

.field private final c:Lwc/g;

.field private final d:LFg/a;

.field private final e:LFg/a;

.field private final f:Lgg/i;

.field private final g:Lgg/i;

.field private final h:Lgg/i;

.field private final i:Lgg/i;

.field private final j:Lgg/i;

.field private final k:Lgg/i;

.field private final l:Lgg/i;

.field private final m:Lgg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwc/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lwc/m$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lwc/m;->n:Lwc/m$a;

    return-void
.end method

.method public constructor <init>(Lwc/d;Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner;Lcom/ui/wifiman/model/bluetooth/le/BleScanner;Lcom/ubnt/usurvey/a$b;)V
    .locals 7

    const-string v0, "bluetoothReceiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classicScanner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleScanner"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configurationManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lwc/m;->a:Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner;

    iput-object p3, p0, Lwc/m;->b:Lcom/ui/wifiman/model/bluetooth/le/BleScanner;

    new-instance p2, Lwc/g;

    invoke-direct {p2}, Lwc/g;-><init>()V

    iput-object p2, p0, Lwc/m;->c:Lwc/g;

    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p3}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object v0

    const-string v1, "createDefault(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lwc/m;->d:LFg/a;

    invoke-static {p3}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p3

    invoke-static {p3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lwc/m;->e:LFg/a;

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object v0

    invoke-virtual {v0, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    const-string v1, "refCount(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lwc/m;->f:Lgg/i;

    invoke-virtual {p3}, Lgg/i;->W()Lgg/i;

    move-result-object p3

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v4

    invoke-virtual {p3, v4, v2, v3}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p3

    invoke-virtual {p3, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p3

    invoke-virtual {p3}, Ljg/a;->i2()Lgg/i;

    move-result-object p3

    invoke-static {p3, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lwc/m;->g:Lgg/i;

    invoke-interface {p4}, Lcom/ubnt/usurvey/a$b;->b()Lgg/i;

    move-result-object v4

    sget-object v5, Lwc/m$f;->a:Lwc/m$f;

    invoke-virtual {v4, v5}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v4

    invoke-virtual {p2}, Lfe/s;->g()Lgg/i;

    move-result-object v5

    sget-object v6, Lwc/m$g;->a:Lwc/m$g;

    invoke-virtual {v5, v6}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v5

    sget-object v6, Lwc/m$h;->a:Lwc/m$h;

    invoke-static {v4, v5, v6}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v4

    invoke-virtual {v4}, Lgg/i;->W()Lgg/i;

    move-result-object v4

    new-instance v5, Lwc/m$i;

    invoke-direct {v5, p0}, Lwc/m$i;-><init>(Lwc/m;)V

    invoke-virtual {v4, v5}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v4

    const-string v5, "switchMap(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, p0, Lwc/m;->h:Lgg/i;

    invoke-interface {p4}, Lcom/ubnt/usurvey/a$b;->b()Lgg/i;

    move-result-object p4

    sget-object v6, Lwc/m$b;->a:Lwc/m$b;

    invoke-virtual {p4, v6}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p4

    invoke-virtual {p2}, Lfe/s;->g()Lgg/i;

    move-result-object p2

    sget-object v6, Lwc/m$c;->a:Lwc/m$c;

    invoke-virtual {p2, v6}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    sget-object v6, Lwc/m$d;->a:Lwc/m$d;

    invoke-static {p4, p2, v6}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    new-instance p4, Lwc/m$e;

    invoke-direct {p4, p0}, Lwc/m$e;-><init>(Lwc/m;)V

    invoke-virtual {p2, p4}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-static {p2, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lwc/m;->i:Lgg/i;

    sget-object p4, LAg/c;->a:LAg/c;

    invoke-virtual {p4, v4, p2}, LAg/c;->a(Lgg/i;Lgg/i;)Lgg/i;

    move-result-object p2

    const-wide/16 v4, 0x3e8

    sget-object p4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2, v4, v5, p4}, Lgg/i;->U1(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->e1()Lgg/i;

    move-result-object p2

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p4

    invoke-virtual {p2, p4, v2, v3}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p2

    sget-object p4, Lwc/m$j;->a:Lwc/m$j;

    invoke-virtual {p2, p4}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    sget-object p4, Lwc/m$k;->a:Lwc/m$k;

    invoke-virtual {p2, p4}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p2

    sget-object p4, Lwc/m$l;->a:Lwc/m$l;

    invoke-virtual {p2, p4}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p2

    new-instance p4, Lwc/i;

    invoke-direct {p4}, Lwc/i;-><init>()V

    invoke-virtual {p2, p4}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lwc/m;->j:Lgg/i;

    new-instance p2, Lwc/m$m;

    invoke-direct {p2, p1, p0}, Lwc/m$m;-><init>(Lwc/d;Lwc/m;)V

    invoke-virtual {v0, p2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p2

    new-instance p4, Lwc/m$n;

    invoke-direct {p4, p0}, Lwc/m$n;-><init>(Lwc/m;)V

    invoke-virtual {p2, p4}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p2

    new-instance p4, Lwc/j;

    invoke-direct {p4, p0}, Lwc/j;-><init>(Lwc/m;)V

    invoke-virtual {p2, p4}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lwc/m;->k:Lgg/i;

    invoke-interface {p1}, Lwc/d;->a()Lgg/i;

    move-result-object p1

    sget-object p2, Lwc/m$o;->a:Lwc/m$o;

    invoke-static {p3, v0, p1, p2}, Lgg/i;->u(LDj/a;LDj/a;LDj/a;Lkg/g;)Lgg/i;

    move-result-object p1

    const-string p2, "combineLatest(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lwc/m;->l:Lgg/i;

    new-instance p1, Lwc/k;

    invoke-direct {p1, p0}, Lwc/k;-><init>(Lwc/m;)V

    invoke-static {p1}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    new-instance p2, Lwc/l;

    invoke-direct {p2, p0}, Lwc/l;-><init>(Lwc/m;)V

    invoke-virtual {p1, p2}, Lgg/b;->w(Lkg/a;)Lgg/b;

    move-result-object p1

    invoke-virtual {p1}, Lgg/b;->f0()Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->r0()LBg/a;

    move-result-object p1

    invoke-virtual {p1}, LBg/a;->l1()Lgg/s;

    move-result-object p1

    invoke-virtual {p1}, Lgg/s;->f0()Lgg/b;

    move-result-object p1

    const-string p2, "ignoreElements(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lwc/m;->m:Lgg/b;

    return-void
.end method

.method public static synthetic b(Lwc/m;Lgg/c;)V
    .locals 0

    invoke-static {p0, p1}, Lwc/m;->k(Lwc/m;Lgg/c;)V

    return-void
.end method

.method public static synthetic c()V
    .locals 0

    invoke-static {}, Lwc/m;->j()V

    return-void
.end method

.method public static synthetic d(Lwc/m;)V
    .locals 0

    invoke-static {p0}, Lwc/m;->m(Lwc/m;)V

    return-void
.end method

.method public static synthetic e(Lwc/m;)V
    .locals 0

    invoke-static {p0}, Lwc/m;->l(Lwc/m;)V

    return-void
.end method

.method public static final synthetic f(Lwc/m;)Lcom/ui/wifiman/model/bluetooth/le/BleScanner;
    .locals 0

    iget-object p0, p0, Lwc/m;->b:Lcom/ui/wifiman/model/bluetooth/le/BleScanner;

    return-object p0
.end method

.method public static final synthetic g(Lwc/m;)Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner;
    .locals 0

    iget-object p0, p0, Lwc/m;->a:Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner;

    return-object p0
.end method

.method public static final synthetic h(Lwc/m;)Lgg/i;
    .locals 0

    iget-object p0, p0, Lwc/m;->j:Lgg/i;

    return-object p0
.end method

.method public static final synthetic i(Lwc/m;)LFg/a;
    .locals 0

    iget-object p0, p0, Lwc/m;->e:LFg/a;

    return-object p0
.end method

.method private static final j()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "Bluetooth Discovery disposed"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method private static final k(Lwc/m;Lgg/c;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lwc/m;->d:LFg/a;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method private static final l(Lwc/m;)V
    .locals 1

    iget-object p0, p0, Lwc/m;->d:LFg/a;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method private static final m(Lwc/m;)V
    .locals 1

    iget-object p0, p0, Lwc/m;->e:LFg/a;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Lwc/f;)Lgg/i;
    .locals 2

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwc/m;->k:Lgg/i;

    iget-object v1, p0, Lwc/m;->c:Lwc/g;

    invoke-virtual {v1, p1}, Lfe/s;->m(Ljava/lang/Object;)Lgg/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p1

    const-string v0, "mergeWith(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
