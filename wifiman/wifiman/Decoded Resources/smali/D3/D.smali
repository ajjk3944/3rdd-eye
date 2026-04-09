.class public final synthetic LD3/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:LD3/F;


# direct methods
.method public synthetic constructor <init>(LD3/F;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD3/D;->a:LD3/F;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LD3/D;->a:LD3/F;

    invoke-virtual {v0}, LD3/F;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
