.class public final synthetic LZi/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LZi/v0;


# direct methods
.method public synthetic constructor <init>(LZi/v0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZi/u0;->a:LZi/v0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LZi/u0;->a:LZi/v0;

    check-cast p1, LXi/a;

    invoke-static {v0, p1}, LZi/v0;->g(LZi/v0;LXi/a;)LYg/J;

    move-result-object p1

    return-object p1
.end method
