.class public final synthetic Lq9/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LIi/N;

.field public final synthetic b:Lq9/i;

.field public final synthetic c:Lq9/g;


# direct methods
.method public synthetic constructor <init>(LIi/N;Lq9/i;Lq9/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq9/r;->a:LIi/N;

    iput-object p2, p0, Lq9/r;->b:Lq9/i;

    iput-object p3, p0, Lq9/r;->c:Lq9/g;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lq9/r;->a:LIi/N;

    iget-object v1, p0, Lq9/r;->b:Lq9/i;

    iget-object v2, p0, Lq9/r;->c:Lq9/g;

    invoke-static {v0, v1, v2}, Lq9/o$d;->a(LIi/N;Lq9/i;Lq9/g;)LYg/J;

    move-result-object v0

    return-object v0
.end method
