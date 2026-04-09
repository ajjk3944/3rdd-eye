.class public final synthetic Lcom/google/android/play/integrity/internal/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final synthetic a:Lcom/google/android/play/integrity/internal/f;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/play/integrity/internal/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/integrity/internal/H;->a:Lcom/google/android/play/integrity/internal/f;

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/play/integrity/internal/H;->a:Lcom/google/android/play/integrity/internal/f;

    invoke-static {v0}, Lcom/google/android/play/integrity/internal/f;->k(Lcom/google/android/play/integrity/internal/f;)V

    return-void
.end method
