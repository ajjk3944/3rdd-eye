.class public final Lqd/b;
.super Ltd/a;
.source "SourceFile"

# interfaces
.implements Lqd/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqd/b$a;
    }
.end annotation


# instance fields
.field private final c:Lzd/a;

.field private final d:Lyd/a;

.field private final e:Lwd/f;

.field private final f:Lvd/a;

.field private g:LKa/h$a;

.field private final h:Lgg/i;

.field private final i:Lpd/s;


# direct methods
.method public constructor <init>(Lzd/a;Lyd/a;Lwd/f;Lvd/a;Lud/a;Ltd/d;)V
    .locals 1

    const-string v0, "actionTimeDivider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recorder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorProcessor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "statsCache"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "speedtestApiFactory"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ltd/a;-><init>()V

    iput-object p1, p0, Lqd/b;->c:Lzd/a;

    iput-object p2, p0, Lqd/b;->d:Lyd/a;

    iput-object p3, p0, Lqd/b;->e:Lwd/f;

    iput-object p4, p0, Lqd/b;->f:Lvd/a;

    invoke-interface {p6}, Ltd/d;->c()LKa/h$a;

    move-result-object p1

    iput-object p1, p0, Lqd/b;->g:LKa/h$a;

    invoke-interface {p5}, Lud/a;->a()Lgg/i;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p2, "refCount(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lqd/b;->h:Lgg/i;

    sget-object p1, Lpd/s;->APP_TO_APP:Lpd/s;

    iput-object p1, p0, Lqd/b;->i:Lpd/s;

    return-void
.end method

.method public static final synthetic c(Lqd/b;)Lvd/a;
    .locals 0

    iget-object p0, p0, Lqd/b;->f:Lvd/a;

    return-object p0
.end method

.method public static final synthetic d(Lqd/b;)Lyd/a;
    .locals 0

    iget-object p0, p0, Lqd/b;->d:Lyd/a;

    return-object p0
.end method

.method public static final synthetic e(Lqd/b;)LKa/h$a;
    .locals 0

    iget-object p0, p0, Lqd/b;->g:LKa/h$a;

    return-object p0
.end method

