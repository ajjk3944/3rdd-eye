.class public final Lcom/ui/wifiman/model/speedtest/internet/b;
.super Ltd/a;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/speedtest/internet/b$a;,
        Lcom/ui/wifiman/model/speedtest/internet/b$b;
    }
.end annotation


# static fields
.field public static final o:Lcom/ui/wifiman/model/speedtest/internet/b$a;


# instance fields
.field private final c:Lzd/a;

.field private final d:Lyd/a;

.field private final e:Lwd/f;

.field private final f:LP7/a;

.field private final g:Lvd/a;

.field private final h:Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;

.field private final i:Ltd/d;

.field private final j:Lpd/s;

.field private final k:LIa/a;

.field private l:Ljava/lang/String;

.field private final m:Lgg/i;

.field private final n:Lgg/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/speedtest/internet/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/speedtest/internet/b;->o:Lcom/ui/wifiman/model/speedtest/internet/b$a;

    return-void
.end method

.method public constructor <init>(Lzd/a;Lyd/a;Lwd/f;LP7/a;Lvd/a;Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;Ltd/d;Lud/a;)V
    .locals 1

    const-string v0, "actionTimeDivider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recorder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorProcessor"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serverService"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "speedtestApiFactory"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "statsCache"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ltd/a;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->c:Lzd/a;

    iput-object p2, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->d:Lyd/a;

    iput-object p3, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->e:Lwd/f;

    iput-object p4, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->f:LP7/a;

    iput-object p5, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->g:Lvd/a;

    iput-object p6, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->h:Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;

    iput-object p7, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->i:Ltd/d;

    sget-object p1, Lpd/s;->INTERNET:Lpd/s;

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->j:Lpd/s;

    const/4 p1, 0x0

    invoke-interface {p7, p1}, Ltd/d;->b(Ljava/lang/String;)LIa/a;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->k:LIa/a;

    invoke-interface {p8}, Lud/a;->a()Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->m:Lgg/i;

    new-instance p1, Lcom/ui/wifiman/model/speedtest/internet/b$A;

    invoke-direct {p1, p0}, Lcom/ui/wifiman/model/speedtest/internet/b$A;-><init>(Lcom/ui/wifiman/model/speedtest/internet/b;)V

    invoke-static {p1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string p2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lgg/z;->e()Lgg/z;

    move-result-object p1

    const-string p2, "cache(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->n:Lgg/z;

    return-void
.end method

.method public static synthetic c(Ljava/lang/Throwable;)Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/speedtest/internet/b;->v(Ljava/lang/Throwable;)Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lcom/ui/wifiman/model/speedtest/internet/b;)LP7/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->f:LP7/a;

    return-object p0
.end method

.method public static final synthetic e(Lcom/ui/wifiman/model/speedtest/internet/b;)Lvd/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->g:Lvd/a;

    return-object p0
.end method

.method public static final synthetic f(Lcom/ui/wifiman/model/speedtest/internet/b;)Lyd/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->d:Lyd/a;

    return-object p0
.end method

.method public static final synthetic g(Lcom/ui/wifiman/model/speedtest/internet/b;)LIa/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->k:LIa/a;

    return-object p0
.end method

.method public static final synthetic h(Lcom/ui/wifiman/model/speedtest/internet/b;)Ltd/d;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->i:Ltd/d;

    return-object p0
.end method

