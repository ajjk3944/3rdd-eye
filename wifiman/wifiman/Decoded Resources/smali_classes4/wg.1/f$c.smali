.class final Lwg/f$c;
.super Lwg/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field c:J


# direct methods
.method constructor <init>(Ljava/util/concurrent/ThreadFactory;)V
    .locals 2

    invoke-direct {p0, p1}, Lwg/h;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lwg/f$c;->c:J

    return-void
.end method


# virtual methods
.method public i()J
    .locals 2

    iget-wide v0, p0, Lwg/f$c;->c:J

    return-wide v0
.end method

.method public j(J)V
    .locals 0

    iput-wide p1, p0, Lwg/f$c;->c:J

    return-void
.end method
