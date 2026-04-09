.class public final Ltg/i0;
.super Ltg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/i0$a;
    }
.end annotation


# instance fields
.field final b:Lgg/v;


# direct methods
.method public constructor <init>(Lgg/v;Lgg/v;)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    iput-object p2, p0, Ltg/i0;->b:Lgg/v;

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 2

    new-instance v0, Ltg/i0$a;

    invoke-direct {v0, p1}, Ltg/i0$a;-><init>(Lgg/x;)V

    invoke-interface {p1, v0}, Lgg/x;->c(Lhg/c;)V

    iget-object p1, p0, Ltg/i0;->b:Lgg/v;

    iget-object v1, v0, Ltg/i0$a;->c:Ltg/i0$a$a;

    invoke-interface {p1, v1}, Lgg/v;->d(Lgg/x;)V

    iget-object p1, p0, Ltg/a;->a:Lgg/v;

    invoke-interface {p1, v0}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method
