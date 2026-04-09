.class public final LB/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/lazy/layout/c;


# instance fields
.field private final b:Lo/K;

.field private final c:[Ljava/lang/Object;

.field private final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lsh/i;LB/o;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p2}, LB/o;->c()LB/d;

    move-result-object p2

    invoke-virtual {p1}, Lsh/g;->i()I

    move-result v0

    if-ltz v0, :cond_1

    invoke-virtual {p1}, Lsh/g;->j()I

    move-result p1

    invoke-interface {p2}, LB/d;->a()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    if-ge p1, v0, :cond_0

    invoke-static {}, Lo/L;->a()Lo/K;

    move-result-object p1

    iput-object p1, p0, LB/K;->b:Lo/K;

    const/4 p1, 0x0

    new-array p2, p1, [Ljava/lang/Object;

    iput-object p2, p0, LB/K;->c:[Ljava/lang/Object;

    iput p1, p0, LB/K;->d:I

    goto :goto_0

    :cond_0
    sub-int v1, p1, v0

    add-int/lit8 v1, v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    iput-object v2, p0, LB/K;->c:[Ljava/lang/Object;

    iput v0, p0, LB/K;->d:I

    new-instance v2, Lo/E;

    invoke-direct {v2, v1}, Lo/E;-><init>(I)V

    new-instance v1, LB/K$a;

    invoke-direct {v1, v0, p1, v2, p0}, LB/K$a;-><init>(IILo/E;LB/K;)V

    invoke-interface {p2, v0, p1, v1}, LB/d;->b(IILmh/l;)V

    iput-object v2, p0, LB/K;->b:Lo/K;

    :goto_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "negative nearestRange.first"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final synthetic a(LB/K;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, LB/K;->c:[Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic d(LB/K;)I
    .locals 0

    iget p0, p0, LB/K;->d:I

    return p0
.end method


# virtual methods
.method public b(I)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LB/K;->c:[Ljava/lang/Object;

    iget v1, p0, LB/K;->d:I

    sub-int/2addr p1, v1

    if-ltz p1, :cond_0

    invoke-static {v0}, LZg/n;->g0([Ljava/lang/Object;)I

    move-result v1

    if-gt p1, v1, :cond_0

    aget-object p1, v0, p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public c(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, LB/K;->b:Lo/K;

    invoke-virtual {v0, p1}, Lo/K;->a(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    iget-object v0, v0, Lo/K;->c:[I

    aget p1, v0, p1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method
