.class public final synthetic LM8/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/BiConsumer;


# instance fields
.field public final synthetic a:Lmh/p;


# direct methods
.method public synthetic constructor <init>(Lmh/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM8/G;->a:Lmh/p;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LM8/G;->a:Lmh/p;

    invoke-static {v0, p1, p2}, LM8/A$g;->d(Lmh/p;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
