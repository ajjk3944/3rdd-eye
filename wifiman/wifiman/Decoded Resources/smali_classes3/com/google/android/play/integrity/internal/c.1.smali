.class final Lcom/google/android/play/integrity/internal/c;
.super Lcom/google/android/play/integrity/internal/G;
.source "SourceFile"


# instance fields
.field final synthetic g:Lcom/google/android/play/integrity/internal/e;


# direct methods
.method constructor <init>(Lcom/google/android/play/integrity/internal/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/integrity/internal/c;->g:Lcom/google/android/play/integrity/internal/e;

    invoke-direct {p0}, Lcom/google/android/play/integrity/internal/G;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/play/integrity/internal/c;->g:Lcom/google/android/play/integrity/internal/e;

    iget-object v0, v0, Lcom/google/android/play/integrity/internal/e;->a:Lcom/google/android/play/integrity/internal/f;

    invoke-static {v0}, Lcom/google/android/play/integrity/internal/f;->s(Lcom/google/android/play/integrity/internal/f;)V

    iget-object v0, p0, Lcom/google/android/play/integrity/internal/c;->g:Lcom/google/android/play/integrity/internal/e;

    iget-object v0, v0, Lcom/google/android/play/integrity/internal/e;->a:Lcom/google/android/play/integrity/internal/f;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/play/integrity/internal/f;->n(Lcom/google/android/play/integrity/internal/f;Landroid/os/IInterface;)V

    iget-object v0, p0, Lcom/google/android/play/integrity/internal/c;->g:Lcom/google/android/play/integrity/internal/e;

    iget-object v0, v0, Lcom/google/android/play/integrity/internal/e;->a:Lcom/google/android/play/integrity/internal/f;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/play/integrity/internal/f;->m(Lcom/google/android/play/integrity/internal/f;Z)V

    return-void
.end method
