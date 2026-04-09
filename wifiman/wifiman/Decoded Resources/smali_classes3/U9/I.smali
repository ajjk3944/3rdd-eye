.class public final synthetic LU9/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LIi/N;

.field public final synthetic b:LN/n0;


# direct methods
.method public synthetic constructor <init>(LIi/N;LN/n0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU9/I;->a:LIi/N;

    iput-object p2, p0, LU9/I;->b:LN/n0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LU9/I;->a:LIi/N;

    iget-object v1, p0, LU9/I;->b:LN/n0;

    invoke-static {v0, v1}, LU9/y$l$b$a;->c(LIi/N;LN/n0;)LYg/J;

    move-result-object v0

    return-object v0
.end method
