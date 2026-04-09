.class public final Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;
.super Ltd/a;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/speedtest/advanced/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$Error;,
        Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$a;
    }
.end annotation


# instance fields
.field private final c:Lzd/a;

.field private final d:Lyd/a;

.field private final e:Lwd/f;

.field private final f:Lvd/a;

.field private final g:LSd/d;

.field private h:LKa/f$a;

.field private final i:Lgg/i;

.field private final j:Lpd/s;


# direct methods
.method public constructor <init>(Lzd/a;Lyd/a;Lwd/f;Lvd/a;LSd/d;Lud/a;Ltd/d;)V
    .locals 1

    const-string v0, "actionTimeDivider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recorder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorProcessor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localConsoleService"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "statsCache"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "speedtestApiFactory"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ltd/a;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->c:Lzd/a;

    iput-object p2, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->d:Lyd/a;

    iput-object p3, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->e:Lwd/f;

    iput-object p4, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->f:Lvd/a;

    iput-object p5, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->g:LSd/d;

    invoke-interface {p7}, Ltd/d;->a()LKa/f$a;

    move-result-object p1

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->h:LKa/f$a;

    invoke-interface {p6}, Lud/a;->a()Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->i:Lgg/i;

    sget-object p1, Lpd/s;->LOCAL:Lpd/s;

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->j:Lpd/s;

    return-void
.end method

.method public static synthetic c(Lcom/ui/wifiman/model/speedtest/advanced/b;)LYg/s;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->l(Lcom/ui/wifiman/model/speedtest/advanced/b;)LYg/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lcom/ui/wifiman/model/speedtest/advanced/b;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->k(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lcom/ui/wifiman/model/speedtest/advanced/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;)Lzd/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->c:Lzd/a;

    return-object p0
.end method

.method public static final synthetic f(Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;)Lvd/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->f:Lvd/a;

    return-object p0
.end method

.method public static final synthetic g(Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;)Lyd/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->d:Lyd/a;

    return-object p0
.end method

.method public static final synthetic h(Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;)LKa/f$a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->h:LKa/f$a;

    return-object p0
.end method

