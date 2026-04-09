.class final Lcom/google/android/gms/common/api/internal/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/google/android/gms/common/api/internal/z;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/z;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/w;->b:Lcom/google/android/gms/common/api/internal/z;

    iput p2, p0, Lcom/google/android/gms/common/api/internal/w;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/w;->b:Lcom/google/android/gms/common/api/internal/z;

    iget v1, p0, Lcom/google/android/gms/common/api/internal/w;->a:I

    invoke-static {v0, v1}, Lcom/google/android/gms/common/api/internal/z;->A(Lcom/google/android/gms/common/api/internal/z;I)V

    return-void
.end method
