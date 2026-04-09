.class final Ltg/X$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltg/X$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/X;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "j"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Ltg/X$e;
    .locals 2

    new-instance v0, Ltg/X$k;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Ltg/X$k;-><init>(I)V

    return-object v0
.end method
