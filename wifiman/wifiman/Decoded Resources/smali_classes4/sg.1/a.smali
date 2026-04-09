.class public final Lsg/a;
.super Lgg/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsg/a$a;
    }
.end annotation


# instance fields
.field final a:Lgg/f;

.field final b:Lgg/v;


# direct methods
.method public constructor <init>(Lgg/f;Lgg/v;)V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    iput-object p1, p0, Lsg/a;->a:Lgg/f;

    iput-object p2, p0, Lsg/a;->b:Lgg/v;

    return-void
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 2

    new-instance v0, Lsg/a$a;

    iget-object v1, p0, Lsg/a;->b:Lgg/v;

    invoke-direct {v0, p1, v1}, Lsg/a$a;-><init>(Lgg/x;Lgg/v;)V

    invoke-interface {p1, v0}, Lgg/x;->c(Lhg/c;)V

    iget-object p1, p0, Lsg/a;->a:Lgg/f;

    invoke-interface {p1, v0}, Lgg/f;->e(Lgg/d;)V

    return-void
.end method
