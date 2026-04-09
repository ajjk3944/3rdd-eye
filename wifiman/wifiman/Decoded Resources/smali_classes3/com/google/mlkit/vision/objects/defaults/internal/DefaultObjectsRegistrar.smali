.class public Lcom/google/mlkit/vision/objects/defaults/internal/DefaultObjectsRegistrar;
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
    .locals 4

    new-instance v0, LF3/e;

    invoke-direct {v0}, LF3/e;-><init>()V

    const-class v1, LF5/a;

    invoke-static {v1}, LF4/c;->e(Ljava/lang/Class;)LF4/c$b;

    move-result-object v2

    const-class v3, LA5/h;

    invoke-static {v3}, LF4/q;->j(Ljava/lang/Class;)LF4/q;

    move-result-object v3

    invoke-virtual {v2, v3}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v2

    new-instance v3, LF5/c;

    invoke-direct {v3}, LF5/c;-><init>()V

    invoke-virtual {v2, v3}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object v2

    invoke-virtual {v2}, LF4/c$b;->c()LF4/c;

    move-result-object v2

    invoke-virtual {v0, v2}, LF3/e;->b(Ljava/lang/Object;)LF3/e;

    const-class v2, Lcom/google/mlkit/vision/objects/defaults/internal/a;

    invoke-static {v2}, LF4/c;->e(Ljava/lang/Class;)LF4/c$b;

    move-result-object v3

    invoke-static {v1}, LF4/q;->j(Ljava/lang/Class;)LF4/q;

    move-result-object v1

    invoke-virtual {v3, v1}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v1

    const-class v3, LA5/d;

    invoke-static {v3}, LF4/q;->j(Ljava/lang/Class;)LF4/q;

    move-result-object v3

    invoke-virtual {v1, v3}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v1

    new-instance v3, Lcom/google/mlkit/vision/objects/defaults/internal/b;

    invoke-direct {v3}, Lcom/google/mlkit/vision/objects/defaults/internal/b;-><init>()V

    invoke-virtual {v1, v3}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object v1

    invoke-virtual {v1}, LF4/c$b;->c()LF4/c;

    move-result-object v1

    invoke-virtual {v0, v1}, LF3/e;->b(Ljava/lang/Object;)LF3/e;

    const-class v1, Lcom/google/mlkit/vision/common/internal/a$a;

    invoke-static {v1}, LF4/c;->m(Ljava/lang/Class;)LF4/c$b;

    move-result-object v1

    invoke-static {v2}, LF4/q;->l(Ljava/lang/Class;)LF4/q;

    move-result-object v2

    invoke-virtual {v1, v2}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v1

    new-instance v2, Lcom/google/mlkit/vision/objects/defaults/internal/c;

    invoke-direct {v2}, Lcom/google/mlkit/vision/objects/defaults/internal/c;-><init>()V

    invoke-virtual {v1, v2}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object v1

    invoke-virtual {v1}, LF4/c$b;->c()LF4/c;

    move-result-object v1

    invoke-virtual {v0, v1}, LF3/e;->b(Ljava/lang/Object;)LF3/e;

    invoke-virtual {v0}, LF3/e;->c()LF3/h;

    move-result-object v0

    return-object v0
.end method