.method public static final synthetic f(Lqd/b;Lqd/d;)Lgg/i;
    .locals 0

    invoke-direct {p0, p1}, Lqd/b;->k(Lqd/d;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method private final g(Lqd/d;)Lgg/i;
    .locals 2

    iget-object v0, p0, Lqd/b;->g:LKa/h$a;

    invoke-virtual {p1}, Lqd/d;->o()Lqd/a$a;

    move-result-object v1

    invoke-virtual {p1}, Lqd/d;->n()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Lqd/a$b;

    invoke-direct {p0, v1, p1}, Lqd/b;->i(Lqd/a$a;Lqd/a$b;)LKa/h$b;

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

.method private final h(Lqd/d;)Lgg/i;
    .locals 3

    invoke-static {}, LIi/c0;->d()LIi/J;

    move-result-object v0

    new-instance v1, Lqd/b$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lqd/b$b;-><init>(Lqd/b;Lqd/d;Ldh/e;)V

    invoke-static {v0, v1}, LQi/l;->b(Ldh/i;Lmh/p;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->E(Lgg/y;)Lgg/z;

    move-result-object p1

    sget-object v0, Lqd/b$c;->a:Lqd/b$c;

    invoke-virtual {p1, v0}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->W()Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;

    invoke-direct {v0, v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const-string v0, "startWithItem(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final i(Lqd/a$a;Lqd/a$b;)LKa/h$b;
    .locals 9

    new-instance v8, LKa/h$b;

    invoke-virtual {p1}, Lqd/a$a;->a()Linet/ipaddr/g;

    move-result-object v0

    invoke-virtual {v0}, Linet/ipaddr/a;->a0()Ljava/lang/String;

    move-result-object v1

    const-string v0, "toNormalizedString(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lqd/a$a;->d()I

    move-result v2

    invoke-virtual {p2}, Lqd/a$b;->b()I

    move-result p1

    int-to-long v3, p1

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LKa/h$b;-><init>(Ljava/lang/String;IJZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8
.end method

.method private final j(Lqd/a$a;)Ltd/c;
    .locals 1

    new-instance v0, Lqd/b$d;

    invoke-direct {v0, p1, p0}, Lqd/b$d;-><init>(Lqd/a$a;Lqd/b;)V

    return-object v0
.end method

.method private final k(Lqd/d;)Lgg/i;
    .locals 10

    invoke-virtual {p1}, Lqd/d;->l()Lqd/d$b;

    move-result-object v0

    sget-object v1, Lqd/b$a;->a:[I

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
    iget-object v0, p0, Lqd/b;->d:Lyd/a;

    invoke-interface {v0, p1}, Lyd/a;->a(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lgg/i;

    move-result-object v0

    new-instance v1, Lqd/b$k;

    invoke-direct {v1, p1}, Lqd/b$k;-><init>(Lqd/d;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_2
    iget-object v0, p0, Lqd/b;->e:Lwd/f;

    new-instance v1, Lwd/f$a;

    const/4 v8, 0x2

    const/4 v9, 0x0

    const-wide/16 v6, 0x0

    move-object v4, v1

    move-object v5, p1

    invoke-direct/range {v4 .. v9}, Lwd/f$a;-><init>(Lcom/ui/wifiman/model/speedtest/Speedtest$d;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Lwd/f;->a(Lwd/f$a;)Lgg/i;

    move-result-object v0

    new-instance v1, Lqd/b$j;

    invoke-direct {v1, p1}, Lqd/b$j;-><init>(Lqd/d;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_3
    invoke-direct {p0, p1}, Lqd/b;->l(Lqd/d;)Lgg/i;

    move-result-object p1

    goto :goto_0

    :pswitch_4
    invoke-direct {p0, p1}, Lqd/b;->n(Lqd/d;)Lgg/i;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltd/a;->b(Lgg/i;)Lgg/i;

    move-result-object v0

    new-instance v1, Lqd/b$i;

    invoke-direct {v1, p1}, Lqd/b$i;-><init>(Lqd/d;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_5
    iget-object v0, p0, Lqd/b;->c:Lzd/a;

    invoke-static {v0, v2, v1, v2}, Lzd/a$a;->a(Lzd/a;Lzd/a$b;ILjava/lang/Object;)Lgg/i;

    move-result-object v0

    new-instance v1, Lqd/b$h;

    invoke-direct {v1, p1}, Lqd/b$h;-><init>(Lqd/d;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_6
    invoke-direct {p0, p1}, Lqd/b;->g(Lqd/d;)Lgg/i;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltd/a;->b(Lgg/i;)Lgg/i;

    move-result-object v0

    new-instance v1, Lqd/b$g;

    invoke-direct {v1, p1}, Lqd/b$g;-><init>(Lqd/d;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_7
    iget-object v0, p0, Lqd/b;->c:Lzd/a;

    invoke-static {v0, v2, v1, v2}, Lzd/a$a;->a(Lzd/a;Lzd/a$b;ILjava/lang/Object;)Lgg/i;

    move-result-object v0

    new-instance v1, Lqd/b$f;

    invoke-direct {v1, p1}, Lqd/b$f;-><init>(Lqd/d;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_8
    invoke-direct {p0, p1}, Lqd/b;->h(Lqd/d;)Lgg/i;

    move-result-object v0

    new-instance v1, Lqd/b$e;

    invoke-direct {v1, p1}, Lqd/b$e;-><init>(Lqd/d;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
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

.method private final l(Lqd/d;)Lgg/i;
    .locals 2

    iget-object v0, p0, Lqd/b;->h:Lgg/i;

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lqd/b$l;

    invoke-direct {v1, p0, p1}, Lqd/b$l;-><init>(Lqd/b;Lqd/d;)V

    invoke-virtual {v0, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v0, "flatMapPublisher(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final n(Lqd/d;)Lgg/i;
    .locals 2

    iget-object v0, p0, Lqd/b;->g:LKa/h$a;

    invoke-virtual {p1}, Lqd/d;->o()Lqd/a$a;

    move-result-object v1

    invoke-virtual {p1}, Lqd/d;->n()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Lqd/a$b;

    invoke-direct {p0, v1, p1}, Lqd/b;->i(Lqd/a$a;Lqd/a$b;)LKa/h$b;

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

    check-cast p1, Lqd/a$a;

    invoke-virtual {p0, p1}, Lqd/b;->m(Lqd/a$a;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public m(Lqd/a$a;)Lgg/i;
    .locals 2

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lqd/b;->j(Lqd/a$a;)Ltd/c;

    move-result-object p1

    invoke-virtual {p1}, Ltd/c;->f()Lgg/i;

    move-result-object p1

    iget-object v0, p0, Lqd/b;->h:Lgg/i;

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
