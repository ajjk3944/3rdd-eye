.class public final Lii/x;
.super Lii/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lii/x$a;
    }
.end annotation


# static fields
.field public static final d:Lii/x$a;


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:Lii/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lii/x$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lii/x$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lii/x;->d:Lii/x$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lii/k;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lii/a;-><init>()V

    iput-object p1, p0, Lii/x;->b:Ljava/lang/String;

    iput-object p2, p0, Lii/x;->c:Lii/k;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lii/k;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lii/x;-><init>(Ljava/lang/String;Lii/k;)V

    return-void
.end method

.method static synthetic j(LBh/f0;)LBh/a;
    .locals 0

    invoke-static {p0}, Lii/x;->o(LBh/f0;)LBh/a;

    move-result-object p0

    return-object p0
.end method

.method static synthetic k(LBh/Y;)LBh/a;
    .locals 0

    invoke-static {p0}, Lii/x;->p(LBh/Y;)LBh/a;

    move-result-object p0

    return-object p0
.end method

.method static synthetic l(LBh/a;)LBh/a;
    .locals 0

    invoke-static {p0}, Lii/x;->n(LBh/a;)LBh/a;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Ljava/lang/String;Ljava/util/Collection;)Lii/k;
    .locals 1

    sget-object v0, Lii/x;->d:Lii/x$a;

    invoke-virtual {v0, p0, p1}, Lii/x$a;->a(Ljava/lang/String;Ljava/util/Collection;)Lii/k;

    move-result-object p0

    return-object p0
.end method

.method private static final n(LBh/a;)LBh/a;
    .locals 1

    const-string v0, "$this$selectMostSpecificInEachOverridableGroup"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final o(LBh/f0;)LBh/a;
    .locals 1

    const-string v0, "$this$selectMostSpecificInEachOverridableGroup"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final p(LBh/Y;)LBh/a;
    .locals 1

    const-string v0, "$this$selectMostSpecificInEachOverridableGroup"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public b(LZh/f;LIh/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lii/a;->b(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object p1

    sget-object p2, Lii/u;->a:Lii/u;

    invoke-static {p1, p2}, Lbi/r;->b(Ljava/util/Collection;Lmh/l;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public d(LZh/f;LIh/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lii/a;->d(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object p1

    sget-object p2, Lii/v;->a:Lii/v;

    invoke-static {p1, p2}, Lbi/r;->b(Ljava/util/Collection;Lmh/l;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public e(Lii/d;Lmh/l;)Ljava/util/Collection;
    .locals 3

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameFilter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lii/a;->e(Lii/d;Lmh/l;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LBh/m;

    instance-of v2, v2, LBh/a;

    if-eqz v2, :cond_0

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, LYg/s;

    invoke-direct {p1, p2, v0}, LYg/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    const-string v0, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/util/Collection;

    sget-object v0, Lii/w;->a:Lii/w;

    invoke-static {p2, v0}, Lbi/r;->b(Ljava/util/Collection;Lmh/l;)Ljava/util/Collection;

    move-result-object p2

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p2, p1}, LZg/v;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method protected i()Lii/k;
    .locals 1

    iget-object v0, p0, Lii/x;->c:Lii/k;

    return-object v0
.end method
