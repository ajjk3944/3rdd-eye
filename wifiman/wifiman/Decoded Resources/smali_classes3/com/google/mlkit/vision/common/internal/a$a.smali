.class public Lcom/google/mlkit/vision/common/internal/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/mlkit/vision/common/internal/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/Class;

.field private final b:Lf5/b;

.field private final c:I


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lf5/b;)V
    .locals 1

    const/16 v0, 0x64

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/google/mlkit/vision/common/internal/a$a;-><init>(Ljava/lang/Class;Lf5/b;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Lf5/b;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/common/internal/a$a;->a:Ljava/lang/Class;

    iput-object p2, p0, Lcom/google/mlkit/vision/common/internal/a$a;->b:Lf5/b;

    iput p3, p0, Lcom/google/mlkit/vision/common/internal/a$a;->c:I

    return-void
.end method


# virtual methods
.method final a()I
    .locals 1

    iget v0, p0, Lcom/google/mlkit/vision/common/internal/a$a;->c:I

    return v0
.end method

.method final b()Lf5/b;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/common/internal/a$a;->b:Lf5/b;

    return-object v0
.end method

.method final c()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/vision/common/internal/a$a;->a:Ljava/lang/Class;

    return-object v0
.end method
