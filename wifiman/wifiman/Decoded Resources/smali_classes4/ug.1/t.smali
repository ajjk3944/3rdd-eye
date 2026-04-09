.class public final Lug/t;
.super Lgg/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lug/t$a;
    }
.end annotation


# instance fields
.field final a:Lgg/D;

.field final b:Lkg/n;

.field final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lgg/D;Lkg/n;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lgg/z;-><init>()V

    iput-object p1, p0, Lug/t;->a:Lgg/D;

    iput-object p2, p0, Lug/t;->b:Lkg/n;

    iput-object p3, p0, Lug/t;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method protected N(Lgg/B;)V
    .locals 2

    iget-object v0, p0, Lug/t;->a:Lgg/D;

    new-instance v1, Lug/t$a;

    invoke-direct {v1, p0, p1}, Lug/t$a;-><init>(Lug/t;Lgg/B;)V

    invoke-interface {v0, v1}, Lgg/D;->a(Lgg/B;)V

    return-void
.end method
