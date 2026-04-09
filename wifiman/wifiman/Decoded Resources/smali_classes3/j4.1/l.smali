.class public final Lj4/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Lk4/i;


# instance fields
.field a:Lk4/t;

.field private final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lk4/i;

    const-string/jumbo v1, "ReviewService"

    invoke-direct {v0, v1}, Lk4/i;-><init>(Ljava/lang/String;)V

    sput-object v0, Lj4/l;->c:Lk4/i;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lj4/l;->b:Ljava/lang/String;

    invoke-static {p1}, Lk4/v;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string/jumbo v1, "com.android.vending"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v6

    new-instance v0, Lk4/t;

    sget-object v4, Lj4/l;->c:Lk4/i;

    new-instance v7, Lj4/h;

    invoke-direct {v7}, Lj4/h;-><init>()V

    const-string/jumbo v5, "com.google.android.finsky.inappreviewservice.InAppReviewService"

    const/4 v8, 0x0

    move-object v2, v0

    move-object v3, p1

    invoke-direct/range {v2 .. v8}, Lk4/t;-><init>(Landroid/content/Context;Lk4/i;Ljava/lang/String;Landroid/content/Intent;Lj4/h;Lk4/o;)V

    iput-object v0, p0, Lj4/l;->a:Lk4/t;

    :cond_0
    return-void
.end method

.method static bridge synthetic b()Lk4/i;
    .locals 1

    sget-object v0, Lj4/l;->c:Lk4/i;

    return-object v0
.end method

.method static bridge synthetic c(Lj4/l;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lj4/l;->b:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/tasks/Task;
    .locals 3

    iget-object v0, p0, Lj4/l;->b:Ljava/lang/String;

    sget-object v1, Lj4/l;->c:Lk4/i;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string/jumbo v2, "requestInAppReview (%s)"

    invoke-virtual {v1, v2, v0}, Lk4/i;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lj4/l;->a:Lk4/t;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string/jumbo v2, "Play Store app is either not installed or not the official version"

    invoke-virtual {v1, v2, v0}, Lk4/i;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance v0, Lcom/google/android/play/core/review/ReviewException;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Lcom/google/android/play/core/review/ReviewException;-><init>(I)V

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    iget-object v1, p0, Lj4/l;->a:Lk4/t;

    new-instance v2, Lj4/i;

    invoke-direct {v2, p0, v0, v0}, Lj4/i;-><init>(Lj4/l;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {v1, v2, v0}, Lk4/t;->s(Lk4/j;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
