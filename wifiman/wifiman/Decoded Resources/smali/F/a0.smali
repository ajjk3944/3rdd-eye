.class public final LF/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LF/E;

.field private final b:LM/G;

.field private final c:LR0/Q;

.field private final d:Z

.field private final e:Z

.field private final f:LM/J;

.field private final g:LR0/H;

.field private final h:LF/u0;

.field private final i:LF/n;

.field private final j:LF/x;

.field private final k:Lmh/l;

.field private final l:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(LF/E;LM/G;LR0/Q;ZZLM/J;LR0/H;LF/u0;LF/n;LF/x;Lmh/l;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LF/a0;->a:LF/E;

    .line 4
    iput-object p2, p0, LF/a0;->b:LM/G;

    .line 5
    iput-object p3, p0, LF/a0;->c:LR0/Q;

    .line 6
    iput-boolean p4, p0, LF/a0;->d:Z

    .line 7
    iput-boolean p5, p0, LF/a0;->e:Z

    .line 8
    iput-object p6, p0, LF/a0;->f:LM/J;

    .line 9
    iput-object p7, p0, LF/a0;->g:LR0/H;

    .line 10
    iput-object p8, p0, LF/a0;->h:LF/u0;

    .line 11
    iput-object p9, p0, LF/a0;->i:LF/n;

    .line 12
    iput-object p10, p0, LF/a0;->j:LF/x;

    .line 13
    iput-object p11, p0, LF/a0;->k:Lmh/l;

    .line 14
    iput p12, p0, LF/a0;->l:I

    return-void
.end method

.method public synthetic constructor <init>(LF/E;LM/G;LR0/Q;ZZLM/J;LR0/H;LF/u0;LF/n;LF/x;Lmh/l;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 23

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    .line 15
    new-instance v1, LR0/Q;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, LR0/Q;-><init>(Ljava/lang/String;JLL0/S;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v12, v1

    goto :goto_0

    :cond_0
    move-object/from16 v12, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    move v13, v1

    goto :goto_1

    :cond_1
    move/from16 v13, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    move v14, v1

    goto :goto_2

    :cond_2
    move/from16 v14, p5

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    .line 16
    sget-object v1, LR0/H;->a:LR0/H$a;

    invoke-virtual {v1}, LR0/H$a;->a()LR0/H;

    move-result-object v1

    move-object/from16 v16, v1

    goto :goto_3

    :cond_3
    move-object/from16 v16, p7

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    const/4 v1, 0x0

    move-object/from16 v17, v1

    goto :goto_4

    :cond_4
    move-object/from16 v17, p8

    :goto_4
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_5

    .line 17
    invoke-static {}, LF/z;->a()LF/x;

    move-result-object v1

    move-object/from16 v19, v1

    goto :goto_5

    :cond_5
    move-object/from16 v19, p10

    :goto_5
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_6

    .line 18
    sget-object v0, LF/a0$a;->a:LF/a0$a;

    move-object/from16 v20, v0

    goto :goto_6

    :cond_6
    move-object/from16 v20, p11

    :goto_6
    const/16 v22, 0x0

    move-object/from16 v9, p0

    move-object/from16 v10, p1

    move-object/from16 v11, p2

    move-object/from16 v15, p6

    move-object/from16 v18, p9

    move/from16 v21, p12

    .line 19
    invoke-direct/range {v9 .. v22}, LF/a0;-><init>(LF/E;LM/G;LR0/Q;ZZLM/J;LR0/H;LF/u0;LF/n;LF/x;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(LF/E;LM/G;LR0/Q;ZZLM/J;LR0/H;LF/u0;LF/n;LF/x;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p12}, LF/a0;-><init>(LF/E;LM/G;LR0/Q;ZZLM/J;LR0/H;LF/u0;LF/n;LF/x;Lmh/l;I)V

    return-void
.end method

.method public static final synthetic a(LF/a0;LR0/i;)V
    .locals 0

    invoke-direct {p0, p1}, LF/a0;->e(LR0/i;)V

    return-void
.end method

.method public static final synthetic b(LF/a0;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, LF/a0;->f(Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic c(LF/a0;)I
    .locals 0

    iget p0, p0, LF/a0;->l:I

    return p0
.end method

.method public static final synthetic d(LF/a0;)Lmh/l;
    .locals 0

    iget-object p0, p0, LF/a0;->k:Lmh/l;

    return-object p0
.end method

.method private final e(LR0/i;)V
    .locals 0

    invoke-static {p1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, LF/a0;->f(Ljava/util/List;)V

    return-void
.end method

.method private final f(Ljava/util/List;)V
    .locals 3

    iget-object v0, p0, LF/a0;->a:LF/E;

    invoke-virtual {v0}, LF/E;->n()LR0/k;

    move-result-object v0

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, LZg/v;->l1(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    new-instance v1, LR0/n;

    invoke-direct {v1}, LR0/n;-><init>()V

    const/4 v2, 0x0

    invoke-interface {p1, v2, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    invoke-virtual {v0, p1}, LR0/k;->b(Ljava/util/List;)LR0/Q;

    move-result-object p1

    iget-object v0, p0, LF/a0;->k:Lmh/l;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final g(Lmh/l;)V
    .locals 5

    new-instance v0, LM/F;

    iget-object v1, p0, LF/a0;->c:LR0/Q;

    iget-object v2, p0, LF/a0;->g:LR0/H;

    iget-object v3, p0, LF/a0;->a:LF/E;

    invoke-virtual {v3}, LF/E;->j()LF/j0;

    move-result-object v3

    iget-object v4, p0, LF/a0;->f:LM/J;

    invoke-direct {v0, v1, v2, v3, v4}, LM/F;-><init>(LR0/Q;LR0/H;LF/j0;LM/J;)V

    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, LM/b;->u()J

    move-result-wide v1

    iget-object p1, p0, LF/a0;->c:LR0/Q;

    invoke-virtual {p1}, LR0/Q;->h()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, LL0/S;->g(JJ)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0}, LM/b;->e()LL0/d;

    move-result-object p1

    iget-object v1, p0, LF/a0;->c:LR0/Q;

    invoke-virtual {v1}, LR0/Q;->f()LL0/d;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    iget-object p1, p0, LF/a0;->k:Lmh/l;

    invoke-virtual {v0}, LM/F;->Z()LR0/Q;

    move-result-object v0

    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method private final m(Landroid/view/KeyEvent;)LR0/a;
    .locals 2

    invoke-static {p1}, LF/c0;->a(Landroid/view/KeyEvent;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, LF/a0;->i:LF/n;

    invoke-virtual {v0, p1}, LF/n;->a(Landroid/view/KeyEvent;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0, p1}, LF/O;->a(Ljava/lang/StringBuilder;I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, LR0/a;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, LR0/a;-><init>(Ljava/lang/String;I)V

    return-object v0

    :cond_1
    return-object v1
.end method


# virtual methods
.method public final h()LM/G;
    .locals 1

    iget-object v0, p0, LF/a0;->b:LM/G;

    return-object v0
.end method

.method public final i()Z
    .locals 1

    iget-boolean v0, p0, LF/a0;->e:Z

    return v0
.end method

.method public final j()LF/E;
    .locals 1

    iget-object v0, p0, LF/a0;->a:LF/E;

    return-object v0
.end method

.method public final k()LF/u0;
    .locals 1

    iget-object v0, p0, LF/a0;->h:LF/u0;

    return-object v0
.end method

.method public final l(Landroid/view/KeyEvent;)Z
    .locals 4

    invoke-direct {p0, p1}, LF/a0;->m(Landroid/view/KeyEvent;)LR0/a;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-boolean p1, p0, LF/a0;->d:Z

    if-eqz p1, :cond_0

    invoke-direct {p0, v0}, LF/a0;->e(LR0/i;)V

    iget-object p1, p0, LF/a0;->f:LM/J;

    invoke-virtual {p1}, LM/J;->b()V

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    return v1

    :cond_1
    invoke-static {p1}, Lw0/d;->b(Landroid/view/KeyEvent;)I

    move-result v0

    sget-object v3, Lw0/c;->a:Lw0/c$a;

    invoke-virtual {v3}, Lw0/c$a;->a()I

    move-result v3

    invoke-static {v0, v3}, Lw0/c;->e(II)Z

    move-result v0

    if-nez v0, :cond_2

    return v2

    :cond_2
    iget-object v0, p0, LF/a0;->j:LF/x;

    invoke-interface {v0, p1}, LF/x;->a(Landroid/view/KeyEvent;)LF/v;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, LF/v;->getEditsText()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p0, LF/a0;->d:Z

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    new-instance v0, Lkotlin/jvm/internal/J;

    invoke-direct {v0}, Lkotlin/jvm/internal/J;-><init>()V

    iput-boolean v1, v0, Lkotlin/jvm/internal/J;->a:Z

    new-instance v1, LF/a0$b;

    invoke-direct {v1, p1, p0, v0}, LF/a0$b;-><init>(LF/v;LF/a0;Lkotlin/jvm/internal/J;)V

    invoke-direct {p0, v1}, LF/a0;->g(Lmh/l;)V

    iget-object p1, p0, LF/a0;->h:LF/u0;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, LF/u0;->a()V

    :cond_4
    iget-boolean p1, v0, Lkotlin/jvm/internal/J;->a:Z

    return p1

    :cond_5
    :goto_1
    return v2
.end method
