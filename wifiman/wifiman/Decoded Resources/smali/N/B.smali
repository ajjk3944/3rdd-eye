.class final LN/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/S0;


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

.field private final l:J

.field private final m:J

.field private final n:J

.field private final o:J

.field private final p:J

.field private final q:J

.field private final r:J

.field private final s:J

.field private final t:J

.field private final u:J


# direct methods
.method private constructor <init>(JJJJJJJJJJJJJJJJJJJJJ)V
    .locals 3

    move-object v0, p0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-wide v1, p1

    .line 3
    iput-wide v1, v0, LN/B;->a:J

    move-wide v1, p3

    .line 4
    iput-wide v1, v0, LN/B;->b:J

    move-wide v1, p5

    .line 5
    iput-wide v1, v0, LN/B;->c:J

    move-wide v1, p7

    .line 6
    iput-wide v1, v0, LN/B;->d:J

    move-wide v1, p9

    .line 7
    iput-wide v1, v0, LN/B;->e:J

    move-wide v1, p11

    .line 8
    iput-wide v1, v0, LN/B;->f:J

    move-wide/from16 v1, p13

    .line 9
    iput-wide v1, v0, LN/B;->g:J

    move-wide/from16 v1, p15

    .line 10
    iput-wide v1, v0, LN/B;->h:J

    move-wide/from16 v1, p17

    .line 11
    iput-wide v1, v0, LN/B;->i:J

    move-wide/from16 v1, p19

    .line 12
    iput-wide v1, v0, LN/B;->j:J

    move-wide/from16 v1, p21

    .line 13
    iput-wide v1, v0, LN/B;->k:J

    move-wide/from16 v1, p23

    .line 14
    iput-wide v1, v0, LN/B;->l:J

    move-wide/from16 v1, p25

    .line 15
    iput-wide v1, v0, LN/B;->m:J

    move-wide/from16 v1, p27

    .line 16
    iput-wide v1, v0, LN/B;->n:J

    move-wide/from16 v1, p29

    .line 17
    iput-wide v1, v0, LN/B;->o:J

    move-wide/from16 v1, p31

    .line 18
    iput-wide v1, v0, LN/B;->p:J

    move-wide/from16 v1, p33

    .line 19
    iput-wide v1, v0, LN/B;->q:J

    move-wide/from16 v1, p35

    .line 20
    iput-wide v1, v0, LN/B;->r:J

    move-wide/from16 v1, p37

    .line 21
    iput-wide v1, v0, LN/B;->s:J

    move-wide/from16 v1, p39

    .line 22
    iput-wide v1, v0, LN/B;->t:J

    move-wide/from16 v1, p41

    .line 23
    iput-wide v1, v0, LN/B;->u:J

    return-void
.end method

.method public synthetic constructor <init>(JJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p42}, LN/B;-><init>(JJJJJJJJJJJJJJJJJJJJJ)V

    return-void
.end method

.method private static final i(LT/z1;)Z
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final j(LT/z1;)Z
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public a(ZLT/l;I)LT/z1;
    .locals 2

    const p1, -0x54df94fd

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.DefaultTextFieldColors.backgroundColor (TextFieldDefaults.kt:881)"

    invoke-static {p1, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-wide v0, p0, LN/B;->o:J

    invoke-static {v0, v1}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object p1

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p2}, LT/l;->J()V

    return-object p1
.end method

.method public b(ZLT/l;I)LT/z1;
    .locals 3

    const v0, 0xfc885ec

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.DefaultTextFieldColors.placeholderColor (TextFieldDefaults.kt:886)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    if-eqz p1, :cond_1

    iget-wide v0, p0, LN/B;->t:J

    goto :goto_0

    :cond_1
    iget-wide v0, p0, LN/B;->u:J

    :goto_0
    invoke-static {v0, v1}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object p1

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p2}, LT/l;->J()V

    return-object p1
.end method

.method public c(ZZLy/k;LT/l;I)LT/z1;
    .locals 2

    const p3, 0x5273c28d

    invoke-interface {p4, p3}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.DefaultTextFieldColors.trailingIconColor (TextFieldDefaults.kt:849)"

    invoke-static {p3, p5, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    if-nez p1, :cond_1

    iget-wide p1, p0, LN/B;->m:J

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    iget-wide p1, p0, LN/B;->n:J

    goto :goto_0

    :cond_2
    iget-wide p1, p0, LN/B;->l:J

    :goto_0
    invoke-static {p1, p2}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p1, p4, p2}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p4}, LT/l;->J()V

    return-object p1
.end method

