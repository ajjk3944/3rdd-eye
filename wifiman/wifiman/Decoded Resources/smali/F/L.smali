.class public final LF/L;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LT/z1;

.field private final b:LF/J;

.field private final c:LI/o;

.field private final d:Landroidx/compose/ui/e;

.field private final e:LKi/g;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LT/z1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF/L;->a:LT/z1;

    new-instance p1, LF/J;

    new-instance v0, LF/L$c;

    invoke-direct {v0, p0}, LF/L$c;-><init>(Ljava/lang/Object;)V

    invoke-direct {p1, v0}, LF/J;-><init>(Lmh/a;)V

    iput-object p1, p0, LF/L;->b:LF/J;

    new-instance p1, LF/K;

    invoke-direct {p1, p0}, LF/K;-><init>(LF/L;)V

    iput-object p1, p0, LF/L;->c:LI/o;

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    new-instance v0, LF/L$a;

    invoke-direct {v0, p0}, LF/L$a;-><init>(LF/L;)V

    invoke-static {p1, v0}, Landroidx/compose/ui/focus/b;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object p1

    iput-object p1, p0, LF/L;->d:Landroidx/compose/ui/e;

    const/4 p1, 0x0

    const/4 v0, 0x6

    const v1, 0x7fffffff

    invoke-static {v1, p1, p1, v0, p1}, LKi/j;->b(ILKi/a;Lmh/l;ILjava/lang/Object;)LKi/g;

    move-result-object p1

    iput-object p1, p0, LF/L;->e:LKi/g;

    return-void
.end method

.method public static synthetic a(LF/L;II)I
    .locals 0

    invoke-static {p0, p1, p2}, LF/L;->c(LF/L;II)I

    move-result p0

    return p0
.end method

.method public static final synthetic b(LF/L;)V
    .locals 0

    invoke-direct {p0}, LF/L;->h()V

    return-void
.end method

.method private static final c(LF/L;II)I
    .locals 1

    iget-object v0, p0, LF/L;->b:LF/J;

    invoke-virtual {v0}, LF/J;->c()I

    move-result v0

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p0, p0, LF/L;->a:LT/z1;

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Character;

    invoke-virtual {p0}, Ljava/lang/Character;->charValue()C

    move-result p2

    :goto_0
    return p2
.end method

.method private final h()V
    .locals 2

    iget-object v0, p0, LF/L;->e:LKi/g;

    sget-object v1, LYg/J;->a:LYg/J;

    invoke-interface {v0, v1}, LKi/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LKi/k;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LF/L;->b:LF/J;

    invoke-virtual {v0}, LF/J;->d()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final d()LI/o;
    .locals 1

    iget-object v0, p0, LF/L;->c:LI/o;

    return-object v0
.end method

.method public final e()Landroidx/compose/ui/e;
    .locals 1

    iget-object v0, p0, LF/L;->d:Landroidx/compose/ui/e;

    return-object v0
.end method

.method public final f()LF/J;
    .locals 1

    iget-object v0, p0, LF/L;->b:LF/J;

    return-object v0
.end method

.method public final g(Ldh/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LF/L;->e:LKi/g;

    invoke-static {v0}, LLi/i;->m(LKi/v;)LLi/g;

    move-result-object v0

    new-instance v1, LF/L$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, LF/L$b;-><init>(LF/L;Ldh/e;)V

    invoke-static {v0, v1, p1}, LLi/i;->i(LLi/g;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
