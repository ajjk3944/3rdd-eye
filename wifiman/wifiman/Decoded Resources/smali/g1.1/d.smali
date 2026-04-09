.class public Lg1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final i:Ljava/lang/Object;

.field public static final j:Ljava/lang/Object;

.field public static final k:Ljava/lang/Object;

.field public static final l:Ljava/lang/Object;

.field public static final m:Ljava/lang/Object;

.field public static final n:Ljava/lang/Object;


# instance fields
.field private final a:I

.field b:I

.field c:I

.field d:F

.field e:I

.field f:Ljava/lang/String;

.field g:Ljava/lang/Object;

.field h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/String;

    const-string v1, "FIXED_DIMENSION"

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    sput-object v0, Lg1/d;->i:Ljava/lang/Object;

    new-instance v0, Ljava/lang/String;

    const-string v1, "WRAP_DIMENSION"

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    sput-object v0, Lg1/d;->j:Ljava/lang/Object;

    new-instance v0, Ljava/lang/String;

    const-string v1, "SPREAD_DIMENSION"

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    sput-object v0, Lg1/d;->k:Ljava/lang/Object;

    new-instance v0, Ljava/lang/String;

    const-string v1, "PARENT_DIMENSION"

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    sput-object v0, Lg1/d;->l:Ljava/lang/Object;

    new-instance v0, Ljava/lang/String;

    const-string v1, "PERCENT_DIMENSION"

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    sput-object v0, Lg1/d;->m:Ljava/lang/Object;

    new-instance v0, Ljava/lang/String;

    const-string v1, "RATIO_DIMENSION"

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    sput-object v0, Lg1/d;->n:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x2

    .line 2
    iput v0, p0, Lg1/d;->a:I

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lg1/d;->b:I

    const v1, 0x7fffffff

    .line 4
    iput v1, p0, Lg1/d;->c:I

    const/high16 v1, 0x3f800000    # 1.0f

    .line 5
    iput v1, p0, Lg1/d;->d:F

    .line 6
    iput v0, p0, Lg1/d;->e:I

    const/4 v1, 0x0

    .line 7
    iput-object v1, p0, Lg1/d;->f:Ljava/lang/String;

    .line 8
    sget-object v1, Lg1/d;->j:Ljava/lang/Object;

    iput-object v1, p0, Lg1/d;->g:Ljava/lang/Object;

    .line 9
    iput-boolean v0, p0, Lg1/d;->h:Z

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;)V
    .locals 2

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x2

    .line 11
    iput v0, p0, Lg1/d;->a:I

    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lg1/d;->b:I

    const v1, 0x7fffffff

    .line 13
    iput v1, p0, Lg1/d;->c:I

    const/high16 v1, 0x3f800000    # 1.0f

    .line 14
    iput v1, p0, Lg1/d;->d:F

    .line 15
    iput v0, p0, Lg1/d;->e:I

    const/4 v1, 0x0

    .line 16
    iput-object v1, p0, Lg1/d;->f:Ljava/lang/String;

    .line 17
    iput-boolean v0, p0, Lg1/d;->h:Z

    .line 18
    iput-object p1, p0, Lg1/d;->g:Ljava/lang/Object;

    return-void
.end method

.method public static b(I)Lg1/d;
    .locals 2

    new-instance v0, Lg1/d;

    sget-object v1, Lg1/d;->i:Ljava/lang/Object;

    invoke-direct {v0, v1}, Lg1/d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p0}, Lg1/d;->i(I)Lg1/d;

    return-object v0
.end method

.method public static c(Ljava/lang/Object;)Lg1/d;
    .locals 2

    new-instance v0, Lg1/d;

    sget-object v1, Lg1/d;->i:Ljava/lang/Object;

    invoke-direct {v0, v1}, Lg1/d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p0}, Lg1/d;->j(Ljava/lang/Object;)Lg1/d;

    return-object v0
.end method

.method public static d()Lg1/d;
    .locals 2

    new-instance v0, Lg1/d;

    sget-object v1, Lg1/d;->l:Ljava/lang/Object;

    invoke-direct {v0, v1}, Lg1/d;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static e(Ljava/lang/Object;F)Lg1/d;
    .locals 2

    new-instance v0, Lg1/d;

    sget-object v1, Lg1/d;->m:Ljava/lang/Object;

    invoke-direct {v0, v1}, Lg1/d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p0, p1}, Lg1/d;->p(Ljava/lang/Object;F)Lg1/d;

    return-object v0
.end method

