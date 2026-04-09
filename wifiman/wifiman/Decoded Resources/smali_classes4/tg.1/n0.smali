.class public final Ltg/n0;
.super Lgg/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/n0$a;
    }
.end annotation


# instance fields
.field final a:Lgg/y;

.field final b:J

.field final c:Ljava/util/concurrent/TimeUnit;


# direct methods
.method public constructor <init>(JLjava/util/concurrent/TimeUnit;Lgg/y;)V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    iput-wide p1, p0, Ltg/n0;->b:J

    iput-object p3, p0, Ltg/n0;->c:Ljava/util/concurrent/TimeUnit;

    iput-object p4, p0, Ltg/n0;->a:Lgg/y;

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 4

    new-instance v0, Ltg/n0$a;

    invoke-direct {v0, p1}, Ltg/n0$a;-><init>(Lgg/x;)V

    invoke-interface {p1, v0}, Lgg/x;->c(Lhg/c;)V

    iget-object p1, p0, Ltg/n0;->a:Lgg/y;

    iget-wide v1, p0, Ltg/n0;->b:J

    iget-object v3, p0, Ltg/n0;->c:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2, v3}, Lgg/y;->f(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lhg/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Ltg/n0$a;->a(Lhg/c;)V

    return-void
.end method
