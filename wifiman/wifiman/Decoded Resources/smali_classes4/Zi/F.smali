.class public final synthetic LZi/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:LZi/G;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;LZi/G;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LZi/F;->a:I

    iput-object p2, p0, LZi/F;->b:Ljava/lang/String;

    iput-object p3, p0, LZi/F;->c:LZi/G;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, LZi/F;->a:I

    iget-object v1, p0, LZi/F;->b:Ljava/lang/String;

    iget-object v2, p0, LZi/F;->c:LZi/G;

    invoke-static {v0, v1, v2}, LZi/G;->y(ILjava/lang/String;LZi/G;)[LXi/f;

    move-result-object v0

    return-object v0
.end method
