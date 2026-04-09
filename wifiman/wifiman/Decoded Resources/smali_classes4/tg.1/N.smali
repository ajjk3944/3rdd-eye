.class public final Ltg/N;
.super Ltg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/N$a;
    }
.end annotation


# instance fields
.field final b:Lgg/f;


# direct methods
.method public constructor <init>(Lgg/s;Lgg/f;)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    iput-object p2, p0, Ltg/N;->b:Lgg/f;

    return-void
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 1

    new-instance v0, Ltg/N$a;

    invoke-direct {v0, p1}, Ltg/N$a;-><init>(Lgg/x;)V

    invoke-interface {p1, v0}, Lgg/x;->c(Lhg/c;)V

    iget-object p1, p0, Ltg/a;->a:Lgg/v;

    invoke-interface {p1, v0}, Lgg/v;->d(Lgg/x;)V

    iget-object p1, p0, Ltg/N;->b:Lgg/f;

    iget-object v0, v0, Ltg/N$a;->c:Ltg/N$a$a;

    invoke-interface {p1, v0}, Lgg/f;->e(Lgg/d;)V

    return-void
.end method
