.class public final synthetic LZi/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LZi/b1;


# direct methods
.method public synthetic constructor <init>(LZi/b1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZi/a1;->a:LZi/b1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LZi/a1;->a:LZi/b1;

    check-cast p1, LXi/a;

    invoke-static {v0, p1}, LZi/b1;->g(LZi/b1;LXi/a;)LYg/J;

    move-result-object p1

    return-object p1
.end method
