.class final LMi/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi/h;


# instance fields
.field private final a:Ldh/i;

.field private final b:Ljava/lang/Object;

.field private final c:Lmh/p;


# direct methods
.method public constructor <init>(LLi/h;Ldh/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LMi/A;->a:Ldh/i;

    invoke-static {p2}, LNi/J;->g(Ldh/i;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, p0, LMi/A;->b:Ljava/lang/Object;

    new-instance p2, LMi/A$a;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, LMi/A$a;-><init>(LLi/h;Ldh/e;)V

    iput-object p2, p0, LMi/A;->c:Lmh/p;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LMi/A;->a:Ldh/i;

    iget-object v1, p0, LMi/A;->b:Ljava/lang/Object;

    iget-object v2, p0, LMi/A;->c:Lmh/p;

    invoke-static {v0, p1, v1, v2, p2}, LMi/e;->b(Ldh/i;Ljava/lang/Object;Ljava/lang/Object;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
