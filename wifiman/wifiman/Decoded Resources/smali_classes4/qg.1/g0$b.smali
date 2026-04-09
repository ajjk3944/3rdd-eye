.class final Lqg/g0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lqg/g0$j;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lqg/g0$j;-><init>(I)V

    return-object v0
.end method
