.class public Lcom/google/mlkit/common/internal/CommonComponentRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 12

    sget-object v0, LA5/k;->b:LF4/c;

    const-class v1, LB5/a;

    invoke-static {v1}, LF4/c;->e(Ljava/lang/Class;)LF4/c$b;

    move-result-object v1

    const-class v2, LA5/h;

    invoke-static {v2}, LF4/q;->j(Ljava/lang/Class;)LF4/q;

    move-result-object v3

    invoke-virtual {v1, v3}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v1

    new-instance v3, Lx5/a;

    invoke-direct {v3}, Lx5/a;-><init>()V

    invoke-virtual {v1, v3}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object v1

    invoke-virtual {v1}, LF4/c$b;->c()LF4/c;

    move-result-object v1

    const-class v3, LA5/i;

    invoke-static {v3}, LF4/c;->e(Ljava/lang/Class;)LF4/c$b;

    move-result-object v4

    new-instance v5, Lx5/b;

    invoke-direct {v5}, Lx5/b;-><init>()V

    invoke-virtual {v4, v5}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object v4

    invoke-virtual {v4}, LF4/c$b;->c()LF4/c;

    move-result-object v4

    const-class v5, Lz5/c;

    invoke-static {v5}, LF4/c;->e(Ljava/lang/Class;)LF4/c$b;

    move-result-object v5

    const-class v6, Lz5/c$a;

    invoke-static {v6}, LF4/q;->m(Ljava/lang/Class;)LF4/q;

    move-result-object v7

    invoke-virtual {v5, v7}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v5

    new-instance v7, Lx5/c;

    invoke-direct {v7}, Lx5/c;-><init>()V

    invoke-virtual {v5, v7}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object v5

    invoke-virtual {v5}, LF4/c$b;->c()LF4/c;

    move-result-object v5

    const-class v7, LA5/d;

    invoke-static {v7}, LF4/c;->e(Ljava/lang/Class;)LF4/c$b;

    move-result-object v7

    invoke-static {v3}, LF4/q;->l(Ljava/lang/Class;)LF4/q;

    move-result-object v3

    invoke-virtual {v7, v3}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v3

    new-instance v7, Lx5/d;

    invoke-direct {v7}, Lx5/d;-><init>()V

    invoke-virtual {v3, v7}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object v3

    invoke-virtual {v3}, LF4/c$b;->c()LF4/c;

    move-result-object v7

    const-class v3, LA5/a;

    invoke-static {v3}, LF4/c;->e(Ljava/lang/Class;)LF4/c$b;

    move-result-object v8

    new-instance v9, Lx5/e;

    invoke-direct {v9}, Lx5/e;-><init>()V

    invoke-virtual {v8, v9}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object v8

    invoke-virtual {v8}, LF4/c$b;->c()LF4/c;

    move-result-object v8

    const-class v9, LA5/b;

    invoke-static {v9}, LF4/c;->e(Ljava/lang/Class;)LF4/c$b;

    move-result-object v9

    invoke-static {v3}, LF4/q;->j(Ljava/lang/Class;)LF4/q;

    move-result-object v3

    invoke-virtual {v9, v3}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v3

    new-instance v9, Lx5/f;

    invoke-direct {v9}, Lx5/f;-><init>()V

    invoke-virtual {v3, v9}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object v3

    invoke-virtual {v3}, LF4/c$b;->c()LF4/c;

    move-result-object v9

    const-class v3, Ly5/a;

    invoke-static {v3}, LF4/c;->e(Ljava/lang/Class;)LF4/c$b;

    move-result-object v10

    invoke-static {v2}, LF4/q;->j(Ljava/lang/Class;)LF4/q;

    move-result-object v2

    invoke-virtual {v10, v2}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v2

    new-instance v10, Lx5/g;

    invoke-direct {v10}, Lx5/g;-><init>()V

    invoke-virtual {v2, v10}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object v2

    invoke-virtual {v2}, LF4/c$b;->c()LF4/c;

    move-result-object v10

    invoke-static {v6}, LF4/c;->m(Ljava/lang/Class;)LF4/c$b;

    move-result-object v2

    invoke-static {v3}, LF4/q;->l(Ljava/lang/Class;)LF4/q;

    move-result-object v3

    invoke-virtual {v2, v3}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v2

    new-instance v3, Lx5/h;

    invoke-direct {v3}, Lx5/h;-><init>()V

    invoke-virtual {v2, v3}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object v2

    invoke-virtual {v2}, LF4/c$b;->c()LF4/c;

    move-result-object v11

    move-object v2, v4

    move-object v3, v5

    move-object v4, v7

    move-object v5, v8

    move-object v6, v9

    move-object v7, v10

    move-object v8, v11

    invoke-static/range {v0 .. v8}, LD3/e;->y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LD3/e;

    move-result-object v0

    return-object v0
.end method
