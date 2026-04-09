.class public final Ltg/l0;
.super Ltg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/l0$a;,
        Ltg/l0$b;,
        Ltg/l0$c;,
        Ltg/l0$d;
    }
.end annotation


# instance fields
.field final b:Lgg/v;

.field final c:Lkg/n;

.field final d:Lgg/v;


# direct methods
.method public constructor <init>(Lgg/s;Lgg/v;Lkg/n;Lgg/v;)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    iput-object p2, p0, Ltg/l0;->b:Lgg/v;

    iput-object p3, p0, Ltg/l0;->c:Lkg/n;

    iput-object p4, p0, Ltg/l0;->d:Lgg/v;

    return-void
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 3

    iget-object v0, p0, Ltg/l0;->d:Lgg/v;

    if-nez v0, :cond_0

    new-instance v0, Ltg/l0$c;

    iget-object v1, p0, Ltg/l0;->c:Lkg/n;

    invoke-direct {v0, p1, v1}, Ltg/l0$c;-><init>(Lgg/x;Lkg/n;)V

    invoke-interface {p1, v0}, Lgg/x;->c(Lhg/c;)V

    iget-object p1, p0, Ltg/l0;->b:Lgg/v;

    invoke-virtual {v0, p1}, Ltg/l0$c;->j(Lgg/v;)V

    iget-object p1, p0, Ltg/a;->a:Lgg/v;

    invoke-interface {p1, v0}, Lgg/v;->d(Lgg/x;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ltg/l0$b;

    iget-object v1, p0, Ltg/l0;->c:Lkg/n;

    iget-object v2, p0, Ltg/l0;->d:Lgg/v;

    invoke-direct {v0, p1, v1, v2}, Ltg/l0$b;-><init>(Lgg/x;Lkg/n;Lgg/v;)V

    invoke-interface {p1, v0}, Lgg/x;->c(Lhg/c;)V

    iget-object p1, p0, Ltg/l0;->b:Lgg/v;

    invoke-virtual {v0, p1}, Ltg/l0$b;->j(Lgg/v;)V

    iget-object p1, p0, Ltg/a;->a:Lgg/v;

    invoke-interface {p1, v0}, Lgg/v;->d(Lgg/x;)V

    :goto_0
    return-void
.end method
