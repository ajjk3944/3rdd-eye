.class final LIi/N0;
.super LIi/C0;
.source "SourceFile"


# instance fields
.field private final e:LIi/p;


# direct methods
.method public constructor <init>(LIi/p;)V
    .locals 0

    invoke-direct {p0}, LIi/C0;-><init>()V

    iput-object p1, p0, LIi/N0;->e:LIi/p;

    return-void
.end method


# virtual methods
.method public u()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public v(Ljava/lang/Throwable;)V
    .locals 2

    invoke-virtual {p0}, LIi/C0;->t()LIi/D0;

    move-result-object p1

    invoke-virtual {p1}, LIi/D0;->Y()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LIi/C;

    if-eqz v0, :cond_0

    iget-object v0, p0, LIi/N0;->e:LIi/p;

    sget-object v1, LYg/u;->b:LYg/u$a;

    check-cast p1, LIi/C;

    iget-object p1, p1, LIi/C;->a:Ljava/lang/Throwable;

    invoke-static {p1}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LIi/N0;->e:LIi/p;

    sget-object v1, LYg/u;->b:LYg/u$a;

    invoke-static {p1}, LIi/E0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
