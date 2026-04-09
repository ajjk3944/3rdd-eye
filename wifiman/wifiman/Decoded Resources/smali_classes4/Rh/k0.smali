.class public abstract LRh/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LRh/k0$a;
    }
.end annotation


# static fields
.field private static final a:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

.field private static final b:LRh/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LRh/f;

    sget-object v1, LJh/I;->v:LZh/c;

    const-string v2, "ENHANCED_NULLABILITY_ANNOTATION"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, LRh/f;-><init>(LZh/c;)V

    sput-object v0, LRh/k0;->a:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    new-instance v0, LRh/f;

    sget-object v1, LJh/I;->w:LZh/c;

    const-string v2, "ENHANCED_MUTABILITY_ANNOTATION"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, LRh/f;-><init>(LZh/c;)V

    sput-object v0, LRh/k0;->b:LRh/f;

    return-void
.end method

.method public static final synthetic a(Ljava/util/List;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 0

    invoke-static {p0}, LRh/k0;->e(Ljava/util/List;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LBh/h;LRh/h;LRh/h0;)LBh/h;
    .locals 0

    invoke-static {p0, p1, p2}, LRh/k0;->f(LBh/h;LRh/h;LRh/h0;)LBh/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c()LRh/f;
    .locals 1

    sget-object v0, LRh/k0;->b:LRh/f;

    return-object v0
.end method

.method public static final synthetic d(LRh/h;LRh/h0;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, LRh/k0;->h(LRh/h;LRh/h0;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Ljava/util/List;)Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 2

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/o;

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/o;-><init>(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    invoke-static {p0}, LZg/v;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    :goto_0
    return-object v0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "At least one Annotations object expected"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final f(LBh/h;LRh/h;LRh/h0;)LBh/h;
    .locals 4

    sget-object v0, LAh/d;->a:LAh/d;

    invoke-static {p2}, LRh/i0;->a(LRh/h0;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, p0, LBh/e;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, LRh/h;->e()LRh/i;

    move-result-object v1

    sget-object v3, LRh/i;->READ_ONLY:LRh/i;

    if-ne v1, v3, :cond_2

    sget-object v1, LRh/h0;->FLEXIBLE_LOWER:LRh/h0;

    if-ne p2, v1, :cond_2

    move-object v1, p0

    check-cast v1, LBh/e;

    invoke-virtual {v0, v1}, LAh/d;->c(LBh/e;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v0, v1}, LAh/d;->a(LBh/e;)LBh/e;

    move-result-object v2

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, LRh/h;->e()LRh/i;

    move-result-object p1

    sget-object v1, LRh/i;->MUTABLE:LRh/i;

    if-ne p1, v1, :cond_3

    sget-object p1, LRh/h0;->FLEXIBLE_UPPER:LRh/h0;

    if-ne p2, p1, :cond_3

    check-cast p0, LBh/e;

    invoke-virtual {v0, p0}, LAh/d;->d(LBh/e;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v0, p0}, LAh/d;->b(LBh/e;)LBh/e;

    move-result-object v2

    :cond_3
    :goto_0
    return-object v2
.end method

.method public static final g()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;
    .locals 1

    sget-object v0, LRh/k0;->a:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    return-object v0
.end method

.method private static final h(LRh/h;LRh/h0;)Ljava/lang/Boolean;
    .locals 1

    invoke-static {p1}, LRh/i0;->a(LRh/h0;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, LRh/h;->f()LRh/k;

    move-result-object p0

    if-nez p0, :cond_1

    const/4 p0, -0x1

    goto :goto_0

    :cond_1
    sget-object p1, LRh/k0$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p1, p0

    :goto_0
    const/4 p1, 0x1

    if-eq p0, p1, :cond_3

    const/4 p1, 0x2

    if-eq p0, p1, :cond_2

    goto :goto_1

    :cond_2
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_1

    :cond_3
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_1
    return-object v0
.end method

.method public static final i(Lpi/S;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/s;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/s;

    invoke-static {v0, p0}, LRh/l0;->c(Lpi/H0;Lri/i;)Z

    move-result p0

    return p0
.end method
