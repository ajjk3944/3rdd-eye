.class public final synthetic Lcom/google/android/gms/measurement/internal/E3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lcom/google/android/gms/measurement/internal/A3;

.field private synthetic b:Ljava/lang/String;

.field private synthetic c:Lcom/google/android/gms/measurement/internal/Q6;

.field private synthetic d:Lcom/google/android/gms/measurement/internal/y2;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/A3;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/Q6;Lcom/google/android/gms/measurement/internal/y2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/E3;->a:Lcom/google/android/gms/measurement/internal/A3;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/E3;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/E3;->c:Lcom/google/android/gms/measurement/internal/Q6;

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/E3;->d:Lcom/google/android/gms/measurement/internal/y2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/E3;->a:Lcom/google/android/gms/measurement/internal/A3;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/E3;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/E3;->c:Lcom/google/android/gms/measurement/internal/Q6;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/E3;->d:Lcom/google/android/gms/measurement/internal/y2;

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/A3;->q0(Lcom/google/android/gms/measurement/internal/A3;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/Q6;Lcom/google/android/gms/measurement/internal/y2;)V

    return-void
.end method
