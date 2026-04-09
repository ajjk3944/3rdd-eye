.class public final synthetic Laa/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LIi/N;

.field public final synthetic b:Laa/d;


# direct methods
.method public synthetic constructor <init>(LIi/N;Laa/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laa/b;->a:LIi/N;

    iput-object p2, p0, Laa/b;->b:Laa/d;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Laa/b;->a:LIi/N;

    iget-object v1, p0, Laa/b;->b:Laa/d;

    invoke-static {v0, v1}, Laa/c$a;->a(LIi/N;Laa/d;)LYg/J;

    move-result-object v0

    return-object v0
.end method
