.class public final Lh0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/l;
.implements Landroidx/lifecycle/e;
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh0/b$a;,
        Lh0/b$b;
    }
.end annotation


# instance fields
.field private final a:Landroidx/compose/ui/platform/r;

.field private b:Lmh/a;

.field private c:Landroidx/compose/ui/platform/coreshims/c;

.field private final d:Lo/z;

.field private final e:Lo/A;

.field private f:J

.field private g:Lh0/b$a;

.field private h:Z

.field private final i:Lo/b;

.field private final j:LKi/g;

.field private final k:Landroid/os/Handler;

.field private l:Lo/m;

.field private m:J

.field private n:Lo/z;

.field private o:Landroidx/compose/ui/platform/j1;

.field private p:Z

.field private final q:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/platform/r;Lmh/a;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/b;->a:Landroidx/compose/ui/platform/r;

    iput-object p2, p0, Lh0/b;->b:Lmh/a;

    new-instance p2, Lo/z;

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p2, v0, v1, v2}, Lo/z;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, Lh0/b;->d:Lo/z;

    new-instance p2, Lo/A;

    invoke-direct {p2, v0, v1, v2}, Lo/A;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, Lh0/b;->e:Lo/A;

    const-wide/16 v3, 0x64

    iput-wide v3, p0, Lh0/b;->f:J

    sget-object p2, Lh0/b$a;->SHOW_ORIGINAL:Lh0/b$a;

    iput-object p2, p0, Lh0/b;->g:Lh0/b$a;

    iput-boolean v1, p0, Lh0/b;->h:Z

    new-instance p2, Lo/b;

    invoke-direct {p2, v0, v1, v2}, Lo/b;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, Lh0/b;->i:Lo/b;

    const/4 p2, 0x6

    invoke-static {v1, v2, v2, p2, v2}, LKi/j;->b(ILKi/a;Lmh/l;ILjava/lang/Object;)LKi/g;

    move-result-object p2

    iput-object p2, p0, Lh0/b;->j:LKi/g;

    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lh0/b;->k:Landroid/os/Handler;

    invoke-static {}, Lo/n;->a()Lo/m;

    move-result-object p2

    iput-object p2, p0, Lh0/b;->l:Lo/m;

    invoke-static {}, Lo/n;->b()Lo/z;

    move-result-object p2

    iput-object p2, p0, Lh0/b;->n:Lo/z;

    new-instance p2, Landroidx/compose/ui/platform/j1;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/r;->getSemanticsOwner()LJ0/p;

    move-result-object p1

    invoke-virtual {p1}, LJ0/p;->a()LJ0/n;

    move-result-object p1

    invoke-static {}, Lo/n;->a()Lo/m;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Landroidx/compose/ui/platform/j1;-><init>(LJ0/n;Lo/m;)V

    iput-object p2, p0, Lh0/b;->o:Landroidx/compose/ui/platform/j1;

    new-instance p1, Lh0/a;

    invoke-direct {p1, p0}, Lh0/a;-><init>(Lh0/b;)V

    iput-object p1, p0, Lh0/b;->q:Ljava/lang/Runnable;

    return-void
.end method

