.class public final LX9/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX9/c;->V0()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LX9/c;


# direct methods
.method public constructor <init>(LX9/c;)V
    .locals 0

    iput-object p1, p0, LX9/c$c;->a:LX9/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, LX9/c$c;->a:LX9/c;

    invoke-static {v0}, LX9/c;->L0(LX9/c;)V

    return-void
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LX9/c$c;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
