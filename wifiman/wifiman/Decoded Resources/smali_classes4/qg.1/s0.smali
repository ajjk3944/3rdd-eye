.class public final Lqg/s0;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/s0$a;
    }
.end annotation


# instance fields
.field final c:J


# direct methods
.method public constructor <init>(Lgg/i;J)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-wide p2, p0, Lqg/s0;->c:J

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 4

    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v1, Lqg/s0$a;

    iget-wide v2, p0, Lqg/s0;->c:J

    invoke-direct {v1, p1, v2, v3}, Lqg/s0$a;-><init>(LDj/b;J)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method
