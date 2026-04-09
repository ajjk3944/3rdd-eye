.class public final Ltg/Y;
.super Ltg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/Y$a;
    }
.end annotation


# instance fields
.field final b:Lkg/p;

.field final c:J


# direct methods
.method public constructor <init>(Lgg/s;JLkg/p;)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    iput-object p4, p0, Ltg/Y;->b:Lkg/p;

    iput-wide p2, p0, Ltg/Y;->c:J

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 8

    new-instance v5, Llg/e;

    invoke-direct {v5}, Llg/e;-><init>()V

    invoke-interface {p1, v5}, Lgg/x;->c(Lhg/c;)V

    new-instance v7, Ltg/Y$a;

    iget-wide v2, p0, Ltg/Y;->c:J

    iget-object v4, p0, Ltg/Y;->b:Lkg/p;

    iget-object v6, p0, Ltg/a;->a:Lgg/v;

    move-object v0, v7

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Ltg/Y$a;-><init>(Lgg/x;JLkg/p;Llg/e;Lgg/v;)V

    invoke-virtual {v7}, Ltg/Y$a;->d()V

    return-void
.end method