.method public static final synthetic i(Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/i;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->q(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method private final j(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/i;
    .locals 4

    new-instance v0, Lkotlin/jvm/internal/N;

    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    iput-object p1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iget-object v1, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->g:LSd/d;

    invoke-interface {v1}, LSd/d;->b()Lgg/i;

    move-result-object v1

    new-instance v2, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$b;

    invoke-direct {v2, p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$b;-><init>(Lcom/ui/wifiman/model/speedtest/advanced/b;)V

    invoke-virtual {v1, v2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object v1

    sget-object v2, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$c;->a:Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$c;

    invoke-virtual {v1, v2}, Lgg/i;->R1(Lkg/p;)Lgg/i;

    move-result-object v1

    new-instance v2, Lsd/c;

    invoke-direct {v2, p1}, Lsd/c;-><init>(Lcom/ui/wifiman/model/speedtest/advanced/b;)V

    new-instance v3, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$d;

    invoke-direct {v3, v0}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$d;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-virtual {v1, v2, v3}, Lgg/i;->s1(Lkg/q;Lkg/b;)Lgg/i;

    move-result-object v1

    new-instance v2, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$e;

    invoke-direct {v2, v0}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$e;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-virtual {v1, v2}, Lgg/i;->f1(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object v0

    new-instance v1, Lsd/d;

    invoke-direct {v1, p1}, Lsd/d;-><init>(Lcom/ui/wifiman/model/speedtest/advanced/b;)V

    sget-object p1, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$f;->a:Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$f;

    invoke-virtual {v0, v1, p1}, Lgg/i;->s1(Lkg/q;Lkg/b;)Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$g;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$g;-><init>(Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;)V

    invoke-virtual {p1, v0}, Lgg/i;->B(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v0, "concatMap(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final k(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lcom/ui/wifiman/model/speedtest/advanced/b;
    .locals 0

    return-object p0
.end method

.method private static final l(Lcom/ui/wifiman/model/speedtest/advanced/b;)LYg/s;
    .locals 0

    invoke-static {p0, p0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p0

    return-object p0
.end method

.method private final m(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/i;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->h:LKa/f$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->u()Lcom/ui/wifiman/model/speedtest/advanced/a$a;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->t()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, LCd/j$d;

    invoke-direct {p0, v1, p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->o(Lcom/ui/wifiman/model/speedtest/advanced/a$a;LCd/j$d;)LKa/f$c$b;

    move-result-object p1

    invoke-interface {v0, p1}, LKa/a;->a(Ljava/lang/Object;)LLi/g;

    move-result-object p1

    invoke-static {p1}, Ltd/g;->a(LLi/g;)Lgg/i;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Server evaluation should be done at this point"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final n(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/i;
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$h;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$h;-><init>(Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;Lcom/ui/wifiman/model/speedtest/advanced/b;Ldh/e;)V

    const/4 p1, 0x1

    invoke-static {v1, v0, p1, v1}, LQi/l;->c(Ldh/i;Lmh/p;ILjava/lang/Object;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->E(Lgg/y;)Lgg/z;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$i;->a:Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$i;

    invoke-virtual {p1, v0}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->W()Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const-string v0, "startWithItem(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final o(Lcom/ui/wifiman/model/speedtest/advanced/a$a;LCd/j$d;)LKa/f$c$b;
    .locals 9

    new-instance v8, LKa/f$c$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/advanced/a$a;->b()Linet/ipaddr/g;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/a;->a0()Ljava/lang/String;

    move-result-object v1

    const-string p1, "toNormalizedString(...)"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LCd/j$d;->b()I

    move-result v3

    invoke-virtual {p2}, LCd/j$d;->c()Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/16 v2, 0x22c5

    const/4 v4, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LKa/f$c$b;-><init>(Ljava/lang/String;IIZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8
.end method

.method private final p(Lcom/ui/wifiman/model/speedtest/advanced/a$a;)Ltd/c;
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$j;

    invoke-direct {v0, p1, p0}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$j;-><init>(Lcom/ui/wifiman/model/speedtest/advanced/a$a;Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;)V

    return-object v0
.end method

.method private final q(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/i;
    .locals 10

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->r()Lcom/ui/wifiman/model/speedtest/advanced/b$b;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$a;->a:[I

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
    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->d:Lyd/a;

    invoke-interface {v0, p1}, Lyd/a;->a(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$q;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$q;-><init>(Lcom/ui/wifiman/model/speedtest/advanced/b;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->e:Lwd/f;

    new-instance v1, Lwd/f$a;

    const/4 v8, 0x2

    const/4 v9, 0x0

    const-wide/16 v6, 0x0

    move-object v4, v1

    move-object v5, p1

    invoke-direct/range {v4 .. v9}, Lwd/f$a;-><init>(Lcom/ui/wifiman/model/speedtest/Speedtest$d;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Lwd/f;->a(Lwd/f$a;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$p;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$p;-><init>(Lcom/ui/wifiman/model/speedtest/advanced/b;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_3
    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->r(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :pswitch_4
    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->t(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/i;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltd/a;->b(Lgg/i;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$o;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$o;-><init>(Lcom/ui/wifiman/model/speedtest/advanced/b;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_5
    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->c:Lzd/a;

    invoke-static {v0, v2, v1, v2}, Lzd/a$a;->a(Lzd/a;Lzd/a$b;ILjava/lang/Object;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$n;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$n;-><init>(Lcom/ui/wifiman/model/speedtest/advanced/b;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_6
    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->m(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/i;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltd/a;->b(Lgg/i;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$m;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$m;-><init>(Lcom/ui/wifiman/model/speedtest/advanced/b;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_7
    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->c:Lzd/a;

    invoke-static {v0, v2, v1, v2}, Lzd/a$a;->a(Lzd/a;Lzd/a$b;ILjava/lang/Object;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$l;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$l;-><init>(Lcom/ui/wifiman/model/speedtest/advanced/b;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_8
    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->n(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/i;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$k;

    invoke-direct {v1, p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$k;-><init>(Lcom/ui/wifiman/model/speedtest/advanced/b;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_9
    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->j(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/i;

    move-result-object p1

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
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

.method private final r(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/i;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->i:Lgg/i;

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$r;

    invoke-direct {v1, p0, p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$r;-><init>(Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;Lcom/ui/wifiman/model/speedtest/advanced/b;)V

    invoke-virtual {v0, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v0, "flatMapPublisher(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final t(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/i;
    .locals 2

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->h:LKa/f$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->u()Lcom/ui/wifiman/model/speedtest/advanced/a$a;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->t()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, LCd/j$d;

    invoke-direct {p0, v1, p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->o(Lcom/ui/wifiman/model/speedtest/advanced/a$a;LCd/j$d;)LKa/f$c$b;

    move-result-object p1

    invoke-interface {v0, p1}, LKa/a;->d(Ljava/lang/Object;)LLi/g;

    move-result-object p1

    invoke-static {p1}, Ltd/g;->a(LLi/g;)Lgg/i;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Server evaluation should be done at this point"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public bridge synthetic a(Lcom/ui/wifiman/model/speedtest/Speedtest$b;)Lgg/i;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/advanced/a$a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->s(Lcom/ui/wifiman/model/speedtest/advanced/a$a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public s(Lcom/ui/wifiman/model/speedtest/advanced/a$a;)Lgg/i;
    .locals 2

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->p(Lcom/ui/wifiman/model/speedtest/advanced/a$a;)Ltd/c;

    move-result-object p1

    invoke-virtual {p1}, Ltd/c;->f()Lgg/i;

    move-result-object p1

    iget-object v0, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->i:Lgg/i;

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