.method public static final synthetic i(Lcom/ui/wifiman/model/speedtest/internet/b;Lcom/ui/wifiman/model/speedtest/internet/f;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b;->q(Lcom/ui/wifiman/model/speedtest/internet/f;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Lcom/ui/wifiman/model/speedtest/internet/b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->l:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic k(Lcom/ui/wifiman/model/speedtest/internet/b;Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/i;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b;->t(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(Lcom/ui/wifiman/model/speedtest/internet/b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->l:Ljava/lang/String;

    return-void
.end method

.method private final m(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/b;
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/b$c;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$c;-><init>(Lcom/ui/wifiman/model/speedtest/internet/f;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/b$d;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/speedtest/internet/b$d;-><init>(Lcom/ui/wifiman/model/speedtest/internet/b;)V

    invoke-virtual {p1, v0}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string v0, "flatMapCompletable(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final n(Ljava/util/List;)Lgg/i;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->n:Lgg/z;

    new-instance v1, Lcom/ui/wifiman/model/speedtest/internet/b$e;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$e;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v0, "flatMapPublisher(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final o(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/i;
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->n:Lgg/z;

    new-instance v1, Lcom/ui/wifiman/model/speedtest/internet/b$f;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$f;-><init>(Lcom/ui/wifiman/model/speedtest/internet/f;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/speedtest/internet/b$g;->a:Lcom/ui/wifiman/model/speedtest/internet/b$g;

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/speedtest/internet/b$h;->a:Lcom/ui/wifiman/model/speedtest/internet/b$h;

    invoke-virtual {v0, v1}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object v0

    invoke-virtual {v0}, Lgg/z;->W()Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/internet/b$i;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$i;-><init>(Lcom/ui/wifiman/model/speedtest/internet/f;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final p(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/i;
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->h:Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;

    invoke-interface {v0}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$d;->c()Lgg/i;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/speedtest/internet/b$j;->a:Lcom/ui/wifiman/model/speedtest/internet/b$j;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/speedtest/internet/b$k;->a:Lcom/ui/wifiman/model/speedtest/internet/b$k;

    invoke-virtual {v0, v1}, Lgg/i;->R1(Lkg/p;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/internet/b$l;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$l;-><init>(Lcom/ui/wifiman/model/speedtest/internet/f;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final q(Lcom/ui/wifiman/model/speedtest/internet/f;)Ljava/util/List;
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Lcom/ui/wifiman/model/speedtest/internet/g;->a(Lcom/ui/wifiman/model/speedtest/internet/f;)Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/f;->e()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;->b()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    :goto_0
    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;->e()Ljava/lang/String;

    move-result-object v1

    new-instance v4, LKa/f$c$a$a;

    invoke-direct {v4, v2, v3, v1}, LKa/f$c$a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p1}, Lcom/ui/wifiman/model/speedtest/internet/g;->b(Lcom/ui/wifiman/model/speedtest/internet/f;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;->b()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b;->e()Ljava/lang/String;

    move-result-object v1

    new-instance v4, LKa/f$c$a$a;

    invoke-direct {v4, v2, v3, v1}, LKa/f$c$a$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object v0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "main server not reachable"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "main test server must be available when starting speedtest"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final r(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$a;)Ltd/c;
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/b$m;

    invoke-direct {v0, p1, p0}, Lcom/ui/wifiman/model/speedtest/internet/b$m;-><init>(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$a;Lcom/ui/wifiman/model/speedtest/internet/b;)V

    return-object v0
.end method

.method private final s(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/i;
    .locals 3

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->n:Lgg/z;

    new-instance v1, Lcom/ui/wifiman/model/speedtest/internet/b$o;

    invoke-direct {v1, p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$o;-><init>(Lcom/ui/wifiman/model/speedtest/internet/b;Lcom/ui/wifiman/model/speedtest/internet/f;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/internet/b$n;

    invoke-direct {v1}, Lcom/ui/wifiman/model/speedtest/internet/b$n;-><init>()V

    invoke-static {v1}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v1

    const-string v2, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lgg/b;->k(Lgg/D;)Lgg/z;

    move-result-object v0

    invoke-virtual {v0}, Lgg/z;->W()Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/internet/b$p;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$p;-><init>(Lcom/ui/wifiman/model/speedtest/internet/f;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final t(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/i;
    .locals 10

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/f;->l()Lcom/ui/wifiman/model/speedtest/internet/f$b;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/speedtest/internet/b$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, "map(...)"

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    invoke-static {}, Lgg/i;->j0()Lgg/i;

    move-result-object p1

    const-string v0, "empty(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->d:Lyd/a;

    invoke-interface {v0, p1}, Lyd/a;->a(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/internet/b$v;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$v;-><init>(Lcom/ui/wifiman/model/speedtest/internet/f;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->e:Lwd/f;

    new-instance v1, Lwd/f$a;

    const/4 v8, 0x2

    const/4 v9, 0x0

    const-wide/16 v6, 0x0

    move-object v4, v1

    move-object v5, p1

    invoke-direct/range {v4 .. v9}, Lwd/f$a;-><init>(Lcom/ui/wifiman/model/speedtest/Speedtest$d;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Lwd/f;->a(Lwd/f$a;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/internet/b$u;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$u;-><init>(Lcom/ui/wifiman/model/speedtest/internet/f;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_3
    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b;->w(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/i;

    move-result-object p1

    goto/16 :goto_0

    :pswitch_4
    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b;->q(Lcom/ui/wifiman/model/speedtest/internet/f;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/speedtest/internet/b;->y(Ljava/util/List;)Lgg/i;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltd/a;->b(Lgg/i;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/internet/b$t;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$t;-><init>(Lcom/ui/wifiman/model/speedtest/internet/f;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_5
    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->c:Lzd/a;

    invoke-static {v0, v2, v1, v2}, Lzd/a$a;->a(Lzd/a;Lzd/a$b;ILjava/lang/Object;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/internet/b$s;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$s;-><init>(Lcom/ui/wifiman/model/speedtest/internet/f;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_6
    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b;->q(Lcom/ui/wifiman/model/speedtest/internet/f;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/speedtest/internet/b;->n(Ljava/util/List;)Lgg/i;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltd/a;->b(Lgg/i;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/internet/b$r;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$r;-><init>(Lcom/ui/wifiman/model/speedtest/internet/f;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_7
    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b;->m(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/b;

    move-result-object v0

    iget-object v4, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->c:Lzd/a;

    invoke-static {v4, v2, v1, v2}, Lzd/a$a;->a(Lzd/a;Lzd/a$b;ILjava/lang/Object;)Lgg/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/b;->h(LDj/a;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/internet/b$q;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$q;-><init>(Lcom/ui/wifiman/model/speedtest/internet/f;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_8
    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b;->o(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :pswitch_9
    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b;->s(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :pswitch_a
    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b;->p(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :pswitch_b
    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b;->u(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final u(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/i;
    .locals 3

    new-instance v0, Lcom/ui/wifiman/model/speedtest/internet/b$w;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ui/wifiman/model/speedtest/internet/b$w;-><init>(Lcom/ui/wifiman/model/speedtest/internet/b;Ldh/e;)V

    const/4 v2, 0x1

    invoke-static {v1, v0, v2, v1}, LQi/l;->c(Ldh/i;Lmh/p;ILjava/lang/Object;)Lgg/z;

    move-result-object v0

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v2

    invoke-virtual {v0, v2}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v2

    invoke-virtual {v0, v2}, Lgg/z;->E(Lgg/y;)Lgg/z;

    move-result-object v0

    new-instance v2, Lcom/ui/wifiman/model/speedtest/internet/b$x;

    invoke-direct {v2, p0}, Lcom/ui/wifiman/model/speedtest/internet/b$x;-><init>(Lcom/ui/wifiman/model/speedtest/internet/b;)V

    invoke-virtual {v0, v2}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object v0

    sget-object v2, Lcom/ui/wifiman/model/speedtest/internet/b$y;->a:Lcom/ui/wifiman/model/speedtest/internet/b$y;

    invoke-virtual {v0, v2}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    new-instance v2, LBd/e;

    invoke-direct {v2}, LBd/e;-><init>()V

    invoke-virtual {v0, v2}, Lgg/z;->G(Lkg/n;)Lgg/z;

    move-result-object v0

    invoke-virtual {v0}, Lgg/z;->W()Lgg/i;

    move-result-object v0

    new-instance v2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;

    invoke-direct {v2, v1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/internet/b$z;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$z;-><init>(Lcom/ui/wifiman/model/speedtest/internet/f;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final v(Ljava/lang/Throwable;)Lcom/ui/wifiman/model/speedtest/Speedtest$f;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$a;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method private final w(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/i;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->m:Lgg/i;

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/internet/b$B;

    invoke-direct {v1, p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$B;-><init>(Lcom/ui/wifiman/model/speedtest/internet/b;Lcom/ui/wifiman/model/speedtest/internet/f;)V

    invoke-virtual {v0, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v0, "flatMapPublisher(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final y(Ljava/util/List;)Lgg/i;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->n:Lgg/z;

    new-instance v1, Lcom/ui/wifiman/model/speedtest/internet/b$C;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/speedtest/internet/b$C;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v0, "flatMapPublisher(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public bridge synthetic a(Lcom/ui/wifiman/model/speedtest/Speedtest$b;)Lgg/i;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b;->x(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public x(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$a;)Lgg/i;
    .locals 2

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/speedtest/internet/b;->r(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$a;)Ltd/c;

    move-result-object p1

    invoke-virtual {p1}, Ltd/c;->f()Lgg/i;

    move-result-object p1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/internet/b;->m:Lgg/i;

    invoke-virtual {v0}, Lgg/i;->E0()Lgg/b;

    move-result-object v0

    const-string v1, "ignoreElements(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lfe/i;->a(Lgg/i;Lgg/b;)Lgg/i;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
