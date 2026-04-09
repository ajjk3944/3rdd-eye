.class public final synthetic Lrc/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lgg/A;


# direct methods
.method public synthetic constructor <init>(Lgg/A;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrc/e;->a:Lgg/A;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget-object v0, p0, Lrc/e;->a:Lgg/A;

    invoke-static {v0, p1}, Lrc/h;->h(Lgg/A;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
