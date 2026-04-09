.class Lcom/google/firebase/crashlytics/internal/common/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/crashlytics/internal/common/E$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/crashlytics/internal/common/q;->w(Ljava/lang/String;Ljava/lang/Thread$UncaughtExceptionHandler;LS4/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/firebase/crashlytics/internal/common/q;


# direct methods
.method constructor <init>(Lcom/google/firebase/crashlytics/internal/common/q;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/crashlytics/internal/common/q$a;->a:Lcom/google/firebase/crashlytics/internal/common/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LS4/j;Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/q$a;->a:Lcom/google/firebase/crashlytics/internal/common/q;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/firebase/crashlytics/internal/common/q;->G(LS4/j;Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method
