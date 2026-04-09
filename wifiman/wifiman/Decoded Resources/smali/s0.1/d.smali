.class public final Ls0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls0/d$a;,
        Ls0/d$b;
    }
.end annotation


# static fields
.field public static final k:Ls0/d$b;

.field private static l:I


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:F

.field private final c:F

.field private final d:F

.field private final e:F

.field private final f:Ls0/m;

.field private final g:J

.field private final h:I

.field private final i:Z

.field private final j:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls0/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls0/d$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ls0/d;->k:Ls0/d$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;FFFFLs0/m;JIZI)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Ls0/d;->a:Ljava/lang/String;

    .line 4
    iput p2, p0, Ls0/d;->b:F

    .line 5
    iput p3, p0, Ls0/d;->c:F

    .line 6
    iput p4, p0, Ls0/d;->d:F

    .line 7
    iput p5, p0, Ls0/d;->e:F

    .line 8
    iput-object p6, p0, Ls0/d;->f:Ls0/m;

    .line 9
    iput-wide p7, p0, Ls0/d;->g:J

    .line 10
    iput p9, p0, Ls0/d;->h:I

    .line 11
    iput-boolean p10, p0, Ls0/d;->i:Z

    .line 12
    iput p11, p0, Ls0/d;->j:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;FFFFLs0/m;JIZIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    move/from16 v0, p12

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    .line 13
    sget-object v0, Ls0/d;->k:Ls0/d$b;

    invoke-virtual {v0}, Ls0/d$b;->a()I

    move-result v0

    move v12, v0

    goto :goto_0

    :cond_0
    move/from16 v12, p11

    :goto_0
    const/4 v13, 0x0

    move-object v1, p0

    move-object v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-wide/from16 v8, p7

    move/from16 v10, p9

    move/from16 v11, p10

    .line 14
    invoke-direct/range {v1 .. v13}, Ls0/d;-><init>(Ljava/lang/String;FFFFLs0/m;JIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;FFFFLs0/m;JIZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p11}, Ls0/d;-><init>(Ljava/lang/String;FFFFLs0/m;JIZI)V

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, Ls0/d;->l:I

    return v0
.end method

.method public static final synthetic b(I)V
    .locals 0

    sput p0, Ls0/d;->l:I

    return-void
.end method


# virtual methods
.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Ls0/d;->i:Z

    return v0
.end method

.method public final d()F
    .locals 1

    iget v0, p0, Ls0/d;->c:F

    return v0
.end method

.method public final e()F
    .locals 1

    iget v0, p0, Ls0/d;->b:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ls0/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Ls0/d;->a:Ljava/lang/String;

    check-cast p1, Ls0/d;

    iget-object v3, p1, Ls0/d;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Ls0/d;->b:F

    iget v3, p1, Ls0/d;->b:F

    invoke-static {v1, v3}, LY0/h;->n(FF)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Ls0/d;->c:F

    iget v3, p1, Ls0/d;->c:F

    invoke-static {v1, v3}, LY0/h;->n(FF)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Ls0/d;->d:F

    iget v3, p1, Ls0/d;->d:F

    cmpg-float v1, v1, v3

    if-nez v1, :cond_9

    iget v1, p0, Ls0/d;->e:F

    iget v3, p1, Ls0/d;->e:F

    cmpg-float v1, v1, v3

    if-nez v1, :cond_9

    iget-object v1, p0, Ls0/d;->f:Ls0/m;

    iget-object v3, p1, Ls0/d;->f:Ls0/m;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Ls0/d;->g:J

    iget-wide v5, p1, Ls0/d;->g:J

    invoke-static {v3, v4, v5, v6}, Lm0/v0;->m(JJ)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Ls0/d;->h:I

    iget v3, p1, Ls0/d;->h:I

    invoke-static {v1, v3}, Lm0/d0;->E(II)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Ls0/d;->i:Z

    iget-boolean p1, p1, Ls0/d;->i:Z

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0

    :cond_9
    return v2
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Ls0/d;->j:I

    return v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls0/d;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Ls0/m;
    .locals 1

    iget-object v0, p0, Ls0/d;->f:Ls0/m;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Ls0/d;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls0/d;->b:F

    invoke-static {v1}, LY0/h;->p(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls0/d;->c:F

    invoke-static {v1}, LY0/h;->p(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls0/d;->d:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls0/d;->e:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls0/d;->f:Ls0/m;

    invoke-virtual {v1}, Ls0/m;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Ls0/d;->g:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ls0/d;->h:I

    invoke-static {v1}, Lm0/d0;->F(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Ls0/d;->i:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()I
    .locals 1

    iget v0, p0, Ls0/d;->h:I

    return v0
.end method

.method public final j()J
    .locals 2

    iget-wide v0, p0, Ls0/d;->g:J

    return-wide v0
.end method

.method public final k()F
    .locals 1

    iget v0, p0, Ls0/d;->e:F

    return v0
.end method

.method public final l()F
    .locals 1

    iget v0, p0, Ls0/d;->d:F

    return v0
.end method
