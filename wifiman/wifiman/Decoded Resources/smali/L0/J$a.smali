.class public final LL0/J$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL0/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LL0/J$a;

.field private static final b:LL0/J;

.field private static final c:LL0/J;

.field private static final d:LL0/J;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LL0/J$a;

    invoke-direct {v0}, LL0/J$a;-><init>()V

    sput-object v0, LL0/J$a;->a:LL0/J$a;

    new-instance v0, LL0/G;

    invoke-direct {v0}, LL0/G;-><init>()V

    sput-object v0, LL0/J$a;->b:LL0/J;

    new-instance v0, LL0/H;

    invoke-direct {v0}, LL0/H;-><init>()V

    sput-object v0, LL0/J$a;->c:LL0/J;

    new-instance v0, LL0/I;

    invoke-direct {v0}, LL0/I;-><init>()V

    sput-object v0, LL0/J$a;->d:LL0/J;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ll0/i;Ll0/i;)Z
    .locals 0

    invoke-static {p0, p1}, LL0/J$a;->e(Ll0/i;Ll0/i;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Ll0/i;Ll0/i;)Z
    .locals 0

    invoke-static {p0, p1}, LL0/J$a;->f(Ll0/i;Ll0/i;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Ll0/i;Ll0/i;)Z
    .locals 0

    invoke-static {p0, p1}, LL0/J$a;->d(Ll0/i;Ll0/i;)Z

    move-result p0

    return p0
.end method

.method private static final d(Ll0/i;Ll0/i;)Z
    .locals 0

    invoke-virtual {p0, p1}, Ll0/i;->v(Ll0/i;)Z

    move-result p0

    return p0
.end method

.method private static final e(Ll0/i;Ll0/i;)Z
    .locals 2

    invoke-virtual {p1}, Ll0/i;->u()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll0/i;->k()F

    move-result v0

    invoke-virtual {p1}, Ll0/i;->k()F

    move-result v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Ll0/i;->l()F

    move-result v0

    invoke-virtual {p1}, Ll0/i;->l()F

    move-result v1

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    invoke-virtual {p0}, Ll0/i;->n()F

    move-result v0

    invoke-virtual {p1}, Ll0/i;->n()F

    move-result v1

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Ll0/i;->e()F

    move-result p0

    invoke-virtual {p1}, Ll0/i;->e()F

    move-result p1

    cmpg-float p0, p0, p1

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final f(Ll0/i;Ll0/i;)Z
    .locals 2

    invoke-virtual {p0}, Ll0/i;->i()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ll0/i;->b(J)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final g()LL0/J;
    .locals 1

    sget-object v0, LL0/J$a;->b:LL0/J;

    return-object v0
.end method

.method public final h()LL0/J;
    .locals 1

    sget-object v0, LL0/J$a;->d:LL0/J;

    return-object v0
.end method
