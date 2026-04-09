.class public final LO5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/y;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO5/c$a;
    }
.end annotation


# instance fields
.field private final a:LT/q0;

.field private final b:LT/q0;

.field private final c:Ljava/util/Set;

.field private d:Z

.field private final e:Lw/y;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v3

    iput-object v3, p0, LO5/c;->a:LT/q0;

    invoke-static {v0, v1, v2, v1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    iput-object v0, p0, LO5/c;->b:LT/q0;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, LO5/c;->c:Ljava/util/Set;

    new-instance v0, LO5/c$b;

    invoke-direct {v0, p0}, LO5/c$b;-><init>(LO5/c;)V

    invoke-static {v0}, Lw/z;->a(Lmh/l;)Lw/y;

    move-result-object v0

    iput-object v0, p0, LO5/c;->e:Lw/y;

    return-void
.end method

.method public static final synthetic g(LO5/c;F)V
    .locals 0

    invoke-direct {p0, p1}, LO5/c;->m(F)V

    return-void
.end method

.method private final m(F)V
    .locals 3

    invoke-virtual {p0}, LO5/c;->i()F

    move-result v0

    iget-object v1, p0, LO5/c;->a:LT/q0;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v1, v2}, LT/q0;->setValue(Ljava/lang/Object;)V

    iget-object v1, p0, LO5/c;->c:Ljava/util/Set;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LE6/e;

    invoke-interface {v2, v0, p1}, LE6/e;->b(FF)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, LO5/c;->e:Lw/y;

    invoke-interface {v0}, Lw/y;->a()Z

    move-result v0

    return v0
.end method

.method public c(Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LO5/c;->e:Lw/y;

    invoke-interface {v0, p1, p2, p3}, Lw/y;->c(Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public f(F)F
    .locals 1

    iget-object v0, p0, LO5/c;->e:Lw/y;

    invoke-interface {v0, p1}, Lw/y;->f(F)F

    move-result p1

    return p1
.end method

.method public final h()F
    .locals 1

    iget-object v0, p0, LO5/c;->b:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method

.method public final i()F
    .locals 1

    iget-object v0, p0, LO5/c;->a:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method

.method public final j(LE6/d;)V
    .locals 2

    const-string/jumbo v0, "initialScroll"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LO5/c;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, LO5/c$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v1, 0x2

    if-ne p1, v1, :cond_1

    invoke-virtual {p0}, LO5/c;->h()F

    move-result p1

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    const/4 p1, 0x0

    :goto_0
    invoke-direct {p0, p1}, LO5/c;->m(F)V

    iput-boolean v0, p0, LO5/c;->d:Z

    return-void
.end method

.method public k(LE6/e;)V
    .locals 2

    const-string/jumbo v0, "scrollListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LO5/c;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LO5/c;->i()F

    move-result v0

    invoke-virtual {p0}, LO5/c;->i()F

    move-result v1

    invoke-interface {p1, v0, v1}, LE6/e;->b(FF)V

    invoke-virtual {p0}, LO5/c;->h()F

    move-result v0

    invoke-virtual {p0}, LO5/c;->h()F

    move-result v1

    invoke-interface {p1, v0, v1}, LE6/e;->a(FF)V

    :cond_0
    return-void
.end method

.method public final l(F)V
    .locals 3

    invoke-virtual {p0}, LO5/c;->h()F

    move-result v0

    iget-object v1, p0, LO5/c;->b:LT/q0;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v1, v2}, LT/q0;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, LO5/c;->i()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpl-float v1, v1, v2

    if-lez v1, :cond_0

    invoke-direct {p0, p1}, LO5/c;->m(F)V

    :cond_0
    iget-object v1, p0, LO5/c;->c:Ljava/util/Set;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LE6/e;

    invoke-interface {v2, v0, p1}, LE6/e;->a(FF)V

    goto :goto_0

    :cond_1
    return-void
.end method
