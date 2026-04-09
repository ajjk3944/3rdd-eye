.class public final Lrg/v;
.super Lgg/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrg/v$a;
    }
.end annotation


# instance fields
.field final a:J

.field final b:Ljava/util/concurrent/TimeUnit;

.field final c:Lgg/y;


# direct methods
.method public constructor <init>(JLjava/util/concurrent/TimeUnit;Lgg/y;)V
    .locals 0

    invoke-direct {p0}, Lgg/n;-><init>()V

    iput-wide p1, p0, Lrg/v;->a:J

    iput-object p3, p0, Lrg/v;->b:Ljava/util/concurrent/TimeUnit;

    iput-object p4, p0, Lrg/v;->c:Lgg/y;

    return-void
.end method


# virtual methods
.method protected v(Lgg/p;)V
    .locals 4

    new-instance v0, Lrg/v$a;

    invoke-direct {v0, p1}, Lrg/v$a;-><init>(Lgg/p;)V

    invoke-interface {p1, v0}, Lgg/p;->c(Lhg/c;)V

    iget-object p1, p0, Lrg/v;->c:Lgg/y;

    iget-wide v1, p0, Lrg/v;->a:J

    iget-object v3, p0, Lrg/v;->b:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2, v3}, Lgg/y;->f(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lrg/v$a;->a(Lhg/c;)V

    return-void
.end method
