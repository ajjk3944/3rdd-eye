.class public final Ltg/p;
.super Ltg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/p$a;
    }
.end annotation


# instance fields
.field final b:J

.field final c:Ljava/lang/Object;

.field final d:Z


# direct methods
.method public constructor <init>(Lgg/v;JLjava/lang/Object;Z)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    iput-wide p2, p0, Ltg/p;->b:J

    iput-object p4, p0, Ltg/p;->c:Ljava/lang/Object;

    iput-boolean p5, p0, Ltg/p;->d:Z

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 8

    iget-object v0, p0, Ltg/a;->a:Lgg/v;

    new-instance v7, Ltg/p$a;

    iget-wide v3, p0, Ltg/p;->b:J

    iget-object v5, p0, Ltg/p;->c:Ljava/lang/Object;

    iget-boolean v6, p0, Ltg/p;->d:Z

    move-object v1, v7

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Ltg/p$a;-><init>(Lgg/x;JLjava/lang/Object;Z)V

    invoke-interface {v0, v7}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method
