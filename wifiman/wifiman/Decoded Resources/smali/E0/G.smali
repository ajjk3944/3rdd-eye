.class public final LE0/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/k;
.implements LC0/N;
.implements LE0/n0;
.implements LC0/v;
.implements LE0/g;
.implements LE0/m0$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE0/G$d;,
        LE0/G$e;,
        LE0/G$f;,
        LE0/G$g;,
        LE0/G$h;
    }
.end annotation


# static fields
.field public static final X:LE0/G$d;

.field public static final Y:I

.field private static final Z:LE0/G$f;

.field private static final f1:Lmh/a;

.field private static final g1:Landroidx/compose/ui/platform/w1;

.field private static final h1:Ljava/util/Comparator;


# instance fields
.field private final A:LE0/a0;

.field private final B:LE0/L;

.field private C:Landroidx/compose/ui/layout/h;

.field private D:LE0/c0;

.field private E:Z

.field private F:Landroidx/compose/ui/e;

.field private G:Landroidx/compose/ui/e;

.field private H:Lmh/l;

.field private I:Lmh/l;

.field private J:Z

.field private N:Z

.field private final a:Z

.field private b:I

.field private c:I

.field private d:Z

.field private e:LE0/G;

.field private f:I

.field private final g:LE0/X;

.field private h:LV/b;

.field private i:Z

.field private j:LE0/G;

.field private k:LE0/m0;

.field private l:Landroidx/compose/ui/viewinterop/c;

.field private m:I

.field private n:Z

.field private o:LJ0/j;

.field private final p:LV/b;

.field private q:Z

.field private r:LC0/C;

.field private s:LE0/y;

.field private t:LY0/d;

.field private u:LY0/t;

.field private v:Landroidx/compose/ui/platform/w1;

.field private w:LT/x;

.field private x:LE0/G$g;

