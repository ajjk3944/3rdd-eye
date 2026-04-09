.class public final Lrb3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:J

.field public final c:Lym;

.field public final d:J


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lym;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrb3;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lrb3;->c:Lym;

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide p1

    .line 15
    iput-wide p1, p0, Lrb3;->b:J

    .line 16
    .line 17
    sget-object p1, Lmz1;->I:Liz1;

    .line 18
    .line 19
    sget-object p2, Ltw1;->e:Ltw1;

    .line 20
    .line 21
    iget-object p2, p2, Ltw1;->c:Lkz1;

    .line 22
    .line 23
    invoke-virtual {p2, p1}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Ljava/lang/Long;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 30
    .line 31
    .line 32
    move-result-wide p1

    .line 33
    const-wide/16 v0, 0x3e8

    .line 34
    .line 35
    mul-long/2addr p1, v0

    .line 36
    iput-wide p1, p0, Lrb3;->d:J

    .line 37
    .line 38
    return-void
.end method
