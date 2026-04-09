.class public final synthetic LZi/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LZi/I;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LZi/I;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZi/H;->a:LZi/I;

    iput-object p2, p0, LZi/H;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LZi/H;->a:LZi/I;

    iget-object v1, p0, LZi/H;->b:Ljava/lang/String;

    invoke-static {v0, v1}, LZi/I;->g(LZi/I;Ljava/lang/String;)LXi/f;

    move-result-object v0

    return-object v0
.end method
