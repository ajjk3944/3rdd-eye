.class final Lw/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/y;


# instance fields
.field private final a:Lmh/l;

.field private final b:Lw/v;

.field private final c:Ls/M;

.field private final d:LT/q0;

.field private final e:LT/q0;

.field private final f:LT/q0;


# direct methods
.method public constructor <init>(Lmh/l;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/i;->a:Lmh/l;

    new-instance p1, Lw/i$b;

    invoke-direct {p1, p0}, Lw/i$b;-><init>(Lw/i;)V

    iput-object p1, p0, Lw/i;->b:Lw/v;

    new-instance p1, Ls/M;

    invoke-direct {p1}, Ls/M;-><init>()V

    iput-object p1, p0, Lw/i;->c:Ls/M;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, v0, v1, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v2

    iput-object v2, p0, Lw/i;->d:LT/q0;

    invoke-static {p1, v0, v1, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v2

    iput-object v2, p0, Lw/i;->e:LT/q0;

    invoke-static {p1, v0, v1, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, Lw/i;->f:LT/q0;

    return-void
.end method

.method public static final synthetic g(Lw/i;)Ls/M;
    .locals 0

    iget-object p0, p0, Lw/i;->c:Ls/M;

    return-object p0
.end method

.method public static final synthetic h(Lw/i;)Lw/v;
    .locals 0

    iget-object p0, p0, Lw/i;->b:Lw/v;

    return-object p0
.end method

.method public static final synthetic i(Lw/i;)LT/q0;
    .locals 0

    iget-object p0, p0, Lw/i;->f:LT/q0;

    return-object p0
.end method

.method public static final synthetic j(Lw/i;)LT/q0;
    .locals 0

    iget-object p0, p0, Lw/i;->e:LT/q0;

    return-object p0
.end method

.method public static final synthetic k(Lw/i;)LT/q0;
    .locals 0

    iget-object p0, p0, Lw/i;->d:LT/q0;

    return-object p0
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lw/i;->d:LT/q0;

    invoke-interface {v0}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public c(Ls/L;Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lw/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lw/i$a;-><init>(Lw/i;Ls/L;Lmh/p;Ldh/e;)V

    invoke-static {v0, p3}, LIi/O;->g(Lmh/p;Ldh/e;)Ljava/lang/Object;

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

    iget-object v0, p0, Lw/i;->a:Lmh/l;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    return p1
.end method

.method public final l()Lmh/l;
    .locals 1

    iget-object v0, p0, Lw/i;->a:Lmh/l;

    return-object v0
.end method
