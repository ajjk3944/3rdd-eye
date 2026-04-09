.class public final Ltg/E;
.super Lgg/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/E$a;
    }
.end annotation


# instance fields
.field final a:LDj/a;


# direct methods
.method public constructor <init>(LDj/a;)V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    iput-object p1, p0, Ltg/E;->a:LDj/a;

    return-void
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 2

    iget-object v0, p0, Ltg/E;->a:LDj/a;

    new-instance v1, Ltg/E$a;

    invoke-direct {v1, p1}, Ltg/E$a;-><init>(Lgg/x;)V

    invoke-interface {v0, v1}, LDj/a;->b(LDj/b;)V

    return-void
.end method
