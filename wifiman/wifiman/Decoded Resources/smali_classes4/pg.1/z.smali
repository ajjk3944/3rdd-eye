.class public final Lpg/z;
.super Lgg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpg/z$a;,
        Lpg/z$b;
    }
.end annotation


# instance fields
.field final a:Lgg/f;

.field final b:J

.field final c:Ljava/util/concurrent/TimeUnit;

.field final d:Lgg/y;

.field final e:Lgg/f;


# direct methods
.method public constructor <init>(Lgg/f;JLjava/util/concurrent/TimeUnit;Lgg/y;Lgg/f;)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lpg/z;->a:Lgg/f;

    iput-wide p2, p0, Lpg/z;->b:J

    iput-object p4, p0, Lpg/z;->c:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Lpg/z;->d:Lgg/y;

    iput-object p6, p0, Lpg/z;->e:Lgg/f;

    return-void
.end method


# virtual methods
.method public V(Lgg/d;)V
    .locals 7

    new-instance v0, Lhg/b;

    invoke-direct {v0}, Lhg/b;-><init>()V

    invoke-interface {p1, v0}, Lgg/d;->c(Lhg/c;)V

    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iget-object v2, p0, Lpg/z;->d:Lgg/y;

    new-instance v3, Lpg/z$a;

    invoke-direct {v3, p0, v1, v0, p1}, Lpg/z$a;-><init>(Lpg/z;Ljava/util/concurrent/atomic/AtomicBoolean;Lhg/b;Lgg/d;)V

    iget-wide v4, p0, Lpg/z;->b:J

    iget-object v6, p0, Lpg/z;->c:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v3, v4, v5, v6}, Lgg/y;->f(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    move-result-object v2

    invoke-virtual {v0, v2}, Lhg/b;->a(Lhg/c;)Z

    iget-object v2, p0, Lpg/z;->a:Lgg/f;

    new-instance v3, Lpg/z$b;

    invoke-direct {v3, v0, v1, p1}, Lpg/z$b;-><init>(Lhg/b;Ljava/util/concurrent/atomic/AtomicBoolean;Lgg/d;)V

    invoke-interface {v2, v3}, Lgg/f;->e(Lgg/d;)V

    return-void
.end method
