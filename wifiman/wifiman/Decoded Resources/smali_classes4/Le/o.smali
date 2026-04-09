.class public final synthetic LLe/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:LLe/d;

.field public final synthetic b:LMe/f;


# direct methods
.method public synthetic constructor <init>(LLe/d;LMe/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLe/o;->a:LLe/d;

    iput-object p2, p0, LLe/o;->b:LMe/f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LLe/o;->a:LLe/d;

    iget-object v1, p0, LLe/o;->b:LMe/f;

    invoke-static {v0, v1}, LLe/m$c;->a(LLe/d;LMe/f;)LYg/J;

    move-result-object v0

    return-object v0
.end method
