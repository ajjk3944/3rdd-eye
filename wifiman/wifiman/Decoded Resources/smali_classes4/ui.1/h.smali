.class public final Lui/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LZh/f;

.field private final b:Lkotlin/text/p;

.field private final c:Ljava/util/Collection;

.field private final d:Lmh/l;

.field private final e:[Lui/f;


# direct methods
.method private varargs constructor <init>(LZh/f;Lkotlin/text/p;Ljava/util/Collection;Lmh/l;[Lui/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lui/h;->a:LZh/f;

    .line 3
    iput-object p2, p0, Lui/h;->b:Lkotlin/text/p;

    .line 4
    iput-object p3, p0, Lui/h;->c:Ljava/util/Collection;

    .line 5
    iput-object p4, p0, Lui/h;->d:Lmh/l;

    .line 6
    iput-object p5, p0, Lui/h;->e:[Lui/f;

    return-void
.end method

.method public constructor <init>(LZh/f;[Lui/f;Lmh/l;)V
    .locals 6

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checks"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalChecks"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    move-object v5, p2

    check-cast v5, [Lui/f;

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lui/h;-><init>(LZh/f;Lkotlin/text/p;Ljava/util/Collection;Lmh/l;[Lui/f;)V

    return-void
.end method

.method public synthetic constructor <init>(LZh/f;[Lui/f;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 7
    sget-object p3, Lui/h$a;->a:Lui/h$a;

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lui/h;-><init>(LZh/f;[Lui/f;Lmh/l;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;[Lui/f;Lmh/l;)V
    .locals 6

    const-string v0, "nameList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checks"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalChecks"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    move-object v5, p2

    check-cast v5, [Lui/f;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v3, p1

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lui/h;-><init>(LZh/f;Lkotlin/text/p;Ljava/util/Collection;Lmh/l;[Lui/f;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Collection;[Lui/f;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 11
    sget-object p3, Lui/h$c;->a:Lui/h$c;

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lui/h;-><init>(Ljava/util/Collection;[Lui/f;Lmh/l;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/text/p;[Lui/f;Lmh/l;)V
    .locals 6

    const-string v0, "regex"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "checks"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalChecks"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    move-object v5, p2

    check-cast v5, [Lui/f;

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lui/h;-><init>(LZh/f;Lkotlin/text/p;Ljava/util/Collection;Lmh/l;[Lui/f;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/text/p;[Lui/f;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 9
    sget-object p3, Lui/h$b;->a:Lui/h$b;

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lui/h;-><init>(Lkotlin/text/p;[Lui/f;Lmh/l;)V

    return-void
.end method


# virtual methods
.method public final a(LBh/z;)Lui/g;
    .locals 4

    const-string v0, "functionDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lui/h;->e:[Lui/f;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-interface {v3, p1}, Lui/f;->c(LBh/z;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    new-instance p1, Lui/g$b;

    invoke-direct {p1, v3}, Lui/g$b;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lui/h;->d:Lmh/l;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_2

    new-instance v0, Lui/g$b;

    invoke-direct {v0, p1}, Lui/g$b;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_2
    sget-object p1, Lui/g$c;->b:Lui/g$c;

    return-object p1
.end method

.method public final b(LBh/z;)Z
    .locals 3

    const-string v0, "functionDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lui/h;->a:LZh/f;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {p1}, LBh/I;->getName()LZh/f;

    move-result-object v0

    iget-object v2, p0, Lui/h;->a:LZh/f;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lui/h;->b:Lkotlin/text/p;

    if-eqz v0, :cond_1

    invoke-interface {p1}, LBh/I;->getName()LZh/f;

    move-result-object v0

    invoke-virtual {v0}, LZh/f;->b()Ljava/lang/String;

    move-result-object v0

    const-string v2, "asString(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lui/h;->b:Lkotlin/text/p;

    invoke-virtual {v2, v0}, Lkotlin/text/p;->m(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lui/h;->c:Ljava/util/Collection;

    if-eqz v0, :cond_2

    invoke-interface {p1}, LBh/I;->getName()LZh/f;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method
