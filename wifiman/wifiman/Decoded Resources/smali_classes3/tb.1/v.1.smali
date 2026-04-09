.class public final synthetic Ltb/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ltb/N;


# direct methods
.method public synthetic constructor <init>(Ltb/N;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/v;->a:Ltb/N;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ltb/v;->a:Ltb/N;

    invoke-static {v0}, Ltb/N;->a(Ltb/N;)Ltb/f;

    move-result-object v0

    return-object v0
.end method
