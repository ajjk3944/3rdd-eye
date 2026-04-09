.class public LJ3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ3/a$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/measurement/i1;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/i1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ3/a;->a:Lcom/google/android/gms/internal/measurement/i1;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, LJ3/a;->a:Lcom/google/android/gms/internal/measurement/i1;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/i1;->B(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public b(LJ3/a$a;)V
    .locals 1

    iget-object v0, p0, LJ3/a;->a:Lcom/google/android/gms/internal/measurement/i1;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/i1;->p(Lcom/google/android/gms/measurement/internal/p4;)V

    return-void
.end method
