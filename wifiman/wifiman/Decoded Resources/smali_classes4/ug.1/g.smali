.class public final Lug/g;
.super Lgg/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lug/g$a;
    }
.end annotation


# instance fields
.field final a:Lgg/D;

.field final b:Lkg/f;


# direct methods
.method public constructor <init>(Lgg/D;Lkg/f;)V
    .locals 0

    invoke-direct {p0}, Lgg/z;-><init>()V

    iput-object p1, p0, Lug/g;->a:Lgg/D;

    iput-object p2, p0, Lug/g;->b:Lkg/f;

    return-void
.end method


# virtual methods
.method protected N(Lgg/B;)V
    .locals 2

    iget-object v0, p0, Lug/g;->a:Lgg/D;

    new-instance v1, Lug/g$a;

    invoke-direct {v1, p0, p1}, Lug/g$a;-><init>(Lug/g;Lgg/B;)V

    invoke-interface {v0, v1}, Lgg/D;->a(Lgg/B;)V

    return-void
.end method
