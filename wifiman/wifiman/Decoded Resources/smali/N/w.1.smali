.class final LN/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN/w$a;
    }
.end annotation


# instance fields
.field private final a:J

.field private final b:J

.field private final c:J

.field private final d:J

.field private final e:J

.field private final f:J

.field private final g:J

.field private final h:J

.field private final i:J

.field private final j:J

.field private final k:J


# direct methods
.method private constructor <init>(JJJJJJJJJJJ)V
    .locals 3

    move-object v0, p0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-wide v1, p1

    .line 3
    iput-wide v1, v0, LN/w;->a:J

    move-wide v1, p3

    .line 4
    iput-wide v1, v0, LN/w;->b:J

    move-wide v1, p5

    .line 5
    iput-wide v1, v0, LN/w;->c:J

    move-wide v1, p7

    .line 6
    iput-wide v1, v0, LN/w;->d:J

    move-wide v1, p9

    .line 7
    iput-wide v1, v0, LN/w;->e:J

    move-wide v1, p11

    .line 8
    iput-wide v1, v0, LN/w;->f:J

    move-wide/from16 v1, p13

    .line 9
    iput-wide v1, v0, LN/w;->g:J

    move-wide/from16 v1, p15

    .line 10
    iput-wide v1, v0, LN/w;->h:J

    move-wide/from16 v1, p17

    .line 11
    iput-wide v1, v0, LN/w;->i:J

    move-wide/from16 v1, p19

    .line 12
    iput-wide v1, v0, LN/w;->j:J

    move-wide/from16 v1, p21

    .line 13
    iput-wide v1, v0, LN/w;->k:J

    return-void
.end method

.method public synthetic constructor <init>(JJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p22}, LN/w;-><init>(JJJJJJJJJJJ)V

    return-void
.end method


# virtual methods
.method public a(ZLK0/a;LT/l;I)LT/z1;
    .locals 10

    const v0, 0x321f21a5

    invoke-interface {p3, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.DefaultCheckboxColors.boxColor (Checkbox.kt:425)"

    invoke-static {v0, p4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const/4 p4, 0x3

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eqz p1, :cond_3

    sget-object v2, LN/w$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    if-eq v2, v1, :cond_2

    if-eq v2, v0, :cond_2

    if-ne v2, p4, :cond_1

    iget-wide v0, p0, LN/w;->d:J

    :goto_0
    move-wide v2, v0

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    iget-wide v0, p0, LN/w;->c:J

    goto :goto_0

    :cond_3
    sget-object v2, LN/w$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    if-eq v2, v1, :cond_6

    if-eq v2, v0, :cond_5

    if-ne v2, p4, :cond_4

    iget-wide v0, p0, LN/w;->f:J

    goto :goto_0

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    iget-wide v0, p0, LN/w;->g:J

    goto :goto_0

    :cond_6
    iget-wide v0, p0, LN/w;->e:J

    goto :goto_0

    :goto_1
    const/4 p4, 0x0

    if-eqz p1, :cond_8

    const p1, 0x1e3d03f6    # 1.0006396E-20f

    invoke-interface {p3, p1}, LT/l;->U(I)V

    sget-object p1, LK0/a;->Off:LK0/a;

    if-ne p2, p1, :cond_7

    const/16 p1, 0x64

    goto :goto_2

    :cond_7
    const/16 p1, 0x32

    :goto_2
    const/4 p2, 0x6

    const/4 v0, 0x0

    invoke-static {p1, p4, v0, p2, v0}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object v4

    const/4 v8, 0x0

    const/16 v9, 0xc

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p3

    invoke-static/range {v2 .. v9}, Lq/u;->a(JLr/i;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object p1

    invoke-interface {p3}, LT/l;->J()V

    goto :goto_3

    :cond_8
    const p1, 0x1e3fc536

    invoke-interface {p3, p1}, LT/l;->U(I)V

    invoke-static {v2, v3}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object p1

    invoke-static {p1, p3, p4}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object p1

    invoke-interface {p3}, LT/l;->J()V

    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    invoke-interface {p3}, LT/l;->J()V

    return-object p1
.end method

.method public b(ZLK0/a;LT/l;I)LT/z1;
    .locals 10

    const v0, -0x5d7afd5e

    invoke-interface {p3, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.DefaultCheckboxColors.borderColor (Checkbox.kt:450)"

    invoke-static {v0, p4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const/4 p4, 0x3

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eqz p1, :cond_3

    sget-object v2, LN/w$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    if-eq v2, v1, :cond_2

    if-eq v2, v0, :cond_2

    if-ne v2, p4, :cond_1

    iget-wide v0, p0, LN/w;->i:J

    :goto_0
    move-wide v2, v0

    goto :goto_2

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    iget-wide v0, p0, LN/w;->h:J

    goto :goto_0

    :cond_3
    sget-object v2, LN/w$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    if-eq v2, v1, :cond_6

    if-eq v2, v0, :cond_5

    if-ne v2, p4, :cond_4

    goto :goto_1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    iget-wide v0, p0, LN/w;->k:J

    goto :goto_0

    :cond_6
    :goto_1
    iget-wide v0, p0, LN/w;->j:J

    goto :goto_0

    :goto_2
    const/4 p4, 0x0

    if-eqz p1, :cond_8

    const p1, -0x321dbde9    # -4.7449776E8f

    invoke-interface {p3, p1}, LT/l;->U(I)V

    sget-object p1, LK0/a;->Off:LK0/a;

    if-ne p2, p1, :cond_7

    const/16 p1, 0x64

    goto :goto_3

    :cond_7
    const/16 p1, 0x32

    :goto_3
    const/4 p2, 0x6

    const/4 v0, 0x0

    invoke-static {p1, p4, v0, p2, v0}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object v4

    const/4 v8, 0x0

    const/16 v9, 0xc

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p3

    invoke-static/range {v2 .. v9}, Lq/u;->a(JLr/i;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object p1

    invoke-interface {p3}, LT/l;->J()V

    goto :goto_4

    :cond_8
    const p1, -0x321afca9

    invoke-interface {p3, p1}, LT/l;->U(I)V

    invoke-static {v2, v3}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object p1

    invoke-static {p1, p3, p4}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object p1

    invoke-interface {p3}, LT/l;->J()V

    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    invoke-interface {p3}, LT/l;->J()V

    return-object p1
.end method

.method public c(LK0/a;LT/l;I)LT/z1;
    .locals 10

    const v0, 0x2076cb8b

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.DefaultCheckboxColors.checkmarkColor (Checkbox.kt:413)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p3, LK0/a;->Off:LK0/a;

    if-ne p1, p3, :cond_1

    iget-wide v0, p0, LN/w;->b:J

    :goto_0
    move-wide v2, v0

    goto :goto_1

    :cond_1
    iget-wide v0, p0, LN/w;->a:J

    goto :goto_0

    :goto_1
    if-ne p1, p3, :cond_2

    const/16 p1, 0x64

    goto :goto_2

    :cond_2
    const/16 p1, 0x32

    :goto_2
    const/4 p3, 0x0

    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-static {p1, p3, v1, v0, v1}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object v4

    const/4 v8, 0x0

    const/16 v9, 0xc

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p2

    invoke-static/range {v2 .. v9}, Lq/u;->a(JLr/i;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p2}, LT/l;->J()V

    return-object p1
.end method