.method public static f(Ljava/lang/String;)Lg1/d;
    .locals 2

    new-instance v0, Lg1/d;

    sget-object v1, Lg1/d;->n:Ljava/lang/Object;

    invoke-direct {v0, v1}, Lg1/d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p0}, Lg1/d;->q(Ljava/lang/String;)Lg1/d;

    return-object v0
.end method

.method public static g(Ljava/lang/Object;)Lg1/d;
    .locals 1

    new-instance v0, Lg1/d;

    invoke-direct {v0}, Lg1/d;-><init>()V

    invoke-virtual {v0, p0}, Lg1/d;->s(Ljava/lang/Object;)Lg1/d;

    return-object v0
.end method

.method public static h()Lg1/d;
    .locals 2

    new-instance v0, Lg1/d;

    sget-object v1, Lg1/d;->j:Ljava/lang/Object;

    invoke-direct {v0, v1}, Lg1/d;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public a(Lg1/g;Lj1/e;I)V
    .locals 3

    iget-object p1, p0, Lg1/d;->f:Ljava/lang/String;

    if-eqz p1, :cond_0

    invoke-virtual {p2, p1}, Lj1/e;->r0(Ljava/lang/String;)V

    :cond_0
    const p1, 0x7fffffff

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez p3, :cond_8

    iget-boolean p3, p0, Lg1/d;->h:Z

    if-eqz p3, :cond_3

    sget-object p1, Lj1/e$b;->MATCH_CONSTRAINT:Lj1/e$b;

    invoke-virtual {p2, p1}, Lj1/e;->D0(Lj1/e$b;)V

    iget-object p1, p0, Lg1/d;->g:Ljava/lang/Object;

    sget-object p3, Lg1/d;->j:Ljava/lang/Object;

    if-ne p1, p3, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    sget-object p3, Lg1/d;->m:Ljava/lang/Object;

    if-ne p1, p3, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    iget p1, p0, Lg1/d;->b:I

    iget p3, p0, Lg1/d;->c:I

    iget v1, p0, Lg1/d;->d:F

    invoke-virtual {p2, v0, p1, p3, v1}, Lj1/e;->E0(IIIF)V

    goto/16 :goto_2

    :cond_3
    iget p3, p0, Lg1/d;->b:I

    if-lez p3, :cond_4

    invoke-virtual {p2, p3}, Lj1/e;->L0(I)V

    :cond_4
    iget p3, p0, Lg1/d;->c:I

    if-ge p3, p1, :cond_5

    invoke-virtual {p2, p3}, Lj1/e;->I0(I)V

    :cond_5
    iget-object p1, p0, Lg1/d;->g:Ljava/lang/Object;

    sget-object p3, Lg1/d;->j:Ljava/lang/Object;

    if-ne p1, p3, :cond_6

    sget-object p1, Lj1/e$b;->WRAP_CONTENT:Lj1/e$b;

    invoke-virtual {p2, p1}, Lj1/e;->D0(Lj1/e$b;)V

    goto/16 :goto_2

    :cond_6
    sget-object p3, Lg1/d;->l:Ljava/lang/Object;

    if-ne p1, p3, :cond_7

    sget-object p1, Lj1/e$b;->MATCH_PARENT:Lj1/e$b;

    invoke-virtual {p2, p1}, Lj1/e;->D0(Lj1/e$b;)V

    goto :goto_2

    :cond_7
    if-nez p1, :cond_10

    sget-object p1, Lj1/e$b;->FIXED:Lj1/e$b;

    invoke-virtual {p2, p1}, Lj1/e;->D0(Lj1/e$b;)V

    iget p1, p0, Lg1/d;->e:I

    invoke-virtual {p2, p1}, Lj1/e;->U0(I)V

    goto :goto_2

    :cond_8
    iget-boolean p3, p0, Lg1/d;->h:Z

    if-eqz p3, :cond_b

    sget-object p1, Lj1/e$b;->MATCH_CONSTRAINT:Lj1/e$b;

    invoke-virtual {p2, p1}, Lj1/e;->Q0(Lj1/e$b;)V

    iget-object p1, p0, Lg1/d;->g:Ljava/lang/Object;

    sget-object p3, Lg1/d;->j:Ljava/lang/Object;

    if-ne p1, p3, :cond_9

    move v0, v1

    goto :goto_1

    :cond_9
    sget-object p3, Lg1/d;->m:Ljava/lang/Object;

    if-ne p1, p3, :cond_a

    goto :goto_1

    :cond_a
    move v0, v2

    :goto_1
    iget p1, p0, Lg1/d;->b:I

    iget p3, p0, Lg1/d;->c:I

    iget v1, p0, Lg1/d;->d:F

    invoke-virtual {p2, v0, p1, p3, v1}, Lj1/e;->R0(IIIF)V

    goto :goto_2

    :cond_b
    iget p3, p0, Lg1/d;->b:I

    if-lez p3, :cond_c

    invoke-virtual {p2, p3}, Lj1/e;->K0(I)V

    :cond_c
    iget p3, p0, Lg1/d;->c:I

    if-ge p3, p1, :cond_d

    invoke-virtual {p2, p3}, Lj1/e;->H0(I)V

    :cond_d
    iget-object p1, p0, Lg1/d;->g:Ljava/lang/Object;

    sget-object p3, Lg1/d;->j:Ljava/lang/Object;

    if-ne p1, p3, :cond_e

    sget-object p1, Lj1/e$b;->WRAP_CONTENT:Lj1/e$b;

    invoke-virtual {p2, p1}, Lj1/e;->Q0(Lj1/e$b;)V

    goto :goto_2

    :cond_e
    sget-object p3, Lg1/d;->l:Ljava/lang/Object;

    if-ne p1, p3, :cond_f

    sget-object p1, Lj1/e$b;->MATCH_PARENT:Lj1/e$b;

    invoke-virtual {p2, p1}, Lj1/e;->Q0(Lj1/e$b;)V

    goto :goto_2

    :cond_f
    if-nez p1, :cond_10

    sget-object p1, Lj1/e$b;->FIXED:Lj1/e$b;

    invoke-virtual {p2, p1}, Lj1/e;->Q0(Lj1/e$b;)V

    iget p1, p0, Lg1/d;->e:I

    invoke-virtual {p2, p1}, Lj1/e;->z0(I)V

    :cond_10
    :goto_2
    return-void
