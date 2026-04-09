.class public final synthetic LT9/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lmh/a;


# direct methods
.method public synthetic constructor <init>(Lmh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT9/g;->a:Lmh/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LT9/g;->a:Lmh/a;

    invoke-static {v0}, LT9/j;->b(Lmh/a;)LYg/J;

    move-result-object v0

    return-object v0
.end method
