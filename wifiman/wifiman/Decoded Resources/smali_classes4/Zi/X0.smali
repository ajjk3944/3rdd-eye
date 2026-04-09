.class public final synthetic LZi/X0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LZi/Z0;

.field public final synthetic b:LVi/a;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LZi/Z0;LVi/a;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZi/X0;->a:LZi/Z0;

    iput-object p2, p0, LZi/X0;->b:LVi/a;

    iput-object p3, p0, LZi/X0;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LZi/X0;->a:LZi/Z0;

    iget-object v1, p0, LZi/X0;->b:LVi/a;

    iget-object v2, p0, LZi/X0;->c:Ljava/lang/Object;

    invoke-static {v0, v1, v2}, LZi/Z0;->K(LZi/Z0;LVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
