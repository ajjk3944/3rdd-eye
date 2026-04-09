.class public final synthetic Lcom/google/firebase/crashlytics/internal/common/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/google/firebase/crashlytics/internal/common/A;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/crashlytics/internal/common/A;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/crashlytics/internal/common/s;->a:Lcom/google/firebase/crashlytics/internal/common/A;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/s;->a:Lcom/google/firebase/crashlytics/internal/common/A;

    invoke-static {v0}, Lcom/google/firebase/crashlytics/internal/common/A;->b(Lcom/google/firebase/crashlytics/internal/common/A;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
