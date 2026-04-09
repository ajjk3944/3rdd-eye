.class public final Lqg/r;
.super Lgg/n;
.source "SourceFile"

# interfaces
.implements Lng/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/r$a;
    }
.end annotation


# instance fields
.field final a:Lgg/i;

.field final b:J


# direct methods
.method public constructor <init>(Lgg/i;J)V
    .locals 0

    invoke-direct {p0}, Lgg/n;-><init>()V

    iput-object p1, p0, Lqg/r;->a:Lgg/i;

    iput-wide p2, p0, Lqg/r;->b:J

    return-void
.end method


# virtual methods
.method public f()Lgg/i;
    .locals 7

    new-instance v6, Lqg/q;

    iget-object v1, p0, Lqg/r;->a:Lgg/i;

    iget-wide v2, p0, Lqg/r;->b:J

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lqg/q;-><init>(Lgg/i;JLjava/lang/Object;Z)V

    invoke-static {v6}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method protected v(Lgg/p;)V
    .locals 4

    iget-object v0, p0, Lqg/r;->a:Lgg/i;

    new-instance v1, Lqg/r$a;

    iget-wide v2, p0, Lqg/r;->b:J

    invoke-direct {v1, p1, v2, v3}, Lqg/r$a;-><init>(Lgg/p;J)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method
