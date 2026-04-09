.class public Lcom/google/mlkit/vision/common/internal/VisionCommonRegistrar;
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
    .locals 2

    const-class v0, Lcom/google/mlkit/vision/common/internal/a;

    invoke-static {v0}, LF4/c;->e(Ljava/lang/Class;)LF4/c$b;

    move-result-object v0

    const-class v1, Lcom/google/mlkit/vision/common/internal/a$a;

    invoke-static {v1}, LF4/q;->m(Ljava/lang/Class;)LF4/q;

    move-result-object v1

    invoke-virtual {v0, v1}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    sget-object v1, Lcom/google/mlkit/vision/common/internal/b;->a:Lcom/google/mlkit/vision/common/internal/b;

    invoke-virtual {v0, v1}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object v0

    invoke-virtual {v0}, LF4/c$b;->c()LF4/c;

    move-result-object v0

    invoke-static {v0}, LE3/k;->y(Ljava/lang/Object;)LE3/k;

    move-result-object v0

    return-object v0
.end method
