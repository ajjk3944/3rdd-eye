.class public final Lrg/d;
.super Lgg/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrg/d$a;,
        Lrg/d$b;
    }
.end annotation


# instance fields
.field final a:Lgg/r;

.field final b:Lgg/f;


# direct methods
.method public constructor <init>(Lgg/r;Lgg/f;)V
    .locals 0

    invoke-direct {p0}, Lgg/n;-><init>()V

    iput-object p1, p0, Lrg/d;->a:Lgg/r;

    iput-object p2, p0, Lrg/d;->b:Lgg/f;

    return-void
.end method


# virtual methods
.method protected v(Lgg/p;)V
    .locals 3

    iget-object v0, p0, Lrg/d;->b:Lgg/f;

    new-instance v1, Lrg/d$b;

    iget-object v2, p0, Lrg/d;->a:Lgg/r;

    invoke-direct {v1, p1, v2}, Lrg/d$b;-><init>(Lgg/p;Lgg/r;)V

    invoke-interface {v0, v1}, Lgg/f;->e(Lgg/d;)V

    return-void
.end method
