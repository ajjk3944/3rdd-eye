.class public final Lcom/google/android/gms/common/internal/zzaj;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field public final a:Lr3/b;


# direct methods
.method public constructor <init>(Lr3/b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    invoke-virtual {p1}, Lr3/b;->g()Z

    move-result v0

    const-string v1, "ResolvableConnectionException can only be created with a connection result containing a resolution."

    invoke-static {v0, v1}, Ls3/p;->b(ZLjava/lang/Object;)V

    iput-object p1, p0, Lcom/google/android/gms/common/internal/zzaj;->a:Lr3/b;

    return-void
.end method
