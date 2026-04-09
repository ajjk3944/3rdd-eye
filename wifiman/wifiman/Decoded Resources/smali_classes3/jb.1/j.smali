.class public final synthetic Ljb/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ljb/m;


# direct methods
.method public synthetic constructor <init>(Ljb/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljb/j;->a:Ljb/m;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ljb/j;->a:Ljb/m;

    invoke-static {v0}, Ljb/m;->b(Ljb/m;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
