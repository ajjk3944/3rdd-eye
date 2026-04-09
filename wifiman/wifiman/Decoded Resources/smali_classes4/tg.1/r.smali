.class public final Ltg/r;
.super Lgg/z;
.source "SourceFile"

# interfaces
.implements Lng/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/r$a;
    }
.end annotation


# instance fields
.field final a:Lgg/v;

.field final b:J

.field final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lgg/v;JLjava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lgg/z;-><init>()V

    iput-object p1, p0, Ltg/r;->a:Lgg/v;

    iput-wide p2, p0, Ltg/r;->b:J

    iput-object p4, p0, Ltg/r;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public N(Lgg/B;)V
    .locals 5

    iget-object v0, p0, Ltg/r;->a:Lgg/v;

    new-instance v1, Ltg/r$a;

    iget-wide v2, p0, Ltg/r;->b:J

    iget-object v4, p0, Ltg/r;->c:Ljava/lang/Object;

    invoke-direct {v1, p1, v2, v3, v4}, Ltg/r$a;-><init>(Lgg/B;JLjava/lang/Object;)V

    invoke-interface {v0, v1}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method

.method public b()Lgg/s;
    .locals 7

    new-instance v6, Ltg/p;

    iget-object v1, p0, Ltg/r;->a:Lgg/v;

    iget-wide v2, p0, Ltg/r;->b:J

    iget-object v4, p0, Ltg/r;->c:Ljava/lang/Object;

    const/4 v5, 0x1

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ltg/p;-><init>(Lgg/v;JLjava/lang/Object;Z)V

    invoke-static {v6}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object v0

    return-object v0
.end method
