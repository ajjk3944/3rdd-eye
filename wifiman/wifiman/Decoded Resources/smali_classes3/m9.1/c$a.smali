.class public final Lm9/c$a;
.super Landroid/os/HandlerThread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm9/c;->c(Ljava/lang/String;I)Lgg/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I

.field final synthetic c:Ljava/util/concurrent/Semaphore;


# direct methods
.method constructor <init>(Ljava/lang/String;ILjava/util/concurrent/Semaphore;)V
    .locals 0

    iput-object p1, p0, Lm9/c$a;->a:Ljava/lang/String;

    iput p2, p0, Lm9/c$a;->b:I

    iput-object p3, p0, Lm9/c$a;->c:Ljava/util/concurrent/Semaphore;

    invoke-direct {p0, p1, p2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method protected onLooperPrepared()V
    .locals 1

    iget-object v0, p0, Lm9/c$a;->c:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    return-void
.end method
