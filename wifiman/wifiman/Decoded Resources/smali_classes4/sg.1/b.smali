.class public final Lsg/b;
.super Lgg/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsg/b$a;
    }
.end annotation


# instance fields
.field final b:Lgg/f;

.field final c:LDj/a;


# direct methods
.method public constructor <init>(Lgg/f;LDj/a;)V
    .locals 0

    invoke-direct {p0}, Lgg/i;-><init>()V

    iput-object p1, p0, Lsg/b;->b:Lgg/f;

    iput-object p2, p0, Lsg/b;->c:LDj/a;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 3

    iget-object v0, p0, Lsg/b;->b:Lgg/f;

    new-instance v1, Lsg/b$a;

    iget-object v2, p0, Lsg/b;->c:LDj/a;

    invoke-direct {v1, p1, v2}, Lsg/b$a;-><init>(LDj/b;LDj/a;)V

    invoke-interface {v0, v1}, Lgg/f;->e(Lgg/d;)V

    return-void
.end method
