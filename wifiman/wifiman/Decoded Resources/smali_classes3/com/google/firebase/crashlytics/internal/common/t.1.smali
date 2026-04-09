.class public final synthetic Lcom/google/firebase/crashlytics/internal/common/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/firebase/crashlytics/internal/common/A;

.field public final synthetic b:LS4/j;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/crashlytics/internal/common/A;LS4/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/crashlytics/internal/common/t;->a:Lcom/google/firebase/crashlytics/internal/common/A;

    iput-object p2, p0, Lcom/google/firebase/crashlytics/internal/common/t;->b:LS4/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/t;->a:Lcom/google/firebase/crashlytics/internal/common/A;

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/t;->b:LS4/j;

    invoke-static {v0, v1}, Lcom/google/firebase/crashlytics/internal/common/A;->e(Lcom/google/firebase/crashlytics/internal/common/A;LS4/j;)V

    return-void
.end method
