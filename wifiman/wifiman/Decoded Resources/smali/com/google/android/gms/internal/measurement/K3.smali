.class public abstract Lcom/google/android/gms/internal/measurement/K3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lm4/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/J3;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/J3;-><init>()V

    invoke-static {v0}, Lm4/l;->a(Lm4/k;)Lm4/k;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/K3;->a:Lm4/k;

    return-void
.end method

.method static synthetic a()Lcom/google/common/collect/s;
    .locals 1

    new-instance v0, Lcom/google/common/collect/s$a;

    invoke-direct {v0}, Lcom/google/common/collect/s$a;-><init>()V

    invoke-virtual {v0}, Lcom/google/common/collect/s$a;->a()Lcom/google/common/collect/s;

    move-result-object v0

    return-object v0
.end method
