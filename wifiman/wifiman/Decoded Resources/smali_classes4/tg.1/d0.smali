.class public final Ltg/d0;
.super Lgg/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/d0$a;
    }
.end annotation


# instance fields
.field final a:Lgg/v;

.field final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lgg/v;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lgg/z;-><init>()V

    iput-object p1, p0, Ltg/d0;->a:Lgg/v;

    iput-object p2, p0, Ltg/d0;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public N(Lgg/B;)V
    .locals 3

    iget-object v0, p0, Ltg/d0;->a:Lgg/v;

    new-instance v1, Ltg/d0$a;

    iget-object v2, p0, Ltg/d0;->b:Ljava/lang/Object;

    invoke-direct {v1, p1, v2}, Ltg/d0$a;-><init>(Lgg/B;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method
