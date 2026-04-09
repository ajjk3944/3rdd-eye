.class final Ltg/X$c;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/X;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field final a:Ltg/X$g;

.field final b:Lgg/x;

.field c:Ljava/lang/Object;

.field volatile d:Z


# direct methods
.method constructor <init>(Ltg/X$g;Lgg/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Ltg/X$c;->a:Ltg/X$g;

    iput-object p2, p0, Ltg/X$c;->b:Lgg/x;

    return-void
.end method


# virtual methods
.method a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ltg/X$c;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public dispose()V
    .locals 1

    iget-boolean v0, p0, Ltg/X$c;->d:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/X$c;->d:Z

    iget-object v0, p0, Ltg/X$c;->a:Ltg/X$g;

    invoke-virtual {v0, p0}, Ltg/X$g;->g(Ltg/X$c;)V

    const/4 v0, 0x0

    iput-object v0, p0, Ltg/X$c;->c:Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Ltg/X$c;->d:Z

    return v0
.end method
