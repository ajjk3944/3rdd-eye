.class public final Lpg/C;
.super Lgg/s;
.source "SourceFile"


# instance fields
.field final a:Lgg/f;


# direct methods
.method public constructor <init>(Lgg/f;)V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    iput-object p1, p0, Lpg/C;->a:Lgg/f;

    return-void
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 2

    iget-object v0, p0, Lpg/C;->a:Lgg/f;

    new-instance v1, Ltg/C;

    invoke-direct {v1, p1}, Ltg/C;-><init>(Lgg/x;)V

    invoke-interface {v0, v1}, Lgg/f;->e(Lgg/d;)V

    return-void
.end method