.field private y:LE0/G$g;

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LE0/G$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LE0/G$d;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LE0/G;->X:LE0/G$d;

    const/16 v0, 0x8

    sput v0, LE0/G;->Y:I

    new-instance v0, LE0/G$c;

    invoke-direct {v0}, LE0/G$c;-><init>()V

    sput-object v0, LE0/G;->Z:LE0/G$f;

    sget-object v0, LE0/G$a;->a:LE0/G$a;

    sput-object v0, LE0/G;->f1:Lmh/a;

    new-instance v0, LE0/G$b;

    invoke-direct {v0}, LE0/G$b;-><init>()V

    sput-object v0, LE0/G;->g1:Landroidx/compose/ui/platform/w1;

    new-instance v0, LE0/F;

    invoke-direct {v0}, LE0/F;-><init>()V

    sput-object v0, LE0/G;->h1:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(ZI)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, LE0/G;->a:Z

    .line 3
    iput p2, p0, LE0/G;->b:I

    .line 4
    new-instance p1, LE0/X;

    .line 5
    new-instance p2, LV/b;

    const/16 v0, 0x10

    new-array v1, v0, [LE0/G;

    const/4 v2, 0x0

    invoke-direct {p2, v1, v2}, LV/b;-><init>([Ljava/lang/Object;I)V

    .line 6
    new-instance v1, LE0/G$i;

    invoke-direct {v1, p0}, LE0/G$i;-><init>(LE0/G;)V

    invoke-direct {p1, p2, v1}, LE0/X;-><init>(LV/b;Lmh/a;)V

    iput-object p1, p0, LE0/G;->g:LE0/X;

    .line 7
    new-instance p1, LV/b;

    new-array p2, v0, [LE0/G;

    invoke-direct {p1, p2, v2}, LV/b;-><init>([Ljava/lang/Object;I)V

    .line 8
    iput-object p1, p0, LE0/G;->p:LV/b;

    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, LE0/G;->q:Z

    .line 10
    sget-object p2, LE0/G;->Z:LE0/G$f;

    iput-object p2, p0, LE0/G;->r:LC0/C;

    .line 11
    invoke-static {}, LE0/K;->a()LY0/d;

    move-result-object p2

    iput-object p2, p0, LE0/G;->t:LY0/d;

    .line 12
    sget-object p2, LY0/t;->Ltr:LY0/t;

    iput-object p2, p0, LE0/G;->u:LY0/t;

    .line 13
    sget-object p2, LE0/G;->g1:Landroidx/compose/ui/platform/w1;

    iput-object p2, p0, LE0/G;->v:Landroidx/compose/ui/platform/w1;

    .line 14
    sget-object p2, LT/x;->W:LT/x$a;

    invoke-virtual {p2}, LT/x$a;->a()LT/x;

    move-result-object p2

    iput-object p2, p0, LE0/G;->w:LT/x;

    .line 15
    sget-object p2, LE0/G$g;->NotUsed:LE0/G$g;

    iput-object p2, p0, LE0/G;->x:LE0/G$g;

    .line 16
    iput-object p2, p0, LE0/G;->y:LE0/G$g;

    .line 17
    new-instance p2, LE0/a0;

    invoke-direct {p2, p0}, LE0/a0;-><init>(LE0/G;)V

    iput-object p2, p0, LE0/G;->A:LE0/a0;

    .line 18
    new-instance p2, LE0/L;

    invoke-direct {p2, p0}, LE0/L;-><init>(LE0/G;)V

    iput-object p2, p0, LE0/G;->B:LE0/L;

    .line 19
    iput-boolean p1, p0, LE0/G;->E:Z

    .line 20
    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    iput-object p1, p0, LE0/G;->F:Landroidx/compose/ui/e;

    return-void
.end method

.method public synthetic constructor <init>(ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 21
    invoke-static {}, LJ0/m;->a()I

    move-result p2

    .line 22
    :cond_1
    invoke-direct {p0, p1, p2}, LE0/G;-><init>(ZI)V

    return-void
.end method

.method public static synthetic A0(LE0/G;JLE0/u;ZZILjava/lang/Object;)V
    .locals 7

    and-int/lit8 p7, p6, 0x4

    const/4 v0, 0x1

    if-eqz p7, :cond_0

    move v5, v0

    goto :goto_0

    :cond_0
    move v5, p4

    :goto_0
    and-int/lit8 p4, p6, 0x8

    if-eqz p4, :cond_1

    move v6, v0

    goto :goto_1

    :cond_1
    move v6, p5

    :goto_1
    move-object v1, p0

    move-wide v2, p1

    move-object v4, p3

    invoke-virtual/range {v1 .. v6}, LE0/G;->z0(JLE0/u;ZZ)V

    return-void
.end method

.method private final C0()V
    .locals 9

    iget-object v0, p0, LE0/G;->A:LE0/a0;

    const/16 v1, 0x400

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v2

    const/16 v3, 0x800

    invoke-static {v3}, LE0/e0;->a(I)I

    move-result v4

    or-int/2addr v2, v4

    const/16 v4, 0x1000

    invoke-static {v4}, LE0/e0;->a(I)I

    move-result v5

    or-int/2addr v2, v5

    invoke-virtual {v0, v2}, LE0/a0;->p(I)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, LE0/G;->A:LE0/a0;

    invoke-virtual {v0}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_4

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v2

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->f2()I

    move-result v5

    and-int/2addr v2, v5

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v2, :cond_0

    move v2, v6

    goto :goto_1

    :cond_0
    move v2, v5

    :goto_1
    invoke-static {v3}, LE0/e0;->a(I)I

    move-result v7

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->f2()I

    move-result v8

    and-int/2addr v7, v8

    if-eqz v7, :cond_1

    move v7, v6

    goto :goto_2

    :cond_1
    move v7, v5

    :goto_2
    or-int/2addr v2, v7

    invoke-static {v4}, LE0/e0;->a(I)I

    move-result v7

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->f2()I

    move-result v8

    and-int/2addr v7, v8

    if-eqz v7, :cond_2

    move v5, v6

    :cond_2
    or-int/2addr v2, v5

    if-eqz v2, :cond_3

    invoke-static {v0}, LE0/f0;->a(Landroidx/compose/ui/e$c;)V

    :cond_3
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v0

    goto :goto_0

    :cond_4
    return-void
.end method

.method private final E1(LE0/G;)V
    .locals 2

    iget-object v0, p0, LE0/G;->e:LE0/G;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p1, p0, LE0/G;->e:LE0/G;

    if-eqz p1, :cond_0

    iget-object p1, p0, LE0/G;->B:LE0/L;

    invoke-virtual {p1}, LE0/L;->q()V

    invoke-virtual {p0}, LE0/G;->m0()LE0/c0;

    move-result-object p1

    invoke-virtual {p0}, LE0/G;->P()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->H2()LE0/c0;

    move-result-object v0

    :goto_0
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LE0/c0;->s2()V

    invoke-virtual {p1}, LE0/c0;->H2()LE0/c0;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LE0/G;->F0()V

    :cond_1
    return-void
.end method

.method private final J0()V
    .locals 1

    iget v0, p0, LE0/G;->f:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, LE0/G;->i:Z

    :cond_0
    iget-boolean v0, p0, LE0/G;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LE0/G;->j:LE0/G;

    if-eqz v0, :cond_1

    invoke-direct {v0}, LE0/G;->J0()V

    :cond_1
    return-void
.end method

.method private final Q()LE0/c0;
    .locals 4

    iget-boolean v0, p0, LE0/G;->E:Z

    if-eqz v0, :cond_3

    invoke-virtual {p0}, LE0/G;->P()LE0/c0;

    move-result-object v0

    invoke-virtual {p0}, LE0/G;->m0()LE0/c0;

    move-result-object v1

    invoke-virtual {v1}, LE0/c0;->I2()LE0/c0;

    move-result-object v1

    const/4 v2, 0x0

    iput-object v2, p0, LE0/G;->D:LE0/c0;

    :goto_0
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LE0/c0;->B2()LE0/l0;

    move-result-object v3

    goto :goto_1

    :cond_0
    move-object v3, v2

    :goto_1
    if-eqz v3, :cond_1

    iput-object v0, p0, LE0/G;->D:LE0/c0;

    goto :goto_2

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, LE0/c0;->I2()LE0/c0;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v2

    goto :goto_0

    :cond_3
    :goto_2
    iget-object v0, p0, LE0/G;->D:LE0/c0;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, LE0/c0;->B2()LE0/l0;

    move-result-object v1

    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    const-string v0, "layer was not set"

    invoke-static {v0}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :cond_5
    :goto_3
    return-object v0
.end method

.method public static synthetic Q0(LE0/G;LY0/b;ILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, LE0/G;->B:LE0/L;

    invoke-virtual {p1}, LE0/L;->z()LY0/b;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, LE0/G;->P0(LY0/b;)Z

    move-result p0

    return p0
.end method

.method private final f1(LE0/G;)V
    .locals 4

    iget-object v0, p1, LE0/G;->B:LE0/L;

    invoke-virtual {v0}, LE0/L;->s()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, LE0/G;->B:LE0/L;

    invoke-virtual {v0}, LE0/L;->s()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, LE0/L;->W(I)V

    :cond_0
    iget-object v0, p0, LE0/G;->k:LE0/m0;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LE0/G;->z()V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p1, LE0/G;->j:LE0/G;

    invoke-virtual {p1}, LE0/G;->m0()LE0/c0;

    move-result-object v1

    invoke-virtual {v1, v0}, LE0/c0;->n3(LE0/c0;)V

    iget-boolean v1, p1, LE0/G;->a:Z

    if-eqz v1, :cond_3

    iget v1, p0, LE0/G;->f:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, LE0/G;->f:I

    iget-object p1, p1, LE0/G;->g:LE0/X;

    invoke-virtual {p1}, LE0/X;->f()LV/b;

    move-result-object p1

    invoke-virtual {p1}, LV/b;->o()I

    move-result v1

    if-lez v1, :cond_3

    invoke-virtual {p1}, LV/b;->m()[Ljava/lang/Object;

    move-result-object p1

    const/4 v2, 0x0

    :cond_2
    aget-object v3, p1, v2

    check-cast v3, LE0/G;

    invoke-virtual {v3}, LE0/G;->m0()LE0/c0;

    move-result-object v3

    invoke-virtual {v3, v0}, LE0/c0;->n3(LE0/c0;)V

    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_2

    :cond_3
    invoke-direct {p0}, LE0/G;->J0()V

    invoke-virtual {p0}, LE0/G;->h1()V

    return-void
.end method

.method private final g1()V
    .locals 1

    invoke-virtual {p0}, LE0/G;->F0()V

    invoke-virtual {p0}, LE0/G;->o0()LE0/G;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LE0/G;->D0()V

    :cond_0
    invoke-virtual {p0}, LE0/G;->E0()V

    return-void
.end method

.method private final j1()V
    .locals 6

    iget-boolean v0, p0, LE0/G;->i:Z

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    iput-boolean v0, p0, LE0/G;->i:Z

    iget-object v1, p0, LE0/G;->h:LV/b;

    if-nez v1, :cond_0

    new-instance v1, LV/b;

    const/16 v2, 0x10

    new-array v2, v2, [LE0/G;

    invoke-direct {v1, v2, v0}, LV/b;-><init>([Ljava/lang/Object;I)V

    iput-object v1, p0, LE0/G;->h:LV/b;

    :cond_0
    invoke-virtual {v1}, LV/b;->h()V

    iget-object v2, p0, LE0/G;->g:LE0/X;

    invoke-virtual {v2}, LE0/X;->f()LV/b;

    move-result-object v2

    invoke-virtual {v2}, LV/b;->o()I

    move-result v3

    if-lez v3, :cond_3

    invoke-virtual {v2}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v2

    :cond_1
    aget-object v4, v2, v0

    check-cast v4, LE0/G;

    iget-boolean v5, v4, LE0/G;->a:Z

    if-eqz v5, :cond_2

    invoke-virtual {v4}, LE0/G;->w0()LV/b;

    move-result-object v4

    invoke-virtual {v1}, LV/b;->o()I

    move-result v5

    invoke-virtual {v1, v5, v4}, LV/b;->c(ILV/b;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v1, v4}, LV/b;->b(Ljava/lang/Object;)Z

    :goto_0
    add-int/lit8 v0, v0, 0x1

    if-lt v0, v3, :cond_1

    :cond_3
    iget-object v0, p0, LE0/G;->B:LE0/L;

    invoke-virtual {v0}, LE0/L;->N()V

    :cond_4
    return-void
.end method

.method private final l0()LE0/y;
    .locals 2

    iget-object v0, p0, LE0/G;->s:LE0/y;

    if-nez v0, :cond_0

    new-instance v0, LE0/y;

    invoke-virtual {p0}, LE0/G;->e0()LC0/C;

    move-result-object v1

    invoke-direct {v0, p0, v1}, LE0/y;-><init>(LE0/G;LC0/C;)V

    iput-object v0, p0, LE0/G;->s:LE0/y;

    :cond_0
    return-object v0
.end method

.method public static synthetic l1(LE0/G;LY0/b;ILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, LE0/G;->B:LE0/L;

    invoke-virtual {p1}, LE0/L;->y()LY0/b;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, LE0/G;->k1(LY0/b;)Z

    move-result p0

    return p0
.end method

.method public static synthetic m(LE0/G;LE0/G;)I
    .locals 0

    invoke-static {p0, p1}, LE0/G;->n(LE0/G;LE0/G;)I

    move-result p0

    return p0
.end method

.method private static final n(LE0/G;LE0/G;)I
    .locals 2

    invoke-direct {p0}, LE0/G;->u0()F

    move-result v0

    invoke-direct {p1}, LE0/G;->u0()F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    invoke-virtual {p0}, LE0/G;->p0()I

    move-result p0

    invoke-virtual {p1}, LE0/G;->p0()I

    move-result p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->k(II)I

    move-result p0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, LE0/G;->u0()F

    move-result p0

    invoke-direct {p1}, LE0/G;->u0()F

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p0

    :goto_0
    return p0
.end method

.method public static final synthetic o()Lmh/a;
    .locals 1

    sget-object v0, LE0/G;->f1:Lmh/a;

    return-object v0
.end method

.method public static synthetic q1(LE0/G;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, LE0/G;->p1(Z)V

    return-void
.end method

.method public static final synthetic r()Ljava/util/Comparator;
    .locals 1

    sget-object v0, LE0/G;->h1:Ljava/util/Comparator;

    return-object v0
.end method

.method public static final synthetic s(LE0/G;Z)V
    .locals 0

    iput-boolean p1, p0, LE0/G;->n:Z

    return-void
.end method

.method public static synthetic s1(LE0/G;ZZZILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x1

    if-eqz p5, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move p3, v0

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, LE0/G;->r1(ZZZ)V

    return-void
.end method

.method private final t(Landroidx/compose/ui/e;)V
    .locals 1

    iput-object p1, p0, LE0/G;->F:Landroidx/compose/ui/e;

    iget-object v0, p0, LE0/G;->A:LE0/a0;

    invoke-virtual {v0, p1}, LE0/a0;->E(Landroidx/compose/ui/e;)V

    iget-object p1, p0, LE0/G;->B:LE0/L;

    invoke-virtual {p1}, LE0/L;->c0()V

    iget-object p1, p0, LE0/G;->e:LE0/G;

    if-nez p1, :cond_0

    iget-object p1, p0, LE0/G;->A:LE0/a0;

    const/16 v0, 0x200

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    invoke-virtual {p1, v0}, LE0/a0;->q(I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0, p0}, LE0/G;->E1(LE0/G;)V

    :cond_0
    return-void
.end method

.method private final u0()F
    .locals 1

    invoke-virtual {p0}, LE0/G;->c0()LE0/L$b;

    move-result-object v0

    invoke-virtual {v0}, LE0/L$b;->B1()F

    move-result v0

    return v0
.end method

.method public static synthetic u1(LE0/G;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, LE0/G;->t1(Z)V

    return-void
.end method

.method private final w()V
    .locals 6

    iget-object v0, p0, LE0/G;->x:LE0/G$g;

    iput-object v0, p0, LE0/G;->y:LE0/G$g;

    sget-object v0, LE0/G$g;->NotUsed:LE0/G$g;

    iput-object v0, p0, LE0/G;->x:LE0/G$g;

    invoke-virtual {p0}, LE0/G;->w0()LV/b;

    move-result-object v0

    invoke-virtual {v0}, LV/b;->o()I

    move-result v1

    if-lez v1, :cond_2

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    :cond_0
    aget-object v3, v0, v2

    check-cast v3, LE0/G;

    iget-object v4, v3, LE0/G;->x:LE0/G$g;

    sget-object v5, LE0/G$g;->InLayoutBlock:LE0/G$g;

    if-ne v4, v5, :cond_1

    invoke-direct {v3}, LE0/G;->w()V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_0

    :cond_2
    return-void
.end method

.method public static synthetic w1(LE0/G;ZZZILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x1

    if-eqz p5, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move p3, v0

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, LE0/G;->v1(ZZZ)V

    return-void
.end method

.method private final x(I)Ljava/lang/String;
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, p1, :cond_0

    const-string v3, "  "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const-string v2, "|-"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LE0/G;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0xa

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LE0/G;->w0()LV/b;

    move-result-object v2

    invoke-virtual {v2}, LV/b;->o()I

    move-result v3

    if-lez v3, :cond_2

    invoke-virtual {v2}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v2

    move v4, v1

    :cond_1
    aget-object v5, v2, v4

    check-cast v5, LE0/G;

    add-int/lit8 v6, p1, 0x1

    invoke-direct {v5, v6}, LE0/G;->x(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    if-lt v4, v3, :cond_1

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez p1, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string p1, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    return-object v0
.end method

.method static synthetic y(LE0/G;IILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, LE0/G;->x(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y0(LE0/G;JLE0/u;ZZILjava/lang/Object;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    const/4 p4, 0x0

    :cond_0
    move v4, p4

    and-int/lit8 p4, p6, 0x8

    if-eqz p4, :cond_1

    const/4 p5, 0x1

    :cond_1
    move v5, p5

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, LE0/G;->x0(JLE0/u;ZZ)V

    return-void
.end method

.method private final y1()V
    .locals 1

    iget-object v0, p0, LE0/G;->A:LE0/a0;

    invoke-virtual {v0}, LE0/a0;->x()V

    return-void
.end method


# virtual methods
.method public final A()V
    .locals 11

    invoke-virtual {p0}, LE0/G;->W()LE0/G$e;

    move-result-object v0

    sget-object v1, LE0/G$e;->Idle:LE0/G$e;

    if-ne v0, v1, :cond_a

    invoke-virtual {p0}, LE0/G;->V()Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {p0}, LE0/G;->d0()Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {p0}, LE0/G;->L0()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-virtual {p0}, LE0/G;->q()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, LE0/G;->A:LE0/a0;

    const/16 v1, 0x100

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v2

    invoke-static {v0}, LE0/a0;->c(LE0/a0;)I

    move-result v3

    and-int/2addr v3, v2

    if-eqz v3, :cond_a

    invoke-virtual {v0}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_a

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->f2()I

    move-result v3

    and-int/2addr v3, v2

    if-eqz v3, :cond_9

    const/4 v3, 0x0

    move-object v4, v0

    move-object v5, v3

    :goto_1
    if-eqz v4, :cond_9

    instance-of v6, v4, LE0/t;

    if-eqz v6, :cond_2

    check-cast v4, LE0/t;

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v6

    invoke-static {v4, v6}, LE0/k;->h(LE0/j;I)LE0/c0;

    move-result-object v6

    invoke-interface {v4, v6}, LE0/t;->B(LC0/r;)V

    goto :goto_4

    :cond_2
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->f2()I

    move-result v6

    and-int/2addr v6, v2

    if-eqz v6, :cond_8

    instance-of v6, v4, LE0/m;

    if-eqz v6, :cond_8

    move-object v6, v4

    check-cast v6, LE0/m;

    invoke-virtual {v6}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v6

    const/4 v7, 0x0

    move v8, v7

    :goto_2
    const/4 v9, 0x1

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->f2()I

    move-result v10

    and-int/2addr v10, v2

    if-eqz v10, :cond_6

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v9, :cond_3

    move-object v4, v6

    goto :goto_3

    :cond_3
    if-nez v5, :cond_4

    new-instance v5, LV/b;

    const/16 v9, 0x10

    new-array v9, v9, [Landroidx/compose/ui/e$c;

    invoke-direct {v5, v9, v7}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_4
    if-eqz v4, :cond_5

    invoke-virtual {v5, v4}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v4, v3

    :cond_5
    invoke-virtual {v5, v6}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_6
    :goto_3
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v6

    goto :goto_2

    :cond_7
    if-ne v8, v9, :cond_8

    goto :goto_1

    :cond_8
    :goto_4
    invoke-static {v5}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v4

    goto :goto_1

    :cond_9
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->a2()I

    move-result v3

    and-int/2addr v3, v2

    if-eqz v3, :cond_a

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v0

    goto :goto_0

    :cond_a
    :goto_5
    return-void
.end method

.method public final A1(Z)V
    .locals 0

    iput-boolean p1, p0, LE0/G;->z:Z

    return-void
.end method

.method public final B(Lm0/n0;Lp0/c;)V
    .locals 1

    invoke-virtual {p0}, LE0/G;->m0()LE0/c0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LE0/c0;->p2(Lm0/n0;Lp0/c;)V

    return-void
.end method

.method public final B0(ILE0/G;)V
    .locals 7

    iget-object v0, p2, LE0/G;->j:LE0/G;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v3, " Other tree: "

    const-string v4, "Cannot insert "

    const/4 v5, 0x0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " because it already has a parent. This tree: "

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0, v1, v2, v5}, LE0/G;->y(LE0/G;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p2, LE0/G;->j:LE0/G;

    if-eqz v6, :cond_1

    invoke-static {v6, v1, v2, v5}, LE0/G;->y(LE0/G;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :cond_1
    move-object v6, v5

    :goto_1
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_2
    iget-object v0, p2, LE0/G;->k:LE0/m0;

    if-nez v0, :cond_3

    move v0, v2

    goto :goto_2

    :cond_3
    move v0, v1

    :goto_2
    if-nez v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " because it already has an owner. This tree: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0, v1, v2, v5}, LE0/G;->y(LE0/G;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2, v1, v2, v5}, LE0/G;->y(LE0/G;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_4
    iput-object p0, p2, LE0/G;->j:LE0/G;

    iget-object v0, p0, LE0/G;->g:LE0/X;

    invoke-virtual {v0, p1, p2}, LE0/X;->a(ILjava/lang/Object;)V

    invoke-virtual {p0}, LE0/G;->h1()V

    iget-boolean p1, p2, LE0/G;->a:Z

    if-eqz p1, :cond_5

    iget p1, p0, LE0/G;->f:I

    add-int/2addr p1, v2

    iput p1, p0, LE0/G;->f:I

    :cond_5
    invoke-direct {p0}, LE0/G;->J0()V

    iget-object p1, p0, LE0/G;->k:LE0/m0;

    if-eqz p1, :cond_6

    invoke-virtual {p2, p1}, LE0/G;->u(LE0/m0;)V

    :cond_6
    iget-object p1, p2, LE0/G;->B:LE0/L;

    invoke-virtual {p1}, LE0/L;->s()I

    move-result p1

    if-lez p1, :cond_7

    iget-object p1, p0, LE0/G;->B:LE0/L;

    invoke-virtual {p1}, LE0/L;->s()I

    move-result p2

    add-int/2addr p2, v2

    invoke-virtual {p1, p2}, LE0/L;->W(I)V

    :cond_7
    return-void
.end method

.method public final B1(Z)V
    .locals 0

    iput-boolean p1, p0, LE0/G;->E:Z

    return-void
.end method

.method public final C()Z
    .locals 3

    iget-object v0, p0, LE0/G;->B:LE0/L;

    invoke-virtual {v0}, LE0/L;->r()LE0/b;

    move-result-object v1

    invoke-interface {v1}, LE0/b;->p()LE0/a;

    move-result-object v1

    invoke-virtual {v1}, LE0/a;->k()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    invoke-virtual {v0}, LE0/L;->C()LE0/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LE0/b;->p()LE0/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LE0/a;->k()Z

    move-result v0

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    return v2
.end method

.method public final C1(Landroidx/compose/ui/viewinterop/c;)V
    .locals 0

    iput-object p1, p0, LE0/G;->l:Landroidx/compose/ui/viewinterop/c;

    return-void
.end method

.method public final D()Z
    .locals 1

    iget-object v0, p0, LE0/G;->G:Landroidx/compose/ui/e;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final D0()V
    .locals 1

    invoke-direct {p0}, LE0/G;->Q()LE0/c0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LE0/c0;->R2()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LE0/G;->o0()LE0/G;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LE0/G;->D0()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final D1(LE0/G$g;)V
    .locals 0

    iput-object p1, p0, LE0/G;->x:LE0/G$g;

    return-void
.end method

.method public final E()Z
    .locals 1

    iget-boolean v0, p0, LE0/G;->z:Z

    return v0
.end method

.method public final E0()V
    .locals 3

    invoke-virtual {p0}, LE0/G;->m0()LE0/c0;

    move-result-object v0

    invoke-virtual {p0}, LE0/G;->P()LE0/c0;

    move-result-object v1

    :goto_0
    if-eq v0, v1, :cond_1

    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LE0/C;

    invoke-virtual {v0}, LE0/c0;->B2()LE0/l0;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, LE0/l0;->invalidate()V

    :cond_0
    invoke-virtual {v0}, LE0/c0;->H2()LE0/c0;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LE0/G;->P()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->B2()LE0/l0;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, LE0/l0;->invalidate()V

    :cond_2
    return-void
.end method

.method public final F()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, LE0/G;->Z()LE0/L$a;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, LE0/L$a;->Y0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final F0()V
    .locals 13

    iget-object v0, p0, LE0/G;->e:LE0/G;

    if-eqz v0, :cond_0

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, LE0/G;->s1(LE0/G;ZZZILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 v11, 0x7

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v7, p0

    invoke-static/range {v7 .. v12}, LE0/G;->w1(LE0/G;ZZZILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final F1(Z)V
    .locals 0

    iput-boolean p1, p0, LE0/G;->J:Z

    return-void
.end method

.method public final G()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, LE0/G;->c0()LE0/L$b;

    move-result-object v0

    invoke-virtual {v0}, LE0/L$b;->h1()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final G0()V
    .locals 1

    invoke-virtual {p0}, LE0/G;->V()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, LE0/G;->d0()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, LE0/G;->J:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, LE0/K;->b(LE0/G;)LE0/m0;

    move-result-object v0

    invoke-interface {v0, p0}, LE0/m0;->c(LE0/G;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final G1(Lmh/l;)V
    .locals 0

    iput-object p1, p0, LE0/G;->H:Lmh/l;

    return-void
.end method

.method public final H()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, LE0/G;->w0()LV/b;

    move-result-object v0

    invoke-virtual {v0}, LV/b;->g()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final H0()V
    .locals 1

    iget-object v0, p0, LE0/G;->B:LE0/L;

    invoke-virtual {v0}, LE0/L;->M()V

    return-void
.end method

.method public final H1(Lmh/l;)V
    .locals 0

    iput-object p1, p0, LE0/G;->I:Lmh/l;

    return-void
.end method

.method public final I()LJ0/j;
    .locals 3

    invoke-virtual {p0}, LE0/G;->K0()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, LE0/G;->L0()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, LE0/G;->A:LE0/a0;

    const/16 v1, 0x8

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v1

    invoke-virtual {v0, v1}, LE0/a0;->q(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LE0/G;->o:LJ0/j;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Lkotlin/jvm/internal/N;

    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v1, LJ0/j;

    invoke-direct {v1}, LJ0/j;-><init>()V

    iput-object v1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {p0}, LE0/K;->b(LE0/G;)LE0/m0;

    move-result-object v1

    invoke-interface {v1}, LE0/m0;->getSnapshotObserver()LE0/o0;

    move-result-object v1

    new-instance v2, LE0/G$j;

    invoke-direct {v2, p0, v0}, LE0/G$j;-><init>(LE0/G;Lkotlin/jvm/internal/N;)V

    invoke-virtual {v1, p0, v2}, LE0/o0;->j(LE0/G;Lmh/a;)V

    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, LJ0/j;

    iput-object v1, p0, LE0/G;->o:LJ0/j;

    check-cast v0, LJ0/j;

    return-object v0

    :cond_2
    :goto_0
    iget-object v0, p0, LE0/G;->o:LJ0/j;

    return-object v0

    :cond_3
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final I0()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LE0/G;->o:LJ0/j;

    invoke-static {p0}, LE0/K;->b(LE0/G;)LE0/m0;

    move-result-object v0

    invoke-interface {v0}, LE0/m0;->z()V

    return-void
.end method

.method public I1(I)V
    .locals 0

    iput p1, p0, LE0/G;->b:I

    return-void
.end method

.method public J()LT/x;
    .locals 1

    iget-object v0, p0, LE0/G;->w:LT/x;

    return-object v0
.end method

.method public final J1(Landroidx/compose/ui/layout/h;)V
    .locals 0

    iput-object p1, p0, LE0/G;->C:Landroidx/compose/ui/layout/h;

    return-void
.end method

.method public K()LY0/d;
    .locals 1

    iget-object v0, p0, LE0/G;->t:LY0/d;

    return-object v0
.end method

.method public K0()Z
    .locals 1

    iget-object v0, p0, LE0/G;->k:LE0/m0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final K1(Z)V
    .locals 0

    iput-boolean p1, p0, LE0/G;->d:Z

    return-void
.end method

.method public final L()I
    .locals 1

    iget v0, p0, LE0/G;->m:I

    return v0
.end method

.method public L0()Z
    .locals 1

    iget-boolean v0, p0, LE0/G;->N:Z

    return v0
.end method

.method public final L1()V
    .locals 1

    iget v0, p0, LE0/G;->f:I

    if-lez v0, :cond_0

    invoke-direct {p0}, LE0/G;->j1()V

    :cond_0
    return-void
.end method

.method public final M()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LE0/G;->g:LE0/X;

    invoke-virtual {v0}, LE0/X;->b()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final M0()Z
    .locals 1

    invoke-virtual {p0}, LE0/G;->c0()LE0/L$b;

    move-result-object v0

    invoke-virtual {v0}, LE0/L$b;->L1()Z

    move-result v0

    return v0
.end method

.method public final N()Z
    .locals 3

    invoke-virtual {p0}, LE0/G;->P()LE0/c0;

    move-result-object v0

    invoke-virtual {v0}, LE0/c0;->A2()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/b;->j(J)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v0, v1}, LY0/b;->i(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final N0()Ljava/lang/Boolean;
    .locals 1

    invoke-virtual {p0}, LE0/G;->Z()LE0/L$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LE0/L$a;->q()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public O()I
    .locals 1

    iget-object v0, p0, LE0/G;->B:LE0/L;

    invoke-virtual {v0}, LE0/L;->x()I

    move-result v0

    return v0
.end method

.method public final O0()Z
    .locals 1

    iget-boolean v0, p0, LE0/G;->d:Z

    return v0
.end method

.method public final P()LE0/c0;
    .locals 1

    iget-object v0, p0, LE0/G;->A:LE0/a0;

    invoke-virtual {v0}, LE0/a0;->l()LE0/w;

    move-result-object v0

    return-object v0
.end method

.method public final P0(LY0/b;)Z
    .locals 3

    if-eqz p1, :cond_0

    iget-object v0, p0, LE0/G;->e:LE0/G;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LE0/G;->Z()LE0/L$a;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, LY0/b;->r()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LE0/L$a;->S1(J)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public R()Landroid/view/View;
    .locals 1

    iget-object v0, p0, LE0/G;->l:Landroidx/compose/ui/viewinterop/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/viewinterop/c;->getInteropView()Landroid/view/View;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final R0()V
    .locals 2

    iget-object v0, p0, LE0/G;->x:LE0/G$g;

    sget-object v1, LE0/G$g;->NotUsed:LE0/G$g;

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, LE0/G;->w()V

    :cond_0
    invoke-virtual {p0}, LE0/G;->Z()LE0/L$a;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, LE0/L$a;->U1()V

    return-void
.end method

.method public final S()Landroidx/compose/ui/viewinterop/c;
    .locals 1

    iget-object v0, p0, LE0/G;->l:Landroidx/compose/ui/viewinterop/c;

    return-object v0
.end method

.method public final S0()V
    .locals 1

    iget-object v0, p0, LE0/G;->B:LE0/L;

    invoke-virtual {v0}, LE0/L;->O()V

    return-void
.end method

.method public final T()LE0/G$g;
    .locals 1

    iget-object v0, p0, LE0/G;->x:LE0/G$g;

    return-object v0
.end method

.method public final T0()V
    .locals 1

    iget-object v0, p0, LE0/G;->B:LE0/L;

    invoke-virtual {v0}, LE0/L;->P()V

    return-void
.end method

.method public final U()LE0/L;
    .locals 1

    iget-object v0, p0, LE0/G;->B:LE0/L;

    return-object v0
.end method

.method public final U0()V
    .locals 1

    iget-object v0, p0, LE0/G;->B:LE0/L;

    invoke-virtual {v0}, LE0/L;->Q()V

    return-void
.end method

.method public final V()Z
    .locals 1

    iget-object v0, p0, LE0/G;->B:LE0/L;

    invoke-virtual {v0}, LE0/L;->A()Z

    move-result v0

    return v0
.end method

.method public final V0()V
    .locals 1

    iget-object v0, p0, LE0/G;->B:LE0/L;

    invoke-virtual {v0}, LE0/L;->R()V

    return-void
.end method

.method public final W()LE0/G$e;
    .locals 1

    iget-object v0, p0, LE0/G;->B:LE0/L;

    invoke-virtual {v0}, LE0/L;->B()LE0/G$e;

    move-result-object v0

    return-object v0
.end method

.method public final W0(I)I
    .locals 1

    invoke-direct {p0}, LE0/G;->l0()LE0/y;

    move-result-object v0

    invoke-virtual {v0, p1}, LE0/y;->b(I)I

    move-result p1

    return p1
.end method

.method public final X()Z
    .locals 1

    iget-object v0, p0, LE0/G;->B:LE0/L;

    invoke-virtual {v0}, LE0/L;->F()Z

    move-result v0

    return v0
.end method

.method public final X0(I)I
    .locals 1

    invoke-direct {p0}, LE0/G;->l0()LE0/y;

    move-result-object v0

    invoke-virtual {v0, p1}, LE0/y;->c(I)I

    move-result p1

    return p1
.end method

.method public final Y()Z
    .locals 1

    iget-object v0, p0, LE0/G;->B:LE0/L;

    invoke-virtual {v0}, LE0/L;->G()Z

    move-result v0

    return v0
.end method

.method public final Y0(I)I
    .locals 1

    invoke-direct {p0}, LE0/G;->l0()LE0/y;

    move-result-object v0

    invoke-virtual {v0, p1}, LE0/y;->d(I)I

    move-result p1

    return p1
.end method

.method public final Z()LE0/L$a;
    .locals 1

    iget-object v0, p0, LE0/G;->B:LE0/L;

    invoke-virtual {v0}, LE0/L;->H()LE0/L$a;

    move-result-object v0

    return-object v0
.end method

.method public final Z0(I)I
    .locals 1

    invoke-direct {p0}, LE0/G;->l0()LE0/y;

    move-result-object v0

    invoke-virtual {v0, p1}, LE0/y;->e(I)I

    move-result p1

    return p1
.end method

.method public a(LY0/d;)V
    .locals 2

    iget-object v0, p0, LE0/G;->t:LY0/d;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iput-object p1, p0, LE0/G;->t:LY0/d;

    invoke-direct {p0}, LE0/G;->g1()V

    iget-object p1, p0, LE0/G;->A:LE0/a0;

    invoke-virtual {p1}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_2

    const/16 v0, 0x10

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->f2()I

    move-result v1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LE0/s0;

    invoke-interface {v0}, LE0/s0;->T0()V

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lj0/c;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lj0/c;

    invoke-interface {v0}, Lj0/c;->c0()V

    :cond_1
    :goto_1
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object p1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final a0()LE0/G;
    .locals 1

    iget-object v0, p0, LE0/G;->e:LE0/G;

    return-object v0
.end method

.method public final a1(I)I
    .locals 1

    invoke-direct {p0}, LE0/G;->l0()LE0/y;

    move-result-object v0

    invoke-virtual {v0, p1}, LE0/y;->f(I)I

    move-result p1

    return p1
.end method

.method public b(LY0/t;)V
    .locals 9

    iget-object v0, p0, LE0/G;->u:LY0/t;

    if-eq v0, p1, :cond_8

    iput-object p1, p0, LE0/G;->u:LY0/t;

    invoke-direct {p0}, LE0/G;->g1()V

    iget-object p1, p0, LE0/G;->A:LE0/a0;

    const/4 v0, 0x4

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    invoke-static {p1}, LE0/a0;->c(LE0/a0;)I

    move-result v1

    and-int/2addr v1, v0

    if-eqz v1, :cond_8

    invoke-virtual {p1}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_8

    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->f2()I

    move-result v1

    and-int/2addr v1, v0

    if-eqz v1, :cond_7

    const/4 v1, 0x0

    move-object v2, p1

    move-object v3, v1

    :goto_1
    if-eqz v2, :cond_7

    instance-of v4, v2, LE0/r;

    if-eqz v4, :cond_0

    check-cast v2, LE0/r;

    instance-of v4, v2, Lj0/c;

    if-eqz v4, :cond_6

    check-cast v2, Lj0/c;

    invoke-interface {v2}, Lj0/c;->c0()V

    goto :goto_4

    :cond_0
    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->f2()I

    move-result v4

    and-int/2addr v4, v0

    if-eqz v4, :cond_6

    instance-of v4, v2, LE0/m;

    if-eqz v4, :cond_6

    move-object v4, v2

    check-cast v4, LE0/m;

    invoke-virtual {v4}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v4

    const/4 v5, 0x0

    move v6, v5

    :goto_2
    const/4 v7, 0x1

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->f2()I

    move-result v8

    and-int/2addr v8, v0

    if-eqz v8, :cond_4

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v7, :cond_1

    move-object v2, v4

    goto :goto_3

    :cond_1
    if-nez v3, :cond_2

    new-instance v3, LV/b;

    const/16 v7, 0x10

    new-array v7, v7, [Landroidx/compose/ui/e$c;

    invoke-direct {v3, v7, v5}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {v3, v2}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v2, v1

    :cond_3
    invoke-virtual {v3, v4}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_4
    :goto_3
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v4

    goto :goto_2

    :cond_5
    if-ne v6, v7, :cond_6

    goto :goto_1

    :cond_6
    :goto_4
    invoke-static {v3}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v2

    goto :goto_1

    :cond_7
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->a2()I

    move-result v1

    and-int/2addr v1, v0

    if-eqz v1, :cond_8

    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object p1

    goto :goto_0

    :cond_8
    return-void
.end method

.method public final b0()LE0/I;
    .locals 1

    invoke-static {p0}, LE0/K;->b(LE0/G;)LE0/m0;

    move-result-object v0

    invoke-interface {v0}, LE0/m0;->getSharedDrawScope()LE0/I;

    move-result-object v0

    return-object v0
.end method

.method public final b1(I)I
    .locals 1

    invoke-direct {p0}, LE0/G;->l0()LE0/y;

    move-result-object v0

    invoke-virtual {v0, p1}, LE0/y;->g(I)I

    move-result p1

    return p1
.end method

.method public c()LC0/r;
    .locals 1

    invoke-virtual {p0}, LE0/G;->P()LE0/c0;

    move-result-object v0

    return-object v0
.end method

.method public final c0()LE0/L$b;
    .locals 1

    iget-object v0, p0, LE0/G;->B:LE0/L;

    invoke-virtual {v0}, LE0/L;->I()LE0/L$b;

    move-result-object v0

    return-object v0
.end method

.method public final c1(I)I
    .locals 1

    invoke-direct {p0}, LE0/G;->l0()LE0/y;

    move-result-object v0

    invoke-virtual {v0, p1}, LE0/y;->h(I)I

    move-result p1

    return p1
.end method

.method public d()V
    .locals 11

    invoke-virtual {p0}, LE0/G;->P()LE0/c0;

    move-result-object v0

    const/16 v1, 0x80

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v1

    invoke-static {v1}, LE0/f0;->i(I)Z

    move-result v2

    invoke-virtual {v0}, LE0/c0;->G2()Landroidx/compose/ui/e$c;

    move-result-object v3

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v3

    if-nez v3, :cond_1

    goto/16 :goto_6

    :cond_1
    :goto_0
    invoke-static {v0, v2}, LE0/c0;->f2(LE0/c0;Z)Landroidx/compose/ui/e$c;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_a

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->a2()I

    move-result v2

    and-int/2addr v2, v1

    if-eqz v2, :cond_a

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->f2()I

    move-result v2

    and-int/2addr v2, v1

    if-eqz v2, :cond_9

    const/4 v2, 0x0

    move-object v4, v0

    move-object v5, v2

    :goto_2
    if-eqz v4, :cond_9

    instance-of v6, v4, LE0/A;

    if-eqz v6, :cond_2

    check-cast v4, LE0/A;

    invoke-virtual {p0}, LE0/G;->P()LE0/c0;

    move-result-object v6

    invoke-interface {v4, v6}, LE0/A;->Y1(LC0/r;)V

    goto :goto_5

    :cond_2
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->f2()I

    move-result v6

    and-int/2addr v6, v1

    if-eqz v6, :cond_8

    instance-of v6, v4, LE0/m;

    if-eqz v6, :cond_8

    move-object v6, v4

    check-cast v6, LE0/m;

    invoke-virtual {v6}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v6

    const/4 v7, 0x0

    move v8, v7

    :goto_3
    const/4 v9, 0x1

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->f2()I

    move-result v10

    and-int/2addr v10, v1

    if-eqz v10, :cond_6

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v9, :cond_3

    move-object v4, v6

    goto :goto_4

    :cond_3
    if-nez v5, :cond_4

    new-instance v5, LV/b;

    const/16 v9, 0x10

    new-array v9, v9, [Landroidx/compose/ui/e$c;

    invoke-direct {v5, v9, v7}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_4
    if-eqz v4, :cond_5

    invoke-virtual {v5, v4}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v4, v2

    :cond_5
    invoke-virtual {v5, v6}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_6
    :goto_4
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v6

    goto :goto_3

    :cond_7
    if-ne v8, v9, :cond_8

    goto :goto_2

    :cond_8
    :goto_5
    invoke-static {v5}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v4

    goto :goto_2

    :cond_9
    if-eq v0, v3, :cond_a

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v0

    goto :goto_1

    :cond_a
    :goto_6
    return-void
.end method

.method public final d0()Z
    .locals 1

    iget-object v0, p0, LE0/G;->B:LE0/L;

    invoke-virtual {v0}, LE0/L;->J()Z

    move-result v0

    return v0
.end method

.method public final d1(I)I
    .locals 1

    invoke-direct {p0}, LE0/G;->l0()LE0/y;

    move-result-object v0

    invoke-virtual {v0, p1}, LE0/y;->i(I)I

    move-result p1

    return p1
.end method

.method public e(I)V
    .locals 0

    iput p1, p0, LE0/G;->c:I

    return-void
.end method

.method public e0()LC0/C;
    .locals 1

    iget-object v0, p0, LE0/G;->r:LC0/C;

    return-object v0
.end method

.method public final e1(III)V
    .locals 4

    if-ne p1, p2, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_3

    if-le p1, p2, :cond_1

    add-int v1, p1, v0

    goto :goto_1

    :cond_1
    move v1, p1

    :goto_1
    if-le p1, p2, :cond_2

    add-int v2, p2, v0

    goto :goto_2

    :cond_2
    add-int v2, p2, p3

    add-int/lit8 v2, v2, -0x2

    :goto_2
    iget-object v3, p0, LE0/G;->g:LE0/X;

    invoke-virtual {v3, v1}, LE0/X;->g(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LE0/G;

    iget-object v3, p0, LE0/G;->g:LE0/X;

    invoke-virtual {v3, v2, v1}, LE0/X;->a(ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, LE0/G;->h1()V

    invoke-direct {p0}, LE0/G;->J0()V

    invoke-virtual {p0}, LE0/G;->F0()V

    return-void
.end method

.method public f()V
    .locals 3

    iget-object v0, p0, LE0/G;->l:Landroidx/compose/ui/viewinterop/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/viewinterop/c;->f()V

    :cond_0
    iget-object v0, p0, LE0/G;->C:Landroidx/compose/ui/layout/h;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/ui/layout/h;->f()V

    :cond_1
    invoke-virtual {p0}, LE0/G;->m0()LE0/c0;

    move-result-object v0

    invoke-virtual {p0}, LE0/G;->P()LE0/c0;

    move-result-object v1

    invoke-virtual {v1}, LE0/c0;->H2()LE0/c0;

    move-result-object v1

    :goto_0
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LE0/c0;->b3()V

    invoke-virtual {v0}, LE0/c0;->H2()LE0/c0;

    move-result-object v0

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final f0()LE0/G$g;
    .locals 1

    invoke-virtual {p0}, LE0/G;->c0()LE0/L$b;

    move-result-object v0

    invoke-virtual {v0}, LE0/L$b;->r1()LE0/G$g;

    move-result-object v0

    return-object v0
.end method

.method public g(Landroidx/compose/ui/e;)V
    .locals 2

    iget-boolean v0, p0, LE0/G;->a:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LE0/G;->i0()Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-nez v0, :cond_2

    const-string v0, "Modifiers are not supported on virtual LayoutNodes"

    invoke-static {v0}, LB0/a;->a(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0}, LE0/G;->L0()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "modifier is updated when deactivated"

    invoke-static {v0}, LB0/a;->a(Ljava/lang/String;)V

    :cond_3
    invoke-virtual {p0}, LE0/G;->K0()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0, p1}, LE0/G;->t(Landroidx/compose/ui/e;)V

    goto :goto_2

    :cond_4
    iput-object p1, p0, LE0/G;->G:Landroidx/compose/ui/e;

    :goto_2
    return-void
.end method

.method public final g0()LE0/G$g;
    .locals 1

    invoke-virtual {p0}, LE0/G;->Z()LE0/L$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LE0/L$a;->h1()LE0/G$g;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, LE0/G$g;->NotUsed:LE0/G$g;

    :cond_1
    return-object v0
.end method

.method public getLayoutDirection()LY0/t;
    .locals 1

    iget-object v0, p0, LE0/G;->u:LY0/t;

    return-object v0
.end method

.method public h()V
    .locals 1

    iget-object v0, p0, LE0/G;->l:Landroidx/compose/ui/viewinterop/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/compose/ui/viewinterop/c;->h()V

    :cond_0
    iget-object v0, p0, LE0/G;->C:Landroidx/compose/ui/layout/h;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/ui/layout/h;->h()V

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, LE0/G;->N:Z

    invoke-direct {p0}, LE0/G;->y1()V

    invoke-virtual {p0}, LE0/G;->K0()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LE0/G;->I0()V

    :cond_2
    return-void
.end method

.method public h0()Z
    .locals 1

    invoke-virtual {p0}, LE0/G;->K0()Z

    move-result v0

    return v0
.end method

.method public final h1()V
    .locals 1

    iget-boolean v0, p0, LE0/G;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LE0/G;->o0()LE0/G;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LE0/G;->h1()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LE0/G;->q:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public i(LC0/C;)V
    .locals 1

    iget-object v0, p0, LE0/G;->r:LC0/C;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p1, p0, LE0/G;->r:LC0/C;

    iget-object p1, p0, LE0/G;->s:LE0/y;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LE0/G;->e0()LC0/C;

    move-result-object v0

    invoke-virtual {p1, v0}, LE0/y;->k(LC0/C;)V

    :cond_0
    invoke-virtual {p0}, LE0/G;->F0()V

    :cond_1
    return-void
.end method

.method public i0()Landroidx/compose/ui/e;
    .locals 1

    iget-object v0, p0, LE0/G;->F:Landroidx/compose/ui/e;

    return-object v0
.end method

.method public final i1(II)V
    .locals 8

    iget-object v0, p0, LE0/G;->x:LE0/G$g;

    sget-object v1, LE0/G$g;->NotUsed:LE0/G$g;

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, LE0/G;->w()V

    :cond_0
    invoke-virtual {p0}, LE0/G;->o0()LE0/G;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LE0/G;->P()LE0/c0;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LE0/P;->q1()Landroidx/compose/ui/layout/t$a;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    move-object v1, v0

    goto :goto_2

    :cond_2
    :goto_1
    invoke-static {p0}, LE0/K;->b(LE0/G;)LE0/m0;

    move-result-object v0

    invoke-interface {v0}, LE0/m0;->getPlacementScope()Landroidx/compose/ui/layout/t$a;

    move-result-object v0

    goto :goto_0

    :goto_2
    invoke-virtual {p0}, LE0/G;->c0()LE0/L$b;

    move-result-object v2

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move v3, p1

    move v4, p2

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/t$a;->l(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    return-void
.end method

.method public j()V
    .locals 13

    iget-object v0, p0, LE0/G;->e:LE0/G;

    if-eqz v0, :cond_0

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, LE0/G;->s1(LE0/G;ZZZILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 v11, 0x5

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v7, p0

    invoke-static/range {v7 .. v12}, LE0/G;->w1(LE0/G;ZZZILjava/lang/Object;)V

    :goto_0
    iget-object v0, p0, LE0/G;->B:LE0/L;

    invoke-virtual {v0}, LE0/L;->y()LY0/b;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, LE0/G;->k:LE0/m0;

    if-eqz v1, :cond_2

    invoke-virtual {v0}, LY0/b;->r()J

    move-result-wide v2

    invoke-interface {v1, p0, v2, v3}, LE0/m0;->A(LE0/G;J)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, LE0/G;->k:LE0/m0;

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, LE0/m0;->f(LE0/m0;ZILjava/lang/Object;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public final j0()Z
    .locals 1

    iget-boolean v0, p0, LE0/G;->J:Z

    return v0
.end method

.method public k(Landroidx/compose/ui/platform/w1;)V
    .locals 10

    iget-object v0, p0, LE0/G;->v:Landroidx/compose/ui/platform/w1;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    iput-object p1, p0, LE0/G;->v:Landroidx/compose/ui/platform/w1;

    iget-object p1, p0, LE0/G;->A:LE0/a0;

    const/16 v0, 0x10

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v1

    invoke-static {p1}, LE0/a0;->c(LE0/a0;)I

    move-result v2

    and-int/2addr v2, v1

    if-eqz v2, :cond_8

    invoke-virtual {p1}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_8

    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->f2()I

    move-result v2

    and-int/2addr v2, v1

    if-eqz v2, :cond_7

    const/4 v2, 0x0

    move-object v3, p1

    move-object v4, v2

    :goto_1
    if-eqz v3, :cond_7

    instance-of v5, v3, LE0/s0;

    if-eqz v5, :cond_0

    check-cast v3, LE0/s0;

    invoke-interface {v3}, LE0/s0;->M1()V

    goto :goto_4

    :cond_0
    invoke-virtual {v3}, Landroidx/compose/ui/e$c;->f2()I

    move-result v5

    and-int/2addr v5, v1

    if-eqz v5, :cond_6

    instance-of v5, v3, LE0/m;

    if-eqz v5, :cond_6

    move-object v5, v3

    check-cast v5, LE0/m;

    invoke-virtual {v5}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v5

    const/4 v6, 0x0

    move v7, v6

    :goto_2
    const/4 v8, 0x1

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->f2()I

    move-result v9

    and-int/2addr v9, v1

    if-eqz v9, :cond_4

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v8, :cond_1

    move-object v3, v5

    goto :goto_3

    :cond_1
    if-nez v4, :cond_2

    new-instance v4, LV/b;

    new-array v8, v0, [Landroidx/compose/ui/e$c;

    invoke-direct {v4, v8, v6}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_2
    if-eqz v3, :cond_3

    invoke-virtual {v4, v3}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v3, v2

    :cond_3
    invoke-virtual {v4, v5}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_4
    :goto_3
    invoke-virtual {v5}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v5

    goto :goto_2

    :cond_5
    if-ne v7, v8, :cond_6

    goto :goto_1

    :cond_6
    :goto_4
    invoke-static {v4}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v3

    goto :goto_1

    :cond_7
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->a2()I

    move-result v2

    and-int/2addr v2, v1

    if-eqz v2, :cond_8

    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object p1

    goto :goto_0

    :cond_8
    return-void
.end method

.method public final k0()LE0/a0;
    .locals 1

    iget-object v0, p0, LE0/G;->A:LE0/a0;

    return-object v0
.end method

.method public final k1(LY0/b;)Z
    .locals 3

    if-eqz p1, :cond_1

    iget-object v0, p0, LE0/G;->x:LE0/G$g;

    sget-object v1, LE0/G$g;->NotUsed:LE0/G$g;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, LE0/G;->v()V

    :cond_0
    invoke-virtual {p0}, LE0/G;->c0()LE0/L$b;

    move-result-object v0

    invoke-virtual {p1}, LY0/b;->r()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LE0/L$b;->c2(J)Z

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public l(LT/x;)V
    .locals 9

    iput-object p1, p0, LE0/G;->w:LT/x;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v0

    invoke-interface {p1, v0}, LT/x;->b(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/d;

    invoke-virtual {p0, v0}, LE0/G;->a(LY0/d;)V

    invoke-static {}, Landroidx/compose/ui/platform/k0;->m()LT/H0;

    move-result-object v0

    invoke-interface {p1, v0}, LT/x;->b(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/t;

    invoke-virtual {p0, v0}, LE0/G;->b(LY0/t;)V

    invoke-static {}, Landroidx/compose/ui/platform/k0;->t()LT/H0;

    move-result-object v0

    invoke-interface {p1, v0}, LT/x;->b(LT/u;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/platform/w1;

    invoke-virtual {p0, p1}, LE0/G;->k(Landroidx/compose/ui/platform/w1;)V

    iget-object p1, p0, LE0/G;->A:LE0/a0;

    const v0, 0x8000

    invoke-static {v0}, LE0/e0;->a(I)I

    move-result v0

    invoke-static {p1}, LE0/a0;->c(LE0/a0;)I

    move-result v1

    and-int/2addr v1, v0

    if-eqz v1, :cond_9

    invoke-virtual {p1}, LE0/a0;->k()Landroidx/compose/ui/e$c;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_9

    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->f2()I

    move-result v1

    and-int/2addr v1, v0

    if-eqz v1, :cond_8

    const/4 v1, 0x0

    move-object v2, p1

    move-object v3, v1

    :goto_1
    if-eqz v2, :cond_8

    instance-of v4, v2, LE0/h;

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    check-cast v2, LE0/h;

    invoke-interface {v2}, LE0/j;->h1()Landroidx/compose/ui/e$c;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {v2}, LE0/f0;->e(Landroidx/compose/ui/e$c;)V

    goto :goto_4

    :cond_0
    invoke-virtual {v2, v5}, Landroidx/compose/ui/e$c;->A2(Z)V

    goto :goto_4

    :cond_1
    invoke-virtual {v2}, Landroidx/compose/ui/e$c;->f2()I

    move-result v4

    and-int/2addr v4, v0

    if-eqz v4, :cond_7

    instance-of v4, v2, LE0/m;

    if-eqz v4, :cond_7

    move-object v4, v2

    check-cast v4, LE0/m;

    invoke-virtual {v4}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v4

    const/4 v6, 0x0

    move v7, v6

    :goto_2
    if-eqz v4, :cond_6

    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->f2()I

    move-result v8

    and-int/2addr v8, v0

    if-eqz v8, :cond_5

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v5, :cond_2

    move-object v2, v4

    goto :goto_3

    :cond_2
    if-nez v3, :cond_3

    new-instance v3, LV/b;

    const/16 v8, 0x10

    new-array v8, v8, [Landroidx/compose/ui/e$c;

    invoke-direct {v3, v8, v6}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_3
    if-eqz v2, :cond_4

    invoke-virtual {v3, v2}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v2, v1

    :cond_4
    invoke-virtual {v3, v4}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_5
    :goto_3
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v4

    goto :goto_2

    :cond_6
    if-ne v7, v5, :cond_7

    goto :goto_1

    :cond_7
    :goto_4
    invoke-static {v3}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v2

    goto :goto_1

    :cond_8
    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->a2()I

    move-result v1

    and-int/2addr v1, v0

    if-eqz v1, :cond_9

    invoke-virtual {p1}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object p1

    goto :goto_0

    :cond_9
    return-void
.end method

.method public final m0()LE0/c0;
    .locals 1

    iget-object v0, p0, LE0/G;->A:LE0/a0;

    invoke-virtual {v0}, LE0/a0;->n()LE0/c0;

    move-result-object v0

    return-object v0
.end method

.method public final m1()V
    .locals 2

    iget-object v0, p0, LE0/G;->g:LE0/X;

    invoke-virtual {v0}, LE0/X;->e()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    const/4 v1, -0x1

    if-ge v1, v0, :cond_0

    iget-object v1, p0, LE0/G;->g:LE0/X;

    invoke-virtual {v1, v0}, LE0/X;->d(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LE0/G;

    invoke-direct {p0, v1}, LE0/G;->f1(LE0/G;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LE0/G;->g:LE0/X;

    invoke-virtual {v0}, LE0/X;->c()V

    return-void
.end method

.method public final n0()LE0/m0;
    .locals 1

    iget-object v0, p0, LE0/G;->k:LE0/m0;

    return-object v0
.end method

.method public final n1(II)V
    .locals 3

    const/4 v0, 0x1

    if-ltz p2, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "count ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ") must be greater than 0"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LB0/a;->a(Ljava/lang/String;)V

    :cond_1
    add-int/2addr p2, p1

    sub-int/2addr p2, v0

    if-gt p1, p2, :cond_2

    :goto_1
    iget-object v0, p0, LE0/G;->g:LE0/X;

    invoke-virtual {v0, p2}, LE0/X;->d(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LE0/G;

    invoke-direct {p0, v0}, LE0/G;->f1(LE0/G;)V

    iget-object v0, p0, LE0/G;->g:LE0/X;

    invoke-virtual {v0, p2}, LE0/X;->g(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LE0/G;

    if-eq p2, p1, :cond_2

    add-int/lit8 p2, p2, -0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final o0()LE0/G;
    .locals 3

    iget-object v0, p0, LE0/G;->j:LE0/G;

    :goto_0
    if-eqz v0, :cond_0

    iget-boolean v1, v0, LE0/G;->a:Z

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget-object v0, v0, LE0/G;->j:LE0/G;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final o1()V
    .locals 2

    iget-object v0, p0, LE0/G;->x:LE0/G$g;

    sget-object v1, LE0/G$g;->NotUsed:LE0/G$g;

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, LE0/G;->w()V

    :cond_0
    invoke-virtual {p0}, LE0/G;->c0()LE0/L$b;

    move-result-object v0

    invoke-virtual {v0}, LE0/L$b;->d2()V

    return-void
.end method

.method public p()V
    .locals 1

    invoke-virtual {p0}, LE0/G;->K0()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "onReuse is only expected on attached node"

    invoke-static {v0}, LB0/a;->a(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, LE0/G;->l:Landroidx/compose/ui/viewinterop/c;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/compose/ui/viewinterop/c;->p()V

    :cond_1
    iget-object v0, p0, LE0/G;->C:Landroidx/compose/ui/layout/h;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/compose/ui/layout/h;->p()V

    :cond_2
    invoke-virtual {p0}, LE0/G;->L0()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    iput-boolean v0, p0, LE0/G;->N:Z

    invoke-virtual {p0}, LE0/G;->I0()V

    goto :goto_0

    :cond_3
    invoke-direct {p0}, LE0/G;->y1()V

    :goto_0
    invoke-static {}, LJ0/m;->a()I

    move-result v0

    invoke-virtual {p0, v0}, LE0/G;->I1(I)V

    iget-object v0, p0, LE0/G;->A:LE0/a0;

    invoke-virtual {v0}, LE0/a0;->s()V

    iget-object v0, p0, LE0/G;->A:LE0/a0;

    invoke-virtual {v0}, LE0/a0;->y()V

    invoke-virtual {p0, p0}, LE0/G;->x1(LE0/G;)V

    return-void
.end method

.method public final p0()I
    .locals 1

    invoke-virtual {p0}, LE0/G;->c0()LE0/L$b;

    move-result-object v0

    invoke-virtual {v0}, LE0/L$b;->z1()I

    move-result v0

    return v0
.end method

.method public final p1(Z)V
    .locals 2

    iget-boolean v0, p0, LE0/G;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LE0/G;->k:LE0/m0;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-interface {v0, p0, v1, p1}, LE0/m0;->C(LE0/G;ZZ)V

    :cond_0
    return-void
.end method

.method public q()Z
    .locals 1

    invoke-virtual {p0}, LE0/G;->c0()LE0/L$b;

    move-result-object v0

    invoke-virtual {v0}, LE0/L$b;->q()Z

    move-result v0

    return v0
.end method

.method public q0()I
    .locals 1

    iget v0, p0, LE0/G;->b:I

    return v0
.end method

.method public final r0()Landroidx/compose/ui/layout/h;
    .locals 1

    iget-object v0, p0, LE0/G;->C:Landroidx/compose/ui/layout/h;

    return-object v0
.end method

.method public final r1(ZZZ)V
    .locals 3

    iget-object v0, p0, LE0/G;->e:LE0/G;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string v0, "Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope"

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, LE0/G;->k:LE0/m0;

    if-nez v0, :cond_2

    return-void

    :cond_2
    iget-boolean v2, p0, LE0/G;->n:Z

    if-nez v2, :cond_3

    iget-boolean v2, p0, LE0/G;->a:Z

    if-nez v2, :cond_3

    invoke-interface {v0, p0, v1, p1, p2}, LE0/m0;->o(LE0/G;ZZZ)V

    if-eqz p3, :cond_3

    invoke-virtual {p0}, LE0/G;->Z()LE0/L$a;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p2, p1}, LE0/L$a;->q1(Z)V

    :cond_3
    return-void
.end method

.method public s0()Landroidx/compose/ui/platform/w1;
    .locals 1

    iget-object v0, p0, LE0/G;->v:Landroidx/compose/ui/platform/w1;

    return-object v0
.end method

.method public t0()I
    .locals 1

    iget-object v0, p0, LE0/G;->B:LE0/L;

    invoke-virtual {v0}, LE0/L;->L()I

    move-result v0

    return v0
.end method

.method public final t1(Z)V
    .locals 7

    iget-boolean v0, p0, LE0/G;->a:Z

    if-nez v0, :cond_0

    iget-object v1, p0, LE0/G;->k:LE0/m0;

    if-eqz v1, :cond_0

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v2, p0

    move v4, p1

    invoke-static/range {v1 .. v6}, LE0/m0;->B(LE0/m0;LE0/G;ZZILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    invoke-static {p0, v1}, Landroidx/compose/ui/platform/E0;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " children: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LE0/G;->H()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " measurePolicy: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LE0/G;->e0()LC0/C;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(LE0/m0;)V
    .locals 6

    iget-object v0, p0, LE0/G;->k:LE0/m0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const/4 v3, 0x0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Cannot attach "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " as it already is attached.  Tree: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0, v1, v2, v3}, LE0/G;->y(LE0/G;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, LE0/G;->j:LE0/G;

    if-eqz v0, :cond_4

    if-eqz v0, :cond_2

    iget-object v0, v0, LE0/G;->k:LE0/m0;

    goto :goto_1

    :cond_2
    move-object v0, v3

    :goto_1
    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    move v0, v1

    goto :goto_3

    :cond_4
    :goto_2
    move v0, v2

    :goto_3
    if-nez v0, :cond_7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Attaching to a different owner("

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ") than the parent\'s owner("

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LE0/G;->o0()LE0/G;

    move-result-object v4

    if-eqz v4, :cond_5

    iget-object v4, v4, LE0/G;->k:LE0/m0;

    goto :goto_4

    :cond_5
    move-object v4, v3

    :goto_4
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "). This tree: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0, v1, v2, v3}, LE0/G;->y(LE0/G;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " Parent tree: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, LE0/G;->j:LE0/G;

    if-eqz v4, :cond_6

    invoke-static {v4, v1, v2, v3}, LE0/G;->y(LE0/G;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    goto :goto_5

    :cond_6
    move-object v4, v3

    :goto_5
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_7
    invoke-virtual {p0}, LE0/G;->o0()LE0/G;

    move-result-object v0

    if-nez v0, :cond_8

    invoke-virtual {p0}, LE0/G;->c0()LE0/L$b;

    move-result-object v4

    invoke-virtual {v4, v2}, LE0/L$b;->g2(Z)V

    invoke-virtual {p0}, LE0/G;->Z()LE0/L$a;

    move-result-object v4

    if-eqz v4, :cond_8

    invoke-virtual {v4, v2}, LE0/L$a;->a2(Z)V

    :cond_8
    invoke-virtual {p0}, LE0/G;->m0()LE0/c0;

    move-result-object v4

    if-eqz v0, :cond_9

    invoke-virtual {v0}, LE0/G;->P()LE0/c0;

    move-result-object v5

    goto :goto_6

    :cond_9
    move-object v5, v3

    :goto_6
    invoke-virtual {v4, v5}, LE0/c0;->n3(LE0/c0;)V

    iput-object p1, p0, LE0/G;->k:LE0/m0;

    if-eqz v0, :cond_a

    iget v4, v0, LE0/G;->m:I

    goto :goto_7

    :cond_a
    const/4 v4, -0x1

    :goto_7
    add-int/2addr v4, v2

    iput v4, p0, LE0/G;->m:I

    iget-object v4, p0, LE0/G;->G:Landroidx/compose/ui/e;

    if-eqz v4, :cond_b

    invoke-direct {p0, v4}, LE0/G;->t(Landroidx/compose/ui/e;)V

    :cond_b
    iput-object v3, p0, LE0/G;->G:Landroidx/compose/ui/e;

    iget-object v3, p0, LE0/G;->A:LE0/a0;

    const/16 v4, 0x8

    invoke-static {v4}, LE0/e0;->a(I)I

    move-result v4

    invoke-virtual {v3, v4}, LE0/a0;->q(I)Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-virtual {p0}, LE0/G;->I0()V

    :cond_c
    invoke-interface {p1, p0}, LE0/m0;->u(LE0/G;)V

    iget-boolean v3, p0, LE0/G;->d:Z

    if-eqz v3, :cond_d

    invoke-direct {p0, p0}, LE0/G;->E1(LE0/G;)V

    goto :goto_8

    :cond_d
    iget-object v3, p0, LE0/G;->j:LE0/G;

    if-eqz v3, :cond_e

    iget-object v3, v3, LE0/G;->e:LE0/G;

    if-nez v3, :cond_f

    :cond_e
    iget-object v3, p0, LE0/G;->e:LE0/G;

    :cond_f
    invoke-direct {p0, v3}, LE0/G;->E1(LE0/G;)V

    iget-object v3, p0, LE0/G;->e:LE0/G;

    if-nez v3, :cond_10

    iget-object v3, p0, LE0/G;->A:LE0/a0;

    const/16 v4, 0x200

    invoke-static {v4}, LE0/e0;->a(I)I

    move-result v4

    invoke-virtual {v3, v4}, LE0/a0;->q(I)Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-direct {p0, p0}, LE0/G;->E1(LE0/G;)V

    :cond_10
    :goto_8
    invoke-virtual {p0}, LE0/G;->L0()Z

    move-result v3

    if-nez v3, :cond_11

    iget-object v3, p0, LE0/G;->A:LE0/a0;

    invoke-virtual {v3}, LE0/a0;->s()V

    :cond_11
    iget-object v3, p0, LE0/G;->g:LE0/X;

    invoke-virtual {v3}, LE0/X;->f()LV/b;

    move-result-object v3

    invoke-virtual {v3}, LV/b;->o()I

    move-result v4

    if-lez v4, :cond_13

    invoke-virtual {v3}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v3

    :cond_12
    aget-object v5, v3, v1

    check-cast v5, LE0/G;

    invoke-virtual {v5, p1}, LE0/G;->u(LE0/m0;)V

    add-int/2addr v1, v2

    if-lt v1, v4, :cond_12

    :cond_13
    invoke-virtual {p0}, LE0/G;->L0()Z

    move-result v1

    if-nez v1, :cond_14

    iget-object v1, p0, LE0/G;->A:LE0/a0;

    invoke-virtual {v1}, LE0/a0;->y()V

    :cond_14
    invoke-virtual {p0}, LE0/G;->F0()V

    if-eqz v0, :cond_15

    invoke-virtual {v0}, LE0/G;->F0()V

    :cond_15
    invoke-virtual {p0}, LE0/G;->m0()LE0/c0;

    move-result-object v0

    invoke-virtual {p0}, LE0/G;->P()LE0/c0;

    move-result-object v1

    invoke-virtual {v1}, LE0/c0;->H2()LE0/c0;

    move-result-object v1

    :goto_9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_16

    if-eqz v0, :cond_16

    invoke-virtual {v0}, LE0/c0;->X2()V

    invoke-virtual {v0}, LE0/c0;->H2()LE0/c0;

    move-result-object v0

    goto :goto_9

    :cond_16
    iget-object v0, p0, LE0/G;->H:Lmh/l;

    if-eqz v0, :cond_17

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_17
    iget-object p1, p0, LE0/G;->B:LE0/L;

    invoke-virtual {p1}, LE0/L;->c0()V

    invoke-virtual {p0}, LE0/G;->L0()Z

    move-result p1

    if-nez p1, :cond_18

    invoke-direct {p0}, LE0/G;->C0()V

    :cond_18
    return-void
.end method

.method public final v()V
    .locals 6

    iget-object v0, p0, LE0/G;->x:LE0/G$g;

    iput-object v0, p0, LE0/G;->y:LE0/G$g;

    sget-object v0, LE0/G$g;->NotUsed:LE0/G$g;

    iput-object v0, p0, LE0/G;->x:LE0/G$g;

    invoke-virtual {p0}, LE0/G;->w0()LV/b;

    move-result-object v0

    invoke-virtual {v0}, LV/b;->o()I

    move-result v1

    if-lez v1, :cond_2

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    :cond_0
    aget-object v3, v0, v2

    check-cast v3, LE0/G;

    iget-object v4, v3, LE0/G;->x:LE0/G$g;

    sget-object v5, LE0/G$g;->NotUsed:LE0/G$g;

    if-eq v4, v5, :cond_1

    invoke-virtual {v3}, LE0/G;->v()V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_0

    :cond_2
    return-void
.end method

.method public final v0()LV/b;
    .locals 3

    iget-boolean v0, p0, LE0/G;->q:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LE0/G;->p:LV/b;

    invoke-virtual {v0}, LV/b;->h()V

    iget-object v0, p0, LE0/G;->p:LV/b;

    invoke-virtual {p0}, LE0/G;->w0()LV/b;

    move-result-object v1

    invoke-virtual {v0}, LV/b;->o()I

    move-result v2

    invoke-virtual {v0, v2, v1}, LV/b;->c(ILV/b;)Z

    iget-object v0, p0, LE0/G;->p:LV/b;

    sget-object v1, LE0/G;->h1:Ljava/util/Comparator;

    invoke-virtual {v0, v1}, LV/b;->F(Ljava/util/Comparator;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, LE0/G;->q:Z

    :cond_0
    iget-object v0, p0, LE0/G;->p:LV/b;

    return-object v0
.end method

.method public final v1(ZZZ)V
    .locals 8

    iget-boolean v0, p0, LE0/G;->n:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, LE0/G;->a:Z

    if-nez v0, :cond_1

    iget-object v1, p0, LE0/G;->k:LE0/m0;

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object v2, p0

    move v4, p1

    move v5, p2

    invoke-static/range {v1 .. v7}, LE0/m0;->v(LE0/m0;LE0/G;ZZZILjava/lang/Object;)V

    if-eqz p3, :cond_1

    invoke-virtual {p0}, LE0/G;->c0()LE0/L$b;

    move-result-object p2

    invoke-virtual {p2, p1}, LE0/L$b;->E1(Z)V

    :cond_1
    return-void
.end method

.method public final w0()LV/b;
    .locals 1

    invoke-virtual {p0}, LE0/G;->L1()V

    iget v0, p0, LE0/G;->f:I

    if-nez v0, :cond_0

    iget-object v0, p0, LE0/G;->g:LE0/X;

    invoke-virtual {v0}, LE0/X;->f()LV/b;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LE0/G;->h:LV/b;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object v0
.end method

.method public final x0(JLE0/u;ZZ)V
    .locals 13

    invoke-virtual {p0}, LE0/G;->m0()LE0/c0;

    move-result-object v0

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-wide v1, p1

    invoke-static/range {v0 .. v5}, LE0/c0;->v2(LE0/c0;JZILjava/lang/Object;)J

    move-result-wide v8

    invoke-virtual {p0}, LE0/G;->m0()LE0/c0;

    move-result-object v6

    sget-object v0, LE0/c0;->X:LE0/c0$e;

    invoke-virtual {v0}, LE0/c0$e;->a()LE0/c0$f;

    move-result-object v7

    move-object/from16 v10, p3

    move/from16 v11, p4

    move/from16 v12, p5

    invoke-virtual/range {v6 .. v12}, LE0/c0;->P2(LE0/c0$f;JLE0/u;ZZ)V

    return-void
.end method

.method public final x1(LE0/G;)V
    .locals 8

    invoke-virtual {p1}, LE0/G;->W()LE0/G$e;

    move-result-object v0

    sget-object v1, LE0/G$h;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    invoke-virtual {p1}, LE0/G;->Y()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v7}, LE0/G;->s1(LE0/G;ZZZILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LE0/G;->X()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1, v1}, LE0/G;->p1(Z)V

    :cond_1
    invoke-virtual {p1}, LE0/G;->d0()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v7}, LE0/G;->w1(LE0/G;ZZZILjava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, LE0/G;->V()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1, v1}, LE0/G;->t1(Z)V

    :cond_3
    :goto_0
    return-void

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected state "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LE0/G;->W()LE0/G$e;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final z()V
    .locals 8

    iget-object v0, p0, LE0/G;->k:LE0/m0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Cannot detach node that is already detached!  Tree: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LE0/G;->o0()LE0/G;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-static {v4, v3, v1, v2}, LE0/G;->y(LE0/G;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :cond_1
    invoke-virtual {p0}, LE0/G;->o0()LE0/G;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, LE0/G;->D0()V

    invoke-virtual {v4}, LE0/G;->F0()V

    invoke-virtual {p0}, LE0/G;->c0()LE0/L$b;

    move-result-object v4

    sget-object v5, LE0/G$g;->NotUsed:LE0/G$g;

    invoke-virtual {v4, v5}, LE0/L$b;->f2(LE0/G$g;)V

    invoke-virtual {p0}, LE0/G;->Z()LE0/L$a;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4, v5}, LE0/L$a;->Y1(LE0/G$g;)V

    :cond_2
    iget-object v4, p0, LE0/G;->B:LE0/L;

    invoke-virtual {v4}, LE0/L;->V()V

    iget-object v4, p0, LE0/G;->I:Lmh/l;

    if-eqz v4, :cond_3

    invoke-interface {v4, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v4, p0, LE0/G;->A:LE0/a0;

    const/16 v5, 0x8

    invoke-static {v5}, LE0/e0;->a(I)I

    move-result v5

    invoke-virtual {v4, v5}, LE0/a0;->q(I)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {p0}, LE0/G;->I0()V

    :cond_4
    iget-object v4, p0, LE0/G;->A:LE0/a0;

    invoke-virtual {v4}, LE0/a0;->z()V

    invoke-static {p0, v1}, LE0/G;->s(LE0/G;Z)V

    iget-object v4, p0, LE0/G;->g:LE0/X;

    invoke-virtual {v4}, LE0/X;->f()LV/b;

    move-result-object v4

    invoke-virtual {v4}, LV/b;->o()I

    move-result v5

    if-lez v5, :cond_6

    invoke-virtual {v4}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v4

    move v6, v3

    :cond_5
    aget-object v7, v4, v6

    check-cast v7, LE0/G;

    invoke-virtual {v7}, LE0/G;->z()V

    add-int/2addr v6, v1

    if-lt v6, v5, :cond_5

    :cond_6
    invoke-static {p0, v3}, LE0/G;->s(LE0/G;Z)V

    iget-object v1, p0, LE0/G;->A:LE0/a0;

    invoke-virtual {v1}, LE0/a0;->t()V

    invoke-interface {v0, p0}, LE0/m0;->i(LE0/G;)V

    iput-object v2, p0, LE0/G;->k:LE0/m0;

    invoke-direct {p0, v2}, LE0/G;->E1(LE0/G;)V

    iput v3, p0, LE0/G;->m:I

    invoke-virtual {p0}, LE0/G;->c0()LE0/L$b;

    move-result-object v0

    invoke-virtual {v0}, LE0/L$b;->Y1()V

    invoke-virtual {p0}, LE0/G;->Z()LE0/L$a;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, LE0/L$a;->M1()V

    :cond_7
    return-void
.end method

.method public final z0(JLE0/u;ZZ)V
    .locals 13

    invoke-virtual {p0}, LE0/G;->m0()LE0/c0;

    move-result-object v0

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-wide v1, p1

    invoke-static/range {v0 .. v5}, LE0/c0;->v2(LE0/c0;JZILjava/lang/Object;)J

    move-result-wide v8

    invoke-virtual {p0}, LE0/G;->m0()LE0/c0;

    move-result-object v6

    sget-object v0, LE0/c0;->X:LE0/c0$e;

    invoke-virtual {v0}, LE0/c0$e;->b()LE0/c0$f;

    move-result-object v7

    const/4 v11, 0x1

    move-object/from16 v10, p3

    move/from16 v12, p5

    invoke-virtual/range {v6 .. v12}, LE0/c0;->P2(LE0/c0$f;JLE0/u;ZZ)V

    return-void
.end method

.method public final z1()V
    .locals 6

    invoke-virtual {p0}, LE0/G;->w0()LV/b;

    move-result-object v0

    invoke-virtual {v0}, LV/b;->o()I

    move-result v1

    if-lez v1, :cond_2

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    :cond_0
    aget-object v3, v0, v2

    check-cast v3, LE0/G;

    iget-object v4, v3, LE0/G;->y:LE0/G$g;

    iput-object v4, v3, LE0/G;->x:LE0/G$g;

    sget-object v5, LE0/G$g;->NotUsed:LE0/G$g;

    if-eq v4, v5, :cond_1

    invoke-virtual {v3}, LE0/G;->z1()V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_0

    :cond_2
    return-void
.end method
