.class public final Lpg/p;
.super Lgg/b;
.source "SourceFile"


# instance fields
.field final a:Lgg/f;


# direct methods
.method public constructor <init>(Lgg/f;)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lpg/p;->a:Lgg/f;

    return-void
.end method


# virtual methods
.method protected V(Lgg/d;)V
    .locals 1

    iget-object v0, p0, Lpg/p;->a:Lgg/f;

    invoke-interface {v0, p1}, Lgg/f;->e(Lgg/d;)V

    return-void
.end method
