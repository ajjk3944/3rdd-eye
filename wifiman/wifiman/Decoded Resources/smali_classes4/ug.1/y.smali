.class public final Lug/y;
.super Lgg/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lug/y$a;
    }
.end annotation


# instance fields
.field final b:Lgg/D;


# direct methods
.method public constructor <init>(Lgg/D;)V
    .locals 0

    invoke-direct {p0}, Lgg/i;-><init>()V

    iput-object p1, p0, Lug/y;->b:Lgg/D;

    return-void
.end method


# virtual methods
.method public E1(LDj/b;)V
    .locals 2

    iget-object v0, p0, Lug/y;->b:Lgg/D;

    new-instance v1, Lug/y$a;

    invoke-direct {v1, p1}, Lug/y$a;-><init>(LDj/b;)V

    invoke-interface {v0, v1}, Lgg/D;->a(Lgg/B;)V

    return-void
.end method
