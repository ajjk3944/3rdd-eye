.class public final Lqg/s;
.super Lgg/z;
.source "SourceFile"

# interfaces
.implements Lng/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/s$a;
    }
.end annotation


# instance fields
.field final a:Lgg/i;

.field final b:J

.field final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lgg/i;JLjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lgg/z;-><init>()V

    iput-object p1, p0, Lqg/s;->a:Lgg/i;

    iput-wide p2, p0, Lqg/s;->b:J

    iput-object p4, p0, Lqg/s;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method protected N(Lgg/B;)V
    .locals 5

    iget-object v0, p0, Lqg/s;->a:Lgg/i;

    new-instance v1, Lqg/s$a;

    iget-wide v2, p0, Lqg/s;->b:J

    iget-object v4, p0, Lqg/s;->c:Ljava/lang/Object;

    invoke-direct {v1, p1, v2, v3, v4}, Lqg/s$a;-><init>(Lgg/B;JLjava/lang/Object;)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method

.method public f()Lgg/i;
    .locals 7

    new-instance v6, Lqg/q;

    iget-object v1, p0, Lqg/s;->a:Lgg/i;

    iget-wide v2, p0, Lqg/s;->b:J

    iget-object v4, p0, Lqg/s;->c:Ljava/lang/Object;

    const/4 v5, 0x1

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lqg/q;-><init>(Lgg/i;JLjava/lang/Object;Z)V

    invoke-static {v6}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object v0

    return-object v0
.end method
