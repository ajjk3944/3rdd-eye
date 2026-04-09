.class public final Lib/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lib/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
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
    invoke-direct {p0}, Lib/h$a;-><init>()V

    return-void
.end method

.method public static synthetic a(Lkotlin/text/l;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lib/h$a;->h(Lkotlin/text/l;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/text/l;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lib/h$a;->g(Lkotlin/text/l;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lib/h$a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lib/h$a;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final d(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    invoke-static {}, Lib/h;->e()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-static {}, Lib/h;->a()I

    move-result v1

    add-int/lit8 v2, v1, 0x1

    invoke-static {v2}, Lib/h;->f(I)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "ipv4-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v1, Ljava/lang/String;

    return-object v1
.end method

.method private final e(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    invoke-static {}, Lib/h;->e()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-static {}, Lib/h;->c()I

    move-result v1

    add-int/lit8 v2, v1, 0x1

    invoke-static {v2}, Lib/h;->g(I)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "ipv6-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v1, Ljava/lang/String;

    return-object v1
.end method

.method private final f(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lib/h;->d()Lkotlin/text/p;

    move-result-object v0

    new-instance v1, Lib/f;

    invoke-direct {v1}, Lib/f;-><init>()V

    invoke-virtual {v0, p1, v1}, Lkotlin/text/p;->o(Ljava/lang/CharSequence;Lmh/l;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lib/h;->b()Lkotlin/text/p;

    move-result-object v0

    new-instance v1, Lib/g;

    invoke-direct {v1}, Lib/g;-><init>()V

    invoke-virtual {v0, p1, v1}, Lkotlin/text/p;->o(Ljava/lang/CharSequence;Lmh/l;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private static final g(Lkotlin/text/l;)Ljava/lang/CharSequence;
    .locals 1

    const-string/jumbo v0, "result"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lib/h;->c:Lib/h$a;

    invoke-interface {p0}, Lkotlin/text/l;->getValue()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lib/h$a;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lkotlin/text/l;)Ljava/lang/CharSequence;
    .locals 1

    const-string/jumbo v0, "result"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lib/h;->c:Lib/h$a;

    invoke-interface {p0}, Lkotlin/text/l;->getValue()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lib/h$a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
