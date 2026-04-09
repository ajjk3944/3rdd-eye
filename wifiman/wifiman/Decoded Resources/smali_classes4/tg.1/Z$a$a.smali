.class final Ltg/Z$a$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Lgg/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/Z$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Ltg/Z$a;


# direct methods
.method constructor <init>(Ltg/Z$a;)V
    .locals 0

    iput-object p1, p0, Ltg/Z$a$a;->a:Ltg/Z$a;

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Ltg/Z$a$a;->a:Ltg/Z$a;

    invoke-virtual {v0}, Ltg/Z$a;->d()V

    return-void
.end method

.method public c(Lhg/c;)V
    .locals 0

    invoke-static {p0, p1}, Llg/b;->setOnce(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 0

    iget-object p1, p0, Ltg/Z$a$a;->a:Ltg/Z$a;

    invoke-virtual {p1}, Ltg/Z$a;->j()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Ltg/Z$a$a;->a:Ltg/Z$a;

    invoke-virtual {v0, p1}, Ltg/Z$a;->g(Ljava/lang/Throwable;)V

    return-void
.end method
