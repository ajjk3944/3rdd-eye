.class public final Ltg/n;
.super Ltg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/n$a;
    }
.end annotation


# instance fields
.field final b:Lkg/f;

.field final c:Lkg/f;

.field final d:Lkg/a;

.field final e:Lkg/a;


# direct methods
.method public constructor <init>(Lgg/v;Lkg/f;Lkg/f;Lkg/a;Lkg/a;)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    iput-object p2, p0, Ltg/n;->b:Lkg/f;

    iput-object p3, p0, Ltg/n;->c:Lkg/f;

    iput-object p4, p0, Ltg/n;->d:Lkg/a;

    iput-object p5, p0, Ltg/n;->e:Lkg/a;

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 8

    iget-object v0, p0, Ltg/a;->a:Lgg/v;

    new-instance v7, Ltg/n$a;

    iget-object v3, p0, Ltg/n;->b:Lkg/f;

    iget-object v4, p0, Ltg/n;->c:Lkg/f;

    iget-object v5, p0, Ltg/n;->d:Lkg/a;

    iget-object v6, p0, Ltg/n;->e:Lkg/a;

    move-object v1, v7

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Ltg/n$a;-><init>(Lgg/x;Lkg/f;Lkg/f;Lkg/a;Lkg/a;)V

    invoke-interface {v0, v7}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method
