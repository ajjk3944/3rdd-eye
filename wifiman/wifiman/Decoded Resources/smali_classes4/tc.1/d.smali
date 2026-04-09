.class public final Ltc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltc/a;


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltc/d;->a:Landroid/content/Context;

    return-void
.end method

.method public static synthetic b(Ltc/d;Landroid/content/IntentFilter;Lgg/j;)V
    .locals 0

    invoke-static {p0, p1, p2}, Ltc/d;->d(Ltc/d;Landroid/content/IntentFilter;Lgg/j;)V

    return-void
.end method

.method public static synthetic c(Ltc/d;Ltc/d$a;)V
    .locals 0

    invoke-static {p0, p1}, Ltc/d;->e(Ltc/d;Ltc/d$a;)V

    return-void
.end method

.method private static final d(Ltc/d;Landroid/content/IntentFilter;Lgg/j;)V
    .locals 2

    const-string v0, "emitter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ltc/d$a;

    invoke-direct {v0, p2}, Ltc/d$a;-><init>(Lgg/j;)V

    iget-object v1, p0, Ltc/d;->a:Landroid/content/Context;

    invoke-virtual {v1, v0, p1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    new-instance p1, Ltc/c;

    invoke-direct {p1, p0, v0}, Ltc/c;-><init>(Ltc/d;Ltc/d$a;)V

    invoke-interface {p2, p1}, Lgg/j;->d(Lkg/e;)V

    return-void
.end method

.method private static final e(Ltc/d;Ltc/d$a;)V
    .locals 0

    :try_start_0
    iget-object p0, p0, Ltc/d;->a:Landroid/content/Context;

    invoke-virtual {p0, p1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method public a(Landroid/content/IntentFilter;)Lgg/i;
    .locals 3

    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ltc/b;

    invoke-direct {v0, p0, p1}, Ltc/b;-><init>(Ltc/d;Landroid/content/IntentFilter;)V

    sget-object p1, Lgg/a;->LATEST:Lgg/a;

    invoke-static {v0, p1}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    const-string v0, "observeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
