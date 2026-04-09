.class public final synthetic Lrc/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lgg/c;


# direct methods
.method public synthetic constructor <init>(Lgg/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrc/g;->a:Lgg/c;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget-object v0, p0, Lrc/g;->a:Lgg/c;

    invoke-static {v0, p1}, Lrc/h;->i(Lgg/c;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
