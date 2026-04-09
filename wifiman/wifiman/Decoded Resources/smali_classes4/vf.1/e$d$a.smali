.class final Lvf/e$d$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvf/e$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Ljava/util/List;

.field final synthetic d:Lvf/e;

.field final synthetic e:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method constructor <init>(Ljava/util/List;Lvf/e;Ljava/util/concurrent/ConcurrentHashMap;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lvf/e$d$a;->c:Ljava/util/List;

    iput-object p2, p0, Lvf/e$d$a;->d:Lvf/e;

    iput-object p3, p0, Lvf/e$d$a;->e:Ljava/util/concurrent/ConcurrentHashMap;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 4

    new-instance v0, Lvf/e$d$a;

    iget-object v1, p0, Lvf/e$d$a;->c:Ljava/util/List;

    iget-object v2, p0, Lvf/e$d$a;->d:Lvf/e;

    iget-object v3, p0, Lvf/e$d$a;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0, v1, v2, v3, p2}, Lvf/e$d$a;-><init>(Ljava/util/List;Lvf/e;Ljava/util/concurrent/ConcurrentHashMap;Ldh/e;)V

    iput-object p1, v0, Lvf/e$d$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lvf/e$d$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, Lvf/e$d$a;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lvf/e$d$a;->b:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, LIi/N;

    new-instance v3, Lvf/e$d$a$a;

    iget-object p1, p0, Lvf/e$d$a;->c:Ljava/util/List;

    iget-object v1, p0, Lvf/e$d$a;->d:Lvf/e;

    iget-object v2, p0, Lvf/e$d$a;->e:Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v1, v2, v4}, Lvf/e$d$a$a;-><init>(Ljava/util/List;Lvf/e;Ljava/util/concurrent/ConcurrentHashMap;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lvf/e$d$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lvf/e$d$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lvf/e$d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
