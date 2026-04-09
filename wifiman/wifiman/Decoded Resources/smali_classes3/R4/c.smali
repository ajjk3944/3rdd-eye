.class public final synthetic LR4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La3/j;


# instance fields
.field public final synthetic a:LR4/e;

.field public final synthetic b:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic c:Z

.field public final synthetic d:Lcom/google/firebase/crashlytics/internal/common/D;


# direct methods
.method public synthetic constructor <init>(LR4/e;Lcom/google/android/gms/tasks/TaskCompletionSource;ZLcom/google/firebase/crashlytics/internal/common/D;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR4/c;->a:LR4/e;

    iput-object p2, p0, LR4/c;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-boolean p3, p0, LR4/c;->c:Z

    iput-object p4, p0, LR4/c;->d:Lcom/google/firebase/crashlytics/internal/common/D;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 4

    iget-object v0, p0, LR4/c;->a:LR4/e;

    iget-object v1, p0, LR4/c;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-boolean v2, p0, LR4/c;->c:Z

    iget-object v3, p0, LR4/c;->d:Lcom/google/firebase/crashlytics/internal/common/D;

    invoke-static {v0, v1, v2, v3, p1}, LR4/e;->a(LR4/e;Lcom/google/android/gms/tasks/TaskCompletionSource;ZLcom/google/firebase/crashlytics/internal/common/D;Ljava/lang/Exception;)V

    return-void
.end method
