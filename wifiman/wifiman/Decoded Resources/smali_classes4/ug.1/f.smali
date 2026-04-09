.class public final Lug/f;
.super Lgg/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lug/f$a;
    }
.end annotation


# instance fields
.field final a:Lgg/D;

.field final b:Lkg/a;


# direct methods
.method public constructor <init>(Lgg/D;Lkg/a;)V
    .locals 0

    invoke-direct {p0}, Lgg/z;-><init>()V

    iput-object p1, p0, Lug/f;->a:Lgg/D;

    iput-object p2, p0, Lug/f;->b:Lkg/a;

    return-void
.end method


# virtual methods
.method protected N(Lgg/B;)V
    .locals 3

    iget-object v0, p0, Lug/f;->a:Lgg/D;

    new-instance v1, Lug/f$a;

    iget-object v2, p0, Lug/f;->b:Lkg/a;

    invoke-direct {v1, p1, v2}, Lug/f$a;-><init>(Lgg/B;Lkg/a;)V

    invoke-interface {v0, v1}, Lgg/D;->a(Lgg/B;)V

    return-void
.end method
