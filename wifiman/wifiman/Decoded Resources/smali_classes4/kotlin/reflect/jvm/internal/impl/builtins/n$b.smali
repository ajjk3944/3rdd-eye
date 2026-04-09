.class public final Lkotlin/reflect/jvm/internal/impl/builtins/n$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/reflect/jvm/internal/impl/builtins/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/n$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LBh/G;)Lpi/S;
    .locals 4

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->w0:LZh/b;

    invoke-static {p1, v0}, LBh/y;->b(LBh/G;LZh/b;)LBh/e;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object v0, Lpi/r0;->b:Lpi/r0$a;

    invoke-virtual {v0}, Lpi/r0$a;->j()Lpi/r0;

    move-result-object v0

    new-instance v1, Lpi/k0;

    invoke-interface {p1}, LBh/h;->k()Lpi/v0;

    move-result-object v2

    invoke-interface {v2}, Lpi/v0;->getParameters()Ljava/util/List;

    move-result-object v2

    const-string v3, "getParameters(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, LZg/v;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "single(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, LBh/l0;

    invoke-direct {v1, v2}, Lpi/k0;-><init>(LBh/l0;)V

    invoke-static {v1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lpi/V;->h(Lpi/r0;LBh/e;Ljava/util/List;)Lpi/d0;

    move-result-object p1

    return-object p1
.end method
