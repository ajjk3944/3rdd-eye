.class public final Lrg/l;
.super Lgg/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrg/l$a;
    }
.end annotation


# instance fields
.field final a:Lgg/f;


# direct methods
.method public constructor <init>(Lgg/f;)V
    .locals 0

    invoke-direct {p0}, Lgg/n;-><init>()V

    iput-object p1, p0, Lrg/l;->a:Lgg/f;

    return-void
.end method


# virtual methods
.method protected v(Lgg/p;)V
    .locals 2

    iget-object v0, p0, Lrg/l;->a:Lgg/f;

    new-instance v1, Lrg/l$a;

    invoke-direct {v1, p1}, Lrg/l$a;-><init>(Lgg/p;)V

    invoke-interface {v0, v1}, Lgg/f;->e(Lgg/d;)V

    return-void
.end method
