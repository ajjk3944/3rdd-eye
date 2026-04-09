.class public final Lpg/n;
.super Lgg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpg/n$a;
    }
.end annotation


# instance fields
.field final a:LDj/a;


# direct methods
.method public constructor <init>(LDj/a;)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lpg/n;->a:LDj/a;

    return-void
.end method


# virtual methods
.method protected V(Lgg/d;)V
    .locals 2

    iget-object v0, p0, Lpg/n;->a:LDj/a;

    new-instance v1, Lpg/n$a;

    invoke-direct {v1, p1}, Lpg/n$a;-><init>(Lgg/d;)V

    invoke-interface {v0, v1}, LDj/a;->b(LDj/b;)V

    return-void
.end method
