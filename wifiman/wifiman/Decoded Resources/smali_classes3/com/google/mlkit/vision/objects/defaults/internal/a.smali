.class final Lcom/google/mlkit/vision/objects/defaults/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LF5/a;

.field private final b:LF3/T;

.field private final c:LA5/d;


# direct methods
.method constructor <init>(LF5/a;LA5/d;)V
    .locals 1

    const-string/jumbo v0, "object-detection"

    invoke-static {v0}, LF3/c0;->b(Ljava/lang/String;)LF3/T;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/objects/defaults/internal/a;->a:LF5/a;

    iput-object v0, p0, Lcom/google/mlkit/vision/objects/defaults/internal/a;->b:LF3/T;

    iput-object p2, p0, Lcom/google/mlkit/vision/objects/defaults/internal/a;->c:LA5/d;

    return-void
.end method
