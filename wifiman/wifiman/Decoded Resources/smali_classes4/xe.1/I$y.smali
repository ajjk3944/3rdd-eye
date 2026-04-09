.class public final Lxe/I$y;
.super Lxe/I;
.source "SourceFile"

# interfaces
.implements LAe/p$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/I;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "y"
.end annotation


# static fields
.field public static final a:Lxe/I$y;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/util/List;

.field public static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lxe/I$y;

    invoke-direct {v0}, Lxe/I$y;-><init>()V

    sput-object v0, Lxe/I$y;->a:Lxe/I$y;

    const-string v0, "speedtest"

    sput-object v0, Lxe/I$y;->b:Ljava/lang/String;

    new-instance v0, Lxe/X;

    invoke-direct {v0}, Lxe/X;-><init>()V

    const-string v1, "type"

    invoke-static {v1, v0}, Lf2/f;->a(Ljava/lang/String;Lmh/l;)Lf2/e;

    move-result-object v0

    new-instance v1, Lxe/Y;

    invoke-direct {v1}, Lxe/Y;-><init>()V

    const-string v2, "host"

    invoke-static {v2, v1}, Lf2/f;->a(Ljava/lang/String;Lmh/l;)Lf2/e;

    move-result-object v1

    new-instance v2, Lxe/Z;

    invoke-direct {v2}, Lxe/Z;-><init>()V

    const-string v3, "port"

    invoke-static {v3, v2}, Lf2/f;->a(Ljava/lang/String;Lmh/l;)Lf2/e;

    move-result-object v2

    new-instance v3, Lxe/a0;

    invoke-direct {v3}, Lxe/a0;-><init>()V

    const-string v4, "name"

    invoke-static {v4, v3}, Lf2/f;->a(Ljava/lang/String;Lmh/l;)Lf2/e;

    move-result-object v3

    new-instance v4, Lxe/b0;

    invoke-direct {v4}, Lxe/b0;-><init>()V

    const-string v5, "model"

    invoke-static {v5, v4}, Lf2/f;->a(Ljava/lang/String;Lmh/l;)Lf2/e;

    move-result-object v4

    filled-new-array {v0, v1, v2, v3, v4}, [Lf2/e;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lxe/I$y;->c:Ljava/util/List;

    const/16 v0, 0x8

    sput v0, Lxe/I$y;->d:I

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lxe/I;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic b(Lf2/i;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxe/I$y;->n(Lf2/i;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lf2/i;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxe/I$y;->g(Lf2/i;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lf2/i;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxe/I$y;->i(Lf2/i;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lf2/i;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxe/I$y;->h(Lf2/i;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lf2/i;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxe/I$y;->m(Lf2/i;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lf2/i;)LYg/J;
    .locals 1

    const-string v0, "$this$navArgument"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf2/B;->q:Lf2/B;

    invoke-virtual {p0, v0}, Lf2/i;->c(Lf2/B;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final h(Lf2/i;)LYg/J;
    .locals 1

    const-string v0, "$this$navArgument"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf2/B;->q:Lf2/B;

    invoke-virtual {p0, v0}, Lf2/i;->c(Lf2/B;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lf2/i;->b(Z)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final i(Lf2/i;)LYg/J;
    .locals 1

    const-string v0, "$this$navArgument"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf2/B;->q:Lf2/B;

    invoke-virtual {p0, v0}, Lf2/i;->c(Lf2/B;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lf2/i;->b(Z)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final m(Lf2/i;)LYg/J;
    .locals 1

    const-string v0, "$this$navArgument"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf2/B;->q:Lf2/B;

    invoke-virtual {p0, v0}, Lf2/i;->c(Lf2/B;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lf2/i;->b(Z)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final n(Lf2/i;)LYg/J;
    .locals 1

    const-string v0, "$this$navArgument"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf2/B;->q:Lf2/B;

    invoke-virtual {p0, v0}, Lf2/i;->c(Lf2/B;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lf2/i;->b(Z)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, LAe/p$a$a;->a(LAe/p$a;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lxe/I$y;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x6369bbd1

    return v0
.end method

.method public j()Ljava/util/List;
    .locals 1

    sget-object v0, Lxe/I$y;->c:Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    check-cast p1, Lnf/e;

    invoke-virtual {p0, p1, p2}, Lxe/I$y;->o(Lnf/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public l()Ljava/lang/String;
    .locals 1

    sget-object v0, Lxe/I$y;->b:Ljava/lang/String;

    return-object v0
.end method

.method public o(Lnf/e;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "argName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "model"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    goto/16 :goto_0

    :cond_0
    instance-of p2, p1, Lnf/e$c;

    if-nez p2, :cond_12

    instance-of p2, p1, Lnf/e$d;

    if-nez p2, :cond_12

    instance-of p2, p1, Lnf/e$b;

    if-eqz p2, :cond_1

    goto/16 :goto_0

    :cond_1
    instance-of p2, p1, Lnf/e$a;

    if-eqz p2, :cond_2

    check-cast p1, Lnf/e$a;

    invoke-virtual {p1}, Lnf/e$a;->b()Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :sswitch_1
    const-string v0, "type"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_12

    instance-of p2, p1, Lnf/e$c;

    if-eqz p2, :cond_3

    const-string v1, "internet"

    goto/16 :goto_0

    :cond_3
    instance-of p2, p1, Lnf/e$d;

    if-eqz p2, :cond_4

    const-string v1, "direct"

    goto/16 :goto_0

    :cond_4
    instance-of p2, p1, Lnf/e$a;

    if-eqz p2, :cond_5

    const-string v1, "app2app"

    goto/16 :goto_0

    :cond_5
    instance-of p1, p1, Lnf/e$b;

    if-eqz p1, :cond_6

    const-string v1, "combined"

    goto/16 :goto_0

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :sswitch_2
    const-string v0, "port"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    goto/16 :goto_0

    :cond_7
    instance-of p2, p1, Lnf/e$c;

    if-nez p2, :cond_12

    instance-of p2, p1, Lnf/e$d;

    if-nez p2, :cond_12

    instance-of p2, p1, Lnf/e$b;

    if-eqz p2, :cond_8

    goto/16 :goto_0

    :cond_8
    instance-of p2, p1, Lnf/e$a;

    if-eqz p2, :cond_9

    check-cast p1, Lnf/e$a;

    invoke-virtual {p1}, Lnf/e$a;->d()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_0

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :sswitch_3
    const-string v0, "name"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_a

    goto :goto_0

    :cond_a
    instance-of p2, p1, Lnf/e$c;

    if-nez p2, :cond_12

    instance-of p2, p1, Lnf/e$d;

    if-eqz p2, :cond_b

    goto :goto_0

    :cond_b
    instance-of p2, p1, Lnf/e$b;

    if-eqz p2, :cond_c

    check-cast p1, Lnf/e$b;

    invoke-virtual {p1}, Lnf/e$b;->a()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_c
    instance-of p2, p1, Lnf/e$a;

    if-eqz p2, :cond_d

    check-cast p1, Lnf/e$a;

    invoke-virtual {p1}, Lnf/e$a;->c()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :sswitch_4
    const-string v0, "host"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_e

    goto :goto_0

    :cond_e
    instance-of p2, p1, Lnf/e$c;

    if-eqz p2, :cond_f

    goto :goto_0

    :cond_f
    instance-of p2, p1, Lnf/e$d;

    if-eqz p2, :cond_10

    check-cast p1, Lnf/e$d;

    invoke-virtual {p1}, Lnf/e$d;->a()Linet/ipaddr/g;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/a;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_10
    instance-of p2, p1, Lnf/e$a;

    if-eqz p2, :cond_11

    check-cast p1, Lnf/e$a;

    invoke-virtual {p1}, Lnf/e$a;->a()Linet/ipaddr/g;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/a;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_11
    instance-of p2, p1, Lnf/e$b;

    if-eqz p2, :cond_13

    check-cast p1, Lnf/e$b;

    invoke-virtual {p1}, Lnf/e$b;->b()Linet/ipaddr/g;

    move-result-object p1

    invoke-virtual {p1}, Linet/ipaddr/a;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_12
    :goto_0
    return-object v1

    :cond_13
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    nop

    :sswitch_data_0
    .sparse-switch
        0x30f5a8 -> :sswitch_4
        0x337a8b -> :sswitch_3
        0x349881 -> :sswitch_2
        0x368f3a -> :sswitch_1
        0x633fb29 -> :sswitch_0
    .end sparse-switch
.end method

.method public final p(Landroidx/lifecycle/E;)Lnf/e;
    .locals 5

    const-string v0, "handle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-virtual {p1, v0}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const-string v2, "name"

    const-string v3, "toAddress(...)"

    const-string v4, "host"

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    const-string p1, "internet"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lnf/e$c;->a:Lnf/e$c;

    goto/16 :goto_1

    :sswitch_1
    const-string v1, "combined"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lnf/e$b;

    new-instance v1, Linet/ipaddr/n;

    invoke-virtual {p1, v4}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v4, Ljava/lang/String;

    invoke-direct {v1, v4}, Linet/ipaddr/n;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Linet/ipaddr/n;->p()Linet/ipaddr/g;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/String;

    invoke-direct {v0, v1, p1}, Lnf/e$b;-><init>(Linet/ipaddr/g;Ljava/lang/String;)V

    :goto_0
    move-object p1, v0

    goto :goto_1

    :sswitch_2
    const-string v1, "app2app"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lnf/e$a;

    new-instance v1, Linet/ipaddr/n;

    invoke-virtual {p1, v4}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v4, Ljava/lang/String;

    invoke-direct {v1, v4}, Linet/ipaddr/n;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Linet/ipaddr/n;->p()Linet/ipaddr/g;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "port"

    invoke-virtual {p1, v3}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {p1, v2}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/String;

    const-string v4, "model"

    invoke-virtual {p1, v4}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/String;

    invoke-direct {v0, v1, v3, v2, p1}, Lnf/e$a;-><init>(Linet/ipaddr/g;ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :sswitch_3
    const-string v1, "direct"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lnf/e$d;

    new-instance v1, Linet/ipaddr/n;

    invoke-virtual {p1, v4}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/String;

    invoke-direct {v1, p1}, Linet/ipaddr/n;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Linet/ipaddr/n;->p()Linet/ipaddr/g;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Lnf/e$d;-><init>(Linet/ipaddr/g;)V

    goto :goto_0

    :goto_1
    return-object p1

    :cond_0
    :goto_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Invalid params"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4f5e6417 -> :sswitch_3
        -0x2f6249b0 -> :sswitch_2
        -0x248154fb -> :sswitch_1
        0x21ffc741 -> :sswitch_0
    .end sparse-switch
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p1, Lnf/e;

    invoke-virtual {p0, p1}, Lxe/I$y;->r(Lnf/e;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public r(Lnf/e;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, LAe/p$a$a;->b(LAe/p$a;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Speedtest"

    return-object v0
.end method
