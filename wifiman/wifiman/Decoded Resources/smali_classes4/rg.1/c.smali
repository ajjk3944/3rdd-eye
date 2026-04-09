.class public final Lrg/c;
.super Lrg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrg/c$a;
    }
.end annotation


# instance fields
.field final b:J

.field final c:Ljava/util/concurrent/TimeUnit;

.field final d:Lgg/y;

.field final e:Z


# direct methods
.method public constructor <init>(Lgg/r;JLjava/util/concurrent/TimeUnit;Lgg/y;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lrg/a;-><init>(Lgg/r;)V

    iput-wide p2, p0, Lrg/c;->b:J

    iput-object p4, p0, Lrg/c;->c:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Lrg/c;->d:Lgg/y;

    iput-boolean p6, p0, Lrg/c;->e:Z

    return-void
.end method


# virtual methods
.method protected v(Lgg/p;)V
    .locals 9

    iget-object v0, p0, Lrg/a;->a:Lgg/r;

    new-instance v8, Lrg/c$a;

    iget-wide v3, p0, Lrg/c;->b:J

    iget-object v5, p0, Lrg/c;->c:Ljava/util/concurrent/TimeUnit;

    iget-object v6, p0, Lrg/c;->d:Lgg/y;

    iget-boolean v7, p0, Lrg/c;->e:Z

    move-object v1, v8

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lrg/c$a;-><init>(Lgg/p;JLjava/util/concurrent/TimeUnit;Lgg/y;Z)V

    invoke-interface {v0, v8}, Lgg/r;->a(Lgg/p;)V

    return-void
.end method
