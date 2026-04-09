.class public final synthetic LO7/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lcom/ubnt/usurvey/WifimanApplication;


# direct methods
.method public synthetic constructor <init>(Lcom/ubnt/usurvey/WifimanApplication;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO7/g;->a:Lcom/ubnt/usurvey/WifimanApplication;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LO7/g;->a:Lcom/ubnt/usurvey/WifimanApplication;

    check-cast p1, Lorg/kodein/di/DI$f;

    invoke-static {v0, p1}, Lcom/ubnt/usurvey/WifimanApplication;->b(Lcom/ubnt/usurvey/WifimanApplication;Lorg/kodein/di/DI$f;)LYg/J;

    move-result-object p1

    return-object p1
.end method
