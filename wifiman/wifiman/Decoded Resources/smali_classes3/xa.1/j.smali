.class public final Lxa/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxa/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxa/j$a;
    }
.end annotation


# static fields
.field public static final g:Lxa/j$a;


# instance fields
.field private final b:Lya/n;

.field private final c:Lya/n;

.field private final d:Lxa/a$c;

.field private final e:LLi/y;

.field private final f:LLi/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxa/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxa/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lxa/j;->g:Lxa/j$a;

    return-void
.end method

.method public constructor <init>(LIi/N;Lya/n;Lya/n;Lxa/a$c;)V
    .locals 1

    const-string/jumbo v0, "externalScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "sourceRemote"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lxa/j;->b:Lya/n;

    iput-object p3, p0, Lxa/j;->c:Lya/n;

    iput-object p4, p0, Lxa/j;->d:Lxa/a$c;

    const/4 p2, 0x7

    const/4 p3, 0x0

    const/4 p4, 0x0

    invoke-static {p3, p3, p4, p2, p4}, LLi/F;->b(IILKi/a;ILjava/lang/Object;)LLi/y;

    move-result-object p2

    iput-object p2, p0, Lxa/j;->e:LLi/y;

    new-instance p3, Lxa/j$b;

    invoke-direct {p3, p4}, Lxa/j$b;-><init>(Ldh/e;)V

    invoke-static {p2, p3}, LLi/i;->I(LLi/g;Lmh/p;)LLi/g;

    move-result-object p2

    new-instance p3, Lxa/j$c;

    invoke-direct {p3, p0, p4}, Lxa/j$c;-><init>(Lxa/j;Ldh/e;)V

    invoke-static {p2, p3}, LLi/i;->J(LLi/g;Lmh/p;)LLi/g;

    move-result-object p2

    new-instance p3, Lxa/j$d;

    invoke-direct {p3, p4}, Lxa/j$d;-><init>(Ldh/e;)V

    invoke-static {p2, p3}, LLi/i;->I(LLi/g;Lmh/p;)LLi/g;

    move-result-object p2

    invoke-static {p2}, LLi/i;->n(LLi/g;)LLi/g;

    move-result-object p2

    invoke-static {p2}, LLi/i;->l(LLi/g;)LLi/g;

    move-result-object p2

    sget-object p3, LLi/J;->a:LLi/J$a;

    invoke-virtual {p3}, LLi/J$a;->d()LLi/J;

    move-result-object p3

    const/4 p4, 0x1

    invoke-static {p2, p1, p3, p4}, LLi/i;->K(LLi/g;LIi/N;LLi/J;I)LLi/D;

    move-result-object p1

    iput-object p1, p0, Lxa/j;->f:LLi/g;

    return-void
.end method

.method public static synthetic c(J)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lxa/j;->o(J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lxa/j;->n()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lxa/j;->l()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic f(Lxa/j;)LLi/y;
    .locals 0

    iget-object p0, p0, Lxa/j;->e:LLi/y;

    return-object p0
.end method

.method public static final synthetic g(Lxa/j;)Lya/n;
    .locals 0

    iget-object p0, p0, Lxa/j;->b:Lya/n;

    return-object p0
.end method

.method public static final synthetic h(Lxa/j;)Lya/n;
    .locals 0

    iget-object p0, p0, Lxa/j;->c:Lya/n;

    return-object p0
.end method

.method public static final synthetic i(Lxa/j;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lxa/j;->k(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Lxa/j;)Lwa/a;
    .locals 0

    invoke-direct {p0}, Lxa/j;->m()Lwa/a;

    move-result-object p0

    return-object p0
.end method

.method private final k(Ldh/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lxa/g;

    invoke-direct {v0}, Lxa/g;-><init>()V

    invoke-static {v0}, LBa/a;->b(Lmh/a;)V

    invoke-static {}, LIi/c0;->b()LIi/J;

    move-result-object v0

    new-instance v1, Lxa/j$e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lxa/j$e;-><init>(Lxa/j;Ldh/e;)V

    invoke-static {v0, v1, p1}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private static final l()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "ProductCatalog - Load initiated"

    return-object v0
.end method

.method private final m()Lwa/a;
    .locals 4

    new-instance v0, Lxa/f;

    iget-object v1, p0, Lxa/j;->b:Lya/n;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lya/n;->b()Lxa/a$b;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lxa/j;->c:Lya/n;

    invoke-interface {v2}, Lya/n;->b()Lxa/a$b;

    move-result-object v2

    iget-object v3, p0, Lxa/j;->d:Lxa/a$c;

    invoke-direct {v0, v1, v2, v3}, Lxa/f;-><init>(Lxa/a$b;Lxa/a$b;Lxa/a$c;)V

    return-object v0
.end method

.method private static final n()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "ProductCatalog - Sync initiated"

    return-object v0
.end method

.method private static final o(J)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "ProductCatalog - Sync finished in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " ms"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lxa/j$f;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lxa/j$f;

    iget v1, v0, Lxa/j$f;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxa/j$f;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lxa/j$f;

    invoke-direct {v0, p0, p1}, Lxa/j$f;-><init>(Lxa/j;Ldh/e;)V

    :goto_0
    iget-object p1, v0, Lxa/j$f;->a:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lxa/j$f;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance p1, Lxa/h;

    invoke-direct {p1}, Lxa/h;-><init>()V

    invoke-static {p1}, LBa/a;->b(Lmh/a;)V

    invoke-static {}, LIi/c0;->b()LIi/J;

    move-result-object p1

    new-instance v2, Lxa/j$g;

    const/4 v4, 0x0

    invoke-direct {v2, p0, v4}, Lxa/j$g;-><init>(Lxa/j;Ldh/e;)V

    iput v3, v0, Lxa/j$f;->c:I

    invoke-static {p1, v2, v0}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    new-instance p1, Lxa/i;

    invoke-direct {p1, v0, v1}, Lxa/i;-><init>(J)V

    invoke-static {p1}, LBa/a;->b(Lmh/a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public b()LLi/g;
    .locals 1

    iget-object v0, p0, Lxa/j;->f:LLi/g;

    return-object v0
.end method
