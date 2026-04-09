.class public final Lug/x;
.super Lgg/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lug/x$a;
    }
.end annotation


# instance fields
.field final a:J

.field final b:Ljava/util/concurrent/TimeUnit;

.field final c:Lgg/y;


# direct methods
.method public constructor <init>(JLjava/util/concurrent/TimeUnit;Lgg/y;)V
    .locals 0

    invoke-direct {p0}, Lgg/z;-><init>()V

    iput-wide p1, p0, Lug/x;->a:J

    iput-object p3, p0, Lug/x;->b:Ljava/util/concurrent/TimeUnit;

    iput-object p4, p0, Lug/x;->c:Lgg/y;

    return-void
.end method


# virtual methods
.method protected N(Lgg/B;)V
    .locals 4

    new-instance v0, Lug/x$a;

    invoke-direct {v0, p1}, Lug/x$a;-><init>(Lgg/B;)V

    invoke-interface {p1, v0}, Lgg/B;->c(Lhg/c;)V

    iget-object p1, p0, Lug/x;->c:Lgg/y;

    iget-wide v1, p0, Lug/x;->a:J

    iget-object v3, p0, Lug/x;->b:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2, v3}, Lgg/y;->f(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lug/x$a;->a(Lhg/c;)V

    return-void
.end method
