.class public final LI/P0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/platform/L0;


# instance fields
.field private final a:Landroid/view/View;

.field private final b:LI/I0;

.field private c:Lmh/l;

.field private d:Lmh/l;

.field private e:LF/E;

.field private f:LM/G;

.field private g:Landroidx/compose/ui/platform/w1;

.field private h:LR0/Q;

.field private i:LR0/s;

.field private j:Ljava/util/List;

.field private final k:LYg/m;

.field private l:Landroid/graphics/Rect;

.field private final m:LI/M0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Lmh/l;LI/I0;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI/P0;->a:Landroid/view/View;

    iput-object p3, p0, LI/P0;->b:LI/I0;

    sget-object p1, LI/P0$c;->a:LI/P0$c;

    iput-object p1, p0, LI/P0;->c:Lmh/l;

    sget-object p1, LI/P0$d;->a:LI/P0$d;

    iput-object p1, p0, LI/P0;->d:Lmh/l;

    new-instance p1, LR0/Q;

    sget-object v0, LL0/S;->b:LL0/S$a;

    invoke-virtual {v0}, LL0/S$a;->a()J

    move-result-wide v2

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v1, ""

    const/4 v4, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, LR0/Q;-><init>(Ljava/lang/String;JLL0/S;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LI/P0;->h:LR0/Q;

    sget-object p1, LR0/s;->g:LR0/s$a;

    invoke-virtual {p1}, LR0/s$a;->a()LR0/s;

    move-result-object p1

    iput-object p1, p0, LI/P0;->i:LR0/s;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LI/P0;->j:Ljava/util/List;

    sget-object p1, LYg/q;->NONE:LYg/q;

    new-instance v0, LI/P0$a;

    invoke-direct {v0, p0}, LI/P0$a;-><init>(LI/P0;)V

    invoke-static {p1, v0}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LI/P0;->k:LYg/m;

    new-instance p1, LI/M0;

    invoke-direct {p1, p2, p3}, LI/M0;-><init>(Lmh/l;LI/I0;)V

    iput-object p1, p0, LI/P0;->m:LI/M0;

    return-void
.end method

.method public static final synthetic b(LI/P0;)Landroid/view/inputmethod/BaseInputConnection;
    .locals 0

    invoke-direct {p0}, LI/P0;->h()Landroid/view/inputmethod/BaseInputConnection;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LI/P0;)LI/M0;
    .locals 0

    iget-object p0, p0, LI/P0;->m:LI/M0;

    return-object p0
.end method

.method public static final synthetic d(LI/P0;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LI/P0;->j:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic e(LI/P0;)Lmh/l;
    .locals 0

    iget-object p0, p0, LI/P0;->c:Lmh/l;

    return-object p0
.end method

.method public static final synthetic f(LI/P0;)Lmh/l;
    .locals 0

    iget-object p0, p0, LI/P0;->d:Lmh/l;

    return-object p0
.end method

.method private final h()Landroid/view/inputmethod/BaseInputConnection;
    .locals 1

    iget-object v0, p0, LI/P0;->k:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/BaseInputConnection;

    return-object v0
.end method

.method private final k()V
    .locals 1

    iget-object v0, p0, LI/P0;->b:LI/I0;

    invoke-interface {v0}, LI/I0;->b()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 0

    invoke-virtual {p0, p1}, LI/P0;->g(Landroid/view/inputmethod/EditorInfo;)LI/V0;

    move-result-object p1

    return-object p1
.end method

.method public g(Landroid/view/inputmethod/EditorInfo;)LI/V0;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, LI/P0;->h:LR0/Q;

    invoke-virtual {v1}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v3

    iget-object v1, v0, LI/P0;->h:LR0/Q;

    invoke-virtual {v1}, LR0/Q;->h()J

    move-result-wide v4

    iget-object v6, v0, LI/P0;->i:LR0/s;

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v9}, LI/V;->c(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;JLR0/s;[Ljava/lang/String;ILjava/lang/Object;)V

    invoke-static/range {p1 .. p1}, LI/O0;->a(Landroid/view/inputmethod/EditorInfo;)V

    iget-object v11, v0, LI/P0;->h:LR0/Q;

    iget-object v1, v0, LI/P0;->i:LR0/s;

    invoke-virtual {v1}, LR0/s;->b()Z

    move-result v13

    new-instance v12, LI/P0$b;

    invoke-direct {v12, v0}, LI/P0$b;-><init>(LI/P0;)V

    iget-object v14, v0, LI/P0;->e:LF/E;

    iget-object v15, v0, LI/P0;->f:LM/G;

    iget-object v1, v0, LI/P0;->g:Landroidx/compose/ui/platform/w1;

    new-instance v2, LI/V0;

    move-object v10, v2

    move-object/from16 v16, v1

    invoke-direct/range {v10 .. v16}, LI/V0;-><init>(LR0/Q;LI/H0;ZLF/E;LM/G;Landroidx/compose/ui/platform/w1;)V

    iget-object v1, v0, LI/P0;->j:Ljava/util/List;

    new-instance v3, Ljava/lang/ref/WeakReference;

    invoke-direct {v3, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v2
.end method

.method public final i()Landroid/view/View;
    .locals 1

    iget-object v0, p0, LI/P0;->a:Landroid/view/View;

    return-object v0
.end method

.method public final j(Ll0/i;)V
    .locals 4

    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p1}, Ll0/i;->k()F

    move-result v1

    invoke-static {v1}, Loh/b;->e(F)I

    move-result v1

    invoke-virtual {p1}, Ll0/i;->n()F

    move-result v2

    invoke-static {v2}, Loh/b;->e(F)I

    move-result v2

    invoke-virtual {p1}, Ll0/i;->l()F

    move-result v3

    invoke-static {v3}, Loh/b;->e(F)I

    move-result v3

    invoke-virtual {p1}, Ll0/i;->e()F

    move-result p1

    invoke-static {p1}, Loh/b;->e(F)I

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, LI/P0;->l:Landroid/graphics/Rect;

    iget-object p1, p0, LI/P0;->j:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LI/P0;->l:Landroid/graphics/Rect;

    if-eqz p1, :cond_0

    iget-object v0, p0, LI/P0;->a:Landroid/view/View;

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;)Z

    :cond_0
    return-void
