.class final LW4/g$c;
.super Lcom/google/android/gms/common/api/internal/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW4/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field private final d:Ljava/lang/String;

.field private final e:Lf5/b;


# direct methods
.method constructor <init>(Lf5/b;Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    const/16 v1, 0x3391

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/google/android/gms/common/api/internal/n;-><init>([Lr3/d;ZI)V

    iput-object p2, p0, LW4/g$c;->d:Ljava/lang/String;

    iput-object p1, p0, LW4/g$c;->e:Lf5/b;

    return-void
.end method


# virtual methods
.method protected bridge synthetic b(Lcom/google/android/gms/common/api/a$b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    check-cast p1, LW4/e;

    invoke-virtual {p0, p1, p2}, LW4/g$c;->f(LW4/e;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method protected f(LW4/e;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 2

    new-instance v0, LW4/g$b;

    iget-object v1, p0, LW4/g$c;->e:Lf5/b;

    invoke-direct {v0, v1, p2}, LW4/g$b;-><init>(Lf5/b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    iget-object p2, p0, LW4/g$c;->d:Ljava/lang/String;

    invoke-virtual {p1, v0, p2}, LW4/e;->k0(LW4/h$a;Ljava/lang/String;)V

    return-void
.end method