.method public d(ZZLy/k;LT/l;I)LT/z1;
    .locals 3

    const v0, 0x2b568ab0

    invoke-interface {p4, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.DefaultTextFieldColors.labelColor (TextFieldDefaults.kt:895)"

    invoke-static {v0, p5, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    shr-int/lit8 p5, p5, 0x6

    and-int/lit8 p5, p5, 0xe

    invoke-static {p3, p4, p5}, Ly/f;->a(Ly/k;LT/l;I)LT/z1;

    move-result-object p3

    if-nez p1, :cond_1

    iget-wide p1, p0, LN/B;->r:J

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    iget-wide p1, p0, LN/B;->s:J

    goto :goto_0

    :cond_2
    invoke-static {p3}, LN/B;->j(LT/z1;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-wide p1, p0, LN/B;->p:J

    goto :goto_0

    :cond_3
    iget-wide p1, p0, LN/B;->q:J

    :goto_0
    invoke-static {p1, p2}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p1, p4, p2}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    invoke-interface {p4}, LT/l;->J()V

    return-object p1
.end method

.method public e(ZZLy/k;LT/l;I)LT/z1;
    .locals 9

    const v0, 0x3b86960b

    invoke-interface {p4, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.DefaultTextFieldColors.indicatorColor (TextFieldDefaults.kt:864)"

    invoke-static {v0, p5, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const/4 v0, 0x6

    shr-int/2addr p5, v0

    and-int/lit8 p5, p5, 0xe

    invoke-static {p3, p4, p5}, Ly/f;->a(Ly/k;LT/l;I)LT/z1;

    move-result-object p3

    if-nez p1, :cond_1

    iget-wide p2, p0, LN/B;->h:J

    :goto_0
    move-wide v1, p2

    goto :goto_1

    :cond_1
    if-eqz p2, :cond_2

    iget-wide p2, p0, LN/B;->g:J

    goto :goto_0

    :cond_2
    invoke-static {p3}, LN/B;->i(LT/z1;)Z

    move-result p2

    if-eqz p2, :cond_3

    iget-wide p2, p0, LN/B;->e:J

    goto :goto_0

    :cond_3
    iget-wide p2, p0, LN/B;->f:J

    goto :goto_0

    :goto_1
    const/4 p2, 0x0

    if-eqz p1, :cond_4

    const p1, 0x6031581f

    invoke-interface {p4, p1}, LT/l;->U(I)V

    const/16 p1, 0x96

    const/4 p3, 0x0

    invoke-static {p1, p2, p3, v0, p3}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object v3

    const/16 v7, 0x30

    const/16 v8, 0xc

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p4

    invoke-static/range {v1 .. v8}, Lq/u;->a(JLr/i;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object p1

    invoke-interface {p4}, LT/l;->J()V

    goto :goto_2

    :cond_4
    const p1, 0x6032e9e9

    invoke-interface {p4, p1}, LT/l;->U(I)V

    invoke-static {v1, v2}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object p1

    invoke-static {p1, p4, p2}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object p1

    invoke-interface {p4}, LT/l;->J()V

    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    invoke-interface {p4}, LT/l;->J()V

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_17

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, LN/B;

    if-eq v3, v2, :cond_1

    goto/16 :goto_0

    :cond_1
    check-cast p1, LN/B;

    iget-wide v2, p0, LN/B;->a:J

    iget-wide v4, p1, LN/B;->a:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-wide v2, p0, LN/B;->b:J

    iget-wide v4, p1, LN/B;->b:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-wide v2, p0, LN/B;->c:J

    iget-wide v4, p1, LN/B;->c:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-wide v2, p0, LN/B;->d:J

    iget-wide v4, p1, LN/B;->d:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    :cond_5
    iget-wide v2, p0, LN/B;->e:J

    iget-wide v4, p1, LN/B;->e:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result v2

    if-nez v2, :cond_6

    return v1

    :cond_6
    iget-wide v2, p0, LN/B;->f:J

    iget-wide v4, p1, LN/B;->f:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result v2

    if-nez v2, :cond_7

    return v1

    :cond_7
    iget-wide v2, p0, LN/B;->g:J

    iget-wide v4, p1, LN/B;->g:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result v2

    if-nez v2, :cond_8

    return v1

    :cond_8
    iget-wide v2, p0, LN/B;->h:J

    iget-wide v4, p1, LN/B;->h:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result v2

    if-nez v2, :cond_9

    return v1

    :cond_9
    iget-wide v2, p0, LN/B;->i:J

    iget-wide v4, p1, LN/B;->i:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result v2

    if-nez v2, :cond_a

    return v1

    :cond_a
    iget-wide v2, p0, LN/B;->j:J

    iget-wide v4, p1, LN/B;->j:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result v2

    if-nez v2, :cond_b

    return v1

    :cond_b
    iget-wide v2, p0, LN/B;->k:J

    iget-wide v4, p1, LN/B;->k:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result v2

    if-nez v2, :cond_c

    return v1

    :cond_c
    iget-wide v2, p0, LN/B;->l:J

    iget-wide v4, p1, LN/B;->l:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result v2

    if-nez v2, :cond_d

    return v1

    :cond_d
    iget-wide v2, p0, LN/B;->m:J

    iget-wide v4, p1, LN/B;->m:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result v2

    if-nez v2, :cond_e

    return v1

    :cond_e
    iget-wide v2, p0, LN/B;->n:J

    iget-wide v4, p1, LN/B;->n:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result v2

    if-nez v2, :cond_f

    return v1

    :cond_f
    iget-wide v2, p0, LN/B;->o:J

    iget-wide v4, p1, LN/B;->o:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result v2

    if-nez v2, :cond_10

    return v1

    :cond_10
    iget-wide v2, p0, LN/B;->p:J

    iget-wide v4, p1, LN/B;->p:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result v2

    if-nez v2, :cond_11

    return v1

    :cond_11
    iget-wide v2, p0, LN/B;->q:J

    iget-wide v4, p1, LN/B;->q:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result v2

    if-nez v2, :cond_12

    return v1

    :cond_12
    iget-wide v2, p0, LN/B;->r:J

    iget-wide v4, p1, LN/B;->r:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result v2

    if-nez v2, :cond_13

    return v1

    :cond_13
    iget-wide v2, p0, LN/B;->s:J

    iget-wide v4, p1, LN/B;->s:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result v2

    if-nez v2, :cond_14

    return v1

    :cond_14
    iget-wide v2, p0, LN/B;->t:J

    iget-wide v4, p1, LN/B;->t:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result v2

    if-nez v2, :cond_15

    return v1

    :cond_15
    iget-wide v2, p0, LN/B;->u:J

    iget-wide v4, p1, LN/B;->u:J

    invoke-static {v2, v3, v4, v5}, Lm0/v0;->m(JJ)Z

    move-result p1

    if-nez p1, :cond_16

    return v1

    :cond_16
    return v0

    :cond_17
    :goto_0
    return v1
.end method

.method public f(ZLT/l;I)LT/z1;
    .locals 3

    const v0, -0x5636a7d5

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.DefaultTextFieldColors.cursorColor (TextFieldDefaults.kt:913)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    if-eqz p1, :cond_1

    iget-wide v0, p0, LN/B;->d:J

    goto :goto_0

    :cond_1
    iget-wide v0, p0, LN/B;->c:J

    :goto_0
    invoke-static {v0, v1}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object p1

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p2}, LT/l;->J()V

    return-object p1
.end method

.method public g(ZLT/l;I)LT/z1;
    .locals 3

    const v0, 0x959a82

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.DefaultTextFieldColors.textColor (TextFieldDefaults.kt:908)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    if-eqz p1, :cond_1

    iget-wide v0, p0, LN/B;->a:J

    goto :goto_0

    :cond_1
    iget-wide v0, p0, LN/B;->b:J

    :goto_0
    invoke-static {v0, v1}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object p1

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p2}, LT/l;->J()V

    return-object p1
.end method

.method public h(ZZLy/k;LT/l;I)LT/z1;
    .locals 2

    const p3, -0x5a93c7e5

    invoke-interface {p4, p3}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.DefaultTextFieldColors.leadingIconColor (TextFieldDefaults.kt:822)"

    invoke-static {p3, p5, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    if-nez p1, :cond_1

    iget-wide p1, p0, LN/B;->j:J

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    iget-wide p1, p0, LN/B;->k:J

    goto :goto_0

    :cond_2
    iget-wide p1, p0, LN/B;->i:J

    :goto_0
    invoke-static {p1, p2}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p1, p4, p2}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p4}, LT/l;->J()V

    return-object p1
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, LN/B;->a:J

    invoke-static {v0, v1}, Lm0/v0;->s(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LN/B;->b:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LN/B;->c:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LN/B;->d:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LN/B;->e:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LN/B;->f:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LN/B;->g:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LN/B;->h:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LN/B;->i:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LN/B;->j:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LN/B;->k:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LN/B;->l:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LN/B;->m:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LN/B;->n:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LN/B;->o:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LN/B;->p:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LN/B;->q:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LN/B;->r:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LN/B;->s:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LN/B;->t:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LN/B;->u:J

    invoke-static {v1, v2}, Lm0/v0;->s(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
