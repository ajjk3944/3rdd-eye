.class public final Ltg/e0;
.super Ltg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/e0$a;
    }
.end annotation


# instance fields
.field final b:J


# direct methods
.method public constructor <init>(Lgg/v;J)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    iput-wide p2, p0, Ltg/e0;->b:J

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 4

    iget-object v0, p0, Ltg/a;->a:Lgg/v;

    new-instance v1, Ltg/e0$a;

    iget-wide v2, p0, Ltg/e0;->b:J

    invoke-direct {v1, p1, v2, v3}, Ltg/e0$a;-><init>(Lgg/x;J)V

    invoke-interface {v0, v1}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method
