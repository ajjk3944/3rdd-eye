.class public final Lrg/w;
.super Lgg/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrg/w$a;
    }
.end annotation


# instance fields
.field final b:Lgg/r;


# direct methods
.method public constructor <init>(Lgg/r;)V
    .locals 0

    invoke-direct {p0}, Lgg/i;-><init>()V

    iput-object p1, p0, Lrg/w;->b:Lgg/r;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 2

    iget-object v0, p0, Lrg/w;->b:Lgg/r;

    new-instance v1, Lrg/w$a;

    invoke-direct {v1, p1}, Lrg/w$a;-><init>(LDj/b;)V

    invoke-interface {v0, v1}, Lgg/r;->a(Lgg/p;)V

    return-void
.end method
