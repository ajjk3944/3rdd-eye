.class public final synthetic LD3/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:LA5/k;


# direct methods
.method public synthetic constructor <init>(LA5/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD3/E;->a:LA5/k;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LD3/E;->a:LA5/k;

    invoke-virtual {v0}, LA5/k;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
