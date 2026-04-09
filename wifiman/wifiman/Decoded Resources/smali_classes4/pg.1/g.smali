.class public final Lpg/g;
.super Lgg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpg/g$a;
    }
.end annotation


# instance fields
.field final a:Lgg/f;

.field final b:J

.field final c:Ljava/util/concurrent/TimeUnit;

.field final d:Lgg/y;

.field final e:Z


# direct methods
.method public constructor <init>(Lgg/f;JLjava/util/concurrent/TimeUnit;Lgg/y;Z)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lpg/g;->a:Lgg/f;

    iput-wide p2, p0, Lpg/g;->b:J

    iput-object p4, p0, Lpg/g;->c:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Lpg/g;->d:Lgg/y;

    iput-boolean p6, p0, Lpg/g;->e:Z

    return-void
.end method


# virtual methods
.method protected V(Lgg/d;)V
    .locals 9

    iget-object v0, p0, Lpg/g;->a:Lgg/f;

    new-instance v8, Lpg/g$a;

    iget-wide v3, p0, Lpg/g;->b:J

    iget-object v5, p0, Lpg/g;->c:Ljava/util/concurrent/TimeUnit;

    iget-object v6, p0, Lpg/g;->d:Lgg/y;

    iget-boolean v7, p0, Lpg/g;->e:Z

    move-object v1, v8

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lpg/g$a;-><init>(Lgg/d;JLjava/util/concurrent/TimeUnit;Lgg/y;Z)V

    invoke-interface {v0, v8}, Lgg/f;->e(Lgg/d;)V

    return-void
.end method
