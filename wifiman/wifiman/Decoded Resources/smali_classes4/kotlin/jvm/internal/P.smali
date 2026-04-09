.class public Lkotlin/jvm/internal/P;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lkotlin/jvm/internal/o;)Lth/g;
    .locals 0

    return-object p1
.end method

.method public b(Ljava/lang/Class;)Lth/d;
    .locals 1

    new-instance v0, Lkotlin/jvm/internal/i;

    invoke-direct {v0, p1}, Lkotlin/jvm/internal/i;-><init>(Ljava/lang/Class;)V

    return-object v0
.end method

.method public c(Ljava/lang/Class;Ljava/lang/String;)Lth/f;
    .locals 1

    new-instance v0, Lkotlin/jvm/internal/B;

    invoke-direct {v0, p1, p2}, Lkotlin/jvm/internal/B;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-object v0
.end method

.method public d(Lkotlin/jvm/internal/w;)Lth/i;
    .locals 0

    return-object p1
.end method

.method public e(Lkotlin/jvm/internal/y;)Lth/j;
    .locals 0

    return-object p1
.end method

.method public f(Lkotlin/jvm/internal/C;)Lth/m;
    .locals 0

    return-object p1
.end method

.method public g(Lkotlin/jvm/internal/E;)Lth/n;
    .locals 0

    return-object p1
.end method

.method public h(Lkotlin/jvm/internal/G;)Lth/o;
    .locals 0

    return-object p1
.end method

.method public i(Lkotlin/jvm/internal/n;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    move-result-object p1

    const/4 v0, 0x0

    aget-object p1, p1, v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "kotlin.jvm.functions."

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x15

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public j(Lkotlin/jvm/internal/u;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/P;->i(Lkotlin/jvm/internal/n;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public k(Lth/e;Ljava/util/List;Z)Lth/p;
    .locals 1

    new-instance v0, Lkotlin/jvm/internal/Y;

    invoke-direct {v0, p1, p2, p3}, Lkotlin/jvm/internal/Y;-><init>(Lth/e;Ljava/util/List;Z)V

    return-object v0
.end method
