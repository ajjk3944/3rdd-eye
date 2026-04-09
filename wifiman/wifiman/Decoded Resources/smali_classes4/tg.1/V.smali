.class public final Ltg/V;
.super Ltg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/V$a;
    }
.end annotation


# instance fields
.field final b:J


# direct methods
.method public constructor <init>(Lgg/s;J)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    iput-wide p2, p0, Ltg/V;->b:J

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 7

    new-instance v4, Llg/e;

    invoke-direct {v4}, Llg/e;-><init>()V

    invoke-interface {p1, v4}, Lgg/x;->c(Lhg/c;)V

    new-instance v6, Ltg/V$a;

    iget-wide v0, p0, Ltg/V;->b:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v5, v0, v2

    if-eqz v5, :cond_0

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    move-wide v2, v0

    :cond_0
    iget-object v5, p0, Ltg/a;->a:Lgg/v;

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Ltg/V$a;-><init>(Lgg/x;JLlg/e;Lgg/v;)V

    invoke-virtual {v6}, Ltg/V$a;->d()V

    return-void
.end method
