.class public final Lie/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lie/c;
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
    invoke-direct {p0}, Lie/c$a;-><init>()V

    return-void
.end method

.method public static synthetic a(Lie/c;Lie/c;)I
    .locals 0

    invoke-static {p0, p1}, Lie/c$a;->c(Lie/c;Lie/c;)I

    move-result p0

    return p0
.end method

.method public static synthetic b(Lie/c;Lie/c;)I
    .locals 0

    invoke-static {p0, p1}, Lie/c$a;->d(Lie/c;Lie/c;)I

    move-result p0

    return p0
.end method

.method private static final c(Lie/c;Lie/c;)I
    .locals 0

    invoke-virtual {p0}, Lie/c;->a()LS8/e;

    move-result-object p0

    invoke-virtual {p0}, LS8/e;->d()I

    move-result p0

    invoke-virtual {p1}, Lie/c;->a()LS8/e;

    move-result-object p1

    invoke-virtual {p1}, LS8/e;->d()I

    move-result p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->k(II)I

    move-result p0

    return p0
.end method

.method private static final d(Lie/c;Lie/c;)I
    .locals 0

    invoke-virtual {p1}, Lie/c;->b()LS8/f;

    move-result-object p1

    invoke-virtual {p0}, Lie/c;->b()LS8/f;

    move-result-object p0

    invoke-virtual {p1, p0}, LS8/f;->a(LS8/f;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final e()Ljava/util/Comparator;
    .locals 1

    new-instance v0, Lie/b;

    invoke-direct {v0}, Lie/b;-><init>()V

    return-object v0
.end method

.method public final f()Ljava/util/Comparator;
    .locals 1

    new-instance v0, Lie/a;

    invoke-direct {v0}, Lie/a;-><init>()V

    return-object v0
.end method
