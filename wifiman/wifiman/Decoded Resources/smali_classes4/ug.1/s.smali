.class public final Lug/s;
.super Lgg/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lug/s$a;
    }
.end annotation


# instance fields
.field final a:Lgg/D;

.field final b:Lgg/y;


# direct methods
.method public constructor <init>(Lgg/D;Lgg/y;)V
    .locals 0

    invoke-direct {p0}, Lgg/z;-><init>()V

    iput-object p1, p0, Lug/s;->a:Lgg/D;

    iput-object p2, p0, Lug/s;->b:Lgg/y;

    return-void
.end method


# virtual methods
.method protected N(Lgg/B;)V
    .locals 3

    iget-object v0, p0, Lug/s;->a:Lgg/D;

    new-instance v1, Lug/s$a;

    iget-object v2, p0, Lug/s;->b:Lgg/y;

    invoke-direct {v1, p1, v2}, Lug/s$a;-><init>(Lgg/B;Lgg/y;)V

    invoke-interface {v0, v1}, Lgg/D;->a(Lgg/B;)V

    return-void
.end method