.method private final A(LJ0/n;Landroidx/compose/ui/platform/j1;)V
    .locals 16

    move-object/from16 v0, p0

    new-instance v1, Lo/A;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v4, v2, v3}, Lo/A;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p1 .. p1}, LJ0/n;->t()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_2

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LJ0/n;

    invoke-virtual/range {p0 .. p0}, Lh0/b;->k()Lo/m;

    move-result-object v7

    invoke-virtual {v6}, LJ0/n;->o()I

    move-result v8

    invoke-virtual {v7, v8}, Lo/m;->a(I)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/platform/j1;->a()Lo/A;

    move-result-object v7

    invoke-virtual {v6}, LJ0/n;->o()I

    move-result v8

    invoke-virtual {v7, v8}, Lo/o;->a(I)Z

    move-result v7

    if-nez v7, :cond_0

    invoke-virtual/range {p1 .. p1}, LJ0/n;->q()LE0/G;

    move-result-object v1

    invoke-direct {v0, v1}, Lh0/b;->q(LE0/G;)V

    return-void

    :cond_0
    invoke-virtual {v6}, LJ0/n;->o()I

    move-result v6

    invoke-virtual {v1, v6}, Lo/A;->f(I)Z

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/ui/platform/j1;->a()Lo/A;

    move-result-object v2

    iget-object v3, v2, Lo/o;->b:[I

    iget-object v2, v2, Lo/o;->a:[J

    array-length v5, v2

    add-int/lit8 v5, v5, -0x2

    if-ltz v5, :cond_6

    move v6, v4

    :goto_1
    aget-wide v7, v2, v6

    not-long v9, v7

    const/4 v11, 0x7

    shl-long/2addr v9, v11

    and-long/2addr v9, v7

    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v9, v11

    cmp-long v9, v9, v11

    if-eqz v9, :cond_5

    sub-int v9, v6, v5

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    move v11, v4

    :goto_2
    if-ge v11, v9, :cond_4

    const-wide/16 v12, 0xff

    and-long/2addr v12, v7

    const-wide/16 v14, 0x80

    cmp-long v12, v12, v14

    if-gez v12, :cond_3

    shl-int/lit8 v12, v6, 0x3

    add-int/2addr v12, v11

    aget v12, v3, v12

    invoke-virtual {v1, v12}, Lo/o;->a(I)Z

    move-result v12

    if-nez v12, :cond_3

    invoke-virtual/range {p1 .. p1}, LJ0/n;->q()LE0/G;

    move-result-object v1

    invoke-direct {v0, v1}, Lh0/b;->q(LE0/G;)V

    return-void

    :cond_3
    shr-long/2addr v7, v10

    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_4
    if-ne v9, v10, :cond_6

    :cond_5
    if-eq v6, v5, :cond_6

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_6
    invoke-virtual/range {p1 .. p1}, LJ0/n;->t()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    :goto_3
    if-ge v4, v2, :cond_9

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LJ0/n;

    invoke-virtual/range {p0 .. p0}, Lh0/b;->k()Lo/m;

    move-result-object v5

    invoke-virtual {v3}, LJ0/n;->o()I

    move-result v6

    invoke-virtual {v5, v6}, Lo/m;->a(I)Z

    move-result v5

    if-eqz v5, :cond_8

    iget-object v5, v0, Lh0/b;->n:Lo/z;

    invoke-virtual {v3}, LJ0/n;->o()I

    move-result v6

    invoke-virtual {v5, v6}, Lo/m;->c(I)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_7

    check-cast v5, Landroidx/compose/ui/platform/j1;

    invoke-direct {v0, v3, v5}, Lh0/b;->A(LJ0/n;Landroidx/compose/ui/platform/j1;)V

    goto :goto_4

    :cond_7
    const-string v1, "node not present in pruned tree before this change"

    invoke-static {v1}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v1, Lkotlin/KotlinNothingValueException;

    invoke-direct {v1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v1

    :cond_8
    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_9
    return-void
.end method

.method private final B()V
    .locals 14

    invoke-virtual {p0}, Lh0/b;->k()Lo/m;

    move-result-object v0

    iget-object v1, v0, Lo/m;->c:[Ljava/lang/Object;

    iget-object v0, v0, Lo/m;->a:[J

    array-length v2, v0

    add-int/lit8 v2, v2, -0x2

    if-ltz v2, :cond_3

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    aget-wide v5, v0, v4

    not-long v7, v5

    const/4 v9, 0x7

    shl-long/2addr v7, v9

    and-long/2addr v7, v5

    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v7, v9

    cmp-long v7, v7, v9

    if-eqz v7, :cond_2

    sub-int v7, v4, v2

    not-int v7, v7

    ushr-int/lit8 v7, v7, 0x1f

    const/16 v8, 0x8

    rsub-int/lit8 v7, v7, 0x8

    move v9, v3

    :goto_1
    if-ge v9, v7, :cond_1

    const-wide/16 v10, 0xff

    and-long/2addr v10, v5

    const-wide/16 v12, 0x80

    cmp-long v10, v10, v12

    if-gez v10, :cond_0

    shl-int/lit8 v10, v4, 0x3

    add-int/2addr v10, v9

    aget-object v10, v1, v10

    check-cast v10, Landroidx/compose/ui/platform/k1;

    invoke-virtual {v10}, Landroidx/compose/ui/platform/k1;->b()LJ0/n;

    move-result-object v10

    invoke-virtual {v10}, LJ0/n;->w()LJ0/j;

    move-result-object v10

    sget-object v11, LJ0/q;->a:LJ0/q;

    invoke-virtual {v11}, LJ0/q;->r()LJ0/v;

    move-result-object v11

    invoke-static {v10, v11}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v11

    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v11, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    sget-object v11, LJ0/i;->a:LJ0/i;

    invoke-virtual {v11}, LJ0/i;->A()LJ0/v;

    move-result-object v11

    invoke-static {v10, v11}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LJ0/a;

    if-eqz v10, :cond_0

    invoke-virtual {v10}, LJ0/a;->a()LYg/i;

    move-result-object v10

    check-cast v10, Lmh/l;

    if-eqz v10, :cond_0

    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v10, v11}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Boolean;

    :cond_0
    shr-long/2addr v5, v8

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_1
    if-ne v7, v8, :cond_3

    :cond_2
    if-eq v4, v2, :cond_3

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method private final C(LJ0/n;)Landroidx/compose/ui/platform/coreshims/e;
    .locals 13

    iget-object v0, p0, Lh0/b;->c:Landroidx/compose/ui/platform/coreshims/c;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-ge v2, v3, :cond_1

    return-object v1

    :cond_1
    iget-object v2, p0, Lh0/b;->a:Landroidx/compose/ui/platform/r;

    invoke-static {v2}, Landroidx/compose/ui/platform/coreshims/d;->a(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/a;

    move-result-object v2

    if-nez v2, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {p1}, LJ0/n;->r()LJ0/n;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, LJ0/n;->o()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v2, v3}, Landroidx/compose/ui/platform/coreshims/c;->a(J)Landroid/view/autofill/AutofillId;

    move-result-object v2

    if-nez v2, :cond_4

    return-object v1

    :cond_3
    invoke-virtual {v2}, Landroidx/compose/ui/platform/coreshims/a;->a()Landroid/view/autofill/AutofillId;

    move-result-object v2

    :cond_4
    invoke-virtual {p1}, LJ0/n;->o()I

    move-result v3

    int-to-long v3, v3

    invoke-virtual {v0, v2, v3, v4}, Landroidx/compose/ui/platform/coreshims/c;->b(Landroid/view/autofill/AutofillId;J)Landroidx/compose/ui/platform/coreshims/e;

    move-result-object v0

    if-nez v0, :cond_5

    return-object v1

    :cond_5
    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object v2

    sget-object v3, LJ0/q;->a:LJ0/q;

    invoke-virtual {v3}, LJ0/q;->w()LJ0/v;

    move-result-object v4

    invoke-virtual {v2, v4}, LJ0/j;->f(LJ0/v;)Z

    move-result v4

    if-eqz v4, :cond_6

    return-object v1

    :cond_6
    invoke-virtual {v0}, Landroidx/compose/ui/platform/coreshims/e;->a()Landroid/os/Bundle;

    move-result-object v4

    if-eqz v4, :cond_7

    const-string v5, "android.view.contentcapture.EventTimestamp"

    iget-wide v6, p0, Lh0/b;->m:J

    invoke-virtual {v4, v5, v6, v7}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_7
    invoke-virtual {v3}, LJ0/q;->C()LJ0/v;

    move-result-object v4

    invoke-static {v2, v4}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_8

    invoke-virtual {p1}, LJ0/n;->o()I

    move-result v5

    invoke-virtual {v0, v5, v1, v1, v4}, Landroidx/compose/ui/platform/coreshims/e;->e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_8
    invoke-virtual {v3}, LJ0/q;->D()LJ0/v;

    move-result-object v1

    invoke-static {v2, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/util/List;

    if-eqz v4, :cond_9

    const-string v1, "android.widget.TextView"

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/coreshims/e;->b(Ljava/lang/String;)V

    const/16 v11, 0x3e

    const/4 v12, 0x0

    const-string v5, "\n"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v4 .. v12}, La1/a;->e(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/coreshims/e;->f(Ljava/lang/CharSequence;)V

    :cond_9
    invoke-virtual {v3}, LJ0/q;->g()LJ0/v;

    move-result-object v1

    invoke-static {v2, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LL0/d;

    if-eqz v1, :cond_a

    const-string v4, "android.widget.EditText"

    invoke-virtual {v0, v4}, Landroidx/compose/ui/platform/coreshims/e;->b(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/coreshims/e;->f(Ljava/lang/CharSequence;)V

    :cond_a
    invoke-virtual {v3}, LJ0/q;->d()LJ0/v;

    move-result-object v1

    invoke-static {v2, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/util/List;

    if-eqz v4, :cond_b

    const/16 v11, 0x3e

    const/4 v12, 0x0

    const-string v5, "\n"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v4 .. v12}, La1/a;->e(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/coreshims/e;->c(Ljava/lang/CharSequence;)V

    :cond_b
    invoke-virtual {v3}, LJ0/q;->y()LJ0/v;

    move-result-object v1

    invoke-static {v2, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LJ0/g;

    if-eqz v1, :cond_c

    invoke-virtual {v1}, LJ0/g;->n()I

    move-result v1

    invoke-static {v1}, Landroidx/compose/ui/platform/l1;->i(I)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/coreshims/e;->b(Ljava/lang/String;)V

    :cond_c
    invoke-static {v2}, Landroidx/compose/ui/platform/l1;->e(LJ0/j;)LL0/M;

    move-result-object v1

    if-eqz v1, :cond_d

    invoke-virtual {v1}, LL0/M;->l()LL0/L;

    move-result-object v1

    invoke-virtual {v1}, LL0/L;->i()LL0/U;

    move-result-object v2

    invoke-virtual {v2}, LL0/U;->l()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/v;->h(J)F

    move-result v2

    invoke-virtual {v1}, LL0/L;->b()LY0/d;

    move-result-object v3

    invoke-interface {v3}, LY0/d;->getDensity()F

    move-result v3

    mul-float/2addr v2, v3

    invoke-virtual {v1}, LL0/L;->b()LY0/d;

    move-result-object v1

    invoke-interface {v1}, LY0/l;->y()F

    move-result v1

    mul-float/2addr v2, v1

    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1, v1, v1}, Landroidx/compose/ui/platform/coreshims/e;->g(FIII)V

    :cond_d
    invoke-virtual {p1}, LJ0/n;->h()Ll0/i;

    move-result-object p1

    invoke-virtual {p1}, Ll0/i;->k()F

    move-result v1

    float-to-int v6, v1

    invoke-virtual {p1}, Ll0/i;->n()F

    move-result v1

    float-to-int v7, v1

    invoke-virtual {p1}, Ll0/i;->r()F

    move-result v1

    float-to-int v10, v1

    invoke-virtual {p1}, Ll0/i;->j()F

    move-result p1

    float-to-int v11, p1

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v5, v0

    invoke-virtual/range {v5 .. v11}, Landroidx/compose/ui/platform/coreshims/e;->d(IIIIII)V

    return-object v0
.end method

.method private final D(LJ0/n;)V
    .locals 3

    invoke-virtual {p0}, Lh0/b;->n()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lh0/b;->G(LJ0/n;)V

    invoke-virtual {p1}, LJ0/n;->o()I

    move-result v0

    invoke-direct {p0, p1}, Lh0/b;->C(LJ0/n;)Landroidx/compose/ui/platform/coreshims/e;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lh0/b;->c(ILandroidx/compose/ui/platform/coreshims/e;)V

    invoke-virtual {p1}, LJ0/n;->t()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LJ0/n;

    invoke-direct {p0, v2}, Lh0/b;->D(LJ0/n;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final E(LJ0/n;)V
    .locals 3

    invoke-virtual {p0}, Lh0/b;->n()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, LJ0/n;->o()I

    move-result v0

    invoke-direct {p0, v0}, Lh0/b;->d(I)V

    invoke-virtual {p1}, LJ0/n;->t()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LJ0/n;

    invoke-direct {p0, v2}, Lh0/b;->E(LJ0/n;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final F()V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lh0/b;->n:Lo/z;

    invoke-virtual {v1}, Lo/z;->i()V

    invoke-virtual/range {p0 .. p0}, Lh0/b;->k()Lo/m;

    move-result-object v1

    iget-object v2, v1, Lo/m;->b:[I

    iget-object v3, v1, Lo/m;->c:[Ljava/lang/Object;

    iget-object v1, v1, Lo/m;->a:[J

    array-length v4, v1

    add-int/lit8 v4, v4, -0x2

    if-ltz v4, :cond_3

    const/4 v6, 0x0

    :goto_0
    aget-wide v7, v1, v6

    not-long v9, v7

    const/4 v11, 0x7

    shl-long/2addr v9, v11

    and-long/2addr v9, v7

    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v9, v11

    cmp-long v9, v9, v11

    if-eqz v9, :cond_2

    sub-int v9, v6, v4

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v9, :cond_1

    const-wide/16 v12, 0xff

    and-long/2addr v12, v7

    const-wide/16 v14, 0x80

    cmp-long v12, v12, v14

    if-gez v12, :cond_0

    shl-int/lit8 v12, v6, 0x3

    add-int/2addr v12, v11

    aget v13, v2, v12

    aget-object v12, v3, v12

    check-cast v12, Landroidx/compose/ui/platform/k1;

    iget-object v14, v0, Lh0/b;->n:Lo/z;

    new-instance v15, Landroidx/compose/ui/platform/j1;

    invoke-virtual {v12}, Landroidx/compose/ui/platform/k1;->b()LJ0/n;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lh0/b;->k()Lo/m;

    move-result-object v5

    invoke-direct {v15, v12, v5}, Landroidx/compose/ui/platform/j1;-><init>(LJ0/n;Lo/m;)V

    invoke-virtual {v14, v13, v15}, Lo/z;->t(ILjava/lang/Object;)V

    :cond_0
    shr-long/2addr v7, v10

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_1
    if-ne v9, v10, :cond_3

    :cond_2
    if-eq v6, v4, :cond_3

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    new-instance v1, Landroidx/compose/ui/platform/j1;

    iget-object v2, v0, Lh0/b;->a:Landroidx/compose/ui/platform/r;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/r;->getSemanticsOwner()LJ0/p;

    move-result-object v2

    invoke-virtual {v2}, LJ0/p;->a()LJ0/n;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lh0/b;->k()Lo/m;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroidx/compose/ui/platform/j1;-><init>(LJ0/n;Lo/m;)V

    iput-object v1, v0, Lh0/b;->o:Landroidx/compose/ui/platform/j1;

    return-void
.end method

.method private final G(LJ0/n;)V
    .locals 3

    invoke-virtual {p1}, LJ0/n;->w()LJ0/j;

    move-result-object p1

    sget-object v0, LJ0/q;->a:LJ0/q;

    invoke-virtual {v0}, LJ0/q;->r()LJ0/v;

    move-result-object v0

    invoke-static {p1, v0}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    iget-object v1, p0, Lh0/b;->g:Lh0/b$a;

    sget-object v2, Lh0/b$a;->SHOW_ORIGINAL:Lh0/b$a;

    if-ne v1, v2, :cond_0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, LJ0/i;->a:LJ0/i;

    invoke-virtual {v0}, LJ0/i;->A()LJ0/v;

    move-result-object v0

    invoke-static {p1, v0}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LJ0/a;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LJ0/a;->a()LYg/i;

    move-result-object p1

    check-cast p1, Lmh/l;

    if-eqz p1, :cond_1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lh0/b;->g:Lh0/b$a;

    sget-object v2, Lh0/b$a;->SHOW_TRANSLATED:Lh0/b$a;

    if-ne v1, v2, :cond_1

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, LJ0/i;->a:LJ0/i;

    invoke-virtual {v0}, LJ0/i;->A()LJ0/v;

    move-result-object v0

    invoke-static {p1, v0}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LJ0/a;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LJ0/a;->a()LYg/i;

    move-result-object p1

    check-cast p1, Lmh/l;

    if-eqz p1, :cond_1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic a(Lh0/b;)V
    .locals 0

    invoke-static {p0}, Lh0/b;->i(Lh0/b;)V

    return-void
.end method

.method private final c(ILandroidx/compose/ui/platform/coreshims/e;)V
    .locals 1

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lh0/b;->e:Lo/A;

    invoke-virtual {v0, p1}, Lo/o;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p2, p0, Lh0/b;->e:Lo/A;

    invoke-virtual {p2, p1}, Lo/A;->q(I)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lh0/b;->d:Lo/z;

    invoke-virtual {v0, p1, p2}, Lo/z;->t(ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private final d(I)V
    .locals 1

    iget-object v0, p0, Lh0/b;->d:Lo/z;

    invoke-virtual {v0, p1}, Lo/m;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh0/b;->d:Lo/z;

    invoke-virtual {v0, p1}, Lo/z;->q(I)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lh0/b;->e:Lo/A;

    invoke-virtual {v0, p1}, Lo/A;->f(I)Z

    :goto_0
    return-void
.end method

.method private final e(Lo/m;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v1, Lo/m;->b:[I

    iget-object v3, v1, Lo/m;->a:[J

    array-length v4, v3

    add-int/lit8 v4, v4, -0x2

    if-ltz v4, :cond_d

    const/4 v6, 0x0

    :goto_0
    aget-wide v7, v3, v6

    not-long v9, v7

    const/4 v11, 0x7

    shl-long/2addr v9, v11

    and-long/2addr v9, v7

    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v9, v11

    cmp-long v9, v9, v11

    if-eqz v9, :cond_c

    sub-int v9, v6, v4

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    const/4 v11, 0x0

    :goto_1
    if-ge v11, v9, :cond_b

    const-wide/16 v12, 0xff

    and-long/2addr v12, v7

    const-wide/16 v14, 0x80

    cmp-long v12, v12, v14

    if-gez v12, :cond_a

    shl-int/lit8 v12, v6, 0x3

    add-int/2addr v12, v11

    aget v12, v2, v12

    iget-object v13, v0, Lh0/b;->n:Lo/z;

    invoke-virtual {v13, v12}, Lo/m;->c(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroidx/compose/ui/platform/j1;

    invoke-virtual {v1, v12}, Lo/m;->c(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/compose/ui/platform/k1;

    if-eqz v12, :cond_0

    invoke-virtual {v12}, Landroidx/compose/ui/platform/k1;->b()LJ0/n;

    move-result-object v12

    goto :goto_2

    :cond_0
    const/4 v12, 0x0

    :goto_2
    if-eqz v12, :cond_9

    if-nez v13, :cond_3

    invoke-virtual {v12}, LJ0/n;->w()LJ0/j;

    move-result-object v13

    invoke-virtual {v13}, LJ0/j;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_1
    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_8

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/util/Map$Entry;

    invoke-interface {v15}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v15

    sget-object v16, LJ0/q;->a:LJ0/q;

    invoke-virtual/range {v16 .. v16}, LJ0/q;->D()LJ0/v;

    move-result-object v5

    invoke-static {v15, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v12}, LJ0/n;->w()LJ0/j;

    move-result-object v5

    invoke-virtual/range {v16 .. v16}, LJ0/q;->D()LJ0/v;

    move-result-object v15

    invoke-static {v5, v15}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    if-eqz v5, :cond_2

    invoke-static {v5}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LL0/d;

    goto :goto_4

    :cond_2
    const/4 v5, 0x0

    :goto_4
    invoke-virtual {v12}, LJ0/n;->o()I

    move-result v15

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v15, v5}, Lh0/b;->z(ILjava/lang/String;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v12}, LJ0/n;->w()LJ0/j;

    move-result-object v5

    invoke-virtual {v5}, LJ0/j;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_4
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/util/Map$Entry;

    invoke-interface {v15}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, LJ0/v;

    sget-object v16, LJ0/q;->a:LJ0/q;

    invoke-virtual/range {v16 .. v16}, LJ0/q;->D()LJ0/v;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_4

    invoke-virtual {v13}, Landroidx/compose/ui/platform/j1;->b()LJ0/j;

    move-result-object v14

    invoke-virtual/range {v16 .. v16}, LJ0/q;->D()LJ0/v;

    move-result-object v15

    invoke-static {v14, v15}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/List;

    if-eqz v14, :cond_5

    invoke-static {v14}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LL0/d;

    goto :goto_6

    :cond_5
    const/4 v14, 0x0

    :goto_6
    invoke-virtual {v12}, LJ0/n;->w()LJ0/j;

    move-result-object v15

    invoke-virtual/range {v16 .. v16}, LJ0/q;->D()LJ0/v;

    move-result-object v10

    invoke-static {v15, v10}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/List;

    if-eqz v10, :cond_6

    invoke-static {v10}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LL0/d;

    goto :goto_7

    :cond_6
    const/4 v10, 0x0

    :goto_7
    invoke-static {v14, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_7

    invoke-virtual {v12}, LJ0/n;->o()I

    move-result v14

    invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-direct {v0, v14, v10}, Lh0/b;->z(ILjava/lang/String;)V

    :cond_7
    const/16 v10, 0x8

    goto :goto_5

    :cond_8
    const/16 v5, 0x8

    goto :goto_8

    :cond_9
    const-string v1, "no value for specified key"

    invoke-static {v1}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v1, Lkotlin/KotlinNothingValueException;

    invoke-direct {v1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v1

    :cond_a
    move v5, v10

    :goto_8
    shr-long/2addr v7, v5

    add-int/lit8 v11, v11, 0x1

    move v10, v5

    goto/16 :goto_1

    :cond_b
    move v5, v10

    if-ne v9, v5, :cond_d

    :cond_c
    if-eq v6, v4, :cond_d

    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    :cond_d
    return-void
.end method

.method private final f()V
    .locals 14

    invoke-virtual {p0}, Lh0/b;->k()Lo/m;

    move-result-object v0

    iget-object v1, v0, Lo/m;->c:[Ljava/lang/Object;

    iget-object v0, v0, Lo/m;->a:[J

    array-length v2, v0

    add-int/lit8 v2, v2, -0x2

    if-ltz v2, :cond_3

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    aget-wide v5, v0, v4

    not-long v7, v5

    const/4 v9, 0x7

    shl-long/2addr v7, v9

    and-long/2addr v7, v5

    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v7, v9

    cmp-long v7, v7, v9

    if-eqz v7, :cond_2

    sub-int v7, v4, v2

    not-int v7, v7

    ushr-int/lit8 v7, v7, 0x1f

    const/16 v8, 0x8

    rsub-int/lit8 v7, v7, 0x8

    move v9, v3

    :goto_1
    if-ge v9, v7, :cond_1

    const-wide/16 v10, 0xff

    and-long/2addr v10, v5

    const-wide/16 v12, 0x80

    cmp-long v10, v10, v12

    if-gez v10, :cond_0

    shl-int/lit8 v10, v4, 0x3

    add-int/2addr v10, v9

    aget-object v10, v1, v10

    check-cast v10, Landroidx/compose/ui/platform/k1;

    invoke-virtual {v10}, Landroidx/compose/ui/platform/k1;->b()LJ0/n;

    move-result-object v10

    invoke-virtual {v10}, LJ0/n;->w()LJ0/j;

    move-result-object v10

    sget-object v11, LJ0/q;->a:LJ0/q;

    invoke-virtual {v11}, LJ0/q;->r()LJ0/v;

    move-result-object v11

    invoke-static {v10, v11}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v11

    if-eqz v11, :cond_0

    sget-object v11, LJ0/i;->a:LJ0/i;

    invoke-virtual {v11}, LJ0/i;->a()LJ0/v;

    move-result-object v11

    invoke-static {v10, v11}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LJ0/a;

    if-eqz v10, :cond_0

    invoke-virtual {v10}, LJ0/a;->a()LYg/i;

    move-result-object v10

    check-cast v10, Lmh/a;

    if-eqz v10, :cond_0

    invoke-interface {v10}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Boolean;

    :cond_0
    shr-long/2addr v5, v8

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_1
    if-ne v7, v8, :cond_3

    :cond_2
    if-eq v4, v2, :cond_3

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method private static final i(Lh0/b;)V
    .locals 4

    invoke-virtual {p0}, Lh0/b;->n()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lh0/b;->a:Landroidx/compose/ui/platform/r;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, LE0/m0;->f(LE0/m0;ZILjava/lang/Object;)V

    iget-object v0, p0, Lh0/b;->a:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/r;->getSemanticsOwner()LJ0/p;

    move-result-object v0

    invoke-virtual {v0}, LJ0/p;->a()LJ0/n;

    move-result-object v0

    iget-object v1, p0, Lh0/b;->o:Landroidx/compose/ui/platform/j1;

    invoke-direct {p0, v0, v1}, Lh0/b;->A(LJ0/n;Landroidx/compose/ui/platform/j1;)V

    iget-object v0, p0, Lh0/b;->a:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/r;->getSemanticsOwner()LJ0/p;

    move-result-object v0

    invoke-virtual {v0}, LJ0/p;->a()LJ0/n;

    move-result-object v0

    iget-object v1, p0, Lh0/b;->o:Landroidx/compose/ui/platform/j1;

    invoke-direct {p0, v0, v1}, Lh0/b;->y(LJ0/n;Landroidx/compose/ui/platform/j1;)V

    invoke-virtual {p0}, Lh0/b;->k()Lo/m;

    move-result-object v0

    invoke-direct {p0, v0}, Lh0/b;->e(Lo/m;)V

    invoke-direct {p0}, Lh0/b;->F()V

    iput-boolean v3, p0, Lh0/b;->p:Z

    return-void
.end method

.method private final m()V
    .locals 14

    invoke-virtual {p0}, Lh0/b;->k()Lo/m;

    move-result-object v0

    iget-object v1, v0, Lo/m;->c:[Ljava/lang/Object;

    iget-object v0, v0, Lo/m;->a:[J

    array-length v2, v0

    add-int/lit8 v2, v2, -0x2

    if-ltz v2, :cond_3

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    aget-wide v5, v0, v4

    not-long v7, v5

    const/4 v9, 0x7

    shl-long/2addr v7, v9

    and-long/2addr v7, v5

    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v7, v9

    cmp-long v7, v7, v9

    if-eqz v7, :cond_2

    sub-int v7, v4, v2

    not-int v7, v7

    ushr-int/lit8 v7, v7, 0x1f

    const/16 v8, 0x8

    rsub-int/lit8 v7, v7, 0x8

    move v9, v3

    :goto_1
    if-ge v9, v7, :cond_1

    const-wide/16 v10, 0xff

    and-long/2addr v10, v5

    const-wide/16 v12, 0x80

    cmp-long v10, v10, v12

    if-gez v10, :cond_0

    shl-int/lit8 v10, v4, 0x3

    add-int/2addr v10, v9

    aget-object v10, v1, v10

    check-cast v10, Landroidx/compose/ui/platform/k1;

    invoke-virtual {v10}, Landroidx/compose/ui/platform/k1;->b()LJ0/n;

    move-result-object v10

    invoke-virtual {v10}, LJ0/n;->w()LJ0/j;

    move-result-object v10

    sget-object v11, LJ0/q;->a:LJ0/q;

    invoke-virtual {v11}, LJ0/q;->r()LJ0/v;

    move-result-object v11

    invoke-static {v10, v11}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v11

    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v11, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    sget-object v11, LJ0/i;->a:LJ0/i;

    invoke-virtual {v11}, LJ0/i;->A()LJ0/v;

    move-result-object v11

    invoke-static {v10, v11}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LJ0/a;

    if-eqz v10, :cond_0

    invoke-virtual {v10}, LJ0/a;->a()LYg/i;

    move-result-object v10

    check-cast v10, Lmh/l;

    if-eqz v10, :cond_0

    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v10, v11}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Boolean;

    :cond_0
    shr-long/2addr v5, v8

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_1
    if-ne v7, v8, :cond_3

    :cond_2
    if-eq v4, v2, :cond_3

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method private final o()V
    .locals 22

    move-object/from16 v0, p0

    iget-object v1, v0, Lh0/b;->c:Landroidx/compose/ui/platform/coreshims/c;

    if-nez v1, :cond_0

    return-void

    :cond_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-ge v2, v3, :cond_1

    return-void

    :cond_1
    iget-object v2, v0, Lh0/b;->d:Lo/z;

    invoke-virtual {v2}, Lo/m;->g()Z

    move-result v2

    const-wide/16 v5, 0xff

    const/4 v7, 0x7

    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/16 v10, 0x8

    if-eqz v2, :cond_7

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v12, v0, Lh0/b;->d:Lo/z;

    iget-object v13, v12, Lo/m;->c:[Ljava/lang/Object;

    iget-object v12, v12, Lo/m;->a:[J

    array-length v14, v12

    add-int/lit8 v14, v14, -0x2

    if-ltz v14, :cond_5

    const/4 v15, 0x0

    :goto_0
    aget-wide v3, v12, v15

    move-object/from16 v18, v12

    not-long v11, v3

    shl-long/2addr v11, v7

    and-long/2addr v11, v3

    and-long/2addr v11, v8

    cmp-long v11, v11, v8

    if-eqz v11, :cond_4

    sub-int v11, v15, v14

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    rsub-int/lit8 v11, v11, 0x8

    const/4 v12, 0x0

    :goto_1
    if-ge v12, v11, :cond_3

    and-long v19, v3, v5

    const-wide/16 v16, 0x80

    cmp-long v19, v19, v16

    if-gez v19, :cond_2

    shl-int/lit8 v19, v15, 0x3

    add-int v19, v19, v12

    aget-object v19, v13, v19

    move-object/from16 v5, v19

    check-cast v5, Landroidx/compose/ui/platform/coreshims/e;

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    shr-long/2addr v3, v10

    add-int/lit8 v12, v12, 0x1

    const-wide/16 v5, 0xff

    goto :goto_1

    :cond_3
    if-ne v11, v10, :cond_5

    :cond_4
    if-eq v15, v14, :cond_5

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v12, v18

    const-wide/16 v5, 0xff

    goto :goto_0

    :cond_5
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v4, :cond_6

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/compose/ui/platform/coreshims/e;

    invoke-virtual {v6}, Landroidx/compose/ui/platform/coreshims/e;->h()Landroid/view/ViewStructure;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_6
    invoke-virtual {v1, v3}, Landroidx/compose/ui/platform/coreshims/c;->d(Ljava/util/List;)V

    iget-object v2, v0, Lh0/b;->d:Lo/z;

    invoke-virtual {v2}, Lo/z;->i()V

    :cond_7
    iget-object v2, v0, Lh0/b;->e:Lo/A;

    invoke-virtual {v2}, Lo/o;->c()Z

    move-result v2

    if-eqz v2, :cond_d

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, v0, Lh0/b;->e:Lo/A;

    iget-object v4, v3, Lo/o;->b:[I

    iget-object v3, v3, Lo/o;->a:[J

    array-length v5, v3

    add-int/lit8 v5, v5, -0x2

    if-ltz v5, :cond_b

    const/4 v6, 0x0

    :goto_3
    aget-wide v11, v3, v6

    not-long v13, v11

    shl-long/2addr v13, v7

    and-long/2addr v13, v11

    and-long/2addr v13, v8

    cmp-long v13, v13, v8

    if-eqz v13, :cond_a

    sub-int v13, v6, v5

    not-int v13, v13

    ushr-int/lit8 v13, v13, 0x1f

    rsub-int/lit8 v13, v13, 0x8

    const/4 v14, 0x0

    :goto_4
    if-ge v14, v13, :cond_9

    const-wide/16 v18, 0xff

    and-long v20, v11, v18

    const-wide/16 v15, 0x80

    cmp-long v17, v20, v15

    if-gez v17, :cond_8

    shl-int/lit8 v17, v6, 0x3

    add-int v17, v17, v14

    aget v17, v4, v17

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    shr-long/2addr v11, v10

    add-int/lit8 v14, v14, 0x1

    const/4 v7, 0x7

    goto :goto_4

    :cond_9
    const-wide/16 v15, 0x80

    const-wide/16 v18, 0xff

    if-ne v13, v10, :cond_b

    goto :goto_5

    :cond_a
    const-wide/16 v15, 0x80

    const-wide/16 v18, 0xff

    :goto_5
    if-eq v6, v5, :cond_b

    add-int/lit8 v6, v6, 0x1

    const/4 v7, 0x7

    goto :goto_3

    :cond_b
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v11, 0x0

    :goto_6
    if-ge v11, v4, :cond_c

    invoke-interface {v2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    int-to-long v5, v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    goto :goto_6

    :cond_c
    invoke-static {v3}, LZg/v;->j1(Ljava/util/Collection;)[J

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/compose/ui/platform/coreshims/c;->e([J)V

    iget-object v1, v0, Lh0/b;->e:Lo/A;

    invoke-virtual {v1}, Lo/A;->h()V

    :cond_d
    return-void
.end method

.method private final q(LE0/G;)V
    .locals 1

    iget-object v0, p0, Lh0/b;->i:Lo/b;

    invoke-virtual {v0, p1}, Lo/b;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lh0/b;->j:LKi/g;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-interface {p1, v0}, LKi/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private final y(LJ0/n;Landroidx/compose/ui/platform/j1;)V
    .locals 13

    invoke-virtual {p1}, LJ0/n;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LJ0/n;

    invoke-virtual {p0}, Lh0/b;->k()Lo/m;

    move-result-object v5

    invoke-virtual {v4}, LJ0/n;->o()I

    move-result v6

    invoke-virtual {v5, v6}, Lo/m;->a(I)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {p2}, Landroidx/compose/ui/platform/j1;->a()Lo/A;

    move-result-object v5

    invoke-virtual {v4}, LJ0/n;->o()I

    move-result v6

    invoke-virtual {v5, v6}, Lo/o;->a(I)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-direct {p0, v4}, Lh0/b;->D(LJ0/n;)V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lh0/b;->n:Lo/z;

    iget-object v0, p2, Lo/m;->b:[I

    iget-object p2, p2, Lo/m;->a:[J

    array-length v1, p2

    add-int/lit8 v1, v1, -0x2

    if-ltz v1, :cond_5

    move v3, v2

    :goto_1
    aget-wide v4, p2, v3

    not-long v6, v4

    const/4 v8, 0x7

    shl-long/2addr v6, v8

    and-long/2addr v6, v4

    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v6, v8

    cmp-long v6, v6, v8

    if-eqz v6, :cond_4

    sub-int v6, v3, v1

    not-int v6, v6

    ushr-int/lit8 v6, v6, 0x1f

    const/16 v7, 0x8

    rsub-int/lit8 v6, v6, 0x8

    move v8, v2

    :goto_2
    if-ge v8, v6, :cond_3

    const-wide/16 v9, 0xff

    and-long/2addr v9, v4

    const-wide/16 v11, 0x80

    cmp-long v9, v9, v11

    if-gez v9, :cond_2

    shl-int/lit8 v9, v3, 0x3

    add-int/2addr v9, v8

    aget v9, v0, v9

    invoke-virtual {p0}, Lh0/b;->k()Lo/m;

    move-result-object v10

    invoke-virtual {v10, v9}, Lo/m;->a(I)Z

    move-result v10

    if-nez v10, :cond_2

    invoke-direct {p0, v9}, Lh0/b;->d(I)V

    :cond_2
    shr-long/2addr v4, v7

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_3
    if-ne v6, v7, :cond_5

    :cond_4
    if-eq v3, v1, :cond_5

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {p1}, LJ0/n;->t()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    :goto_3
    if-ge v2, p2, :cond_8

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ0/n;

    invoke-virtual {p0}, Lh0/b;->k()Lo/m;

    move-result-object v1

    invoke-virtual {v0}, LJ0/n;->o()I

    move-result v3

    invoke-virtual {v1, v3}, Lo/m;->a(I)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, Lh0/b;->n:Lo/z;

    invoke-virtual {v0}, LJ0/n;->o()I

    move-result v3

    invoke-virtual {v1, v3}, Lo/m;->a(I)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, Lh0/b;->n:Lo/z;

    invoke-virtual {v0}, LJ0/n;->o()I

    move-result v3

    invoke-virtual {v1, v3}, Lo/m;->c(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_6

    check-cast v1, Landroidx/compose/ui/platform/j1;

    invoke-direct {p0, v0, v1}, Lh0/b;->y(LJ0/n;Landroidx/compose/ui/platform/j1;)V

    goto :goto_4

    :cond_6
    const-string p1, "node not present in pruned tree before this change"

    invoke-static {p1}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :cond_7
    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_8
    return-void
.end method

.method private final z(ILjava/lang/String;)V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lh0/b;->c:Landroidx/compose/ui/platform/coreshims/c;

    if-nez v0, :cond_1

    return-void

    :cond_1
    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/coreshims/c;->a(J)Landroid/view/autofill/AutofillId;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/platform/coreshims/c;->c(Landroid/view/autofill/AutofillId;Ljava/lang/CharSequence;)V

    return-void

    :cond_2
    const-string p1, "Invalid content capture ID"

    invoke-static {p1}, LB0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final b(Ldh/e;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p1, Lh0/b$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lh0/b$c;

    iget v1, v0, Lh0/b$c;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh0/b$c;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh0/b$c;

    invoke-direct {v0, p0, p1}, Lh0/b$c;-><init>(Lh0/b;Ldh/e;)V

    :goto_0
    iget-object p1, v0, Lh0/b$c;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lh0/b$c;->e:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v4, :cond_3

    if-ne v2, v3, :cond_2

    iget-object v2, v0, Lh0/b$c;->b:Ljava/lang/Object;

    check-cast v2, LKi/i;

    iget-object v5, v0, Lh0/b$c;->a:Ljava/lang/Object;

    check-cast v5, Lh0/b;

    :try_start_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    move-object p1, v2

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    iget-object v2, v0, Lh0/b$c;->b:Ljava/lang/Object;

    check-cast v2, LKi/i;

    iget-object v5, v0, Lh0/b$c;->a:Ljava/lang/Object;

    check-cast v5, Lh0/b;

    :try_start_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :cond_4
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    :try_start_2
    iget-object p1, p0, Lh0/b;->j:LKi/g;

    invoke-interface {p1}, LKi/v;->iterator()LKi/i;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object v5, p0

    :goto_1
    :try_start_3
    iput-object v5, v0, Lh0/b$c;->a:Ljava/lang/Object;

    iput-object p1, v0, Lh0/b$c;->b:Ljava/lang/Object;

    iput v4, v0, Lh0/b$c;->e:I

    invoke-interface {p1, v0}, LKi/i;->a(Ldh/e;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    return-object v1

    :cond_5
    move-object v8, v2

    move-object v2, p1

    move-object p1, v8

    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-interface {v2}, LKi/i;->next()Ljava/lang/Object;

    invoke-virtual {v5}, Lh0/b;->n()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-direct {v5}, Lh0/b;->o()V

    :cond_6
    iget-boolean p1, v5, Lh0/b;->p:Z

    if-nez p1, :cond_7

    iput-boolean v4, v5, Lh0/b;->p:Z

    iget-object p1, v5, Lh0/b;->k:Landroid/os/Handler;

    iget-object v6, v5, Lh0/b;->q:Ljava/lang/Runnable;

    invoke-virtual {p1, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_7
    iget-object p1, v5, Lh0/b;->i:Lo/b;

    invoke-virtual {p1}, Lo/b;->clear()V

    iget-wide v6, v5, Lh0/b;->f:J

    iput-object v5, v0, Lh0/b$c;->a:Ljava/lang/Object;

    iput-object v2, v0, Lh0/b$c;->b:Ljava/lang/Object;

    iput v3, v0, Lh0/b$c;->e:I

    invoke-static {v6, v7, v0}, LIi/Y;->a(JLdh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-ne p1, v1, :cond_1

    return-object v1

    :cond_8
    iget-object p1, v5, Lh0/b;->i:Lo/b;

    invoke-virtual {p1}, Lo/b;->clear()V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :catchall_1
    move-exception p1

    move-object v5, p0

    :goto_3
    iget-object v0, v5, Lh0/b;->i:Lo/b;

    invoke-virtual {v0}, Lo/b;->clear()V

    throw p1
.end method

.method public final k()Lo/m;
    .locals 2

    iget-boolean v0, p0, Lh0/b;->h:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lh0/b;->h:Z

    iget-object v0, p0, Lh0/b;->a:Landroidx/compose/ui/platform/r;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/r;->getSemanticsOwner()LJ0/p;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/platform/l1;->b(LJ0/p;)Lo/m;

    move-result-object v0

    iput-object v0, p0, Lh0/b;->l:Lo/m;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lh0/b;->m:J

    :cond_0
    iget-object v0, p0, Lh0/b;->l:Lo/m;

    return-object v0
.end method

.method public final l()Landroidx/compose/ui/platform/r;
    .locals 1

    iget-object v0, p0, Lh0/b;->a:Landroidx/compose/ui/platform/r;

    return-object v0
.end method

.method public final n()Z
    .locals 1

    sget-object v0, Lh0/l;->o0:Lh0/l$a;

    invoke-virtual {v0}, Lh0/l$a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh0/b;->c:Landroidx/compose/ui/platform/coreshims/c;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onStart(Landroidx/lifecycle/o;)V
    .locals 0

    iget-object p1, p0, Lh0/b;->b:Lmh/a;

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/platform/coreshims/c;

    iput-object p1, p0, Lh0/b;->c:Landroidx/compose/ui/platform/coreshims/c;

    iget-object p1, p0, Lh0/b;->a:Landroidx/compose/ui/platform/r;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/r;->getSemanticsOwner()LJ0/p;

    move-result-object p1

    invoke-virtual {p1}, LJ0/p;->a()LJ0/n;

    move-result-object p1

    invoke-direct {p0, p1}, Lh0/b;->D(LJ0/n;)V

    invoke-direct {p0}, Lh0/b;->o()V

    return-void
.end method

.method public onStop(Landroidx/lifecycle/o;)V
    .locals 0

    iget-object p1, p0, Lh0/b;->a:Landroidx/compose/ui/platform/r;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/r;->getSemanticsOwner()LJ0/p;

    move-result-object p1

    invoke-virtual {p1}, LJ0/p;->a()LJ0/n;

    move-result-object p1

    invoke-direct {p0, p1}, Lh0/b;->E(LJ0/n;)V

    invoke-direct {p0}, Lh0/b;->o()V

    const/4 p1, 0x0

    iput-object p1, p0, Lh0/b;->c:Landroidx/compose/ui/platform/coreshims/c;

    return-void
.end method

.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lh0/b;->k:Landroid/os/Handler;

    iget-object v0, p0, Lh0/b;->q:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lh0/b;->c:Landroidx/compose/ui/platform/coreshims/c;

    return-void
.end method

.method public final r()V
    .locals 1

    sget-object v0, Lh0/b$a;->SHOW_ORIGINAL:Lh0/b$a;

    iput-object v0, p0, Lh0/b;->g:Lh0/b$a;

    invoke-direct {p0}, Lh0/b;->f()V

    return-void
.end method

.method public final s([J[ILjava/util/function/Consumer;)V
    .locals 1

    sget-object v0, Lh0/b$b;->a:Lh0/b$b;

    invoke-virtual {v0, p0, p1, p2, p3}, Lh0/b$b;->c(Lh0/b;[J[ILjava/util/function/Consumer;)V

    return-void
.end method

.method public final t()V
    .locals 1

    sget-object v0, Lh0/b$a;->SHOW_ORIGINAL:Lh0/b$a;

    iput-object v0, p0, Lh0/b;->g:Lh0/b$a;

    invoke-direct {p0}, Lh0/b;->m()V

    return-void
.end method

.method public final u(LE0/G;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh0/b;->h:Z

    invoke-virtual {p0}, Lh0/b;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lh0/b;->q(LE0/G;)V

    :cond_0
    return-void
.end method

.method public final v()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lh0/b;->h:Z

    invoke-virtual {p0}, Lh0/b;->n()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lh0/b;->p:Z

    if-nez v1, :cond_0

    iput-boolean v0, p0, Lh0/b;->p:Z

    iget-object v0, p0, Lh0/b;->k:Landroid/os/Handler;

    iget-object v1, p0, Lh0/b;->q:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final w()V
    .locals 1

    sget-object v0, Lh0/b$a;->SHOW_TRANSLATED:Lh0/b$a;

    iput-object v0, p0, Lh0/b;->g:Lh0/b$a;

    invoke-direct {p0}, Lh0/b;->B()V

    return-void
.end method

.method public final x(Lh0/b;Landroid/util/LongSparseArray;)V
    .locals 1

    sget-object v0, Lh0/b$b;->a:Lh0/b$b;

    invoke-virtual {v0, p1, p2}, Lh0/b$b;->d(Lh0/b;Landroid/util/LongSparseArray;)V

    return-void
.end method
