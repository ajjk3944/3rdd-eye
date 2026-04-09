.class public final synthetic Lcom/google/android/gms/measurement/internal/E5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lcom/google/android/gms/measurement/internal/C5;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/C5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/E5;->a:Lcom/google/android/gms/measurement/internal/C5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/E5;->a:Lcom/google/android/gms/measurement/internal/C5;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/C5;->r0(Lcom/google/android/gms/measurement/internal/C5;)V

    return-void
.end method
