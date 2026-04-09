.class public final Ltg/p0;
.super Ltg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/p0$a;,
        Ltg/p0$b;
    }
.end annotation


# instance fields
.field final b:Lgg/v;

.field final c:I


# direct methods
.method public constructor <init>(Lgg/v;Lgg/v;I)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    iput-object p2, p0, Ltg/p0;->b:Lgg/v;

    iput p3, p0, Ltg/p0;->c:I

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 2

    new-instance v0, Ltg/p0$b;

    iget v1, p0, Ltg/p0;->c:I

    invoke-direct {v0, p1, v1}, Ltg/p0$b;-><init>(Lgg/x;I)V

    invoke-interface {p1, v0}, Lgg/x;->c(Lhg/c;)V

    iget-object p1, p0, Ltg/p0;->b:Lgg/v;

    iget-object v1, v0, Ltg/p0$b;->c:Ltg/p0$a;

    invoke-interface {p1, v1}, Lgg/v;->d(Lgg/x;)V

    iget-object p1, p0, Ltg/a;->a:Lgg/v;

    invoke-interface {p1, v0}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method