.end method

.method public i(I)Lg1/d;
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lg1/d;->g:Ljava/lang/Object;

    iput p1, p0, Lg1/d;->e:I

    return-object p0
.end method

.method public j(Ljava/lang/Object;)Lg1/d;
    .locals 1

    iput-object p1, p0, Lg1/d;->g:Ljava/lang/Object;

    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lg1/d;->e:I

    const/4 p1, 0x0

    iput-object p1, p0, Lg1/d;->g:Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method k()I
    .locals 1

    iget v0, p0, Lg1/d;->e:I

    return v0
.end method

.method public l(I)Lg1/d;
    .locals 1

    iget v0, p0, Lg1/d;->c:I

    if-ltz v0, :cond_0

    iput p1, p0, Lg1/d;->c:I

    :cond_0
    return-object p0
.end method

.method public m(Ljava/lang/Object;)Lg1/d;
    .locals 1

    sget-object v0, Lg1/d;->j:Ljava/lang/Object;

    if-ne p1, v0, :cond_0

    iget-boolean p1, p0, Lg1/d;->h:Z

    if-eqz p1, :cond_0

    iput-object v0, p0, Lg1/d;->g:Ljava/lang/Object;

    const p1, 0x7fffffff

    iput p1, p0, Lg1/d;->c:I

    :cond_0
    return-object p0
.end method

.method public n(I)Lg1/d;
    .locals 0

    if-ltz p1, :cond_0

    iput p1, p0, Lg1/d;->b:I

    :cond_0
    return-object p0
.end method

.method public o(Ljava/lang/Object;)Lg1/d;
    .locals 1

    sget-object v0, Lg1/d;->j:Ljava/lang/Object;

    if-ne p1, v0, :cond_0

    const/4 p1, -0x2

    iput p1, p0, Lg1/d;->b:I

    :cond_0
    return-object p0
.end method

.method public p(Ljava/lang/Object;F)Lg1/d;
    .locals 0

    iput p2, p0, Lg1/d;->d:F

    return-object p0
.end method

.method public q(Ljava/lang/String;)Lg1/d;
    .locals 0

    iput-object p1, p0, Lg1/d;->f:Ljava/lang/String;

    return-object p0
.end method

.method public r(I)Lg1/d;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg1/d;->h:Z

    if-ltz p1, :cond_0

    iput p1, p0, Lg1/d;->c:I

    :cond_0
    return-object p0
.end method

.method public s(Ljava/lang/Object;)Lg1/d;
    .locals 0

    iput-object p1, p0, Lg1/d;->g:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lg1/d;->h:Z

    return-object p0
.end method
