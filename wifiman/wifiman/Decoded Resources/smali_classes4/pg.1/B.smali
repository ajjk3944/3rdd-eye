.class public final Lpg/B;
.super Lgg/i;
.source "SourceFile"


# instance fields
.field final b:Lgg/f;


# direct methods
.method public constructor <init>(Lgg/f;)V
    .locals 0

    invoke-direct {p0}, Lgg/i;-><init>()V

    iput-object p1, p0, Lpg/B;->b:Lgg/f;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 2

    iget-object v0, p0, Lpg/B;->b:Lgg/f;

    new-instance v1, Lqg/C;

    invoke-direct {v1, p1}, Lqg/C;-><init>(LDj/b;)V

    invoke-interface {v0, v1}, Lgg/f;->e(Lgg/d;)V

    return-void
.end method
