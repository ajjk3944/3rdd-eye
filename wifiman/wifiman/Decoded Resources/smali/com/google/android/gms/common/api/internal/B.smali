.class final Lcom/google/android/gms/common/api/internal/B;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/common/api/internal/b;

.field private final b:Lr3/d;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/common/api/internal/b;Lr3/d;Lcom/google/android/gms/common/api/internal/A;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/B;->a:Lcom/google/android/gms/common/api/internal/b;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/B;->b:Lr3/d;

    return-void
.end method

.method static bridge synthetic a(Lcom/google/android/gms/common/api/internal/B;)Lr3/d;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/B;->b:Lr3/d;

    return-object p0
.end method

.method static bridge synthetic b(Lcom/google/android/gms/common/api/internal/B;)Lcom/google/android/gms/common/api/internal/b;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/B;->a:Lcom/google/android/gms/common/api/internal/b;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    instance-of v1, p1, Lcom/google/android/gms/common/api/internal/B;

    if-eqz v1, :cond_0

    check-cast p1, Lcom/google/android/gms/common/api/internal/B;

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/B;->a:Lcom/google/android/gms/common/api/internal/b;

    iget-object v2, p1, Lcom/google/android/gms/common/api/internal/B;->a:Lcom/google/android/gms/common/api/internal/b;

    invoke-static {v1, v2}, Ls3/o;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/B;->b:Lr3/d;

    iget-object p1, p1, Lcom/google/android/gms/common/api/internal/B;->b:Lr3/d;

    invoke-static {v1, p1}, Ls3/o;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/B;->a:Lcom/google/android/gms/common/api/internal/b;

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/B;->b:Lr3/d;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ls3/o;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Ls3/o;->c(Ljava/lang/Object;)Ls3/o$a;

    move-result-object v0

    const-string v1, "key"

    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/B;->a:Lcom/google/android/gms/common/api/internal/b;

    invoke-virtual {v0, v1, v2}, Ls3/o$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ls3/o$a;

    move-result-object v0

    const-string v1, "feature"

    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/B;->b:Lr3/d;

    invoke-virtual {v0, v1, v2}, Ls3/o$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ls3/o$a;

    move-result-object v0

    invoke-virtual {v0}, Ls3/o$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
