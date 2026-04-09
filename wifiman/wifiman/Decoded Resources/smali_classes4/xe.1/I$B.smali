.class public final Lxe/I$B;
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
    name = "B"
.end annotation


# static fields
.field public static final a:Lxe/I$B;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/util/List;

.field public static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lxe/I$B;

    invoke-direct {v0}, Lxe/I$B;-><init>()V

    sput-object v0, Lxe/I$B;->a:Lxe/I$B;

    const-string v0, "speedtestResult"

    sput-object v0, Lxe/I$B;->b:Ljava/lang/String;

    new-instance v0, Lxe/e0;

    invoke-direct {v0}, Lxe/e0;-><init>()V

    const-string v1, "id"

    invoke-static {v1, v0}, Lf2/f;->a(Ljava/lang/String;Lmh/l;)Lf2/e;

    move-result-object v0

    new-instance v1, Lxe/f0;

    invoke-direct {v1}, Lxe/f0;-><init>()V

    const-string v2, "just_finished"

    invoke-static {v2, v1}, Lf2/f;->a(Ljava/lang/String;Lmh/l;)Lf2/e;

    move-result-object v1

    filled-new-array {v0, v1}, [Lf2/e;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lxe/I$B;->c:Ljava/util/List;

    const/16 v0, 0x8

    sput v0, Lxe/I$B;->d:I

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

    invoke-static {p0}, Lxe/I$B;->e(Lf2/i;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lf2/i;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxe/I$B;->d(Lf2/i;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lf2/i;)LYg/J;
    .locals 1

    const-string v0, "$this$navArgument"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf2/B;->h:Lf2/B;

    invoke-virtual {p0, v0}, Lf2/i;->c(Lf2/B;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final e(Lf2/i;)LYg/J;
    .locals 1

    const-string v0, "$this$navArgument"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf2/B;->n:Lf2/B;

    invoke-virtual {p0, v0}, Lf2/i;->c(Lf2/B;)V

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
    instance-of p1, p1, Lxe/I$B;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public f(Ljf/f;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "argName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljf/f;->a()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string v0, "just_finished"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ljf/f;->b()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final g(Landroidx/lifecycle/E;)Ljf/f;
    .locals 4

    const-string v0, "handle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljf/f;

    const-string v1, "id"

    invoke-virtual {p1, v1}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    const-string v3, "just_finished"

    invoke-virtual {p1, v3}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Ljf/f;-><init>(JZ)V

    return-object v0
.end method

.method public bridge synthetic h(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p1, Ljf/f;

    invoke-virtual {p0, p1}, Lxe/I$B;->i(Ljf/f;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x3c3526d4

    return v0
.end method

.method public i(Ljf/f;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, LAe/p$a$a;->b(LAe/p$a;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public j()Ljava/util/List;
    .locals 1

    sget-object v0, Lxe/I$B;->c:Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    check-cast p1, Ljf/f;

    invoke-virtual {p0, p1, p2}, Lxe/I$B;->f(Ljf/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public l()Ljava/lang/String;
    .locals 1

    sget-object v0, Lxe/I$B;->b:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "SpeedtestResult"

    return-object v0
.end method
