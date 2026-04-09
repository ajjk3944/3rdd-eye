.class final Lwg/b$a;
.super Lgg/y$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private final a:Llg/d;

.field private final b:Lhg/b;

.field private final c:Llg/d;

.field private final d:Lwg/b$c;

.field volatile e:Z


# direct methods
.method constructor <init>(Lwg/b$c;)V
    .locals 2

    invoke-direct {p0}, Lgg/y$c;-><init>()V

    iput-object p1, p0, Lwg/b$a;->d:Lwg/b$c;

    new-instance p1, Llg/d;

    invoke-direct {p1}, Llg/d;-><init>()V

    iput-object p1, p0, Lwg/b$a;->a:Llg/d;

    new-instance v0, Lhg/b;

    invoke-direct {v0}, Lhg/b;-><init>()V

    iput-object v0, p0, Lwg/b$a;->b:Lhg/b;

    new-instance v1, Llg/d;

    invoke-direct {v1}, Llg/d;-><init>()V

    iput-object v1, p0, Lwg/b$a;->c:Llg/d;

    invoke-virtual {v1, p1}, Llg/d;->a(Lhg/c;)Z

    invoke-virtual {v1, v0}, Llg/d;->a(Lhg/c;)Z

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Runnable;)Lhg/c;
    .locals 6

    iget-boolean v0, p0, Lwg/b$a;->e:Z

    if-eqz v0, :cond_0

    sget-object p1, Llg/c;->INSTANCE:Llg/c;

    return-object p1

    :cond_0
    iget-object v0, p0, Lwg/b$a;->d:Lwg/b$c;

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v5, p0, Lwg/b$a;->a:Llg/d;

    const-wide/16 v2, 0x0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lwg/h;->e(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Lhg/d;)Lwg/m;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;
    .locals 6

    iget-boolean v0, p0, Lwg/b$a;->e:Z

    if-eqz v0, :cond_0

    sget-object p1, Llg/c;->INSTANCE:Llg/c;

    return-object p1

    :cond_0
    iget-object v0, p0, Lwg/b$a;->d:Lwg/b$c;

    iget-object v5, p0, Lwg/b$a;->b:Lhg/b;

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lwg/h;->e(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Lhg/d;)Lwg/m;

    move-result-object p1

    return-object p1
.end method

.method public dispose()V
    .locals 1

    iget-boolean v0, p0, Lwg/b$a;->e:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lwg/b$a;->e:Z

    iget-object v0, p0, Lwg/b$a;->c:Llg/d;

    invoke-virtual {v0}, Llg/d;->dispose()V

    :cond_0
    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Lwg/b$a;->e:Z

    return v0
.end method
