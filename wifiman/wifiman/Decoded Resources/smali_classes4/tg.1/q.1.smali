.class public final Ltg/q;
.super Lgg/n;
.source "SourceFile"

# interfaces
.implements Lng/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/q$a;
    }
.end annotation


# instance fields
.field final a:Lgg/v;

.field final b:J


# direct methods
.method public constructor <init>(Lgg/v;J)V
    .locals 0

    invoke-direct {p0}, Lgg/n;-><init>()V

    iput-object p1, p0, Ltg/q;->a:Lgg/v;

    iput-wide p2, p0, Ltg/q;->b:J

    return-void
.end method


# virtual methods
.method public b()Lgg/s;
    .locals 7

    new-instance v6, Ltg/p;

    iget-object v1, p0, Ltg/q;->a:Lgg/v;

    iget-wide v2, p0, Ltg/q;->b:J

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ltg/p;-><init>(Lgg/v;JLjava/lang/Object;Z)V

    invoke-static {v6}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object v0

    return-object v0
.end method

.method public v(Lgg/p;)V
    .locals 4

    iget-object v0, p0, Ltg/q;->a:Lgg/v;

    new-instance v1, Ltg/q$a;

    iget-wide v2, p0, Ltg/q;->b:J

    invoke-direct {v1, p1, v2, v3}, Ltg/q$a;-><init>(Lgg/p;J)V

    invoke-interface {v0, v1}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method
