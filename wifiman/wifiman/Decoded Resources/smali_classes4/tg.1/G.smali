.class public final Ltg/G;
.super Ltg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/G$c;,
        Ltg/G$b;,
        Ltg/G$a;
    }
.end annotation


# instance fields
.field final b:Lkg/n;

.field final c:Lkg/n;

.field final d:I

.field final e:Z


# direct methods
.method public constructor <init>(Lgg/v;Lkg/n;Lkg/n;IZ)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    iput-object p2, p0, Ltg/G;->b:Lkg/n;

    iput-object p3, p0, Ltg/G;->c:Lkg/n;

    iput p4, p0, Ltg/G;->d:I

    iput-boolean p5, p0, Ltg/G;->e:Z

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 8

    iget-object v0, p0, Ltg/a;->a:Lgg/v;

    new-instance v7, Ltg/G$a;

    iget-object v3, p0, Ltg/G;->b:Lkg/n;

    iget-object v4, p0, Ltg/G;->c:Lkg/n;

    iget v5, p0, Ltg/G;->d:I

    iget-boolean v6, p0, Ltg/G;->e:Z

    move-object v1, v7

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Ltg/G$a;-><init>(Lgg/x;Lkg/n;Lkg/n;IZ)V

    invoke-interface {v0, v7}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method
