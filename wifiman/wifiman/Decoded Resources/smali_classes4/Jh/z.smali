.class public final LJh/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbi/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJh/z$a;
    }
.end annotation


# static fields
.field public static final a:LJh/z$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LJh/z$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LJh/z$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LJh/z;->a:LJh/z$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final c(LBh/a;LBh/a;LBh/e;)Z
    .locals 7

    instance-of v0, p1, LBh/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    instance-of v0, p2, LBh/z;

    if-eqz v0, :cond_9

    invoke-static {p2}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->g0(LBh/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    sget-object v0, LJh/i;->o:LJh/i;

    check-cast p2, LBh/z;

    invoke-interface {p2}, LBh/I;->getName()LZh/f;

    move-result-object v2

    const-string v3, "getName(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, LJh/i;->n(LZh/f;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, LJh/U;->a:LJh/U$a;

    invoke-interface {p2}, LBh/I;->getName()LZh/f;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, LJh/U$a;->k(LZh/f;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    move-object v0, p1

    check-cast v0, LBh/b;

    invoke-static {v0}, LJh/T;->j(LBh/b;)LBh/b;

    move-result-object v0

    instance-of v2, p1, LBh/z;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    move-object v4, p1

    check-cast v4, LBh/z;

    goto :goto_0

    :cond_2
    move-object v4, v3

    :goto_0
    const/4 v5, 0x1

    if-eqz v4, :cond_3

    invoke-interface {p2}, LBh/z;->v0()Z

    move-result v6

    invoke-interface {v4}, LBh/z;->v0()Z

    move-result v4

    if-ne v6, v4, :cond_3

    move v4, v5

    goto :goto_1

    :cond_3
    move v4, v1

    :goto_1
    if-nez v4, :cond_5

    if-eqz v0, :cond_4

    invoke-interface {p2}, LBh/z;->v0()Z

    move-result v4

    if-nez v4, :cond_5

    :cond_4
    return v5

    :cond_5
    instance-of v4, p3, LLh/c;

    if-eqz v4, :cond_9

    invoke-interface {p2}, LBh/z;->a0()LBh/z;

    move-result-object v4

    if-eqz v4, :cond_6

    goto :goto_2

    :cond_6
    if-eqz v0, :cond_9

    invoke-static {p3, v0}, LJh/T;->l(LBh/e;LBh/a;)Z

    move-result p3

    if-eqz p3, :cond_7

    goto :goto_2

    :cond_7
    instance-of p3, v0, LBh/z;

    if-eqz p3, :cond_8

    if-eqz v2, :cond_8

    check-cast v0, LBh/z;

    invoke-static {v0}, LJh/i;->l(LBh/z;)LBh/z;

    move-result-object p3

    if-eqz p3, :cond_8

    const/4 p3, 0x2

    invoke-static {p2, v1, v1, p3, v3}, LSh/C;->c(LBh/z;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    check-cast p1, LBh/z;

    invoke-interface {p1}, LBh/z;->a()LBh/z;

    move-result-object p1

    const-string v0, "getOriginal(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1, v1, p3, v3}, LSh/C;->c(LBh/z;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    return v1

    :cond_8
    return v5

    :cond_9
    :goto_2
    return v1
.end method


# virtual methods
.method public a()Lbi/j$a;
    .locals 1

    sget-object v0, Lbi/j$a;->CONFLICTS_ONLY:Lbi/j$a;

    return-object v0
.end method

.method public b(LBh/a;LBh/a;LBh/e;)Lbi/j$b;
    .locals 1

    const-string v0, "superDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subDescriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, LJh/z;->c(LBh/a;LBh/a;LBh/e;)Z

    move-result p3

    if-eqz p3, :cond_0

    sget-object p1, Lbi/j$b;->INCOMPATIBLE:Lbi/j$b;

    return-object p1

    :cond_0
    sget-object p3, LJh/z;->a:LJh/z$a;

    invoke-virtual {p3, p1, p2}, LJh/z$a;->a(LBh/a;LBh/a;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lbi/j$b;->INCOMPATIBLE:Lbi/j$b;

    return-object p1

    :cond_1
    sget-object p1, Lbi/j$b;->UNKNOWN:Lbi/j$b;

    return-object p1
.end method
