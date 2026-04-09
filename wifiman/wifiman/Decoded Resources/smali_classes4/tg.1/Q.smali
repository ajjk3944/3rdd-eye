.class public final Ltg/Q;
.super Ltg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/Q$a;
    }
.end annotation


# instance fields
.field final b:Lkg/n;


# direct methods
.method public constructor <init>(Lgg/v;Lkg/n;)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    iput-object p2, p0, Ltg/Q;->b:Lkg/n;

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 2

    new-instance v0, Ltg/Q$a;

    iget-object v1, p0, Ltg/Q;->b:Lkg/n;

    invoke-direct {v0, p1, v1}, Ltg/Q$a;-><init>(Lgg/x;Lkg/n;)V

    iget-object v1, v0, Ltg/Q$a;->c:Llg/e;

    invoke-interface {p1, v1}, Lgg/x;->c(Lhg/c;)V

    iget-object p1, p0, Ltg/a;->a:Lgg/v;

    invoke-interface {p1, v0}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method
