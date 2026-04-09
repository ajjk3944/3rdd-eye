.class final Lcom/google/android/play/core/integrity/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/play/core/integrity/s;

.field private final b:Lcom/google/android/play/integrity/internal/n;

.field private final c:Lcom/google/android/play/integrity/internal/n;

.field private final d:Lcom/google/android/play/integrity/internal/n;

.field private final e:Lcom/google/android/play/integrity/internal/n;

.field private final f:Lcom/google/android/play/integrity/internal/n;


# direct methods
.method synthetic constructor <init>(Landroid/content/Context;Lcom/google/android/play/core/integrity/r;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/google/android/play/core/integrity/s;->a:Lcom/google/android/play/core/integrity/s;

    invoke-static {p1}, Lcom/google/android/play/integrity/internal/l;->b(Ljava/lang/Object;)Lcom/google/android/play/integrity/internal/k;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/play/core/integrity/s;->b:Lcom/google/android/play/integrity/internal/n;

    invoke-static {}, Lcom/google/android/play/core/integrity/ac;->a()Lcom/google/android/play/core/integrity/ad;

    move-result-object p2

    invoke-static {p2}, Lcom/google/android/play/integrity/internal/j;->b(Lcom/google/android/play/integrity/internal/n;)Lcom/google/android/play/integrity/internal/n;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/play/core/integrity/s;->c:Lcom/google/android/play/integrity/internal/n;

    invoke-static {}, Lcom/google/android/play/core/integrity/l;->a()Lcom/google/android/play/core/integrity/m;

    move-result-object v0

    new-instance v1, Lcom/google/android/play/core/integrity/au;

    invoke-direct {v1, p1, v0}, Lcom/google/android/play/core/integrity/au;-><init>(Lcom/google/android/play/integrity/internal/n;Lcom/google/android/play/integrity/internal/n;)V

    iput-object v1, p0, Lcom/google/android/play/core/integrity/s;->d:Lcom/google/android/play/integrity/internal/n;

    invoke-static {}, Lcom/google/android/play/core/integrity/l;->a()Lcom/google/android/play/core/integrity/m;

    move-result-object v0

    new-instance v2, Lcom/google/android/play/core/integrity/al;

    invoke-direct {v2, p1, p2, v1, v0}, Lcom/google/android/play/core/integrity/al;-><init>(Lcom/google/android/play/integrity/internal/n;Lcom/google/android/play/integrity/internal/n;Lcom/google/android/play/integrity/internal/n;Lcom/google/android/play/integrity/internal/n;)V

    invoke-static {v2}, Lcom/google/android/play/integrity/internal/j;->b(Lcom/google/android/play/integrity/internal/n;)Lcom/google/android/play/integrity/internal/n;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/play/core/integrity/s;->e:Lcom/google/android/play/integrity/internal/n;

    new-instance p2, Lcom/google/android/play/core/integrity/ab;

    invoke-direct {p2, p1}, Lcom/google/android/play/core/integrity/ab;-><init>(Lcom/google/android/play/integrity/internal/n;)V

    invoke-static {p2}, Lcom/google/android/play/integrity/internal/j;->b(Lcom/google/android/play/integrity/internal/n;)Lcom/google/android/play/integrity/internal/n;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/play/core/integrity/s;->f:Lcom/google/android/play/integrity/internal/n;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/play/core/integrity/IntegrityManager;
    .locals 1

    iget-object v0, p0, Lcom/google/android/play/core/integrity/s;->f:Lcom/google/android/play/integrity/internal/n;

    invoke-interface {v0}, Lcom/google/android/play/integrity/internal/n;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/play/core/integrity/IntegrityManager;

    return-object v0
.end method
