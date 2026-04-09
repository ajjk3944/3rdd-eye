.class public final synthetic Lcom/google/mlkit/vision/objects/defaults/internal/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF4/g;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LF4/d;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lcom/google/mlkit/vision/common/internal/a$a;

    const-class v1, LE5/a;

    const-class v2, Lcom/google/mlkit/vision/objects/defaults/internal/a;

    invoke-interface {p1, v2}, LF4/d;->e(Ljava/lang/Class;)Lf5/b;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/google/mlkit/vision/common/internal/a$a;-><init>(Ljava/lang/Class;Lf5/b;)V

    return-object v0
.end method
