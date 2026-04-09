.class public final Lxe/I$h;
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
    name = "h"
.end annotation


# static fields
.field public static final a:Lxe/I$h;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/util/List;

.field public static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lxe/I$h;

    invoke-direct {v0}, Lxe/I$h;-><init>()V

    sput-object v0, Lxe/I$h;->a:Lxe/I$h;

    const-string v0, "signalMapperFloorplan"

    sput-object v0, Lxe/I$h;->b:Ljava/lang/String;

    new-instance v0, Lxe/O;

    invoke-direct {v0}, Lxe/O;-><init>()V

    const-string v1, "ssid"

    invoke-static {v1, v0}, Lf2/f;->a(Ljava/lang/String;Lmh/l;)Lf2/e;

    move-result-object v0

    new-instance v1, Lxe/P;

    invoke-direct {v1}, Lxe/P;-><init>()V

    const-string v2, "bssid"

    invoke-static {v2, v1}, Lf2/f;->a(Ljava/lang/String;Lmh/l;)Lf2/e;

    move-result-object v1

    filled-new-array {v0, v1}, [Lf2/e;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lxe/I$h;->c:Ljava/util/List;

    const/16 v0, 0x8

    sput v0, Lxe/I$h;->d:I

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

    invoke-static {p0}, Lxe/I$h;->d(Lf2/i;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lf2/i;)LYg/J;
    .locals 0

    invoke-static {p0}, Lxe/I$h;->e(Lf2/i;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lf2/i;)LYg/J;
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
    instance-of p1, p1, Lxe/I$h;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public f(LYe/e;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "argName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ssid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    instance-of p2, p1, LYe/e$b;

    if-eqz p2, :cond_0

    check-cast p1, LYe/e$b;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_3

    invoke-virtual {p1}, LYe/e$b;->a()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_1
    const-string v0, "bssid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    instance-of p2, p1, LYe/e$a;

    if-eqz p2, :cond_2

    check-cast p1, LYe/e$a;

    goto :goto_1

    :cond_2
    move-object p1, v1

    :goto_1
    if-eqz p1, :cond_3

    invoke-virtual {p1}, LYe/e$a;->a()Lh9/a;

    move-result-object p1

    if-eqz p1, :cond_3

    const-string p2, ""

    invoke-virtual {p1, p2}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_3
    :goto_2
    return-object v1
.end method

.method public final g(Landroidx/lifecycle/E;)LYe/e;
    .locals 2

    const-string v0, "handle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ssid"

    invoke-virtual {p1, v0}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance p1, LYe/e$b;

    invoke-direct {p1, v0}, LYe/e$b;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "bssid"

    invoke-virtual {p1, v0}, Landroidx/lifecycle/E;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_1

    new-instance v0, LYe/e$a;

    sget-object v1, Lh9/a;->b:Lh9/a$b;

    invoke-virtual {v1, p1}, Lh9/a$b;->e(Ljava/lang/String;)Lh9/a;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {v0, p1}, LYe/e$a;-><init>(Lh9/a;)V

    move-object p1, v0

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "invalid params"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public h(LYe/e;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, LAe/p$a$a;->b(LAe/p$a;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x6795bbf5

    return v0
.end method

.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p1, LYe/e;

    invoke-virtual {p0, p1}, Lxe/I$h;->h(LYe/e;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public j()Ljava/util/List;
    .locals 1

    sget-object v0, Lxe/I$h;->c:Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    check-cast p1, LYe/e;

    invoke-virtual {p0, p1, p2}, Lxe/I$h;->f(LYe/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public l()Ljava/lang/String;
    .locals 1

    sget-object v0, Lxe/I$h;->b:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Floorplan"

    return-object v0
.end method
