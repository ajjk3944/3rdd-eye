.class public final Lug/w;
.super Lgg/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lug/w$a;
    }
.end annotation


# instance fields
.field final a:Lgg/D;

.field final b:J

.field final c:Ljava/util/concurrent/TimeUnit;

.field final d:Lgg/y;

.field final e:Lgg/D;


# direct methods
.method public constructor <init>(Lgg/D;JLjava/util/concurrent/TimeUnit;Lgg/y;Lgg/D;)V
    .locals 0

    invoke-direct {p0}, Lgg/z;-><init>()V

    iput-object p1, p0, Lug/w;->a:Lgg/D;

    iput-wide p2, p0, Lug/w;->b:J

    iput-object p4, p0, Lug/w;->c:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Lug/w;->d:Lgg/y;

    iput-object p6, p0, Lug/w;->e:Lgg/D;

    return-void
.end method


# virtual methods
.method protected N(Lgg/B;)V
    .locals 7

    new-instance v6, Lug/w$a;

    iget-object v2, p0, Lug/w;->e:Lgg/D;

    iget-wide v3, p0, Lug/w;->b:J

    iget-object v5, p0, Lug/w;->c:Ljava/util/concurrent/TimeUnit;

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lug/w$a;-><init>(Lgg/B;Lgg/D;JLjava/util/concurrent/TimeUnit;)V

    invoke-interface {p1, v6}, Lgg/B;->c(Lhg/c;)V

    iget-object p1, v6, Lug/w$a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v0, p0, Lug/w;->d:Lgg/y;

    iget-wide v1, p0, Lug/w;->b:J

    iget-object v3, p0, Lug/w;->c:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v6, v1, v2, v3}, Lgg/y;->f(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    move-result-object v0

    invoke-static {p1, v0}, Llg/b;->replace(Ljava/util/concurrent/atomic/AtomicReference;Lhg/c;)Z

    iget-object p1, p0, Lug/w;->a:Lgg/D;

    invoke-interface {p1, v6}, Lgg/D;->a(Lgg/B;)V

    return-void
.end method
