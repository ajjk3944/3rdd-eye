.class public final Ltg/f0;
.super Ltg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/f0$b;,
        Ltg/f0$a;
    }
.end annotation


# instance fields
.field final b:Lgg/y;


# direct methods
.method public constructor <init>(Lgg/v;Lgg/y;)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    iput-object p2, p0, Ltg/f0;->b:Lgg/y;

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 2

    new-instance v0, Ltg/f0$a;

    invoke-direct {v0, p1}, Ltg/f0$a;-><init>(Lgg/x;)V

    invoke-interface {p1, v0}, Lgg/x;->c(Lhg/c;)V

    iget-object p1, p0, Ltg/f0;->b:Lgg/y;

    new-instance v1, Ltg/f0$b;

    invoke-direct {v1, p0, v0}, Ltg/f0$b;-><init>(Ltg/f0;Ltg/f0$a;)V

    invoke-virtual {p1, v1}, Lgg/y;->e(Ljava/lang/Runnable;)Lhg/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Ltg/f0$a;->d(Lhg/c;)V

    return-void
.end method
