.class public Lcom/google/android/gms/common/api/internal/n$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/common/api/internal/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/common/api/internal/l;

.field private b:Z

.field private c:[Lr3/d;

.field private d:I


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/common/api/internal/Q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/common/api/internal/n$a;->b:Z

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/gms/common/api/internal/n$a;->d:I

    return-void
.end method

.method static bridge synthetic f(Lcom/google/android/gms/common/api/internal/n$a;)Lcom/google/android/gms/common/api/internal/l;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/n$a;->a:Lcom/google/android/gms/common/api/internal/l;

    return-object p0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/internal/n;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/n$a;->a:Lcom/google/android/gms/common/api/internal/l;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "execute parameter required"

    invoke-static {v0, v1}, Ls3/p;->b(ZLjava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/common/api/internal/P;

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/n$a;->c:[Lr3/d;

    iget-boolean v2, p0, Lcom/google/android/gms/common/api/internal/n$a;->b:Z

    iget v3, p0, Lcom/google/android/gms/common/api/internal/n$a;->d:I

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/google/android/gms/common/api/internal/P;-><init>(Lcom/google/android/gms/common/api/internal/n$a;[Lr3/d;ZI)V

    return-object v0
.end method

.method public b(Lcom/google/android/gms/common/api/internal/l;)Lcom/google/android/gms/common/api/internal/n$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/n$a;->a:Lcom/google/android/gms/common/api/internal/l;

    return-object p0
.end method

.method public c(Z)Lcom/google/android/gms/common/api/internal/n$a;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/common/api/internal/n$a;->b:Z

    return-object p0
.end method

.method public varargs d([Lr3/d;)Lcom/google/android/gms/common/api/internal/n$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/n$a;->c:[Lr3/d;

    return-object p0
.end method

.method public e(I)Lcom/google/android/gms/common/api/internal/n$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/common/api/internal/n$a;->d:I

    return-object p0
.end method
