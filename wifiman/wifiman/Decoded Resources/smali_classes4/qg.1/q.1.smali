.class public final Lqg/q;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/q$a;
    }
.end annotation


# instance fields
.field final c:J

.field final d:Ljava/lang/Object;

.field final e:Z


# direct methods
.method public constructor <init>(Lgg/i;JLjava/lang/Object;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-wide p2, p0, Lqg/q;->c:J

    iput-object p4, p0, Lqg/q;->d:Ljava/lang/Object;

    iput-boolean p5, p0, Lqg/q;->e:Z

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 8

    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v7, Lqg/q$a;

    iget-wide v3, p0, Lqg/q;->c:J

    iget-object v5, p0, Lqg/q;->d:Ljava/lang/Object;

    iget-boolean v6, p0, Lqg/q;->e:Z

    move-object v1, v7

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lqg/q$a;-><init>(LDj/b;JLjava/lang/Object;Z)V

    invoke-virtual {v0, v7}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method
