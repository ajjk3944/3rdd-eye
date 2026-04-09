.class final Ly/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/m;


# instance fields
.field private final a:LLi/y;


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LKi/a;->DROP_OLDEST:LKi/a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v4, 0x10

    invoke-static {v3, v4, v0, v1, v2}, LLi/F;->b(IILKi/a;ILjava/lang/Object;)LLi/y;

    move-result-object v0

    iput-object v0, p0, Ly/n;->a:LLi/y;

    return-void
.end method


# virtual methods
.method public a(Ly/j;Ldh/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ly/n;->d()LLi/y;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LLi/y;->a(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public bridge synthetic b()LLi/g;
    .locals 1

    invoke-virtual {p0}, Ly/n;->d()LLi/y;

    move-result-object v0

    return-object v0
.end method

.method public c(Ly/j;)Z
    .locals 1

    invoke-virtual {p0}, Ly/n;->d()LLi/y;

    move-result-object v0

    invoke-interface {v0, p1}, LLi/y;->j(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public d()LLi/y;
    .locals 1

    iget-object v0, p0, Ly/n;->a:LLi/y;

    return-object v0
.end method
