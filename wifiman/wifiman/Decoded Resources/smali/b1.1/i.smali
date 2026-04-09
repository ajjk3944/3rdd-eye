.class public abstract Lb1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb1/i$a;,
        Lb1/i$b;,
        Lb1/i$c;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;

.field private final b:Landroidx/constraintlayout/core/parser/d;

.field private c:I

.field private final d:I

.field private e:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/constraintlayout/core/parser/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb1/i;->a:Ljava/util/List;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/constraintlayout/core/parser/d;->g0()Landroidx/constraintlayout/core/parser/d;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    new-instance p1, Landroidx/constraintlayout/core/parser/d;

    const/4 v0, 0x0

    new-array v0, v0, [C

    invoke-direct {p1, v0}, Landroidx/constraintlayout/core/parser/d;-><init>([C)V

    :cond_1
    iput-object p1, p0, Lb1/i;->b:Landroidx/constraintlayout/core/parser/d;

    const/16 p1, 0x3e8

    iput p1, p0, Lb1/i;->d:I

    iput p1, p0, Lb1/i;->e:I

    return-void
.end method

.method private final d()I
    .locals 2

    iget v0, p0, Lb1/i;->e:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lb1/i;->e:I

    return v0
.end method

.method private final g(I)V
    .locals 1

    iget v0, p0, Lb1/i;->c:I

    mul-int/lit16 v0, v0, 0x3f1

    add-int/2addr v0, p1

    const p1, 0x3b9aca07

    rem-int/2addr v0, p1

    iput v0, p0, Lb1/i;->c:I

    return-void
.end method


# virtual methods
.method public final a(Lb1/B;)V
    .locals 2

    iget-object v0, p0, Lb1/i;->b:Landroidx/constraintlayout/core/parser/d;

    new-instance v1, Lg1/b$d;

    invoke-direct {v1}, Lg1/b$d;-><init>()V

    invoke-static {v0, p1, v1}, Lg1/b;->v(Landroidx/constraintlayout/core/parser/d;Lg1/g;Lg1/b$d;)V

    return-void
.end method

.method public final b(Lb1/x;)Landroidx/constraintlayout/core/parser/d;
    .locals 3

    invoke-virtual {p1}, Lb1/x;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lb1/i;->b:Landroidx/constraintlayout/core/parser/d;

    invoke-virtual {v0, p1}, Landroidx/constraintlayout/core/parser/a;->Q(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/d;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lb1/i;->b:Landroidx/constraintlayout/core/parser/d;

    new-instance v1, Landroidx/constraintlayout/core/parser/d;

    const/4 v2, 0x0

    new-array v2, v2, [C

    invoke-direct {v1, v2}, Landroidx/constraintlayout/core/parser/d;-><init>([C)V

    invoke-virtual {v0, p1, v1}, Landroidx/constraintlayout/core/parser/a;->a0(Ljava/lang/String;Landroidx/constraintlayout/core/parser/b;)V

    :cond_0
    iget-object v0, p0, Lb1/i;->b:Landroidx/constraintlayout/core/parser/d;

    invoke-virtual {v0, p1}, Landroidx/constraintlayout/core/parser/a;->O(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/d;

    move-result-object p1

    return-object p1
.end method

.method public final c(F)Lb1/i$c;
    .locals 6

    new-instance v0, Lb1/y;

    invoke-direct {p0}, Lb1/i;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lb1/y;-><init>(Ljava/lang/Object;)V

    new-instance v1, Lf1/a;

    const/4 v2, 0x0

    new-array v3, v2, [C

    invoke-direct {v1, v3}, Lf1/a;-><init>([C)V

    const-string v3, "start"

    invoke-static {v3}, Lf1/c;->x(Ljava/lang/String;)Lf1/c;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroidx/constraintlayout/core/parser/a;->x(Landroidx/constraintlayout/core/parser/b;)V

    new-instance v3, Lf1/b;

    invoke-direct {v3, p1}, Lf1/b;-><init>(F)V

    invoke-virtual {v1, v3}, Landroidx/constraintlayout/core/parser/a;->x(Landroidx/constraintlayout/core/parser/b;)V

    invoke-virtual {p0, v0}, Lb1/i;->b(Lb1/x;)Landroidx/constraintlayout/core/parser/d;

    move-result-object v3

    const-string v4, "type"

    const-string v5, "vGuideline"

    invoke-virtual {v3, v4, v5}, Landroidx/constraintlayout/core/parser/a;->e0(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "percent"

    invoke-virtual {v3, v4, v1}, Landroidx/constraintlayout/core/parser/a;->a0(Ljava/lang/String;Landroidx/constraintlayout/core/parser/b;)V

    const/4 v1, 0x3

    invoke-direct {p0, v1}, Lb1/i;->g(I)V

    invoke-static {p1}, Ljava/lang/Float;->hashCode(F)I

    move-result p1

    invoke-direct {p0, p1}, Lb1/i;->g(I)V

    new-instance p1, Lb1/i$c;

    invoke-virtual {v0}, Lb1/x;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p1, v1, v2, v0}, Lb1/i$c;-><init>(Ljava/lang/Object;ILb1/x;)V

    return-object p1
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lb1/i;->c:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lb1/i;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb1/i;->b:Landroidx/constraintlayout/core/parser/d;

    check-cast p1, Lb1/i;

    iget-object p1, p1, Lb1/i;->b:Landroidx/constraintlayout/core/parser/d;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lb1/i;->b:Landroidx/constraintlayout/core/parser/d;

    invoke-virtual {v0}, Landroidx/constraintlayout/core/parser/a;->clear()V

    iget v0, p0, Lb1/i;->d:I

    iput v0, p0, Lb1/i;->e:I

    const/4 v0, 0x0

    iput v0, p0, Lb1/i;->c:I

    return-void
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lb1/i;->b:Landroidx/constraintlayout/core/parser/d;

    invoke-virtual {v0}, Landroidx/constraintlayout/core/parser/a;->hashCode()I

    move-result v0

    return v0
.end method
