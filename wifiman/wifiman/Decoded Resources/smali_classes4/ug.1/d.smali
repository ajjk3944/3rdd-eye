.class public final Lug/d;
.super Lgg/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lug/d$a;
    }
.end annotation


# instance fields
.field final a:Lgg/D;

.field final b:Lgg/f;


# direct methods
.method public constructor <init>(Lgg/D;Lgg/f;)V
    .locals 0

    invoke-direct {p0}, Lgg/z;-><init>()V

    iput-object p1, p0, Lug/d;->a:Lgg/D;

    iput-object p2, p0, Lug/d;->b:Lgg/f;

    return-void
.end method


# virtual methods
.method protected N(Lgg/B;)V
    .locals 3

    iget-object v0, p0, Lug/d;->b:Lgg/f;

    new-instance v1, Lug/d$a;

    iget-object v2, p0, Lug/d;->a:Lgg/D;

    invoke-direct {v1, p1, v2}, Lug/d$a;-><init>(Lgg/B;Lgg/D;)V

    invoke-interface {v0, v1}, Lgg/f;->e(Lgg/d;)V

    return-void
.end method
