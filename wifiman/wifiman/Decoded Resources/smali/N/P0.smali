.class public final LN/P0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LN/P0;

.field private static final b:Lr/h0;

.field private static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, LN/P0;

    invoke-direct {v0}, LN/P0;-><init>()V

    sput-object v0, LN/P0;->a:LN/P0;

    new-instance v0, Lr/h0;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lr/h0;-><init>(FFLjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LN/P0;->b:Lr/h0;

    const/16 v0, 0x7d

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sput v0, LN/P0;->c:F

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic d(LN/P0;Ljava/util/Set;FFILjava/lang/Object;)LN/x0;
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/high16 v0, 0x41200000    # 10.0f

    if-eqz p5, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, LN/P0;->c(Ljava/util/Set;FF)LN/x0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()Lr/h0;
    .locals 1

    sget-object v0, LN/P0;->b:Lr/h0;

    return-object v0
.end method

.method public final b()F
    .locals 1

    sget v0, LN/P0;->c:F

    return v0
.end method

.method public final c(Ljava/util/Set;FF)LN/x0;
    .locals 2

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, LZg/v;->G0(Ljava/lang/Iterable;)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {p1}, LZg/v;->I0(Ljava/lang/Iterable;)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    sub-float/2addr v0, p1

    new-instance p1, LN/x0;

    invoke-direct {p1, v0, p2, p3}, LN/x0;-><init>(FFF)V

    :goto_0
    return-object p1
.end method
