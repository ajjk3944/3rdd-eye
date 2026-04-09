.class public final Lle/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lle/f;
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
    invoke-direct {p0}, Lle/f$a;-><init>()V

    return-void
.end method

.method public static synthetic a(Lmh/p;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    invoke-static {p0, p1, p2}, Lle/f$a;->i(Lmh/p;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static synthetic b(Lle/f;Lle/f;)I
    .locals 0

    invoke-static {p0, p1}, Lle/f$a;->f(Lle/f;Lle/f;)I

    move-result p0

    return p0
.end method

.method public static synthetic c(Lmh/l;Lle/f;Lle/f;)I
    .locals 0

    invoke-static {p0, p1, p2}, Lle/f$a;->l(Lmh/l;Lle/f;Lle/f;)I

    move-result p0

    return p0
.end method

.method public static synthetic d(Lmh/p;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    invoke-static {p0, p1, p2}, Lle/f$a;->g(Lmh/p;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static synthetic e(Lle/f;Lle/f;)I
    .locals 0

    invoke-static {p0, p1}, Lle/f$a;->h(Lle/f;Lle/f;)I

    move-result p0

    return p0
.end method

.method private static final f(Lle/f;Lle/f;)I
    .locals 0

    invoke-virtual {p0}, Lle/f;->c()Lle/i;

    move-result-object p0

    invoke-virtual {p0}, Lle/i;->r()Lke/c;

    move-result-object p0

    invoke-virtual {p1}, Lle/f;->c()Lle/i;

    move-result-object p1

    invoke-virtual {p1}, Lle/i;->r()Lke/c;

    move-result-object p1

    invoke-static {p0, p1}, Lch/a;->e(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p0

    return p0
.end method

.method private static final g(Lmh/p;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    invoke-interface {p0, p1, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final h(Lle/f;Lle/f;)I
    .locals 0

    invoke-virtual {p0}, Lle/f;->c()Lle/i;

    move-result-object p0

    invoke-virtual {p0}, Lle/i;->e()Lh9/a;

    move-result-object p0

    invoke-virtual {p1}, Lle/f;->c()Lle/i;

    move-result-object p1

    invoke-virtual {p1}, Lle/i;->e()Lh9/a;

    move-result-object p1

    invoke-static {p0, p1}, Lch/a;->e(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p0

    return p0
.end method

.method private static final i(Lmh/p;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    invoke-interface {p0, p1, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final l(Lmh/l;Lle/f;Lle/f;)I
    .locals 0

    invoke-static {p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {p0, p2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Comparable;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Comparable;

    invoke-static {p2, p0}, Lch/a;->e(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final j()Ljava/util/Comparator;
    .locals 3

    new-instance v0, Lle/f$a$a;

    invoke-direct {v0}, Lle/f$a$a;-><init>()V

    new-instance v1, Lle/a;

    invoke-direct {v1}, Lle/a;-><init>()V

    new-instance v2, Lle/b;

    invoke-direct {v2, v1}, Lle/b;-><init>(Lmh/p;)V

    invoke-static {v0, v2}, Lch/a;->i(Ljava/util/Comparator;Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object v0

    new-instance v1, Lle/c;

    invoke-direct {v1}, Lle/c;-><init>()V

    new-instance v2, Lle/d;

    invoke-direct {v2, v1}, Lle/d;-><init>(Lmh/p;)V

    invoke-static {v0, v2}, Lch/a;->i(Ljava/util/Comparator;Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public final k(Lmh/l;)Ljava/util/Comparator;
    .locals 1

    const-string v0, "signalGetter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lle/e;

    invoke-direct {v0, p1}, Lle/e;-><init>(Lmh/l;)V

    return-object v0
.end method
