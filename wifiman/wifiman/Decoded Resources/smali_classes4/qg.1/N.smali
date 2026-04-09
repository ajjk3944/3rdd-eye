.class public final Lqg/N;
.super Lgg/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/N$a;
    }
.end annotation


# instance fields
.field final a:LDj/a;


# direct methods
.method public constructor <init>(LDj/a;)V
    .locals 0

    invoke-direct {p0}, Lgg/n;-><init>()V

    iput-object p1, p0, Lqg/N;->a:LDj/a;

    return-void
.end method


# virtual methods
.method protected v(Lgg/p;)V
    .locals 2

    iget-object v0, p0, Lqg/N;->a:LDj/a;

    new-instance v1, Lqg/N$a;

    invoke-direct {v1, p1}, Lqg/N$a;-><init>(Lgg/p;)V

    invoke-interface {v0, v1}, LDj/a;->b(LDj/b;)V

    return-void
.end method
