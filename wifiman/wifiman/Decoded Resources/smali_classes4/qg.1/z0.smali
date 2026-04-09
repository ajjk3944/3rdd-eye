.class public final Lqg/z0;
.super Lgg/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/z0$a;
    }
.end annotation


# instance fields
.field final b:Lgg/y;

.field final c:J

.field final d:Ljava/util/concurrent/TimeUnit;


# direct methods
.method public constructor <init>(JLjava/util/concurrent/TimeUnit;Lgg/y;)V
    .locals 0

    invoke-direct {p0}, Lgg/i;-><init>()V

    iput-wide p1, p0, Lqg/z0;->c:J

    iput-object p3, p0, Lqg/z0;->d:Ljava/util/concurrent/TimeUnit;

    iput-object p4, p0, Lqg/z0;->b:Lgg/y;

    return-void
.end method


# virtual methods
.method public E1(LDj/b;)V
    .locals 4

    new-instance v0, Lqg/z0$a;

    invoke-direct {v0, p1}, Lqg/z0$a;-><init>(LDj/b;)V

    invoke-interface {p1, v0}, LDj/b;->j(LDj/c;)V

    iget-object p1, p0, Lqg/z0;->b:Lgg/y;

    iget-wide v1, p0, Lqg/z0;->c:J

    iget-object v3, p0, Lqg/z0;->d:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2, v3}, Lgg/y;->f(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lqg/z0$a;->a(Lhg/c;)V

    return-void
.end method
