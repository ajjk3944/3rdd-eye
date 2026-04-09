.class public final LF/D;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF/D$a;
    }
.end annotation


# static fields
.field public static final g:LF/D$a;

.field private static final h:LF/D;

.field private static final i:LF/D;


# instance fields
.field private final a:I

.field private final b:Ljava/lang/Boolean;

.field private final c:I

.field private final d:I

.field private final e:Ljava/lang/Boolean;

.field private final f:LS0/e;


# direct methods
.method static constructor <clinit>()V
    .locals 22

    new-instance v0, LF/D$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF/D$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LF/D;->g:LF/D$a;

    new-instance v0, LF/D;

    const/16 v10, 0x7f

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v11}, LF/D;-><init>(ILjava/lang/Boolean;IILR0/K;Ljava/lang/Boolean;LS0/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LF/D;->h:LF/D;

    new-instance v0, LF/D;

    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v1, LR0/y;->b:LR0/y$a;

    invoke-virtual {v1}, LR0/y$a;->f()I

    move-result v15

    const/16 v20, 0x79

    const/16 v21, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v12, v0

    invoke-direct/range {v12 .. v21}, LF/D;-><init>(ILjava/lang/Boolean;IILR0/K;Ljava/lang/Boolean;LS0/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LF/D;->i:LF/D;

    return-void
.end method

.method private constructor <init>(ILjava/lang/Boolean;IILR0/K;Ljava/lang/Boolean;LS0/e;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p1, p0, LF/D;->a:I

    .line 5
    iput-object p2, p0, LF/D;->b:Ljava/lang/Boolean;

    .line 6
    iput p3, p0, LF/D;->c:I

    .line 7
    iput p4, p0, LF/D;->d:I

    .line 8
    iput-object p6, p0, LF/D;->e:Ljava/lang/Boolean;

    .line 9
    iput-object p7, p0, LF/D;->f:LS0/e;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Boolean;IILR0/K;Ljava/lang/Boolean;LS0/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    and-int/lit8 v0, p8, 0x1

    if-eqz v0, :cond_0

    .line 10
    sget-object v0, LR0/x;->b:LR0/x$a;

    invoke-virtual {v0}, LR0/x$a;->d()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, p1

    :goto_0
    and-int/lit8 v1, p8, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, v2

    goto :goto_1

    :cond_1
    move-object v1, p2

    :goto_1
    and-int/lit8 v3, p8, 0x4

    if-eqz v3, :cond_2

    .line 11
    sget-object v3, LR0/y;->b:LR0/y$a;

    invoke-virtual {v3}, LR0/y$a;->i()I

    move-result v3

    goto :goto_2

    :cond_2
    move v3, p3

    :goto_2
    and-int/lit8 v4, p8, 0x8

    if-eqz v4, :cond_3

    .line 12
    sget-object v4, LR0/r;->b:LR0/r$a;

    invoke-virtual {v4}, LR0/r$a;->i()I

    move-result v4

    goto :goto_3

    :cond_3
    move v4, p4

    :goto_3
    and-int/lit8 v5, p8, 0x10

    if-eqz v5, :cond_4

    move-object v5, v2

    goto :goto_4

    :cond_4
    move-object v5, p5

    :goto_4
    and-int/lit8 v6, p8, 0x20

    if-eqz v6, :cond_5

    move-object v6, v2

    goto :goto_5

    :cond_5
    move-object v6, p6

    :goto_5
    and-int/lit8 v7, p8, 0x40

    if-eqz v7, :cond_6

    goto :goto_6

    :cond_6
    move-object v2, p7

    :goto_6
    const/4 v7, 0x0

    move-object p1, p0

    move p2, v0

    move-object p3, v1

    move p4, v3

    move p5, v4

    move-object p6, v5

    move-object p7, v6

    move-object/from16 p8, v2

    move-object/from16 p9, v7

    .line 13
    invoke-direct/range {p1 .. p9}, LF/D;-><init>(ILjava/lang/Boolean;IILR0/K;Ljava/lang/Boolean;LS0/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Boolean;IILR0/K;Ljava/lang/Boolean;LS0/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, LF/D;-><init>(ILjava/lang/Boolean;IILR0/K;Ljava/lang/Boolean;LS0/e;)V

    return-void
.end method

.method private constructor <init>(IZIILR0/K;Ljava/lang/Boolean;LS0/e;)V
    .locals 9

    .line 18
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v8, 0x0

    move-object v0, p0

    move v1, p1

    move v3, p3

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    .line 19
    invoke-direct/range {v0 .. v8}, LF/D;-><init>(ILjava/lang/Boolean;IILR0/K;Ljava/lang/Boolean;LS0/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(IZIILR0/K;Ljava/lang/Boolean;LS0/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    and-int/lit8 v0, p8, 0x1

    if-eqz v0, :cond_0

    .line 14
    sget-object v0, LR0/x;->b:LR0/x$a;

    invoke-virtual {v0}, LR0/x$a;->d()I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_1

    .line 15
    sget-object v0, LR0/y;->b:LR0/y$a;

    invoke-virtual {v0}, LR0/y$a;->i()I

    move-result v0

    move v4, v0

    goto :goto_1

    :cond_1
    move v4, p3

    :goto_1
    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_2

    .line 16
    sget-object v0, LR0/r;->b:LR0/r$a;

    invoke-virtual {v0}, LR0/r$a;->i()I

    move-result v0

    move v5, v0

    goto :goto_2

    :cond_2
    move v5, p4

    :goto_2
    and-int/lit8 v0, p8, 0x10

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    move-object v6, v1

    goto :goto_3

    :cond_3
    move-object v6, p5

    :goto_3
    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_4

    move-object v7, v1

    goto :goto_4

    :cond_4
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_5

    move-object v8, v1

    goto :goto_5

    :cond_5
    move-object/from16 v8, p7

    :goto_5
    const/4 v9, 0x0

    move-object v1, p0

    move v3, p2

    .line 17
    invoke-direct/range {v1 .. v9}, LF/D;-><init>(IZIILR0/K;Ljava/lang/Boolean;LS0/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(IZIILR0/K;Ljava/lang/Boolean;LS0/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct/range {p0 .. p7}, LF/D;-><init>(IZIILR0/K;Ljava/lang/Boolean;LS0/e;)V

    return-void
.end method

.method public static final synthetic a()LF/D;
    .locals 1

    sget-object v0, LF/D;->h:LF/D;

    return-object v0
.end method

.method public static final synthetic b()LF/D;
    .locals 1

    sget-object v0, LF/D;->i:LF/D;

    return-object v0
.end method

.method private final d()Z
    .locals 1

    iget-object v0, p0, LF/D;->b:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method private final e()I
    .locals 4

    iget v0, p0, LF/D;->a:I

    invoke-static {v0}, LR0/x;->f(I)LR0/x;

    move-result-object v0

    invoke-virtual {v0}, LR0/x;->l()I

    move-result v1

    sget-object v2, LR0/x;->b:LR0/x$a;

    invoke-virtual {v2}, LR0/x$a;->d()I

    move-result v3

    invoke-static {v1, v3}, LR0/x;->i(II)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, LR0/x;->l()I

    move-result v0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, LR0/x$a;->b()I

    move-result v0

    :goto_1
    return v0
.end method

.method private final f()LS0/e;
    .locals 1

    iget-object v0, p0, LF/D;->f:LS0/e;

    if-nez v0, :cond_0

    sget-object v0, LS0/e;->c:LS0/e$a;

    invoke-virtual {v0}, LS0/e$a;->b()LS0/e;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private final i()I
    .locals 4

    iget v0, p0, LF/D;->c:I

    invoke-static {v0}, LR0/y;->k(I)LR0/y;

    move-result-object v0

    invoke-virtual {v0}, LR0/y;->q()I

    move-result v1

    sget-object v2, LR0/y;->b:LR0/y$a;

    invoke-virtual {v2}, LR0/y$a;->i()I

    move-result v3

    invoke-static {v1, v3}, LR0/y;->n(II)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, LR0/y;->q()I

    move-result v0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, LR0/y$a;->h()I

    move-result v0

    :goto_1
    return v0
.end method

.method private final k()Z
    .locals 2

    iget v0, p0, LF/D;->a:I

    sget-object v1, LR0/x;->b:LR0/x$a;

    invoke-virtual {v1}, LR0/x$a;->d()I

    move-result v1

    invoke-static {v0, v1}, LR0/x;->i(II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LF/D;->b:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    iget v0, p0, LF/D;->c:I

    sget-object v1, LR0/y;->b:LR0/y$a;

    invoke-virtual {v1}, LR0/y$a;->i()I

    move-result v1

    invoke-static {v0, v1}, LR0/y;->n(II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, LF/D;->d:I

    sget-object v1, LR0/r;->b:LR0/r$a;

    invoke-virtual {v1}, LR0/r$a;->i()I

    move-result v1

    invoke-static {v0, v1}, LR0/r;->m(II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LF/D;->e:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    iget-object v0, p0, LF/D;->f:LS0/e;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public final c(LF/D;)LF/D;
    .locals 12

    if-eqz p1, :cond_b

    invoke-direct {p1}, LF/D;->k()Z

    move-result v0

    if-nez v0, :cond_b

    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_9

    :cond_0
    invoke-direct {p0}, LF/D;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p1

    :cond_1
    iget v0, p0, LF/D;->a:I

    invoke-static {v0}, LR0/x;->f(I)LR0/x;

    move-result-object v0

    invoke-virtual {v0}, LR0/x;->l()I

    move-result v1

    sget-object v2, LR0/x;->b:LR0/x$a;

    invoke-virtual {v2}, LR0/x$a;->d()I

    move-result v2

    invoke-static {v1, v2}, LR0/x;->i(II)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {v0}, LR0/x;->l()I

    move-result v0

    :goto_1
    move v4, v0

    goto :goto_2

    :cond_3
    iget v0, p1, LF/D;->a:I

    goto :goto_1

    :goto_2
    iget-object v0, p0, LF/D;->b:Ljava/lang/Boolean;

    if-nez v0, :cond_4

    iget-object v0, p1, LF/D;->b:Ljava/lang/Boolean;

    :cond_4
    move-object v5, v0

    iget v0, p0, LF/D;->c:I

    invoke-static {v0}, LR0/y;->k(I)LR0/y;

    move-result-object v0

    invoke-virtual {v0}, LR0/y;->q()I

    move-result v1

    sget-object v3, LR0/y;->b:LR0/y$a;

    invoke-virtual {v3}, LR0/y$a;->i()I

    move-result v3

    invoke-static {v1, v3}, LR0/y;->n(II)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_3

    :cond_5
    move-object v0, v2

    :goto_3
    if-eqz v0, :cond_6

    invoke-virtual {v0}, LR0/y;->q()I

    move-result v0

    :goto_4
    move v6, v0

    goto :goto_5

    :cond_6
    iget v0, p1, LF/D;->c:I

    goto :goto_4

    :goto_5
    iget v0, p0, LF/D;->d:I

    invoke-static {v0}, LR0/r;->j(I)LR0/r;

    move-result-object v0

    invoke-virtual {v0}, LR0/r;->p()I

    move-result v1

    sget-object v3, LR0/r;->b:LR0/r$a;

    invoke-virtual {v3}, LR0/r$a;->i()I

    move-result v3

    invoke-static {v1, v3}, LR0/r;->m(II)Z

    move-result v1

    if-nez v1, :cond_7

    move-object v2, v0

    :cond_7
    if-eqz v2, :cond_8

    invoke-virtual {v2}, LR0/r;->p()I

    move-result v0

    :goto_6
    move v7, v0

    goto :goto_7

    :cond_8
    iget v0, p1, LF/D;->d:I

    goto :goto_6

    :goto_7
    iget-object v0, p0, LF/D;->e:Ljava/lang/Boolean;

    if-nez v0, :cond_9

    iget-object v0, p1, LF/D;->e:Ljava/lang/Boolean;

    :cond_9
    move-object v9, v0

    iget-object v0, p0, LF/D;->f:LS0/e;

    if-nez v0, :cond_a

    iget-object p1, p1, LF/D;->f:LS0/e;

    move-object v10, p1

    goto :goto_8

    :cond_a
    move-object v10, v0

    :goto_8
    new-instance p1, LF/D;

    const/4 v8, 0x0

    const/4 v11, 0x0

    move-object v3, p1

    invoke-direct/range {v3 .. v11}, LF/D;-><init>(ILjava/lang/Boolean;IILR0/K;Ljava/lang/Boolean;LS0/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_b
    :goto_9
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LF/D;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget v1, p0, LF/D;->a:I

    check-cast p1, LF/D;

    iget v3, p1, LF/D;->a:I

    invoke-static {v1, v3}, LR0/x;->i(II)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LF/D;->b:Ljava/lang/Boolean;

    iget-object v3, p1, LF/D;->b:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, LF/D;->c:I

    iget v3, p1, LF/D;->c:I

    invoke-static {v1, v3}, LR0/y;->n(II)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, LF/D;->d:I

    iget v3, p1, LF/D;->d:I

    invoke-static {v1, v3}, LR0/r;->m(II)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-static {v1, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, LF/D;->e:Ljava/lang/Boolean;

    iget-object v3, p1, LF/D;->e:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, LF/D;->f:LS0/e;

    iget-object p1, p1, LF/D;->f:LS0/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final g()I
    .locals 4

    iget v0, p0, LF/D;->d:I

    invoke-static {v0}, LR0/r;->j(I)LR0/r;

    move-result-object v0

    invoke-virtual {v0}, LR0/r;->p()I

    move-result v1

    sget-object v2, LR0/r;->b:LR0/r$a;

    invoke-virtual {v2}, LR0/r$a;->i()I

    move-result v3

    invoke-static {v1, v3}, LR0/r;->m(II)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, LR0/r;->p()I

    move-result v0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, LR0/r$a;->a()I

    move-result v0

    :goto_1
    return v0
.end method

.method public final h()I
    .locals 1

    iget v0, p0, LF/D;->c:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, LF/D;->a:I

    invoke-static {v0}, LR0/x;->j(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LF/D;->b:Ljava/lang/Boolean;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LF/D;->c:I

    invoke-static {v1}, LR0/y;->o(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LF/D;->d:I

    invoke-static {v1}, LR0/r;->n(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x3c1

    iget-object v1, p0, LF/D;->e:Ljava/lang/Boolean;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LF/D;->f:LS0/e;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_2
    add-int/2addr v0, v2

    return v0
.end method

.method public final j()Z
    .locals 1

    iget-object v0, p0, LF/D;->e:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public final l(Z)LR0/s;
    .locals 10

    new-instance v9, LR0/s;

    invoke-direct {p0}, LF/D;->e()I

    move-result v2

    invoke-direct {p0}, LF/D;->d()Z

    move-result v3

    invoke-direct {p0}, LF/D;->i()I

    move-result v4

    invoke-virtual {p0}, LF/D;->g()I

    move-result v5

    invoke-direct {p0}, LF/D;->f()LS0/e;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v0, v9

    move v1, p1

    invoke-direct/range {v0 .. v8}, LR0/s;-><init>(ZIZIILR0/K;LS0/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "KeyboardOptions(capitalization="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LF/D;->a:I

    invoke-static {v1}, LR0/x;->k(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", autoCorrectEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LF/D;->b:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", keyboardType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LF/D;->c:I

    invoke-static {v1}, LR0/y;->p(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", imeAction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LF/D;->d:I

    invoke-static {v1}, LR0/r;->o(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", platformImeOptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "showKeyboardOnFocus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LF/D;->e:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hintLocales="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LF/D;->f:LS0/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
