.class final Ly9/s$b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly9/s$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:LT/q0;

.field final synthetic d:LT/q0;

.field final synthetic e:Lmh/r;


# direct methods
.method constructor <init>(LT/q0;LT/q0;Lmh/r;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Ly9/s$b$a;->c:LT/q0;

    iput-object p2, p0, Ly9/s$b$a;->d:LT/q0;

    iput-object p3, p0, Ly9/s$b$a;->e:Lmh/r;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 4

    new-instance v0, Ly9/s$b$a;

    iget-object v1, p0, Ly9/s$b$a;->c:LT/q0;

    iget-object v2, p0, Ly9/s$b$a;->d:LT/q0;

    iget-object v3, p0, Ly9/s$b$a;->e:Lmh/r;

    invoke-direct {v0, v1, v2, v3, p2}, Ly9/s$b$a;-><init>(LT/q0;LT/q0;Lmh/r;Ldh/e;)V

    iput-object p1, v0, Ly9/s$b$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Ly9/s$b$a;->n(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, Ly9/s$b$a;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ly9/s$b$a;->b:Ljava/lang/Object;

    iget-object v0, p0, Ly9/s$b$a;->c:LT/q0;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, LT/q0;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, Ly9/s$b$a;->d:LT/q0;

    new-instance v1, Ly9/s$b$a$a;

    iget-object v2, p0, Ly9/s$b$a;->e:Lmh/r;

    iget-object v3, p0, Ly9/s$b$a;->c:LT/q0;

    invoke-direct {v1, v2, p1, v3, v0}, Ly9/s$b$a$a;-><init>(Lmh/r;Ljava/lang/Object;LT/q0;LT/q0;)V

    const p1, 0x158e1a4f

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ly9/s$b$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Ly9/s$b$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Ly9/s$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
