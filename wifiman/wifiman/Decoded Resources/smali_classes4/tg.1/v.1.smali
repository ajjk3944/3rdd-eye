.class public final Ltg/v;
.super Ltg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/v$a;,
        Ltg/v$b;
    }
.end annotation


# instance fields
.field final b:Lkg/n;

.field final c:Z

.field final d:I

.field final e:I


# direct methods
.method public constructor <init>(Lgg/v;Lkg/n;ZII)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    iput-object p2, p0, Ltg/v;->b:Lkg/n;

    iput-boolean p3, p0, Ltg/v;->c:Z

    iput p4, p0, Ltg/v;->d:I

    iput p5, p0, Ltg/v;->e:I

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 8

    iget-object v0, p0, Ltg/a;->a:Lgg/v;

    iget-object v1, p0, Ltg/v;->b:Lkg/n;

    invoke-static {v0, p1, v1}, Ltg/a0;->b(Lgg/v;Lgg/x;Lkg/n;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ltg/a;->a:Lgg/v;

    new-instance v7, Ltg/v$b;

    iget-object v3, p0, Ltg/v;->b:Lkg/n;

    iget-boolean v4, p0, Ltg/v;->c:Z

    iget v5, p0, Ltg/v;->d:I

    iget v6, p0, Ltg/v;->e:I

    move-object v1, v7

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Ltg/v$b;-><init>(Lgg/x;Lkg/n;ZII)V

    invoke-interface {v0, v7}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method
