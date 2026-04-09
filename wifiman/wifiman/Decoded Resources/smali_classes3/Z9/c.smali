.class public final synthetic LZ9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lmh/l;

.field public final synthetic b:LZ9/a;


# direct methods
.method public synthetic constructor <init>(Lmh/l;LZ9/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ9/c;->a:Lmh/l;

    iput-object p2, p0, LZ9/c;->b:LZ9/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LZ9/c;->a:Lmh/l;

    iget-object v1, p0, LZ9/c;->b:LZ9/a;

    invoke-static {v0, v1}, LZ9/e;->a(Lmh/l;LZ9/a;)LYg/J;

    move-result-object v0

    return-object v0
.end method
