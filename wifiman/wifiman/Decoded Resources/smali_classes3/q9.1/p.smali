.class public final synthetic Lq9/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LIi/N;

.field public final synthetic b:Lmh/a;


# direct methods
.method public synthetic constructor <init>(LIi/N;Lmh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq9/p;->a:LIi/N;

    iput-object p2, p0, Lq9/p;->b:Lmh/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lq9/p;->a:LIi/N;

    iget-object v1, p0, Lq9/p;->b:Lmh/a;

    invoke-static {v0, v1}, Lq9/o$b$a;->a(LIi/N;Lmh/a;)LYg/J;

    move-result-object v0

    return-object v0
.end method
