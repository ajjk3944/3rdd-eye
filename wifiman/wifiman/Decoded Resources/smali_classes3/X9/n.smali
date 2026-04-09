.class public final synthetic LX9/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LIi/N;

.field public final synthetic b:LX9/p;


# direct methods
.method public synthetic constructor <init>(LIi/N;LX9/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX9/n;->a:LIi/N;

    iput-object p2, p0, LX9/n;->b:LX9/p;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LX9/n;->a:LIi/N;

    iget-object v1, p0, LX9/n;->b:LX9/p;

    invoke-static {v0, v1}, LX9/o$a;->a(LIi/N;LX9/p;)LYg/J;

    move-result-object v0

    return-object v0
.end method
