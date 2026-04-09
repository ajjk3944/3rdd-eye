.class final Lcom/google/android/gms/common/api/internal/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:LN3/l;

.field final synthetic b:Lcom/google/android/gms/common/api/internal/O;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/O;LN3/l;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/M;->b:Lcom/google/android/gms/common/api/internal/O;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/M;->a:LN3/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/M;->b:Lcom/google/android/gms/common/api/internal/O;

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/M;->a:LN3/l;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/api/internal/O;->p0(Lcom/google/android/gms/common/api/internal/O;LN3/l;)V

    return-void
.end method