.end method

.method public final l(LR0/Q;LI/N0$a;LR0/s;Lmh/l;Lmh/l;)V
    .locals 0

    iput-object p1, p0, LI/P0;->h:LR0/Q;

    iput-object p3, p0, LI/P0;->i:LR0/s;

    iput-object p4, p0, LI/P0;->c:Lmh/l;

    iput-object p5, p0, LI/P0;->d:Lmh/l;

    const/4 p1, 0x0

    if-eqz p2, :cond_0

    invoke-interface {p2}, LI/N0$a;->O1()LF/E;

    move-result-object p3

    goto :goto_0

    :cond_0
    move-object p3, p1

    :goto_0
    iput-object p3, p0, LI/P0;->e:LF/E;

    if-eqz p2, :cond_1

    invoke-interface {p2}, LI/N0$a;->A0()LM/G;

    move-result-object p3

    goto :goto_1

    :cond_1
    move-object p3, p1

    :goto_1
    iput-object p3, p0, LI/P0;->f:LM/G;

    if-eqz p2, :cond_2

    invoke-interface {p2}, LI/N0$a;->getViewConfiguration()Landroidx/compose/ui/platform/w1;

    move-result-object p1

    :cond_2
    iput-object p1, p0, LI/P0;->g:Landroidx/compose/ui/platform/w1;

    return-void
.end method

.method public final m(LR0/Q;LR0/Q;)V
    .locals 6

    iget-object v0, p0, LI/P0;->h:LR0/Q;

    invoke-virtual {v0}, LR0/Q;->h()J

    move-result-wide v0

    invoke-virtual {p2}, LR0/Q;->h()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LL0/S;->g(JJ)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, LI/P0;->h:LR0/Q;

    invoke-virtual {v0}, LR0/Q;->g()LL0/S;

    move-result-object v0

    invoke-virtual {p2}, LR0/Q;->g()LL0/S;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iput-object p2, p0, LI/P0;->h:LR0/Q;

    iget-object v2, p0, LI/P0;->j:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    move v3, v1

    :goto_2
    if-ge v3, v2, :cond_3

    iget-object v4, p0, LI/P0;->j:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LI/V0;

    if-nez v4, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v4, p2}, LI/V0;->g(LR0/Q;)V

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    iget-object v2, p0, LI/P0;->m:LI/M0;

    invoke-virtual {v2}, LI/M0;->a()V

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    if-eqz v0, :cond_6

    iget-object p1, p0, LI/P0;->b:LI/I0;

    invoke-virtual {p2}, LR0/Q;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->l(J)I

    move-result v0

    invoke-virtual {p2}, LR0/Q;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->k(J)I

    move-result p2

    iget-object v1, p0, LI/P0;->h:LR0/Q;

    invoke-virtual {v1}, LR0/Q;->g()LL0/S;

    move-result-object v1

    const/4 v2, -0x1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, LL0/S;->r()J

    move-result-wide v3

    invoke-static {v3, v4}, LL0/S;->l(J)I

    move-result v1

    goto :goto_4

    :cond_4
    move v1, v2

    :goto_4
    iget-object v3, p0, LI/P0;->h:LR0/Q;

    invoke-virtual {v3}, LR0/Q;->g()LL0/S;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, LL0/S;->r()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->k(J)I

    move-result v2

    :cond_5
    invoke-interface {p1, v0, p2, v1, v2}, LI/I0;->a(IIII)V

    :cond_6
    return-void

    :cond_7
    if-eqz p1, :cond_9

    invoke-virtual {p1}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p1}, LR0/Q;->h()J

    move-result-wide v2

    invoke-virtual {p2}, LR0/Q;->h()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, LL0/S;->g(JJ)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p1}, LR0/Q;->g()LL0/S;

    move-result-object p1

    invoke-virtual {p2}, LR0/Q;->g()LL0/S;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    :cond_8
    invoke-direct {p0}, LI/P0;->k()V

    goto :goto_6

    :cond_9
    iget-object p1, p0, LI/P0;->j:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    :goto_5
    if-ge v1, p1, :cond_b

    iget-object p2, p0, LI/P0;->j:Ljava/util/List;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LI/V0;

    if-eqz p2, :cond_a

    iget-object v0, p0, LI/P0;->h:LR0/Q;

    iget-object v2, p0, LI/P0;->b:LI/I0;

    invoke-virtual {p2, v0, v2}, LI/V0;->h(LR0/Q;LI/I0;)V

    :cond_a
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_b
    :goto_6
    return-void
.end method

.method public final n(LR0/Q;LR0/H;LL0/M;Ll0/i;Ll0/i;)V
    .locals 6

    iget-object v0, p0, LI/P0;->m:LI/M0;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, LI/M0;->d(LR0/Q;LR0/H;LL0/M;Ll0/i;Ll0/i;)V

    return-void
.end method
