.class public abstract Lkotlin/jvm/internal/O;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lkotlin/jvm/internal/P;

.field private static final b:[Lth/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    const-class v1, Lwh/b1;

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/internal/P;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    :catch_0
    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/jvm/internal/P;

    invoke-direct {v0}, Lkotlin/jvm/internal/P;-><init>()V

    :goto_0
    sput-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    const/4 v0, 0x0

    new-array v0, v0, [Lth/d;

    sput-object v0, Lkotlin/jvm/internal/O;->b:[Lth/d;

    return-void
.end method

.method public static a(Lkotlin/jvm/internal/o;)Lth/g;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/P;->a(Lkotlin/jvm/internal/o;)Lth/g;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/Class;)Lth/d;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/P;->b(Ljava/lang/Class;)Lth/d;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/Class;)Lth/f;
    .locals 2

    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    const-string v1, ""

    invoke-virtual {v0, p0, v1}, Lkotlin/jvm/internal/P;->c(Ljava/lang/Class;Ljava/lang/String;)Lth/f;

    move-result-object p0

    return-object p0
.end method

.method public static d(Ljava/lang/Class;Ljava/lang/String;)Lth/f;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    invoke-virtual {v0, p0, p1}, Lkotlin/jvm/internal/P;->c(Ljava/lang/Class;Ljava/lang/String;)Lth/f;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lkotlin/jvm/internal/w;)Lth/i;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/P;->d(Lkotlin/jvm/internal/w;)Lth/i;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lkotlin/jvm/internal/y;)Lth/j;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/P;->e(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object p0

    return-object p0
.end method

.method public static g(Lkotlin/jvm/internal/C;)Lth/m;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/P;->f(Lkotlin/jvm/internal/C;)Lth/m;

    move-result-object p0

    return-object p0
.end method

.method public static h(Lkotlin/jvm/internal/E;)Lth/n;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/P;->g(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object p0

    return-object p0
.end method

.method public static i(Lkotlin/jvm/internal/G;)Lth/o;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/P;->h(Lkotlin/jvm/internal/G;)Lth/o;

    move-result-object p0

    return-object p0
.end method

.method public static j(Lkotlin/jvm/internal/n;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/P;->i(Lkotlin/jvm/internal/n;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static k(Lkotlin/jvm/internal/u;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/P;->j(Lkotlin/jvm/internal/u;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static l(Ljava/lang/Class;)Lth/p;
    .locals 3

    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    invoke-static {p0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object p0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Lkotlin/jvm/internal/P;->k(Lth/e;Ljava/util/List;Z)Lth/p;

    move-result-object p0

    return-object p0
.end method

.method public static m(Ljava/lang/Class;Lth/r;)Lth/p;
    .locals 2

    sget-object v0, Lkotlin/jvm/internal/O;->a:Lkotlin/jvm/internal/P;

    invoke-static {p0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object p0

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, p0, p1, v1}, Lkotlin/jvm/internal/P;->k(Lth/e;Ljava/util/List;Z)Lth/p;

    move-result-object p0

    return-object p0
.end method
