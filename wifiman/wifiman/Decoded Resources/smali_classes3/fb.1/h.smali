.class public final synthetic Lfb/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lfb/k;


# direct methods
.method public synthetic constructor <init>(Lfb/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb/h;->a:Lfb/k;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfb/h;->a:Lfb/k;

    invoke-static {v0}, Lfb/k;->s(Lfb/k;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
