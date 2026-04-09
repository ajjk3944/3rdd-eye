.class public final synthetic Lcom/google/mlkit/vision/objects/defaults/internal/b;
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

    new-instance v0, Lcom/google/mlkit/vision/objects/defaults/internal/a;

    const-class v1, LF5/a;

    invoke-interface {p1, v1}, LF4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LF5/a;

    const-class v2, LA5/d;

    invoke-interface {p1, v2}, LF4/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LA5/d;

    invoke-direct {v0, v1, p1}, Lcom/google/mlkit/vision/objects/defaults/internal/a;-><init>(LF5/a;LA5/d;)V

    return-object v0
.end method
