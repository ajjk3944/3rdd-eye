.class public final Ltg/k;
.super Lgg/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/k$a;
    }
.end annotation


# instance fields
.field final a:Lgg/v;

.field final b:Lgg/v;


# direct methods
.method public constructor <init>(Lgg/v;Lgg/v;)V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    iput-object p1, p0, Ltg/k;->a:Lgg/v;

    iput-object p2, p0, Ltg/k;->b:Lgg/v;

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 2

    new-instance v0, Llg/e;

    invoke-direct {v0}, Llg/e;-><init>()V

    invoke-interface {p1, v0}, Lgg/x;->c(Lhg/c;)V

    new-instance v1, Ltg/k$a;

    invoke-direct {v1, p0, v0, p1}, Ltg/k$a;-><init>(Ltg/k;Llg/e;Lgg/x;)V

    iget-object p1, p0, Ltg/k;->b:Lgg/v;

    invoke-interface {p1, v1}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method
