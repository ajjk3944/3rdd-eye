.class public final Lug/n;
.super Lgg/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lug/n$a;
    }
.end annotation


# instance fields
.field final b:Lgg/D;

.field final c:Lkg/n;


# direct methods
.method public constructor <init>(Lgg/D;Lkg/n;)V
    .locals 0

    invoke-direct {p0}, Lgg/i;-><init>()V

    iput-object p1, p0, Lug/n;->b:Lgg/D;

    iput-object p2, p0, Lug/n;->c:Lkg/n;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 3

    iget-object v0, p0, Lug/n;->b:Lgg/D;

    new-instance v1, Lug/n$a;

    iget-object v2, p0, Lug/n;->c:Lkg/n;

    invoke-direct {v1, p1, v2}, Lug/n$a;-><init>(LDj/b;Lkg/n;)V

    invoke-interface {v0, v1}, Lgg/D;->a(Lgg/B;)V

    return-void
.end method
