.class public final Lxe/I$N;
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
    name = "N"
.end annotation


# static fields
.field public static final a:Lxe/I$N;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/util/List;

.field public static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lxe/I$N;

    invoke-direct {v0}, Lxe/I$N;-><init>()V

    sput-object v0, Lxe/I$N;->a:Lxe/I$N;

    const-string v0, "wifiChannel"

    sput-object v0, Lxe/I$N;->b:Ljava/lang/String;

    new-instance v0, Lxe/l0;

    invoke-direct {v0}, Lxe/l0;-><init>()V

    const-string v1, "band"

    invoke-static {v1, v0}, Lf2/f;->a(Ljava/lang/String;Lmh/l;)Lf2/e;

    move-result-object v0

    new-instance v1, Lxe/m0;

    invoke-direct {v1}, Lxe/m0;-><init>()V

    const-string v2, "num"

    invoke-static {v2, v1}, Lf2/f;->a(Ljava/lang/String;Lmh/l;)Lf2/e;

    move-result-object v1

    new-instance v2, Lxe/n0;

    invoke-direct {v2}, Lxe/n0;-><init>()V

    const-string v3, "width"

    invoke-static {v3, v2}, Lf2/f;->a(Ljava/lang/String;Lmh/l;)Lf2/e;

    move-result-object v2

    new-instance v3, Lxe/o0;

    invoke-direct {v3}, Lxe/o0;-><init>()V

    const-string v4, "rCenter"

    invoke-static {v4, v3}, Lf2/f;->a(Ljava/lang/String;Lmh/l;)Lf2/e;

    move-result-object v3

    new-instance v4, Lxe/p0;

    invoke-direct {v4}, Lxe/p0;-><init>()V

    const-string v5, "r2Center"

    invoke-static {v5, v4}, Lf2/f;->a(Ljava/lang/String;Lmh/l;)Lf2/e;

    move-result-object v4

    filled-new-array {v0, v1, v2, v3, v4}, [Lf2/e;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lxe/I$N;->c:Ljava/util/List;

    const/16 v0, 0x8

    sput v0, Lxe/I$N;->d:I

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

    invoke-static {p0}, Lxe/I$N;->i(Lf2/i;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lf2/i;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxe/I$N;->m(Lf2/i;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lf2/i;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxe/I$N;->n(Lf2/i;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lf2/i;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxe/I$N;->g(Lf2/i;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lf2/i;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxe/I$N;->h(Lf2/i;)LYg/J;

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

    sget-object v0, Lf2/B;->d:Lf2/B;

    invoke-virtual {p0, v0}, Lf2/i;->c(Lf2/B;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final i(Lf2/i;)LYg/J;
    .locals 1

    const-string v0, "$this$navArgument"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf2/B;->q:Lf2/B;

    invoke-virtual {p0, v0}, Lf2/i;->c(Lf2/B;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final m(Lf2/i;)LYg/J;
    .locals 1

    const-string v0, "$this$navArgument"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf2/B;->q:Lf2/B;

    invoke-virtual {p0, v0}, Lf2/i;->c(Lf2/B;)V

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
    instance-of p1, p1, Lxe/I$N;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x1e9222f5

    return v0
.end method

.method public j()Ljava/util/List;
    .locals 1

    sget-object v0, Lxe/I$N;->c:Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/ui/wifi/channel/b;

    invoke-virtual {p0, p1, p2}, Lxe/I$N;->o(Lcom/ui/wifiman/ui/wifi/channel/b;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public l()Ljava/lang/String;
    .locals 1

    sget-object v0, Lxe/I$N;->b:Ljava/lang/String;

    return-object v0
.end method

.method public o(Lcom/ui/wifiman/ui/wifi/channel/b;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "argName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v0, "r2Center"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p1}, Lcom/ui/wifiman/ui/wifi/channel/b;->a()LS8/e;

    move-result-object p1

    invoke-virtual {p1}, LS8/e;->e()LS8/e$b;

    move-result-object p1

    instance-of p2, p1, LS8/e$b$a;

    if-eqz p2, :cond_1

    check-cast p1, LS8/e$b$a;

    goto :goto_0

    :cond_1
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_5

    invoke-virtual {p1}, LS8/e$b$a;->e()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :sswitch_1
    const-string v0, "width"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/ui/wifiman/ui/wifi/channel/b;->a()LS8/e;

    move-result-object p1

    invoke-virtual {p1}, LS8/e;->b()LS8/d;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :sswitch_2
    const-string v0, "rCenter"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lcom/ui/wifiman/ui/wifi/channel/b;->a()LS8/e;

    move-result-object p1

    invoke-virtual {p1}, LS8/e;->e()LS8/e$b;

    move-result-object p1

    invoke-virtual {p1}, LS8/e$b;->a()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :sswitch_3
    const-string v0, "band"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-virtual {p1}, Lcom/ui/wifiman/ui/wifi/channel/b;->a()LS8/e;

    move-result-object p1

    invoke-virtual {p1}, LS8/e;->a()LS8/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :sswitch_4
    const-string v0, "num"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Lcom/ui/wifiman/ui/wifi/channel/b;->a()LS8/e;

    move-result-object p1

    invoke-virtual {p1}, LS8/e;->d()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    :cond_5
    :goto_1
    return-object v1

    :sswitch_data_0
    .sparse-switch
        0x1ab86 -> :sswitch_4
        0x2e0635 -> :sswitch_3
        0x69e1b67 -> :sswitch_2
        0x6be2dc6 -> :sswitch_1
        0xf554675 -> :sswitch_0
    .end sparse-switch
.end method

.method public final p(Landroidx/lifecycle/E;)Lcom/ui/wifiman/ui/wifi/channel/b;
    .locals 9

    const-string v0, "handle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/wifiman/ui/wifi/channel/b;

    const-string v1, "band"

    invoke-virtual {p1, v1}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_6

    invoke-static {v1}, LS8/c;->valueOf(Ljava/lang/String;)LS8/c;

    move-result-object v1

    const-string v2, "num"

    invoke-virtual {p1, v2}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const-string v3, "width"

    invoke-virtual {p1, v3}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_4

    invoke-static {v4}, LS8/d;->valueOf(Ljava/lang/String;)LS8/d;

    move-result-object v4

    const-string v5, "r2Center"

    invoke-virtual {p1, v5}, Landroidx/lifecycle/E;->c(Ljava/lang/String;)Z

    move-result v6

    const-string v7, "Missing freq center value"

    const-string v8, "rCenter"

    if-eqz v6, :cond_2

    new-instance v6, LS8/e$b$a;

    invoke-virtual {p1, v3}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, LS8/d;->valueOf(Ljava/lang/String;)LS8/d;

    move-result-object v3

    invoke-virtual {p1, v8}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    if-eqz v8, :cond_1

    invoke-static {v8}, Lkotlin/text/t;->q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v8

    if-eqz v8, :cond_1

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-virtual {p1, v5}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lkotlin/text/t;->q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {v6, v3, v7, p1}, LS8/e$b$a;-><init>(LS8/d;II)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Missing freq center2 value"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance v6, LS8/e$b$b;

    invoke-virtual {p1, v3}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, LS8/d;->valueOf(Ljava/lang/String;)LS8/d;

    move-result-object v3

    invoke-virtual {p1, v8}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_3

    invoke-static {p1}, Lkotlin/text/t;->q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {v6, v3, p1}, LS8/e$b$b;-><init>(LS8/d;I)V

    :goto_0
    new-instance p1, LS8/e;

    invoke-direct {p1, v1, v2, v6, v4}, LS8/e;-><init>(LS8/c;ILS8/e$b;LS8/d;)V

    invoke-direct {v0, p1}, Lcom/ui/wifiman/ui/wifi/channel/b;-><init>(LS8/e;)V

    return-object v0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Missing bandwidth value"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Missing num value"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Missing band value"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public q(Lcom/ui/wifiman/ui/wifi/channel/b;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, LAe/p$a$a;->b(LAe/p$a;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic r(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/ui/wifi/channel/b;

    invoke-virtual {p0, p1}, Lxe/I$N;->q(Lcom/ui/wifiman/ui/wifi/channel/b;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "WifiChannelDetail"

    return-object v0
.end method
