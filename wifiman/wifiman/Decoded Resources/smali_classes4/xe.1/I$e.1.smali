.class public final Lxe/I$e;
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
    name = "e"
.end annotation


# static fields
.field public static final a:Lxe/I$e;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/util/List;

.field public static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lxe/I$e;

    invoke-direct {v0}, Lxe/I$e;-><init>()V

    sput-object v0, Lxe/I$e;->a:Lxe/I$e;

    const-string v0, "detail"

    sput-object v0, Lxe/I$e;->b:Ljava/lang/String;

    new-instance v0, Lxe/J;

    invoke-direct {v0}, Lxe/J;-><init>()V

    const-string v1, "type"

    invoke-static {v1, v0}, Lf2/f;->a(Ljava/lang/String;Lmh/l;)Lf2/e;

    move-result-object v0

    new-instance v1, Lxe/K;

    invoke-direct {v1}, Lxe/K;-><init>()V

    const-string v2, "id"

    invoke-static {v2, v1}, Lf2/f;->a(Ljava/lang/String;Lmh/l;)Lf2/e;

    move-result-object v1

    filled-new-array {v0, v1}, [Lf2/e;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lxe/I$e;->c:Ljava/util/List;

    const/16 v0, 0x8

    sput v0, Lxe/I$e;->d:I

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

    invoke-static {p0}, Lxe/I$e;->e(Lf2/i;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lf2/i;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxe/I$e;->d(Lf2/i;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lf2/i;)LYg/J;
    .locals 1

    const-string v0, "$this$navArgument"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf2/B;->q:Lf2/B;

    invoke-virtual {p0, v0}, Lf2/i;->c(Lf2/B;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final e(Lf2/i;)LYg/J;
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
    instance-of p1, p1, Lxe/I$e;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public f(LJe/b;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "argName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "id"

    if-eqz v0, :cond_4

    instance-of p2, p1, LJe/b$b;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    instance-of p2, p1, LJe/b$c;

    if-eqz p2, :cond_1

    const-string v1, "ip"

    goto :goto_0

    :cond_1
    instance-of p2, p1, LJe/b$a;

    if-eqz p2, :cond_2

    const-string v1, "gateway"

    goto :goto_0

    :cond_2
    instance-of p1, p1, LJe/b$d;

    if-eqz p1, :cond_3

    const-string v1, "myself"

    goto :goto_0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    const/4 v1, 0x0

    if-eqz p2, :cond_8

    instance-of p2, p1, LJe/b$b;

    if-eqz p2, :cond_5

    sget-object p2, La8/b;->c:La8/b$a;

    check-cast p1, LJe/b$b;

    invoke-virtual {p1}, LJe/b$b;->a()La8/b;

    move-result-object p1

    invoke-virtual {p2, p1}, La8/b$a;->c(La8/b;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_5
    instance-of p2, p1, LJe/b$c;

    if-eqz p2, :cond_6

    check-cast p1, LJe/b$c;

    invoke-virtual {p1}, LJe/b$c;->a()Linet/ipaddr/g;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_6
    instance-of p2, p1, LJe/b$a;

    if-nez p2, :cond_8

    instance-of p1, p1, LJe/b$d;

    if-eqz p1, :cond_7

    goto :goto_0

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    :goto_0
    return-object v1
.end method

.method public final g(Landroidx/lifecycle/E;)LJe/b;
    .locals 4

    const-string v0, "handle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-virtual {p1, v0}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x3f20d908

    if-eq v1, v2, :cond_2

    const v2, -0xb45b9bc

    if-eq v1, v2, :cond_1

    const/16 v2, 0xd1b

    const-string v3, "id"

    if-eq v1, v2, :cond_0

    const/16 v2, 0xd27

    if-ne v1, v2, :cond_3

    const-string v1, "ip"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, LJe/b$c;

    new-instance v1, Linet/ipaddr/n;

    invoke-virtual {p1, v3}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {v1, p1}, Linet/ipaddr/n;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Linet/ipaddr/n;->p()Linet/ipaddr/g;

    move-result-object p1

    const-string v1, "toAddress(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, LJe/b$c;-><init>(Linet/ipaddr/g;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, LJe/b$b;

    sget-object v1, La8/b;->c:La8/b$a;

    invoke-virtual {p1, v3}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v1, p1}, La8/b$a;->a(Ljava/lang/String;)La8/b;

    move-result-object p1

    invoke-direct {v0, p1}, LJe/b$b;-><init>(La8/b;)V

    goto :goto_0

    :cond_1
    const-string p1, "gateway"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object v0, LJe/b$a;->b:LJe/b$a;

    goto :goto_0

    :cond_2
    const-string p1, "myself"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object v0, LJe/b$d;->b:LJe/b$d;

    :goto_0
    return-object v0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "invalid param"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public h(LJe/b;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, LAe/p$a$a;->b(LAe/p$a;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x28ec17b1

    return v0
.end method

.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p1, LJe/b;

    invoke-virtual {p0, p1}, Lxe/I$e;->h(LJe/b;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public j()Ljava/util/List;
    .locals 1

    sget-object v0, Lxe/I$e;->c:Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    check-cast p1, LJe/b;

    invoke-virtual {p0, p1, p2}, Lxe/I$e;->f(LJe/b;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public l()Ljava/lang/String;
    .locals 1

    sget-object v0, Lxe/I$e;->b:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "DeviceDetail"

    return-object v0
.end method
