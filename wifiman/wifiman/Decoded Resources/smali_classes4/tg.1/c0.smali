.class public final Ltg/c0;
.super Lgg/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/c0$a;
    }
.end annotation


# instance fields
.field final a:Lgg/v;


# direct methods
.method public constructor <init>(Lgg/v;)V
    .locals 0

    invoke-direct {p0}, Lgg/n;-><init>()V

    iput-object p1, p0, Ltg/c0;->a:Lgg/v;

    return-void
.end method


# virtual methods
.method public v(Lgg/p;)V
    .locals 2

    iget-object v0, p0, Ltg/c0;->a:Lgg/v;

    new-instance v1, Ltg/c0$a;

    invoke-direct {v1, p1}, Ltg/c0$a;-><init>(Lgg/p;)V

    invoke-interface {v0, v1}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method
