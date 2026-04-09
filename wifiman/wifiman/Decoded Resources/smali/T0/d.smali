.class public final LT0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL0/s;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LL0/U;

.field private final c:Ljava/util/List;

.field private final d:Ljava/util/List;

.field private final e:LQ0/k$b;

.field private final f:LY0/d;

.field private final g:LT0/g;

.field private final h:Ljava/lang/CharSequence;

.field private final i:LM0/H;

.field private j:LT0/s;

.field private final k:Z

.field private final l:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LL0/U;Ljava/util/List;Ljava/util/List;LQ0/k$b;LY0/d;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT0/d;->a:Ljava/lang/String;

    iput-object p2, p0, LT0/d;->b:LL0/U;

    iput-object p3, p0, LT0/d;->c:Ljava/util/List;

    iput-object p4, p0, LT0/d;->d:Ljava/util/List;

    iput-object p5, p0, LT0/d;->e:LQ0/k$b;

    iput-object p6, p0, LT0/d;->f:LY0/d;

    new-instance p1, LT0/g;

    invoke-interface {p6}, LY0/d;->getDensity()F

    move-result p4

    const/4 p5, 0x1

    invoke-direct {p1, p5, p4}, LT0/g;-><init>(IF)V

    iput-object p1, p0, LT0/d;->g:LT0/g;

    invoke-static {p2}, LT0/e;->b(LL0/U;)Z

    move-result p4

    const/4 v0, 0x0

    if-nez p4, :cond_0

    move p4, v0

    goto :goto_0

    :cond_0
    sget-object p4, LT0/m;->a:LT0/m;

    invoke-virtual {p4}, LT0/m;->a()LT/z1;

    move-result-object p4

    invoke-interface {p4}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    :goto_0
    iput-boolean p4, p0, LT0/d;->k:Z

    invoke-virtual {p2}, LL0/U;->B()I

    move-result p4

    invoke-virtual {p2}, LL0/U;->u()LS0/e;

    move-result-object v1

    invoke-static {p4, v1}, LT0/e;->d(ILS0/e;)I

    move-result p4

    iput p4, p0, LT0/d;->l:I

    new-instance v7, LT0/d$a;

    invoke-direct {v7, p0}, LT0/d$a;-><init>(LT0/d;)V

    invoke-virtual {p2}, LL0/U;->E()LW0/s;

    move-result-object p4

    invoke-static {p1, p4}, LU0/d;->e(LT0/g;LW0/s;)V

    invoke-virtual {p2}, LL0/U;->N()LL0/D;

    move-result-object p2

    move-object p4, p3

    check-cast p4, Ljava/util/Collection;

    invoke-interface {p4}, Ljava/util/Collection;->isEmpty()Z

    move-result p4

    xor-int/2addr p4, p5

    invoke-static {p1, p2, v7, p6, p4}, LU0/d;->a(LT0/g;LL0/D;Lmh/r;LY0/d;Z)LL0/D;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    add-int/2addr p2, p5

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3, p2}, Ljava/util/ArrayList;-><init>(I)V

    move p4, v0

    :goto_1
    if-ge p4, p2, :cond_2

    if-nez p4, :cond_1

    new-instance p5, LL0/d$c;

    iget-object p6, p0, LT0/d;->a:Ljava/lang/String;

    invoke-virtual {p6}, Ljava/lang/String;->length()I

    move-result p6

    invoke-direct {p5, p1, v0, p6}, LL0/d$c;-><init>(Ljava/lang/Object;II)V

    goto :goto_2

    :cond_1
    iget-object p5, p0, LT0/d;->c:Ljava/util/List;

    add-int/lit8 p6, p4, -0x1

    invoke-interface {p5, p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, LL0/d$c;

    :goto_2
    invoke-virtual {p3, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p4, p4, 0x1

    goto :goto_1

    :cond_2
    move-object v4, p3

    iget-object v1, p0, LT0/d;->a:Ljava/lang/String;

    iget-object p1, p0, LT0/d;->g:LT0/g;

    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v2

    iget-object v3, p0, LT0/d;->b:LL0/U;

    iget-object v5, p0, LT0/d;->d:Ljava/util/List;

    iget-object v6, p0, LT0/d;->f:LY0/d;

    iget-boolean v8, p0, LT0/d;->k:Z

    invoke-static/range {v1 .. v8}, LT0/c;->a(Ljava/lang/String;FLL0/U;Ljava/util/List;Ljava/util/List;LY0/d;Lmh/r;Z)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, LT0/d;->h:Ljava/lang/CharSequence;

    new-instance p2, LM0/H;

    iget-object p3, p0, LT0/d;->g:LT0/g;

    iget p4, p0, LT0/d;->l:I

    invoke-direct {p2, p1, p3, p4}, LM0/H;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V

    iput-object p2, p0, LT0/d;->i:LM0/H;

    return-void
.end method

.method public static final synthetic d(LT0/d;)LT0/s;
    .locals 0

    iget-object p0, p0, LT0/d;->j:LT0/s;

    return-object p0
.end method

.method public static final synthetic e(LT0/d;LT0/s;)V
    .locals 0

    iput-object p1, p0, LT0/d;->j:LT0/s;

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    iget-object v0, p0, LT0/d;->i:LM0/H;

    invoke-virtual {v0}, LM0/H;->c()F

    move-result v0

    return v0
.end method

.method public b()F
    .locals 1

    iget-object v0, p0, LT0/d;->i:LM0/H;

    invoke-virtual {v0}, LM0/H;->b()F

    move-result v0

    return v0
.end method

.method public c()Z
    .locals 2

    iget-object v0, p0, LT0/d;->j:LT0/s;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LT0/s;->b()Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_1

    iget-boolean v0, p0, LT0/d;->k:Z

    if-nez v0, :cond_2

    iget-object v0, p0, LT0/d;->b:LL0/U;

    invoke-static {v0}, LT0/e;->b(LL0/U;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, LT0/m;->a:LT0/m;

    invoke-virtual {v0}, LT0/m;->a()LT/z1;

    move-result-object v0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public final f()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, LT0/d;->h:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final g()LQ0/k$b;
    .locals 1

    iget-object v0, p0, LT0/d;->e:LQ0/k$b;

    return-object v0
.end method

.method public final h()LM0/H;
    .locals 1

    iget-object v0, p0, LT0/d;->i:LM0/H;

    return-object v0
.end method

.method public final i()LL0/U;
    .locals 1

    iget-object v0, p0, LT0/d;->b:LL0/U;

    return-object v0
.end method

.method public final j()I
    .locals 1

    iget v0, p0, LT0/d;->l:I

    return v0
.end method

.method public final k()LT0/g;
    .locals 1

    iget-object v0, p0, LT0/d;->g:LT0/g;

    return-object v0
.end method
